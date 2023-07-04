/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import Frames.Muambarr;
import javax.swing.JTable;

public class Muambarr extends javax.swing.JFrame {

    public Muambarr() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbMenuMuambar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNomeAfiliado = new javax.swing.JTextField();
        jbRealizarMuamba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(71, 71, 71));
        jPanel2.setForeground(new java.awt.Color(60, 63, 65));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/unnamed (3).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MUAMBA SOLUTIONS");

        jbMenuMuambar.setBackground(new java.awt.Color(51, 51, 51));
        jbMenuMuambar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jbMenuMuambar.setText("< Menu Inicial");
        jbMenuMuambar.setBorder(null);
        jbMenuMuambar.setBorderPainted(false);
        jbMenuMuambar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMenuMuambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuMuambarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbMenuMuambar)
                .addGap(88, 88, 88))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbMenuMuambar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setText("REALIZAR COMÉRCIO PARALELO INTERNACIONAL");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Nome do Afiliado");

        jbRealizarMuamba.setBackground(new java.awt.Color(0, 131, 7));
        jbRealizarMuamba.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jbRealizarMuamba.setForeground(new java.awt.Color(255, 255, 255));
        jbRealizarMuamba.setText("Realizar Serviço");
        jbRealizarMuamba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRealizarMuamba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizarMuambaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfNomeAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel3)))
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbRealizarMuamba, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(481, 481, 481))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(jbRealizarMuamba, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbMenuMuambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuMuambarActionPerformed
        MuambaSolution muamS = new MuambaSolution();
        this.dispose();
        muamS.setVisible(true);
    }//GEN-LAST:event_jbMenuMuambarActionPerformed

    private void jbRealizarMuambaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizarMuambaActionPerformed
        realizarMuamba();
    }//GEN-LAST:event_jbRealizarMuambaActionPerformed
    private boolean verificarDetencao(String nomeAfiliado) {
        try {
            FileReader reader = new FileReader("dados.txt");
            Gson gson = new Gson();
            JsonArray pessoasArray = gson.fromJson(reader, JsonArray.class);

            for (JsonElement jsonElement : pessoasArray) {
                JsonObject pessoaObject = jsonElement.getAsJsonObject();
                String nome = pessoaObject.get("nome").getAsString();
                boolean statusDetencao = pessoaObject.get("statusDetencao").getAsBoolean();

                if (nome.equals(nomeAfiliado)) {
                    if (statusDetencao) {
                        reader.close();
                        return true; // Trabalhador está detido
                    }
                    break;
                }
            }

            reader.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo de dados não encontrado.");
            return false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo de dados.");
            return false;
        }

        return false; // Trabalhador não está detido
    }

    private void realizarMuamba() {
        String nomeAfiliado = tfNomeAfiliado.getText();

        // Verifica se o nome do afiliado está vazio
        if (nomeAfiliado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome do afiliado.");
            return;
        }

        // Verifica se o trabalhador está detido
        if (verificarDetencao(nomeAfiliado)) {
            JOptionPane.showMessageDialog(null, "Trabalhador já está detido. Não pode realizar a muamba.");
            return;
        }

        boolean muambaCancelada = false;

        try {
            FileReader reader = new FileReader("dados.txt");

            Gson gson = new Gson();
            JsonArray pessoasArray = gson.fromJson(reader, JsonArray.class);

            for (JsonElement jsonElement : pessoasArray) {
                JsonObject pessoaObject = jsonElement.getAsJsonObject();

                String tipo = pessoaObject.get("tipo").getAsString();
                String nome = pessoaObject.get("nome").getAsString();
                boolean statusDetencao = pessoaObject.get("statusDetencao").getAsBoolean();

                if (nome.equals(nomeAfiliado)) {
                    if (statusDetencao) {
                        JOptionPane.showMessageDialog(null, "Trabalhador já está detido. Não pode realizar a muamba.");
                        reader.close();
                        return;
                    }

                    if (tipo.equals("Funcionario")) {
                        double chanceDetencao = 0.2;
                        if (Math.random() <= chanceDetencao) {
                            pessoaObject.addProperty("statusDetencao", true);
                            muambaCancelada = true;
                            break;
                        }
                    } else if (tipo.equals("Estagiario")) {
                        double chanceDetencao = 0.5;
                        if (Math.random() <= chanceDetencao) {
                            pessoaObject.addProperty("statusDetencao", true);
                            muambaCancelada = true;
                            break;
                        }
                    }
                }
            }

            reader.close();

            if (muambaCancelada) {
                FileWriter fileWriter = new FileWriter("dados.txt");
                gson.toJson(pessoasArray, fileWriter);
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "Muamba cancelada. Trabalhador detido pela polícia.");
            } else {
                Produtoss produtoss = new Produtoss();
                JTable tabelaProdutos = produtoss.getTabelaProdutos();
                Muambarr muambarr = new Muambarr();
                muambarr.popularTabelaProdutos(tabelaProdutos);
                JOptionPane.showMessageDialog(null, "Muamba realizada com sucesso.");
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo de dados não encontrado.");
            return;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo de dados.");
            return;
        }
    }

    public void popularTabelaProdutos(JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        Random random = new Random();

        for (int i = 0; i < model.getRowCount(); i++) {
            String quantidadeAtualStr = (String) model.getValueAt(i, 1);
            int quantidadeAtual = Integer.parseInt(quantidadeAtualStr);
            int quantidadeGerada = random.nextInt(11);
            int novaQuantidade = quantidadeAtual + quantidadeGerada;
            String novaQuantidadeStr = String.valueOf(novaQuantidade);
            model.setValueAt(novaQuantidadeStr, i, 1);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbMenuMuambar;
    private javax.swing.JButton jbRealizarMuamba;
    private javax.swing.JTextField tfNomeAfiliado;
    // End of variables declaration//GEN-END:variables
}
