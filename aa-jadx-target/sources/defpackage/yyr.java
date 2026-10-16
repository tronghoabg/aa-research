package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yyr extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yyr a;
    public int b;
    public long c;
    public int d;
    public long e;
    public defpackage.yyq f;
    public int g;

    static {
        defpackage.yyr yyrVar = new defpackage.yyr();
        a = yyrVar;
        defpackage.abox.P(defpackage.yyr.class, yyrVar);
    }

    private yyr() {
        defpackage.aboy aboyVar = defpackage.aboy.a;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0003င\u0002\u0005ဂ\u0003\u0006ဉ\u0004\u0007င\u0005", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.yyr();
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
        return defpackage.abox.L(defpackage.yyr.class);
    }
}
