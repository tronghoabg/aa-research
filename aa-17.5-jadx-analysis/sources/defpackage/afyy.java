package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afyy {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afyy[] $VALUES;
    public static final afyx Companion;
    public static final afyy Function = new afyy("Function", 0);
    public static final afyy SuspendFunction = new afyy("SuspendFunction", 1);
    public static final afyy KFunction = new afyy("KFunction", 2);
    public static final afyy KSuspendFunction = new afyy("KSuspendFunction", 3);
    public static final afyy UNKNOWN = new afyy("UNKNOWN", 4);

    private static final /* synthetic */ afyy[] $values() {
        return new afyy[]{Function, SuspendFunction, KFunction, KSuspendFunction, UNKNOWN};
    }

    static {
        afyy[] afyyVarArr$values = $values();
        $VALUES = afyyVarArr$values;
        $ENTRIES = affa.p(afyyVarArr$values);
        Companion = new afyx(null);
    }

    private afyy(String str, int i) {
    }

    public static afyy valueOf(String str) {
        return (afyy) Enum.valueOf(afyy.class, str);
    }

    public static afyy[] values() {
        return (afyy[]) $VALUES.clone();
    }
}
