#Autor: Yair Alexander Tobar Caro
@stories
Feature: Add new Shipper
  As an admin, with the correct credentials, I want to be able to add a new Shipper in Northwind module.
  @scenario2
  Scenario: Add a new Shipper to the Shippers section.
    Given than Alex, a registered admin of the StartSharp application, wants to add a new Shipper
    When he navigates to Shippers section and fills out the form to add a new Shipper
    Then he should see the new Shipper added to the list of shippers
