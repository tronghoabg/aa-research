package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agor {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agor[] $VALUES;
    public static final agor INVARIANT = new agor("INVARIANT", 0);
    public static final agor IN = new agor("IN", 1);
    public static final agor OUT = new agor("OUT", 2);

    private static final /* synthetic */ agor[] $values() {
        return new agor[]{INVARIANT, IN, OUT};
    }

    static {
        agor[] agorVarArr$values = $values();
        $VALUES = agorVarArr$values;
        $ENTRIES = affa.p(agorVarArr$values);
    }

    private agor(String str, int i) {
    }

    public static agor valueOf(String str) {
        return (agor) Enum.valueOf(agor.class, str);
    }

    public static agor[] values() {
        return (agor[]) $VALUES.clone();
    }
}
