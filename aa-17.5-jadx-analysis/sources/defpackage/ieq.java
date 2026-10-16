package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class ieq implements iev {
    private final int a;
    private final int b;
    public ief c;

    public ieq(int i, int i2) {
        if (!ify.j(i, i2)) {
            throw new IllegalArgumentException(a.bo(i2, i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.iev
    public final ief d() {
        return this.c;
    }

    @Override // defpackage.iev
    public final void e(ieu ieuVar) {
        ieuVar.e(this.a, this.b);
    }

    @Override // defpackage.iev
    public final void h(ief iefVar) {
        this.c = iefVar;
    }

    @Override // defpackage.idh
    public final void j() {
    }

    @Override // defpackage.idh
    public final void k() {
    }

    @Override // defpackage.idh
    public final void l() {
    }

    @Override // defpackage.iev
    public void b(Drawable drawable) {
    }

    @Override // defpackage.iev
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.iev
    public final void g(ieu ieuVar) {
    }
}
