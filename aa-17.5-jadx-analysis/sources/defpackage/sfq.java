package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class sfq extends sfw {
    final sfo a = new sfo();
    rjg b;

    public static sfq a(boolean z, boolean z2) {
        sfq sfqVar = new sfq();
        Bundle bundle = new Bundle();
        bundle.putBoolean("PreSetupIntroFragment.isKeyguardLocked", z);
        bundle.putBoolean("PreSetupIntroFragment.showRetryMessage", z2);
        sfqVar.setArguments(bundle);
        return sfqVar;
    }

    @Override // defpackage.sfw
    public final yzz b() {
        return requireArguments().getBoolean("PreSetupIntroFragment.isKeyguardLocked", false) ? yzz.FRX_PRESETUP_INTRO_LOCKED : requireArguments().getBoolean("PreSetupIntroFragment.showRetryMessage", false) ? yzz.FRX_PRESETUP_INTRO_DOWNLOAD_RETRY : yzz.FRX_PRESETUP_INTRO;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onActivityCreated */
    public final void m105lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m105lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        if (this.b == null) {
            Context contextRequireContext = requireContext();
            erb erbVar = c().g;
            erbVar.getClass();
            this.b = new rjg(contextRequireContext, (shk) new sfp(erbVar, 0));
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sfo sfoVar = this.a;
        sfoVar.setArguments(getArguments());
        sfoVar.f(getChildFragmentManager(), "pre_setup_intro_dialog");
        return null;
    }

    @Override // defpackage.sfw, android.support.v4.app.Fragment
    public final void onStart() {
        rjg rjgVar = this.b;
        spu.aw(rjgVar);
        rjgVar.e(b());
        super.onStart();
    }
}
