package com.lopes.contactList.model

class Contact {

    var id: Int = 0;
    var name: String? = null;
    var email: String? = null;
    var phone: String? = null;

    constructor(id:Int, name:String, email:String, phone:String){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    constructor(name:String, email:String, phone:String){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

}