package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cqv {
    public static final defpackage.cqv a;
    public static final defpackage.cqv b;
    public static final defpackage.cqv c;
    private static final /* synthetic */ defpackage.cqv[] d;

    static {
        defpackage.cqv cqvVar = new defpackage.cqv("Initial", 0);
        a = cqvVar;
        defpackage.cqv cqvVar2 = new defpackage.cqv("Main", 1);
        b = cqvVar2;
        defpackage.cqv cqvVar3 = new defpackage.cqv("Final", 2);
        c = cqvVar3;
        defpackage.cqv[] cqvVarArr = {cqvVar, cqvVar2, cqvVar3};
        d = cqvVarArr;
        defpackage.afga.p(cqvVarArr);
    }

    public static defpackage.cqv valueOf(java.lang.String str) {
        return (defpackage.cqv) java.lang.Enum.valueOf(defpackage.cqv.class, str);
    }

    public static defpackage.cqv[] values() {
        return (defpackage.cqv[]) d.clone();
    }
}
