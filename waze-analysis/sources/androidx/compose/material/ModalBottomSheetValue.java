package androidx.compose.material;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ModalBottomSheetValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ModalBottomSheetValue[] $VALUES;
    public static final ModalBottomSheetValue Hidden = new ModalBottomSheetValue("Hidden", 0);
    public static final ModalBottomSheetValue Expanded = new ModalBottomSheetValue("Expanded", 1);
    public static final ModalBottomSheetValue HalfExpanded = new ModalBottomSheetValue("HalfExpanded", 2);

    private static final /* synthetic */ ModalBottomSheetValue[] $values() {
        return new ModalBottomSheetValue[]{Hidden, Expanded, HalfExpanded};
    }

    static {
        ModalBottomSheetValue[] modalBottomSheetValueArr$values = $values();
        $VALUES = modalBottomSheetValueArr$values;
        $ENTRIES = b.a(modalBottomSheetValueArr$values);
    }

    private ModalBottomSheetValue(String str, int i2) {
    }

    public static a<ModalBottomSheetValue> getEntries() {
        return $ENTRIES;
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) $VALUES.clone();
    }
}
