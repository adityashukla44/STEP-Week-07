public class AttendanceSheet {
    private final String[] presentStudents;
    private int presentCount;

    public AttendanceSheet(int maximumClassSize) {
        if (maximumClassSize < 0) {
            throw new IllegalArgumentException("Class size cannot be negative.");
        }
        presentStudents = new String[maximumClassSize];
    }

    public void markPresent(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Student name cannot be empty.");
            return;
        }
        if (isPresent(name)) {
            return;
        }
        if (presentCount == presentStudents.length) {
            System.out.println("Attendance not recorded: capacity reached.");
            return;
        }
        presentStudents[presentCount++] = name;
    }

    public int getPresentCount() {
        return presentCount;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < presentCount; i++) {
            if (presentStudents[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Ben present: " + sheet.isPresent("Ben"));
        System.out.println("Chen present: " + sheet.isPresent("Chen"));
    }
}
