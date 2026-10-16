package androidx.datastore.preferences.core;

import h.a.i;
import h.g.b.x;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Actual_jvmAndroidKt {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        x.f(set, "set");
        Set<T> setUnmodifiableSet = DesugarCollections.unmodifiableSet(i.au(set));
        x.e(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        x.f(map, "map");
        Map<K, V> mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
        x.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public static final ab ioDispatcher() {
        return av.b();
    }
}
