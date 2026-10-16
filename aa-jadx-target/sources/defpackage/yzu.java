package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yzu extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yzu a;
    public int b;
    public yzt c;
    public defpackage.abpj d = defpackage.abqh.b;
    public int e;
    public int f;

    static {
        defpackage.yzu yzuVar = new defpackage.yzu();
        a = yzuVar;
        defpackage.abox.P(defpackage.yzu.class, yzuVar);
    }

    private yzu() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0004င\u0002", new java.lang.Object[]{"b", "c", "d", yzt.class, "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.yzu();
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
        return defpackage.abox.L(defpackage.yzu.class);
    }
}
