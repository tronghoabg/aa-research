package com.google.z.b.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b implements eg {
    ID(0),
    TEXT(1),
    DATETIME(2),
    BOOLEAN(3),
    INT(4),
    RAWSTRING(5),
    URL(6),
    KEY(7),
    FLOAT(8),
    PROTO(9),
    NESTED_STRUCT(10);

    private final int m;

    b(int i2) {
        this.m = i2;
    }

    public static b a(int i2) {
        switch (i2) {
            case 0:
                return ID;
            case 1:
                return TEXT;
            case 2:
                return DATETIME;
            case 3:
                return BOOLEAN;
            case 4:
                return INT;
            case 5:
                return RAWSTRING;
            case 6:
                return URL;
            case 7:
                return KEY;
            case 8:
                return FLOAT;
            case 9:
                return PROTO;
            case 10:
                return NESTED_STRUCT;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
