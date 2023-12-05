

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GastoUniversitarioGUI extends javax.swing.JPanel {
    private final DefaultTableModel modeloTabela;

    public GastoUniversitarioGUI() {
        initComponents();
        modeloTabela = (DefaultTableModel) tabelaGastoMes.getModel();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotuloGastoMensal = new javax.swing.JLabel();
        rotuloaluguel = new javax.swing.JLabel();
        campoAluguel = new javax.swing.JTextField();
        rotuloLuz = new javax.swing.JLabel();
        campoLuz = new javax.swing.JTextField();
        rotuloInternet = new javax.swing.JLabel();
        campoInternet = new javax.swing.JTextField();
        rotuloCondominio = new javax.swing.JLabel();
        campoCondominio = new javax.swing.JTextField();
        rotuloMercado = new javax.swing.JLabel();
        campoMercado = new javax.swing.JTextField();
        rotuloAdicionais = new javax.swing.JLabel();
        campoAdicionais = new javax.swing.JTextField();
        rotuloMes = new javax.swing.JLabel();
        campoMes = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGastoMes = new javax.swing.JTable();

        rotuloGastoMensal.setBackground(new java.awt.Color(255, 255, 255));
        rotuloGastoMensal.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        rotuloGastoMensal.setText("Gasto Mensal");

        rotuloaluguel.setBackground(new java.awt.Color(255, 255, 255));
        rotuloaluguel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rotuloaluguel.setText("Aluguel ");
        rotuloaluguel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rotuloaluguel.setFocusCycleRoot(true);

        campoAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAluguelActionPerformed(evt);
            }
        });

        rotuloLuz.setBackground(new java.awt.Color(255, 255, 255));
        rotuloLuz.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        rotuloLuz.setText("Luz");

        rotuloInternet.setBackground(new java.awt.Color(255, 255, 255));
        rotuloInternet.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        rotuloInternet.setText("Internet");

        rotuloCondominio.setBackground(new java.awt.Color(255, 255, 255));
        rotuloCondominio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        rotuloCondominio.setText("Condominio/ Agua ");

        rotuloMercado.setBackground(new java.awt.Color(255, 255, 255));
        rotuloMercado.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        rotuloMercado.setText("Mercado");

        rotuloAdicionais.setBackground(new java.awt.Color(255, 255, 255));
        rotuloAdicionais.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        rotuloAdicionais.setText("Gastos Adicionais ");

        rotuloMes.setBackground(new java.awt.Color(255, 255, 255));
        rotuloMes.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        rotuloMes.setText("Mês");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tabelaGastoMes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mês", "Gasto total (R$)"
            }
        ));
        jScrollPane1.setViewportView(tabelaGastoMes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloGastoMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloaluguel)
                    .addComponent(rotuloInternet)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(rotuloMes)
                            .addGap(18, 18, 18)
                            .addComponent(campoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotuloMercado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoMercado, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rotuloCondominio)
                                            .addGap(26, 26, 26))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(rotuloAdicionais, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rotuloLuz, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoAdicionais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoCondominio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoInternet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoLuz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoAluguel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(25, 25, 25)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rotuloGastoMensal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloaluguel)
                    .addComponent(campoAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloLuz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloInternet)
                    .addComponent(campoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloCondominio)
                    .addComponent(campoCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloMercado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloAdicionais))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloMes)
                    .addComponent(btnSalvar)
                    .addComponent(campoMes))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAluguelActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         String mes = campoMes.getText();
        if (!mes.isEmpty()) {
            if (camposPreenchidos()) {
                double totalGasto = calcularTotalGasto();
                adicionarNaTabela(mes, totalGasto);
                JOptionPane.showMessageDialog(this, "Gastos salvos para o mês de " + mes);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos de gastos antes de salvar.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Digite o mês antes de salvar os gastos.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private boolean camposPreenchidos() {
        return !campoAluguel.getText().isEmpty() &&
                !campoLuz.getText().isEmpty() &&
                !campoInternet.getText().isEmpty() &&
                !campoCondominio.getText().isEmpty() &&
                !campoMercado.getText().isEmpty() &&
                !campoAdicionais.getText().isEmpty();
    }

    private double calcularTotalGasto() {
        try {
            double aluguel = Double.parseDouble(campoAluguel.getText());
            double luz = Double.parseDouble(campoLuz.getText());
            double internet = Double.parseDouble(campoInternet.getText());
            double condAgua = Double.parseDouble(campoCondominio.getText());
            double mercado = Double.parseDouble(campoMercado.getText());
            double adicionais = Double.parseDouble(campoAdicionais.getText());

            return aluguel + luz + internet + condAgua + mercado + adicionais;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Erro: Digite apenas números.");
            return 0.0;
        }
    }

    private void adicionarNaTabela(String mes, double totalGasto) {
        Object[] rowData = {mes, totalGasto};
        modeloTabela.addRow(rowData);
    }

    private void limparCampos() {
        campoAluguel.setText("");
        campoLuz.setText("");
        campoInternet.setText("");
        campoCondominio.setText("");
        campoMercado.setText("");
        campoAdicionais.setText("");
        campoMes.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoAdicionais;
    private javax.swing.JTextField campoAluguel;
    private javax.swing.JTextField campoCondominio;
    private javax.swing.JTextField campoInternet;
    private javax.swing.JTextField campoLuz;
    private javax.swing.JTextField campoMercado;
    private javax.swing.JTextField campoMes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotuloAdicionais;
    private javax.swing.JLabel rotuloCondominio;
    private javax.swing.JLabel rotuloGastoMensal;
    private javax.swing.JLabel rotuloInternet;
    private javax.swing.JLabel rotuloLuz;
    private javax.swing.JLabel rotuloMercado;
    private javax.swing.JLabel rotuloMes;
    private javax.swing.JLabel rotuloaluguel;
    private javax.swing.JTable tabelaGastoMes;
    // End of variables declaration//GEN-END:variables

  
}
