package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class afqt {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afqt[] $VALUES;
    public static final afqt DECLARED = new afqt("DECLARED", 0);
    public static final afqt INHERITED = new afqt("INHERITED", 1);

    private static final /* synthetic */ afqt[] $values() {
        return new afqt[]{DECLARED, INHERITED};
    }

    static {
        afqt[] afqtVarArr$values = $values();
        $VALUES = afqtVarArr$values;
        $ENTRIES = affa.p(afqtVarArr$values);
    }

    private afqt(String str, int i) {
    }

    public static afqt valueOf(String str) {
        return (afqt) Enum.valueOf(afqt.class, str);
    }

    public static afqt[] values() {
        return (afqt[]) $VALUES.clone();
    }

    public final boolean accept(agax agaxVar) {
        agaxVar.getClass();
        return agaxVar.getKind().isReal() == (this == DECLARED);
    }
}
