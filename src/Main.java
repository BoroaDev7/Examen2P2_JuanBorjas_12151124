
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Juan Manuel Borjas Figueroa
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        cargarCientificos();
         AgregarPublicos(); 
        ActualizarCombo();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesPlaneta = new javax.swing.JPopupMenu();
        opcionPlaneta1 = new javax.swing.JMenuItem();
        opcionPlaneta2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        barraDistancia = new javax.swing.JProgressBar();
        barraDistancia2 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbolPlanetas = new javax.swing.JTree();
        planeta2 = new javax.swing.JTextField();
        planeta1 = new javax.swing.JTextField();
        boxPublicos = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cajaCientificos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nombreCientifico = new javax.swing.JTextField();
        aniadirCientifico = new javax.swing.JButton();
        Colisionar = new javax.swing.JButton();

        opcionPlaneta1.setText("Planeta 1");
        opcionPlaneta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionPlaneta1ActionPerformed(evt);
            }
        });
        opcionesPlaneta.add(opcionPlaneta1);

        opcionPlaneta2.setText("Planeta 2");
        opcionPlaneta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionPlaneta2ActionPerformed(evt);
            }
        });
        opcionesPlaneta.add(opcionPlaneta2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraDistancia.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(barraDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 700, 60));

        barraDistancia2.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(barraDistancia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 700, 60));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Planetas");
        arbolPlanetas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbolPlanetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolPlanetasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(arbolPlanetas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 320));
        jPanel1.add(planeta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 180, 30));
        jPanel1.add(planeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 180, 30));

        boxPublicos.setText("Publicos");
        boxPublicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxPublicosMouseClicked(evt);
            }
        });
        jPanel1.add(boxPublicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cientificos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 120, 30));

        jPanel1.add(cajaCientificos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 180, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));
        jPanel1.add(nombreCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 180, 30));

        aniadirCientifico.setBackground(new java.awt.Color(0, 153, 153));
        aniadirCientifico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aniadirCientifico.setText("Añadir Cientificos");
        aniadirCientifico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aniadirCientificoMouseClicked(evt);
            }
        });
        jPanel1.add(aniadirCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 180, 30));

        Colisionar.setBackground(new java.awt.Color(0, 153, 153));
        Colisionar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Colisionar.setText("Colisionar");
        Colisionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColisionarMouseClicked(evt);
            }
        });
        jPanel1.add(Colisionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 180, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxPublicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxPublicosMouseClicked
        // TODO add your handling code here:
        boolean gato=true;
        if(gato && boxPublicos.isSelected()){

        ActualizarArbol();
        gato=false;
        }
        else {
          BorrarNodos();
          
            gato=true;
        }
        
        
    }//GEN-LAST:event_boxPublicosMouseClicked

 
    
    private void arbolPlanetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolPlanetasMouseClicked
        // TODO add your handling code here:
        if(evt.isMetaDown()){
             opcionesPlaneta.show(evt.getComponent(), evt.getX(), evt.getY());
             int row=arbolPlanetas.getClosestRowForLocation(evt.getX(), evt.getY());
            arbolPlanetas.setSelectionRow(row);
            Object paps=arbolPlanetas.getSelectionPath().getLastPathComponent();
            nodoSeleccionado=(DefaultMutableTreeNode)paps;
             if(nodoSeleccionado.getUserObject() instanceof Planetas){
                planetaSeleccionado=(Planetas)nodoSeleccionado.getUserObject();
            }
        }
        
    }//GEN-LAST:event_arbolPlanetasMouseClicked

    private void opcionPlaneta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionPlaneta1ActionPerformed
        // TODO add your handling code here:
         DefaultTreeModel modelo=(DefaultTreeModel)arbolPlanetas.getModel();
          planet1=planetaSeleccionado;
         planeta1.setText(planet1.getNombre());
    
         
    }//GEN-LAST:event_opcionPlaneta1ActionPerformed

    private void opcionPlaneta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionPlaneta2ActionPerformed
        // TODO add your handling code here:
        planet2=planetaSeleccionado;
         planeta2.setText(planet2.getNombre());
         
         
    }//GEN-LAST:event_opcionPlaneta2ActionPerformed

    private void aniadirCientificoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirCientificoMouseClicked
        // TODO add your handling code here:
     if(nombreCientifico.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Ingrese el nombre del cientifico");
     }
     else{ 
         cientifico.add(new Cientificos(nombreCientifico.getText()));
      ActualizarCombo();
       AgregarCientificos();
       JOptionPane.showMessageDialog(this, "Cientifico Agregado");
       nombreCientifico.setText("");
     }
    }//GEN-LAST:event_aniadirCientificoMouseClicked

    private void ColisionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColisionarMouseClicked
        // TODO add your handling code here:
        try{
            double distancia = Math.sqrt(Math.pow(planet2.getCoordenadaX() - planet1.getCoordenadaX(), 2) + Math.pow(planet2.getCoordenadaY() - planet1.getCoordenadaY(), 2));
            barraDistancia.setMaximum((int) Math.round(distancia));
            Cientificos cienti = (Cientificos) cajaCientificos.getSelectedItem();
            HiloColision colision = new HiloColision(barraDistancia, barraDistancia2, planet1, planet2, cienti);
        colision.start();
        
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        
    }//GEN-LAST:event_ColisionarMouseClicked

    private void ActualizarCombo(){
        DefaultComboBoxModel combo=(DefaultComboBoxModel)cajaCientificos.getModel();
      combo.removeAllElements(); 
        for (Cientificos cienti : cientifico) {
      combo.addElement(cienti);
              }
       cajaCientificos.setModel(combo);  
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private void AgregarCientificos(){
         try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./cientificos.Juan"));
            for (Cientificos cienti :cientifico )
                os.writeObject(cienti);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    private void cargarCientificos(){
        try{
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./cientificos.Juan"));
            Cientificos cienti;
            while( (cienti = (Cientificos)os.readObject()) != null )
                cientifico.add(cienti);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    private void AgregarPublicos(){
        
      
        publicos.add(new Terrestre(5000,13000,"Mercurio",400,300));
        publicos.add(new Terrestre(100000,15000,"Venus",640,260));
        publicos.add(new Terrestre(140000,17000,"Tierra",760,570));
        publicos.add(new Terrestre(90000,12000,"Marte",360,360));
        publicos.add(new Gaseoso(400000,40000,"Jupiter",340,310));
        publicos.add(new Gaseoso(300000,30000,"Saturno",560,450));
        publicos.add(new Gaseoso(200000,20000,"Urano",670,690));
        publicos.add(new Gaseoso(200000,20000,"Neptuno",840,900));
        publicos.add(new Terrestre(777777,77777,"Planeta Vegeta",777,777));
    }
    private void ActualizarArbol(){
        DefaultTreeModel arbolito=(DefaultTreeModel)arbolPlanetas.getModel();
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Planetas"); 
           
        for (Planetas publico : publicos) {
        DefaultMutableTreeNode hijos=new DefaultMutableTreeNode(publico);
          
        root.add(hijos);    
        }
        arbolito.setRoot(root);
    }
    private void BorrarNodos(){
        DefaultTreeModel arbolito=(DefaultTreeModel)arbolPlanetas.getModel();
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Planetas"); 
        for (Cientificos cientificos : cientifico) {
            DefaultMutableTreeNode hojita=new DefaultMutableTreeNode(cientificos.getPlanetasDescubiertos());
           root.add(hojita);
        }
        arbolito.setRoot(root);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Colisionar;
    private javax.swing.JButton aniadirCientifico;
    private javax.swing.JTree arbolPlanetas;
    private javax.swing.JProgressBar barraDistancia;
    private javax.swing.JProgressBar barraDistancia2;
    private javax.swing.JCheckBox boxPublicos;
    private javax.swing.JComboBox<String> cajaCientificos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreCientifico;
    private javax.swing.JMenuItem opcionPlaneta1;
    private javax.swing.JMenuItem opcionPlaneta2;
    private javax.swing.JPopupMenu opcionesPlaneta;
    private javax.swing.JTextField planeta1;
    private javax.swing.JTextField planeta2;
    // End of variables declaration//GEN-END:variables
 private ArrayList<Planetas>publicos=new ArrayList();
 private ArrayList<Planetas>descubiertos=new ArrayList();
DefaultMutableTreeNode nodoSeleccionado;
Planetas planetaSeleccionado;
ArrayList<Cientificos>cientifico=new ArrayList();
Planetas planet1;
Planetas planet2;

}
