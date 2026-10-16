package defpackage;

/* loaded from: classes2.dex */
public final class ajej extends abnv implements abox {
    public static final ajej a;
    public int b;
    public ajek d;
    public int e;
    private byte f = 2;
    public aboh c = abpf.b;

    static {
        ajej ajejVar = new ajej();
        a = ajejVar;
        abnv.P(ajej.class, ajejVar);
    }

    private ajej() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003င\u0001", new Object[]{"b", "c", ajei.class, "d", "e"});
        }
        if (i2 == 3) {
            return new ajej();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajej.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
