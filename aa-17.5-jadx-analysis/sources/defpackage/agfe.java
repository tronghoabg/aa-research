package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agfe {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agfe[] $VALUES;
    private final String renderName;
    public static final agfe ALL = new agfe("ALL", 0, null, 1, null);
    public static final agfe FIELD = new agfe("FIELD", 1, null, 1, null);
    public static final agfe FILE = new agfe("FILE", 2, null, 1, null);
    public static final agfe PROPERTY = new agfe("PROPERTY", 3, null, 1, null);
    public static final agfe PROPERTY_GETTER = new agfe("PROPERTY_GETTER", 4, "get");
    public static final agfe PROPERTY_SETTER = new agfe("PROPERTY_SETTER", 5, "set");
    public static final agfe RECEIVER = new agfe("RECEIVER", 6, null, 1, null);
    public static final agfe CONSTRUCTOR_PARAMETER = new agfe("CONSTRUCTOR_PARAMETER", 7, "param");
    public static final agfe SETTER_PARAMETER = new agfe("SETTER_PARAMETER", 8, "setparam");
    public static final agfe PROPERTY_DELEGATE_FIELD = new agfe("PROPERTY_DELEGATE_FIELD", 9, "delegate");

    private static final /* synthetic */ agfe[] $values() {
        return new agfe[]{ALL, FIELD, FILE, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, RECEIVER, CONSTRUCTOR_PARAMETER, SETTER_PARAMETER, PROPERTY_DELEGATE_FIELD};
    }

    static {
        agfe[] agfeVarArr$values = $values();
        $VALUES = agfeVarArr$values;
        $ENTRIES = affa.p(agfeVarArr$values);
    }

    private agfe(String str, int i, String str2) {
        if (str2 == null) {
            str2 = name().toLowerCase(Locale.ROOT);
            str2.getClass();
        }
        this.renderName = str2;
    }

    public static agfe valueOf(String str) {
        return (agfe) Enum.valueOf(agfe.class, str);
    }

    public static agfe[] values() {
        return (agfe[]) $VALUES.clone();
    }

    public final String getRenderName() {
        return this.renderName;
    }

    public /* synthetic */ agfe(String str, int i, String str2, int i2, afeu afeuVar) {
        this(str, i, 1 == (i2 & 1) ? null : str2);
    }
}
