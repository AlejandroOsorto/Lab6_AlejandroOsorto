package lab6_alejandroosorto;

import java.io.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Alejandro
 */
public class Principal extends javax.swing.JFrame
{
    
    ArrayList listaProgramas = new ArrayList();
    
    public Principal()
    {
        initComponents();
        setLocationRelativeTo(null);
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) CB_TipoPrograma.getModel();
        m.addElement("Anime");
        m.addElement("Serie");
        m.addElement("Documental");
        m.addElement("Pelicula");
        
        DefaultComboBoxModel m2 = (DefaultComboBoxModel) CB_GeneroPrograma.getModel();
        m2.addElement("Comedia");
        m2.addElement("Romance");
        m2.addElement("Terror");
        m2.addElement("SyFy");
        m2.addElement("Suspenso");
        m2.addElement("Accion");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        M_CD_SubMenuListar = new javax.swing.JPopupMenu();
        MI_Modificar = new javax.swing.JMenuItem();
        MI_EliminarPrograma = new javax.swing.JMenuItem();
        M_CD_SubMenuAggLista = new javax.swing.JPopupMenu();
        MI_EliminarLista = new javax.swing.JMenuItem();
        PPrincipal = new javax.swing.JTabbedPane();
        P_AgregarPrograma = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CT_NombrePrograma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SP_Puntuacion = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        CT_AñoPrograma = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CB_TipoPrograma = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        CB_GeneroPrograma = new javax.swing.JComboBox<>();
        BTN_AgregarPrograma = new javax.swing.JButton();
        P_AgregarLista = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CT_NombreCL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CB_ProgramasCL = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        L_ProgramasSeleccionadosCL = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        BTN_GuardarLista = new javax.swing.JButton();
        BTN_AgregarALista = new javax.swing.JButton();
        P_MostrarLista = new javax.swing.JPanel();
        BTN_CargarLista = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TEXT_Lista = new javax.swing.JTextArea();

        MI_Modificar.setText("Modificar");
        M_CD_SubMenuListar.add(MI_Modificar);

        MI_EliminarPrograma.setText("jMenuItem1");
        M_CD_SubMenuListar.add(MI_EliminarPrograma);

