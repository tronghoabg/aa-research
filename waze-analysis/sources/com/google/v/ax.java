package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ax implements eg {
    DECLARATION(0),
    UNVERIFIED(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f12686d;

    ax(int i2) {
        this.f12686d = i2;
    }

    public static ax a(int i2) {
        if (i2 == 0) {
            return DECLARATION;
        }
        if (i2 != 1) {
            return null;
        }
        return UNVERIFIED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12686d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12686d);
    }
}
