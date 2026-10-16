package defpackage;

/* loaded from: classes.dex */
public final class abzo extends abnv implements abox {
    public static final abzo a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        abzo abzoVar = new abzo();
        a = abzoVar;
        abnv.P(abzo.class, abzoVar);
    }

    private abzo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0001\u0001\u0001 \u0007\u0000\u0000\u0000\u0001ဈ\u0000\u000b3\u0000\u000e5\u0000\u0017:\u0000\u0018;\u0000\u001f;\u0000 =\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new abzo();
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
        return abnv.L(abzo.class);
    }
}
