import java.io.IOException;
import java.util.ArrayList;

public class Teclado extends javax.swing.JFrame {

    /**
     * Creates new form Teclado
     */
    public Teclado(){
        try {
            initComponents();
            Dicionario.Dictionary.load();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_main = new javax.swing.JPanel();
        txt_display = new javax.swing.JTextField();
        lbl_mostrador = new javax.swing.JLabel();
        btn_tecla_q = new javax.swing.JButton();
        btn_tecla_w = new javax.swing.JButton();
        btn_tecla_e = new javax.swing.JButton();
        btn_tecla_r = new javax.swing.JButton();
        btn_tecla_t = new javax.swing.JButton();
        btn_tecla_y = new javax.swing.JButton();
        btn_tecla_u = new javax.swing.JButton();
        btn_tecla_i = new javax.swing.JButton();
        btn_tecla_o = new javax.swing.JButton();
        btn_tecla_p = new javax.swing.JButton();
        btn_tecla_g = new javax.swing.JButton();
        btn_tecla_h = new javax.swing.JButton();
        btn_tecla_j = new javax.swing.JButton();
        btn_tecla_k = new javax.swing.JButton();
        btn_tecla_l = new javax.swing.JButton();
        btn_tecla_a = new javax.swing.JButton();
        btn_tecla_s = new javax.swing.JButton();
        btn_tecla_d = new javax.swing.JButton();
        btn_tecla_f = new javax.swing.JButton();
        btn_tecla_z = new javax.swing.JButton();
        btn_tecla_x = new javax.swing.JButton();
        btn_tecla_c = new javax.swing.JButton();
        btn_tecla_v = new javax.swing.JButton();
        btn_tecla_b = new javax.swing.JButton();
        btn_tecla_n = new javax.swing.JButton();
        btn_tecla_m = new javax.swing.JButton();
        btn_tecla_espaco = new javax.swing.JButton();
        btn_tecla_l1 = new javax.swing.JButton();
        lbl_smile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_display.setEditable(false);

        btn_tecla_q.setText("q");
        btn_tecla_q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_qActionPerformed(evt);
            }
        });

        btn_tecla_w.setText("w");
        btn_tecla_w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_wActionPerformed(evt);
            }
        });

        btn_tecla_e.setText("e");
        btn_tecla_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_eActionPerformed(evt);
            }
        });

        btn_tecla_r.setText("r");
        btn_tecla_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_rActionPerformed(evt);
            }
        });

        btn_tecla_t.setText("t");
        btn_tecla_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_tActionPerformed(evt);
            }
        });

        btn_tecla_y.setText("y");
        btn_tecla_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_yActionPerformed(evt);
            }
        });

        btn_tecla_u.setText("u");
        btn_tecla_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_uActionPerformed(evt);
            }
        });

        btn_tecla_i.setText("i");
        btn_tecla_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_iActionPerformed(evt);
            }
        });

        btn_tecla_o.setText("o");
        btn_tecla_o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_oActionPerformed(evt);
            }
        });

        btn_tecla_p.setText("p");
        btn_tecla_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_pActionPerformed(evt);
            }
        });

        btn_tecla_g.setText("g");
        btn_tecla_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_gActionPerformed(evt);
            }
        });

        btn_tecla_h.setText("h");
        btn_tecla_h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_hActionPerformed(evt);
            }
        });

        btn_tecla_j.setText("j");
        btn_tecla_j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_jActionPerformed(evt);
            }
        });

        btn_tecla_k.setText("k");
        btn_tecla_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_kActionPerformed(evt);
            }
        });

        btn_tecla_l.setText("l");
        btn_tecla_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_lActionPerformed(evt);
            }
        });

        btn_tecla_a.setText("a");
        btn_tecla_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_aActionPerformed(evt);
            }
        });

        btn_tecla_s.setText("s");
        btn_tecla_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_sActionPerformed(evt);
            }
        });

        btn_tecla_d.setText("d");
        btn_tecla_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_dActionPerformed(evt);
            }
        });

        btn_tecla_f.setText("f");
        btn_tecla_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_fActionPerformed(evt);
            }
        });

        btn_tecla_z.setText("z");
        btn_tecla_z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_zActionPerformed(evt);
            }
        });

        btn_tecla_x.setText("x");
        btn_tecla_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_xActionPerformed(evt);
            }
        });

        btn_tecla_c.setText("c");
        btn_tecla_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_cActionPerformed(evt);
            }
        });

        btn_tecla_v.setText("v");
        btn_tecla_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_vActionPerformed(evt);
            }
        });

        btn_tecla_b.setText("b");
        btn_tecla_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_bActionPerformed(evt);
            }
        });

        btn_tecla_n.setText("n");
        btn_tecla_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_nActionPerformed(evt);
            }
        });

        btn_tecla_m.setText("m");
        btn_tecla_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_mActionPerformed(evt);
            }
        });

        btn_tecla_espaco.setText("espaço");
        btn_tecla_espaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_espacoActionPerformed(evt);
            }
        });

        btn_tecla_l1.setText("apagar");
        btn_tecla_l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tecla_l1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_mainLayout.createSequentialGroup()
                                        .addComponent(btn_tecla_q)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_w)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_e)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_r)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_t)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_y)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_u)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_i)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_o))
                                    .addGroup(pnl_mainLayout.createSequentialGroup()
                                        .addComponent(btn_tecla_a)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_s)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_d)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_f)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_g)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_h)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_j)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_k)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tecla_l)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_tecla_l1)
                                    .addGroup(pnl_mainLayout.createSequentialGroup()
                                        .addComponent(btn_tecla_p)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_smile))))
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addComponent(btn_tecla_z)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tecla_x)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tecla_c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tecla_v)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tecla_b)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tecla_n)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tecla_m)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tecla_espaco, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_mostrador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_display, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_display, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_mostrador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tecla_q)
                    .addComponent(btn_tecla_w)
                    .addComponent(btn_tecla_e)
                    .addComponent(btn_tecla_r)
                    .addComponent(btn_tecla_t)
                    .addComponent(btn_tecla_y)
                    .addComponent(btn_tecla_u)
                    .addComponent(btn_tecla_i)
                    .addComponent(btn_tecla_o)
                    .addComponent(btn_tecla_p)
                    .addComponent(lbl_smile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tecla_a)
                    .addComponent(btn_tecla_s)
                    .addComponent(btn_tecla_d)
                    .addComponent(btn_tecla_f)
                    .addComponent(btn_tecla_g)
                    .addComponent(btn_tecla_h)
                    .addComponent(btn_tecla_k)
                    .addComponent(btn_tecla_l)
                    .addComponent(btn_tecla_l1)
                    .addComponent(btn_tecla_j))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tecla_z)
                    .addComponent(btn_tecla_x)
                    .addComponent(btn_tecla_c)
                    .addComponent(btn_tecla_v)
                    .addComponent(btn_tecla_b)
                    .addComponent(btn_tecla_n)
                    .addComponent(btn_tecla_m)
                    .addComponent(btn_tecla_espaco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void searchText() {
        String ultimaPalavra = txt_display.getText().split(" ")[txt_display.getText().split(" ").length - 1];
        ArrayList words = Dicionario.Dictionary.find(ultimaPalavra + "");
        lbl_mostrador.setText("");
        if (words.size() > 0) {
            lbl_smile.setText(":)");
            int size = words.size() < 10 ? words.size() : 10;
            for (int i = 0; i < size; i++) {
                ArrayList aux = (ArrayList) words.get(i);
                lbl_mostrador.setText(lbl_mostrador.getText() + aux.get(1) + " ");
            }
        } else {
            lbl_smile.setText(":(");
            lbl_mostrador.setText("");
        }
    }

    private void btn_tecla_qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_qActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "q");
        searchText();
    }//GEN-LAST:event_btn_tecla_qActionPerformed

    private void btn_tecla_wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_wActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "w");
        searchText();
    }//GEN-LAST:event_btn_tecla_wActionPerformed

    private void btn_tecla_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_eActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "e");
        searchText();
    }//GEN-LAST:event_btn_tecla_eActionPerformed

    private void btn_tecla_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_rActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "r");
        searchText();
    }//GEN-LAST:event_btn_tecla_rActionPerformed

    private void btn_tecla_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_tActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "t");
        searchText();
    }//GEN-LAST:event_btn_tecla_tActionPerformed

    private void btn_tecla_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_yActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "y");
        searchText();
    }//GEN-LAST:event_btn_tecla_yActionPerformed

    private void btn_tecla_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_uActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "u");
        searchText();
    }//GEN-LAST:event_btn_tecla_uActionPerformed

    private void btn_tecla_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_iActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "i");
        searchText();
    }//GEN-LAST:event_btn_tecla_iActionPerformed

    private void btn_tecla_oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_oActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "o");
        searchText();
    }//GEN-LAST:event_btn_tecla_oActionPerformed

    private void btn_tecla_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_pActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "p");
        searchText();
    }//GEN-LAST:event_btn_tecla_pActionPerformed

    private void btn_tecla_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_gActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "g");
        searchText();
    }//GEN-LAST:event_btn_tecla_gActionPerformed

    private void btn_tecla_hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_hActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "h");
        searchText();
    }//GEN-LAST:event_btn_tecla_hActionPerformed

    private void btn_tecla_jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_jActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "j");
        searchText();
    }//GEN-LAST:event_btn_tecla_jActionPerformed

    private void btn_tecla_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_kActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "k");
        searchText();
    }//GEN-LAST:event_btn_tecla_kActionPerformed

    private void btn_tecla_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_lActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "l");
        searchText();
    }//GEN-LAST:event_btn_tecla_lActionPerformed

    private void btn_tecla_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_aActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "a");
        searchText();
    }//GEN-LAST:event_btn_tecla_aActionPerformed

    private void btn_tecla_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_sActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "s");
        searchText();
    }//GEN-LAST:event_btn_tecla_sActionPerformed

    private void btn_tecla_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_dActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "d");
        searchText();
    }//GEN-LAST:event_btn_tecla_dActionPerformed

    private void btn_tecla_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_fActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "f");
        searchText();
    }//GEN-LAST:event_btn_tecla_fActionPerformed

    private void btn_tecla_zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_zActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "z");
        searchText();
    }//GEN-LAST:event_btn_tecla_zActionPerformed

    private void btn_tecla_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_xActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "x");
        searchText();
    }//GEN-LAST:event_btn_tecla_xActionPerformed

    private void btn_tecla_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_cActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "c");
        searchText();
    }//GEN-LAST:event_btn_tecla_cActionPerformed

    private void btn_tecla_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_vActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "v");
        searchText();
    }//GEN-LAST:event_btn_tecla_vActionPerformed

    private void btn_tecla_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_bActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "b");
        searchText();
    }//GEN-LAST:event_btn_tecla_bActionPerformed

    private void btn_tecla_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_nActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "n");
        searchText();
    }//GEN-LAST:event_btn_tecla_nActionPerformed

    private void btn_tecla_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_mActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + "m");
        searchText();
    }//GEN-LAST:event_btn_tecla_mActionPerformed

    private void btn_tecla_l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_l1ActionPerformed
        // TODO add your handling code here:
        if (!txt_display.getText().equals("")) {
            txt_display.setText(txt_display.getText().substring(0, txt_display.getText().length() - 1));
        } else {
            txt_display.setText("");
        }
        searchText();
    }//GEN-LAST:event_btn_tecla_l1ActionPerformed

    private void btn_tecla_espacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tecla_espacoActionPerformed
        // TODO add your handling code here:
        txt_display.setText(txt_display.getText() + " ");
    }//GEN-LAST:event_btn_tecla_espacoActionPerformed

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
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teclado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tecla_a;
    private javax.swing.JButton btn_tecla_b;
    private javax.swing.JButton btn_tecla_c;
    private javax.swing.JButton btn_tecla_d;
    private javax.swing.JButton btn_tecla_e;
    private javax.swing.JButton btn_tecla_espaco;
    private javax.swing.JButton btn_tecla_f;
    private javax.swing.JButton btn_tecla_g;
    private javax.swing.JButton btn_tecla_h;
    private javax.swing.JButton btn_tecla_i;
    private javax.swing.JButton btn_tecla_j;
    private javax.swing.JButton btn_tecla_k;
    private javax.swing.JButton btn_tecla_l;
    private javax.swing.JButton btn_tecla_l1;
    private javax.swing.JButton btn_tecla_m;
    private javax.swing.JButton btn_tecla_n;
    private javax.swing.JButton btn_tecla_o;
    private javax.swing.JButton btn_tecla_p;
    private javax.swing.JButton btn_tecla_q;
    private javax.swing.JButton btn_tecla_r;
    private javax.swing.JButton btn_tecla_s;
    private javax.swing.JButton btn_tecla_t;
    private javax.swing.JButton btn_tecla_u;
    private javax.swing.JButton btn_tecla_v;
    private javax.swing.JButton btn_tecla_w;
    private javax.swing.JButton btn_tecla_x;
    private javax.swing.JButton btn_tecla_y;
    private javax.swing.JButton btn_tecla_z;
    private javax.swing.JLabel lbl_mostrador;
    private javax.swing.JLabel lbl_smile;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JTextField txt_display;
    // End of variables declaration//GEN-END:variables
}
