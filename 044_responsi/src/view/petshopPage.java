package view;

import controller.petshopController;
import model.petshop;
import java.awt.event.ActionListener;
import java.util.List;


public class petshopPage {
    private namaField, kontakField, durasiField;
    private addButton,updateButton,deleteButton,payButton;
    private table;
    private petshopController controller;
    
public petshopPage(petshopController){
    this.loginController = controller;
    setTitle("Data petshop");
    setSize(600,400);
    setLocationRelativeTo(null);
    
    panel.add("nama":));
    panel.add(namaField);
    
    panel.add("kontak"));
    panel.add(kontakFIeld();
    
    panel.add("ruangan:"));
    panel.add(ruanganField);
    
    panel.add("durasi(malam)"));
    panel.add(durasiField);
    
    addButton("add");
    panel.add(addButton);
    
    updateButton("Update");
    panel.add(updateButton);
    
    updateButton("Pay");
    panel.add(payButton);
    
    table = (new Object[]{"nama","kontak","durasi"},0));
}
}