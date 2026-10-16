package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahcz {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahcz[] $VALUES;
    public static final ahcz FLEXIBLE_LOWER = new ahcz("FLEXIBLE_LOWER", 0);
    public static final ahcz FLEXIBLE_UPPER = new ahcz("FLEXIBLE_UPPER", 1);
    public static final ahcz INFLEXIBLE = new ahcz("INFLEXIBLE", 2);

    private static final /* synthetic */ ahcz[] $values() {
        return new ahcz[]{FLEXIBLE_LOWER, FLEXIBLE_UPPER, INFLEXIBLE};
    }

    static {
        ahcz[] ahczVarArr$values = $values();
        $VALUES = ahczVarArr$values;
        $ENTRIES = affa.p(ahczVarArr$values);
    }

    private ahcz(String str, int i) {
    }

    public static ahcz valueOf(String str) {
        return (ahcz) Enum.valueOf(ahcz.class, str);
    }

    public static ahcz[] values() {
        return (ahcz[]) $VALUES.clone();
    }
}
