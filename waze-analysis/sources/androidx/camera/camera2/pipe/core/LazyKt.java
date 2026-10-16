package androidx.camera.camera2.pipe.core;

import android.os.Trace;
import h.a.i;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import h.h;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LazyKt {
    public static final <T> f<List<T>> lazyOrEmptyList(final String str, final a<? extends List<? extends T>> aVar) {
        x.f(str, "blockName");
        x.f(aVar, "block");
        return g.b(h.f48131b, new a<List>() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrEmptyList$$inlined$lazyOrEmptyList$1
            @Override // h.g.a.a
            public final List invoke() {
                String str2 = str;
                try {
                    a aVar2 = aVar;
                    try {
                        Trace.beginSection(str2);
                        List listH = (List) aVar2.invoke();
                        if (listH == null) {
                            listH = i.h();
                        }
                        return listH;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, "Failed to get " + str2 + "! Caching [] and ignoring exception.", th);
                    }
                    return i.h();
                }
            }
        });
    }

    public static final <T> f<Set<T>> lazyOrEmptySet(final String str, final a<? extends Set<? extends T>> aVar) {
        x.f(str, "blockName");
        x.f(aVar, "block");
        return g.b(h.f48131b, new a<Set>() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrEmptySet$$inlined$lazyOrEmptySet$1
            @Override // h.g.a.a
            public final Set invoke() {
                String str2 = str;
                try {
                    a aVar2 = aVar;
                    try {
                        Trace.beginSection(str2);
                        Set setP = (Set) aVar2.invoke();
                        if (setP == null) {
                            setP = e.c.d.a.p();
                        }
                        return setP;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, "Failed to get " + str2 + "! Caching {} and ignoring exception.", th);
                    }
                    return e.c.d.a.p();
                }
            }
        });
    }

    public static final f<Boolean> lazyOrFalse(final String str, final a<Boolean> aVar) {
        x.f(str, "blockName");
        x.f(aVar, "block");
        return g.b(h.f48131b, new a<Boolean>() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrFalse$$inlined$lazyOrFalse$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h.g.a.a
            public final Boolean invoke() {
                boolean zBooleanValue;
                String str2 = str;
                try {
                    a aVar2 = aVar;
                    try {
                        Trace.beginSection(str2);
                        zBooleanValue = ((Boolean) aVar2.invoke()).booleanValue();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, "Failed to get " + str2 + "! Caching false and ignoring exception.", th2);
                    }
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    public static final <T> f<T> lazyOrNull(final String str, final a<? extends T> aVar) {
        x.f(str, "blockName");
        x.f(aVar, "block");
        return g.b(h.f48131b, new a() { // from class: androidx.camera.camera2.pipe.core.LazyKt$lazyOrNull$$inlined$lazyOrNull$1
            @Override // h.g.a.a
            public final Object invoke() {
                a aVar2 = aVar;
                try {
                    Trace.beginSection(str);
                    return aVar2.invoke();
                } finally {
                    Trace.endSection();
                }
            }
        });
    }

    public static final <T> f<List<T>> lazyOrEmptyList(final a<String> aVar, final a<? extends List<? extends T>> aVar2) {
        x.f(aVar, "blockNameFn");
        x.f(aVar2, "block");
        return g.b(h.f48131b, new a<List>() { // from class: androidx.camera.camera2.pipe.core.LazyKt.lazyOrEmptyList.1
            @Override // h.g.a.a
            public final List invoke() {
                String strInvoke = aVar.invoke();
                try {
                    a<List> aVar3 = aVar2;
                    try {
                        Trace.beginSection(strInvoke);
                        List listInvoke = aVar3.invoke();
                        if (listInvoke == null) {
                            listInvoke = i.h();
                        }
                        return listInvoke;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, "Failed to get " + strInvoke + "! Caching [] and ignoring exception.", th);
                    }
                    return i.h();
                }
            }
        });
    }

    public static final <T> f<Set<T>> lazyOrEmptySet(final a<String> aVar, final a<? extends Set<? extends T>> aVar2) {
        x.f(aVar, "blockNameFn");
        x.f(aVar2, "block");
        return g.b(h.f48131b, new a<Set>() { // from class: androidx.camera.camera2.pipe.core.LazyKt.lazyOrEmptySet.1
            @Override // h.g.a.a
            public final Set invoke() {
                String strInvoke = aVar.invoke();
                try {
                    a<Set> aVar3 = aVar2;
                    try {
                        Trace.beginSection(strInvoke);
                        Set setInvoke = aVar3.invoke();
                        if (setInvoke == null) {
                            setInvoke = e.c.d.a.p();
                        }
                        return setInvoke;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, "Failed to get " + strInvoke + "! Caching {} and ignoring exception.", th);
                    }
                    return e.c.d.a.p();
                }
            }
        });
    }

    public static final f<Boolean> lazyOrFalse(final a<String> aVar, final a<Boolean> aVar2) {
        x.f(aVar, "blockNameFn");
        x.f(aVar2, "block");
        return g.b(h.f48131b, new a<Boolean>() { // from class: androidx.camera.camera2.pipe.core.LazyKt.lazyOrFalse.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h.g.a.a
            public final Boolean invoke() {
                boolean zBooleanValue;
                String strInvoke = aVar.invoke();
                try {
                    a<Boolean> aVar3 = aVar2;
                    try {
                        Trace.beginSection(strInvoke);
                        zBooleanValue = aVar3.invoke().booleanValue();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        android.util.Log.w(Log.TAG, "Failed to get " + strInvoke + "! Caching false and ignoring exception.", th2);
                    }
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    public static final <T> f<T> lazyOrNull(final a<String> aVar, final a<? extends T> aVar2) {
        x.f(aVar, "blockNameFn");
        x.f(aVar2, "block");
        return g.b(h.f48131b, new a() { // from class: androidx.camera.camera2.pipe.core.LazyKt.lazyOrNull.1
            @Override // h.g.a.a
            public final Object invoke() {
                String strInvoke = aVar.invoke();
                a aVar3 = aVar2;
                try {
                    Trace.beginSection(strInvoke);
                    return aVar3.invoke();
                } finally {
                    Trace.endSection();
                }
            }
        });
    }
}
