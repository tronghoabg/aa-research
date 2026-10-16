package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum w implements com.google.v.eg {
    NONE(0),
    STRING(1),
    INTEGER(2),
    DOUBLE(3),
    BOOLEAN(4),
    PROTO_VALUE(5),
    INT64(6),
    FLOAT(7),
    DISPLAY_ONLY(8),
    UINT32(9),
    ENUM_ID(10);

    private final int m;

    w(int i2) {
        this.m = i2;
    }

    public static w a(int i2) {
        switch (i2) {
            case 0:
                return NONE;
            case 1:
                return STRING;
            case 2:
                return INTEGER;
            case 3:
                return DOUBLE;
            case 4:
                return BOOLEAN;
            case 5:
                return PROTO_VALUE;
            case 6:
                return INT64;
            case 7:
                return FLOAT;
            case 8:
                return DISPLAY_ONLY;
            case 9:
                return UINT32;
            case 10:
                return ENUM_ID;
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
