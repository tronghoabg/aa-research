package defpackage;

/* loaded from: classes3.dex */
public final class aanh extends abnv implements abox {
    public static final aanh a;
    private int b;
    private abkz c;
    private byte d = 2;

    static {
        aanh aanhVar = new aanh();
        a = aanhVar;
        abnv.P(aanh.class, aanhVar);
    }

    private aanh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aanh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aanh.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
