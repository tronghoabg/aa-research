package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agoz {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agoz[] $VALUES;
    private final agpl flag;
    public static final agoz INTERNAL = new agoz("INTERNAL", 0, 0);
    public static final agoz PRIVATE = new agoz("PRIVATE", 1, 1);
    public static final agoz PROTECTED = new agoz("PROTECTED", 2, 2);
    public static final agoz PUBLIC = new agoz("PUBLIC", 3, 3);
    public static final agoz PRIVATE_TO_THIS = new agoz("PRIVATE_TO_THIS", 4, 4);
    public static final agoz LOCAL = new agoz("LOCAL", 5, 5);

    private static final /* synthetic */ agoz[] $values() {
        return new agoz[]{INTERNAL, PRIVATE, PROTECTED, PUBLIC, PRIVATE_TO_THIS, LOCAL};
    }

    static {
        agoz[] agozVarArr$values = $values();
        $VALUES = agozVarArr$values;
        $ENTRIES = affa.p(agozVarArr$values);
    }

    private agoz(String str, int i, int i2) {
        ahkz<ahkn> ahkzVar = ahla.VISIBILITY;
        ahkzVar.getClass();
        this.flag = new agpl(ahkzVar, i2);
    }

    public static afdf<agoz> getEntries() {
        return $ENTRIES;
    }

    public static agoz valueOf(String str) {
        return (agoz) Enum.valueOf(agoz.class, str);
    }

    public static agoz[] values() {
        return (agoz[]) $VALUES.clone();
    }

    public final agpl getFlag$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flag;
    }
}
