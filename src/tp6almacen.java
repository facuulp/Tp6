
public class tp6almacen extends javax.swing.JFrame {
    private TreeSet<>

   
    public tp6almacen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Jproducto = new javax.swing.JMenuItem();
        Jrubro = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Jprecio = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout JescritorioLayout = new javax.swing.GroupLayout(Jescritorio);
        Jescritorio.setLayout(JescritorioLayout);
        JescritorioLayout.setHorizontalGroup(
            JescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1121, Short.MAX_VALUE)
        );
        JescritorioLayout.setVerticalGroup(
            JescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        Jproducto.setText("Productos ");
        Jproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JproductoActionPerformed(evt);
            }
        });
        jMenu1.add(Jproducto);

        jMenuBar1.add(jMenu1);

        Jrubro.setText("Consultas");

        jMenuItem2.setText("Por rubro");
        Jrubro.add(jMenuItem2);

        Jprecio.setText("Por nombre");
        Jprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JprecioActionPerformed(evt);
            }
        });
        Jrubro.add(Jprecio);

        jMenuItem4.setText("Por precio");
        Jrubro.add(jMenuItem4);

        jMenuBar1.add(Jrubro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jescritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jescritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JprecioActionPerformed
     
    }//GEN-LAST:event_JprecioActionPerformed

    private void JproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JproductoActionPerformed
        Jescritorio.removeAll();
        Jescritorio.repaint();
        Productos p= new Productos()
    }//GEN-LAST:event_JproductoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(tp6almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tp6almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tp6almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tp6almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tp6almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Jescritorio;
    private javax.swing.JMenuItem Jprecio;
    private javax.swing.JMenuItem Jproducto;
    private javax.swing.JMenu Jrubro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
