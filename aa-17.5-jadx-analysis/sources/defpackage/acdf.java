package defpackage;

/* loaded from: classes3.dex */
public enum acdf implements abnz {
    UNKNOWN_UE3_REPORTER_FLUSH_STRATEGY(0),
    NONE(1),
    SEQUENTIAL_ON_UI_THREAD(2),
    WAIT_ON_UI_THREAD(3);

    private final int f;

    acdf(int i) {
        this.f = i;
    }

    public static acdf b(int i) {
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

    @Override // defpackage.abnz
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
