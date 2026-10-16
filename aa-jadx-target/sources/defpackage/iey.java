package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class iey implements ifd {
    private final int a;
    private final int b;
    public ien c;

    public iey(int i, int i2) {
        if (!defpackage.igg.j(i, i2)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bn(i2, i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.a = i;
        this.b = i2;
    }

    public final ien d() {
        return this.c;
    }

    public final void e(ifc ifcVar) {
        ifcVar.e(this.a, this.b);
    }

    public final void h(ien ienVar) {
        this.c = ienVar;
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void l() {
    }

    public void b(android.graphics.drawable.Drawable drawable) {
    }

    public final void f(android.graphics.drawable.Drawable drawable) {
    }

    public final void g(ifc ifcVar) {
    }
}
