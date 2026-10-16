package androidx.compose.ui.focus;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CustomDestinationResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CustomDestinationResult[] $VALUES;
    public static final CustomDestinationResult None = new CustomDestinationResult("None", 0);
    public static final CustomDestinationResult Cancelled = new CustomDestinationResult("Cancelled", 1);
    public static final CustomDestinationResult Redirected = new CustomDestinationResult("Redirected", 2);
    public static final CustomDestinationResult RedirectCancelled = new CustomDestinationResult("RedirectCancelled", 3);

    private static final /* synthetic */ CustomDestinationResult[] $values() {
        return new CustomDestinationResult[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    static {
        CustomDestinationResult[] customDestinationResultArr$values = $values();
        $VALUES = customDestinationResultArr$values;
        $ENTRIES = b.a(customDestinationResultArr$values);
    }

    private CustomDestinationResult(String str, int i2) {
    }

    public static a<CustomDestinationResult> getEntries() {
        return $ENTRIES;
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) $VALUES.clone();
    }
}
