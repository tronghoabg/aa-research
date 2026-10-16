package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bdi {
    public static final /* synthetic */ int a = 0;
    private static java.lang.Boolean b;
    private static final defpackage.bvm c = new defpackage.byu(new defpackage.acm(16));

    public static final boolean a(int i) {
        if (i >= 8 && i < 1000) {
            java.lang.Boolean boolValueOf = b;
            if (boolValueOf == null) {
                boolValueOf = java.lang.Boolean.valueOf(java.lang.Runtime.getRuntime().availableProcessors() >= 4);
                b = boolValueOf;
            }
            boolValueOf.getClass();
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void b(final defpackage.dfb dfbVar, final defpackage.dgd dgdVar, final defpackage.wde wdeVar, final java.util.List list, final boolean z, defpackage.bve bveVar) {
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) bveVar.f(c);
        if (executor == null || !a(dfbVar.a())) {
            bveVar.v(317137883);
            ((defpackage.bwc) bveVar).Y(false);
            return;
        }
        bveVar.v(315439796);
        final defpackage.dlz dlzVar = (defpackage.dlz) bveVar.f(defpackage.dbl.i);
        final defpackage.dlo dloVar = (defpackage.dlo) bveVar.f(defpackage.dbl.d);
        try {
            executor.execute(new java.lang.Runnable() { // from class: bdg
                @Override // java.lang.Runnable
                public final void run() {
                    int i = defpackage.bdi.a;
                    defpackage.dgd dgdVar2 = dgdVar;
                    defpackage.dlz dlzVar2 = dlzVar;
                    defpackage.dlo dloVar2 = dloVar;
                    defpackage.wde wdeVar2 = wdeVar;
                    defpackage.dfb dfbVar2 = dfbVar;
                    defpackage.ced cedVarM = defpackage.bzd.m(null, null);
                    try {
                        defpackage.cej cejVarW = cedVarM.w();
                        try {
                            defpackage.dgd dgdVarF = defpackage.dax.f(dgdVar2, dlzVar2);
                            java.util.List list2 = list;
                            if (list2 == null) {
                                list2 = defpackage.afce.a;
                            }
                            defpackage.dfj dfjVar = new defpackage.dfj(dfbVar2, dgdVarF, list2, dloVar2, wdeVar2);
                            dfjVar.a();
                            dfjVar.b();
                            defpackage.cer.i.k(cejVarW);
                            cedVarM.c().a();
                            cedVarM.d();
                        } catch (java.lang.Throwable th) {
                            defpackage.cer.i.k(cejVarW);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            cedVarM.d();
                            throw th3;
                        }
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        }
        ((defpackage.bwc) bveVar).Y(false);
    }

    public static final void c(final java.lang.String str, final defpackage.dgd dgdVar, final defpackage.wde wdeVar, boolean z, defpackage.bve bveVar) {
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) bveVar.f(c);
        if (executor == null || !a(str.length())) {
            bveVar.v(-1248455541);
            ((defpackage.bwc) bveVar).Y(false);
            return;
        }
        bveVar.v(-1250263182);
        final defpackage.dlz dlzVar = (defpackage.dlz) bveVar.f(defpackage.dbl.i);
        final defpackage.dlo dloVar = (defpackage.dlo) bveVar.f(defpackage.dbl.d);
        try {
            executor.execute(new java.lang.Runnable() { // from class: bdh
                @Override // java.lang.Runnable
                public final void run() {
                    int i = defpackage.bdi.a;
                    defpackage.wde wdeVar2 = wdeVar;
                    defpackage.dgd dgdVar2 = dgdVar;
                    defpackage.dlz dlzVar2 = dlzVar;
                    defpackage.dlo dloVar2 = dloVar;
                    java.lang.String str2 = str;
                    defpackage.ced cedVarM = defpackage.bzd.m(null, null);
                    try {
                        defpackage.cej cejVarW = cedVarM.w();
                        try {
                            defpackage.dgd dgdVarF = defpackage.dax.f(dgdVar2, dlzVar2);
                            defpackage.afce afceVar = defpackage.afce.a;
                            defpackage.dew dewVar = new defpackage.dew(str2, dgdVarF, afceVar, afceVar, wdeVar2, dloVar2);
                            dewVar.a();
                            dewVar.b();
                            defpackage.cer.i.k(cejVarW);
                            cedVarM.c().a();
                            cedVarM.d();
                        } catch (java.lang.Throwable th) {
                            defpackage.cer.i.k(cejVarW);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            cedVarM.d();
                            throw th3;
                        }
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        }
        ((defpackage.bwc) bveVar).Y(false);
    }
}
