package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dqg {
    public static final defpackage.dqg a;
    public static final defpackage.dqg b;
    public static final defpackage.dqg c;
    public static final java.util.Map d;
    public static final java.util.Map e;
    private static final /* synthetic */ defpackage.dqg[] f;

    static {
        defpackage.dqg dqgVar = new defpackage.dqg("NONE", 0);
        a = dqgVar;
        defpackage.dqg dqgVar2 = new defpackage.dqg("CHAIN", 1);
        b = dqgVar2;
        defpackage.dqg dqgVar3 = new defpackage.dqg("ALIGNED", 2);
        c = dqgVar3;
        f = new defpackage.dqg[]{dqgVar, dqgVar2, dqgVar3};
        java.util.HashMap map = new java.util.HashMap();
        d = map;
        java.util.HashMap map2 = new java.util.HashMap();
        e = map2;
        map.put("none", dqgVar);
        map.put("chain", dqgVar2);
        map.put("aligned", dqgVar3);
        map2.put("none", 0);
        map2.put("chain", 3);
        map2.put("aligned", 2);
    }

    public static defpackage.dqg valueOf(java.lang.String str) {
        return (defpackage.dqg) java.lang.Enum.valueOf(defpackage.dqg.class, str);
    }

    public static defpackage.dqg[] values() {
        return (defpackage.dqg[]) f.clone();
    }
}
