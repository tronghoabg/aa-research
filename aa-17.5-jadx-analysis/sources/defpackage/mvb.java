package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class mvb extends Fragment {
    public final aezr a = woy.dG(new hfr(esa.a, this, 10, null));

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        kmf kmfVar = new kmf(requireContext());
        kmfVar.j();
        kmfVar.a(new cct(1883012953, true, new msw(this, 14)));
        return kmfVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        opr.a.a().f.startListening();
    }

    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        super.onStop();
        opr.a.a().f.stopListening();
    }
}
