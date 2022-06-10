package tech.andean

class Table_brand {
    
    String brandName
    
    //Creamos la relacion uno a muchos con la tabla "Table_product"
    //en este caso estamos en "uno"
    static hasMany = [table_product:Table_product]
    
    static constraints = {
    }
}
