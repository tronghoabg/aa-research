package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afvk {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afvk[] $VALUES;
    public static final afvk FUNCTION = new afvk("FUNCTION", 0);
    public static final afvk PROPERTY = new afvk("PROPERTY", 1);
    public static final afvk FIELD_IN_JAVA_CLASS = new afvk("FIELD_IN_JAVA_CLASS", 2);

    private static final /* synthetic */ afvk[] $values() {
        return new afvk[]{FUNCTION, PROPERTY, FIELD_IN_JAVA_CLASS};
    }

    static {
        afvk[] afvkVarArr$values = $values();
        $VALUES = afvkVarArr$values;
        $ENTRIES = affa.p(afvkVarArr$values);
    }

    private afvk(String str, int i) {
    }

    public static afvk valueOf(String str) {
        return (afvk) Enum.valueOf(afvk.class, str);
    }

    public static afvk[] values() {
        return (afvk[]) $VALUES.clone();
    }
}
