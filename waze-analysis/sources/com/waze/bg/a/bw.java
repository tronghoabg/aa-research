package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bw implements com.google.v.eg {
    POLICE_UNSPECIFIED(0),
    POLICE_DEFAULT(1),
    POLICE_HIDDEN(2),
    POLICE_MOBILE_CAMERA(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f16467f;

    bw(int i2) {
        this.f16467f = i2;
    }

    public static com.google.v.ei a() {
        return o.q;
    }

    public static bw b(int i2) {
        if (i2 == 0) {
            return POLICE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return POLICE_DEFAULT;
        }
        if (i2 == 2) {
            return POLICE_HIDDEN;
        }
        if (i2 != 3) {
            return null;
        }
        return POLICE_MOBILE_CAMERA;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16467f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16467f);
    }
}
