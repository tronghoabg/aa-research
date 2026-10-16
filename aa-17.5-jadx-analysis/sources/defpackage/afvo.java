package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afvo {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afvo[] $VALUES;
    public static final afvo NOT_NULL = new afvo("NOT_NULL", 0);
    public static final afvo NULLABLE = new afvo("NULLABLE", 1);
    public static final afvo FLEXIBLE = new afvo("FLEXIBLE", 2);

    private static final /* synthetic */ afvo[] $values() {
        return new afvo[]{NOT_NULL, NULLABLE, FLEXIBLE};
    }

    static {
        afvo[] afvoVarArr$values = $values();
        $VALUES = afvoVarArr$values;
        $ENTRIES = affa.p(afvoVarArr$values);
    }

    private afvo(String str, int i) {
    }

    public static afvo valueOf(String str) {
        return (afvo) Enum.valueOf(afvo.class, str);
    }

    public static afvo[] values() {
        return (afvo[]) $VALUES.clone();
    }
}
