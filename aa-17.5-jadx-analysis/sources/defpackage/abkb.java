package defpackage;

/* loaded from: classes3.dex */
public final class abkb extends abnv implements abox {
    public static final abkb a;
    public int b;
    public aaig c;
    public abhp d;
    public float e;
    public boolean f;
    public int g;
    public int h;

    static {
        abkb abkbVar = new abkb();
        a = abkbVar;
        abnv.P(abkb.class, abkbVar);
    }

    private abkb() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0002\u0004ဇ\u0003\u0005ဉ\u0001\u0007᠌\u0005\nဌ\u0007", new Object[]{"b", "c", "e", "f", "d", "g", abho.c, "h"});
        }
        if (i2 == 3) {
            return new abkb();
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
        return abnv.L(abkb.class);
    }
}
