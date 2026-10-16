package com.google.h.c.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum m implements eg {
    NONE(0),
    NANOSECONDS(1),
    MICROSECONDS(2),
    MILLISECONDS(3),
    SECONDS(4),
    MINUTES(5),
    HOURS(6),
    DAYS(7),
    GOOGLE_TIMESTAMP(8),
    STRING(9),
    GOOGLE_INTERVAL(10),
    GOOGLE_DATE(11);

    private final int n;

    m(int i2) {
        this.n = i2;
    }

    public static m a(int i2) {
        switch (i2) {
            case 0:
                return NONE;
            case 1:
                return NANOSECONDS;
            case 2:
                return MICROSECONDS;
            case 3:
                return MILLISECONDS;
            case 4:
                return SECONDS;
            case 5:
                return MINUTES;
            case 6:
                return HOURS;
            case 7:
                return DAYS;
            case 8:
                return GOOGLE_TIMESTAMP;
            case 9:
                return STRING;
            case 10:
                return GOOGLE_INTERVAL;
            case 11:
                return GOOGLE_DATE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
