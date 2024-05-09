package TrabalhoPOO;

import javax.swing.JOptionPane;

public class TelaSabor extends javax.swing.JFrame {
    private Principal pri;
    private Pizza pizz = new Pizza();
    private Pedido pedido;
    double totPreco = 0;
    
    public TelaSabor() {
        initComponents();
    }
    
    public void setPrincipal(Principal prin){
        pri = prin;
    }
    
    public void setPedido(Pedido ped){
        pedido = ped;
        
        pedido.setQtdPizzas(Integer.parseInt(JOptionPane.
                        showInputDialog("Digite a quanditdade de pizzas: ")));
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboMassa = new javax.swing.JComboBox<>();
        comboBebida = new javax.swing.JComboBox<>();
        comboSabor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvarSabor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        numPedacos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboMassa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tradicional", "Integral" }));
        comboMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMassaActionPerformed(evt);
            }
        });

        comboBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Coca", "Sprite", "Pepsi", "Guaraná" }));
        comboBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBebidaActionPerformed(evt);
            }
        });

        comboSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atum", "Bacon", "Baiana", "Bauru", "Brócolis", "Calabresa", "Camarão", "Canadense", "Escarola", "Executiva", "Frango c/ Catupiry", "Francesa", "Lombo", "Marguerita", "Mussarela", "2 queijos", "4 queijos", "5 queijos", "Peito de perú", "Peperoni", "Portugusa", "Rúcula", "Toscana" }));
        comboSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSabor(evt);
            }
        });

        jLabel1.setText("Massa");

        jLabel2.setText("Sabor");

        jLabel3.setText("Bebida");

        btnSalvarSabor.setText("Salvar");
        btnSalvarSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSaborActionPerformed(evt);
            }
        });

        jLabel5.setText("Pedaços");

        numPedacos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "8" }));
        numPedacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPedacosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numPedacos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboSabor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboMassa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarSabor)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numPedacos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnSalvarSabor)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMassaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMassaActionPerformed

    private void comboSabor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSabor

        //setvalSabor(sab);
    }//GEN-LAST:event_comboSabor

    private void btnSalvarSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSaborActionPerformed
        int valMas = comboMassa.getSelectedIndex();
        int valSab = comboSabor.getSelectedIndex();
        int valBeb = comboBebida.getSelectedIndex();
        String pedacos = numPedacos.getSelectedItem().toString();
        
        pizz.setMassa(valMas);
        pizz.setSabor(valSab);
        pizz.setBebida(valBeb);
        pizz.setPedacos(pedacos);
        
        pedido.calculaPrecos(pizz.getMassa(), pizz.getBebida(), pizz.getSabor());
        totPreco += pedido.getPreco();
        
        String sab = comboSabor.getSelectedItem().toString()+ ", " 
                + comboBebida.getSelectedItem().toString()
                + ", ";
        
        pedido.getPizzas().push(sab);
        pizz = new Pizza();
        JOptionPane.showInternalMessageDialog(null, "Pizza registrada");
        if(pedido.getPizzas().isFull()){
            pedido.setPreco(totPreco);
            JOptionPane.showInternalMessageDialog(null, 
                    "Todos as Pizzas foram registradas");
            setVisible(false);
            pri.setVisible(true);
            
        }
    }//GEN-LAST:event_btnSalvarSaborActionPerformed

    private void comboBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBebidaActionPerformed

    private void numPedacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPedacosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPedacosActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSabor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarSabor;
    private javax.swing.JComboBox<String> comboBebida;
    private javax.swing.JComboBox<String> comboMassa;
    private javax.swing.JComboBox<String> comboSabor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> numPedacos;
    // End of variables declaration//GEN-END:variables
}
