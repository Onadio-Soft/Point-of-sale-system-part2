/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.databackup;

import com.google.api.core.ApiFuture;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class mainFrame extends javax.swing.JFrame {
    public Firestore db;
    static int sta = 0;
      public void dbConnect(){
        try {
            FileInputStream serviceAccount = null;
            try {
                serviceAccount = new FileInputStream("./serviceAccountKey.json");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                     FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();
                    FirebaseApp.initializeApp(options);
                    db = FirestoreClient.getFirestore();
        } catch (IOException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
    }
      public static void isInternetAvailable() throws Exception{
        try {
            URL url = new URL("http://www.google.com");
            HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
            urlConnect.setConnectTimeout(5000); // 5 seconds timeout
            urlConnect.connect();
            if (urlConnect.getResponseCode() == 200) {
                sta = 1;
            }
        } catch (IOException e) {
             sta = 0;
            e.printStackTrace();
        }
    
    }
    public mainFrame() {
        initComponents();
        dbConnect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Firebase data backup center");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("For Crinton");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Network status");

        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setText("none");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Backup process");

        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setText("Waiting");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Data status");

        lbl3.setForeground(new java.awt.Color(0, 0, 0));
        lbl3.setText("None");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbl1)
                    .addComponent(jLabel5)
                    .addComponent(lbl2)
                    .addComponent(jLabel7)
                    .addComponent(lbl3))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Backup now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Load data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane2.setViewportView(Area1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 209, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(495, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      if(sta == 1){
            String ssh=null;
       int  ch1 = 0,ch2 = 0,ch3 = 0 , ch4 = 0 , ch5 = 0,ch6 = 0; 
       ArrayList<String> allChoices = new ArrayList<String>(); 
        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\choices.txt"));
             while ((ssh=bufferedReader.readLine())!=null) {
                 allChoices.add(ssh);
            } 
             Iterator itr = allChoices.iterator();
             while(itr.hasNext()){
                 String current = (String) itr.next();
                  boolean comp=current.equals("1");
                  boolean comp2=current.equals("2");
                  boolean comp3=current.equals("3");
                  boolean comp4=current.equals("4");
                  boolean comp5=current.equals("5");
                  boolean comp6=current.equals("6");
                 if(comp == true){
                     ch1 = 1;
                 }
                  if(comp2 == true){
                    ch2 = 1;
                 }
                   if(comp3 == true){
                    ch3 = 1;
                 }
                    if(comp4 == true){
                   ch4 = 1;
                 }
                     if(comp5 == true){
                  ch5 = 1;
                 }
                    if(comp6 == true){
                    ch6 = 1;
                 }
            }
             if(ch1==1){
                   CollectionReference collectionRef = db.collection("employeeDetails");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<DocumentReference> documents = querySnapshot.getDocuments().stream()
                    .map(doc -> doc.getReference())
                    .toList();
            for (DocumentReference document : documents) {
                ApiFuture<WriteResult> writeResult = document.delete();
                lbl2.setText("Sending data");
            }
                    try {
                     String line1 = null,line2 = null,line3 = null,line4 = null;
                     BufferedReader bufferedReader2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\borrowed.txt"));
                     while ((line1=bufferedReader2.readLine())!=null) {
                     line2=bufferedReader2.readLine();
                     line3=bufferedReader2.readLine();
                     line4=bufferedReader2.readLine();  
                     lbl2.setText("Sending data");
                     Map<String, Object> data2 = new HashMap<>();
                     data2.put("accID", line1);
                     data2.put("empID", line2);
                     data2.put("password", line4);
                     data2.put("userName", line3);
                     ApiFuture<DocumentReference> result2 = db.collection("employeeDetails").add(data2);
                     }    
                     lbl2.setText("Finished");
                      PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\borrowed.txt");
                      writer.print("");
                      writer.close();
                     } catch (Exception ex) {
                          JOptionPane.showMessageDialog(null, ex.toString());
                     }
             }
             if(ch2 == 1){
                           CollectionReference collectionRef = db.collection("customerDetails");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<DocumentReference> documents = querySnapshot.getDocuments().stream()
                    .map(doc -> doc.getReference())
                    .toList();
            for (DocumentReference document : documents) {
                ApiFuture<WriteResult> writeResult = document.delete();
                lbl2.setText("Sending data");
            }
                    try {
                     String line1 = null,line2 = null,line3 = null,line4 = null,line5 = null,line6 = null;
                     BufferedReader bufferedReader2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\cusDetails.txt"));
                     while ((line1=bufferedReader2.readLine())!=null) {
                     line2=bufferedReader2.readLine();
                     line3=bufferedReader2.readLine();
                     line4=bufferedReader2.readLine(); 
                     line5 = bufferedReader2.readLine();
                     line6 = bufferedReader2.readLine();
                     lbl2.setText("Sending data");
                     Map<String, Object> data2 = new HashMap<>();
                     data2.put("cusID", line1);
                     data2.put("pType", line2);
                     data2.put("billTot", line3);
                     data2.put("givenAmu", line4);
                     data2.put("date", line5);
                     data2.put("cashier", line6);
                     ApiFuture<DocumentReference> result2 = db.collection("customerDetails").add(data2);
                     }    
                     lbl2.setText("Finished");
                      PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\cusDetails.txt");
                      writer.print("");
                      writer.close();
                     } catch (Exception ex) {
                          JOptionPane.showMessageDialog(null, ex.toString());
                     }
             }
             if(ch3 == 1){
                      CollectionReference collectionRef = db.collection("shipmentOrders");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<DocumentReference> documents = querySnapshot.getDocuments().stream()
                    .map(doc -> doc.getReference())
                    .toList();
            for (DocumentReference document : documents) {
                ApiFuture<WriteResult> writeResult = document.delete();
                lbl2.setText("Sending data");
            }
                    try {
                     String line1 = null,line2 = null,line3 = null,line4 = null,line5 = null,line6 = null,line7 = null,line8 = null;
                     BufferedReader bufferedReader2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\shipmentOrders.txt"));
                     while ((line1=bufferedReader2.readLine())!=null) {
                     line2=bufferedReader2.readLine();
                     line3=bufferedReader2.readLine();
                     line4=bufferedReader2.readLine(); 
                     line5 = bufferedReader2.readLine();
                     line6 = bufferedReader2.readLine();
                     line7 = bufferedReader2.readLine();
                     line8= bufferedReader2.readLine();
                     lbl2.setText("Sending data");
                     Map<String, Object> data2 = new HashMap<>();
                     data2.put("ID", line1);
                     data2.put("shipmentID", line2);
                     data2.put("serviceProvider", line3);
                     data2.put("sendingLocation", line4);
                     data2.put("destination", line5);
                     data2.put("countryCode", line6);
                     data2.put("description", line7);
                     data2.put("total", line8);
                     ApiFuture<DocumentReference> result2 = db.collection("shipmentOrders").add(data2);
                     }    
                     lbl2.setText("Finished");
                      PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\shipmentOrders.txt");
                      writer.print("");
                      writer.close();
                     } catch (Exception ex) {
                          JOptionPane.showMessageDialog(null, ex.toString());
                     }
             }
             if(ch4 == 1){
                 lbl2.setText("Sending data");
                  CollectionReference collectionRef = db.collection("Items");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<DocumentReference> documents = querySnapshot.getDocuments().stream()
                    .map(doc -> doc.getReference())
                    .toList();
            for (DocumentReference document : documents) {
                ApiFuture<WriteResult> writeResult = document.delete();
               // lbl2.setText("Sending data");
            }
                    try {
                     String line1 = null,line2 = null,line3 = null,line4 = null,line5 = null;
                     BufferedReader bufferedReader2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\Items.txt"));
                     while ((line1=bufferedReader2.readLine())!=null) {
                     line2=bufferedReader2.readLine();
                     line3=bufferedReader2.readLine();
                     line4=bufferedReader2.readLine(); 
                     line5 = bufferedReader2.readLine();
                     lbl2.setText("Sending data");
                     Map<String, Object> data2 = new HashMap<>();
                     data2.put("ItemCode", line1);
                     data2.put("ItemName", line2);
                     data2.put("Catagory", line3);
                     data2.put("UnitPrice", line4);
                     data2.put("Amount", line5);
                     ApiFuture<DocumentReference> result2 = db.collection("Items").add(data2);
                     }    
                     lbl2.setText("Finished");
                      PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\Items.txt");
                      writer.print("");
                      writer.close();
                     } catch (Exception ex) {
                          JOptionPane.showMessageDialog(null, ex.toString());
                     }
             }
             if(ch5 == 1){
                  lbl2.setText("Sending data");
                  CollectionReference collectionRef = db.collection("emInfo");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<DocumentReference> documents = querySnapshot.getDocuments().stream()
                    .map(doc -> doc.getReference())
                    .toList();
            for (DocumentReference document : documents) {
                ApiFuture<WriteResult> writeResult = document.delete();
               // lbl2.setText("Sending data");
            }
                    try {
                     String line1 = null,line2 = null,line3 = null,line4 = null;
                     BufferedReader bufferedReader2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\emInfo.txt"));
                     while ((line1=bufferedReader2.readLine())!=null) {
                     line2=bufferedReader2.readLine();
                     line3=bufferedReader2.readLine();
                     line4=bufferedReader2.readLine(); 
                     lbl2.setText("Sending data");
                     Map<String, Object> data2 = new HashMap<>();
                     data2.put("emID", line1);
                     data2.put("name", line2);
                     data2.put("address", line3);
                     data2.put("usName", line4);
                     ApiFuture<DocumentReference> result2 = db.collection("emInfo").add(data2);
                     }    
                     lbl2.setText("Finished");
                      PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\emInfo.txt");
                      writer.print("");
                      writer.close();
                     } catch (Exception ex) {
                          JOptionPane.showMessageDialog(null, ex.toString());
                     }
             }
             if(ch6 == 1){
                  lbl2.setText("Sending data");
                  CollectionReference collectionRef = db.collection("shipmentProducts");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<DocumentReference> documents = querySnapshot.getDocuments().stream()
                    .map(doc -> doc.getReference())
                    .toList();
            for (DocumentReference document : documents) {
                ApiFuture<WriteResult> writeResult = document.delete();
            }
                    try {
                     String line1 = null,line2 = null,line3 = null,line4 = null;
                     BufferedReader bufferedReader2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\shipmentProducts.txt"));
                     while ((line1=bufferedReader2.readLine())!=null) {
                     line2=bufferedReader2.readLine();
                     line3=bufferedReader2.readLine();
                     line4=bufferedReader2.readLine(); 
                     lbl2.setText("Sending data");
                     Map<String, Object> data2 = new HashMap<>();
                     data2.put("shid", line1);
                     data2.put("productID", line2);
                     data2.put("shipmentOrID", line3);
                     data2.put("amount", line4);
                     ApiFuture<DocumentReference> result2 = db.collection("shipmentProducts").add(data2);
                     }    
                     lbl2.setText("Finished");
                      PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\shipmentProducts.txt");
                      writer.print("");
                      writer.close();
                     } catch (Exception ex) {
                          JOptionPane.showMessageDialog(null, ex.toString());
                     }
             }
             if(allChoices == null || allChoices.isEmpty()){
                 JOptionPane.showMessageDialog(null, "Please select the tables to backup in the main menu");
             }
             PrintWriter writer2 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\choices.txt");
             PrintWriter writer3 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\conditions.txt");
              writer2.print("");
              writer3.print("");
              writer2.close();
              writer3.close();
       }
       catch(Exception ee){
           JOptionPane.showMessageDialog(null, ee.toString());
       }
      }
      else{
        JOptionPane.showMessageDialog(null, "You are not connected. please check your connection and \n"+"try again.");
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Area1.setEditable(false);
        Area1.setText("Your retriving data will show here");
        try {
            isInternetAvailable();
            String cho = "";
            BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\conditions.txt"));
            cho=bufferedReader.readLine();
            //JOptionPane.showMessageDialog(null, cho);
            boolean comp=cho.equals("2");
            boolean comp2=cho.equals("1");
            if(comp == true){
                //JOptionPane.showMessageDialog(null, "ok");
                jButton1.setEnabled(false);
            }
            else if(comp2 == true){
                //JOptionPane.showMessageDialog(null, "ok");
                jButton2.setEnabled(false);
            }
            else{
                jButton1.setEnabled(false); 
                jButton2.setEnabled(false);
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex.toString());
            jButton1.setEnabled(false); 
                jButton2.setEnabled(false);
        }
        if(sta == 1){
            lbl1.setText("Connected");
        }
        else{
            lbl1.setText("Not Connected");
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(sta == 1){
           
           try {
             Area1.setText("");
             PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb1.txt");
             PrintWriter writer2 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb2.txt");
             PrintWriter writer3 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb3.txt");
             PrintWriter writer4 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb4.txt");
             PrintWriter writer5 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb5.txt");
             PrintWriter writer6 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\restorechoices.txt");
             PrintWriter writer7 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\conditions.txt");
             writer.print("");
             writer2.print("");
             writer3.print("");
             writer4.print("");
             writer5.print("");
             ArrayList<String> allrestoreChoices = new ArrayList<String>(); 
             String items = "";
                  boolean comp= false;
                  boolean comp2=false;
                  boolean comp3=false;
                  boolean comp4=false;
                  boolean comp5=false;
                  boolean comp6=false;
            BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\restorechoices.txt"));
             while ((items=bufferedReader.readLine())!=null) {
                 allrestoreChoices.add(items);
            } 
           //  System.out.println(allrestoreChoices);
           int l1 = 0,l2 = 0,l3 = 0,l4 = 0,l5 = 0,l6 = 0;
             Iterator itr = allrestoreChoices.iterator();
             while(itr.hasNext()){
                 String current = (String) itr.next();
                 comp = current.equals("0");
                 comp2 = current.equals("1");
                 comp3 = current.equals("2");
                 comp4 = current.equals("3");
                 comp5 = current.equals("4");
                 comp6 = current.equals("5");
                 if(comp == true){
                     l1 = 1;
                 }
                 if(comp2 == true){
                     l2 = 1;
                 }
                 if(comp3 == true){
                     l3 = 1;
                 }
                 if(comp4 == true){
                     l4 = 1;
                 }
                 if(comp5 == true){
                     l5 = 1;
                 }
                 if(comp6 == true){
                     l6 = 1;
                 }
             }
             //NEED TO MODIFY
             //WRITE TO RELAVENT TEXT FILES 
             if(l1 == 1){
                 try{
                  FileWriter fileWriter1 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb1.txt",true);
            CollectionReference collectionRef = db.collection("employeeDetails");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
            for (DocumentSnapshot document : documents) {
                String accID = document.getString("accID");
                String empID = document.getString("empID");
                String password = document.getString("password");
                String userName = document.getString("userName");
                fileWriter1.append(accID+"\n" + empID + "\n" + password + "\n" + userName + "\n");
                Area1.append("Employee Details : "+accID+" "+empID+" "+password+" "+" "+userName+"\n\n");
            }
            fileWriter1.close();
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
             }
             if(l2 == 1){
                 try{
                     FileWriter fileWriter1 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb2.txt",true);
            CollectionReference collectionRef = db.collection("customerDetails");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
            for (DocumentSnapshot document : documents) {
               //INTO VARIABLES
               //all data --> ("Data: " + document.getData());
                String billTot = document.getString("billTot");
                String cashier = document.getString("cashier");
                String cusID = document.getString("cusID");
                String date = document.getString("date");
                String givenAmu = document.getString("givenAmu");
                String pType = document.getString("pType");
               fileWriter1.append(billTot+"\n" + cashier + "\n" + cusID + "\n"+ date + "\n" + givenAmu + "\n" + pType + "\n");
                Area1.append("Customer Details : "+billTot+" "+cashier+" "+cusID+" "+givenAmu+" "+pType+" "+date+"\n\n");
            }
            fileWriter1.close();
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
             }
             if(l3 == 1){
                 try{
                     FileWriter fileWriter1 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb3.txt",true);
            CollectionReference collectionRef = db.collection("shipmentOrders");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
            for (DocumentSnapshot document : documents) {
               //INTO VARIABLES
               //all data --> ("Data: " + document.getData());
                String ID = document.getString("ID");
                String countryCode = document.getString("countryCode");
                String description = document.getString("description");
                String destination = document.getString("destination");
                String sendingLocation = document.getString("sendingLocation");
                String serviceProvider = document.getString("serviceProvider");
                String shipmentID = document.getString("shipmentID");
                String total = document.getString("total");
                 fileWriter1.append(ID + "\n" + shipmentID + "\n" + serviceProvider + "\n" + sendingLocation + "\n"+destination + "\n" + countryCode + "\n" + description + "\n" + total + "\n");
                Area1.append("Shipment orders : "+ID+" "+countryCode+" "+description+" "+sendingLocation+" "+serviceProvider+" "+shipmentID+" "+total+"\n\n");
            }
            fileWriter1.close();
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
             }
             if(l4 == 1){
                 try{
                     FileWriter fileWriter1 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb4.txt",true);
            CollectionReference collectionRef = db.collection("Items");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
            for (DocumentSnapshot document : documents) {
               //INTO VARIABLES
               //all data --> ("Data: " + document.getData());
                String Amount = document.getString("Amount");
                String Catagory = document.getString("Catagory");
                String ItemCode = document.getString("ItemCode");
                String ItemName = document.getString("ItemName");
                String UnitPrice = document.getString("UnitPrice");
                fileWriter1.append(ItemCode+"\n" + ItemName + "\n" + Catagory + "\n" + UnitPrice + "\n" + Amount + "\n");
                Area1.append("Items : "+Amount+" "+Catagory+" "+ItemCode+" "+ItemName+" "+UnitPrice+"\n\n");
            }
            fileWriter1.close();
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
             }
             if(l5 == 1){
                 try{
                       FileWriter fileWriter1 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb5.txt",true);
            CollectionReference collectionRef = db.collection("emInfo");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
            for (DocumentSnapshot document : documents) {
               //INTO VARIABLES
               //all data --> ("Data: " + document.getData());
                String address = document.getString("address");
                String emID = document.getString("emID");
                String name = document.getString("name");
                String usName = document.getString("usName");
                 fileWriter1.append(emID+"\n" + name + "\n" + address + "\n" + usName + "\n");
                Area1.append("emInfo : "+address+" "+emID+" "+name+" "+usName+" "+"\n\n");
            }
            fileWriter1.close();
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
             }
             if(l6 == 1){
               try{
                     FileWriter fileWriter1 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb6.txt",true);
            CollectionReference collectionRef = db.collection("shipmentProducts");
            ApiFuture<QuerySnapshot> query = collectionRef.get();
            QuerySnapshot querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
            for (DocumentSnapshot document : documents) {
               //INTO VARIABLES
               //all data --> ("Data: " + document.getData());
                String amount = document.getString("amount");
                String productID = document.getString("productID");
                String shid = document.getString("shid");
                String shipmentOrID = document.getString("shipmentOrID");
                 fileWriter1.append(shid+"\n" + productID + "\n" + shipmentOrID + "\n" + amount + "\n");
                Area1.append("Shipment products : "+amount+" "+productID+" "+shid+" "+shipmentOrID+" "+"\n\n");
            }
            fileWriter1.close();
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }  
             }
             //END.........................................................................................................
             writer.close();
             writer2.close();
             writer3.close();
             writer4.close();
             writer5.close();
             //RED.....line // delete conditions and restorechoices
             writer6.print("");
             writer7.print("");
             writer6.close();
             writer7.close();
             if(allrestoreChoices == null || allrestoreChoices.isEmpty()){
                 JOptionPane.showMessageDialog(null, "Please select the tables to restore in the main menu");
             }
             else{
             JOptionPane.showMessageDialog(null, "Now complete the restore process");      
             }
        } catch (Exception ee ) {
            JOptionPane.showMessageDialog(null, ee.toString());
        } 
       }
       else{
           JOptionPane.showMessageDialog(null, "You are not connected. please check your connection and \n"+"try again.");
       }
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    // End of variables declaration//GEN-END:variables
}
