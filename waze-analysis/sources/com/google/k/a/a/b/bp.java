package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bp implements com.google.v.eg {
    UNKNOWN(0),
    BOGUS(1),
    PRIVATE(2),
    PRIVATE_MUST_PURGE(11),
    SPAM(3),
    UNSUPPORTED(4),
    PENDING(5),
    DUPLICATE(6),
    OLD_SCHEMA(8),
    REPLACED(9),
    ROLLED_BACK(10),
    LEGAL_TRADEMARK(12),
    LEGAL_OTHER(13);

    private final int o;

    bp(int i2) {
        this.o = i2;
    }

    public static bp a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return BOGUS;
            case 2:
                return PRIVATE;
            case 3:
                return SPAM;
            case 4:
                return UNSUPPORTED;
            case 5:
                return PENDING;
            case 6:
                return DUPLICATE;
            case 7:
            default:
                return null;
            case 8:
                return OLD_SCHEMA;
            case 9:
                return REPLACED;
            case 10:
                return ROLLED_BACK;
            case 11:
                return PRIVATE_MUST_PURGE;
            case 12:
                return LEGAL_TRADEMARK;
            case 13:
                return LEGAL_OTHER;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
