package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.util.Log;
import java.util.Set;

/* loaded from: classes.dex */
public final class enj {
    public static final /* synthetic */ int a = 0;
    private static final eni b = eni.a;

    public static final void a(Fragment fragment, String str) {
        fragment.getClass();
        eng engVar = new eng(fragment, str);
        d(engVar);
        eni eniVarB = b(fragment);
        if (eniVarB.b.contains(enh.c) && e(eniVarB, fragment.getClass(), engVar.getClass())) {
            c(eniVarB, engVar);
        }
    }

    public static final eni b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.getParentFragment();
        }
        return b;
    }

    public static final void c(eni eniVar, ent entVar) {
        Fragment fragment = entVar.a;
        String name = fragment.getClass().getName();
        Set set = eniVar.b;
        if (set.contains(enh.a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(String.valueOf(name)), entVar);
        }
        if (set.contains(enh.b)) {
            af afVar = new af(name, entVar, 20);
            if (!fragment.isAdded()) {
                afVar.run();
                return;
            }
            Handler handler = fragment.getParentFragmentManager().m.d;
            if (affa.f(handler.getLooper(), Looper.myLooper())) {
                afVar.run();
            } else {
                handler.post(afVar);
            }
        }
    }

    public static final void d(ent entVar) {
        if (bt.ac(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(String.valueOf(entVar.a.getClass().getName())), entVar);
        }
    }

    public static final boolean e(eni eniVar, Class cls, Class cls2) {
        Set set = (Set) eniVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (affa.f(cls2.getSuperclass(), ent.class) || !woy.cn(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
