package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahtq {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahtq[] $VALUES;
    public static final ahtp Companion;
    public static final ahtq MustUse = new ahtq("MustUse", 0);
    public static final ahtq ExplicitlyIgnorable = new ahtq("ExplicitlyIgnorable", 1);
    public static final ahtq Unspecified = new ahtq("Unspecified", 2);

    private static final /* synthetic */ ahtq[] $values() {
        return new ahtq[]{MustUse, ExplicitlyIgnorable, Unspecified};
    }

    static {
        ahtq[] ahtqVarArr$values = $values();
        $VALUES = ahtqVarArr$values;
        $ENTRIES = affa.p(ahtqVarArr$values);
        Companion = new ahtp(null);
    }

    private ahtq(String str, int i) {
    }

    public static ahtq valueOf(String str) {
        return (ahtq) Enum.valueOf(ahtq.class, str);
    }

    public static ahtq[] values() {
        return (ahtq[]) $VALUES.clone();
    }
}
