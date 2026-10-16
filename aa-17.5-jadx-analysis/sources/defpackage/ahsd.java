package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahsd {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahsd[] $VALUES;
    public static final ahsd PRETTY = new ahsd("PRETTY", 0);
    public static final ahsd DEBUG = new ahsd("DEBUG", 1);
    public static final ahsd NONE = new ahsd("NONE", 2);

    private static final /* synthetic */ ahsd[] $values() {
        return new ahsd[]{PRETTY, DEBUG, NONE};
    }

    static {
        ahsd[] ahsdVarArr$values = $values();
        $VALUES = ahsdVarArr$values;
        $ENTRIES = affa.p(ahsdVarArr$values);
    }

    private ahsd(String str, int i) {
    }

    public static ahsd valueOf(String str) {
        return (ahsd) Enum.valueOf(ahsd.class, str);
    }

    public static ahsd[] values() {
        return (ahsd[]) $VALUES.clone();
    }
}
