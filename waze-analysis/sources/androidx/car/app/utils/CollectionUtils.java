package androidx.car.app.utils;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static <T> List<T> emptyIfNull(List<T> list) {
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public static <T> List<T> unmodifiableCopy(List<T> list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> unmodifiableCopy(Map<K, V> map) {
        return map == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(map));
    }
}
