package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum aceh implements defpackage.abpb {
    UNKNOWN_UE3_REPORTER_FLUSH_STRATEGY(0),
    NONE(1),
    SEQUENTIAL_ON_UI_THREAD(2),
    WAIT_ON_UI_THREAD(3);

    private final int f;

    aceh(int i) {
        this.f = i;
    }

    public static defpackage.aceh b(int i) {
        if (i == 0) {
            return UNKNOWN_UE3_REPORTER_FLUSH_STRATEGY;
        }
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return SEQUENTIAL_ON_UI_THREAD;
        }
        if (i != 3) {
            return null;
        }
        return WAIT_ON_UI_THREAD;
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
