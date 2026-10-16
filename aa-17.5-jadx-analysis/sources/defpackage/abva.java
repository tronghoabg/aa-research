package defpackage;

/* loaded from: classes3.dex */
public final class abva extends abnv implements abox {
    public static final abva a;
    public int b = 0;
    public Object c;
    public int d;

    static {
        abva abvaVar = new abva();
        a = abvaVar;
        abnv.P(abva.class, abvaVar);
    }

    private abva() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", abuz.class, abuv.class, abux.class, abuw.class});
        }
        if (i2 == 3) {
            return new abva();
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
        return abnv.L(abva.class);
    }
}
