package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
       String expectedName = "Leon";
        Integer expectedAge = 5;
        String expectedHobby= "Basketball";
        String expectedRelationshipStatus = " single";
        String expectedEyeColor="brown";
        Double expectedHeight= 3.25;
        Integer expectedGraduationYear = 2033;


        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Integer actualGraduationYear= person.getGraduationYear();
        Double actualHeight= person.getHeight();
        String actualEyeColor = person.getEyeColor();
        String actualHobby = person.getHobby();
        String actualRelationshipStatus= person.getRelationshipStatus();

        Assert.assertEquals(expectedName,actualName);
      Assert.assertEquals(expectedAge, actualAge);
      Assert.assertEquals(expectedEyeColor, actualEyeColor);
      Assert.assertEquals(expectedGraduationYear, actualGraduationYear);
      Assert.assertEquals(expectedHeight, actualHeight);


        assertEquals(expectedHobby,actualHobby);
        assertEquals(expectedRelationshipStatus, actualRelationshipStatus);
    }
   @Test
   public void testConstructorWithEyeColor(){
        String expected = "brown";
        Person person = new Person(expected);
        String actual = person.getEyeColor();
        assertEquals(expected,actual);
   }
   @Test
   public void testConstructorWithGraduationYear(){
        Integer expected = 2033;
        Person person = new Person();
        Integer actual = person.getGraduationYear();
        assertEquals(expected,actual);
   }
   @Test
   public void testConstructorWithHobby(){
        String expected = "Basketball";
        Person person = new Person();
        String actual = person.getHobby();
        assertEquals(expected, actual);
   }
   @Test
   public void testConstructorWithHeight(){
        double expected = 3.25;
        Person person = new Person();
        double actual = person.getHeight();
        assertEquals(actual,expected,0.1);
   }
   @Test
   public void testConstructorWithRelationShipStatus(){
        String expected= " single";
        Person person = new Person();
        String actual= person.getRelationshipStatus();
        assertEquals(expected,actual);
   }
    @Test
    public void testConstructorWithName() {
        // Given
         String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAgeAndNewFields() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Double expectedHeight = 3.25;
        Integer expectedGraduationYear = 2033;
        String expectedEyeColor = "brown";
        String expectedRelationshipStatus = "single";
        String expectedHobby = "basketball";
        // When
        Person person = new Person( expectedName, expectedAge, expectedHeight,expectedGraduationYear,expectedEyeColor,
                expectedRelationshipStatus, expectedHobby);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        assertEquals(expectedAge, actualAge);
        assertEquals(expectedName, actualName);
    }
@Test
public void testSetHobby(){
        Person person = new Person();
        String expected = "Basketball";
        person.setName(expected);
        String actual = person.getHobby();
        assertEquals(expected, actual);
}
    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        assertEquals(expected,actual);
    }

}
