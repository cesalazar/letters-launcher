package com.archbrey.letters;

import android.os.SystemClock;


public class LongTouchHolder {

    private static String keyString;
    private static long startTime;
    private static boolean status;

    public LongTouchHolder(){
    }

    public void setKeyString(String getKeyString){keyString = getKeyString;
    }

    public String getKeyString(){return keyString;
    }

    public void setStartTime(){ startTime = SystemClock.elapsedRealtime();
    }

    public long getStartTime(){return startTime;
    }

    public long getCurentTime(){ return SystemClock.elapsedRealtime();
    }

    public void setStatus(boolean getStatus) {status = getStatus;
    }

    public boolean getStatus() {return status;
    }

    public void reset() {
        keyString="null";
        status = false;
    } //public void reset()

}
