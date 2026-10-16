package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bdl implements defpackage.affc {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ bdl(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        aiuf aiufVar;
        java.lang.Object afavVar;
        int i = this.b;
        if (i == 0) {
            ((defpackage.dek) obj).a(defpackage.ble.a, new defpackage.bld(defpackage.bdy.a, this.a, 2, true));
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.chg chgVar = (defpackage.chg) obj;
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (chgVar.n() >> 32)) / 2.0f;
            return chgVar.q(new defpackage.bab(fIntBitsToFloat, defpackage.axd.y(chgVar, fIntBitsToFloat), new defpackage.cjx(this.a, 5), 2));
        }
        defpackage.bur burVar = (defpackage.bur) obj;
        defpackage.affc affcVar = burVar.b;
        long j = this.a;
        if (affcVar != null && (aiufVar = burVar.a) != null) {
            try {
                afavVar = affcVar.invoke(java.lang.Long.valueOf(j));
            } catch (java.lang.Throwable th) {
                afavVar = new defpackage.afav(th);
            }
            aiufVar.w(afavVar);
        }
        return defpackage.afbk.a;
    }
}
