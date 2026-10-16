package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mdd extends defpackage.mpa {
    public boolean a;

    public mdd() {
        super("ParkedApp");
        defpackage.lje.b().a().eM(defpackage.ler.c(), new defpackage.mel(new defpackage.mda(this, 2), 1));
    }

    @Override // defpackage.mpa
    protected final void a(android.content.Intent intent) {
        defpackage.mdi.a.a().b(defpackage.nta.a);
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PARKED_APP, defpackage.zbd.LV);
        rrvVarH.p(intent.getComponent());
        oimVarU.F(rrvVarH.l());
    }

    @Override // defpackage.mpa
    protected final boolean b(android.content.Intent intent) {
        defpackage.mqj mqjVarA;
        defpackage.mqi mqiVarD = defpackage.mpr.d(intent);
        if (mqiVarD == null || this.a || (mqjVarA = defpackage.ler.a().a(defpackage.kit.b().e(), mqiVarD)) == null) {
            return false;
        }
        return mqjVarA.c;
    }
}
