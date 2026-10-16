package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aihw {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ aihw[] $VALUES;
    public static final aihw CHECK_ONLY_LOWER = new aihw("CHECK_ONLY_LOWER", 0);
    public static final aihw CHECK_SUBTYPE_AND_LOWER = new aihw("CHECK_SUBTYPE_AND_LOWER", 1);
    public static final aihw SKIP_LOWER = new aihw("SKIP_LOWER", 2);

    private static final /* synthetic */ aihw[] $values() {
        return new aihw[]{CHECK_ONLY_LOWER, CHECK_SUBTYPE_AND_LOWER, SKIP_LOWER};
    }

    static {
        aihw[] aihwVarArr$values = $values();
        $VALUES = aihwVarArr$values;
        $ENTRIES = affa.p(aihwVarArr$values);
    }

    private aihw(String str, int i) {
    }

    public static aihw valueOf(String str) {
        return (aihw) Enum.valueOf(aihw.class, str);
    }

    public static aihw[] values() {
        return (aihw[]) $VALUES.clone();
    }
}
