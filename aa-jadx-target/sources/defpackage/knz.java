package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class knz extends defpackage.mdl {
    final /* synthetic */ defpackage.koa a;

    public knz(defpackage.koa koaVar) {
        this.a = koaVar;
    }

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("MendelRuleBasedDetector");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        defpackage.ygw ygwVar = this.a.e;
        if (ygwVar != null) {
            for (int i = 0; i < ((defpackage.ymx) ygwVar).c; i++) {
                ((kod) ygwVar.get(i)).c(intent);
            }
        }
    }
}
