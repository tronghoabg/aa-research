package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kyw extends android.os.Handler {
    final /* synthetic */ defpackage.kzb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyw(defpackage.kzb kzbVar, android.os.Looper looper) {
        super(looper);
        this.a = kzbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            if (message.what == 2) {
                defpackage.ngr.a().c(ngu.n);
                return;
            }
            return;
        }
        defpackage.kzb kzbVar = this.a;
        int i = message.arg1;
        if (kzbVar.w.e() == defpackage.otu.LIVE_ACTIVE) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.f()).ai((char) 3617)).u("Not triggering assistant education because live is active");
        } else if (i == 1) {
            defpackage.ngr.a().c(ngu.m);
        } else {
            defpackage.ngr.a().c(ngu.l);
        }
    }
}
