package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class afud {
    private static final ConcurrentMap<afvv, WeakReference<agjq>> moduleByClassLoader = new ConcurrentHashMap();

    public static final void clearModuleByClassLoaderCache() {
        moduleByClassLoader.clear();
    }

    public static final agjq getOrCreateModule(Class<?> cls) {
        cls.getClass();
        ClassLoader safeClassLoader = agkc.getSafeClassLoader(cls);
        afvv afvvVar = new afvv(safeClassLoader);
        ConcurrentMap<afvv, WeakReference<agjq>> concurrentMap = moduleByClassLoader;
        WeakReference<agjq> weakReference = concurrentMap.get(afvvVar);
        if (weakReference != null) {
            agjq agjqVar = weakReference.get();
            if (agjqVar != null) {
                return agjqVar;
            }
            concurrentMap.remove(afvvVar, weakReference);
        }
        agjq agjqVarCreate = agjq.Companion.create(safeClassLoader);
        while (true) {
            try {
                ConcurrentMap<afvv, WeakReference<agjq>> concurrentMap2 = moduleByClassLoader;
                WeakReference<agjq> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(afvvVar, new WeakReference<>(agjqVarCreate));
                if (weakReferencePutIfAbsent == null) {
                    return agjqVarCreate;
                }
                agjq agjqVar2 = weakReferencePutIfAbsent.get();
                if (agjqVar2 != null) {
                    return agjqVar2;
                }
                concurrentMap2.remove(afvvVar, weakReferencePutIfAbsent);
            } finally {
                afvvVar.setTemporaryStrongRef(null);
            }
        }
    }
}
