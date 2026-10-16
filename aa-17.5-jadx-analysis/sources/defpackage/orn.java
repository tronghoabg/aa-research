package defpackage;

/* loaded from: classes2.dex */
public final class orn extends abnv implements abox {
    public static final orn a;
    public int b;
    public Object d;
    public int e;
    public int f;
    public int h;
    public abpt i;
    public boolean k;
    public int c = 0;
    public String g = "";
    public String j = "";

    static {
        orn ornVar = new orn();
        a = ornVar;
        abnv.P(orn.class, ornVar);
    }

    private orn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\r\u0001\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\r<\u0000\u000eဇ\u0006", new Object[]{"d", "c", "b", "e", orj.e, "f", orj.d, "g", "h", "i", "j", orm.class, orp.class, ort.class, oro.class, orq.class, orr.class, "k"});
        }
        if (i2 == 3) {
            return new orn();
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
        return abnv.L(orn.class);
    }
}
