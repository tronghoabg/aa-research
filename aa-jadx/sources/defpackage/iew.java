package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class iew implements defpackage.ifd {
    private defpackage.ien a;

    @Override // defpackage.ifd
    public defpackage.ien d() {
        return this.a;
    }

    @Override // defpackage.ifd
    public void e(defpackage.ifc ifcVar) {
        if (!defpackage.igg.j(256, 256)) {
            throw new java.lang.IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: 256 and height: 256, either provide dimensions in the constructor or call override()");
        }
        ifcVar.e(256, 256);
    }

    @Override // defpackage.ifd
    public void h(defpackage.ien ienVar) {
        this.a = ienVar;
    }

    @Override // defpackage.idq
    public final void j() {
    }

    @Override // defpackage.idq
    public void k() {
    }

    @Override // defpackage.idq
    public void l() {
    }

    @Override // defpackage.ifd
    public void a(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.ifd
    public void b(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.ifd
    public void f(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.ifd
    public void g(defpackage.ifc ifcVar) {
    }
}
