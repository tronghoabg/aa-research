package androidx.compose.material;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BackdropLayers {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BackdropLayers[] $VALUES;
    public static final BackdropLayers Back = new BackdropLayers("Back", 0);
    public static final BackdropLayers Front = new BackdropLayers("Front", 1);

    private static final /* synthetic */ BackdropLayers[] $values() {
        return new BackdropLayers[]{Back, Front};
    }

    static {
        BackdropLayers[] backdropLayersArr$values = $values();
        $VALUES = backdropLayersArr$values;
        $ENTRIES = b.a(backdropLayersArr$values);
    }

    private BackdropLayers(String str, int i2) {
    }

    public static a<BackdropLayers> getEntries() {
        return $ENTRIES;
    }

    public static BackdropLayers valueOf(String str) {
        return (BackdropLayers) Enum.valueOf(BackdropLayers.class, str);
    }

    public static BackdropLayers[] values() {
        return (BackdropLayers[]) $VALUES.clone();
    }
}
