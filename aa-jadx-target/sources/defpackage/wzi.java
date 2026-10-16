package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wzi implements defpackage.lhn {
    public final defpackage.dun a;
    public final android.content.Context b;
    private final android.os.Handler c = new android.os.Handler(new defpackage.wzh(this, 0));

    public wzi(android.content.Context context) {
        this.b = context;
        this.a = new defpackage.dun(context);
    }

    public static defpackage.wzi a() {
        return defpackage.wzc.a.b;
    }

    public final void b(int i, int i2, int i3, int i4, android.content.Intent intent, long j) {
        defpackage.maz.c();
        android.content.Context context = this.b;
        defpackage.dte dteVar = new defpackage.dte(context, "gearhead_alerts");
        dteVar.n(i2);
        dteVar.t = context.getColor(2131100589);
        dteVar.e(16, true);
        dteVar.l();
        dteVar.e(8, true);
        dteVar.i(context.getText(i3));
        dteVar.h(context.getText(i4));
        android.app.TaskStackBuilder taskStackBuilderCreate = android.app.TaskStackBuilder.create(context);
        taskStackBuilderCreate.addParentStack(intent.getComponent());
        taskStackBuilderCreate.addNextIntent(intent);
        dteVar.g = taskStackBuilderCreate.getPendingIntent(0, 201326592);
        this.a.b(null, i, dteVar.a());
        if (j > 0) {
            this.c.sendEmptyMessageDelayed(i, j);
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        defpackage.oog oogVar = new defpackage.oog(defpackage.kit.b().e());
        if (!oogVar.b() || oogVar.e("car_tos_data") >= 2) {
            return;
        }
        android.content.Context context = this.b;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.projection.gearhead.companion.settings.LegalInfoActivity.class);
        java.lang.String string = context.getString(2132083771);
        java.lang.String string2 = context.getString(2132083908);
        intent.putExtra("legal_title_key", string);
        intent.putExtra("legal_body_key", string2);
        intent.putExtra("data_notice_notification", true);
        b(3, 2131231121, 2132083911, 2132083910, intent, 0L);
        oogVar.g("car_tos_data", 2);
        defpackage.omf.u().o(defpackage.zbe.DATA_NOTICE_NOTIFICATION, defpackage.zbd.iF);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (defpackage.mdp.d().m()) {
            return;
        }
        android.content.Context context = this.b;
        b(2, 2131231483, 2132083143, 2132084749, new android.content.Intent(context, (java.lang.Class<?>) com.google.android.projection.gearhead.companion.RequestNotificationAccessActivity.class), 600000L);
        if (defpackage.jrj.a()) {
            defpackage.nuz nuzVarB = defpackage.nuz.b();
            if (com.google.android.projection.gearhead.companion.RequestNotificationAccessActivity.a == null) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.projection.gearhead.companion.RequestNotificationAccessActivity.class);
                android.app.TaskStackBuilder taskStackBuilderCreate = android.app.TaskStackBuilder.create(context);
                taskStackBuilderCreate.addParentStack(intent.getComponent());
                taskStackBuilderCreate.addNextIntent(intent);
                android.app.PendingIntent pendingIntent = taskStackBuilderCreate.getPendingIntent(0, 201326592);
                nvc nvcVar = new nvc();
                nvcVar.b = com.google.android.apps.auto.components.graphics.icon.GhIcon.q(context.getResources(), 2131231483);
                nvcVar.m = context.getText(2132084748).toString();
                nvcVar.n = context.getText(2132084749).toString();
                nvcVar.c = pendingIntent;
                nvcVar.j = false;
                nvcVar.f = "com.google.android.projection.gearhead";
                com.google.android.projection.gearhead.companion.RequestNotificationAccessActivity.a = nvcVar.b();
            }
            nuzVarB.j("NOTIFICATION_ACCESS", 1001L, com.google.android.projection.gearhead.companion.RequestNotificationAccessActivity.a);
        }
    }
}
