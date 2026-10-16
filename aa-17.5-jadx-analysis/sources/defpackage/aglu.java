package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aglu {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ aglu[] $VALUES;
    public static final aglu PACKAGE = new aglu("PACKAGE", 0);
    public static final aglu CLASSIFIER = new aglu("CLASSIFIER", 1);

    private static final /* synthetic */ aglu[] $values() {
        return new aglu[]{PACKAGE, CLASSIFIER};
    }

    static {
        aglu[] agluVarArr$values = $values();
        $VALUES = agluVarArr$values;
        $ENTRIES = affa.p(agluVarArr$values);
    }

    private aglu(String str, int i) {
    }

    public static aglu valueOf(String str) {
        return (aglu) Enum.valueOf(aglu.class, str);
    }

    public static aglu[] values() {
        return (aglu[]) $VALUES.clone();
    }
}
