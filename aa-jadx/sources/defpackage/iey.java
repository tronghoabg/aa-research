package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class iey implements defpackage.ifd {
    private final int a;
    private final int b;
    public defpackage.ien c;

    public iey(int i, int i2) {
        if (!defpackage.igg.j(i, i2)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bn(i2, i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ifd
    public final defpackage.ien d() {
        return this.c;
    }

    @Override // defpackage.ifd
    public final void e(defpackage.ifc ifcVar) {
        ifcVar.e(this.a, this.b);
    }

    @Override // defpackage.ifd
    public final void h(defpackage.ien ienVar) {
        this.c = ienVar;
    }

    @Override // defpackage.idq
    public final void j() {
    }

    @Override // defpackage.idq
    public final void k() {
    }

    @Override // defpackage.idq
    public final void l() {
    }

    @Override // defpackage.ifd
    public void b(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.ifd
    public final void f(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.ifd
    public final void g(defpackage.ifc ifcVar) {
    }
}
