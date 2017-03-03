package com.volly.player;

/**
 * User: Poyan Gerami Email: poyan.gerami@eniro.com Date: 2017-02-28
 */
public class Player {
    private final String firstName;
    private final String lastName;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
