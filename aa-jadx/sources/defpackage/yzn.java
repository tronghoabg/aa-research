package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum yzn implements defpackage.abpb {
    UNKNOWN(0),
    ALPHA(1),
    BETA(2),
    PROD(3),
    INTERNAL_BETA(4);

    public final int f;

    yzn(int i) {
        this.f = i;
    }

    public static defpackage.yzn b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
