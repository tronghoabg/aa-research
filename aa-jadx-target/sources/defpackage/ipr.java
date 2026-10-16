package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ipr implements ipp {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c;
    private static final defpackage.tfe d;
    public android.view.Surface a;
    private final defpackage.tfh e;

    static {
        defpackage.yqm yqmVarC = defpackage.yqm.c("GH.GhostActivityManager");
        c = yqmVarC;
        java.util.logging.Level level = java.util.logging.Level.FINE;
        level.getClass();
        d = new defpackage.tfe(2, level, yqmVarC, 2);
    }

    public ipr(android.content.Context context, android.content.ComponentName componentName, android.content.ComponentName componentName2, defpackage.ipo ipoVar) {
        defpackage.yqm yqmVar = defpackage.tfh.a;
        this.e = defpackage.sqs.aK(defpackage.ipq.a, d, null, new defpackage.grw(ipoVar, this, 19));
        android.app.ActivityOptions activityOptionsMakeBasic = android.app.ActivityOptions.makeBasic();
        activityOptionsMakeBasic.getClass();
        a$.ExternalSyntheticApiModelOutline1.m(activityOptionsMakeBasic, ipoVar.c().getDisplayId());
        defpackage.yqm yqmVar2 = com.google.android.apps.auto.client.activity.ghost.GhostActivity.m;
        android.content.Intent intentPutExtra = new android.content.Intent().addFlags(268435456).addFlags(134217728).addFlags(8388608).setComponent(componentName).putExtra("CarActivityServiceComponentName", componentName2).putExtra("DisplayDebugContent", defpackage.acve.f());
        intentPutExtra.getClass();
        ((defpackage.yqj) c.f()).M("Starting 👻 Activity for %s with intent: %s", componentName2, intentPutExtra);
        if (!defpackage.acve.e()) {
            context.startActivity(intentPutExtra, activityOptionsMakeBasic.toBundle());
            return;
        }
        try {
            context.startActivity(intentPutExtra, activityOptionsMakeBasic.toBundle());
        } catch (android.content.ActivityNotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) c.g()).p(e)).y("GhostActivity for %s not found.", componentName2);
            defpackage.rqt rqtVarA = defpackage.rqt.a(context);
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.ACTIVITY_MANAGER, defpackage.zbd.Nj);
            rrvVarH.p(componentName);
            rqtVarA.c(rrvVarH.l());
            throw e;
        }
    }

    public final void a() {
        c(defpackage.ipq.d);
    }

    public final void b(android.view.Surface surface) {
        surface.getClass();
        this.a = surface;
    }

    public final void c(defpackage.ipq ipqVar) {
        this.e.c(ipqVar);
    }
}
