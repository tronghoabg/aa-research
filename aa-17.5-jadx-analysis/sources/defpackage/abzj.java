package defpackage;

/* loaded from: classes3.dex */
public final class abzj extends abnv implements abox {
    public static final abzj a;
    private abot b;
    private abot c;
    private abot d;

    static {
        abzj abzjVar = new abzj();
        a = abzjVar;
        abnv.P(abzj.class, abzjVar);
    }

    private abzj() {
        abot abotVar = abot.a;
        this.b = abotVar;
        this.c = abotVar;
        this.d = abotVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abqd abqdVar = abqd.STRING;
            return new abpg(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"b", new lds(abqdVar, "", abqd.BOOL, false), "c", new lds(abqdVar, "", abqd.INT32, 0), "d", new lds(abqdVar, "", abqdVar, "")});
        }
        if (i2 == 3) {
            return new abzj();
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
        return abnv.L(abzj.class);
    }
}
