package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jxb extends defpackage.gnp {
    private final defpackage.zbd b;
    private final defpackage.zbd c;

    public jxb(defpackage.zbd zbdVar, defpackage.zbd zbdVar2) {
        super("GEARHEAD_CAL_TEMPLATE_INITIAL_CLIENT_LOAD");
        this.b = zbdVar;
        this.c = zbdVar2;
    }

    @Override // defpackage.gnp
    protected final void e(boolean z, long j) {
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_APP_LIBRARY, z ? this.b : this.c);
        rrvVarH.u(defpackage.aitq.e(j));
        oimVarU.f(rrvVarH);
    }
}