        MI_EliminarLista.setText("Quitar");
        MI_EliminarLista.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MI_EliminarListaActionPerformed(evt);
            }
        });
        M_CD_SubMenuAggLista.add(MI_EliminarLista);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PPrincipal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PPrincipalMouseClicked(evt);
            }
        });

        P_AgregarPrograma.setBackground(new java.awt.Color(88, 127, 154));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre: ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puntuacion: ");

        SP_Puntuacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Año de lanzamiento: ");

        CT_AñoPrograma.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                CT_AñoProgramaKeyTyped(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo: ");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Género: ");

        BTN_AgregarPrograma.setBackground(new java.awt.Color(50, 56, 58));
        BTN_AgregarPrograma.setForeground(new java.awt.Color(255, 255, 255));
        BTN_AgregarPrograma.setText("Agregar programa");
        BTN_AgregarPrograma.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_AgregarProgramaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_AgregarProgramaLayout = new javax.swing.GroupLayout(P_AgregarPrograma);
        P_AgregarPrograma.setLayout(P_AgregarProgramaLayout);
        P_AgregarProgramaLayout.setHorizontalGroup(
            P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(CT_NombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(SP_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CT_AñoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(CB_TipoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(CB_GeneroPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTN_AgregarPrograma))
                .addContainerGap(416, Short.MAX_VALUE))
        );
        P_AgregarProgramaLayout.setVerticalGroup(
            P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CT_NombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SP_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CT_AñoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CB_TipoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CB_GeneroPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(BTN_AgregarPrograma)
                .addGap(37, 37, 37))
        );

        PPrincipal.addTab("Agregar programa", P_AgregarPrograma);

        P_AgregarLista.setBackground(new java.awt.Color(102, 92, 119));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la lista: ");

        CT_NombreCL.setBackground(new java.awt.Color(76, 90, 128));
        CT_NombreCL.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Programas:");

        L_ProgramasSeleccionadosCL.setModel(new DefaultListModel());
        L_ProgramasSeleccionadosCL.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                L_ProgramasSeleccionadosCLMouseClicked(evt);
            }
        });
        L_ProgramasSeleccionadosCL.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                L_ProgramasSeleccionadosCLKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(L_ProgramasSeleccionadosCL);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lista de programas ya seleccionados: ");

        BTN_GuardarLista.setBackground(new java.awt.Color(50, 56, 58));
        BTN_GuardarLista.setForeground(new java.awt.Color(255, 255, 255));
        BTN_GuardarLista.setText("Guardar lista");
        BTN_GuardarLista.setEnabled(false);
        BTN_GuardarLista.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_GuardarListaMouseClicked(evt);
            }
        });

        BTN_AgregarALista.setBackground(new java.awt.Color(50, 56, 58));
        BTN_AgregarALista.setForeground(new java.awt.Color(255, 255, 255));
        BTN_AgregarALista.setText("Agregar a lista");
        BTN_AgregarALista.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BTN_AgregarAListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_AgregarListaLayout = new javax.swing.GroupLayout(P_AgregarLista);
        P_AgregarLista.setLayout(P_AgregarListaLayout);
        P_AgregarListaLayout.setHorizontalGroup(
            P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AgregarListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AgregarListaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(CT_NombreCL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarListaLayout.createSequentialGroup()
                        .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_ProgramasCL, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(BTN_AgregarALista, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(112, 112, 112)
                        .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_GuardarLista, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        P_AgregarListaLayout.setVerticalGroup(
            P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AgregarListaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CT_NombreCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_AgregarListaLayout.createSequentialGroup()
                        .addComponent(CB_ProgramasCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_AgregarALista))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(BTN_GuardarLista)
                .addGap(24, 24, 24))
        );

        PPrincipal.addTab("Agregar ClaudiList", P_AgregarLista);

        P_MostrarLista.setBackground(new java.awt.Color(143, 173, 153));

        BTN_CargarLista.setBackground(new java.awt.Color(50, 56, 58));
        BTN_CargarLista.setForeground(new java.awt.Color(255, 255, 255));
        BTN_CargarLista.setText("Cargar una lista");
        BTN_CargarLista.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_CargarListaMouseClicked(evt);
            }
        });

        TEXT_Lista.setEditable(false);
        TEXT_Lista.setColumns(20);
        TEXT_Lista.setRows(5);
        jScrollPane3.setViewportView(TEXT_Lista);

        javax.swing.GroupLayout P_MostrarListaLayout = new javax.swing.GroupLayout(P_MostrarLista);
        P_MostrarLista.setLayout(P_MostrarListaLayout);
        P_MostrarListaLayout.setHorizontalGroup(
            P_MostrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MostrarListaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(P_MostrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_CargarLista)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        P_MostrarListaLayout.setVerticalGroup(
            P_MostrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_MostrarListaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BTN_CargarLista)
                .addGap(79, 79, 79)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        PPrincipal.addTab("Mostrar una lista", P_MostrarLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_GuardarListaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_GuardarListaMouseClicked
    {//GEN-HEADEREND:event_BTN_GuardarListaMouseClicked
        // TODO add your handling code here:
        String nombre;
        ArrayList lista = new ArrayList();
        
        if (CT_NombreCL.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Nombre no valido, ingrese un nombre");
        }
        else
        {
            nombre = CT_NombreCL.getText();
            DefaultListModel mLista = (DefaultListModel) L_ProgramasSeleccionadosCL.getModel();
            for (int i = 0; i < lista.size(); i++)            
            {
                lista.add((Programa)mLista.get(i));
            }
            
            ClaudiList CL = new ClaudiList();
            CL.setNombre(nombre);
            
            CL.setLista(lista);
            
            CL.EscribirArchivo();
        }
    }//GEN-LAST:event_BTN_GuardarListaMouseClicked

    private void L_ProgramasSeleccionadosCLKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_L_ProgramasSeleccionadosCLKeyPressed
    {//GEN-HEADEREND:event_L_ProgramasSeleccionadosCLKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_DELETE)
        {
            if (L_ProgramasSeleccionadosCL.getSelectedIndex() >= 0)
            {
                DefaultListModel mLista = (DefaultListModel) L_ProgramasSeleccionadosCL.getModel();
                mLista.remove(L_ProgramasSeleccionadosCL.getSelectedIndex());
                L_ProgramasSeleccionadosCL.setModel(mLista);
                JOptionPane.showMessageDialog(this, "Programa eliminado exitosamente de la lista");
                if (mLista.isEmpty())
                {
                    BTN_GuardarLista.setEnabled(false);
                }
                else
                {
                    BTN_GuardarLista.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_L_ProgramasSeleccionadosCLKeyPressed

    private void L_ProgramasSeleccionadosCLMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_L_ProgramasSeleccionadosCLMouseClicked
    {//GEN-HEADEREND:event_L_ProgramasSeleccionadosCLMouseClicked
        // TODO add your handling code here:
        if (L_ProgramasSeleccionadosCL.getSelectedIndex() >= 0)
        {
            if (evt.isMetaDown())
            {
                M_CD_SubMenuAggLista.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_L_ProgramasSeleccionadosCLMouseClicked

    private void CT_AñoProgramaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_CT_AñoProgramaKeyTyped
    {//GEN-HEADEREND:event_CT_AñoProgramaKeyTyped
        // TODO add your handling code here:
        char check = evt.getKeyChar();

        if (Character.isLetter(check))
        {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "No puede ingresar letras");
        }
    }//GEN-LAST:event_CT_AñoProgramaKeyTyped

    private void BTN_AgregarProgramaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_AgregarProgramaMouseClicked
    {//GEN-HEADEREND:event_BTN_AgregarProgramaMouseClicked
        // TODO add your handling code here:
        String nombre;
        int punt;
        int año;
        String tipo;
        String gen;
        
        if (CT_NombrePrograma.getText().isBlank() || CT_AñoPrograma.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan vacios, por favor rellenelos con la informacion solicitada");
        }
        else
        {
            nombre = CT_NombrePrograma.getText();
            punt = (int)SP_Puntuacion.getValue();
            año = Integer.parseInt(CT_AñoPrograma.getText());
            tipo = CB_TipoPrograma.getSelectedItem().toString();
            gen = CB_GeneroPrograma.getSelectedItem().toString();
            
            listaProgramas.add(new Programa(nombre, punt, año, tipo, gen));
            
            JOptionPane.showMessageDialog(null, "Programa agregado exitosamente");
        }
    }//GEN-LAST:event_BTN_AgregarProgramaMouseClicked

    private void PPrincipalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PPrincipalMouseClicked
    {//GEN-HEADEREND:event_PPrincipalMouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel mProg = (DefaultComboBoxModel) CB_ProgramasCL.getModel();
        
        mProg.removeAllElements();
        for (int i = 0; i < listaProgramas.size(); i++)        
        {
            mProg.addElement(listaProgramas.get(i));
        }
        
        
    }//GEN-LAST:event_PPrincipalMouseClicked

    private void BTN_AgregarAListaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BTN_AgregarAListaActionPerformed
    {//GEN-HEADEREND:event_BTN_AgregarAListaActionPerformed
        // TODO add your handling code here:
        
        if (CB_ProgramasCL.getSelectedIndex() >= 0)
        {
            String programa = CB_ProgramasCL.getSelectedItem().toString();
            DefaultListModel listProg = (DefaultListModel) L_ProgramasSeleccionadosCL.getModel();
            listProg.addElement(programa);
            L_ProgramasSeleccionadosCL.setModel(listProg);
            
            if (L_ProgramasSeleccionadosCL.getSize() == null)
            {
                BTN_GuardarLista.setEnabled(false);
            }
            else
            {
                BTN_GuardarLista.setEnabled(true);
            }
        }
    }//GEN-LAST:event_BTN_AgregarAListaActionPerformed

    private void MI_EliminarListaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MI_EliminarListaActionPerformed
    {//GEN-HEADEREND:event_MI_EliminarListaActionPerformed
        // TODO add your handling code here:
        if (L_ProgramasSeleccionadosCL.getSelectedIndex() >= 0)
        {
            DefaultListModel mLista = (DefaultListModel) L_ProgramasSeleccionadosCL.getModel();
            mLista.remove(L_ProgramasSeleccionadosCL.getSelectedIndex());
            L_ProgramasSeleccionadosCL.setModel(mLista);
            JOptionPane.showMessageDialog(this, "Programa eliminado exitosamente de la lista");
            
            if (mLista.isEmpty())
            {
                BTN_GuardarLista.setEnabled(false);
            } 
            else
            {
                BTN_GuardarLista.setEnabled(true);
            }
        }
    }//GEN-LAST:event_MI_EliminarListaActionPerformed

    private void BTN_CargarListaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_CargarListaMouseClicked
    {//GEN-HEADEREND:event_BTN_CargarListaMouseClicked
        // TODO add your handling code here:
        TEXT_Lista.setText("");
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            JFileChooser FC = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
            FC.setFileFilter(filtro);
            int seleccion = FC.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {
                fichero = FC.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                TEXT_Lista.setText("");
                while ((linea = br.readLine()) != null)
                {
                    TEXT_Lista.append(linea + "\n");
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            br.close();
            fr.close();
        }
        catch (Exception ex) {}
        
    }//GEN-LAST:event_BTN_CargarListaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_AgregarALista;
    private javax.swing.JButton BTN_AgregarPrograma;
    private javax.swing.JButton BTN_CargarLista;
    private javax.swing.JButton BTN_GuardarLista;
    private javax.swing.JComboBox<String> CB_GeneroPrograma;
    private javax.swing.JComboBox<String> CB_ProgramasCL;
    private javax.swing.JComboBox<String> CB_TipoPrograma;
    private javax.swing.JTextField CT_AñoPrograma;
    private javax.swing.JTextField CT_NombreCL;
    private javax.swing.JTextField CT_NombrePrograma;
    private javax.swing.JList<String> L_ProgramasSeleccionadosCL;
    private javax.swing.JMenuItem MI_EliminarLista;
    private javax.swing.JMenuItem MI_EliminarPrograma;
    private javax.swing.JMenuItem MI_Modificar;
    private javax.swing.JPopupMenu M_CD_SubMenuAggLista;
    private javax.swing.JPopupMenu M_CD_SubMenuListar;
    private javax.swing.JTabbedPane PPrincipal;
    private javax.swing.JPanel P_AgregarLista;
    private javax.swing.JPanel P_AgregarPrograma;
    private javax.swing.JPanel P_MostrarLista;
    private javax.swing.JSpinner SP_Puntuacion;
    private javax.swing.JTextArea TEXT_Lista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
