package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agtq {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agtq[] $VALUES;
    public static final agtp Companion;
    private final String description;
    public static final agtq IGNORE = new agtq("IGNORE", 0, "ignore");
    public static final agtq WARN = new agtq("WARN", 1, "warn");
    public static final agtq STRICT = new agtq("STRICT", 2, "strict");

    private static final /* synthetic */ agtq[] $values() {
        return new agtq[]{IGNORE, WARN, STRICT};
    }

    static {
        agtq[] agtqVarArr$values = $values();
        $VALUES = agtqVarArr$values;
        $ENTRIES = affa.p(agtqVarArr$values);
        Companion = new agtp(null);
    }

    private agtq(String str, int i, String str2) {
        this.description = str2;
    }

    public static agtq valueOf(String str) {
        return (agtq) Enum.valueOf(agtq.class, str);
    }

    public static agtq[] values() {
        return (agtq[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
