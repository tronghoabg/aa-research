package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class agal {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agal[] $VALUES;
    public static final agal HIDDEN = new agal("HIDDEN", 0);
    public static final agal VISIBLE = new agal("VISIBLE", 1);
    public static final agal DEPRECATED_LIST_METHODS = new agal("DEPRECATED_LIST_METHODS", 2);
    public static final agal NOT_CONSIDERED = new agal("NOT_CONSIDERED", 3);
    public static final agal DROP = new agal("DROP", 4);

    private static final /* synthetic */ agal[] $values() {
        return new agal[]{HIDDEN, VISIBLE, DEPRECATED_LIST_METHODS, NOT_CONSIDERED, DROP};
    }

    static {
        agal[] agalVarArr$values = $values();
        $VALUES = agalVarArr$values;
        $ENTRIES = affa.p(agalVarArr$values);
    }

    private agal(String str, int i) {
    }

    public static agal valueOf(String str) {
        return (agal) Enum.valueOf(agal.class, str);
    }

    public static agal[] values() {
        return (agal[]) $VALUES.clone();
    }
}
