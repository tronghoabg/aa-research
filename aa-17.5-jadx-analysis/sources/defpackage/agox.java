package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agox {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agox[] $VALUES;
    private final agpl flag;
    public static final agox FINAL = new agox("FINAL", 0, 0);
    public static final agox OPEN = new agox("OPEN", 1, 1);
    public static final agox ABSTRACT = new agox("ABSTRACT", 2, 2);
    public static final agox SEALED = new agox("SEALED", 3, 3);

    private static final /* synthetic */ agox[] $values() {
        return new agox[]{FINAL, OPEN, ABSTRACT, SEALED};
    }

    static {
        agox[] agoxVarArr$values = $values();
        $VALUES = agoxVarArr$values;
        $ENTRIES = affa.p(agoxVarArr$values);
    }

    private agox(String str, int i, int i2) {
        ahkz<ahij> ahkzVar = ahla.MODALITY;
        ahkzVar.getClass();
        this.flag = new agpl(ahkzVar, i2);
    }

    public static afdf<agox> getEntries() {
        return $ENTRIES;
    }

    public static agox valueOf(String str) {
        return (agox) Enum.valueOf(agox.class, str);
    }

    public static agox[] values() {
        return (agox[]) $VALUES.clone();
    }

    public final agpl getFlag$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flag;
    }
}
