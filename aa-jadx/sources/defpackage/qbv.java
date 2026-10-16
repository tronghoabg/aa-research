package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qbv {
    public static final defpackage.qbv a;
    public static final defpackage.qbv b;
    private static final /* synthetic */ defpackage.qbv[] c;

    static {
        defpackage.qbv qbvVar = new defpackage.qbv("MAIN", 0);
        a = qbvVar;
        defpackage.qbv qbvVar2 = new defpackage.qbv("AUXILIARY", 1);
        b = qbvVar2;
        c = new defpackage.qbv[]{qbvVar, qbvVar2};
    }

    public static defpackage.qbv valueOf(java.lang.String str) {
        return (defpackage.qbv) java.lang.Enum.valueOf(defpackage.qbv.class, str);
    }

    public static defpackage.qbv[] values() {
        return (defpackage.qbv[]) c.clone();
    }
}
