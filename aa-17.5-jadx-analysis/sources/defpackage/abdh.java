package defpackage;

/* loaded from: classes3.dex */
public final class abdh extends abnv implements abox {
    public static final abdh a;
    public long b;
    private int c;

    static {
        abdh abdhVar = new abdh();
        a = abdhVar;
        abnv.P(abdh.class, abdhVar);
    }

    private abdh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002စ\u0001", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new abdh();
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
        return abnv.L(abdh.class);
    }
}
