package seedu.address.testutil;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.schedule.Schedule;

/**
 * A utility class containing a list of {@code Schedule} objects to be used in tests.
 */
// Schedule objects are named in the format: SCHEDULE_{TUTOR}_{DAY}_{MONTH}
public class TypicalSchedules {
    public static final Schedule SCHEDULE_ALICE_FIRST_JAN = new ScheduleBuilder()
            .withTutor(TypicalPersons.ALICE)
            .withStartTime(LocalDateTime.of(2023, 1, 1, 9, 0, 0))
            .withEndTime(LocalDateTime.of(2023, 1, 1, 11, 0, 0))
            .build();

    public static final Schedule SCHEDULE_BOB_SECOND_JAN = new ScheduleBuilder()
            .withTutor(TypicalPersons.BOB)
            .withStartTime(LocalDateTime.of(2023, 1, 2, 20, 0))
            .withEndTime(LocalDateTime.of(2023, 1, 2, 22, 0))
            .build();

    private TypicalSchedules() {} // prevents instantiation

    public static List<Schedule> getTypicalSchedules() {
        return new ArrayList<>(Arrays.asList(SCHEDULE_ALICE_FIRST_JAN, SCHEDULE_BOB_SECOND_JAN));
    }
}