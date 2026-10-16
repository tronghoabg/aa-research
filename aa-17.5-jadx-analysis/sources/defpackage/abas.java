package defpackage;

/* loaded from: classes3.dex */
public final class abas extends abns implements abnt {
    public static final abas a;
    private byte b = 2;

    static {
        abas abasVar = new abas();
        a = abasVar;
        abnv.P(abas.class, abasVar);
    }

    private abas() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new abas();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abas.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
