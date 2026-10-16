package com.google.w.c.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum g implements eg {
    UNKNOWN(0),
    INT8(1),
    INT16(2),
    INT32(3),
    INT64(4),
    UINT8(5),
    UINT16(6),
    UINT32(7),
    UINT64(8),
    FLOAT(9),
    DOUBLE(10),
    BYTES_OR_UTF8_STRING(11),
    UTF16_STRING(12);

    private static final eh n = new e();
    private final int p;

    g(int i2) {
        this.p = i2;
    }

    public static eh a() {
        return n;
    }

    public static g b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return INT8;
            case 2:
                return INT16;
            case 3:
                return INT32;
            case 4:
                return INT64;
            case 5:
                return UINT8;
            case 6:
                return UINT16;
            case 7:
                return UINT32;
            case 8:
                return UINT64;
            case 9:
                return FLOAT;
            case 10:
                return DOUBLE;
            case 11:
                return BYTES_OR_UTF8_STRING;
            case 12:
                return UTF16_STRING;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
