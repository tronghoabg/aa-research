package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class LazyLayoutMeasuredItemProvider<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private final MutableIntObjectMap<List<Placeable>> placeablesCache = IntObjectMapKt.mutableIntObjectMapOf();

    /* renamed from: getAndMeasure--hBUhpc */
    public abstract T mo2890getAndMeasurehBUhpc(int i2, int i3, int i4, long j2);

    /* renamed from: getPlaceables-3p2s80s, reason: not valid java name */
    public final List<Placeable> m2953getPlaceables3p2s80s(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j2) {
        List<Placeable> list = this.placeablesCache.get(i2);
        if (list != null) {
            return list;
        }
        List<Measurable> listCompose = lazyLayoutMeasureScope.compose(i2);
        int size = listCompose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(listCompose.get(i3).mo9741measureBRTryo0(j2));
        }
        ArrayList arrayList2 = arrayList;
        this.placeablesCache.set(i2, arrayList2);
        return arrayList2;
    }
}
