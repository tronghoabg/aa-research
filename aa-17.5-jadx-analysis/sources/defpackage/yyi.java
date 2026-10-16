package defpackage;

/* loaded from: classes.dex */
public enum yyi implements abnz {
    UNKNOWN(0),
    ALPHA(1),
    BETA(2),
    PROD(3),
    INTERNAL_BETA(4);

    public final int f;

    yyi(int i) {
        this.f = i;
    }

    public static yyi b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ALPHA;
        }
        if (i == 2) {
            return BETA;
        }
        if (i == 3) {
            return PROD;
        }
        if (i != 4) {
            return null;
        }
        return INTERNAL_BETA;
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
