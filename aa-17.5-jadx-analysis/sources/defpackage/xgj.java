package defpackage;

/* loaded from: classes3.dex */
public final class xgj extends abnv implements abox {
    public static final aboe a = new wbk(2);
    public static final aboe b = new wbk(3);
    public static final aboe c = new wbk(4);
    public static final aboe d = new wbk(5);
    public static final aboe e = new wbk(6);
    public static final xgj f;
    public int g;
    public int h;
    public abod i;
    public abod j;
    public abod k;
    public abod l;
    public abod m;

    static {
        xgj xgjVar = new xgj();
        f = xgjVar;
        abnv.P(xgj.class, xgjVar);
    }

    private xgj() {
        abnw abnwVar = abnw.a;
        this.i = abnwVar;
        this.j = abnwVar;
        this.k = abnwVar;
        this.l = abnwVar;
        this.m = abnwVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(f, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0005\u0000\u0001ဌ\u0000\u0002,\u0003,\u0004,\u0005,\u0006,", new Object[]{"g", "h", "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new xgj();
        }
        if (i2 == 4) {
            return new abnp(f);
        }
        if (i2 == 5) {
            return f;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(xgj.class);
    }

    public final void b() {
        abod abodVar = this.i;
        if (abodVar.c()) {
            return;
        }
        this.i = abnv.G(abodVar);
    }
}
