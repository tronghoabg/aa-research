package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ivv {
    public static final ivv a;
    public static final ivv b;
    public static final ivv c;
    public static final ivv d;
    private static final /* synthetic */ ivv[] e;

    static {
        ivv ivvVar = new ivv("HIGH", 0);
        a = ivvVar;
        ivv ivvVar2 = new ivv("MEDIUM", 1);
        b = ivvVar2;
        ivv ivvVar3 = new ivv("LOW", 2);
        c = ivvVar3;
        ivv ivvVar4 = new ivv("NONE", 3);
        d = ivvVar4;
        e = new ivv[]{ivvVar, ivvVar2, ivvVar3, ivvVar4};
    }

    public static ivv valueOf(String str) {
        return (ivv) Enum.valueOf(ivv.class, str);
    }

    public static ivv[] values() {
        return (ivv[]) e.clone();
    }
}
