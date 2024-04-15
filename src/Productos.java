
import entidades.Categoria;
import entidades.Producto;
import java.util.TreeSet;
import javax.swing.JOptionPane;


public class Productos extends javax.swing.JInternalFrame {
    private TreeSet<Producto> listaProductos;
    private Producto auxiliar=null;
    
    public Productos(TreeSet<Producto> listaProductos) {
        initComponents();
        this.listaProductos = listaProductos;
        llenarcombox();
    }
    private void llenarcombox() {
        JCategoria.addItem(new Categoria(1, "Limpieza"));
        JCategoria.addItem(new Categoria(2, "Comestible"));
        JCategoria.addItem(new Categoria(3, "Perfumeria"));
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jcodigo = new javax.swing.JTextField();
        Jdescripcion = new javax.swing.JTextField();
        Jprecio = new javax.swing.JTextField();
        Jstock = new javax.swing.JTextField();
        JCategoria = new javax.swing.JComboBox<>();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        Jbuscar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Gestion de productos:");

        jLabel2.setText("Código:");

        jLabel3.setText("Descripción:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Rubro:");

        jLabel6.setText("Stock:");

        Jcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JcodigoKeyTyped(evt);
            }
        });

        Jprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JprecioKeyTyped(evt);
            }
        });

        Jstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JstockKeyTyped(evt);
            }
        });

        JCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCategoriaActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        Jbuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ryzen 5 5600G\\Documents\\NetBeansProjects\\tp6\\src\\imagenes\\iconoBuscar.png")); // NOI18N
        Jbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Jdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jstock, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jbNuevo)
                        .addGap(31, 31, 31)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(16, 16, 16)))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(Jbuscar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Jdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Jstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCategoriaActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try{
        int codigo = Integer.parseInt(Jcodigo.getText());
        String descripcion = Jdescripcion.getText();
        double precio = Double.parseDouble(Jprecio.getText());
        Categoria categ = (Categoria) JCategoria.getSelectedItem();
        int stock = Integer.parseInt(Jstock.getText());
        Producto prodAgregado= new Producto(codigo,descripcion,precio,stock,categ);
         if(listaProductos.add(prodAgregado)){
           JOptionPane.showMessageDialog(this, "Producto Agregado");
           limpiar();
       }else {
       
           JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código");
       }
        
        limpiar();
        }catch(Exception r){
            JOptionPane.showMessageDialog(this,"Faltan datos");
            limpiar();
            return;
        
        }
        
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void JcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JcodigoKeyTyped
        char digito = evt.getKeyChar();
        if (!Character.isDigit(digito)){
            evt.consume();
        }
    }//GEN-LAST:event_JcodigoKeyTyped

    private void JprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JprecioKeyTyped
        char digito = evt.getKeyChar();
        if (!Character.isDigit(digito)){
            evt.consume();
        }
    }//GEN-LAST:event_JprecioKeyTyped

    private void JstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JstockKeyTyped
        char digito = evt.getKeyChar();
        if (!Character.isDigit(digito)){
            evt.consume();
        }
    }//GEN-LAST:event_JstockKeyTyped

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jbEliminar.setEnabled(true);
        jbGuardar.setEnabled(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
//        int resp = JOptionPane.showConfirmDialog(this, "¿Desea eliminar Producto?", "Confirmacion", JOptionPane.YES_NO_OPTION);
//        if(resp==JOptionPane.YES_OPTION){
//            listaProductos.remove(Producto);
//        }
        limpiar();
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void JbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuscarActionPerformed
        int codigo = Integer.parseInt(Jcodigo.getText());
        for (Producto listaProducto : listaProductos) {
            if(codigo==listaProducto.getCodigo()){
                Jdescripcion.setText(listaProducto.getDescripcion());
                Jprecio.setText(listaProducto.getPrecio()+"");
                Jstock.setText(listaProducto.getStock()+"");
                JCategoria.setSelectedItem(listaProducto.getCategorias());
                jbEliminar.setEnabled(true);
                
                 
            
            }
            
        }
        
            
        
        
    }//GEN-LAST:event_JbuscarActionPerformed
    private void limpiar(){
        Jcodigo.setText("");
        Jdescripcion.setText("");
        Jprecio.setText("");
        JCategoria.setSelectedIndex(0);
        Jstock.setText("");
        jbEliminar.setEnabled(false);
        jbGuardar.setEnabled(false);
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> JCategoria;
    private javax.swing.JButton Jbuscar;
    private javax.swing.JTextField Jcodigo;
    private javax.swing.JTextField Jdescripcion;
    private javax.swing.JTextField Jprecio;
    private javax.swing.JTextField Jstock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables

    private boolean validaEntero(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
