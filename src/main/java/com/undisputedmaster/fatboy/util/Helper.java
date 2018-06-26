package com.undisputedmaster.fatboy.util;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by Swapnil.Khandizod on 26-06-2018.
 */
public class Helper {
    public static UUID getRandomUUID(){
        return UUID.randomUUID();
    }
    public static LocalDateTime getCurrentTime(){
        return LocalDateTime.now();
    }
}
