package defpackage;

/* loaded from: classes3.dex */
public final class yvg extends abnv implements abox {
    public static final yvg a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        yvg yvgVar = new yvg();
        a = yvgVar;
        abnv.P(yvg.class, yvgVar);
    }

    private yvg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abob abobVar = xou.l;
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006", new Object[]{"b", "c", abobVar, "d", abobVar, "e", abobVar, "f", abobVar, "g", abobVar, "h", abobVar, "i", abobVar});
        }
        if (i2 == 3) {
            return new yvg();
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
        return abnv.L(yvg.class);
    }
}
