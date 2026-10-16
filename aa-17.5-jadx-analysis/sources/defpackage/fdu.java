package defpackage;

import android.view.ViewGroup;

/* loaded from: classes2.dex */
final class fdu extends fge {
    boolean a = false;
    final ViewGroup b;

    public fdu(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void a(fgc fgcVar) {
        fgr.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void b(fgc fgcVar) {
        if (!this.a) {
            fgr.a(this.b, false);
        }
        fgcVar.P(this);
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void d() {
        fgr.a(this.b, false);
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void e() {
        fgr.a(this.b, true);
    }
}
