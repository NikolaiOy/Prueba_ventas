package tech.andean

class Table_customer {
    
    String first_name
    String last_name
    String phone
    String email
    String street
    String city
    String state
    String zip_code
    
    //Creamos la relacion de uno a muchos con la tabla "Table_order", 
    //en este caso estamos en "uno"
    static hasMany = [table_order:Table_order]
    
    static constraints = {
        dni unique: true
        phone nullable: true, blank: true
        email nullable: true, blank: true
        city nullable: true, blank: true
        street nullable: true, blank: true
        state nullable: true, blank: true
        zipCode nullable: true, blank: true
    }
}
