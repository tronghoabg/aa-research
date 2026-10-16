package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
final class rnp implements ros {
    final /* synthetic */ rnw a;

    public rnp(rnw rnwVar) {
        this.a = rnwVar;
    }

    @Override // defpackage.ros
    public final void a() {
        this.a.k();
    }

    @Override // defpackage.ros
    public final void b(Bundle bundle) {
        qxy qxyVar = this.a.i;
        if (qxyVar != null) {
            try {
                qxyVar.y(bundle);
            } catch (RemoteException e) {
                rrd.d(5, "CAR.PROJECTION.CAHI", e, "Failed to send surface package", new Object[0]);
            }
        }
    }

    @Override // defpackage.ros
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
