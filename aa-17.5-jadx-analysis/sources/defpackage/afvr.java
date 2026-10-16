package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afvr {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afvr[] $VALUES;
    public static final afvr SUPERTYPE = new afvr("SUPERTYPE", 0);
    public static final afvr COMMON = new afvr("COMMON", 1);

    private static final /* synthetic */ afvr[] $values() {
        return new afvr[]{SUPERTYPE, COMMON};
    }

    static {
        afvr[] afvrVarArr$values = $values();
        $VALUES = afvrVarArr$values;
        $ENTRIES = affa.p(afvrVarArr$values);
    }

    private afvr(String str, int i) {
    }

    public static afvr valueOf(String str) {
        return (afvr) Enum.valueOf(afvr.class, str);
    }

    public static afvr[] values() {
        return (afvr[]) $VALUES.clone();
    }
}
