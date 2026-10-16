package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahvq {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahvq[] $VALUES;
    public static final ahvq WARNING = new ahvq("WARNING", 0);
    public static final ahvq ERROR = new ahvq("ERROR", 1);
    public static final ahvq HIDDEN = new ahvq("HIDDEN", 2);

    private static final /* synthetic */ ahvq[] $values() {
        return new ahvq[]{WARNING, ERROR, HIDDEN};
    }

    static {
        ahvq[] ahvqVarArr$values = $values();
        $VALUES = ahvqVarArr$values;
        $ENTRIES = affa.p(ahvqVarArr$values);
    }

    private ahvq(String str, int i) {
    }

    public static ahvq valueOf(String str) {
        return (ahvq) Enum.valueOf(ahvq.class, str);
    }

    public static ahvq[] values() {
        return (ahvq[]) $VALUES.clone();
    }
}
