
import org.junit.Test;
import static org.junit.Assert.*;

public class AppointmentBSTTest {
    @Test
    public void testAddAppointment() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient", "19:00");
        PatientAppointment p2 = new PatientAppointment(2, "Test Patient", "08:00");
        PatientAppointment p3 = new PatientAppointment(3, "Test Patient", "01:30");
        PatientAppointment p4 = new PatientAppointment(4, "Test Patient", "14:00");
        PatientAppointment p5 = new PatientAppointment(5, "Test Patient", "12:00");
        PatientAppointment p6 = new PatientAppointment(6, "Test Patient", "19:30");
        bst.addAppointment(p1);
        bst.addAppointment(p2);
        bst.addAppointment(p3);
        bst.addAppointment(p4);
        bst.addAppointment(p5);
        bst.addAppointment(p6);
        bst.inOrderTraversal(bst.getRoot());
        assertNotNull(bst.getRoot());

    }
}
