package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ck implements eg {
    TCP(0),
    UDP(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f12812d;

    ck(int i2) {
        this.f12812d = i2;
    }

    public static ck a(int i2) {
        if (i2 == 0) {
            return TCP;
        }
        if (i2 != 1) {
            return null;
        }
        return UDP;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12812d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12812d);
    }
}
