package androidx.car.app.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static <T> List<T> emptyIfNull(List<T> list) {
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public static <K, V> Map<K, V> unmodifiableCopy(Map<K, V> map) {
        return map == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(map));
    }

    public static <T> List<T> unmodifiableCopy(List<T> list) {
        return list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
    }
}
