package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class vly extends Fragment {
    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        setHasOptionsMenu(true);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.primes_settings_fragment, viewGroup, false);
        Switch r1 = (Switch) viewInflate.findViewById(R.id.enable_always_on_network_tracing_switch);
        r1.setChecked(vlp.a.get());
        r1.setOnCheckedChangeListener(new vlx());
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
    }
}
