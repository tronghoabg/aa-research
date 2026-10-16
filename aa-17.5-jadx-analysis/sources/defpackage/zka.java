package defpackage;

/* loaded from: classes3.dex */
public final class zka extends abnv implements abox {
    public static final zka a;
    private abot b;
    private abot c;
    private byte d;

    static {
        zka zkaVar = new zka();
        a = zkaVar;
        abnv.P(zka.class, zkaVar);
    }

    private zka() {
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
            abqd abqdVar = abqd.INT32;
            abqd abqdVar2 = abqd.MESSAGE;
            zjz zjzVar = zjz.a;
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0002\u0001в\u0002в", new Object[]{"b", new lds(abqdVar, 0, abqdVar2, zjzVar), "c", new lds(abqd.STRING, "", abqdVar2, zjzVar)});
        }
        if (i2 == 3) {
            return new zka();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zka.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
