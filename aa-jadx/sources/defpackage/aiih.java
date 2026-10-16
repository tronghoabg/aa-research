package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aiih {
    private aiih() {
    }

    public static /* synthetic */ defpackage.aizj a(defpackage.ajby ajbyVar, defpackage.afdo afdoVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            afdoVar = defpackage.afdp.a;
        }
        int i3 = (i2 & 2) != 0 ? -3 : 0;
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return ajbyVar.hc(afdoVar, i3, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void assertRecursionDepth(int i, defpackage.agfd agfdVar) {
        if (i <= 100) {
            return;
        }
        defpackage.ahoj name = agfdVar.getName();
        java.util.Objects.toString(name);
        throw new java.lang.AssertionError("Too deep recursion while expanding type alias ".concat(java.lang.String.valueOf(name)));
    }

    public /* synthetic */ aiih(defpackage.affu affuVar) {
        this();
    }
}
