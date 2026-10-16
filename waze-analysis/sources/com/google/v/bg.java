package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bg implements eg {
    REPEATED_FIELD_ENCODING_UNKNOWN(0),
    PACKED(1),
    EXPANDED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12732e;

    bg(int i2) {
        this.f12732e = i2;
    }

    public static bg a(int i2) {
        if (i2 == 0) {
            return REPEATED_FIELD_ENCODING_UNKNOWN;
        }
        if (i2 == 1) {
            return PACKED;
        }
        if (i2 != 2) {
            return null;
        }
        return EXPANDED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12732e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12732e);
    }
}
