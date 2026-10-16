package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wdt extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.wdt a;
    public java.lang.String b = "";
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int h;

    static {
        defpackage.wdt wdtVar = new defpackage.wdt();
        a = wdtVar;
        defpackage.abox.P(defpackage.wdt.class, wdtVar);
    }

    private wdt() {
        java.lang.Object[] objArr = defpackage.abqh.a;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new java.lang.Object[]{"h", "b", "c", "d", defpackage.xmo.k, "e", "g", "f"});
        }
        if (i2 == 3) {
            return new defpackage.wdt();
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
        return defpackage.abox.L(defpackage.wdt.class);
    }
}
