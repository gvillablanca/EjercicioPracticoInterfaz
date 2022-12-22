package ui;

import funciones.Funciones;
import funciones.Menus;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Persona;

public class VerPersona extends javax.swing.JFrame {
    ArrayList<Persona> persona;

    public VerPersona(ArrayList<Persona> persona) {
        this.persona = persona;
        initComponents();
        jp_panel_qlo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txf_rut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jp_panel_qlo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_apellido = new javax.swing.JLabel();
        lb_genero = new javax.swing.JLabel();
        lb_rut = new javax.swing.JLabel();
        lb_dv = new javax.swing.JLabel();
        lb_nacionalidad = new javax.swing.JLabel();
        lb_pais = new javax.swing.JLabel();
        lb_colorPiel = new javax.swing.JLabel();
        btn_buscar_rut = new javax.swing.JButton();
        btn_nueva_busqueda = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_inicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ver datos de persona");

        txf_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_rutActionPerformed(evt);
            }
        });

        jLabel2.setText("ingrese rut sin digito verificador para buscar persona");

        jp_panel_qlo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos de persona", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 0, 12))); // NOI18N

        jLabel3.setText("nombre");

        jLabel4.setText("apellido");

        jLabel5.setText("genero");

        jLabel6.setText("rut");

        jLabel7.setText("digito verificador");

        jLabel8.setText("nacionalidad");

        jLabel9.setText("pais");

        jLabel10.setText("color de piel");

        javax.swing.GroupLayout jp_panel_qloLayout = new javax.swing.GroupLayout(jp_panel_qlo);
        jp_panel_qlo.setLayout(jp_panel_qloLayout);
        jp_panel_qloLayout.setHorizontalGroup(
            jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_panel_qloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_panel_qloLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_colorPiel))
                    .addGroup(jp_panel_qloLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_pais))
                    .addGroup(jp_panel_qloLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_nacionalidad))
                    .addGroup(jp_panel_qloLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_dv))
                    .addGroup(jp_panel_qloLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_rut))
                    .addGroup(jp_panel_qloLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_genero))
                    .addGroup(jp_panel_qloLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_apellido))
                    .addGroup(jp_panel_qloLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(120, 120, 120)
                        .addComponent(lb_nombre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_panel_qloLayout.setVerticalGroup(
            jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_panel_qloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lb_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lb_genero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lb_rut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lb_dv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lb_nacionalidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lb_pais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_panel_qloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lb_colorPiel))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        btn_buscar_rut.setText("Buscar");
        btn_buscar_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_rutActionPerformed(evt);
            }
        });

        btn_nueva_busqueda.setText("nueva busqueda");

        btn_inicio.setText("Inicio");
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_nueva_busqueda)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_panel_qlo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txf_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar_rut))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_rut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_panel_qlo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nueva_busqueda)
                    .addComponent(btn_inicio))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        Menus menu = new Menus();
        menu.menu(persona);
        this.dispose();
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void txf_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_rutActionPerformed

    private void btn_buscar_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_rutActionPerformed
        if(txf_rut.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresa un rut", "Advertencia", JOptionPane.OK_OPTION);
        }
        else{            
            if(Funciones.isNumeric(txf_rut.getText())){               
               if(persona == null){
                   JOptionPane.showMessageDialog(null, "Persona no encontrada", "Información", JOptionPane.ERROR);
               }
               else{
                   int rut = Integer.parseInt(txf_rut.getText());
                   for(int i = 0; i<= persona.size(); i++){
                       if(persona.get(i).getRut()== rut){
                           jp_panel_qlo.setVisible(true);
                           lb_nombre.setText(persona.get(i).getNombre());
                           lb_apellido.setText(persona.get(i).getApellido());
                           lb_genero.setText(persona.get(i).getGenero());
                           lb_rut.setText(Integer.toString(persona.get(i).getRut()));
                           lb_dv.setText(persona.get(i).getDv());
                           lb_nacionalidad.setText(persona.get(i).getNacionalidad().getNombre());
                           lb_pais.setText(persona.get(i).getNacionalidad().getPais());
                           lb_colorPiel.setText(persona.get(i).getNacionalidad().getColorPiel());
                           break;
                       }
                       else{
                           JOptionPane.showMessageDialog(null, "Persona no encontrada", "Información", JOptionPane.ERROR);
                       }
                   }
               }
            }
            else{
               JOptionPane.showMessageDialog(null, "Rut no numerico", "Información", JOptionPane.ERROR); 
            }
        }
    }//GEN-LAST:event_btn_buscar_rutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_rut;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_nueva_busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jp_panel_qlo;
    private javax.swing.JLabel lb_apellido;
    private javax.swing.JLabel lb_colorPiel;
    private javax.swing.JLabel lb_dv;
    private javax.swing.JLabel lb_genero;
    private javax.swing.JLabel lb_nacionalidad;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_pais;
    private javax.swing.JLabel lb_rut;
    private javax.swing.JTextField txf_rut;
    // End of variables declaration//GEN-END:variables

    private String toString(int rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
