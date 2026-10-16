package defpackage;

/* loaded from: classes3.dex */
public final class ablj extends abnv implements abox {
    public static final ablj a;
    private abot b = abot.a;

    static {
        ablj abljVar = new ablj();
        a = abljVar;
        abnv.P(ablj.class, abljVar);
    }

    private ablj() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0005\u0005\u0001\u0001\u0000\u0000\u00052", new Object[]{"b", new lds(abqd.STRING, "", abqd.MESSAGE, ablh.a)});
        }
        if (i2 == 3) {
            return new ablj();
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
        return abnv.L(ablj.class);
    }
}
