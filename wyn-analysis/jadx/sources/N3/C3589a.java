package n3;

import A7.AbstractC0279p0;
import R8.v;
import android.os.Bundle;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1444h;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3589a implements InterfaceC1455t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40902a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40903b;

    public /* synthetic */ C3589a(Object obj, int i5) {
        this.f40902a = i5;
        this.f40903b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f40902a) {
            case 0:
                if (enumC1449m != EnumC1449m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC1457v.getLifecycle().c(this);
                f fVar = (f) this.f40903b;
                Bundle bundleA = fVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C3589a.class.getClassLoader()).asSubclass(InterfaceC3590b.class);
                        AbstractC3340k.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                                AbstractC3340k.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof f0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                e0 viewModelStore = ((f0) fVar).getViewModelStore();
                                C3592d savedStateRegistry = fVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f18667a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    AbstractC3340k.e(key, "key");
                                    b0 b0Var = (b0) linkedHashMap.get(key);
                                    AbstractC3340k.b(b0Var);
                                    V.a(b0Var, savedStateRegistry, fVar.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e7) {
                                throw new RuntimeException(v.f("Failed to instantiate ", str), e7);
                            }
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                        }
                    } catch (ClassNotFoundException e11) {
                        throw new RuntimeException(AbstractC0279p0.l("Class ", str, " wasn't found"), e11);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC1444h[] interfaceC1444hArr = (InterfaceC1444h[]) this.f40903b;
                if (interfaceC1444hArr.length > 0) {
                    InterfaceC1444h interfaceC1444h = interfaceC1444hArr[0];
                    throw null;
                }
                if (interfaceC1444hArr.length <= 0) {
                    return;
                }
                InterfaceC1444h interfaceC1444h2 = interfaceC1444hArr[0];
                throw null;
            default:
                if (enumC1449m != EnumC1449m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC1449m).toString());
                }
                interfaceC1457v.getLifecycle().c(this);
                ((W) this.f40903b).b();
                return;
        }
    }
}
