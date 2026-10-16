package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ovm extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.ovm a;
    public int b;
    public java.lang.String c = "";
    public defpackage.abqv d;
    public int e;
    public defpackage.ovk f;
    public defpackage.ovj g;
    public defpackage.ovh h;

    static {
        defpackage.ovm ovmVar = new defpackage.ovm();
        a = ovmVar;
        defpackage.abox.P(defpackage.ovm.class, ovmVar);
    }

    private ovm() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002\nဉ\u0003\u000bဉ\u0004\fဉ\u0005", new java.lang.Object[]{"b", "c", "d", "e", defpackage.our.g, "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.ovm();
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
        return defpackage.abox.L(defpackage.ovm.class);
    }
}
