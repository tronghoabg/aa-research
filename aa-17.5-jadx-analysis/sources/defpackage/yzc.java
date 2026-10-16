package defpackage;

/* loaded from: classes.dex */
public final class yzc extends abnv implements abox {
    public static final yzc a;
    public int b;
    public aboh c = abpf.b;
    public int d;
    public yzb e;
    public zaf f;

    static {
        yzc yzcVar = new yzc();
        a = yzcVar;
        abnv.P(yzc.class, yzcVar);
    }

    private yzc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", yxe.class, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new yzc();
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
        return abnv.L(yzc.class);
    }
}
