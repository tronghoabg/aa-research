package defpackage;

/* loaded from: classes3.dex */
public final class ackx extends abnv implements abox {
    public static final ackx a;
    public String b = "";
    public int c;

    static {
        ackx ackxVar = new ackx();
        a = ackxVar;
        abnv.P(ackx.class, ackxVar);
    }

    private ackx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\f", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ackx();
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
        return abnv.L(ackx.class);
    }
}
