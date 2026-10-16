package defpackage;

/* loaded from: classes3.dex */
public final class abwj extends abnv implements abox {
    public static final abwj a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        abwj abwjVar = new abwj();
        a = abwjVar;
        abnv.P(abwj.class, abwjVar);
    }

    private abwj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"c", "b", "d", abwi.class});
        }
        if (i2 == 3) {
            return new abwj();
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
        return abnv.L(abwj.class);
    }
}
