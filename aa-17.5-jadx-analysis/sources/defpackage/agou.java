package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agou {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agou[] $VALUES;
    public static final agou WARNING = new agou("WARNING", 0);
    public static final agou ERROR = new agou("ERROR", 1);
    public static final agou HIDDEN = new agou("HIDDEN", 2);

    private static final /* synthetic */ agou[] $values() {
        return new agou[]{WARNING, ERROR, HIDDEN};
    }

    static {
        agou[] agouVarArr$values = $values();
        $VALUES = agouVarArr$values;
        $ENTRIES = affa.p(agouVarArr$values);
    }

    private agou(String str, int i) {
    }

    public static agou valueOf(String str) {
        return (agou) Enum.valueOf(agou.class, str);
    }

    public static agou[] values() {
        return (agou[]) $VALUES.clone();
    }
}
