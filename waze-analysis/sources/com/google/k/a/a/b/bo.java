package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bo implements com.google.v.eg {
    CLOSED(0),
    MOVED(1),
    REBRANDED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11169e;

    bo(int i2) {
        this.f11169e = i2;
    }

    public static bo a(int i2) {
        if (i2 == 0) {
            return CLOSED;
        }
        if (i2 == 1) {
            return MOVED;
        }
        if (i2 != 2) {
            return null;
        }
        return REBRANDED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11169e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11169e);
    }
}
