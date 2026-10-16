package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1445i;
import java.util.LinkedHashMap;
import n3.C3592d;

/* loaded from: classes.dex */
public final class w0 implements InterfaceC1445i, n3.f, androidx.lifecycle.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final F f18558a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.e0 f18559b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC1431u f18560c;

    /* renamed from: d, reason: collision with root package name */
    public C1459x f18561d = null;

    /* renamed from: e, reason: collision with root package name */
    public n3.e f18562e = null;

    public w0(F f10, androidx.lifecycle.e0 e0Var, RunnableC1431u runnableC1431u) {
        this.f18558a = f10;
        this.f18559b = e0Var;
        this.f18560c = runnableC1431u;
    }

    public final void a(EnumC1449m enumC1449m) {
        this.f18561d.f(enumC1449m);
    }

    public final void b() {
        if (this.f18561d == null) {
            this.f18561d = new C1459x(this);
            n3.e eVar = new n3.e(this);
            this.f18562e = eVar;
            eVar.a();
            this.f18560c.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC1445i
    public final H1.b getDefaultViewModelCreationExtras() {
        Application application;
        F f10 = this.f18558a;
        Context applicationContext = f10.requireContext().getApplicationContext();
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
        H1.c cVar = new H1.c();
        LinkedHashMap linkedHashMap = cVar.f4871a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.c0.f18661d, application);
        }
        linkedHashMap.put(androidx.lifecycle.V.f18636a, f10);
        linkedHashMap.put(androidx.lifecycle.V.f18637b, this);
        if (f10.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.V.f18638c, f10.getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC1457v
    public final AbstractC1451o getLifecycle() {
        b();
        return this.f18561d;
    }

    @Override // n3.f
    public final C3592d getSavedStateRegistry() {
        b();
        return this.f18562e.f40911b;
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.e0 getViewModelStore() {
        b();
        return this.f18559b;
    }
}
