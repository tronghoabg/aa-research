package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ovj extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.ovj a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        defpackage.ovj ovjVar = new defpackage.ovj();
        a = ovjVar;
        defpackage.abox.P(defpackage.ovj.class, ovjVar);
    }

    private ovj() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            defpackage.abpd abpdVar = defpackage.our.f;
            java.lang.Object[] objArr = {"b", "c", "d", "f", "e", "g", abpdVar, "h", abpdVar, "i", abpdVar, "j", "k", "l", "m", "n", abpdVar};
            defpackage.abpd abpdVar2 = defpackage.our.e;
            return new defpackage.abqi(a, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဇ\u0002\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bင\u0007\tဏ\b\nင\t\u000bင\n\f᠌\u000b", objArr);
        }
        if (i2 == 3) {
            return new defpackage.ovj();
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
        return defpackage.abox.L(defpackage.ovj.class);
    }
}
