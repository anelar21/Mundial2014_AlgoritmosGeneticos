package mundial.vista;

import javax.swing.JOptionPane;
import mundial.dao.DaoEquipo;
import mundial.modelo.Equipo;

public class EditaEquipo extends java.awt.Dialog {

    Equipo equi;

    public EditaEquipo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        equi = new Equipo();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public EditaEquipo(java.awt.Frame parent, boolean modal, Equipo eq) {
        super(parent, modal);
        initComponents();
        equi = eq;
        txtCodigo.setText(eq.getCodigo());
        txtEquipo.setText(eq.getNombre());
        txtPuntosRankin.setText("" + eq.getPuntos_Rankin());
        txtUbicacionRankin.setText("" + eq.getUbicacion_Rankin());
        txtTitulosGanados.setText("" + eq.getTitulos_ganados());
        cbxContinente.setSelectedItem(eq.getContinente());
        cbxGrupo.setSelectedItem(eq.getGrupo());
        if (eq.getP_final1() == 1) {
            rbGanadoPF1.setSelected(true);
        }
        if (eq.getP_final1() == 0) {
            rbEmpatadoPF1.setSelected(true);
        }
        if (eq.getP_final1() == -1) {
            rbPerdidoPF1.setSelected(true);
        }
        if (eq.getP_final2() == 1) {
            rbGanadoPF2.setSelected(true);
        }
        if (eq.getP_final2() == 0) {
            rbEmpatadoPF2.setSelected(true);
        }
        if (eq.getP_final2() == -1) {
            rbPerdidoPF2.setSelected(true);
        }
        if (eq.getP_final3() == 1) {
            rbGanadoPF3.setSelected(true);
        }
        if (eq.getP_final3() == 0) {
            rbEmpatadoPF3.setSelected(true);
        }
        if (eq.getP_final3() == 1) {
            rbPerdidoPF3.setSelected(true);
        }

        setLocationRelativeTo(null);
        setResizable(false);
    }

    String c = "";
    String g = "";
    Integer pf1;
    Integer pf2;
    Integer pf3;

    public String obtenerContinente() {
        if (cbxContinente.getSelectedIndex() == 0) {
            c = "America del Sur";
        } else if (cbxContinente.getSelectedIndex() == 1) {
            c = "America Central";
        } else if (cbxContinente.getSelectedIndex() == 2) {
            c = "America del Norte";
        } else if (cbxContinente.getSelectedIndex() == 3) {
            c = "Europa";
        } else if (cbxContinente.getSelectedIndex() == 4) {
            c = "Asia";
        } else if (cbxContinente.getSelectedIndex() == 5) {
            c = "Africa";
        }
        return c;
    }

    public String obtenerGrupo() {
        if (cbxGrupo.getSelectedIndex() == 0) {
            g = "A";
        } else if (cbxGrupo.getSelectedIndex() == 1) {
            g = "B";
        } else if (cbxGrupo.getSelectedIndex() == 2) {
            g = "C";
        } else if (cbxGrupo.getSelectedIndex() == 3) {
            g = "D";
        } else if (cbxGrupo.getSelectedIndex() == 4) {
            g = "E";
        } else if (cbxGrupo.getSelectedIndex() == 5) {
            g = "F";
        } else if (cbxGrupo.getSelectedIndex() == 6) {
            g = "G";
        } else if (cbxGrupo.getSelectedIndex() == 7) {
            g = "H";
        }
        return g;
    }

    public Integer obtenerResultadoPF1() {
        if (rbGanadoPF1.isSelected()) {
            pf1 = 1;
        } else if (rbEmpatadoPF1.isSelected()) {
            pf1 = 0;
        } else if (rbPerdidoPF1.isSelected()) {
            pf1 = -1;
        }
        return pf1;
    }

    public Integer obtenerResultadoPF2() {
        if (rbGanadoPF2.isSelected()) {
            pf2 = 1;
        } else if (rbEmpatadoPF2.isSelected()) {
            pf2 = 0;
        } else if (rbPerdidoPF2.isSelected()) {
            pf2 = -1;
        }
        return pf2;
    }

