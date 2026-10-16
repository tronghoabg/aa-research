package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afzz {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afzz[] $VALUES;
    public static final afzz FROM_DEPENDENCIES = new afzz("FROM_DEPENDENCIES", 0);
    public static final afzz FROM_CLASS_LOADER = new afzz("FROM_CLASS_LOADER", 1);
    public static final afzz FALLBACK = new afzz("FALLBACK", 2);

    private static final /* synthetic */ afzz[] $values() {
        return new afzz[]{FROM_DEPENDENCIES, FROM_CLASS_LOADER, FALLBACK};
    }

    static {
        afzz[] afzzVarArr$values = $values();
        $VALUES = afzzVarArr$values;
        $ENTRIES = affa.p(afzzVarArr$values);
    }

    private afzz(String str, int i) {
    }

    public static afzz valueOf(String str) {
        return (afzz) Enum.valueOf(afzz.class, str);
    }

    public static afzz[] values() {
        return (afzz[]) $VALUES.clone();
    }
}
