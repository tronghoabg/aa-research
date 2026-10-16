package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class axw implements afec {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ axw(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        afec afecVarI;
        if (this.b != 0) {
            azr azrVar = (azr) obj;
            cec cecVar = (cec) cek.i.j();
            afecVarI = cecVar != null ? cecVar.i() : null;
            int i = this.a;
            byx.l(cecVar, byx.i(cecVar), afecVarI);
            a.d(azrVar, i);
            return afak.a;
        }
        azr azrVar2 = (azr) obj;
        cec cecVar2 = (cec) cek.i.j();
        afecVarI = cecVar2 != null ? cecVar2.i() : null;
        int i2 = this.a;
        byx.l(cecVar2, byx.i(cecVar2), afecVarI);
        a.d(azrVar2, i2);
        return afak.a;
    }
}
