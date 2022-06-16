public class Student {
  int rating;
  private String name;
  public static int studentCount = 0;
  public static int ratingSum = 0;

  // TODO implement Student class according to the instructions provided in the README.md file

  public Student(String name) {
    this.name = name;
    studentCount++;
    //TODO initialize name
  }

  public static void main (String[] args){
    Student student1 = new Student("Jessie");
    student1.setRating(14);

    Student student2 = new Student("James");
    student2.setRating(96);

    Student student3 = new Student("Cat");
    student3.setRating(100);

    System.out.println("Number of students is: " + studentCount);
    System.out.println("Average student rating is: " + getAvgRating());
    student1.changeRating(25);
    System.out.println("Average student rating after re-grading is: " + getAvgRating());
    System.out.println("Is a cat actually smarter than Jessie?: " + student3.betterStudent(student1));
  }

  public static double getAvgRating() {
    if (studentCount > 0) {
      return (ratingSum / studentCount);
    } else
      return 0;
    // TODO return average rating of all students
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    // TODO set student's name
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    ratingSum += this.rating;
    // TODO initialize rating;
  }

  public boolean betterStudent(Student student) {
    // TODO return the result of comparing this.student's rating with the student's rating
    if (this.rating > student.rating) {
      return true;
    } else
    return false;
  }

  public void changeRating(int rating) {
    // TODO change this student's rating and average rating of all students
   ratingSum -= this.rating;
   ratingSum += rating;
   this.rating = rating;

  }

  public static void removeStudent(Student student) {
    // TODO remove student
    ratingSum -= student.rating;
    --studentCount;
  }

  @Override
  public String toString() {
    // TODO return String with name and rating of this student
    return this.name + " " + this.rating;
  }
}