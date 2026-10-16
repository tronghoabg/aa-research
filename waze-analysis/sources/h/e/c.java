package h.e;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f48070a;

    static {
        h.e.b.b bVar = new h.e.b.b();
        try {
            f48070a = bVar;
        } catch (ClassCastException e2) {
            ClassLoader classLoader = bVar.getClass().getClassLoader();
            ClassLoader classLoader2 = b.class.getClassLoader();
            if (x.n(classLoader, classLoader2)) {
                throw e2;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e2);
        }
    }
}
