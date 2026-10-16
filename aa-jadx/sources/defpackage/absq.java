package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class absq extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.absq a;
    public defpackage.abpj b;
    public defpackage.abpj c;

    static {
        defpackage.absq absqVar = new defpackage.absq();
        a = absqVar;
        defpackage.abox.P(defpackage.absq.class, absqVar);
    }

    private absq() {
        defpackage.abqh abqhVar = defpackage.abqh.b;
        this.b = abqhVar;
        this.c = abqhVar;
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new java.lang.Object[]{"b", defpackage.absm.class, "c", defpackage.absp.class});
        }
        if (i2 == 3) {
            return new defpackage.absq();
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
        return defpackage.abox.L(defpackage.absq.class);
    }
}
