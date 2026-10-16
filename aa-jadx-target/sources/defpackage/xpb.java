package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xpb extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xpb a;
    public int b;
    public defpackage.abnv c;
    public defpackage.abnv d;
    public defpackage.abnv e;
    public java.lang.String f;
    public java.lang.String g;
    public defpackage.xht h;

    static {
        defpackage.xpb xpbVar = new defpackage.xpb();
        a = xpbVar;
        defpackage.abox.P(defpackage.xpb.class, xpbVar);
    }

    private xpb() {
        defpackage.abnv abnvVar = defpackage.abnv.d;
        this.c = abnvVar;
        this.d = abnvVar;
        this.e = abnvVar;
        this.f = "";
        this.g = "";
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.xpb();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.abox.L(defpackage.xpb.class);
    }
}
