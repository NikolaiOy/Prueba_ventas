package tech.andean

class Table_order {

    String orderStatus
    Date creationDate
    Date requireDate
    Date shippedDate
    
    //Creamos la relacion de uno a muchos con las tablas "Table_customer", "Table_staff" y "Table_stores", 
    //en este caso estamos en "muchos"
    static belongsTo = [table_customer:Table_customer, table_staff:Table_staff, table_stores:Table_stores]
    //Creamos la relacion uno a uno con la tabla "Table_order_item"
    static hasOne = [table_order_item:Table_order_item]
    
    
    static constraints = {
        table_order_item unique: true
    }
}
