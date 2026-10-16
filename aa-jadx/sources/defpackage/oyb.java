package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum oyb {
    NONE(0),
    MODAL(1),
    MULTIMOVE_MODAL(2);

    private final int e;

    oyb(int i) {
        this.e = i;
    }

    public static int a(defpackage.oyb oybVar) {
        int iOrdinal = oybVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException("Unsupported type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(oybVar))));
    }

    public static defpackage.oyb b(int i, defpackage.oyb oybVar) {
        for (defpackage.oyb oybVar2 : values()) {
            if (oybVar2.e == i) {
                return oybVar2;
            }
        }
        return oybVar;
    }
}
