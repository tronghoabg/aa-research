package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class eqr extends epi {
    final /* synthetic */ eqt a;

    public eqr(eqt eqtVar) {
        this.a = eqtVar;
    }

    @Override // defpackage.epi, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = era.b;
            activity.getClass();
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((era) fragmentFindFragmentByTag).a = this.a.h;
        }
    }

    @Override // defpackage.epi, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        eqt eqtVar = this.a;
        int i = eqtVar.c - 1;
        eqtVar.c = i;
        if (i == 0) {
            eqtVar.e.postDelayed(eqtVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        eqs.a(activity, new eqq(this));
    }

    @Override // defpackage.epi, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        r0.b--;
        this.a.c();
    }
}
