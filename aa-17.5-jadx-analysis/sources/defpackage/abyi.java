package defpackage;

/* loaded from: classes3.dex */
public final class abyi extends abnv implements abox {
    public static final abyi a;
    public int b;
    public int c = 0;
    public Object d;
    public abnf e;

    static {
        abyi abyiVar = new abyi();
        a = abyiVar;
        abnv.P(abyi.class, abyiVar);
    }

    private abyi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", abyh.class, abyf.class, abxy.class, abye.class, abyg.class});
        }
        if (i2 == 3) {
            return new abyi();
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
        return abnv.L(abyi.class);
    }
}
