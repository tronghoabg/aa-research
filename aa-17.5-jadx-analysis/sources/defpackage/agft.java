package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agft {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agft[] $VALUES;
    public static final agft RUNTIME = new agft("RUNTIME", 0);
    public static final agft BINARY = new agft("BINARY", 1);
    public static final agft SOURCE = new agft("SOURCE", 2);

    private static final /* synthetic */ agft[] $values() {
        return new agft[]{RUNTIME, BINARY, SOURCE};
    }

    static {
        agft[] agftVarArr$values = $values();
        $VALUES = agftVarArr$values;
        $ENTRIES = affa.p(agftVarArr$values);
    }

    private agft(String str, int i) {
    }

    public static agft valueOf(String str) {
        return (agft) Enum.valueOf(agft.class, str);
    }

    public static agft[] values() {
        return (agft[]) $VALUES.clone();
    }
}
