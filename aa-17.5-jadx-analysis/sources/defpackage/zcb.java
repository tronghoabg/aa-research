package defpackage;

/* loaded from: classes3.dex */
public final class zcb extends abnv implements abox {
    public static final zcb a;
    public int b;
    public Object d;
    public zby e;
    public int c = 0;
    private byte g = 2;
    public aboh f = abpf.b;

    static {
        zcb zcbVar = new zcb();
        a = zcbVar;
        abnv.P(zcb.class, zcbVar);
    }

    private zcb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", zby.class, zbz.class});
        }
        if (i2 == 3) {
            return new zcb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zcb.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        aboh abohVar = this.f;
        if (abohVar.c()) {
            return;
        }
        this.f = abnv.I(abohVar);
    }
}
