/**
 * CalculadoraGUI
 * Interfaz gráfica de la calculadora.
 */
package vista;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import modelo.Operando;
import modelo.calculadora.Calculadora;
import modelo.calculadora.estados.MostrandoResultado;
import modelo.operacionesBinarias.*;
import modelo.operacionesUnarias.*;

/**
 * @author Eduardo Mosqueira Rey
 */
public class CalculadoraGUI extends javax.swing.JFrame {

    private boolean esCeroInicial = true;
    private boolean mostrandoError = false;
    private final String iconPath = "/resources/calc.png";
    private final Calculadora c;

    /**
     * Creates new form CalculadoraGUI
     */
    public CalculadoraGUI() {
        c = new Calculadora();
        initComponents();
        Image image = new ImageIcon(getClass().getResource(iconPath)).getImage();
        setIconImage(image);
    }

    private void limpiarPantalla() {
        jTextFieldPantalla.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPantalla = new javax.swing.JTextField();
        jButtonMasMenos = new javax.swing.JButton();
        jButtonSQR = new javax.swing.JButton();
        jButtonSQRT = new javax.swing.JButton();
        jButton1DivX = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonAC = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonMult = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonMas = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonPunto = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonMenos = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jLabelMemoria = new javax.swing.JLabel();
        jButtonMR = new javax.swing.JButton();
        jButtonMS = new javax.swing.JButton();
        jButtonMC = new javax.swing.JButton();
        jButtonMplus = new javax.swing.JButton();
        jButtonMminus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        jTextFieldPantalla.setEditable(false);
        jTextFieldPantalla.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldPantalla.setText("0");

        jButtonMasMenos.setText("+ / -");
        jButtonMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasMenosActionPerformed(evt);
            }
        });

        jButtonSQR.setText("SQR");
        jButtonSQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSQRActionPerformed(evt);
            }
        });

        jButtonSQRT.setText("SQRT");
        jButtonSQRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSQRTActionPerformed(evt);
            }
        });

        jButton1DivX.setText("1 / X");
        jButton1DivX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DivXActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonAC.setText("AC");
        jButtonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonACActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonMult.setText("*");
        jButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonMas.setText("+");
        jButtonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonPunto.setText(".");
        jButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoActionPerformed(evt);
            }
        });

        jButtonDiv.setText("/");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButtonMenos.setText("-");
        jButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosActionPerformed(evt);
            }
        });

        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonMR.setText("MR");
        jButtonMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMRActionPerformed(evt);
            }
        });

        jButtonMS.setText("MS");
        jButtonMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMSActionPerformed(evt);
            }
        });

        jButtonMC.setText("MC");
        jButtonMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMCActionPerformed(evt);
            }
        });

        jButtonMplus.setText("M+");
        jButtonMplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMplusActionPerformed(evt);
            }
        });

        jButtonMminus.setText("M-");
        jButtonMminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMminusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPantalla, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonMasMenos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSQR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSQRT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1DivX)))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                    .addComponent(jButton0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonPunto, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonMult, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonDiv, 0, 1, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonAC, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonMas, 0, 1, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addGap(25, 25, 25))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonMR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMplus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMminus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMemoria)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1DivX, jButtonMasMenos, jButtonSQR, jButtonSQRT});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonAC, jButtonC, jButtonDiv, jButtonIgual, jButtonMas, jButtonMenos, jButtonMult, jButtonPunto});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonMC, jButtonMR, jButtonMS, jButtonMminus, jButtonMplus});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMasMenos)
                    .addComponent(jButtonSQR)
                    .addComponent(jButtonSQRT)
                    .addComponent(jButton1DivX))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMemoria)
                    .addComponent(jButtonMR)
                    .addComponent(jButtonMS)
                    .addComponent(jButtonMC)
                    .addComponent(jButtonMplus)
                    .addComponent(jButtonMminus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButtonC)
                    .addComponent(jButtonAC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButtonMult)
                    .addComponent(jButtonDiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButtonMas)
                    .addComponent(jButtonMenos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0)
                    .addComponent(jButtonPunto)
                    .addComponent(jButtonIgual))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1DivX, jButtonMasMenos, jButtonSQR, jButtonSQRT});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonAC, jButtonC, jButtonDiv, jButtonIgual, jButtonMas, jButtonMenos, jButtonMult, jButtonPunto});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonMC, jButtonMR, jButtonMS, jButtonMminus, jButtonMplus});

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton7ActionPerformed
    {//GEN-HEADEREND:event_jButton7ActionPerformed
        comprobarError();
        actualizaPantalla("7");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton8ActionPerformed
    {//GEN-HEADEREND:event_jButton8ActionPerformed
        comprobarError();
        actualizaPantalla("8");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton9ActionPerformed
    {//GEN-HEADEREND:event_jButton9ActionPerformed
        comprobarError();
        actualizaPantalla("9");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        comprobarError();
        actualizaPantalla("4");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed
        comprobarError();
        actualizaPantalla("5");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton6ActionPerformed
    {//GEN-HEADEREND:event_jButton6ActionPerformed
        comprobarError();
        actualizaPantalla("6");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        comprobarError();
        actualizaPantalla("1");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        comprobarError();
        actualizaPantalla("2");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        comprobarError();
        actualizaPantalla("3");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton0ActionPerformed
    {//GEN-HEADEREND:event_jButton0ActionPerformed
        comprobarError();
        actualizaPantalla("0");
        c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonPuntoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonPuntoActionPerformed
    {//GEN-HEADEREND:event_jButtonPuntoActionPerformed
        if (esCeroInicial) {
            limpiarPantalla();
            esCeroInicial = false;
        }
        if (c.getEstado() == MostrandoResultado.getInstance()) {
            if (!jTextFieldPantalla.getText().equals(".")) {
                limpiarPantalla();
            }
        }

        if (!jTextFieldPantalla.getText().contains(".")) {
            actualizaPantalla(".");
            try {
                c.introducirOperando(new Operando(jTextFieldPantalla.getText()));
            } catch (NumberFormatException e) {
            }
        }
    }//GEN-LAST:event_jButtonPuntoActionPerformed

    private void jButtonACActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonACActionPerformed
    {//GEN-HEADEREND:event_jButtonACActionPerformed
        c.resetear();
        jLabelMemoria.setText("");
        limpiarPantalla();
    }//GEN-LAST:event_jButtonACActionPerformed

    private void jButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultActionPerformed
        c.introducirOperadorBinario(Multiplicacion.getInstance());
        jTextFieldPantalla.setText("");
    }//GEN-LAST:event_jButtonMultActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        c.introducirOperadorBinario(Division.getInstance());
        jTextFieldPantalla.setText("");
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasActionPerformed
        c.introducirOperadorBinario(Suma.getInstance());
        jTextFieldPantalla.setText("");
    }//GEN-LAST:event_jButtonMasActionPerformed

    private void jButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosActionPerformed
        c.introducirOperadorBinario(Resta.getInstance());
        jTextFieldPantalla.setText("");
    }//GEN-LAST:event_jButtonMenosActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        jTextFieldPantalla.setText("");
        try {
            c.mostrarResultado();
            jTextFieldPantalla.setText(c.getOp1().toString());
        } catch (ArithmeticException e) {
            limpiarPantalla();
            jTextFieldPantalla.setText("No se puede dividir por cero");
            mostrandoError = true;
        }
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        c.limpiarPantalla();
        limpiarPantalla();
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasMenosActionPerformed
        limpiarPantalla();
        c.introducirOperadorUnario(Opuesta.getInstance());
        jTextFieldPantalla.setText(c.getOp1().toString());
    }//GEN-LAST:event_jButtonMasMenosActionPerformed

    private void jButtonSQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSQRActionPerformed
        limpiarPantalla();
        c.introducirOperadorUnario(Cuadrado.getInstance());
        jTextFieldPantalla.setText(c.getOp1().toString());
    }//GEN-LAST:event_jButtonSQRActionPerformed

    private void jButtonSQRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSQRTActionPerformed
        limpiarPantalla();
        try {
            c.introducirOperadorUnario(RaizCuadrada.getInstance());
            jTextFieldPantalla.setText(c.getOp1().toString());
        } catch (ArithmeticException e) {
            limpiarPantalla();
            jTextFieldPantalla.setText("Entrada no válida");
            mostrandoError = true;
        }
    }//GEN-LAST:event_jButtonSQRTActionPerformed

    private void jButton1DivXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DivXActionPerformed
        limpiarPantalla();
        try {
            c.introducirOperadorUnario(Inversa.getInstance());
            jTextFieldPantalla.setText(c.getOp1().toString());
        } catch (ArithmeticException e) {
            limpiarPantalla();
            jTextFieldPantalla.setText("No se puede dividir por cero");
            mostrandoError = true;
        }
    }//GEN-LAST:event_jButton1DivXActionPerformed

    private void jButtonMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMRActionPerformed
        limpiarPantalla();
        jTextFieldPantalla.setText(c.leerMemoria().toString());
    }//GEN-LAST:event_jButtonMRActionPerformed

    private void jButtonMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMSActionPerformed
        try {
            Operando dato = new Operando(jTextFieldPantalla.getText());
            c.escribirMemoria(dato);
            jLabelMemoria.setText("M");
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_jButtonMSActionPerformed

    private void jButtonMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMCActionPerformed
        jLabelMemoria.setText("");
        c.limpiarMemoria();
    }//GEN-LAST:event_jButtonMCActionPerformed

    private void jButtonMplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMplusActionPerformed
        try {
            Operando dato = new Operando(jTextFieldPantalla.getText());
            c.sumarMemoria(dato);
            jLabelMemoria.setText("M");
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_jButtonMplusActionPerformed

    private void jButtonMminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMminusActionPerformed
        try {
            Operando dato = new Operando(jTextFieldPantalla.getText());
            c.restarMemoria(dato);
            jLabelMemoria.setText("M");
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_jButtonMminusActionPerformed

    private void comprobarError() {
        if (esCeroInicial) {
            esCeroInicial = false;
            limpiarPantalla();
        }
        if (c.getEstado() == MostrandoResultado.getInstance()) {
            if (!jTextFieldPantalla.getText().equals(".")) {
                limpiarPantalla();
            }
        }
        if (mostrandoError) {
            limpiarPantalla();
            mostrandoError = false;
        }
    }
    
    private void actualizaPantalla(String s) {
        jTextFieldPantalla.setText(jTextFieldPantalla.getText() + s);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String Nimbus2000 = "Nimbus"; //dank easter-egg m9
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (Nimbus2000.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        CalculadoraGUI calculadoraGUI = new CalculadoraGUI();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            calculadoraGUI.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1DivX;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAC;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMC;
    private javax.swing.JButton jButtonMR;
    private javax.swing.JButton jButtonMS;
    private javax.swing.JButton jButtonMas;
    private javax.swing.JButton jButtonMasMenos;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JButton jButtonMminus;
    private javax.swing.JButton jButtonMplus;
    private javax.swing.JButton jButtonMult;
    private javax.swing.JButton jButtonPunto;
    private javax.swing.JButton jButtonSQR;
    private javax.swing.JButton jButtonSQRT;
    private javax.swing.JLabel jLabelMemoria;
    private javax.swing.JTextField jTextFieldPantalla;
    // End of variables declaration//GEN-END:variables

}
