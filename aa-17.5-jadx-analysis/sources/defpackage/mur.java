package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class mur extends msk {
    public final aezr a;
    private final aezr b;

    public mur() {
        aezr aezrVarDH = woy.dH(3, new ahq(new ahq(this, 9), 10));
        this.a = ebi.i(affw.b(oqc.class), new ahq(aezrVarDH, 11), new ahq(aezrVarDH, 12), new hfr(this, aezrVarDH, 9));
        this.b = woy.dG(new hfr(esa.a, this, 8, null));
    }

    public final mtz b() {
        return (mtz) this.b.a();
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        if (printWriter != null) {
            printWriter.println("EarthDashboardWidgetFragment");
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        b().a(!a());
        kmf kmfVar = new kmf(requireContext());
        kmfVar.j();
        kmfVar.a(new cct(1767556499, true, new msw(this, 11)));
        return kmfVar;
    }
}
