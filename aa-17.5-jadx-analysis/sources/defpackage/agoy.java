package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agoy {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agoy[] $VALUES;
    public static final agoy UNSPECIFIED = new agoy("UNSPECIFIED", 0);
    public static final agoy MUST_USE = new agoy("MUST_USE", 1);
    public static final agoy EXPLICITLY_IGNORABLE = new agoy("EXPLICITLY_IGNORABLE", 2);

    private static final /* synthetic */ agoy[] $values() {
        return new agoy[]{UNSPECIFIED, MUST_USE, EXPLICITLY_IGNORABLE};
    }

    static {
        agoy[] agoyVarArr$values = $values();
        $VALUES = agoyVarArr$values;
        $ENTRIES = affa.p(agoyVarArr$values);
    }

    private agoy(String str, int i) {
    }

    public static afdf<agoy> getEntries() {
        return $ENTRIES;
    }

    public static agoy valueOf(String str) {
        return (agoy) Enum.valueOf(agoy.class, str);
    }

    public static agoy[] values() {
        return (agoy[]) $VALUES.clone();
    }
}
