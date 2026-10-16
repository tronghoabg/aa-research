package defpackage;

/* loaded from: classes3.dex */
public final class zkg extends abnv implements abox {
    public static final aboe a = new wbk(10);
    public static final zkg b;
    public zkf c;
    public zke d;
    public abod e = abnw.a;
    private int f;

    static {
        zkg zkgVar = new zkg();
        b = zkgVar;
        abnv.P(zkg.class, zkgVar);
    }

    private zkg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(b, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ࠬ", new Object[]{"f", "c", "d", "e", ywl.s});
        }
        if (i2 == 3) {
            return new zkg();
        }
        if (i2 == 4) {
            return new abnp(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(zkg.class);
    }
}
