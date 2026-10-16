package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acjm implements defpackage.abpb {
    SPHERICAL(3),
    CUBIC(4);

    public final int c;

    acjm(int i) {
        this.c = i;
    }

    public static defpackage.acjm b(int i) {
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
        return this.c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.c);
    }
}
