package defpackage;

/* loaded from: classes.dex */
final class atw extends atz {
    private final asq a;

    public atw(asq asqVar) {
        this.a = asqVar;
    }

    @Override // defpackage.atz
    public final int a(int i, int i2, dlr dlrVar, cuo cuoVar, int i3) {
        int iA = this.a.a(cuoVar);
        if (iA == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - iA;
        return dlrVar == dlr.b ? (i - i2) - i4 : i4;
    }

    @Override // defpackage.atz
    public final Integer b(cuo cuoVar) {
        return Integer.valueOf(this.a.a(cuoVar));
    }

    @Override // defpackage.atz
    public final boolean c() {
        return true;
    }
}
