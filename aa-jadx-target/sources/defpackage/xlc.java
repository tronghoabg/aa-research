package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xlc extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xlc a;
    public defpackage.abpf b = defpackage.aboy.a;

    static {
        defpackage.xlc xlcVar = new defpackage.xlc();
        a = xlcVar;
        defpackage.abox.P(defpackage.xlc.class, xlcVar);
    }

    private xlc() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.xlc();
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
        return defpackage.abox.L(defpackage.xlc.class);
    }
}
