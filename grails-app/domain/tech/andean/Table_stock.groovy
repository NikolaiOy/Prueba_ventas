package tech.andean

class Table_stock {
    
    int quantity
    
    //Creamos la relacion de uno a uno con las tablas "Table_stores" y "Table_product"
    static belongsTo = [table_stores:Table_stores, table_product:Table_product]
    
    static constraints = {
    }
}
