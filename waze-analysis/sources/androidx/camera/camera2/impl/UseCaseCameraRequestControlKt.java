package androidx.camera.camera2.impl;

import androidx.camera.core.impl.TagBundle;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraRequestControlKt {
    public static final int DEFAULT_REQUEST_TEMPLATE = 1;

    public static final Map<String, Object> toMap(TagBundle tagBundle) {
        x.f(tagBundle, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setListKeys = tagBundle.listKeys();
        x.e(setListKeys, "listKeys(...)");
        for (String str : setListKeys) {
            Object tag = tagBundle.getTag(str);
            x.d(tag, "null cannot be cast to non-null type kotlin.Any");
            linkedHashMap.put(str, tag);
        }
        return linkedHashMap;
    }
}
