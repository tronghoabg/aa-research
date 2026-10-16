package androidx.compose.material;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BottomSheetValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BottomSheetValue[] $VALUES;
    public static final BottomSheetValue Collapsed = new BottomSheetValue("Collapsed", 0);
    public static final BottomSheetValue Expanded = new BottomSheetValue("Expanded", 1);

    private static final /* synthetic */ BottomSheetValue[] $values() {
        return new BottomSheetValue[]{Collapsed, Expanded};
    }

    static {
        BottomSheetValue[] bottomSheetValueArr$values = $values();
        $VALUES = bottomSheetValueArr$values;
        $ENTRIES = b.a(bottomSheetValueArr$values);
    }

    private BottomSheetValue(String str, int i2) {
    }

    public static a<BottomSheetValue> getEntries() {
        return $ENTRIES;
    }

    public static BottomSheetValue valueOf(String str) {
        return (BottomSheetValue) Enum.valueOf(BottomSheetValue.class, str);
    }

    public static BottomSheetValue[] values() {
        return (BottomSheetValue[]) $VALUES.clone();
    }
}
