package defpackage;

/* loaded from: classes3.dex */
public final class zph extends abnv implements abox {
    public static final zph a;
    public int b;
    public zpf c;
    public int d;

    static {
        zph zphVar = new zph();
        a = zphVar;
        abnv.P(zph.class, zphVar);
    }

    private zph() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0000\u0004ဉ\u0000\u0006\f", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zph();
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
        return abnv.L(zph.class);
    }
}
