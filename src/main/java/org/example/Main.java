package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Starting echo server...");
        log.warn("some warning...");
        log.error("some error...");
        log.debug("some debug...");
        System.out.println("Hello world!");
    }
}