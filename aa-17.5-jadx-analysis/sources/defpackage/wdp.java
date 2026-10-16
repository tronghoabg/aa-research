package defpackage;

/* loaded from: classes3.dex */
public final class wdp extends abnv implements abox {
    public static final wdp a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        wdp wdpVar = new wdp();
        a = wdpVar;
        abnv.P(wdp.class, wdpVar);
    }

    private wdp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new wdp();
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
        return abnv.L(wdp.class);
    }
}
