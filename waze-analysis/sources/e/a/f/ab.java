package e.a.f;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab<T> extends LinkedHashMap<String, T> {
    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<String, T> entry) {
        return size() > 100;
    }
}
