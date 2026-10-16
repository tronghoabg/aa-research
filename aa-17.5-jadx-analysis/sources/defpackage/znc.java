package defpackage;

/* loaded from: classes3.dex */
public final class znc extends abns implements abnt {
    public static final znc a;
    private byte b = 2;

    static {
        znc zncVar = new znc();
        a = zncVar;
        abnv.P(znc.class, zncVar);
    }

    private znc() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new znc();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(znc.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
