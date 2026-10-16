package defpackage;

import com.google.android.gearhead.sdk.assistant.SupportedVersionInfo;

/* loaded from: classes.dex */
final class sza implements aedp {
    final /* synthetic */ szh a;
    private final syp b;

    public sza(szh szhVar, syp sypVar) {
        this.a = szhVar;
        this.b = sypVar;
    }

    @Override // defpackage.aedp
    public final void a() {
        ((ype) szh.a.e()).u("Fetched Assistant Feature Flags");
    }

    @Override // defpackage.aedp
    public final void b(Throwable th) {
        ((ype) ((ype) szh.a.g()).p(th)).u("Error getting feature flags");
        lau.b(ywj.SERVICE_UNAVAILABLE);
        lau.b(ywj.DODGEBOOST_GET_ASSISTANT_FEATURE_FLAGS_REMOTE_EXCEPTION);
        this.a.c(true);
    }

    @Override // defpackage.aedp
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        taf tafVar = (taf) obj;
        tafVar.getClass();
        SupportedVersionInfo supportedVersionInfo = new SupportedVersionInfo();
        supportedVersionInfo.a = 0;
        supportedVersionInfo.b = 5;
        orl orlVar = tafVar.b;
        if (orlVar == null) {
            orlVar = orl.a;
        }
        syp sypVar = this.b;
        supportedVersionInfo.c = orlVar;
        syx syxVar = (syx) sypVar;
        syp sypVar2 = syxVar.b;
        synchronized (syxVar.a) {
            wer.e(new sbj(sypVar2, supportedVersionInfo, 13, (byte[]) null));
        }
    }
}
