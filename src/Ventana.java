/**
 *
 * @author Lucas
 */
import javax.swing.*; // Da acceso a características de Swing

public class Ventana extends javax.swing.JFrame {

    private String valor; // Indica si el turno es de "X" o de "O"
    private int turno; // Cuenta turnos
    
    // Constructor de la clase Ventana
    public Ventana() {
        valor = "X"; // Jugador "X" empieza la partida
        turno = 0; // Pone a cero el cuenta turnos
        initComponents(); // Llamada al método que construye la ventana (a continuación)
    } // Fin de constructor de la clase Ventana

    // DESDE AQUÍ CÓDIGO GENERADO AUTOMÁTICAMENTE
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ta Te Ti");
        setBounds(new java.awt.Rectangle(0, 0, 640, 480));

        btn2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn2.setActionCommand("btn2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn1.setToolTipText("");
        btn1.setActionCommand("btn1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn3.setActionCommand("btn3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn4.setActionCommand("btn4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn7.setActionCommand("btn7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn5.setActionCommand("btn5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn6.setActionCommand("btn6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn8.setActionCommand("btn8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn9.setActionCommand("btn9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        mensaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mensaje.setForeground(new java.awt.Color(0, 0, 255));
        mensaje.setText("Juega X");

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setText("Nuevo juego");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnNuevo)
                    .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Métodos que se complementan con los ActionListener generados automáticamente arriba,
    y que hacen funcionar los botones. Las lineas en GRIS fueron añadidas automáticamente    */
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.turno(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        this.turno(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        this.turno(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        this.turno(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        this.turno(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        this.turno(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        this.turno(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        this.turno(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        this.turno(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Reinicia el juego
        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
        mensaje.setText("Juega X");
        mensaje.setForeground(new java.awt.Color(0, 0, 255));
        setTurno(0);
        setValor("X");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose(); // Cierra la ventana
    }//GEN-LAST:event_btnSalirActionPerformed

    // FIN DE CÓDIGO GENERADO AUTOMÁTICAMENTE

    // Método turno
    private void turno(JButton btn) {
        
        // Cuando es el turno de X, ejecuta el "if", cuando es de O, ejecuta el "else"
        if(this.valor.compareToIgnoreCase("X")==0) {
            btn.setText("X"); // Jugador X coloca un X en el botón elegido
            this.valor="O"; // El turno pasa a ser de O
            mensaje.setText("Juega O"); // Muestra en pantalla que es el turno de O
            mensaje.setForeground(new java.awt.Color(255, 0, 0));
        } else {
            btn.setText("O"); // Jugador O coloca un O en el botón elegido
            this.valor="X"; // El turno pasa a ser de X
            mensaje.setText("Juega X"); // Muestra en pantalla que es el turno de X
            mensaje.setForeground(new java.awt.Color(0, 0, 255));
        }
        
        btn.setEnabled(false); // Cada vez que X u O haga clic en un botón, este se inhabilita
        turno++; // Agrega 1 al cuenta turnos
        this.detectarLinea(); // Llamada al método que detecta si hay una línea de tres
        
    } // Fin método turno
    
    // Método detectar línea
    private void detectarLinea() {
        
        // 9 posibilidades: tres filas, tres columnas, dos diagonales
        if(
            ((btn1.getText() == "X") && (btn2.getText() == "X") && (btn3.getText() == "X")) ||
            ((btn4.getText() == "X") && (btn5.getText() == "X") && (btn6.getText() == "X")) ||
            ((btn7.getText() == "X") && (btn8.getText() == "X") && (btn9.getText() == "X")) ||
            ((btn1.getText() == "X") && (btn4.getText() == "X") && (btn7.getText() == "X")) ||
            ((btn2.getText() == "X") && (btn5.getText() == "X") && (btn8.getText() == "X")) ||
            ((btn3.getText() == "X") && (btn6.getText() == "X") && (btn9.getText() == "X")) ||
            ((btn1.getText() == "X") && (btn5.getText() == "X") && (btn9.getText() == "X")) ||
            ((btn3.getText() == "X") && (btn5.getText() == "X") && (btn7.getText() == "X"))           
        ) {
        mensaje.setText("Jugador X ha ganado"); // Muestra en pantalla que Jugador X ha ganado
        mensaje.setForeground(new java.awt.Color(0, 0, 255));
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        } else if(
            ((btn1.getText() == "O") && (btn2.getText() == "O") && (btn3.getText() == "O")) ||
            ((btn4.getText() == "O") && (btn5.getText() == "O") && (btn6.getText() == "O")) ||
            ((btn7.getText() == "O") && (btn8.getText() == "O") && (btn9.getText() == "O")) ||
            ((btn1.getText() == "O") && (btn4.getText() == "O") && (btn7.getText() == "O")) ||
            ((btn2.getText() == "O") && (btn5.getText() == "O") && (btn8.getText() == "O")) ||
            ((btn3.getText() == "O") && (btn6.getText() == "O") && (btn9.getText() == "O")) ||
            ((btn1.getText() == "O") && (btn5.getText() == "O") && (btn9.getText() == "O")) ||
            ((btn3.getText() == "O") && (btn5.getText() == "O") && (btn7.getText() == "O")) 
            ) {
        mensaje.setText("Jugador O ha ganado"); // Muestra en pantalla que Jugador O ha ganado
        mensaje.setForeground(new java.awt.Color(255, 0, 0));
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        } else if (getTurno() == 9) {
        mensaje.setText("Juego empatado");
        mensaje.setForeground(new java.awt.Color(128, 0, 128));
        } // Fin if
    } // Fin método detectar línea
    
    // Getter para el cuenta turnos, se usa para determinar empate
    public int getTurno() {
        return turno;
    }
    
    // Setter para el cuenta turnos, permite reiniciarlo al pulsar nuevo turno
    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    // Setter para el indicador de turno, para poder ser puesto en X al pulsar nuevo turno
    public void setValor(String valor) {
        this.valor = valor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables
} // FIN CLASE VENTANA
