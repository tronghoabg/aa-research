package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class col {
    private defpackage.affc a;

    public defpackage.affc b() {
        return this.a;
    }

    public abstract void c(defpackage.cml cmlVar);

    public void h(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    public final void q() {
        defpackage.affc affcVarB = b();
        if (affcVarB != null) {
            affcVarB.invoke(this);
        }
    }
}
