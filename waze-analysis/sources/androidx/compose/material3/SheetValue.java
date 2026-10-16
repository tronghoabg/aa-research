package androidx.compose.material3;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SheetValue {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SheetValue[] $VALUES;
    public static final SheetValue Hidden = new SheetValue("Hidden", 0);
    public static final SheetValue Expanded = new SheetValue("Expanded", 1);
    public static final SheetValue PartiallyExpanded = new SheetValue("PartiallyExpanded", 2);

    private static final /* synthetic */ SheetValue[] $values() {
        return new SheetValue[]{Hidden, Expanded, PartiallyExpanded};
    }

    static {
        SheetValue[] sheetValueArr$values = $values();
        $VALUES = sheetValueArr$values;
        $ENTRIES = b.a(sheetValueArr$values);
    }

    private SheetValue(String str, int i2) {
    }

    public static a<SheetValue> getEntries() {
        return $ENTRIES;
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) $VALUES.clone();
    }
}
