package defpackage;

import android.graphics.drawable.Drawable;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ieo implements iev {
    private ief a;

    @Override // defpackage.iev
    public ief d() {
        return this.a;
    }

    @Override // defpackage.iev
    public void e(ieu ieuVar) {
        if (!ify.j(256, 256)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: 256 and height: 256, either provide dimensions in the constructor or call override()");
        }
        ieuVar.e(256, 256);
    }

    @Override // defpackage.iev
    public void h(ief iefVar) {
        this.a = iefVar;
    }

    @Override // defpackage.idh
    public final void j() {
    }

    @Override // defpackage.idh
    public void k() {
    }

    @Override // defpackage.idh
    public void l() {
    }

    @Override // defpackage.iev
    public void a(Drawable drawable) {
    }

    @Override // defpackage.iev
    public void b(Drawable drawable) {
    }

    @Override // defpackage.iev
    public void f(Drawable drawable) {
    }

    @Override // defpackage.iev
    public void g(ieu ieuVar) {
    }
}
