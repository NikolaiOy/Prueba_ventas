package tech.andean

class Table_category {
    
    String categoryName
    
    //Creamos una relacion de uno a muchos con la tabla "Table_product"
    //en este caso estamos en "muchos"
    static hasMany = [table_product:Table_product]
    
    static constraints = {
    }
}
