package kotlin.reflect.jvm.internal.impl.utils;

import ff.o;
import ff.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class CollectionsKt {
    public static final <T> void addIfNotNull(@NotNull Collection<T> collection, @Nullable T t10) {
        AbstractC3340k.e(collection, "<this>");
        if (t10 != null) {
            collection.add(t10);
        }
    }

    private static final int capacity(int i5) {
        if (i5 < 3) {
            return 3;
        }
        return (i5 / 3) + i5 + 1;
    }

    @NotNull
    public static final <T> List<T> compact(@NotNull ArrayList<T> arrayList) {
        AbstractC3340k.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return v.f35432a;
        }
        if (size == 1) {
            return AbstractC3935e.C(o.q0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, Integer> mapToIndex(@NotNull Iterable<? extends K> iterable) {
        AbstractC3340k.e(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i5));
            i5++;
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i5) {
        return new HashMap<>(capacity(i5));
    }

    @NotNull
    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i5) {
        return new HashSet<>(capacity(i5));
    }

    @NotNull
    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i5) {
        return new LinkedHashSet<>(capacity(i5));
    }
}
