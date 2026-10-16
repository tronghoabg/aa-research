package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zqi extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.zqi a;
    public int b;
    public int c;
    public defpackage.zqh d;
    public int e;

    static {
        defpackage.zqi zqiVar = new defpackage.zqi();
        a = zqiVar;
        defpackage.abox.P(defpackage.zqi.class, zqiVar);
    }

    private zqi() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0000\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0000\u0003\f\u0005ဉ\u0001\u0006\f", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.zqi();
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
        return defpackage.abox.L(defpackage.zqi.class);
    }
}
