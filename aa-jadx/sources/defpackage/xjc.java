package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xjc {
    public static final defpackage.xjc a;
    public static final defpackage.xjc b;
    public static final defpackage.xjc c;
    public static final defpackage.xjc d;
    private static final /* synthetic */ defpackage.xjc[] e;

    static {
        defpackage.xjc xjcVar = new defpackage.xjc("PROPERTY_CONTROL", 0);
        a = xjcVar;
        defpackage.xjc xjcVar2 = new defpackage.xjc("ACTION_CONTROL", 1);
        b = xjcVar2;
        defpackage.xjc xjcVar3 = new defpackage.xjc("GROUP", 2);
        c = xjcVar3;
        defpackage.xjc xjcVar4 = new defpackage.xjc("TYPE_NOT_SET", 3);
        d = xjcVar4;
        e = new defpackage.xjc[]{xjcVar, xjcVar2, xjcVar3, xjcVar4};
    }

    public static defpackage.xjc a(int i) {
        if (i == 0) {
            return d;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i != 3) {
            return null;
        }
        return c;
    }

    public static defpackage.xjc valueOf(java.lang.String str) {
        return (defpackage.xjc) java.lang.Enum.valueOf(defpackage.xjc.class, str);
    }

    public static defpackage.xjc[] values() {
        return (defpackage.xjc[]) e.clone();
    }
}
