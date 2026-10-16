package defpackage;

/* loaded from: classes2.dex */
public final class pbn extends abnv implements abox {
    public static final pbn a;
    public abot b;
    public abot c;
    public abot d;

    static {
        pbn pbnVar = new pbn();
        a = pbnVar;
        abnv.P(pbn.class, pbnVar);
    }

    private pbn() {
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
            abqd abqdVar2 = abqd.MESSAGE;
            return new abpg(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"b", new lds(abqdVar, "", abqdVar2, pbm.a), "c", new lds(abqdVar, "", abqdVar2, pbo.a), "d", new lds(abqdVar, "", abqdVar, "")});
        }
        if (i2 == 3) {
            return new pbn();
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
        return abnv.L(pbn.class);
    }

    public final abot b() {
        abot abotVar = this.b;
        if (!abotVar.b) {
            this.b = abotVar.a();
        }
        return this.b;
    }

    public final abot c() {
        abot abotVar = this.c;
        if (!abotVar.b) {
            this.c = abotVar.a();
        }
        return this.c;
    }

    public final abot d() {
        abot abotVar = this.d;
        if (!abotVar.b) {
            this.d = abotVar.a();
        }
        return this.d;
    }
}
