package mundial.vista;

import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import java.awt.Toolkit;
import javax.swing.UIManager;


public class Principal extends javax.swing.JFrame {

      public Principal() {
          
          try {
            UIManager.setLookAndFeel(new NimRODLookAndFeel());
        } catch (Exception e) {
        }
        
        
        
        initComponents();
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width) / 2, (getToolkit().getDefaultToolkit().getScreenSize().height - this.getSize().height) / 2);
        setResizable(false);
               
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel3 = new com.mycsistemas.swingec.panel.ImagePanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPrincipal = new javax.swing.JMenu();
        mnuiAgregarEquipos = new javax.swing.JMenuItem();
        mnuiVerGrupos = new javax.swing.JMenuItem();
        muniGenerarCmEquipos = new javax.swing.JMenuItem();
        mnuiEditarEquipos = new javax.swing.JMenuItem();
        mnuiVerEquiposClasificados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MUNDIAL BRASIL 2014");

        imagePanel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\images\\Imagen1.jpg")); // NOI18N

        javax.swing.GroupLayout imagePanel3Layout = new javax.swing.GroupLayout(imagePanel3);
        imagePanel3.setLayout(imagePanel3Layout);
        imagePanel3Layout.setHorizontalGroup(
            imagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        imagePanel3Layout.setVerticalGroup(
            imagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        mnuPrincipal.setText("Archivo");
        mnuPrincipal.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        mnuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrincipalActionPerformed(evt);
            }
        });

        mnuiAgregarEquipos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuiAgregarEquipos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Abrir.png")); // NOI18N
        mnuiAgregarEquipos.setText("Agregar Equipos");
        mnuiAgregarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiAgregarEquiposActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuiAgregarEquipos);

        mnuiVerGrupos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mnuiVerGrupos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Factura.gif")); // NOI18N
        mnuiVerGrupos.setText("Ver Grupos");
        mnuiVerGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiVerGruposActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuiVerGrupos);

        muniGenerarCmEquipos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        muniGenerarCmEquipos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\right_16.png")); // NOI18N
        muniGenerarCmEquipos.setText("Generar cuatro mejores equipos ");
        muniGenerarCmEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muniGenerarCmEquiposActionPerformed(evt);
            }
        });
        mnuPrincipal.add(muniGenerarCmEquipos);

        mnuiEditarEquipos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnuiEditarEquipos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Buscar.png")); // NOI18N
        mnuiEditarEquipos.setText("Buscar Equipos");
        mnuiEditarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiEditarEquiposActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuiEditarEquipos);

        mnuiVerEquiposClasificados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mnuiVerEquiposClasificados.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Clien list.gif")); // NOI18N
        mnuiVerEquiposClasificados.setText("Ver Equipos Clasificados");
        mnuiVerEquiposClasificados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiVerEquiposClasificadosActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuiVerEquiposClasificados);

        jMenuBar1.add(mnuPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuiAgregarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiAgregarEquiposActionPerformed
       AgregarEquipo ae = new AgregarEquipo(this, true);
       ae.setVisible(true);
       
       
    }//GEN-LAST:event_mnuiAgregarEquiposActionPerformed

    private void mnuiVerGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiVerGruposActionPerformed
        GruposMundial gm = new GruposMundial(this, true);
        gm.setVisible(true);
     
    }//GEN-LAST:event_mnuiVerGruposActionPerformed

    private void mnuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrincipalActionPerformed
     
      
    }//GEN-LAST:event_mnuPrincipalActionPerformed

    private void mnuiVerEquiposClasificadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiVerEquiposClasificadosActionPerformed
        EquiposClasificados ec = new EquiposClasificados(this, true);
      ec.setVisible(true);
    }//GEN-LAST:event_mnuiVerEquiposClasificadosActionPerformed

    private void mnuiEditarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiEditarEquiposActionPerformed
      BuscarEquipo be = new BuscarEquipo();
      be.setVisible(true);
    }//GEN-LAST:event_mnuiEditarEquiposActionPerformed

    private void muniGenerarCmEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muniGenerarCmEquiposActionPerformed
        GenerarCuatroMejores gcm = new GenerarCuatroMejores(this, true);
        gcm.setVisible(true);
    }//GEN-LAST:event_muniGenerarCmEquiposActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycsistemas.swingec.panel.ImagePanel imagePanel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuPrincipal;
    private javax.swing.JMenuItem mnuiAgregarEquipos;
    private javax.swing.JMenuItem mnuiEditarEquipos;
    private javax.swing.JMenuItem mnuiVerEquiposClasificados;
    private javax.swing.JMenuItem mnuiVerGrupos;
    private javax.swing.JMenuItem muniGenerarCmEquipos;
    // End of variables declaration//GEN-END:variables
}
