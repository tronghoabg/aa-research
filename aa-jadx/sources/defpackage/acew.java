package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acew implements defpackage.abpb {
    UNKNOWN_NAVIGATION_SDK_LOG_MECHANISM(0),
    UE3_ONLY(1),
    CLEARCUT_ONLY(2),
    UE3_AND_CLEARCUT(3);

    private final int f;

    acew(int i) {
        this.f = i;
    }

    public static defpackage.acew b(int i) {
        if (i == 0) {
            return UNKNOWN_NAVIGATION_SDK_LOG_MECHANISM;
        }
        if (i == 1) {
            return UE3_ONLY;
        }
        if (i == 2) {
            return CLEARCUT_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return UE3_AND_CLEARCUT;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
