package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agmp {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agmp[] $VALUES;
    private final agpl flag;
    public static final agmp CLASS = new agmp("CLASS", 0, 0);
    public static final agmp INTERFACE = new agmp("INTERFACE", 1, 1);
    public static final agmp ENUM_CLASS = new agmp("ENUM_CLASS", 2, 2);
    public static final agmp ENUM_ENTRY = new agmp("ENUM_ENTRY", 3, 3);
    public static final agmp ANNOTATION_CLASS = new agmp("ANNOTATION_CLASS", 4, 4);
    public static final agmp OBJECT = new agmp("OBJECT", 5, 5);
    public static final agmp COMPANION_OBJECT = new agmp("COMPANION_OBJECT", 6, 6);

    private static final /* synthetic */ agmp[] $values() {
        return new agmp[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT, COMPANION_OBJECT};
    }

    static {
        agmp[] agmpVarArr$values = $values();
        $VALUES = agmpVarArr$values;
        $ENTRIES = affa.p(agmpVarArr$values);
    }

    private agmp(String str, int i, int i2) {
        ahkz<ahhb> ahkzVar = ahla.CLASS_KIND;
        ahkzVar.getClass();
        this.flag = new agpl(ahkzVar, i2);
    }

    public static afdf<agmp> getEntries() {
        return $ENTRIES;
    }

    public static agmp valueOf(String str) {
        return (agmp) Enum.valueOf(agmp.class, str);
    }

    public static agmp[] values() {
        return (agmp[]) $VALUES.clone();
    }

    public final agpl getFlag$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flag;
    }
}
