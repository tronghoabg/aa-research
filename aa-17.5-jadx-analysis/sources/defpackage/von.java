package defpackage;

/* loaded from: classes3.dex */
public final class von extends abnv implements abox {
    public static final von a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        von vonVar = new von();
        a = vonVar;
        abnv.P(von.class, vonVar);
    }

    private von() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"c", "b", ajey.class, voo.class, vop.class, voq.class});
        }
        if (i2 == 3) {
            return new von();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(von.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
