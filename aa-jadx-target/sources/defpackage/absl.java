package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class absl extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.absl a;
    public defpackage.abpj b = defpackage.abqh.b;

    static {
        defpackage.absl abslVar = new defpackage.absl();
        a = abslVar;
        defpackage.abox.P(defpackage.absl.class, abslVar);
    }

    private absl() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.absk.class});
        }
        if (i2 == 3) {
            return new defpackage.absl();
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
        return defpackage.abox.L(defpackage.absl.class);
    }
}
