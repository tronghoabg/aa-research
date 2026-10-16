package defpackage;

/* loaded from: classes3.dex */
public final class zjw extends abnv implements abox {
    public static final zjw a;
    private byte b = 2;

    static {
        zjw zjwVar = new zjw();
        a = zjwVar;
        abnv.P(zjw.class, zjwVar);
    }

    private zjw() {
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
            return new zjw();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zjw.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
