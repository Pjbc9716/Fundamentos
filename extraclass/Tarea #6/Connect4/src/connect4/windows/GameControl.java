/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4.windows;

import connect4.logic.Logic;
import connect4.models.Game;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author PJ129
 */
public class GameControl extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Game matriz [][];
    Logic myLogic;
    int playerNumber;
    public GameControl(int player, Logic myLogic) {
        initComponents();
        this.myLogic = myLogic;
        this.playerNumber = player;
        matriz= this.myLogic.matriz;
        
//        fillList();
//        changeSettings();
//        selectIcon();
//        
    }

    public void fillList() {
        matriz[0][0] = new Game(0, this.jlb1);
        matriz[0][1] = new Game(0, this.jlb2);
        matriz[0][2] = new Game(0, this.jlb3);
        matriz[0][3] = new Game(0, this.jlb4);
        matriz[0][4] = new Game(0, this.jlb5);
        matriz[0][5] = new Game(0, this.jlb6);
        matriz[0][6] = new Game(0, this.jlb7);
        matriz[1][0] = new Game(0, this.jlb8);
        matriz[1][1] = new Game(0, this.jlb9);
        matriz[1][2] = new Game(0, this.jlb10);
        matriz[1][3] = new Game(0, this.jlb11);
        matriz[1][4] = new Game(0, this.jlb12);
        matriz[1][5] = new Game(0, this.jlb13);
        matriz[1][6] = new Game(0, this.jlb14);
        matriz[2][0] = new Game(0, this.jlb15);
        matriz[2][1] = new Game(0, this.jlb16);
        matriz[2][2] = new Game(0, this.jlb17);
        matriz[2][3] = new Game(0, this.jlb18);
        matriz[2][4] = new Game(0, this.jlb19);
        matriz[2][5] = new Game(0, this.jlb20);
        matriz[2][6] = new Game(0, this.jlb21);
        matriz[3][0] = new Game(0, this.jlb22);
        matriz[3][1] = new Game(0, this.jlb23);
        matriz[3][2] = new Game(0, this.jlb24);
        matriz[3][3] = new Game(0, this.jlb25);
        matriz[3][4] = new Game(0, this.jlb26);
        matriz[3][5] = new Game(0, this.jlb27);
        matriz[3][6] = new Game(0, this.jlb28);
        matriz[4][0] = new Game(0, this.jlb29);
        matriz[4][1] = new Game(0, this.jlb30);
        matriz[4][2] = new Game(0, this.jlb31);
        matriz[4][3] = new Game(0, this.jlb32);
        matriz[4][4] = new Game(0, this.jlb33);
        matriz[4][5] = new Game(0, this.jlb34);
        matriz[4][6] = new Game(0, this.jlb35);
        matriz[5][0] = new Game(0, this.jlb36);
        matriz[5][1] = new Game(0, this.jlb37);
        matriz[5][2] = new Game(0, this.jlb38);
        matriz[5][3] = new Game(0, this.jlb39);
        matriz[5][4] = new Game(0, this.jlb40);
        matriz[5][5] = new Game(0, this.jlb41);
        matriz[5][6] = new Game(0, this.jlb42);
    }

    public void selectIcon() {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                JLabel label = this.matriz[i][j].getLabel();
                if (this.matriz[i][j].getNumber() == 1) {
                    label.setText("X");
                } else if (this.matriz[i][j].getNumber() == 2){
                    label.setText("0");
                }
            }
        }

    }
    public void changePlayer (int player){
        if (player ==1){
            this.playerNumber=2;
            this.jLabel2.setText("Turno del jugador #2");
        }else if (player ==2){
            this.playerNumber=1;
            this.jLabel2.setText("Turno jugador #1");
            
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

        jLabel2 = new javax.swing.JLabel();
        jlb1 = new javax.swing.JLabel();
        jlb2 = new javax.swing.JLabel();
        jlb3 = new javax.swing.JLabel();
        jlb4 = new javax.swing.JLabel();
        jlb5 = new javax.swing.JLabel();
        jlb6 = new javax.swing.JLabel();
        jlb7 = new javax.swing.JLabel();
        jlb8 = new javax.swing.JLabel();
        jlb9 = new javax.swing.JLabel();
        jlb10 = new javax.swing.JLabel();
        jlb11 = new javax.swing.JLabel();
        jlb12 = new javax.swing.JLabel();
        jlb13 = new javax.swing.JLabel();
        jlb14 = new javax.swing.JLabel();
        jlb15 = new javax.swing.JLabel();
        jlb16 = new javax.swing.JLabel();
        jlb17 = new javax.swing.JLabel();
        jlb18 = new javax.swing.JLabel();
        jlb19 = new javax.swing.JLabel();
        jlb20 = new javax.swing.JLabel();
        jlb21 = new javax.swing.JLabel();
        jlb22 = new javax.swing.JLabel();
        jlb23 = new javax.swing.JLabel();
        jlb24 = new javax.swing.JLabel();
        jlb25 = new javax.swing.JLabel();
        jlb26 = new javax.swing.JLabel();
        jlb27 = new javax.swing.JLabel();
        jlb28 = new javax.swing.JLabel();
        jlb29 = new javax.swing.JLabel();
        jlb30 = new javax.swing.JLabel();
        jlb31 = new javax.swing.JLabel();
        jlb32 = new javax.swing.JLabel();
        jlb33 = new javax.swing.JLabel();
        jlb34 = new javax.swing.JLabel();
        jlb35 = new javax.swing.JLabel();
        jlb36 = new javax.swing.JLabel();
        jlb38 = new javax.swing.JLabel();
        jlb39 = new javax.swing.JLabel();
        jlb40 = new javax.swing.JLabel();
        jlb41 = new javax.swing.JLabel();
        jlb42 = new javax.swing.JLabel();
        jlb37 = new javax.swing.JLabel();
        jblBackground = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Turno del jugador #1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jlb1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb1.setForeground(new java.awt.Color(255, 255, 255));
        jlb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 40, -1));

        jlb2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb2.setForeground(new java.awt.Color(255, 255, 255));
        jlb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 40, -1));

        jlb3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb3.setForeground(new java.awt.Color(255, 255, 255));
        jlb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 40, -1));

        jlb4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb4.setForeground(new java.awt.Color(255, 255, 255));
        jlb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 40, -1));

        jlb5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb5.setForeground(new java.awt.Color(255, 255, 255));
        jlb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 40, -1));

        jlb6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb6.setForeground(new java.awt.Color(255, 255, 255));
        jlb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 40, -1));

        jlb7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb7.setForeground(new java.awt.Color(255, 255, 255));
        jlb7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 40, -1));

        jlb8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb8.setForeground(new java.awt.Color(255, 255, 255));
        jlb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 40, -1));

        jlb9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb9.setForeground(new java.awt.Color(255, 255, 255));
        jlb9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, -1));

        jlb10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb10.setForeground(new java.awt.Color(255, 255, 255));
        jlb10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 40, -1));

        jlb11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb11.setForeground(new java.awt.Color(255, 255, 255));
        jlb11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 40, -1));

        jlb12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb12.setForeground(new java.awt.Color(255, 255, 255));
        jlb12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 40, -1));

        jlb13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb13.setForeground(new java.awt.Color(255, 255, 255));
        jlb13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 40, -1));

        jlb14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb14.setForeground(new java.awt.Color(255, 255, 255));
        jlb14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 40, -1));

        jlb15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb15.setForeground(new java.awt.Color(255, 255, 255));
        jlb15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 40, -1));

        jlb16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb16.setForeground(new java.awt.Color(255, 255, 255));
        jlb16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 40, -1));

        jlb17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb17.setForeground(new java.awt.Color(255, 255, 255));
        jlb17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 40, -1));

        jlb18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb18.setForeground(new java.awt.Color(255, 255, 255));
        jlb18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 40, -1));

        jlb19.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb19.setForeground(new java.awt.Color(255, 255, 255));
        jlb19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 40, -1));

        jlb20.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb20.setForeground(new java.awt.Color(255, 255, 255));
        jlb20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 40, -1));

        jlb21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb21.setForeground(new java.awt.Color(255, 255, 255));
        jlb21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 40, -1));

        jlb22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb22.setForeground(new java.awt.Color(255, 255, 255));
        jlb22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 40, -1));

        jlb23.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb23.setForeground(new java.awt.Color(255, 255, 255));
        jlb23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 40, -1));

        jlb24.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb24.setForeground(new java.awt.Color(255, 255, 255));
        jlb24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 40, -1));

        jlb25.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb25.setForeground(new java.awt.Color(255, 255, 255));
        jlb25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 40, -1));

        jlb26.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb26.setForeground(new java.awt.Color(255, 255, 255));
        jlb26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 40, -1));

        jlb27.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb27.setForeground(new java.awt.Color(255, 255, 255));
        jlb27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, -1));

        jlb28.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb28.setForeground(new java.awt.Color(255, 255, 255));
        jlb28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb28, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 40, -1));

        jlb29.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb29.setForeground(new java.awt.Color(255, 255, 255));
        jlb29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 40, -1));

        jlb30.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb30.setForeground(new java.awt.Color(255, 255, 255));
        jlb30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 40, -1));

        jlb31.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb31.setForeground(new java.awt.Color(255, 255, 255));
        jlb31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 40, -1));

        jlb32.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb32.setForeground(new java.awt.Color(255, 255, 255));
        jlb32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 40, -1));

        jlb33.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb33.setForeground(new java.awt.Color(255, 255, 255));
        jlb33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 40, -1));

        jlb34.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb34.setForeground(new java.awt.Color(255, 255, 255));
        jlb34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 40, -1));

        jlb35.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb35.setForeground(new java.awt.Color(255, 255, 255));
        jlb35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 40, -1));

        jlb36.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb36.setForeground(new java.awt.Color(255, 255, 255));
        jlb36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 40, -1));

        jlb38.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb38.setForeground(new java.awt.Color(255, 255, 255));
        jlb38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 40, -1));

        jlb39.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb39.setForeground(new java.awt.Color(255, 255, 255));
        jlb39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb39, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 40, -1));

        jlb40.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb40.setForeground(new java.awt.Color(255, 255, 255));
        jlb40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb40, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 40, -1));

        jlb41.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb41.setForeground(new java.awt.Color(255, 255, 255));
        jlb41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb41, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 40, -1));

        jlb42.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb42.setForeground(new java.awt.Color(255, 255, 255));
        jlb42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb42, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 40, -1));

        jlb37.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlb37.setForeground(new java.awt.Color(255, 255, 255));
        jlb37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlb37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 40, -1));

        jblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\PJ129\\Desktop\\Connect4(Background).png")); // NOI18N
        getContentPane().add(jblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, 370));

        jButton1.setText("7");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 50, -1));

        jButton2.setText("1");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));

        jButton3.setText("2");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 50, -1));

        jButton4.setText("3");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 50, -1));

        jButton5.setText("4");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 50, -1));

        jButton6.setText("5");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, -1));

        jButton7.setText("6");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 50, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Connect 4");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
       myLogic.verifySpace(0,this.playerNumber);
       this.selectIcon();
       this.changePlayer(this.playerNumber);
       if (this.myLogic.victory()){
           JOptionPane.showMessageDialog(null,"Fin de la Partida");
           this.dispose();
       }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        myLogic.verifySpace(1,this.playerNumber);
       this.selectIcon();
       this.changePlayer(this.playerNumber);
       if (this.myLogic.victory()){
           JOptionPane.showMessageDialog(null,"Fin de la Partida");
           this.dispose();
       }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        myLogic.verifySpace(2,this.playerNumber);
       this.selectIcon();
       this.changePlayer(this.playerNumber);
       if (this.myLogic.victory()){
           JOptionPane.showMessageDialog(null,"Fin de la Partida");
           this.dispose();
       }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        myLogic.verifySpace(3,this.playerNumber);
       this.selectIcon();
       this.changePlayer(this.playerNumber);
       if (this.myLogic.victory()){
           JOptionPane.showMessageDialog(null,"Fin de la Partida");
           this.dispose();
       }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        myLogic.verifySpace(4,this.playerNumber);
       this.selectIcon();
       this.changePlayer(this.playerNumber);
       if (this.myLogic.victory()){
           JOptionPane.showMessageDialog(null,"Fin de la Partida");
           this.dispose();
       }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        myLogic.verifySpace(5,this.playerNumber);
       this.selectIcon();
       this.changePlayer(this.playerNumber);
       if (this.myLogic.victory()){
           JOptionPane.showMessageDialog(null,"Fin de la Partida");
           this.dispose();
       }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        myLogic.verifySpace(6,this.playerNumber);
       this.selectIcon();
       this.changePlayer(this.playerNumber);
       if (this.myLogic.victory()){
           JOptionPane.showMessageDialog(null,"Fin de la Partida");
           this.dispose();
       }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(GameControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int playerNumber = 0;
                Logic myLogic = null;
                new GameControl(playerNumber, myLogic).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jblBackground;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlb10;
    private javax.swing.JLabel jlb11;
    private javax.swing.JLabel jlb12;
    private javax.swing.JLabel jlb13;
    private javax.swing.JLabel jlb14;
    private javax.swing.JLabel jlb15;
    private javax.swing.JLabel jlb16;
    private javax.swing.JLabel jlb17;
    private javax.swing.JLabel jlb18;
    private javax.swing.JLabel jlb19;
    private javax.swing.JLabel jlb2;
    private javax.swing.JLabel jlb20;
    private javax.swing.JLabel jlb21;
    private javax.swing.JLabel jlb22;
    private javax.swing.JLabel jlb23;
    private javax.swing.JLabel jlb24;
    private javax.swing.JLabel jlb25;
    private javax.swing.JLabel jlb26;
    private javax.swing.JLabel jlb27;
    private javax.swing.JLabel jlb28;
    private javax.swing.JLabel jlb29;
    private javax.swing.JLabel jlb3;
    private javax.swing.JLabel jlb30;
    private javax.swing.JLabel jlb31;
    private javax.swing.JLabel jlb32;
    private javax.swing.JLabel jlb33;
    private javax.swing.JLabel jlb34;
    private javax.swing.JLabel jlb35;
    private javax.swing.JLabel jlb36;
    private javax.swing.JLabel jlb37;
    private javax.swing.JLabel jlb38;
    private javax.swing.JLabel jlb39;
    private javax.swing.JLabel jlb4;
    private javax.swing.JLabel jlb40;
    private javax.swing.JLabel jlb41;
    private javax.swing.JLabel jlb42;
    private javax.swing.JLabel jlb5;
    private javax.swing.JLabel jlb6;
    private javax.swing.JLabel jlb7;
    private javax.swing.JLabel jlb8;
    private javax.swing.JLabel jlb9;
    // End of variables declaration//GEN-END:variables
}