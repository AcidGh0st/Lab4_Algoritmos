package controller;

import domain.Customer;
import domain.ListException;
import domain.SinglyLinkedList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class CustomerController
{
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn<Customer, Integer> idTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer, String> emailTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer, Integer> ageTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer, String> phoneTableColumn;
    @javafx.fxml.FXML
    private BorderPane bp;
    private SinglyLinkedList customerList;
    Alert alert;

    @javafx.fxml.FXML
    public void initialize() {
        this.alert = util.UtilityFX.alert("Customers Management", "");
        //cargamos la lista global
        this.customerList = util.Utility.getCustomerList();

        idTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageTableColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        phoneTableColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        try{
            if(customerList!=null && !customerList.isEmpty()) {
                for (int i = 1; i <= customerList.size(); i++) {
                    tableView.getItems().add(customerList.getNode(i).data);
                }
            }
        }catch(ListException ex){
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
    }


    @javafx.fxml.FXML
    public void addFirstOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void removeOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addOnAction(ActionEvent actionEvent) {
        util.UtilityFX.loadPage("ucr.lab.HelloApplication", "addCustomer.fxml", bp);
    }

    @javafx.fxml.FXML
    public void addSortedOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void getFirstOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void removeFirstOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void getLastOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void containsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sizeOnAction(ActionEvent actionEvent) {
    }
}