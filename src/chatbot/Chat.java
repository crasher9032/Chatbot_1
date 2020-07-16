package chatbot;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Chat extends javax.swing.JFrame {
    String bot="Chatbot: ";
    String usuario="Tú: ";
    List tema = new ArrayList();
    String pedidos[]={"pedido","envio"};
    String dudas[]={"duda"};
    String productos[]={"precio"};
    public Chat() {
        initComponents();
        setLocationRelativeTo(null);
        txtAChat.append(bot+"¿Cómo te puedo ayudar?");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnviar = new javax.swing.JButton();
        txtFMensaje = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAChat = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chatbot");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtFMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFMensajeKeyPressed(evt);
            }
        });

        txtAChat.setEditable(false);
        txtAChat.setColumns(20);
        txtAChat.setRows(5);
        jScrollPane1.setViewportView(txtAChat);

        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tortibot");

        lblEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 153, 0));
        lblEstado.setText("Online");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblEstado))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstado))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(txtFMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        accion();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtFMensajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFMensajeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            accion();
        }
    }//GEN-LAST:event_txtFMensajeKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }
    public String Analisis(String cadena){
        if (!"".equals(cadena)){
            try{
                String[] palabras=cadena.split(" ");
                for (String palabra : palabras) {
                    for (String pedido : pedidos) {
                        if (palabra.equals(pedido)) {
                            tema.add("pedido");
                        }
                    }
                    for (String duda : dudas) {
                        if (palabra.equals(duda)) {
                            tema.add("duda");
                        }
                    }
                    for (String producto : productos) {
                        if (palabra.equals(producto)) {
                            tema.add("producto");
                        }
                    }
                }
                if(tema.get(0)=="pedido"){
                    if (tema.size()>1){
                        return bot+"Parece que necesitas ayuda con un pedido \n"
                            + "Podria ser:\n"
                            + "Problema con entrega\n"
                            + "Realizar un pedido";
                    }else{
                        
                    }
                }
                if(tema.get(0)=="duda"){
                    return bot+"Cuentame sobre el problema";
                }
                if(tema.get(0)=="producto"){
                    return bot+"¿Algun producto en especifico?\n"
                            + "¿Deseas ver la lista de productos?";
                }
            }catch(Exception e){
                System.out.println(e);
                return "Lo siento, no entendi tu pregunta";
            }
        }else{
            return "Realiza una pregunta";
        }
        return null;
    }
    public void accion(){
        String mensaje=txtFMensaje.getText();
        txtAChat.append("\n"+usuario+mensaje);
        txtFMensaje.setText("");
        //txtAChat.append("Pensando...");
        String respuesta = Analisis(mensaje);
        txtAChat.append("\n"+respuesta);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextArea txtAChat;
    private javax.swing.JTextField txtFMensaje;
    // End of variables declaration//GEN-END:variables
}