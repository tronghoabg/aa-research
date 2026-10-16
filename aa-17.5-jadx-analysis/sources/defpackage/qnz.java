package defpackage;

/* loaded from: classes2.dex */
public final class qnz extends abnv implements abox {
    public static final qnz a;
    public int b = 0;
    public Object c;

    static {
        qnz qnzVar = new qnz();
        a = qnzVar;
        abnv.P(qnz.class, qnzVar);
    }

    private qnz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"c", "b", qnq.class, qnp.class, qnv.class, qny.class, qnu.class, qnw.class, qnt.class, qnn.class, qno.class, qnx.class, qns.class});
        }
        if (i2 == 3) {
            return new qnz();
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
        return abnv.L(qnz.class);
    }
}
