package androidx.compose.material3.internal;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SwipeEdge {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SwipeEdge[] $VALUES;
    public static final SwipeEdge Left = new SwipeEdge("Left", 0);
    public static final SwipeEdge Right = new SwipeEdge("Right", 1);
    public static final SwipeEdge None = new SwipeEdge("None", 2);

    private static final /* synthetic */ SwipeEdge[] $values() {
        return new SwipeEdge[]{Left, Right, None};
    }

    static {
        SwipeEdge[] swipeEdgeArr$values = $values();
        $VALUES = swipeEdgeArr$values;
        $ENTRIES = b.a(swipeEdgeArr$values);
    }

    private SwipeEdge(String str, int i2) {
    }

    public static a<SwipeEdge> getEntries() {
        return $ENTRIES;
    }

    public static SwipeEdge valueOf(String str) {
        return (SwipeEdge) Enum.valueOf(SwipeEdge.class, str);
    }

    public static SwipeEdge[] values() {
        return (SwipeEdge[]) $VALUES.clone();
    }
}
