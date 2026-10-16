package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tez {
    private static final java.util.Map a = new java.util.WeakHashMap();

    public static java.lang.Object a(android.support.v4.app.Fragment fragment, java.lang.Class cls) {
        if (cls.isInstance(null)) {
            return null;
        }
        java.lang.Object obj = a.get(fragment);
        if (cls.isInstance(obj)) {
            return obj;
        }
        android.support.v4.app.Fragment parentFragment = fragment.getParentFragment();
        if (cls.isInstance(parentFragment)) {
            return parentFragment;
        }
        java.lang.Object host = fragment.getHost();
        if (cls.isInstance(host)) {
            return host;
        }
        if (host instanceof defpackage.tey) {
            defpackage.tey teyVar = (defpackage.tey) host;
            if (cls.isInstance(teyVar.b())) {
                return teyVar.b();
            }
        }
        defpackage.bc activity = fragment.getActivity();
        if (cls.isInstance(activity)) {
            return activity;
        }
        return null;
    }

    public static java.lang.Object b(android.support.v4.app.Fragment fragment, java.lang.Class cls) {
        java.lang.Object objA = a(fragment, cls);
        objA.getClass();
        return objA;
    }

    public static void c(android.support.v4.app.Fragment fragment, java.lang.Class cls) throws java.lang.AssertionError {
        java.lang.String name;
        if (a(fragment, cls) == null) {
            if (fragment.getParentFragment() == null) {
                name = fragment.getActivity() != null ? fragment.getActivity().getClass().getName() : fragment.getHost().getClass().getName();
            } else {
                name = fragment.getParentFragment().getClass().getName();
            }
            throw new java.lang.AssertionError(fragment.getClass().getName() + " must be added to a parent that implements " + cls.getName() + ". Instead found " + name);
        }
    }
}
