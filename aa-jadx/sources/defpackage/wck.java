package defpackage;

/* JADX INFO: loaded from: classes.dex */
abstract class wck implements defpackage.wdf {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.wdo c;

    public wck(java.lang.String str, java.lang.String str2, defpackage.wdo wdoVar) {
        this.a = str;
        this.b = str2;
        this.c = wdoVar;
    }

    protected abstract java.lang.Object b(java.lang.Object obj) throws java.io.IOException;

    protected abstract java.lang.Object c(java.lang.String str) throws java.io.IOException;

    protected java.lang.Object e() {
        return null;
    }

    protected abstract java.lang.Object f(defpackage.wba wbaVar);

    @Override // defpackage.wdf, defpackage.xzi
    public final java.lang.Object fF() {
        defpackage.wba wbaVarA;
        boolean z;
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.wba.a;
        defpackage.wbc.e = true;
        if (defpackage.wbc.f == null) {
            defpackage.wbc.f = new defpackage.wbb();
        }
        android.content.Context context = (android.content.Context) defpackage.wba.a.get();
        if (context == null) {
            synchronized (defpackage.wbc.a) {
                z = defpackage.wbc.b;
            }
            if (!z) {
                throw new java.lang.IllegalStateException("Must call PhenotypeContext.setContext() first");
            }
            wbaVarA = null;
        } else {
            wbaVarA = defpackage.wba.a(context);
        }
        java.lang.Object objF = f(wbaVarA);
        objF.getClass();
        return objF;
    }

    @Override // defpackage.wdf
    public final java.lang.Object fG(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        java.lang.Object objF = f(defpackage.wba.a(applicationContext));
        objF.getClass();
        return objF;
    }

    protected final java.lang.Object fH(java.lang.String str) {
        try {
            return c(str);
        } catch (java.io.IOException | java.lang.IllegalArgumentException e) {
            android.util.Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }
}
