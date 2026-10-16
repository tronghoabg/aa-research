package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
public final class cl implements epo, fbg, eru {
    public eqc a = null;
    public fbf b = null;
    private final Fragment c;
    private final ert d;
    private final Runnable e;
    private erq f;

    public cl(Fragment fragment, ert ertVar, Runnable runnable) {
        this.c = fragment;
        this.d = ertVar;
        this.e = runnable;
    }

    public final void a(epr eprVar) {
        this.a.e(eprVar);
    }

    public final void b() {
        if (this.a == null) {
            this.a = new eqc(this, true);
            fbf fbfVarL = ebi.l(this);
            this.b = fbfVarL;
            fbfVarL.a();
            this.e.run();
        }
    }

    @Override // defpackage.epo
    public final esc getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.c;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        ese eseVar = new ese((byte[]) null);
        if (application != null) {
            eseVar.b(erp.b, application);
        }
        eseVar.b(erg.a, fragment);
        eseVar.b(erg.b, this);
        if (fragment.getArguments() != null) {
            eseVar.b(erg.c, fragment.getArguments());
        }
        return eseVar;
    }

    @Override // defpackage.epo
    public final erq getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.c;
        erq defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f = new erh(application, fragment, fragment.getArguments());
        }
        return this.f;
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        b();
        return this.a;
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        b();
        return (fbe) this.b.b;
    }

    @Override // defpackage.eru
    public final ert getViewModelStore() {
        b();
        return this.d;
    }
}
