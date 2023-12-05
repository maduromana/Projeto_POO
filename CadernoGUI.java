


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class CadernoGUI extends javax.swing.JPanel {


    public CadernoGUI() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotuloCaderno = new javax.swing.JLabel();
        btnAdicionarCaderno = new javax.swing.JButton();
        campoAdicionarCaderno = new javax.swing.JTextField();

        rotuloCaderno.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        rotuloCaderno.setText("Cadernos");

        btnAdicionarCaderno.setText("Adicionar Caderno ");
        btnAdicionarCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCadernoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotuloCaderno)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addComponent(campoAdicionarCaderno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionarCaderno)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(rotuloCaderno)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarCaderno)
                    .addComponent(campoAdicionarCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCadernoActionPerformed
         String nomeCaderno = campoAdicionarCaderno.getText();
          if (nomeCaderno!= null && !nomeCaderno.isEmpty()) {
             
        }
    }//GEN-LAST:event_btnAdicionarCadernoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCaderno;
    private javax.swing.JTextField campoAdicionarCaderno;
    private javax.swing.JLabel rotuloCaderno;
    // End of variables declaration//GEN-END:variables
}
