package defpackage;

/* loaded from: classes3.dex */
public final class abye extends abnv implements abox {
    public static final abye a;
    public int b = 0;
    public Object c;
    public int d;

    static {
        abye abyeVar = new abye();
        a = abyeVar;
        abnv.P(abye.class, abyeVar);
    }

    private abye() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", abyd.class, abxz.class, abyb.class, abya.class});
        }
        if (i2 == 3) {
            return new abye();
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
        return abnv.L(abye.class);
    }
}
