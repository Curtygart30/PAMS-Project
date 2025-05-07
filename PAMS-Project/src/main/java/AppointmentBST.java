
public class AppointmentBST {
    private AppointmentNode root;

    public AppointmentBST() {
        root = null;
    }

    public void addAppointment(PatientAppointment appointment) {
        root = insertRec(root, appointment);
    }

    private AppointmentNode insertRec(AppointmentNode root, PatientAppointment appointment) {
        // TODO: Implement logic to insert by appointment time (avoid duplicates)
        if(root == null){
            root = new AppointmentNode(appointment);
        }
        else{
            AppointmentNode current = root;
            AppointmentNode previous = null;
            boolean left = false, right = false;
            while(current != null){
                previous = current;
                if(appointment.appointmentTime.equals(current.data.appointmentTime)){
                    throw new IllegalArgumentException("Same Appointment Time");
                }
                else if(Double.parseDouble(appointment.appointmentTime.replace(":","")) < Double.parseDouble(current.data.appointmentTime.replace(":",""))){
                    left = true; right = false;
                    current = current.left;
                }
                else {
                    right = true; left = false;
                    current = current.right;
                }
            }
            if(left){
                previous.left = new AppointmentNode(appointment);
            }
            else {
                previous.right = new AppointmentNode(appointment);
            }
        }
        return root;
    }

    public void inOrderTraversal(AppointmentNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    public AppointmentNode getRoot() {
        return root;
    }
}
