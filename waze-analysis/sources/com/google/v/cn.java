package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum cn implements eg {
    MESSAGE(0),
    BYTE(1),
    BYTEGRACE(2),
    AUTOMATIC(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f12833f;

    cn(int i2) {
        this.f12833f = i2;
    }

    public static cn a(int i2) {
        if (i2 == 0) {
            return MESSAGE;
        }
        if (i2 == 1) {
            return BYTE;
        }
        if (i2 == 2) {
            return BYTEGRACE;
        }
        if (i2 != 3) {
            return null;
        }
        return AUTOMATIC;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12833f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12833f);
    }
}
