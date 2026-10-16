package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class afdy implements java.io.Serializable, defpackage.afdk, defpackage.afeb {
    public final defpackage.afdk q;

    public afdy(defpackage.afdk afdkVar) {
        this.q = afdkVar;
    }

    public defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.afeb
    public java.lang.StackTraceElement di() {
        return null;
    }

    @Override // defpackage.afeb
    public defpackage.afeb dj() {
        defpackage.afdk afdkVar = this.q;
        if (afdkVar instanceof defpackage.afeb) {
            return (defpackage.afeb) afdkVar;
        }
        return null;
    }

    protected abstract java.lang.Object hf(java.lang.Object obj);

    public java.lang.String toString() {
        return "Continuation at ".concat(java.lang.String.valueOf(getClass().getName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.afdk
    public final void w(java.lang.Object obj) {
        ?? r2 = this;
        while (true) {
            r2.getClass();
            defpackage.afdy afdyVar = (defpackage.afdy) r2;
            defpackage.afdk afdkVar = afdyVar.q;
            afdkVar.getClass();
            try {
                obj = afdyVar.hf(obj);
                if (obj == defpackage.afdr.a) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                obj = new defpackage.afav(th);
            }
            afdyVar.e();
            if (!(afdkVar instanceof defpackage.afdy)) {
                afdkVar.w(obj);
                return;
            }
            r2 = afdkVar;
        }
    }

    protected void e() {
    }
}
