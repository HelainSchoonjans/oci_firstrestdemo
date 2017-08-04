package firstrestdemo

import demo.Person

class BootStrap {

    def init = { servletContext ->
        new Person(firstName: "name1", lastName: "name1").save()
        new Person(firstName: "name2", lastName: "name2").save()
        new Person(firstName: "name3", lastName: "name3").save()
        new Person(firstName: "name4", lastName: "name4").save()
    }
    def destroy = {
    }
}
