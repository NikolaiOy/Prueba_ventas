package tech.andean

class Table_stores {
    
    String storeName
    String phone
    String email
    String street
    String city
    String state
    String zip_code
    
    //Creamos la relacion de uno a muchos con las tablas "Table_staff" y "Table_order", 
    //en este caso estamos en "uno"
    static hasMany = [table_staff:Table_staff, table_order:Table_order]
    //Creamos una relacion uno a uno con la tabla "Table_stock"
    static hasOne = [table_stock:Table_stock]
    
    static constraints = {
        email nullable: true, blank: true
    }
}
