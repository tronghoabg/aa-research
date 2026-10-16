package defpackage;

/* loaded from: classes3.dex */
public final class zpg extends abnv implements abox {
    public static final zpg a;
    public int b;
    public String c = "";
    public zpe d;

    static {
        zpg zpgVar = new zpg();
        a = zpgVar;
        abnv.P(zpg.class, zpgVar);
    }

    private zpg() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zpg();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(zpg.class);
    }
}
