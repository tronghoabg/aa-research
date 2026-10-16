package defpackage;

import android.app.Activity;

/* loaded from: classes2.dex */
final class eqq extends epi {
    final /* synthetic */ eqr a;

    public eqq(eqr eqrVar) {
        this.a = eqrVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.a.a.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        this.a.a.b();
    }
}
