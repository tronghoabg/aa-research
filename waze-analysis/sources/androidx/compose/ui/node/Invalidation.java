package androidx.compose.ui.node;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Invalidation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Invalidation[] $VALUES;
    public static final Invalidation LookaheadMeasurement = new Invalidation("LookaheadMeasurement", 0);
    public static final Invalidation LookaheadPlacement = new Invalidation("LookaheadPlacement", 1);
    public static final Invalidation Measurement = new Invalidation("Measurement", 2);
    public static final Invalidation Placement = new Invalidation("Placement", 3);

    private static final /* synthetic */ Invalidation[] $values() {
        return new Invalidation[]{LookaheadMeasurement, LookaheadPlacement, Measurement, Placement};
    }

    static {
        Invalidation[] invalidationArr$values = $values();
        $VALUES = invalidationArr$values;
        $ENTRIES = b.a(invalidationArr$values);
    }

    private Invalidation(String str, int i2) {
    }

    public static a<Invalidation> getEntries() {
        return $ENTRIES;
    }

    public static Invalidation valueOf(String str) {
        return (Invalidation) Enum.valueOf(Invalidation.class, str);
    }

    public static Invalidation[] values() {
        return (Invalidation[]) $VALUES.clone();
    }
}
