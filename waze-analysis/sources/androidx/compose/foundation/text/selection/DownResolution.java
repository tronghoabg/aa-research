package androidx.compose.foundation.text.selection;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DownResolution {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DownResolution[] $VALUES;
    public static final DownResolution Up = new DownResolution("Up", 0);
    public static final DownResolution Drag = new DownResolution("Drag", 1);
    public static final DownResolution Timeout = new DownResolution("Timeout", 2);
    public static final DownResolution Cancel = new DownResolution("Cancel", 3);

    private static final /* synthetic */ DownResolution[] $values() {
        return new DownResolution[]{Up, Drag, Timeout, Cancel};
    }

    static {
        DownResolution[] downResolutionArr$values = $values();
        $VALUES = downResolutionArr$values;
        $ENTRIES = b.a(downResolutionArr$values);
    }

    private DownResolution(String str, int i2) {
    }

    public static a<DownResolution> getEntries() {
        return $ENTRIES;
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) $VALUES.clone();
    }
}
