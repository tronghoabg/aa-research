package androidx.lifecycle;

import Ef.I0;
import a9.C1341a;
import a9.C1342b;
import android.os.Bundle;
import android.view.View;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3589a;
import n3.C3592d;
import n3.InterfaceC3591c;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final C1342b f18636a = new C1342b();

    /* renamed from: b, reason: collision with root package name */
    public static final ab.b f18637b = new ab.b();

    /* renamed from: c, reason: collision with root package name */
    public static final C1341a f18638c = new C1341a();

    public static final void a(b0 b0Var, C3592d registry, AbstractC1451o lifecycle) {
        AutoCloseable autoCloseable;
        AbstractC3340k.e(registry, "registry");
        AbstractC3340k.e(lifecycle, "lifecycle");
        I1.a aVar = b0Var.f18657a;
        if (aVar != null) {
            synchronized (aVar.f5277a) {
                autoCloseable = (AutoCloseable) aVar.f5278b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        U u10 = (U) autoCloseable;
        if (u10 == null || u10.f18635c) {
            return;
        }
        u10.a(lifecycle, registry);
        EnumC1450n enumC1450nB = lifecycle.b();
        if (enumC1450nB == EnumC1450n.f18677b || enumC1450nB.compareTo(EnumC1450n.f18679d) >= 0) {
            registry.d();
        } else {
            lifecycle.a(new C1442f(lifecycle, registry));
        }
    }

    public static T b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new T();
            }
            HashMap map = new HashMap();
            for (String key : bundle2.keySet()) {
                AbstractC3340k.d(key, "key");
                map.put(key, bundle2.get(key));
            }
            return new T(map);
        }
        ClassLoader classLoader = T.class.getClassLoader();
        AbstractC3340k.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = parcelableArrayList.get(i5);
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i5));
        }
        return new T(linkedHashMap);
    }

    public static final T c(H1.c cVar) {
        C1342b c1342b = f18636a;
        LinkedHashMap linkedHashMap = cVar.f4871a;
        n3.f fVar = (n3.f) linkedHashMap.get(c1342b);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        f0 f0Var = (f0) linkedHashMap.get(f18637b);
        if (f0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f18638c);
        String str = (String) linkedHashMap.get(I1.b.f5281a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC3591c interfaceC3591cB = fVar.getSavedStateRegistry().b();
        W w2 = interfaceC3591cB instanceof W ? (W) interfaceC3591cB : null;
        if (w2 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = g(f0Var).f18643b;
        T t10 = (T) linkedHashMap2.get(str);
        if (t10 != null) {
            return t10;
        }
        Class[] clsArr = T.f18627f;
        w2.b();
        Bundle bundle2 = w2.f18641c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = w2.f18641c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = w2.f18641c;
        if (bundle5 != null && bundle5.isEmpty()) {
            w2.f18641c = null;
        }
        T tB = b(bundle3, bundle);
        linkedHashMap2.put(str, tB);
        return tB;
    }

    public static final void d(n3.f fVar) {
        EnumC1450n enumC1450nB = fVar.getLifecycle().b();
        if (enumC1450nB != EnumC1450n.f18677b && enumC1450nB != EnumC1450n.f18678c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().b() == null) {
            W w2 = new W(fVar.getSavedStateRegistry(), (f0) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", w2);
            fVar.getLifecycle().a(new C3589a(w2, 2));
        }
    }

    public static final InterfaceC1457v e(View view) {
        AbstractC3340k.e(view, "<this>");
        return (InterfaceC1457v) Af.n.X(Af.n.d0(Af.n.a0(view, g0.f18671j), g0.k));
    }

    public static final C1453q f(InterfaceC1457v interfaceC1457v) {
        AbstractC3340k.e(interfaceC1457v, "<this>");
        AbstractC1451o lifecycle = interfaceC1457v.getLifecycle();
        AbstractC3340k.e(lifecycle, "<this>");
        while (true) {
            AtomicReference atomicReference = lifecycle.f18682a;
            C1453q c1453q = (C1453q) atomicReference.get();
            if (c1453q != null) {
                return c1453q;
            }
            I0 i0F = Ef.H.f();
            Lf.e eVar = Ef.S.f3698a;
            C1453q c1453q2 = new C1453q(lifecycle, Fe.e.O(i0F, Jf.n.f6132a.f4117e));
            while (!atomicReference.compareAndSet(null, c1453q2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            Lf.e eVar2 = Ef.S.f3698a;
            Ef.H.D(c1453q2, Jf.n.f6132a.f4117e, new C1452p(c1453q2, null), 2);
            return c1453q2;
        }
    }

    public static final X g(f0 f0Var) {
        ad.r rVar = new ad.r();
        e0 store = f0Var.getViewModelStore();
        H1.b defaultCreationExtras = f0Var instanceof InterfaceC1445i ? ((InterfaceC1445i) f0Var).getDefaultViewModelCreationExtras() : H1.a.f4870b;
        AbstractC3340k.e(store, "store");
        AbstractC3340k.e(defaultCreationExtras, "defaultCreationExtras");
        return (X) new G9.e(store, rVar, defaultCreationExtras).v("androidx.lifecycle.internal.SavedStateHandlesVM", Fe.b.B(X.class));
    }

    public static final void h(View view, InterfaceC1457v interfaceC1457v) {
        AbstractC3340k.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1457v);
    }

    public static final void i(View view, f0 f0Var) {
        AbstractC3340k.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, f0Var);
    }
}
