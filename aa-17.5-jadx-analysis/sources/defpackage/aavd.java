package defpackage;

/* loaded from: classes3.dex */
public final class aavd extends abnv implements abox {
    public static final aavd a;
    public int b;
    public aauy c;
    public abot d;
    private abot e;
    private byte f;

    static {
        aavd aavdVar = new aavd();
        a = aavdVar;
        abnv.P(aavd.class, aavdVar);
    }

    private aavd() {
        abot abotVar = abot.a;
        this.e = abotVar;
        this.d = abotVar;
        this.f = (byte) 2;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            abqd abqdVar = abqd.STRING;
            abqd abqdVar2 = abqd.MESSAGE;
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0002\u0000\u0001\u0001ᐉ\u0000\u00032\b2", new Object[]{"b", "c", "e", new lds(abqdVar, "", abqdVar2, aauu.a), "d", new lds(abqdVar, "", abqdVar2, aava.b)});
        }
        if (i2 == 3) {
            return new aavd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aavd.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
