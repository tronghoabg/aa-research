package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agrv {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agrv[] $VALUES;
    private final String javaTarget;
    public static final agrv METHOD_RETURN_TYPE = new agrv("METHOD_RETURN_TYPE", 0, "METHOD");
    public static final agrv VALUE_PARAMETER = new agrv("VALUE_PARAMETER", 1, "PARAMETER");
    public static final agrv FIELD = new agrv("FIELD", 2, "FIELD");
    public static final agrv TYPE_USE = new agrv("TYPE_USE", 3, "TYPE_USE");
    public static final agrv TYPE_PARAMETER_BOUNDS = new agrv("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
    public static final agrv TYPE_PARAMETER = new agrv("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    private static final /* synthetic */ agrv[] $values() {
        return new agrv[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    static {
        agrv[] agrvVarArr$values = $values();
        $VALUES = agrvVarArr$values;
        $ENTRIES = affa.p(agrvVarArr$values);
    }

    private agrv(String str, int i, String str2) {
        this.javaTarget = str2;
    }

    public static agrv valueOf(String str) {
        return (agrv) Enum.valueOf(agrv.class, str);
    }

    public static agrv[] values() {
        return (agrv[]) $VALUES.clone();
    }

    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
