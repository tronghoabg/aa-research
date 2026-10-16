package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class msx extends msk {
    private final aezr b = woy.dG(new hfr(esa.a, this, 5, null));
    public final xya a = new xya((xyi) oit.a().b);

    public final mtz b() {
        return (mtz) this.b.a();
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.getClass();
        View view = getView();
        view.getClass();
        ((kmf) view).h(printWriter);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        b().a(!a());
        kmf kmfVar = new kmf(requireContext());
        kmfVar.j();
        kmfVar.a(new cct(-1241725037, true, new msw(this, 4)));
        return kmfVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        view.post(new mhr(this, 13));
    }
}
