package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class ahnp {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahnp[] $VALUES;
    public static final ahnp BEGINNING = new ahnp("BEGINNING", 0);
    public static final ahnp MIDDLE = new ahnp("MIDDLE", 1);
    public static final ahnp AFTER_DOT = new ahnp("AFTER_DOT", 2);

    private static final /* synthetic */ ahnp[] $values() {
        return new ahnp[]{BEGINNING, MIDDLE, AFTER_DOT};
    }

    static {
        ahnp[] ahnpVarArr$values = $values();
        $VALUES = ahnpVarArr$values;
        $ENTRIES = affa.p(ahnpVarArr$values);
    }

    private ahnp(String str, int i) {
    }

    public static ahnp valueOf(String str) {
        return (ahnp) Enum.valueOf(ahnp.class, str);
    }

    public static ahnp[] values() {
        return (ahnp[]) $VALUES.clone();
    }
}
