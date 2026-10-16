package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aijg {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ aijg[] $VALUES;
    public static final aijg INVARIANT = new aijg("INVARIANT", 0, "", true, true, 0);
    public static final aijg IN_VARIANCE = new aijg("IN_VARIANCE", 1, "in", true, false, -1);
    public static final aijg OUT_VARIANCE = new aijg("OUT_VARIANCE", 2, "out", false, true, 1);
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    private static final /* synthetic */ aijg[] $values() {
        return new aijg[]{INVARIANT, IN_VARIANCE, OUT_VARIANCE};
    }

    static {
        aijg[] aijgVarArr$values = $values();
        $VALUES = aijgVarArr$values;
        $ENTRIES = affa.p(aijgVarArr$values);
    }

    private aijg(String str, int i, String str2, boolean z, boolean z2, int i2) {
        this.label = str2;
        this.allowsInPosition = z;
        this.allowsOutPosition = z2;
        this.superpositionFactor = i2;
    }

    public static aijg valueOf(String str) {
        return (aijg) Enum.valueOf(aijg.class, str);
    }

    public static aijg[] values() {
        return (aijg[]) $VALUES.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.label;
    }
}
