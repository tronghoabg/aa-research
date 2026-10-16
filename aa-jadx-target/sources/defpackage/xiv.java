package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xiv extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xiv a;

    static {
        defpackage.xiv xivVar = new defpackage.xiv();
        a = xivVar;
        defpackage.abox.P(defpackage.xiv.class, xivVar);
    }

    private xiv() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.xiv();
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
        return defpackage.abox.L(defpackage.xiv.class);
    }
}
