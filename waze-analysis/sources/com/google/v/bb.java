package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bb implements eg {
    ENUM_TYPE_UNKNOWN(0),
    OPEN(1),
    CLOSED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12706e;

    bb(int i2) {
        this.f12706e = i2;
    }

    public static bb a(int i2) {
        if (i2 == 0) {
            return ENUM_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return OPEN;
        }
        if (i2 != 2) {
            return null;
        }
        return CLOSED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12706e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12706e);
    }
}
