package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agoc {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agoc[] $VALUES;
    public static final agoc RETURNS_CONSTANT = new agoc("RETURNS_CONSTANT", 0);
    public static final agoc CALLS = new agoc("CALLS", 1);
    public static final agoc RETURNS_NOT_NULL = new agoc("RETURNS_NOT_NULL", 2);
    public static final agoc RETURNS_RESULT_OF = new agoc("RETURNS_RESULT_OF", 3);

    private static final /* synthetic */ agoc[] $values() {
        return new agoc[]{RETURNS_CONSTANT, CALLS, RETURNS_NOT_NULL, RETURNS_RESULT_OF};
    }

    static {
        agoc[] agocVarArr$values = $values();
        $VALUES = agocVarArr$values;
        $ENTRIES = affa.p(agocVarArr$values);
    }

    private agoc(String str, int i) {
    }

    public static agoc valueOf(String str) {
        return (agoc) Enum.valueOf(agoc.class, str);
    }

    public static agoc[] values() {
        return (agoc[]) $VALUES.clone();
    }
}
