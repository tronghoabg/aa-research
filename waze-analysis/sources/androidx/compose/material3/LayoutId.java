package androidx.compose.material3;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class LayoutId {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LayoutId[] $VALUES;
    public static final LayoutId Selector = new LayoutId("Selector", 0);
    public static final LayoutId InnerCircle = new LayoutId("InnerCircle", 1);

    private static final /* synthetic */ LayoutId[] $values() {
        return new LayoutId[]{Selector, InnerCircle};
    }

    static {
        LayoutId[] layoutIdArr$values = $values();
        $VALUES = layoutIdArr$values;
        $ENTRIES = b.a(layoutIdArr$values);
    }

    private LayoutId(String str, int i2) {
    }

    public static a<LayoutId> getEntries() {
        return $ENTRIES;
    }

    public static LayoutId valueOf(String str) {
        return (LayoutId) Enum.valueOf(LayoutId.class, str);
    }

    public static LayoutId[] values() {
        return (LayoutId[]) $VALUES.clone();
    }
}
