package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum dx implements com.google.v.eg {
    NOT_BULK_UPDATABLE(0),
    BULK_UPDATABLE(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f11761d;

    dx(int i2) {
        this.f11761d = i2;
    }

    public static dx a(int i2) {
        if (i2 == 0) {
            return NOT_BULK_UPDATABLE;
        }
        if (i2 != 1) {
            return null;
        }
        return BULK_UPDATABLE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11761d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11761d);
    }
}
