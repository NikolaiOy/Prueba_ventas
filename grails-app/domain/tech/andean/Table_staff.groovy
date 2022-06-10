package tech.andean

class Table_staff {
    
    String first_name
    String last_name
    String email
    String phone
    Boolean active
    
    //Aca tenemos una relacion en ciclo(relacion entre uno mismo) donde
    //ponemos el nombre del dominio seguido del nombre de la columna 
    Table_staff manager
    //Creamos la relacion de uno a muchos con la tabla "Table_order", 
    //en este caso estamos en "uno"
    static hasMany = [table_order:Table_order]
    //Creamos la relacion de uno a muchos con la tabla "Table_stores", 
    //en este caso estamos en "muchos"
    static belongsTo = [table_stores:Table_stores]
    
    static constraints = {
        manager nullable: true
    }
}
