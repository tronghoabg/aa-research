package defpackage;

/* loaded from: classes3.dex */
public final class znw extends abnv implements abox {
    public static final znw a;
    private abot b;
    private abot c;

    static {
        znw znwVar = new znw();
        a = znwVar;
        abnv.P(znw.class, znwVar);
    }

    private znw() {
        abot abotVar = abot.a;
        this.b = abotVar;
        this.c = abotVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abqd abqdVar = abqd.STRING;
            return new abpg(a, "\u0001\u0002\u0000\u0000\u0015\u0016\u0002\u0002\u0000\u0000\u00152\u00162", new Object[]{"b", new lds(abqdVar, "", abqdVar, ""), "c", new lds(abqdVar, "", abqdVar, "")});
        }
        if (i2 == 3) {
            return new znw();
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
        return abnv.L(znw.class);
    }
}
