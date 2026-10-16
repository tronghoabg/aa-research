package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acjh implements defpackage.abpb {
    SPHERICAL(3),
    CUBIC(4);

    private final int d;

    acjh(int i) {
        this.d = i;
    }

    public static defpackage.acjh b(int i) {
        if (i == 3) {
            return SPHERICAL;
        }
        if (i != 4) {
            return null;
        }
        return CUBIC;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
