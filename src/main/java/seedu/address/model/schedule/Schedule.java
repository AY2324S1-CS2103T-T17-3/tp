package seedu.address.model.schedule;

import static seedu.address.commons.util.AppUtil.checkArgument;
import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.time.LocalDateTime;
import java.util.Objects;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.model.person.Person;

/**
 * Represents a Schedule in the address book.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Schedule implements Comparable<Schedule> {
    public static final String MESSAGE_CONSTRAINTS = "Schedules start time should be before its end time.";
    private final Person tutor;
    private final StartTime startTime;
    private final EndTime endTime;

    /**
     * Every field must be present and not null.
     */
    public Schedule(Person tutor, StartTime startTime, EndTime endTime) {
        requireAllNonNull(tutor, startTime, endTime);
        checkArgument(isValidSchedule(startTime, endTime), MESSAGE_CONSTRAINTS);

        this.tutor = tutor;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    private boolean isValidSchedule(StartTime startTime, EndTime endTime) {
        return startTime.getTime().isBefore(endTime.getTime());
    }

    public Person getTutor() {
        return tutor;
    }

    public StartTime getStartTime() {
        return startTime;
    }

    public EndTime getEndTime() {
        return endTime;
    }

    /**
     * Checks if this schedule clashes with another schedule.
     * Two schedules are considered clashing if they have the same tutor and their time intervals overlap.
     *
     * @param other The other schedule to compare against.
     * @return {@code true} if the schedules clash, {@code false} otherwise.
     */
    public boolean isClashing(Schedule other) {
        if (!this.tutor.equals(other.tutor)) {
            return false;
        }

        boolean isEndBeforeOrEqualOtherStart = !this.endTime.getTime().isAfter(other.startTime.getTime());
        boolean isStartAfterOrEqualOtherEnd = !this.startTime.getTime().isBefore(other.endTime.getTime());

        return !(isEndBeforeOrEqualOtherStart || isStartAfterOrEqualOtherEnd);
    }

    /**
     * Returns true if both schedules have the same tutor index and time fields.
     * This defines a stronger notion of equality between two schedules.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Schedule)) {
            return false;
        }

        Schedule otherSchedule = (Schedule) other;
        return tutor.equals(otherSchedule.tutor)
                && startTime.equals(otherSchedule.startTime)
                && endTime.equals(otherSchedule.endTime);
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(tutor, startTime, endTime);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("tutor", tutor)
                .add("startTime", startTime)
                .add("endTime", endTime)
                .toString();
    }

    /**
     * Compares this schedule with the specified schedule for order based on their start times.
     * Schedules from today or later are sorted in ascending order of start time.
     * Schedules before today are sorted in descending order of start time.
     *
     * @param other the schedule to be compared.
     * @return a negative integer, zero, or a positive integer as this schedule
     *         is less than, equal to, or greater than the specified schedule.
     */
    @Override
    public int compareTo(Schedule other) {
        boolean isThisTodayOrLater = false;
        boolean isOtherTodayOrLater = false;

        StartTime now = new StartTime(LocalDateTime.now());

        if (this.getStartTime().compareDays(now) >= 0) {
            isThisTodayOrLater = true;
        }
        if (other.getStartTime().compareDays(now) >= 0) {
            isOtherTodayOrLater = true;
        }

        if (isThisTodayOrLater && isOtherTodayOrLater) {
            // Ascending order as both schedules is for today or later
            return this.getStartTime().compareTo(other.getStartTime());

        } else if (!isThisTodayOrLater && !isOtherTodayOrLater) {
            // Descending order as both schedules is for before today
            return other.getStartTime().compareTo(this.getStartTime());
        } else {
            // Only one schedule is before today, sort today or later first
            return isThisTodayOrLater ? -1 : 1;
        }
    }
}
