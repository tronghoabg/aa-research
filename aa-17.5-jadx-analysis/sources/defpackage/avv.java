package defpackage;

/* loaded from: classes.dex */
public final class avv {
    private static final ctp a = new avw(atd.a, cfl.m);

    public static final ctp a(asw aswVar, cfr cfrVar, bux buxVar, int i) {
        if (affa.f(aswVar, atd.a) && affa.f(cfrVar, cfl.m)) {
            buxVar.v(-1073830487);
            buxVar.o();
            return a;
        }
        buxVar.v(-1073779616);
        boolean z = ((((i & 14) ^ 6) > 4 && buxVar.C(aswVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && buxVar.C(cfrVar)) || (i & 48) == 32);
        Object objG = buxVar.g();
        if (z || objG == buw.a) {
            objG = new avw(aswVar, cfrVar);
            buxVar.x(objG);
        }
        avw avwVar = (avw) objG;
        buxVar.o();
        return avwVar;
    }

    public static final long b(boolean z, int i, int i2, int i3) {
        return !z ? dlf.d(i, i2, 0, i3) : dlf.u(i, i2, 0, i3);
    }
}
