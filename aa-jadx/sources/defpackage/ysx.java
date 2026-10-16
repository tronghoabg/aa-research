package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ysx {
    public static final defpackage.ysx a;
    public static final defpackage.ysx b;
    public static final defpackage.ysx c;
    public static final defpackage.ysx d;
    private static final /* synthetic */ defpackage.ysx[] e;

    static {
        defpackage.ysx ysxVar = new defpackage.ysx("BOOLEAN", 0);
        a = ysxVar;
        defpackage.ysx ysxVar2 = new defpackage.ysx("STRING", 1);
        b = ysxVar2;
        defpackage.ysx ysxVar3 = new defpackage.ysx("LONG", 2);
        c = ysxVar3;
        defpackage.ysx ysxVar4 = new defpackage.ysx("DOUBLE", 3);
        d = ysxVar4;
        e = new defpackage.ysx[]{ysxVar, ysxVar2, ysxVar3, ysxVar4};
    }

    public static defpackage.ysx a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return b;
        }
        if (obj instanceof java.lang.Boolean) {
            return a;
        }
        if (obj instanceof java.lang.Long) {
            return c;
        }
        if (obj instanceof java.lang.Double) {
            return d;
        }
        throw new java.lang.AssertionError("invalid tag type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))));
    }

    public static defpackage.ysx valueOf(java.lang.String str) {
        return (defpackage.ysx) java.lang.Enum.valueOf(defpackage.ysx.class, str);
    }

    public static defpackage.ysx[] values() {
        return (defpackage.ysx[]) e.clone();
    }
}
