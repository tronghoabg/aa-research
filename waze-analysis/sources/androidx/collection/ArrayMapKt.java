package androidx.collection;

import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ArrayMapKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> ArrayMap<K, V> arrayMapOf(k<? extends K, ? extends V>... kVarArr) {
        x.f(kVarArr, "pairs");
        ArrayMap<K, V> arrayMap = new ArrayMap<>(kVarArr.length);
        for (k<? extends K, ? extends V> kVar : kVarArr) {
            arrayMap.put(kVar.c(), kVar.d());
        }
        return arrayMap;
    }

    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }
}
