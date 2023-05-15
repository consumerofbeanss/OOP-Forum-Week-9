# OOP-Forum-Week-9
## Name: Ostein Vittorio Vellim
## NIM: 2602206783
### A large company with locations in different cities has taken an OOP approach in creating an administration program that manages all aspects of its business. These aspects include:
- ### the sale of all the different products that the company manages
- ### the salaries for managers, office staff and sales personnel.

#### (a) By making use of an example from the above scenario, distinguish between a class and an instantiation of a class. (3 points)
##### A class is a template/blueprint for an object in java, which is the instantiation of a class. For example, managers, office staff, and sales personnel are classes which have properties like names and salaries. In this case, an object would be an instance of a class and contains a certain value for their names and salaries.

#### (b) By giving two examples, explain how the principles of inheritance can be incorporated into the design of this administration program. (4 points)
##### Inheritance is a method in which the methods of a class are inherited to another class in a parent-child relationship. For example: 
- ##### The manager class contains methods inherited by another class called office staff class.
- ##### Product classes like food and drinks can inherit methods from another class called consumables class.

#### (c) Describe how the use of libraries can facilitate the development of programs like this company’s administration program. (3 points)
##### Libraries contain different pre-written methods which can assist the creation of programs without having to create such methods from scratch, thus saving time.


### 2. The company employs several sales personnel to sell its products to different retailers. Each branch of the company keeps track of its own sales with a suite of programs that include the two classes SalesPerson and Sales.

#### (a) Complete the constructor public SalesPerson(String id), from the SalesPerson class. (2 points)

```
public SalesPerson(String id){
    this.id = id;
    this.salesHistory = new Sales[100];
}
```

#### (b) Explain why accessor methods are necessary for the SalesPerson class. (3 points)
##### Accessor methods are needed to access the attributes of private variables. This is to prevent changes made to the private variables.

#### (c) (i) Construct unified modeling language (UML) diagrams to clearly show the relationship between the SalesPerson and Sales classes.
##### Below is the UML diagram showing the relationship between classes SalesPerson and Sales
![UML](images/UMLDiagram.png "UML Diagram")




