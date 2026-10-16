package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nsz extends Fragment {
    public nsz() {
        super(R.layout.navigation_fallback_fragment_missing_apps);
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SYSTEM_UI, yzy.f).l());
        View viewFindViewById = view.findViewById(R.id.find_apps_button);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new nmp(view, 8));
        }
        ksa.d().e.fE(getViewLifecycleOwner(), new mmt(view, 20));
    }
}
