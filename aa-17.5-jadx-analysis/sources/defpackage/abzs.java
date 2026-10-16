package defpackage;

/* loaded from: classes3.dex */
public final class abzs extends abnv implements abox {
    public static final abzs a;
    public int b;
    public int c;
    public abzq d;
    public String e;
    public abot f;
    private int g;
    private abot h;

    static {
        abzs abzsVar = new abzs();
        a = abzsVar;
        abnv.P(abzs.class, abzsVar);
    }

    private abzs() {
        abot abotVar = abot.a;
        this.f = abotVar;
        this.h = abotVar;
        Object[] objArr = abpf.a;
        this.e = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abqd abqdVar = abqd.UINT32;
            abqd abqdVar2 = abqd.MESSAGE;
            abzr abzrVar = abzr.a;
            return new abpg(a, "\u0000\u0006\u0000\u0001\u0001\u0019\u0006\u0002\u0000\u0000\u0001\f\u0006\u000b\nဉ\u0000\u000eȈ\u00102\u00192", new Object[]{"g", "b", "c", "d", "e", "f", new lds(abqdVar, 0, abqdVar2, abzrVar), "h", new lds(abqdVar, 0, abqdVar2, abzrVar)});
        }
        if (i2 == 3) {
            return new abzs();
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
        return abnv.L(abzs.class);
    }
}
