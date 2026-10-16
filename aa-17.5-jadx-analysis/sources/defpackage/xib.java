package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xib {
    public static final xib a;
    public static final xib b;
    public static final xib c;
    public static final xib d;
    private static final /* synthetic */ xib[] e;

    static {
        xib xibVar = new xib("PROPERTY_CONTROL", 0);
        a = xibVar;
        xib xibVar2 = new xib("ACTION_CONTROL", 1);
        b = xibVar2;
        xib xibVar3 = new xib("GROUP", 2);
        c = xibVar3;
        xib xibVar4 = new xib("TYPE_NOT_SET", 3);
        d = xibVar4;
        e = new xib[]{xibVar, xibVar2, xibVar3, xibVar4};
    }

    public static xib a(int i) {
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

    public static xib valueOf(String str) {
        return (xib) Enum.valueOf(xib.class, str);
    }

    public static xib[] values() {
        return (xib[]) e.clone();
    }
}
