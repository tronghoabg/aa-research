package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agov {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agov[] $VALUES;
    public static final agov LANGUAGE_VERSION = new agov("LANGUAGE_VERSION", 0);
    public static final agov COMPILER_VERSION = new agov("COMPILER_VERSION", 1);
    public static final agov API_VERSION = new agov("API_VERSION", 2);
    public static final agov UNKNOWN = new agov("UNKNOWN", 3);

    private static final /* synthetic */ agov[] $values() {
        return new agov[]{LANGUAGE_VERSION, COMPILER_VERSION, API_VERSION, UNKNOWN};
    }

    static {
        agov[] agovVarArr$values = $values();
        $VALUES = agovVarArr$values;
        $ENTRIES = affa.p(agovVarArr$values);
    }

    private agov(String str, int i) {
    }

    public static agov valueOf(String str) {
        return (agov) Enum.valueOf(agov.class, str);
    }

    public static agov[] values() {
        return (agov[]) $VALUES.clone();
    }
}
