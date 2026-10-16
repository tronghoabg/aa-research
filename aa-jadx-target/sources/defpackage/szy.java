package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class szy implements defpackage.aeep {
    final /* synthetic */ defpackage.taf a;
    private final szn b;

    public szy(defpackage.taf tafVar, szn sznVar) {
        this.a = tafVar;
        this.b = sznVar;
    }

    @Override // defpackage.aeep
    public final void a() {
        ((defpackage.yqj) defpackage.taf.a.e()).u("Fetched Assistant Feature Flags");
    }

    @Override // defpackage.aeep
    public final void b(java.lang.Throwable th) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.taf.a.g()).p(th)).u("Error getting feature flags");
        defpackage.kpu.b(defpackage.yxo.SERVICE_UNAVAILABLE);
        defpackage.kpu.b(defpackage.yxo.DODGEBOOST_GET_ASSISTANT_FEATURE_FLAGS_REMOTE_EXCEPTION);
        this.a.c(true);
    }

    @Override // defpackage.aeep
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        defpackage.tbd tbdVar = (defpackage.tbd) obj;
        tbdVar.getClass();
        com.google.android.gearhead.sdk.assistant.SupportedVersionInfo supportedVersionInfo = new com.google.android.gearhead.sdk.assistant.SupportedVersionInfo();
        supportedVersionInfo.a = 0;
        supportedVersionInfo.b = 5;
        defpackage.osi osiVar = tbdVar.b;
        if (osiVar == null) {
            osiVar = defpackage.osi.a;
        }
        szn sznVar = this.b;
        supportedVersionInfo.c = osiVar;
        defpackage.szv szvVar = (defpackage.szv) sznVar;
        szn sznVar2 = szvVar.b;
        synchronized (szvVar.a) {
            defpackage.wfp.e(new sbj(sznVar2, supportedVersionInfo, 16));
        }
    }
}
