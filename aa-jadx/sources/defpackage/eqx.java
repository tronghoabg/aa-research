package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eqx extends defpackage.epo {
    final /* synthetic */ defpackage.eqz a;

    public eqx(defpackage.eqz eqzVar) {
        this.a = eqzVar;
    }

    @Override // defpackage.epo, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i = defpackage.erg.b;
            activity.getClass();
            android.app.Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((defpackage.erg) fragmentFindFragmentByTag).a = this.a.h;
        }
    }

    @Override // defpackage.epo, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        defpackage.eqz eqzVar = this.a;
        int i = eqzVar.c - 1;
        eqzVar.c = i;
        if (i == 0) {
            eqzVar.e.postDelayed(eqzVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        defpackage.eqy.a(activity, new defpackage.eqw(this));
    }

    @Override // defpackage.epo, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        defpackage.eqz eqzVar = this.a;
        eqzVar.b--;
        eqzVar.c();
    }
}
