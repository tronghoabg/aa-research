package defpackage;

import android.support.v4.app.Fragment;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class tec {
    private static final Map a = new WeakHashMap();

    public static Object a(Fragment fragment, Class cls) {
        if (cls.isInstance(null)) {
            return null;
        }
        Object obj = a.get(fragment);
        if (cls.isInstance(obj)) {
            return obj;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (cls.isInstance(parentFragment)) {
            return parentFragment;
        }
        Object host = fragment.getHost();
        if (cls.isInstance(host)) {
            return host;
        }
        if (host instanceof teb) {
            teb tebVar = (teb) host;
            if (cls.isInstance(tebVar.b())) {
                return tebVar.b();
            }
        }
        bc activity = fragment.getActivity();
        if (cls.isInstance(activity)) {
            return activity;
        }
        return null;
    }

    public static Object b(Fragment fragment, Class cls) {
        Object objA = a(fragment, cls);
        objA.getClass();
        return objA;
    }

    public static void c(Fragment fragment, Class cls) throws AssertionError {
        if (a(fragment, cls) == null) {
            String name = fragment.getParentFragment() == null ? fragment.getActivity() != null ? fragment.getActivity().getClass().getName() : fragment.getHost().getClass().getName() : fragment.getParentFragment().getClass().getName();
            throw new AssertionError(fragment.getClass().getName() + " must be added to a parent that implements " + cls.getName() + ". Instead found " + name);
        }
    }
}
