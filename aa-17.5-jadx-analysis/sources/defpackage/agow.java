package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agow {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agow[] $VALUES;
    private final agpl flag;
    public static final agow DECLARATION = new agow("DECLARATION", 0, 0);
    public static final agow FAKE_OVERRIDE = new agow("FAKE_OVERRIDE", 1, 1);
    public static final agow DELEGATION = new agow("DELEGATION", 2, 2);
    public static final agow SYNTHESIZED = new agow("SYNTHESIZED", 3, 3);

    private static final /* synthetic */ agow[] $values() {
        return new agow[]{DECLARATION, FAKE_OVERRIDE, DELEGATION, SYNTHESIZED};
    }

    static {
        agow[] agowVarArr$values = $values();
        $VALUES = agowVarArr$values;
        $ENTRIES = affa.p(agowVarArr$values);
    }

    private agow(String str, int i, int i2) {
        ahkz<ahih> ahkzVar = ahla.MEMBER_KIND;
        ahkzVar.getClass();
        this.flag = new agpl(ahkzVar, i2);
    }

    public static afdf<agow> getEntries() {
        return $ENTRIES;
    }

    public static agow valueOf(String str) {
        return (agow) Enum.valueOf(agow.class, str);
    }

    public static agow[] values() {
        return (agow[]) $VALUES.clone();
    }

    public final agpl getFlag$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flag;
    }
}
