package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class trv extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.trv a;
    public int b;
    public defpackage.aajk c;
    public float d;
    public float e;
    public defpackage.tru f;
    public int g;
    public int h;

    static {
        defpackage.trv trvVar = new defpackage.trv();
        a = trvVar;
        defpackage.abox.P(defpackage.trv.class, trvVar);
    }

    private trv() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဉ\u0003\u0005ဏ\u0004\u0006ဏ\u0005", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.trv();
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
        return defpackage.abox.L(defpackage.trv.class);
    }
}
