package defpackage;

/* loaded from: classes3.dex */
public final class abdx extends abnv implements abox {
    public static final abdx a;
    public int b;
    public abms c;
    public abod d;
    public aboc e;
    public int f;
    public abod g;
    public int h;
    public abod i;
    public int j;
    public abms k;
    public abod l;
    public abms m;
    public abod n;
    private byte o = 2;

    static {
        abdx abdxVar = new abdx();
        a = abdxVar;
        abnv.P(abdx.class, abdxVar);
    }

    private abdx() {
        abms abmsVar = abms.d;
        this.c = abmsVar;
        abnw abnwVar = abnw.a;
        this.d = abnwVar;
        this.e = abnn.a;
        this.g = abnwVar;
        this.h = -1;
        this.i = abnwVar;
        this.j = -1;
        this.k = abmsVar;
        this.l = abnwVar;
        this.m = abmsVar;
        this.n = abnwVar;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0006\u0000\u0001ည\u0000\u0002'\u0003'\u0004'\u0005င\u0001\u0006င\u0002\u0007င\u0003\bည\u0004\t'\nည\u0005\u000b'\f$", new Object[]{"b", "c", "g", "i", "d", "f", "h", "j", "k", "l", "m", "n", "e"});
        }
        if (i2 == 3) {
            return new abdx();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abdx.class);
        }
        this.o = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        aboc abocVar = this.e;
        if (abocVar.c()) {
            return;
        }
        this.e = abnv.F(abocVar);
    }
}
