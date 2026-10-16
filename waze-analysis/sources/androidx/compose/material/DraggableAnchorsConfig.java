package androidx.compose.material;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final Map<T, Float> anchors = new LinkedHashMap();

    public final void at(T t, float f2) {
        this.anchors.put(t, Float.valueOf(f2));
    }

    public final Map<T, Float> getAnchors$material() {
        return this.anchors;
    }
}
