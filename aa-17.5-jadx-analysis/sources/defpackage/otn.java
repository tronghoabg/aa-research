package defpackage;

/* loaded from: classes2.dex */
public final class otn extends abnv implements abox {
    public static final otn a;
    public static final abnh d;
    public int b = 0;
    public Object c;

    static {
        otn otnVar = new otn();
        a = otnVar;
        abnv.P(otn.class, otnVar);
        d = abnv.W(osn.a, otnVar, otnVar, null, 103, abqd.MESSAGE);
    }

    private otn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", otj.class, otk.class, otl.class, osm.class});
        }
        if (i2 == 3) {
            return new otn();
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
        return abnv.L(otn.class);
    }
}
