package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class klt extends Fragment {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.NoVideoFocusFragment");

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        ((ype) b.l().ai((char) 3192)).u("onCreate");
        kmu.a(mki.a.c).edit().putBoolean("SHOWN_NO_VIDEO_FOCUS_SCREEN_KEY", true).apply();
        ebf.j().o(yzz.LOCK_SCREEN, yzy.jq);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.car_intro_fragment, viewGroup, false);
        viewInflate.findViewById(R.id.dismiss).setOnClickListener(new kep(this, 2));
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        bc activity = getActivity();
        activity.getWindow().setStatusBarColor(-1);
        activity.getWindow().setNavigationBarColor(-1);
        activity.getWindow().getDecorView().setSystemUiVisibility(8208);
    }
}
