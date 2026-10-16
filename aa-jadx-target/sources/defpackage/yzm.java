package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yzm extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yzm a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;

    static {
        defpackage.yzm yzmVar = new defpackage.yzm();
        a = yzmVar;
        defpackage.abox.P(defpackage.yzm.class, yzmVar);
    }

    private yzm() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.yzm();
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
        return defpackage.abox.L(defpackage.yzm.class);
    }
}
