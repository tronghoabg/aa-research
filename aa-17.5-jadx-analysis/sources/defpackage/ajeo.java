package defpackage;

/* loaded from: classes3.dex */
public final class ajeo extends abnv implements abox {
    public static final ajeo a;
    public int b;
    public long c;
    public String d = "";

    static {
        ajeo ajeoVar = new ajeo();
        a = ajeoVar;
        abnv.P(ajeo.class, ajeoVar);
    }

    private ajeo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ajeo();
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
        return abnv.L(ajeo.class);
    }
}
