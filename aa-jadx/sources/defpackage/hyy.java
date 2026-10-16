package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hyy implements defpackage.hvf {
    private final android.content.res.Resources.Theme a;
    private final android.content.res.Resources b;
    private final defpackage.hyz c;
    private final int d;
    private java.lang.Object e;

    public hyy(android.content.res.Resources.Theme theme, android.content.res.Resources resources, defpackage.hyz hyzVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = hyzVar;
        this.d = i;
    }

    @Override // defpackage.hvf
    public final java.lang.Class a() {
        return this.c.a();
    }

    @Override // defpackage.hvf
    public final void c() {
        java.lang.Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // defpackage.hvf
    public final void d(defpackage.hsq hsqVar, defpackage.hve hveVar) {
        try {
            java.lang.Object objC = this.c.c(this.a, this.b, this.d);
            this.e = objC;
            hveVar.f(objC);
        } catch (android.content.res.Resources.NotFoundException e) {
            hveVar.g(e);
        }
    }

    @Override // defpackage.hvf
    public final int e() {
        return 1;
    }

    @Override // defpackage.hvf
    public final void b() {
    }
}
