package defpackage;

/* loaded from: classes.dex */
public final class acan extends abns implements abnt {
    public static final acan a;
    public int b;
    public abue c;
    public int d;
    public zpg e;
    private byte f = 2;

    static {
        acan acanVar = new acan();
        a = acanVar;
        abnv.P(acan.class, acanVar);
    }

    private acan() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", absk.g, "e"});
        }
        if (i2 == 3) {
            return new acan();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acan.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
