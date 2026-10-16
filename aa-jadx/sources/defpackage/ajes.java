package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajes {
    public final java.lang.Object a;
    public final defpackage.affh b;
    public java.lang.Object c;
    public int d = -1;
    private final defpackage.affh e;
    private final java.lang.Object f;

    public ajes(java.lang.Object obj, defpackage.affh affhVar, defpackage.affh affhVar2, java.lang.Object obj2) {
        this.a = obj;
        this.b = affhVar;
        this.e = affhVar2;
        this.f = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [affg, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) {
        return this.f.invoke(obj, afdkVar);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        return this.e.invoke(this.a, null, obj);
    }

    public final void c() {
        java.lang.Object obj = this.c;
        if (obj instanceof defpackage.ajcv) {
            ((defpackage.ajcv) obj).k(this.d);
            return;
        }
        defpackage.aivn aivnVar = obj instanceof defpackage.aivn ? (defpackage.aivn) obj : null;
        if (aivnVar != null) {
            aivnVar.gK();
        }
    }
}
