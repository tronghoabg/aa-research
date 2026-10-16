package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yyy extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yyy a;
    public int b;
    public defpackage.yyx c;
    public defpackage.yyv d;
    public int e;
    public defpackage.abpj f = defpackage.abqh.b;
    public defpackage.yyw g;
    public int h;
    public int i;

    static {
        defpackage.yyy yyyVar = new defpackage.yyy();
        a = yyyVar;
        defpackage.abox.P(defpackage.yyy.class, yyyVar);
    }

    private yyy() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004\u001b\u0005ဉ\u0003\u0006င\u0004\u0007င\u0005", new java.lang.Object[]{"b", "c", "d", "e", "f", defpackage.yyu.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new defpackage.yyy();
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
        return defpackage.abox.L(defpackage.yyy.class);
    }
}
