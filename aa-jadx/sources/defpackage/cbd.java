package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cbd {
    public final int b;
    public final int c;

    public cbd(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    protected abstract void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar);

    protected defpackage.bzh b(defpackage.cbg cbgVar) {
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String simpleName = defpackage.afgw.a.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }
}
