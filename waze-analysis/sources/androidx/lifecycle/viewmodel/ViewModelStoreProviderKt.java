package androidx.lifecycle.viewmodel;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelStoreProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> ScatterMap<K, V> toScatterMap(ScatterMap<K, V> scatterMap) {
        if (scatterMap.isEmpty()) {
            return ScatterMapKt.emptyScatterMap();
        }
        MutableScatterMap mutableScatterMap = new MutableScatterMap(scatterMap.getSize());
        mutableScatterMap.putAll(scatterMap);
        return mutableScatterMap;
    }
}
