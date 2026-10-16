package defpackage;

/* loaded from: classes3.dex */
public final class tqx extends abnv implements abox {
    public static final tqx a;
    public int b;
    public aaih c;
    public float d;
    public float e;
    public tqw f;
    public int g;
    public int h;

    static {
        tqx tqxVar = new tqx();
        a = tqxVar;
        abnv.P(tqx.class, tqxVar);
    }

    private tqx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဉ\u0003\u0005ဏ\u0004\u0006ဏ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new tqx();
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
        return abnv.L(tqx.class);
    }
}
