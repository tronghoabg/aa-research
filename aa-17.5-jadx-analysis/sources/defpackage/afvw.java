package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afvw {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afvw[] $VALUES;
    public static final afvw CALL_BY_NAME = new afvw("CALL_BY_NAME", 0);
    public static final afvw POSITIONAL_CALL = new afvw("POSITIONAL_CALL", 1);

    private static final /* synthetic */ afvw[] $values() {
        return new afvw[]{CALL_BY_NAME, POSITIONAL_CALL};
    }

    static {
        afvw[] afvwVarArr$values = $values();
        $VALUES = afvwVarArr$values;
        $ENTRIES = affa.p(afvwVarArr$values);
    }

    private afvw(String str, int i) {
    }

    public static afvw valueOf(String str) {
        return (afvw) Enum.valueOf(afvw.class, str);
    }

    public static afvw[] values() {
        return (afvw[]) $VALUES.clone();
    }
}
