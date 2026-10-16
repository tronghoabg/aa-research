package defpackage;

/* loaded from: classes2.dex */
public final class ajgw extends abnv implements abox {
    public static final ajgw a;
    public int b;
    public Object d;
    public ajgy e;
    public int c = 0;
    private byte f = 2;

    static {
        ajgw ajgwVar = new ajgw();
        a = ajgwVar;
        abnv.P(ajgw.class, ajgwVar);
    }

    private ajgw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002ᐉ\u0000\u0003м\u0000", new Object[]{"d", "c", "b", ajfr.class, "e", ajhb.class});
        }
        if (i2 == 3) {
            return new ajgw();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajgw.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
