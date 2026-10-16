package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import n3.C3592d;

/* loaded from: classes.dex */
public final class Y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f18644a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f18645b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f18646c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1451o f18647d;

    /* renamed from: e, reason: collision with root package name */
    public final C3592d f18648e;

    public Y(Application application, n3.f fVar, Bundle bundle) {
        c0 c0Var;
        this.f18648e = fVar.getSavedStateRegistry();
        this.f18647d = fVar.getLifecycle();
        this.f18646c = bundle;
        this.f18644a = application;
        if (application != null) {
            if (c0.f18660c == null) {
                c0.f18660c = new c0(application);
            }
            c0Var = c0.f18660c;
            AbstractC3340k.b(c0Var);
        } else {
            c0Var = new c0(null);
        }
        this.f18645b = c0Var;
    }

    public final b0 a(Class cls, String str) throws Exception {
        AutoCloseable autoCloseable;
        Application application;
        AbstractC1451o abstractC1451o = this.f18647d;
        if (abstractC1451o == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC1437a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f18644a == null) ? Z.a(cls, Z.f18650b) : Z.a(cls, Z.f18649a);
        if (constructorA == null) {
            if (this.f18644a != null) {
                return this.f18645b.p(cls);
            }
            if (ae.b.f17626a == null) {
                ae.b.f17626a = new ae.b();
            }
            ae.b bVar = ae.b.f17626a;
            AbstractC3340k.b(bVar);
            return bVar.p(cls);
        }
        C3592d c3592d = this.f18648e;
        AbstractC3340k.b(c3592d);
        Bundle bundle = this.f18646c;
        Bundle bundleA = c3592d.a(str);
        Class[] clsArr = T.f18627f;
        T tB = V.b(bundleA, bundle);
        U u10 = new U(str, tB);
        u10.a(abstractC1451o, c3592d);
        EnumC1450n enumC1450nB = abstractC1451o.b();
        if (enumC1450nB == EnumC1450n.f18677b || enumC1450nB.compareTo(EnumC1450n.f18679d) >= 0) {
            c3592d.d();
        } else {
            abstractC1451o.a(new C1442f(abstractC1451o, c3592d));
        }
        b0 b0VarB = (!zIsAssignableFrom || (application = this.f18644a) == null) ? Z.b(cls, constructorA, tB) : Z.b(cls, constructorA, application, tB);
        b0VarB.getClass();
        I1.a aVar = b0VarB.f18657a;
        if (aVar == null) {
            return b0VarB;
        }
        if (aVar.f5280d) {
            I1.a.a(u10);
            return b0VarB;
        }
        synchronized (aVar.f5277a) {
            autoCloseable = (AutoCloseable) aVar.f5278b.put("androidx.lifecycle.savedstate.vm.tag", u10);
        }
        I1.a.a(autoCloseable);
        return b0VarB;
    }

    @Override // androidx.lifecycle.d0
    public final b0 j(Class cls, H1.c cVar) {
        I1.b bVar = I1.b.f5281a;
        LinkedHashMap linkedHashMap = cVar.f4871a;
        String str = (String) linkedHashMap.get(bVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(V.f18636a) == null || linkedHashMap.get(V.f18637b) == null) {
            if (this.f18647d != null) {
                return a(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(c0.f18661d);
        boolean zIsAssignableFrom = AbstractC1437a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? Z.a(cls, Z.f18650b) : Z.a(cls, Z.f18649a);
        return constructorA == null ? this.f18645b.j(cls, cVar) : (!zIsAssignableFrom || application == null) ? Z.b(cls, constructorA, V.c(cVar)) : Z.b(cls, constructorA, application, V.c(cVar));
    }

    @Override // androidx.lifecycle.d0
    public final b0 p(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.d0
    public final b0 q(KClass kClass, H1.c cVar) {
        return j(Fe.b.y(kClass), cVar);
    }
}
