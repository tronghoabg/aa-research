package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nsv {
    public static final defpackage.nsv a;
    public static final defpackage.nsv b;
    public static final defpackage.nsv c;
    private static final /* synthetic */ defpackage.nsv[] d;

    static {
        defpackage.nsv nsvVar = new defpackage.nsv("INACTIVE", 0);
        a = nsvVar;
        defpackage.nsv nsvVar2 = new defpackage.nsv("ACTIVE", 1);
        b = nsvVar2;
        defpackage.nsv nsvVar3 = new defpackage.nsv("UPDATING", 2);
        c = nsvVar3;
        d = new defpackage.nsv[]{nsvVar, nsvVar2, nsvVar3};
    }

    public static defpackage.nsv valueOf(java.lang.String str) {
        return (defpackage.nsv) java.lang.Enum.valueOf(defpackage.nsv.class, str);
    }

    public static defpackage.nsv[] values() {
        return (defpackage.nsv[]) d.clone();
    }
}
