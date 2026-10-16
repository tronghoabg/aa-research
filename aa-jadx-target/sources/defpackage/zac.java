package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zac extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.zac a;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.zac zacVar = new defpackage.zac();
        a = zacVar;
        defpackage.abox.P(defpackage.zac.class, zacVar);
    }

    private zac() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.zac();
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
        return defpackage.abox.L(defpackage.zac.class);
    }
}
