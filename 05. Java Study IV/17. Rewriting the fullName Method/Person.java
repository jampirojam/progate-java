class Person {
    public static int count = 0;
    public String firstName;
    public String middleName;
    public String lastName;
    public int age;
    public double height, weight;
  
    Person(String firstName, String lastName, int age, double height, double weight) {
      Person.count++;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.height = height;
      this.weight = weight;
    }
    
    Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
      this(firstName, lastName, age, height, weight);
      this.middleName = middleName;
    }
  
    public String fullName() {
      // Use an if statement to check if middle name should be printed with full name
      if (this.middleName == null) {
        return this.firstName + " " + this.lastName;
      } else {
        return this.firstName + " " + this.middleName + " " + this.lastName;
      }
    }
  
    public void printData() {
      System.out.println("My name is " + this.fullName() + ".");
      System.out.println("I am " + this.age + " years old.");
      System.out.println("My BMI is " + Math.round(this.bmi()) + ".");
    }
  
    public double bmi() {
      return this.weight / this.height / this.height;
    }
  
    public static void printCount() {
      System.out.println("Total: " + Person.count + " people.");
    }
  }
  