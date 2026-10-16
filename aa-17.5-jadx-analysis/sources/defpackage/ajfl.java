package defpackage;

/* loaded from: classes3.dex */
public final class ajfl extends abns implements abnt {
    public static final ajfl a;
    public int b;
    public long d;
    private byte f = 2;
    public String c = "";
    public String e = "";

    static {
        ajfl ajflVar = new ajfl();
        a = ajflVar;
        abnv.P(ajfl.class, ajflVar);
    }

    private ajfl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ajfl();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajfl.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
