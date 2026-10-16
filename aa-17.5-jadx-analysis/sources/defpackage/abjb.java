package defpackage;

/* loaded from: classes3.dex */
public final class abjb extends abnv implements abox {
    public static final abjb a;
    public int b;
    public int c = 0;
    public Object d;
    public abht e;
    public int f;

    static {
        abjb abjbVar = new abjb();
        a = abjbVar;
        abnv.P(abjb.class, abjbVar);
    }

    private abjb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006င\u0002", new Object[]{"d", "c", "b", "e", abjh.class, abjd.class, abji.class, "f"});
        }
        if (i2 == 3) {
            return new abjb();
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
        return abnv.L(abjb.class);
    }
}
