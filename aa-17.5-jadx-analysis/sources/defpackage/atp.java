package defpackage;

/* loaded from: classes.dex */
public final class atp {
    private static final ctp a = new atr(atd.c, cfl.j);

    public static final ctp a(atc atcVar, cfm cfmVar, bux buxVar, int i) {
        if (affa.f(atcVar, atd.c) && affa.f(cfmVar, cfl.j)) {
            buxVar.v(-1446604504);
            buxVar.o();
            return a;
        }
        buxVar.v(-1446550657);
        boolean z = ((((i & 14) ^ 6) > 4 && buxVar.C(atcVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && buxVar.C(cfmVar)) || (i & 48) == 32);
        Object objG = buxVar.g();
        if (z || objG == buw.a) {
            objG = new atr(atcVar, cfmVar);
            buxVar.x(objG);
        }
        atr atrVar = (atr) objG;
        buxVar.o();
        return atrVar;
    }
}
