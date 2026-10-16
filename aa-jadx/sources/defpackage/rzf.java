package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class rzf {
    public final java.util.List a;
    public final defpackage.xyn b;
    public defpackage.sts c;
    public defpackage.xyn d = defpackage.xxe.a;
    public defpackage.rzs e = defpackage.rzs.a;
    public defpackage.rzq f = null;

    public rzf(java.util.List list, defpackage.xyn xynVar) {
        this.a = list;
        this.b = xynVar;
    }

    final void a(java.lang.String str, defpackage.xyn xynVar) {
        defpackage.you youVarListIterator = ((defpackage.ygw) this.a).listIterator(0);
        while (youVarListIterator.hasNext()) {
            ((defpackage.ryv) youVarListIterator.next()).v(str, xynVar);
        }
    }

    public final void b() {
        this.e = defpackage.rzs.a;
        this.f = null;
    }
}
