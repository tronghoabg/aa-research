package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hr implements com.google.v.eg {
    PRICE_FORMAT_DEFAULT(0),
    PRICE_FORMAT_VARIES(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f11951d;

    hr(int i2) {
        this.f11951d = i2;
    }

    public static hr a(int i2) {
        if (i2 == 0) {
            return PRICE_FORMAT_DEFAULT;
        }
        if (i2 != 1) {
            return null;
        }
        return PRICE_FORMAT_VARIES;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11951d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11951d);
    }
}
