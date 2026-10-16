package defpackage;

/* loaded from: classes3.dex */
public final class zpq extends abnv implements abox {
    public static final zpq a;
    private abot b;
    private abot c;
    private byte d;

    static {
        zpq zpqVar = new zpq();
        a = zpqVar;
        abnv.P(zpq.class, zpqVar);
    }

    private zpq() {
        abot abotVar = abot.a;
        this.b = abotVar;
        this.c = abotVar;
        this.d = (byte) 2;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            abqd abqdVar = abqd.STRING;
            abqd abqdVar2 = abqd.MESSAGE;
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0002\u0001в\u0002в", new Object[]{"b", new lds(abqdVar, "", abqdVar2, zpo.a), "c", new lds(abqdVar, "", abqdVar2, zpn.a)});
        }
        if (i2 == 3) {
            return new zpq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zpq.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
