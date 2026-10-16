package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afvx {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afvx[] $VALUES;
    public static final afvx JAVA = new afvx("JAVA", 0);
    public static final afvx KOTLIN = new afvx("KOTLIN", 1);

    private static final /* synthetic */ afvx[] $values() {
        return new afvx[]{JAVA, KOTLIN};
    }

    static {
        afvx[] afvxVarArr$values = $values();
        $VALUES = afvxVarArr$values;
        $ENTRIES = affa.p(afvxVarArr$values);
    }

    private afvx(String str, int i) {
    }

    public static afvx valueOf(String str) {
        return (afvx) Enum.valueOf(afvx.class, str);
    }

    public static afvx[] values() {
        return (afvx[]) $VALUES.clone();
    }
}
