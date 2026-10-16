package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class kmh extends Fragment {
    public abstract void a(bux buxVar, int i);

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        if (!acpc.z()) {
            super.onConfigurationChanged(configuration);
            View view = getView();
            if (view != null) {
                view.dispatchConfigurationChanged(configuration);
                return;
            }
            return;
        }
        if ((configuration.uiMode & 15) == 3) {
            super.onConfigurationChanged(configuration);
            View view2 = getView();
            if (view2 != null) {
                view2.dispatchConfigurationChanged(configuration);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        kmf kmfVar = new kmf(requireContext());
        kmfVar.j();
        kmfVar.a(new cct(699830172, true, new cuz(this, 11)));
        return kmfVar;
    }
}
