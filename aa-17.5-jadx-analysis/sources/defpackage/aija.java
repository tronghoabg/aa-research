package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aija {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ aija[] $VALUES;
    public static final aija SUPERTYPE = new aija("SUPERTYPE", 0);
    public static final aija COMMON = new aija("COMMON", 1);

    private static final /* synthetic */ aija[] $values() {
        return new aija[]{SUPERTYPE, COMMON};
    }

    static {
        aija[] aijaVarArr$values = $values();
        $VALUES = aijaVarArr$values;
        $ENTRIES = affa.p(aijaVarArr$values);
    }

    private aija(String str, int i) {
    }

    public static aija valueOf(String str) {
        return (aija) Enum.valueOf(aija.class, str);
    }

    public static aija[] values() {
        return (aija[]) $VALUES.clone();
    }
}
