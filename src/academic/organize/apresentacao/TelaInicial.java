
package academic.organize.apresentacao;

public class TelaInicial extends javax.swing.JDialog {

   
    public TelaInicial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastra = new javax.swing.JMenu();
        jMenuItemProfessor = new javax.swing.JMenuItem();
        jMenuItemAuno = new javax.swing.JMenuItem();
        jMenuItemFaltas = new javax.swing.JMenuItem();
        jMenuItemQuestoes = new javax.swing.JMenuItem();
        jMenuItemNotas = new javax.swing.JMenuItem();
        jMenuListar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemAlunos = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuEditarCadastros = new javax.swing.JMenu();
        jMenuItemProfessores = new javax.swing.JMenuItem();
        jMenuItemAllunos = new javax.swing.JMenuItem();
        jMenuItemfaltasEditar = new javax.swing.JMenuItem();
        jMenuItemQuestoesEditar = new javax.swing.JMenuItem();
        jMenuItemNotasEditar = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela principal");
        setName("dialogTelaInicial"); // NOI18N

        jMenuCadastra.setBackground(java.awt.SystemColor.controlLtHighlight);
        jMenuCadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jMenuCadastra.setText("Cadastra");
        jMenuCadastra.setToolTipText("Cadastra as professores alunos é questões");
        jMenuCadastra.setName("cadastra"); // NOI18N

        jMenuItemProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jMenuItemProfessor.setText("professor");
        jMenuItemProfessor.setToolTipText("Cadastra professores");
        jMenuItemProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItemProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfessorActionPerformed(evt);
            }
        });
        jMenuCadastra.add(jMenuItemProfessor);

        jMenuItemAuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jMenuItemAuno.setText("Aluno");
        jMenuItemAuno.setToolTipText("Cadastra alunos");
        jMenuCadastra.add(jMenuItemAuno);

        jMenuItemFaltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jMenuItemFaltas.setText("Faltas");
        jMenuCadastra.add(jMenuItemFaltas);

        jMenuItemQuestoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jMenuItemQuestoes.setText("Questões");
        jMenuItemQuestoes.setToolTipText("Cadastra questões ");
        jMenuItemQuestoes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_mode_edit_black_18dp_1x.png"))); // NOI18N
        jMenuCadastra.add(jMenuItemQuestoes);

        jMenuItemNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_person_add_black_16dp_1x.png"))); // NOI18N
        jMenuItemNotas.setText("Notas");
        jMenuCadastra.add(jMenuItemNotas);

        jMenuBarPrincipal.add(jMenuCadastra);

        jMenuListar.setText("listar");
        jMenuListar.setToolTipText("listar, ativos do sistema");
        jMenuListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuListarMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Professores");
        jMenuItem1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 1, true));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuListar.add(jMenuItem1);
        jMenuItem1.getAccessibleContext().setAccessibleDescription("Listar todos os professores cadastrados no sistema");

        jMenuItemAlunos.setText("Alunos");
        jMenuListar.add(jMenuItemAlunos);

        jMenuItem3.setText("Questões");
        jMenuListar.add(jMenuItem3);

        jMenuBarPrincipal.add(jMenuListar);
        jMenuListar.getAccessibleContext().setAccessibleDescription("");

        jMenuEditarCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_mode_edit_black_18dp_1x.png"))); // NOI18N
        jMenuEditarCadastros.setText("Editar cadastros");
        jMenuEditarCadastros.setToolTipText("");

        jMenuItemProfessores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_mode_edit_black_18dp_1x.png"))); // NOI18N
        jMenuItemProfessores.setText("Professores");
        jMenuEditarCadastros.add(jMenuItemProfessores);

        jMenuItemAllunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_mode_edit_black_18dp_1x.png"))); // NOI18N
        jMenuItemAllunos.setText("Alunos");
        jMenuEditarCadastros.add(jMenuItemAllunos);

        jMenuItemfaltasEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_mode_edit_black_18dp_1x.png"))); // NOI18N
        jMenuItemfaltasEditar.setText("Faltas");
        jMenuEditarCadastros.add(jMenuItemfaltasEditar);

        jMenuItemQuestoesEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_mode_edit_black_18dp_1x.png"))); // NOI18N
        jMenuItemQuestoesEditar.setText("Questões");
        jMenuItemQuestoesEditar.setToolTipText("Editar as questoes já cadastradas no sistema");
        jMenuItemQuestoesEditar.setName("Questões"); // NOI18N
        jMenuEditarCadastros.add(jMenuItemQuestoesEditar);
        jMenuItemQuestoesEditar.getAccessibleContext().setAccessibleDescription("");
        jMenuItemQuestoesEditar.getAccessibleContext().setAccessibleParent(null);

        jMenuItemNotasEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic/organize/imagens/ic_mode_edit_black_18dp_1x.png"))); // NOI18N
        jMenuItemNotasEditar.setText("Notas");
        jMenuItemNotasEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuEditarCadastros.add(jMenuItemNotasEditar);

        jMenuBarPrincipal.add(jMenuEditarCadastros);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemProfessorActionPerformed

    private void jMenuListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuListarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuListarMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastra;
    private javax.swing.JMenu jMenuEditarCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemAllunos;
    private javax.swing.JMenuItem jMenuItemAlunos;
    private javax.swing.JMenuItem jMenuItemAuno;
    private javax.swing.JMenuItem jMenuItemFaltas;
    private javax.swing.JMenuItem jMenuItemNotas;
    private javax.swing.JMenuItem jMenuItemNotasEditar;
    private javax.swing.JMenuItem jMenuItemProfessor;
    private javax.swing.JMenuItem jMenuItemProfessores;
    private javax.swing.JMenuItem jMenuItemQuestoes;
    private javax.swing.JMenuItem jMenuItemQuestoesEditar;
    private javax.swing.JMenuItem jMenuItemfaltasEditar;
    private javax.swing.JMenu jMenuListar;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
