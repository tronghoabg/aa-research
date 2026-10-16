package defpackage;

/* loaded from: classes3.dex */
public final class abdv extends abnv implements abox {
    public static final abdv a;
    private byte c = 2;
    public aboh b = abpf.b;

    static {
        abdv abdvVar = new abdv();
        a = abdvVar;
        abnv.P(abdv.class, abdvVar);
    }

    private abdv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", abdu.class});
        }
        if (i2 == 3) {
            return new abdv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abdv.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
