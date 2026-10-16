package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class ahut {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahut[] $VALUES;
    public static final ahut COMMON_SUPER_TYPE = new ahut("COMMON_SUPER_TYPE", 0);
    public static final ahut INTERSECTION_TYPE = new ahut("INTERSECTION_TYPE", 1);

    private static final /* synthetic */ ahut[] $values() {
        return new ahut[]{COMMON_SUPER_TYPE, INTERSECTION_TYPE};
    }

    static {
        ahut[] ahutVarArr$values = $values();
        $VALUES = ahutVarArr$values;
        $ENTRIES = affa.p(ahutVarArr$values);
    }

    private ahut(String str, int i) {
    }

    public static ahut valueOf(String str) {
        return (ahut) Enum.valueOf(ahut.class, str);
    }

    public static ahut[] values() {
        return (ahut[]) $VALUES.clone();
    }
}
