package defpackage;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ua {
    public static int a(defpackage.cxu cxuVar, defpackage.csf csfVar) {
        defpackage.cxu cxuVarN = cxuVar.N();
        if (cxuVarN == null) {
            defpackage.csc.c(defpackage.a.bl(cxuVar, "Child of ", " cannot be null when calculating alignment line"));
        }
        if (cxuVar.K().f().containsKey(csfVar)) {
            java.lang.Integer num = (java.lang.Integer) cxuVar.K().f().get(csfVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iDJ = cxuVarN.dJ(csfVar);
        if (iDJ == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = cxuVar.l;
        boolean z2 = cxuVar.m;
        cxuVarN.l = true;
        cxuVar.m = true;
        cxuVar.S();
        cxuVarN.l = z;
        cxuVar.m = z2;
        return iDJ + ((int) (csfVar instanceof defpackage.csu ? cxuVarN.I() & 4294967295L : cxuVarN.I() >> 32));
    }

    public static int b(defpackage.cxe cxeVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.c(new defpackage.cxd(cxeVar), cszVar, csyVar, i);
    }

    public static int c(defpackage.cxe cxeVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.d(new defpackage.cxd(cxeVar), cszVar, csyVar, i);
    }

    public static int d(defpackage.cxe cxeVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.e(new defpackage.cxd(cxeVar), cszVar, csyVar, i);
    }

    public static int e(defpackage.cxe cxeVar, defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.f(new defpackage.cxd(cxeVar), cszVar, csyVar, i);
    }

    public static long f(float f, boolean z, boolean z2) {
        return (true != z ? 0L : 1L) | (true == z2 ? 2L : 0L) | (((long) java.lang.Float.floatToRawIntBits(f)) << 32);
    }

    public static android.view.View g(defpackage.cwn cwnVar) {
        if (!cwnVar.M().A) {
            defpackage.csc.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (android.view.View) defpackage.cxo.a(defpackage.cjv.r(cwnVar));
    }
}
