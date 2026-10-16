package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ju implements com.google.v.eg {
    COMPONENT_TYPE_POSITIVE(0),
    COMPONENT_TYPE_MISSING_DATA(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f11641d;

    ju(int i2) {
        this.f11641d = i2;
    }

    public static ju a(int i2) {
        if (i2 == 0) {
            return COMPONENT_TYPE_POSITIVE;
        }
        if (i2 != 1) {
            return null;
        }
        return COMPONENT_TYPE_MISSING_DATA;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11641d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11641d);
    }
}
