package com.workp.amal.homeshop;

public interface Writer {

    /**
     * Start writing process
     */
    public void start();


    /**
     * Write on line
     * @param line
     */
    public void writeLine (String line);


    /**
     * Stop Writing process
     */
    public void stop ();
}
