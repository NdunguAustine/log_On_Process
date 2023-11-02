import com.mybean.*;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends AuthManagerUI {
    @Override
    public JFrame initializeUI(AccessUI accessUI) {
        return super.initializeUI(accessUI);
    }

    public static void main(String[] args) {
        AccessUI accessUI=new AccessUI() {
            @Override
            public void login(JPanel jPanel, JPanel jPanel1) {
                jPanel.add(jPanel1);
            }

            @Override
            public void register(JPanel jPanel, JPanel jPanel1) {
                jPanel.add(jPanel1);
            }

            @Override
            public void onVerifyLogin(String s, String s1) {
                new Auth().signInWithEmailPassword(s,s1).addOnSuccessListener(new OnSuccess() {
                    @Override
                    public void onSuccess(boolean b) {

                    }
                }).addOnFailureListener(new OnFailure() {
                    @Override
                    public void onFailure(String s) {

                    }
                });
            }

            @Override
            public void onVerifyRegister(UserModel userModel) {
                new Auth().createUserWithEmailPassword(userModel).addOnSuccessListener(new OnSuccess() {
                    @Override
                    public void onSuccess(boolean b) {

                    }
                }).addOnFailureListener(new OnFailure() {
                    @Override
                    public void onFailure(String s) {

                    }
                });
            }
        };
        new Main().initializeUI(accessUI);
    }
}