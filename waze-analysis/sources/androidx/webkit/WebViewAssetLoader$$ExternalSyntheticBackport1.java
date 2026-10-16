package androidx.webkit;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class WebViewAssetLoader$$ExternalSyntheticBackport1 {
    public static /* synthetic */ Map m(Map.Entry[] entryArr) {
        HashMap map = new HashMap(entryArr.length);
        for (Map.Entry entry : entryArr) {
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                java.util.Objects.toString(objRequireNonNull);
                throw new IllegalArgumentException("duplicate key: ".concat(String.valueOf(objRequireNonNull)));
            }
        }
        return DesugarCollections.unmodifiableMap(map);
    }
}
