package defpackage;

/* loaded from: classes3.dex */
public final class zlr extends abnv implements abox {
    public static final zlr a;
    private byte b = 2;

    static {
        zlr zlrVar = new zlr();
        a = zlrVar;
        abnv.P(zlr.class, zlrVar);
    }

    private zlr() {
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
            return new zlr();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zlr.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
