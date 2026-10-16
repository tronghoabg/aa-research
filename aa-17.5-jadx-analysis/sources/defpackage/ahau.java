package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahau {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahau[] $VALUES;
    public static final ahau FORCE_FLEXIBILITY = new ahau("FORCE_FLEXIBILITY", 0);
    public static final ahau NULLABLE = new ahau("NULLABLE", 1);
    public static final ahau NOT_NULL = new ahau("NOT_NULL", 2);

    private static final /* synthetic */ ahau[] $values() {
        return new ahau[]{FORCE_FLEXIBILITY, NULLABLE, NOT_NULL};
    }

    static {
        ahau[] ahauVarArr$values = $values();
        $VALUES = ahauVarArr$values;
        $ENTRIES = affa.p(ahauVarArr$values);
    }

    private ahau(String str, int i) {
    }

    public static ahau valueOf(String str) {
        return (ahau) Enum.valueOf(ahau.class, str);
    }

    public static ahau[] values() {
        return (ahau[]) $VALUES.clone();
    }
}