    public Integer obtenerResultadoPF3() {
        if (rbGanadoPF3.isSelected()) {
            pf3 = 1;
        } else if (rbEmpatadoPF3.isSelected()) {
            pf3 = 0;
        } else if (rbPerdidoPF3.isSelected()) {
            pf3 = -1;
        }
        return pf3;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgPartidoF1 = new javax.swing.ButtonGroup();
        emEquipo = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MundialPU").createEntityManager();
        Equipo = java.beans.Beans.isDesignTime() ? null : emEquipo.createQuery("Select e From Equipo e");
        ListaEquipos = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : Equipo.getResultList();
        btgPartidoF2 = new javax.swing.ButtonGroup();
        btgPartidoF3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblUltimosPartidosGanados = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbGanadoPF1 = new javax.swing.JRadioButton();
        rbEmpatadoPF1 = new javax.swing.JRadioButton();
        rbPerdidoPF1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rbGanadoPF2 = new javax.swing.JRadioButton();
        rbEmpatadoPF2 = new javax.swing.JRadioButton();
        rbPerdidoPF2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbGanadoPF3 = new javax.swing.JRadioButton();
        rbEmpatadoPF3 = new javax.swing.JRadioButton();
        rbPerdidoPF3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblContinente = new javax.swing.JLabel();
        cbxContinente = new javax.swing.JComboBox();
        lblEquipo = new javax.swing.JLabel();
        txtEquipo = new javax.swing.JTextField();
        lblPuntosRankin = new javax.swing.JLabel();
        txtPuntosRankin = new javax.swing.JTextField();
        lblUbicacionRankin = new javax.swing.JLabel();
        txtUbicacionRankin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxGrupo = new javax.swing.JComboBox();
        lblTitulosGanados = new javax.swing.JLabel();
        txtTitulosGanados = new javax.swing.JTextField();
        imagePanel1 = new com.mycsistemas.swingec.panel.ImagePanel();

        setTitle("AGREGAR EQUIPOS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Guardar.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\iconos\\Cerrar.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblUltimosPartidosGanados.setText("Ultimos Partidos");

        jLabel3.setText("Partido Final 1");

        btgPartidoF1.add(rbGanadoPF1);
        rbGanadoPF1.setText("Ganado");

        btgPartidoF1.add(rbEmpatadoPF1);
        rbEmpatadoPF1.setText("Empatado");

        btgPartidoF1.add(rbPerdidoPF1);
        rbPerdidoPF1.setText("Perdido");

        jLabel4.setText("Partido Final 2");

        btgPartidoF2.add(rbGanadoPF2);
        rbGanadoPF2.setText("Ganado");

        btgPartidoF2.add(rbEmpatadoPF2);
        rbEmpatadoPF2.setText("Empatado");

        btgPartidoF2.add(rbPerdidoPF2);
        rbPerdidoPF2.setText("Perdido");

        jLabel5.setText("Partido Final 3");

        btgPartidoF3.add(rbGanadoPF3);
        rbGanadoPF3.setText("Ganado");

        btgPartidoF3.add(rbEmpatadoPF3);
        rbEmpatadoPF3.setText("Empatado");

        btgPartidoF3.add(rbPerdidoPF3);
        rbPerdidoPF3.setText("Perdido");

        jLabel2.setText("Codigo");

        lblContinente.setText("Continente");

        cbxContinente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "America del Sur", "America Central", "America del Norte", "Europa", "Asia", "Africa" }));

        lblEquipo.setText("Equipo");

        lblPuntosRankin.setText("Puntos Rankin");

        lblUbicacionRankin.setText("Ubicacion Rankin");

        jLabel6.setText("Grupo");

        cbxGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H" }));

        lblTitulosGanados.setText("Titulos Ganados");

        imagePanel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronald\\Documents\\NetBeansProjects\\Mundial\\images\\copa1.png")); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rbPerdidoPF1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbGanadoPF1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbEmpatadoPF1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rbPerdidoPF2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbGanadoPF2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbEmpatadoPF2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(rbEmpatadoPF3)
                            .addComponent(rbGanadoPF3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbPerdidoPF3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTitulosGanados)
                                    .addComponent(lblUbicacionRankin)
                                    .addComponent(lblUltimosPartidosGanados))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUbicacionRankin, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(txtTitulosGanados)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblEquipo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(5, 5, 5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPuntosRankin)
                                            .addComponent(jLabel6))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52))
                                            .addComponent(txtPuntosRankin, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblContinente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxContinente, 0, 1, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnCancelar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContinente)
                    .addComponent(cbxContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEquipo)
                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuntosRankin)
                    .addComponent(txtPuntosRankin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUbicacionRankin)
                    .addComponent(txtUbicacionRankin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulosGanados)
                    .addComponent(txtTitulosGanados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblUltimosPartidosGanados)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbGanadoPF2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbEmpatadoPF2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPerdidoPF2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbGanadoPF1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbEmpatadoPF1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPerdidoPF1)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbGanadoPF3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEmpatadoPF3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbPerdidoPF3))
                    .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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


    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    @SuppressWarnings("empty-statement")
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        obtenerContinente();
        obtenerGrupo();
        obtenerResultadoPF3();
        obtenerResultadoPF2();
        obtenerResultadoPF1();

        equi.setCodigo(txtCodigo.getText());
        equi.setNombre(txtEquipo.getText());
        equi.setPuntos_Rankin(Integer.parseInt(txtPuntosRankin.getText()));
        equi.setUbicacion_Rankin(Integer.parseInt(txtUbicacionRankin.getText()));
        equi.setTitulos_ganados(Integer.parseInt(txtTitulosGanados.getText()));
        equi.setContinente(obtenerContinente());
        equi.setGrupo(g);
        equi.setP_final1(pf1);
        equi.setP_final2(pf2);
        equi.setP_final3(pf3);
        dequipo.modificar(equi);
        JOptionPane.showMessageDialog(null, "EL EQUIPO SE HA MODIFICADO CON EXITO CON EXITO");
        txtCodigo.setText("");
        txtEquipo.setText("");
        txtPuntosRankin.setText("");
        txtTitulosGanados.setText("");
        txtUbicacionRankin.setText("");
        btgPartidoF1.clearSelection();
        btgPartidoF2.clearSelection();
        btgPartidoF3.clearSelection();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    DaoEquipo dequipo = new DaoEquipo();

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                EditaEquipo dialog = new EditaEquipo(new java.awt.Frame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.Query Equipo;
    private java.util.List<mundial.modelo.Equipo> ListaEquipos;
    private javax.swing.ButtonGroup btgPartidoF1;
    private javax.swing.ButtonGroup btgPartidoF2;
    private javax.swing.ButtonGroup btgPartidoF3;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cbxContinente;
    private javax.swing.JComboBox cbxGrupo;
    private javax.persistence.EntityManager emEquipo;
    private com.mycsistemas.swingec.panel.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContinente;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblPuntosRankin;
    private javax.swing.JLabel lblTitulosGanados;
    private javax.swing.JLabel lblUbicacionRankin;
    private javax.swing.JLabel lblUltimosPartidosGanados;
    private javax.swing.JRadioButton rbEmpatadoPF1;
    private javax.swing.JRadioButton rbEmpatadoPF2;
    private javax.swing.JRadioButton rbEmpatadoPF3;
    private javax.swing.JRadioButton rbGanadoPF1;
    private javax.swing.JRadioButton rbGanadoPF2;
    private javax.swing.JRadioButton rbGanadoPF3;
    private javax.swing.JRadioButton rbPerdidoPF1;
    private javax.swing.JRadioButton rbPerdidoPF2;
    private javax.swing.JRadioButton rbPerdidoPF3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEquipo;
    private javax.swing.JTextField txtPuntosRankin;
    private javax.swing.JTextField txtTitulosGanados;
    private javax.swing.JTextField txtUbicacionRankin;
    // End of variables declaration//GEN-END:variables
}
