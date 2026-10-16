package defpackage;

/* loaded from: classes3.dex */
public final class ably extends abnv implements abox {
    public static final ably a;
    private int b;
    private abzt c;
    private zkk d;
    private zkk e;
    private byte f = 2;

    static {
        ably ablyVar = new ably();
        a = ablyVar;
        abnv.P(ably.class, ablyVar);
    }

    private ably() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\t\u0018\u0003\u0000\u0000\u0003\tᐉ\u0005\u0012ᐉ\u0004\u0018ᐉ\u0017", new Object[]{"b", "d", "c", "e"});
        }
        if (i2 == 3) {
            return new ably();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ably.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
