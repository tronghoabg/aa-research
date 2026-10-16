package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agyt {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agyt[] $VALUES;
    public static final agyt INFLEXIBLE = new agyt("INFLEXIBLE", 0);
    public static final agyt FLEXIBLE_UPPER_BOUND = new agyt("FLEXIBLE_UPPER_BOUND", 1);
    public static final agyt FLEXIBLE_LOWER_BOUND = new agyt("FLEXIBLE_LOWER_BOUND", 2);

    private static final /* synthetic */ agyt[] $values() {
        return new agyt[]{INFLEXIBLE, FLEXIBLE_UPPER_BOUND, FLEXIBLE_LOWER_BOUND};
    }

    static {
        agyt[] agytVarArr$values = $values();
        $VALUES = agytVarArr$values;
        $ENTRIES = affa.p(agytVarArr$values);
    }

    private agyt(String str, int i) {
    }

    public static agyt valueOf(String str) {
        return (agyt) Enum.valueOf(agyt.class, str);
    }

    public static agyt[] values() {
        return (agyt[]) $VALUES.clone();
    }
}
