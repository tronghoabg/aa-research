package defpackage;

import android.os.RemoteException;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class rnl implements roo {
    final /* synthetic */ rnw a;

    public rnl(rnw rnwVar) {
        this.a = rnwVar;
    }

    @Override // defpackage.roo
    public final void a() {
        this.a.k();
    }

    @Override // defpackage.roo
    public final void b(Surface surface) {
        qxy qxyVar = this.a.i;
        if (qxyVar != null) {
            try {
                qxyVar.s(surface);
            } catch (RemoteException unused) {
                rrd.d(5, "CAR.PROJECTION.CAHI", null, "%s Failed to release surface", this.a.t);
            }
        }
    }

    @Override // defpackage.roo
    public final void c() {
        rnw rnwVar = this.a;
        reh rehVar = rnwVar.w;
        if (rehVar != null) {
            rehVar.J(rnwVar.C);
        }
        View view = rnwVar.s;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        rrd.a("CAR.PROJECTION.CAHI", null, "Removing contentView from parent on UI stop");
        ((ViewGroup) rnwVar.s.getParent()).removeView(rnwVar.s);
    }
}
