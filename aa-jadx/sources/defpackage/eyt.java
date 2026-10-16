package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eyt {
    protected abstract java.lang.String a();

    protected abstract void b(defpackage.fbr fbrVar, java.lang.Object obj);

    public final void c(defpackage.fch fchVar, java.lang.Object obj) throws java.lang.Exception {
        defpackage.fbr fbrVarA = fchVar.a(a());
        try {
            b(fbrVarA, obj);
            fbrVarA.k();
            defpackage.afga.m(fbrVarA, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.afga.m(fbrVarA, th);
                throw th2;
            }
        }
    }
}
