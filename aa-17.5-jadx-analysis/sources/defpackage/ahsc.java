package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahsc {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahsc[] $VALUES;
    public static final ahsc ALL = new ahsc("ALL", 0);
    public static final ahsc ONLY_NON_SYNTHESIZED = new ahsc("ONLY_NON_SYNTHESIZED", 1);
    public static final ahsc NONE = new ahsc("NONE", 2);

    private static final /* synthetic */ ahsc[] $values() {
        return new ahsc[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
    }

    static {
        ahsc[] ahscVarArr$values = $values();
        $VALUES = ahscVarArr$values;
        $ENTRIES = affa.p(ahscVarArr$values);
    }

    private ahsc(String str, int i) {
    }

    public static ahsc valueOf(String str) {
        return (ahsc) Enum.valueOf(ahsc.class, str);
    }

    public static ahsc[] values() {
        return (ahsc[]) $VALUES.clone();
    }
}
