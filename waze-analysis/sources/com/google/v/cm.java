package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum cm implements eg {
    NONE(0),
    INTEGRITY(1),
    PRIVACY_AND_INTEGRITY(2),
    STRONG_PRIVACY_AND_INTEGRITY(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f12827f;

    cm(int i2) {
        this.f12827f = i2;
    }

    public static cm a(int i2) {
        if (i2 == 0) {
            return NONE;
        }
        if (i2 == 1) {
            return INTEGRITY;
        }
        if (i2 == 2) {
            return PRIVACY_AND_INTEGRITY;
        }
        if (i2 != 3) {
            return null;
        }
        return STRONG_PRIVACY_AND_INTEGRITY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12827f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12827f);
    }
}
