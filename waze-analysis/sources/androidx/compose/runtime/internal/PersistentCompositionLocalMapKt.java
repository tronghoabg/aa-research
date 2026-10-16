package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import h.a.r;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PersistentCompositionLocalMapKt {
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap persistentCompositionLocalHashMapOf(k<? extends CompositionLocal<Object>, ? extends ValueHolder<Object>>... kVarArr) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builderBuilder2 = PersistentCompositionLocalHashMap.Companion.getEmpty().builder2();
        r.v(builderBuilder2, kVarArr);
        return builderBuilder2.build2();
    }

    public static final PersistentCompositionLocalHashMap persistentCompositionLocalHashMapOf() {
        return PersistentCompositionLocalHashMap.Companion.getEmpty();
    }
}
