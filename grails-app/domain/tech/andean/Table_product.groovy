package tech.andean

class Table_product {
    
    String productName
    String modelYear
    int listPrice 
    
    //Creamos la relacion de uno a muchos con la tabla "Table_order_item"
    //en este caso estamos en "uno"
    static hasMany = [table_order_item:Table_order_item]
    //Creamos la relacion uno a uno con la tabla "Table_stock"
    static hasOne = [table_stock:Table_stock]
    //Creamos la relacion uno a muchos con las tablas "Table_category" y "Table_brand"
    //en este caso estamos en "muchos"
    static belongsTo = [table_category:Table_category, table_brand:Table_brand]
    
    static constraints = {
    }
}
