package defpackage;

/* loaded from: classes3.dex */
public final class aapz extends abns implements abnt {
    public static final aapz a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aapz aapzVar = new aapz();
        a = aapzVar;
        abnv.P(aapz.class, aapzVar);
    }

    private aapz() {
        abnw abnwVar = abnw.a;
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\t\u001b\u0002\u0000\u0000\u0001\tᐉ\u000f\u001bဉ\u001a", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aapz();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aapz.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
