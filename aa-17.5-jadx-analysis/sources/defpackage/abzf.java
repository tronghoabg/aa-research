package defpackage;

/* loaded from: classes3.dex */
public final class abzf extends abnv implements abox {
    public static final abzf a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        abzf abzfVar = new abzf();
        a = abzfVar;
        abnv.P(abzf.class, abzfVar);
    }

    private abzf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"c", "b", "d", abze.class});
        }
        if (i2 == 3) {
            return new abzf();
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
        return abnv.L(abzf.class);
    }
}
