package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class bvm {
    private final defpackage.byx a;

    public bvm(defpackage.afer aferVar) {
        this.a = new defpackage.bwo(aferVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042 A[PHI: r4
  0x0042: PHI (r4v2 byx) = (r4v9 byx), (r4v10 byx) binds: [B:21:0x003f, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public static defpackage.byx d(defpackage.bxk bxkVar, defpackage.byx byxVar) {
        defpackage.bvp bvpVar;
        defpackage.byx byxVar2;
        defpackage.byv byvVar;
        defpackage.bvw bvwVar;
        defpackage.byx byxVar3 = null;
        byxVar3 = null;
        byxVar3 = null;
        byxVar3 = null;
        byxVar3 = null;
        byxVar3 = null;
        if (byxVar instanceof defpackage.bvw) {
            if (bxkVar.e) {
                bvwVar = (defpackage.bvw) byxVar;
                bvwVar.a.b(bxkVar.a());
            }
        } else if (byxVar instanceof defpackage.byv) {
            if ((bxkVar.b || bxkVar.f != null) && !bxkVar.e) {
                byvVar = (defpackage.byv) byxVar;
                if (defpackage.afga.f(bxkVar.a(), byvVar.a)) {
                    byxVar2 = bvpVar;
                    byxVar2 = byvVar;
                    byxVar3 = byxVar2;
                }
            }
        } else if (byxVar instanceof defpackage.bvp) {
            bvpVar = (defpackage.bvp) byxVar;
            if (bxkVar.d == bvpVar.a) {
                byxVar2 = bvpVar;
                byxVar2 = byvVar;
                byxVar3 = byxVar2;
            }
        }
        if (byxVar3 != null) {
            byxVar3 = bvwVar;
            return byxVar3;
        }
        if (!bxkVar.e) {
            defpackage.affc affcVar = bxkVar.d;
            if (affcVar != null) {
                byxVar3 = bvwVar;
                return new defpackage.bvp(affcVar);
            }
            byxVar3 = bvwVar;
            return new defpackage.byv(bxkVar.a());
        }
        java.lang.Object obj = bxkVar.f;
        defpackage.byo byoVar = bxkVar.c;
        if (byoVar == null) {
            byxVar3 = bvwVar;
            byoVar = defpackage.bxv.c;
        }
        byxVar3 = bvwVar;
        return new defpackage.bvw(new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, byoVar));
    }

    public defpackage.byx a() {
        return this.a;
    }

    public abstract defpackage.bxk b(java.lang.Object obj);

    public final defpackage.bxk c(java.lang.Object obj) {
        defpackage.bxk bxkVarB = b(obj);
        bxkVarB.g = false;
        return bxkVarB;
    }
}
