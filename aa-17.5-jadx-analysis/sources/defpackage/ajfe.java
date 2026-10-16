package defpackage;

/* loaded from: classes2.dex */
public final class ajfe extends abnv implements abox {
    public static final ajfe a;
    public int b;
    public ajfd c;
    public ajfx d;
    public int e;
    public ajfc f;
    public String g = "";

    static {
        ajfe ajfeVar = new ajfe();
        a = ajfeVar;
        abnv.P(ajfe.class, ajfeVar);
    }

    private ajfe() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", xln.n, "f", "g"});
        }
        if (i2 == 3) {
            return new ajfe();
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
        return abnv.L(ajfe.class);
    }
}
