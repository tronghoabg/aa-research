package defpackage;

/* loaded from: classes2.dex */
public final class qnk extends abnv implements abox {
    public static final qnk a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;

    static {
        qnk qnkVar = new qnk();
        a = qnkVar;
        abnv.P(qnk.class, qnkVar);
    }

    private qnk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new qnk();
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
        return abnv.L(qnk.class);
    }
}
