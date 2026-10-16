package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eqw extends defpackage.epo {
    final /* synthetic */ defpackage.eqx a;

    public eqw(defpackage.eqx eqxVar) {
        this.a = eqxVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(android.app.Activity activity) {
        this.a.a.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(android.app.Activity activity) {
        this.a.a.b();
    }
}
