package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum aj implements eg {
    STRING_TYPE_UNKNOWN(0),
    VIEW(1),
    CORD(2),
    STRING(3),
    STRING_PIECE(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f12669g;

    aj(int i2) {
        this.f12669g = i2;
    }

    public static aj a(int i2) {
        if (i2 == 0) {
            return STRING_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return VIEW;
        }
        if (i2 == 2) {
            return CORD;
        }
        if (i2 == 3) {
            return STRING;
        }
        if (i2 != 4) {
            return null;
        }
        return STRING_PIECE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12669g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12669g);
    }
}
