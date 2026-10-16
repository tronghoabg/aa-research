package defpackage;

/* loaded from: classes.dex */
public final class bjd {
    public static final bjd a = new bjd(null, null, null);
    public final cst b;
    public final dft c;
    public final azp d;

    public bjd(cst cstVar, dft dftVar, azp azpVar) {
        this.b = cstVar;
        this.c = dftVar;
        this.d = azpVar;
    }

    public static /* synthetic */ bjd a(bjd bjdVar, cst cstVar, dft dftVar, azp azpVar, int i) {
        if ((i & 1) != 0) {
            cstVar = bjdVar.b;
        }
        if ((i & 2) != 0) {
            dftVar = bjdVar.c;
        }
        if ((i & 4) != 0) {
            azpVar = bjdVar.d;
        }
        return new bjd(cstVar, dftVar, azpVar);
    }
}
