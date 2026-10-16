package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vtn extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.vtn a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public float f;
    private int g;

    static {
        defpackage.vtn vtnVar = new defpackage.vtn();
        a = vtnVar;
        defpackage.abox.P(defpackage.vtn.class, vtnVar);
    }

    private vtn() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new java.lang.Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.vtn();
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
        return defpackage.abox.L(defpackage.vtn.class);
    }
}
