private void btnAddActionPerformed(java.awt.event.ActionEvent evt) { 

 String name = txtName.getText(); 

 int age = Integer.parseInt(txtAge.getText()); 

 String gender = (String) comboGender.getSelectedItem();   

 try { 

 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital",  "root", ""); 

 PreparedStatement pst = con.prepareStatement("INSERT INTO patients(name, age, gender)  VALUES (?, ?, ?)"); 

 pst.setString(1, name); 

 pst.setInt(2, age); 

 pst.setString(3, gender); 

 pst.executeUpdate(); 

 JOptionPane.showMessageDialog(this, "Patient Added Successfully");  } catch (SQLException e) { 

 e.printStackTrace(); 

 } 

} 
