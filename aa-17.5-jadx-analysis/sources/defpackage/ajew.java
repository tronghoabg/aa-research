package defpackage;

/* loaded from: classes2.dex */
public final class ajew extends abnv implements abox {
    public static final ajew a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public boolean h;
    public boolean i;
    public int j;

    static {
        ajew ajewVar = new ajew();
        a = ajewVar;
        abnv.P(ajew.class, ajewVar);
    }

    private ajew() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0007ဇ\u0006\bဇ\u0007\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new ajew();
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
        return abnv.L(ajew.class);
    }
}
