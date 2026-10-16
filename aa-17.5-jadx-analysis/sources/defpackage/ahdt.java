package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class ahdt {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahdt[] $VALUES;
    public static final ahdt PROPERTY = new ahdt("PROPERTY", 0);
    public static final ahdt BACKING_FIELD = new ahdt("BACKING_FIELD", 1);
    public static final ahdt DELEGATE_FIELD = new ahdt("DELEGATE_FIELD", 2);

    private static final /* synthetic */ ahdt[] $values() {
        return new ahdt[]{PROPERTY, BACKING_FIELD, DELEGATE_FIELD};
    }

    static {
        ahdt[] ahdtVarArr$values = $values();
        $VALUES = ahdtVarArr$values;
        $ENTRIES = affa.p(ahdtVarArr$values);
    }

    private ahdt(String str, int i) {
    }

    public static ahdt valueOf(String str) {
        return (ahdt) Enum.valueOf(ahdt.class, str);
    }

    public static ahdt[] values() {
        return (ahdt[]) $VALUES.clone();
    }
}
