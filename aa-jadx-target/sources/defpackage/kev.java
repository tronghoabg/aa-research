package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kev extends defpackage.lhm {
    public final defpackage.yqm a;
    public boolean b;
    public final java.util.concurrent.atomic.AtomicInteger c;
    private defpackage.zhv d;

    public kev() {
        defpackage.zhv zhvVarCf = defpackage.ysr.cf(java.util.concurrent.Executors.newSingleThreadExecutor());
        this.a = defpackage.yqm.c("GH.AppNotifier");
        this.b = true;
        this.c = new java.util.concurrent.atomic.AtomicInteger();
        this.d = zhvVarCf;
    }

    private static final android.app.PendingIntent b(android.content.Context context, android.content.ComponentName componentName, int i) {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(componentName);
        intent.putExtra("ui_context", 9103);
        intent.putExtra("ui_action", i);
        return com.google.android.apps.auto.components.system.GhPendingIntentReceiver.c(intent, context);
    }

    public final void a(defpackage.mqj mqjVar) {
        android.content.Context context = defpackage.mkp.a.c;
        android.content.ComponentName componentNameA = mqjVar.a();
        android.app.PendingIntent pendingIntentB = b(context, componentNameA, 16102);
        android.app.PendingIntent pendingIntentB2 = b(context, componentNameA, 16101);
        ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai((char) 2987)).y("Posting notification for new app %s", componentNameA);
        if (this.d.isShutdown()) {
            return;
        }
        defpackage.zhs zhsVarSubmit = this.d.submit(new defpackage.fma(mqjVar, 4));
        zhsVarSubmit.c(new tlv(this, zhsVarSubmit, componentNameA, context, pendingIntentB, pendingIntentB2, 1), hh$.ExternalSyntheticApiModelOutline0.m(context));
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        if (this.d.isShutdown()) {
            return;
        }
        this.d.shutdownNow();
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        defpackage.yqm yqmVar;
        boolean z;
        super.eQ();
        defpackage.lje.b().a().eM(this, new defpackage.hlm(this, 15));
        if (this.d.isShutdown()) {
            this.d = defpackage.ysr.cf(java.util.concurrent.Executors.newSingleThreadExecutor());
        }
        android.content.SharedPreferences sharedPreferences = defpackage.mkp.a.c.getSharedPreferences("app_notifier", 0);
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("observed_apps", null);
        boolean z2 = this.b || stringSet == null;
        defpackage.yhx yhxVarE = defpackage.ler.a().e(defpackage.kit.b().e(), defpackage.nze.a());
        if (!z2) {
            yhxVarE = (defpackage.yhx) j$.util.Collection.-EL.stream(yhxVarE).filter(new defpackage.hmj(18)).collect(defpackage.yds.b);
        }
        defpackage.yhx yhxVar = (defpackage.yhx) j$.util.Collection.-EL.stream(yhxVarE).map(new defpackage.jvi(19)).collect(defpackage.yds.b);
        defpackage.yhv yhvVar = new defpackage.yhv();
        if (stringSet != null) {
            defpackage.yqm yqmVar2 = this.a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 2988)).u("Checking for new apps");
            yhvVar.k(stringSet);
            if (this.b) {
                long j = sharedPreferences.getInt("parked_native_apps_notification_count", 0);
                yqmVar = yqmVar2;
                long jB = defpackage.acqh.b();
                z = j < jB;
                if (z) {
                    editorEdit.putInt("parked_native_apps_notification_count", (int) jB).apply();
                }
            } else {
                z = false;
                yqmVar = yqmVar2;
            }
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(yhxVar).filter(new keu(stringSet, z));
            int i = defpackage.ygw.d;
            defpackage.ygw ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
            if (!ygwVar.isEmpty()) {
                defpackage.omf.u().F(defpackage.omv.p(defpackage.acbk.P).l());
                ((defpackage.yqj) yqmVar.l().ai((char) 2984)).y("Found new app packages: %s", ygwVar);
                j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(yhxVarE).filter(new defpackage.ghv(ygwVar, 19)).findFirst();
                if (optionalFindFirst.isPresent()) {
                    a((defpackage.mqj) optionalFindFirst.get());
                } else {
                    j$.util.Optional optionalFindFirst2 = j$.util.Collection.-EL.stream(yhxVarE).filter(new defpackage.ghv(ygwVar, 20)).findFirst();
                    jgh jghVar = new jgh(this, 4);
                    if (true == optionalFindFirst2.isPresent()) {
                        ((defpackage.kev) jghVar.a).a((defpackage.mqj) optionalFindFirst2.get());
                    }
                }
            }
        }
        yhvVar.k(yhxVar);
        editorEdit.putStringSet("observed_apps", yhvVar.g()).apply();
    }
}
