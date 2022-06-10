package tech.andean

class Table_order_item {
    
    int quantity
    int listPrice
    double discount
    
    Table_order table_order
    
    //Creamos la relacion uno a uno con la tabla "Table_order"
    //Adicional agregamos la relacion de uno a muchos con la tabla "Table_product"
    static belongsTo = [table_product:Table_product]
    
    static constraints = {
    }
}
