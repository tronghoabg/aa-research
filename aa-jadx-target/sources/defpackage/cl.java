package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cl implements defpackage.epu, defpackage.fbm, defpackage.esa {
    public defpackage.eqi a = null;
    public defpackage.fbl b = null;
    private final android.support.v4.app.Fragment c;
    private final defpackage.erz d;
    private final java.lang.Runnable e;
    private defpackage.erw f;

    public cl(android.support.v4.app.Fragment fragment, defpackage.erz erzVar, java.lang.Runnable runnable) {
        this.c = fragment;
        this.d = erzVar;
        this.e = runnable;
    }

    public final void a(defpackage.epw epwVar) {
        this.a.e(epwVar);
    }

    public final void b() {
        if (this.a == null) {
            this.a = new defpackage.eqi(this, true);
            defpackage.fbl fblVarH = defpackage.ebq.h(this);
            this.b = fblVarH;
            fblVarH.a();
            this.e.run();
        }
    }

    @Override // defpackage.epu
    public final defpackage.esi getDefaultViewModelCreationExtras() {
        android.app.Application application;
        android.support.v4.app.Fragment fragment = this.c;
        android.content.Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof android.content.ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                break;
            }
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        defpackage.esk eskVar = new defpackage.esk((byte[]) null);
        if (application != null) {
            eskVar.b(defpackage.erv.b, application);
        }
        eskVar.b(defpackage.erm.a, fragment);
        eskVar.b(defpackage.erm.b, this);
        if (fragment.getArguments() != null) {
            eskVar.b(defpackage.erm.c, fragment.getArguments());
        }
        return eskVar;
    }

    @Override // defpackage.epu
    public final defpackage.erw getDefaultViewModelProviderFactory() {
        android.app.Application application;
        android.support.v4.app.Fragment fragment = this.c;
        defpackage.erw defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f == null) {
            android.content.Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            this.f = new defpackage.ern(application, fragment, fragment.getArguments());
        }
        return this.f;
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        b();
        return this.a;
    }

    @Override // defpackage.fbm
    public final defpackage.fbk getSavedStateRegistry() {
        b();
        return (defpackage.fbk) this.b.b;
    }

    @Override // defpackage.esa
    public final defpackage.erz getViewModelStore() {
        b();
        return this.d;
    }
}
