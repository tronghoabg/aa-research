package defpackage;

/* loaded from: classes3.dex */
public final class abjm extends abnv implements abox {
    public static final abjm a;
    public int b = 0;
    public Object c;

    static {
        abjm abjmVar = new abjm();
        a = abjmVar;
        abnv.P(abjm.class, abjmVar);
    }

    private abjm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", abhr.class, abhs.class, abif.class, abjv.class, abie.class, abio.class, abjx.class});
        }
        if (i2 == 3) {
            return new abjm();
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
        return abnv.L(abjm.class);
    }
}
