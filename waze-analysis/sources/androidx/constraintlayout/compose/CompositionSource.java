package androidx.constraintlayout.compose;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CompositionSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CompositionSource[] $VALUES;
    public static final CompositionSource Unknown = new CompositionSource("Unknown", 0);
    public static final CompositionSource Content = new CompositionSource("Content", 1);

    private static final /* synthetic */ CompositionSource[] $values() {
        return new CompositionSource[]{Unknown, Content};
    }

    static {
        CompositionSource[] compositionSourceArr$values = $values();
        $VALUES = compositionSourceArr$values;
        $ENTRIES = b.a(compositionSourceArr$values);
    }

    private CompositionSource(String str, int i2) {
    }

    public static a<CompositionSource> getEntries() {
        return $ENTRIES;
    }

    public static CompositionSource valueOf(String str) {
        return (CompositionSource) Enum.valueOf(CompositionSource.class, str);
    }

    public static CompositionSource[] values() {
        return (CompositionSource[]) $VALUES.clone();
    }
}
