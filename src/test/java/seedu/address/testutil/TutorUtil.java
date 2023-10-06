package seedu.address.testutil;

import static seedu.address.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;

import java.util.Set;

import seedu.address.logic.commands.AddCommand;
import seedu.address.logic.commands.EditCommand.EditTutorDescriptor;
import seedu.address.model.tag.Tag;
import seedu.address.model.tutor.Tutor;

/**
 * A utility class for Tutor.
 */
public class TutorUtil {

    /**
     * Returns an add command string for adding the {@code tutor}.
     */
    public static String getAddCommand(Tutor tutor) {
        return AddCommand.COMMAND_WORD + " " + getTutorDetails(tutor);
    }

    /**
     * Returns the part of command string for the given {@code tutor}'s details.
     */
    public static String getTutorDetails(Tutor tutor) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_NAME + tutor.getName().fullName + " ");
        sb.append(PREFIX_PHONE + tutor.getPhone().value + " ");
        sb.append(PREFIX_EMAIL + tutor.getEmail().value + " ");
        tutor.getTags().stream().forEach(
            s -> sb.append(PREFIX_TAG + s.tagName + " ")
        );
        return sb.toString();
    }

    /**
     * Returns the part of command string for the given {@code EditTutorDescriptor}'s details.
     */
    public static String getEditTutorDescriptorDetails(EditTutorDescriptor descriptor) {
        StringBuilder sb = new StringBuilder();
        descriptor.getName().ifPresent(name -> sb.append(PREFIX_NAME).append(name.fullName).append(" "));
        descriptor.getPhone().ifPresent(phone -> sb.append(PREFIX_PHONE).append(phone.value).append(" "));
        descriptor.getEmail().ifPresent(email -> sb.append(PREFIX_EMAIL).append(email.value).append(" "));
        if (descriptor.getTags().isPresent()) {
            Set<Tag> tags = descriptor.getTags().get();
            if (tags.isEmpty()) {
                sb.append(PREFIX_TAG);
            } else {
                tags.forEach(s -> sb.append(PREFIX_TAG).append(s.tagName).append(" "));
            }
        }
        return sb.toString();
    }
}
