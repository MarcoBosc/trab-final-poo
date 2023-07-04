/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Trabalhadores.Estagiario;
import Trabalhadores.Funcionario;
import java.util.List; // Correção da importação
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.table.DefaultTableModel;
import Trabalhadores.Funcionario;
import Trabalhadores.Pessoa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Muambeiros extends javax.swing.JFrame {

    /**
     * Creates new form Muambeiros
     */
    public Muambeiros() {
        initComponents();
        carregarDadosDaTabela();
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tabelaMuam.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) tabelaMuam.getModel();
                    String registro = (String) model.getValueAt(selectedRow, 6); // Obtém o registro da linha selecionada

                    model.removeRow(selectedRow); // Remove a linha da tabela

                    removerRegistroDoArquivo(registro); // Remove o registro correspondente do arquivo
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRemove = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfSexo = new javax.swing.JTextField();
        tfIdade = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfAltura = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfRegistro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMuam = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(71, 71, 71));
        jPanel2.setForeground(new java.awt.Color(60, 63, 65));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/unnamed (3).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MUAMBA SOLUTIONS");

        jbMenu.setBackground(new java.awt.Color(51, 51, 51));
        jbMenu.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jbMenu.setText("< Menu Inicial");
        jbMenu.setBorder(null);
        jbMenu.setBorderPainted(false);
        jbMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuActionPerformed(evt);
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
                .addComponent(jbMenu)
                .addGap(77, 77, 77))
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
                .addComponent(jbMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnRemove.setBackground(new java.awt.Color(204, 0, 0));
        btnRemove.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remover");
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfSexo.setBackground(new java.awt.Color(102, 102, 102));
        tfSexo.setForeground(new java.awt.Color(255, 255, 255));
        tfSexo.setSelectionColor(new java.awt.Color(0, 0, 0));

        tfIdade.setBackground(new java.awt.Color(102, 102, 102));
        tfIdade.setForeground(new java.awt.Color(255, 255, 255));
        tfIdade.setSelectionColor(new java.awt.Color(0, 0, 0));

        tfEndereco.setBackground(new java.awt.Color(102, 102, 102));
        tfEndereco.setForeground(new java.awt.Color(255, 255, 255));
        tfEndereco.setSelectionColor(new java.awt.Color(0, 0, 0));

        tfAltura.setBackground(new java.awt.Color(102, 102, 102));
        tfAltura.setForeground(new java.awt.Color(255, 255, 255));
        tfAltura.setSelectionColor(new java.awt.Color(0, 0, 0));

        tfSalario.setBackground(new java.awt.Color(102, 102, 102));
        tfSalario.setForeground(new java.awt.Color(255, 255, 255));
        tfSalario.setSelectionColor(new java.awt.Color(0, 0, 0));

        tfTelefone.setBackground(new java.awt.Color(102, 102, 102));
        tfTelefone.setForeground(new java.awt.Color(255, 255, 255));
        tfTelefone.setSelectionColor(new java.awt.Color(0, 0, 0));

        tfRegistro.setBackground(new java.awt.Color(102, 102, 102));
        tfRegistro.setForeground(new java.awt.Color(255, 255, 255));
        tfRegistro.setSelectionColor(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Nome Completo");

        jLabel4.setText("Sexo");

        jLabel5.setText("Idade");

        jLabel6.setText("Endereço");

        jLabel7.setText("Registro");

        jLabel8.setText("Altura");

        jLabel9.setText("Telefone");

        jLabel10.setText("Salario por Muamba");

        tfNome.setBackground(new java.awt.Color(102, 102, 102));
        tfNome.setForeground(new java.awt.Color(255, 255, 255));
        tfNome.setSelectionColor(new java.awt.Color(0, 0, 0));

        tabelaMuam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Completo", "Preso?", "Idade", "Sexo", "Altura", "Telefone", "Nº de Regristro", "Salário", "Endereço"
            }
        ));
        tabelaMuam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMuamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMuam);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(178, 178, 178))
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
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuActionPerformed
        MuambaSolution muamS = new MuambaSolution();
        this.dispose();
        muamS.setVisible(true);
    }//GEN-LAST:event_jbMenuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        salvarDadosNaTabela();
        salvarDadosEmArquivo("dados.txt");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelaMuamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMuamMouseClicked

    }//GEN-LAST:event_tabelaMuamMouseClicked

    private void removerRegistroDoArquivo(String registro) {
        try {
            List<Pessoa> pessoas = new ArrayList<>();
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("dados.txt"));

            try {
                while (true) {
                    Pessoa pessoa = (Pessoa) inputStream.readObject();

                    if (pessoa instanceof Funcionario) {
                        Funcionario funcionario = (Funcionario) pessoa;
                        if (!funcionario.getRegistro().equals(registro)) {
                            pessoas.add(funcionario); // Adiciona ao novo conjunto de pessoas apenas se o registro for diferente
                        }
                    } else if (pessoa instanceof Estagiario) {
                        Estagiario estagiario = (Estagiario) pessoa;
                        if (!estagiario.getRegistro().equals(registro)) {
                            pessoas.add(estagiario); // Adiciona ao novo conjunto de pessoas apenas se o registro for diferente
                        }
                    }
                }
            } catch (EOFException e) {
                // Fim do arquivo
            } finally {
                inputStream.close();
            }

            // Reescreve o arquivo com o novo conjunto de pessoas
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("dados.txt"));
            for (Pessoa pessoa : pessoas) {
                outputStream.writeObject(pessoa);
            }
            outputStream.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo de dados não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro ao ler ou escrever o arquivo de dados: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao ler ou escrever o arquivo de dados.");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Classe não encontrada.");
        }
    }

    private void salvarDadosEmArquivo(String nomeArquivo) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            DefaultTableModel model = (DefaultTableModel) tabelaMuam.getModel();
            int rowCount = model.getRowCount();

            List<Pessoa> pessoas = new ArrayList<>();

            for (int i = 0; i < rowCount; i++) {
                String nome = (String) model.getValueAt(i, 0);
                int idade = (int) model.getValueAt(i, 1);
                String endereco = (String) model.getValueAt(i, 2);
                String sexo = (String) model.getValueAt(i, 3);
                double altura = (double) model.getValueAt(i, 4);
                String telefone = (String) model.getValueAt(i, 5);
                String registro = (String) model.getValueAt(i, 6);
                double salario = (double) model.getValueAt(i, 7);

                int registroInt;
                try {
                    registroInt = Integer.parseInt(registro);
                } catch (NumberFormatException e) {
                    registroInt = Integer.MAX_VALUE;
                }

                int limiteRegistroEstagiario = 25;

                if (registroInt <= limiteRegistroEstagiario) {
                    Funcionario funcionario = new Funcionario(nome, idade, endereco, sexo, altura, telefone, registro, salario, false);
                    pessoas.add(funcionario);
                } else {
                    Estagiario estagiario = new Estagiario(nome, idade, endereco, sexo, altura, telefone, registro, salario, false);
                    pessoas.add(estagiario);
                }
            }

            JsonArray pessoasArray = new JsonArray();

            for (Pessoa pessoa : pessoas) {
                JsonObject pessoaObject = new JsonObject();
                pessoaObject.addProperty("nome", pessoa.getNome());
                pessoaObject.addProperty("idade", pessoa.getIdade());
                pessoaObject.addProperty("endereco", pessoa.getEndereco());
                pessoaObject.addProperty("sexo", pessoa.getSexo());
                pessoaObject.addProperty("altura", pessoa.getAltura());
                pessoaObject.addProperty("telefone", pessoa.getTelefone());

                if (pessoa instanceof Funcionario) {
                    Funcionario funcionario = (Funcionario) pessoa;
                    pessoaObject.addProperty("registro", funcionario.getRegistro());
                    pessoaObject.addProperty("salario", funcionario.getSalario());
                    pessoaObject.addProperty("statusDetencao", funcionario.getStatusDetencao());
                    pessoaObject.addProperty("tipo", "Funcionario");
                } else if (pessoa instanceof Estagiario) {
                    Estagiario estagiario = (Estagiario) pessoa;
                    pessoaObject.addProperty("registro", estagiario.getRegistro());
                    pessoaObject.addProperty("salario", estagiario.getSalario());
                    pessoaObject.addProperty("statusDetencao", estagiario.getStatusDetencao());
                    pessoaObject.addProperty("tipo", "Estagiario");
                }

                pessoasArray.add(pessoaObject);
            }

            String json = gson.toJson(pessoasArray);

            FileWriter fileWriter = new FileWriter(nomeArquivo);
            fileWriter.write(json);
            fileWriter.close();

            System.out.println("Dados salvos em arquivo JSON com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados em arquivo: " + e.getMessage());
        }
    }

    private void salvarDadosNaTabela() {
        String nome = tfNome.getText();
        int idade = Integer.parseInt(tfIdade.getText());
        String endereco = tfEndereco.getText();
        String sexo = tfSexo.getText();
        double altura = Double.parseDouble(tfAltura.getText());
        String telefone = tfTelefone.getText();
        String registro = tfRegistro.getText();
        double salario = Double.parseDouble(tfSalario.getText());

        if (registro.length() < 25) {
            Estagiario estagiario = new Estagiario(nome, idade, endereco, sexo, altura, telefone, registro, salario, false);
            DefaultTableModel model = (DefaultTableModel) tabelaMuam.getModel();
            model.addRow(new Object[]{estagiario.getNome(), estagiario.getIdade(), estagiario.getEndereco(), estagiario.getSexo(),
                estagiario.getAltura(), estagiario.getTelefone(), estagiario.getRegistro(), estagiario.getSalario()});
        } else {
            Funcionario funcionario = new Funcionario(nome, idade, endereco, sexo, altura, telefone, registro, salario, false);
            DefaultTableModel model = (DefaultTableModel) tabelaMuam.getModel();
            model.addRow(new Object[]{funcionario.getNome(), funcionario.getIdade(), funcionario.getEndereco(), funcionario.getSexo(),
                funcionario.getAltura(), funcionario.getTelefone(), funcionario.getRegistro(), funcionario.getSalario()});
        }

        // Limpe os campos de texto após salvar na tabela
        tfNome.setText("");
        tfIdade.setText("");
        tfEndereco.setText("");
        tfSexo.setText("");
        tfAltura.setText("");
        tfTelefone.setText("");
        tfRegistro.setText("");
        tfSalario.setText("");
    }

    private void carregarDadosDaTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelaMuam.getModel();
        model.setRowCount(0);

        try {
            FileReader reader = new FileReader("dados.txt");

            Gson gson = new Gson();
            JsonArray pessoasArray = gson.fromJson(reader, JsonArray.class);

            for (JsonElement jsonElement : pessoasArray) {
                JsonObject pessoaObject = jsonElement.getAsJsonObject();

                String nome = pessoaObject.get("nome").getAsString();
                int idade = pessoaObject.get("idade").getAsInt();
                String endereco = pessoaObject.get("endereco").getAsString();
                String sexo = pessoaObject.get("sexo").getAsString();
                double altura = pessoaObject.get("altura").getAsDouble();
                String telefone = pessoaObject.get("telefone").getAsString();
                String registro = pessoaObject.get("registro").getAsString();
                double salario = pessoaObject.get("salario").getAsDouble();

                if (pessoaObject.has("tipo")) {
                    String tipo = pessoaObject.get("tipo").getAsString();

                    if (tipo.equals("Funcionario")) {
                        Funcionario funcionario = new Funcionario(nome, idade, endereco, sexo, altura, telefone, registro, salario, false);
                        Object[] rowData = {
                            funcionario.getNome(),
                            funcionario.getIdade(),
                            funcionario.getEndereco(),
                            funcionario.getSexo(),
                            funcionario.getAltura(),
                            funcionario.getTelefone(),
                            funcionario.getRegistro(),
                            funcionario.getSalario()
                        };
                        model.addRow(rowData);
                    } else if (tipo.equals("Estagiario")) {
                        double bolsa = pessoaObject.get("bolsa").getAsDouble();
                        int horasServico = pessoaObject.get("horasServico").getAsInt();

                        Estagiario estagiario = new Estagiario(nome, idade, endereco, sexo, altura, telefone, registro, salario, false);
                        Object[] rowData = {
                            estagiario.getNome(),
                            estagiario.getIdade(),
                            estagiario.getEndereco(),
                            estagiario.getSexo(),
                            estagiario.getAltura(),
                            estagiario.getTelefone(),
                            estagiario.getRegistro(),
                            estagiario.getSalario()
                        };
                        model.addRow(rowData);
                    }
                }
            }

            reader.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo de dados.");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbMenu;
    private javax.swing.JTable tabelaMuam;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRegistro;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfSexo;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
