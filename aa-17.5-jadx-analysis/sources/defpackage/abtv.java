package defpackage;

/* loaded from: classes3.dex */
public final class abtv extends abnv implements abox {
    public static final abtv a;
    private int b;
    private abtp c;
    private byte d = 2;

    static {
        abtv abtvVar = new abtv();
        a = abtvVar;
        abnv.P(abtv.class, abtvVar);
    }

    private abtv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abtv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abtv.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
