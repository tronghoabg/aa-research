package defpackage;

/* loaded from: classes3.dex */
public final class abjz extends abnv implements abox {
    public static final abjz a;
    public int b;
    public boolean c;
    public abjk d;
    public int e = 1000;
    public long f;
    public boolean g;

    static {
        abjz abjzVar = new abjz();
        a = abjzVar;
        abnv.P(abjz.class, abjzVar);
    }

    private abjz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004စ\u0003\u0006ဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new abjz();
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
        return abnv.L(abjz.class);
    }
}
