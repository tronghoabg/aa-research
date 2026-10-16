package defpackage;

/* loaded from: classes3.dex */
public final class aciy extends abnv implements abox {
    public static final aciy a;
    public int b;
    public acih d;
    public aciu e;
    public acix f;
    public aciv g;
    public acit h;
    public boolean j;
    private byte k = 2;
    public String c = "";
    public String i = "";

    static {
        aciy aciyVar = new aciy();
        a = aciyVar;
        abnv.P(aciy.class, aciyVar);
    }

    private aciy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\b\u0000\u0001\u0002D\b\u0000\u0000\u0005\u0002ဈ\u0000\u0003ᐉ\u0001\u0011ᐑ\u0003\u001bᐑ\u0002!ဈ\u0006\"ဇ\u0007#ᐑ\u0004Dᐑ\u0005", new Object[]{"b", "c", "d", "f", "e", "i", "j", "g", "h"});
        }
        if (i2 == 3) {
            return new aciy();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aciy.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
