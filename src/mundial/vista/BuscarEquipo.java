package mundial.vista;

import javax.swing.JOptionPane;
import mundial.dao.DaoEquipo;
import mundial.modelo.Equipo;

public class BuscarEquipo extends javax.swing.JFrame {

    public BuscarEquipo() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        emEquipo = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MundialPU").createEntityManager();
        Equipo = java.beans.Beans.isDesignTime() ? null : emEquipo.createQuery("Select e From Equipo e");
        ListaBusqueda = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : Equipo.getResultList();
        btgPartidoF1 = new javax.swing.ButtonGroup();
        btgPartidoF2 = new javax.swing.ButtonGroup();
        btgPartidoF3 = new javax.swing.ButtonGroup();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbnBuscar = new javax.swing.JComboBox();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditarEquipo = new javax.swing.JButton();
        imagePanel1 = new com.mycsistemas.swingec.panel.ImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR EQUIPO");

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Eliminar.png")); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Cerrar.png")); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ListaBusqueda, tblBusqueda);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${grupo}"));
        columnBinding.setColumnName("Grupo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${titulos_ganados}"));
        columnBinding.setColumnName("Titulos_ganados");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${puntos_Rankin}"));
        columnBinding.setColumnName("Puntos_ Rankin");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ubicacion_Rankin}"));
        columnBinding.setColumnName("Ubicacion_ Rankin");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${p_final1}"));
        columnBinding.setColumnName("P_final1");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${p_final2}"));
        columnBinding.setColumnName("P_final2");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${p_final3}"));
        columnBinding.setColumnName("P_final3");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${continente}"));
        columnBinding.setColumnName("Continente");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(tblBusqueda);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parametros de Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Buscar por:");

        cbnBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Equipo", "Grupo", "Continente" }));

        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Buscar.png")); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnEditarEquipo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Modificar.png")); // NOI18N
        btnEditarEquipo.setText("EDITAR EQUIPO");
        btnEditarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEquipoActionPerformed(evt);
            }
        });

        imagePanel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\images\\mundialbra.jpg")); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnEliminar)
                        .addGap(54, 54, 54)
                        .addComponent(btnEditarEquipo)
                        .addGap(56, 56, 56)
                        .addComponent(btnSalir)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir)
                    .addComponent(btnEditarEquipo))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Integer seleccionado = cbnBuscar.getSelectedIndex();
        String busqueda = txtBuscar.getText();
        DaoEquipo dcop = new DaoEquipo();
        ListaBusqueda.clear();
        switch (seleccionado) {
            case 0:
                ListaBusqueda.add((Equipo) dcop.encontrarporId(busqueda));
                tblBusqueda.updateUI();

                break;

            case 1:
                ListaBusqueda.addAll(dcop.encontrarPorNombre(busqueda));
                tblBusqueda.updateUI();

                break;

            case 2:
                ListaBusqueda.addAll(dcop.encontrarPorGrupo(busqueda));
                tblBusqueda.updateUI();
                break;

            case 3:
                ListaBusqueda.addAll(dcop.encontrarPorContinente(busqueda));
                tblBusqueda.updateUI();

                break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {

            int indice = tblBusqueda.getSelectedRow();
            Equipo cp = ListaBusqueda.get(indice);
            DaoEquipo dcompu = new DaoEquipo();
            if (cp != null) {
                int n = JOptionPane.showConfirmDialog(null, "desea eliminar el computador", "Confirme", JOptionPane.YES_NO_OPTION);
                if (n == 0) {
                    dcompu.getEm().getTransaction().begin();
                    Equipo cp1 = dcompu.getEm().find(Equipo.class, cp.getCodigo());
                    dcompu.getEm().remove(cp1);
                    dcompu.getEm().getTransaction().commit();
                    java.util.List lista = dcompu.encontrarTodos();
                    ListaBusqueda.clear();
                    ListaBusqueda.addAll(lista);
                    tblBusqueda.updateUI();
                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR (OBJETO NO EXISTENTE)");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("ahahah");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
 dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEditarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEquipoActionPerformed
        DaoEquipo dcompu = new DaoEquipo();
        int indice = tblBusqueda.getSelectedRow();
        Equipo cp = ListaBusqueda.get(indice);
        EditaEquipo mo = new EditaEquipo(this, true, cp);
        mo.setVisible(true);
        java.util.List lista = dcompu.encontrarTodos();
        ListaBusqueda.clear();
        ListaBusqueda.addAll(lista);
        tblBusqueda.updateUI();
    }//GEN-LAST:event_btnEditarEquipoActionPerformed
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new BuscarEquipo().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.Query Equipo;
    private java.util.List<mundial.modelo.Equipo> ListaBusqueda;
    private javax.swing.ButtonGroup btgPartidoF1;
    private javax.swing.ButtonGroup btgPartidoF2;
    private javax.swing.ButtonGroup btgPartidoF3;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditarEquipo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbnBuscar;
    private javax.persistence.EntityManager emEquipo;
    private com.mycsistemas.swingec.panel.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBusqueda;
    private javax.swing.JTextField txtBuscar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
