package defpackage;

/* loaded from: classes3.dex */
public final class abjc extends abnv implements abox {
    public static final abjc a;
    public int b;
    public abid c;
    public float d;
    public int e;
    public int f;
    public abjq g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    static {
        abjc abjcVar = new abjc();
        a = abjcVar;
        abnv.P(abjc.class, abjcVar);
    }

    private abjc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0007\u0003ဆ\b\u0004ဆ\t\u0005ခ\u0001\u0006င\n\u0007င\u000b\bင\f\tင\r\u000bင\u0002\fင\u0003", new Object[]{"b", "c", "g", "h", "i", "d", "j", "k", "l", "m", "e", "f"});
        }
        if (i2 == 3) {
            return new abjc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(abjc.class);
    }
}
