package defpackage;

/* loaded from: classes3.dex */
public final class aaos extends abnv implements abox {
    public static final aaos a;
    private byte b = 2;

    static {
        aaos aaosVar = new aaos();
        a = aaosVar;
        abnv.P(aaos.class, aaosVar);
    }

    private aaos() {
        Object[] objArr = abpf.a;
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
            return new aaos();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaos.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
