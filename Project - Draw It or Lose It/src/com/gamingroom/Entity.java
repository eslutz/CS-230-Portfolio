package com.gamingroom;

/**
 * A simple class with id and name for use in classes
 *
 * @author eric.slutz@snuh.edu
 *
 */
public class Entity {
    private long id;
    private String name;

    /**
     * Hide the default constructor to prevent creating empty instances.
     */
    private Entity() {
    }

    /**
     * Constructor with an identifier and name
     */
    public Entity(long id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the id
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Returns the name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns id and name in a formatted string
     *
     * @return string of id and name
     */
    @Override
    public String toString() {

        return "[id=" + id + ", name=" + name + "]";
    }
}
