package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahab {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahab[] $VALUES;
    public static final ahab SOURCE = new ahab("SOURCE", 0);
    public static final ahab BINARY = new ahab("BINARY", 1);

    private static final /* synthetic */ ahab[] $values() {
        return new ahab[]{SOURCE, BINARY};
    }

    static {
        ahab[] ahabVarArr$values = $values();
        $VALUES = ahabVarArr$values;
        $ENTRIES = affa.p(ahabVarArr$values);
    }

    private ahab(String str, int i) {
    }

    public static ahab valueOf(String str) {
        return (ahab) Enum.valueOf(ahab.class, str);
    }

    public static ahab[] values() {
        return (ahab[]) $VALUES.clone();
    }
}
