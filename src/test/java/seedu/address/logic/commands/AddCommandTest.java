package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalTutors.ALICE;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import javafx.collections.ObservableList;
import seedu.address.commons.core.GuiSettings;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.AddressBook;
import seedu.address.model.Model;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.ReadOnlyUserPrefs;
import seedu.address.model.tutor.Tutor;
import seedu.address.testutil.TutorBuilder;

public class AddCommandTest {

    @Test
    public void constructor_nullTutor_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new AddCommand(null));
    }

    @Test
    public void execute_tutorAcceptedByModel_addSuccessful() throws Exception {
        ModelStubAcceptingTutorAdded modelStub = new ModelStubAcceptingTutorAdded();
        Tutor validTutor = new TutorBuilder().build();

        CommandResult commandResult = new AddCommand(validTutor).execute(modelStub);

        assertEquals(String.format(AddCommand.MESSAGE_SUCCESS, Messages.format(validTutor)),
                commandResult.getFeedbackToUser());
        assertEquals(Arrays.asList(validTutor), modelStub.tutorsAdded);
    }

    @Test
    public void execute_duplicateTutor_throwsCommandException() {
        Tutor validTutor = new TutorBuilder().build();
        AddCommand addCommand = new AddCommand(validTutor);
        ModelStub modelStub = new ModelStubWithTutor(validTutor);

        assertThrows(CommandException.class, AddCommand.MESSAGE_DUPLICATE_TUTOR, () -> addCommand.execute(modelStub));
    }

    @Test
    public void equals() {
        Tutor alice = new TutorBuilder().withName("Alice").build();
        Tutor bob = new TutorBuilder().withName("Bob").build();
        AddCommand addAliceCommand = new AddCommand(alice);
        AddCommand addBobCommand = new AddCommand(bob);

        // same object -> returns true
        assertTrue(addAliceCommand.equals(addAliceCommand));

        // same values -> returns true
        AddCommand addAliceCommandCopy = new AddCommand(alice);
        assertTrue(addAliceCommand.equals(addAliceCommandCopy));

        // different types -> returns false
        assertFalse(addAliceCommand.equals(1));

        // null -> returns false
        assertFalse(addAliceCommand.equals(null));

        // different tutor -> returns false
        assertFalse(addAliceCommand.equals(addBobCommand));
    }

    @Test
    public void toStringMethod() {
        AddCommand addCommand = new AddCommand(ALICE);
        String expected = AddCommand.class.getCanonicalName() + "{toAdd=" + ALICE + "}";
        assertEquals(expected, addCommand.toString());
    }

    /**
     * A default model stub that have all of the methods failing.
     */
    private class ModelStub implements Model {
        @Override
        public void setUserPrefs(ReadOnlyUserPrefs userPrefs) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public ReadOnlyUserPrefs getUserPrefs() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public GuiSettings getGuiSettings() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void setGuiSettings(GuiSettings guiSettings) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public Path getAddressBookFilePath() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void setAddressBookFilePath(Path addressBookFilePath) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void addTutor(Tutor tutor) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void setAddressBook(ReadOnlyAddressBook newData) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public ReadOnlyAddressBook getAddressBook() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public boolean hasTutor(Tutor tutor) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void deleteTutor(Tutor target) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void setTutor(Tutor target, Tutor editedTutor) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public ObservableList<Tutor> getFilteredTutorList() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void updateFilteredTutorList(Predicate<Tutor> predicate) {
            throw new AssertionError("This method should not be called.");
        }
    }

    /**
     * A Model stub that contains a single tutor.
     */
    private class ModelStubWithTutor extends ModelStub {
        private final Tutor tutor;

        ModelStubWithTutor(Tutor tutor) {
            requireNonNull(tutor);
            this.tutor = tutor;
        }

        @Override
        public boolean hasTutor(Tutor tutor) {
            requireNonNull(tutor);
            return this.tutor.isSameTutor(tutor);
        }
    }

    /**
     * A Model stub that always accept the tutor being added.
     */
    private class ModelStubAcceptingTutorAdded extends ModelStub {
        final ArrayList<Tutor> tutorsAdded = new ArrayList<>();

        @Override
        public boolean hasTutor(Tutor tutor) {
            requireNonNull(tutor);
            return tutorsAdded.stream().anyMatch(tutor::isSameTutor);
        }

        @Override
        public void addTutor(Tutor tutor) {
            requireNonNull(tutor);
            tutorsAdded.add(tutor);
        }

        @Override
        public ReadOnlyAddressBook getAddressBook() {
            return new AddressBook();
        }
    }

}
