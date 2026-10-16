package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kfr extends defpackage.mdl {
    final /* synthetic */ defpackage.kfs a;

    public kfr(defpackage.kfs kfsVar) {
        this.a = kfsVar;
    }

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("BatterySaverModeReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        defpackage.yqm yqmVar = defpackage.kfs.a;
        if (!"android.os.action.POWER_SAVE_MODE_CHANGED".equals(action)) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kfs.a.g()).ai((char) 2997)).y("Unexpected action: %s", action);
            return;
        }
        defpackage.kfs kfsVar = this.a;
        boolean zF = kfsVar.f();
        defpackage.eqs eqsVar = kfsVar.c;
        java.lang.Boolean bool = (java.lang.Boolean) eqsVar.e();
        if (bool == null || bool.booleanValue() != zF) {
            kfsVar.a();
            if (zF) {
                defpackage.kfs.b(defpackage.zbd.rq);
                kfsVar.e(1000L);
            } else {
                defpackage.kfs.b(defpackage.zbd.rr);
            }
            eqsVar.m(java.lang.Boolean.valueOf(zF));
        }
    }
}
