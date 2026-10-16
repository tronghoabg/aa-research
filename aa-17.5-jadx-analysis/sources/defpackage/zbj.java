package defpackage;

/* loaded from: classes3.dex */
public final class zbj extends abnv implements abox {
    public static final zbj a;
    private abot b;
    private abot c;
    private abot d;
    private abot e;
    private abot f;
    private abot g;

    static {
        zbj zbjVar = new zbj();
        a = zbjVar;
        abnv.P(zbj.class, zbjVar);
    }

    private zbj() {
        abot abotVar = abot.a;
        this.b = abotVar;
        this.c = abotVar;
        this.d = abotVar;
        this.e = abotVar;
        this.f = abotVar;
        this.g = abotVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abqd abqdVar = abqd.INT32;
            lds ldsVar = new lds(abqdVar, 0, abqdVar, 0);
            lds ldsVar2 = new lds(abqdVar, 0, abqdVar, 0);
            lds ldsVar3 = new lds(abqdVar, 0, abqdVar, 0);
            abqd abqdVar2 = abqd.INT64;
            abqd abqdVar3 = abqd.UINT32;
            return new abpg(a, "\u0004\u0006\u0000\u0000\u0001\r\u0006\u0006\u0000\u0000\u00012\u00022\u00032\u000b2\f2\r2", new Object[]{"b", ldsVar, "c", ldsVar2, "d", ldsVar3, "e", new lds(abqdVar2, 0L, abqdVar3, 0), "f", new lds(abqdVar2, 0L, abqdVar3, 0), "g", new lds(abqdVar, 0, abqdVar3, 0)});
        }
        if (i2 == 3) {
            return new zbj();
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
        return abnv.L(zbj.class);
    }
}
