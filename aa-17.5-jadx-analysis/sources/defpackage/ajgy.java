package defpackage;

/* loaded from: classes3.dex */
public final class ajgy extends abnv implements abox {
    public static final ajgy a;
    public int b;
    public boolean c;
    private byte d = 2;

    static {
        ajgy ajgyVar = new ajgy();
        a = ajgyVar;
        abnv.P(ajgy.class, ajgyVar);
    }

    private ajgy() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ajgy();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajgy.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
