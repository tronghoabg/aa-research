package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agob {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agob[] $VALUES;
    public static final agob AT_MOST_ONCE = new agob("AT_MOST_ONCE", 0);
    public static final agob EXACTLY_ONCE = new agob("EXACTLY_ONCE", 1);
    public static final agob AT_LEAST_ONCE = new agob("AT_LEAST_ONCE", 2);

    private static final /* synthetic */ agob[] $values() {
        return new agob[]{AT_MOST_ONCE, EXACTLY_ONCE, AT_LEAST_ONCE};
    }

    static {
        agob[] agobVarArr$values = $values();
        $VALUES = agobVarArr$values;
        $ENTRIES = affa.p(agobVarArr$values);
    }

    private agob(String str, int i) {
    }

    public static agob valueOf(String str) {
        return (agob) Enum.valueOf(agob.class, str);
    }

    public static agob[] values() {
        return (agob[]) $VALUES.clone();
    }
}
