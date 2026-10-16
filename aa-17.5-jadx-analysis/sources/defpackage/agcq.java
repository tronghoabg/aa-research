package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agcq {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agcq[] $VALUES;
    public static final agcp Companion;
    public static final agcq FINAL = new agcq("FINAL", 0);
    public static final agcq SEALED = new agcq("SEALED", 1);
    public static final agcq OPEN = new agcq("OPEN", 2);
    public static final agcq ABSTRACT = new agcq("ABSTRACT", 3);

    private static final /* synthetic */ agcq[] $values() {
        return new agcq[]{FINAL, SEALED, OPEN, ABSTRACT};
    }

    static {
        agcq[] agcqVarArr$values = $values();
        $VALUES = agcqVarArr$values;
        $ENTRIES = affa.p(agcqVarArr$values);
        Companion = new agcp(null);
    }

    private agcq(String str, int i) {
    }

    public static agcq valueOf(String str) {
        return (agcq) Enum.valueOf(agcq.class, str);
    }

    public static agcq[] values() {
        return (agcq[]) $VALUES.clone();
    }
}
