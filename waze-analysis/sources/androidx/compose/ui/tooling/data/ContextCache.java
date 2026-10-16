package androidx.compose.ui.tooling.data;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ContextCache {
    public static final int $stable = 8;
    private final Map<String, Object> contexts = new LinkedHashMap();

    public final void clear() {
        this.contexts.clear();
    }

    public final Map<String, Object> getContexts$ui_tooling_data() {
        return this.contexts;
    }
}
