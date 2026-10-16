package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xjn extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xjn a;

    static {
        defpackage.xjn xjnVar = new defpackage.xjn();
        a = xjnVar;
        defpackage.abox.P(defpackage.xjn.class, xjnVar);
    }

    private xjn() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.xjn();
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
        return defpackage.abox.L(defpackage.xjn.class);
    }
}
