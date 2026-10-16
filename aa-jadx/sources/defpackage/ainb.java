package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ainb {
    public static final java.lang.String a(long j) {
        java.lang.String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        java.lang.String str2 = java.lang.String.format("%6s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        str2.getClass();
        return str2;
    }

    public static final void b(java.util.logging.Logger logger, defpackage.ajju ajjuVar, defpackage.ajjw ajjwVar, java.lang.String str) {
        java.lang.String str2 = java.lang.String.format("%-22s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        str2.getClass();
        logger.fine(ajjwVar.b + " " + str2 + ": " + ajjuVar.a);
    }

    public static /* synthetic */ defpackage.aijc newTypeCheckerState$default(defpackage.ainc aincVar, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if (obj == null) {
            return aincVar.newTypeCheckerState(z, z2, z3 & ((i & 4) == 0));
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newTypeCheckerState");
    }
}
