package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dqf {
    public static final defpackage.dqf a;
    public static final defpackage.dqf b;
    public static final defpackage.dqf c;
    public static final java.util.Map d;
    public static final java.util.Map e;
    private static final /* synthetic */ defpackage.dqf[] f;

    static {
        defpackage.dqf dqfVar = new defpackage.dqf("SPREAD", 0);
        a = dqfVar;
        defpackage.dqf dqfVar2 = new defpackage.dqf("SPREAD_INSIDE", 1);
        b = dqfVar2;
        defpackage.dqf dqfVar3 = new defpackage.dqf("PACKED", 2);
        c = dqfVar3;
        f = new defpackage.dqf[]{dqfVar, dqfVar2, dqfVar3};
        java.util.HashMap map = new java.util.HashMap();
        d = map;
        java.util.HashMap map2 = new java.util.HashMap();
        e = map2;
        map.put("packed", dqfVar3);
        map.put("spread_inside", dqfVar2);
        map.put("spread", dqfVar);
        map2.put("packed", 2);
        map2.put("spread_inside", 1);
        map2.put("spread", 0);
    }

    public static int a(java.lang.String str) {
        java.util.Map map = e;
        if (map.containsKey(str)) {
            return ((java.lang.Integer) map.get(str)).intValue();
        }
        return -1;
    }

    public static defpackage.dqf valueOf(java.lang.String str) {
        return (defpackage.dqf) java.lang.Enum.valueOf(defpackage.dqf.class, str);
    }

    public static defpackage.dqf[] values() {
        return (defpackage.dqf[]) f.clone();
    }
}
