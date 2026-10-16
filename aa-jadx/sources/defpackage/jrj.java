package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jrj {
    public static final defpackage.jrj a;
    public static final defpackage.jrj b;
    private static final /* synthetic */ defpackage.jrj[] c;

    static {
        defpackage.jrj jrjVar = new defpackage.jrj("NONE", 0);
        a = jrjVar;
        defpackage.jrj jrjVar2 = new defpackage.jrj("PROJECTED", 1);
        b = jrjVar2;
        c = new defpackage.jrj[]{jrjVar, jrjVar2};
    }

    public static boolean a() {
        return ((defpackage.jrj) defpackage.mkp.a.i(defpackage.jrj.class)) == b;
    }

    public static defpackage.jrj valueOf(java.lang.String str) {
        return (defpackage.jrj) java.lang.Enum.valueOf(defpackage.jrj.class, str);
    }

    public static defpackage.jrj[] values() {
        return (defpackage.jrj[]) c.clone();
    }
}
