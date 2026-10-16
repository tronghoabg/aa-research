package defpackage;

/* loaded from: classes2.dex */
public final class rhh extends abnv implements abox {
    public static final rhh a;
    public abot b = abot.a;

    static {
        rhh rhhVar = new rhh();
        a = rhhVar;
        abnv.P(rhh.class, rhhVar);
    }

    private rhh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new lds(abqd.STRING, "", abqd.BOOL, false)});
        }
        if (i2 == 3) {
            return new rhh();
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
        return abnv.L(rhh.class);
    }

    public final abot b() {
        abot abotVar = this.b;
        if (!abotVar.b) {
            this.b = abotVar.a();
        }
        return this.b;
    }
}
