package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aimm {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ aimm[] $VALUES;
    private final String presentation;
    public static final aimm IN = new aimm("IN", 0, "in");
    public static final aimm OUT = new aimm("OUT", 1, "out");
    public static final aimm INV = new aimm("INV", 2, "");

    private static final /* synthetic */ aimm[] $values() {
        return new aimm[]{IN, OUT, INV};
    }

    static {
        aimm[] aimmVarArr$values = $values();
        $VALUES = aimmVarArr$values;
        $ENTRIES = affa.p(aimmVarArr$values);
    }

    private aimm(String str, int i, String str2) {
        this.presentation = str2;
    }

    public static aimm valueOf(String str) {
        return (aimm) Enum.valueOf(aimm.class, str);
    }

    public static aimm[] values() {
        return (aimm[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
