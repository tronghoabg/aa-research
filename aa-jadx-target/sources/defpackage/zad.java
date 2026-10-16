package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zad extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.zad a;
    public int b;
    public int c = 0;
    public java.lang.Object d;
    public int e;

    static {
        defpackage.zad zadVar = new defpackage.zad();
        a = zadVar;
        defpackage.abox.P(defpackage.zad.class, zadVar);
    }

    private zad() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002:\u0000\u0003<\u0000\u00047\u0000", new java.lang.Object[]{"d", "c", "b", "e", defpackage.zac.class});
        }
        if (i2 == 3) {
            return new defpackage.zad();
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
        return defpackage.abox.L(defpackage.zad.class);
    }
}
