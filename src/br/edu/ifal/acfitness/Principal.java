/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifal.acfitness;

/**
 *
 * @author victor
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelTrainer = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTrainers = new javax.swing.JTable();
        panelAtividade = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAtividades = new javax.swing.JTable();
        panelExercicio = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableExercicios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bem vindo ao AC Fitness");

        jButton2.setText("Novo Trainer");

        tableTrainers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Peso", "CPF"
            }
        ));
        jScrollPane1.setViewportView(tableTrainers);

        javax.swing.GroupLayout panelTrainerLayout = new javax.swing.GroupLayout(panelTrainer);
        panelTrainer.setLayout(panelTrainerLayout);
        panelTrainerLayout.setHorizontalGroup(
            panelTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addGroup(panelTrainerLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTrainerLayout.setVerticalGroup(
            panelTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrainerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trainers", panelTrainer);

        tableAtividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titulo", "Tempo Minimo", "Classificacao"
            }
        ));
        jScrollPane2.setViewportView(tableAtividades);

        javax.swing.GroupLayout panelAtividadeLayout = new javax.swing.GroupLayout(panelAtividade);
        panelAtividade.setLayout(panelAtividadeLayout);
        panelAtividadeLayout.setHorizontalGroup(
            panelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(panelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtividadeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelAtividadeLayout.setVerticalGroup(
            panelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(panelAtividadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAtividadeLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Atividades", panelAtividade);
        panelAtividade.getAccessibleContext().setAccessibleName("");

        tableExercicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Descricao", "Tempo Medio", "Perca Calorica"
            }
        ));
        jScrollPane3.setViewportView(tableExercicios);

        javax.swing.GroupLayout panelExercicioLayout = new javax.swing.GroupLayout(panelExercicio);
        panelExercicio.setLayout(panelExercicioLayout);
        panelExercicioLayout.setHorizontalGroup(
            panelExercicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(panelExercicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelExercicioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelExercicioLayout.setVerticalGroup(
            panelExercicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(panelExercicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelExercicioLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Exercicios", panelExercicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Trainers");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelAtividade;
    private javax.swing.JPanel panelExercicio;
    private javax.swing.JPanel panelTrainer;
    private javax.swing.JTable tableAtividades;
    private javax.swing.JTable tableExercicios;
    private javax.swing.JTable tableTrainers;
    // End of variables declaration//GEN-END:variables
}
