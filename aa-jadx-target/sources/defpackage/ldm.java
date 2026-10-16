package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ldm extends defpackage.mdl {
    public static final /* synthetic */ int e = 0;
    private static final defpackage.yqm f = defpackage.yqm.c("GH.CsatTriggerRcvr");
    public boolean b;
    final /* synthetic */ defpackage.affc d;
    final /* synthetic */ java.lang.String c = "CsatPostdriveManager.TriggerReceiver";
    public final java.lang.Object a = new java.lang.Object();

    public ldm(defpackage.affc affcVar) {
        this.d = affcVar;
    }

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu(this.c);
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        context.getClass();
        intent.getClass();
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.lby.a;
        defpackage.lby lbyVarJ = defpackage.jzl.j(intent.getIntExtra("com.google.android.apps.auto.components.feedback.csat.SURVEY_CONTEXT_ID", -1));
        if (lbyVarJ == null) {
            throw new java.lang.IllegalArgumentException("Survey context not provided or invalid");
        }
        ((defpackage.yqj) f.f()).y("Received trigger broadcast for survey %s", lbyVarJ.name());
        this.d.invoke(lbyVarJ);
    }
}
