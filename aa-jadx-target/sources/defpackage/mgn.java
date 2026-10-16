package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mgn implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.PREFLIGHT_CAR_INTRO, defpackage.zbd.hQ).l());
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        if (defpackage.acwj.z()) {
            context.sendBroadcast(new android.content.Intent("com.google.android.apps.auto.components.preflight.phone.RESTORE_PHONE_NOTIFICATION").setPackage(context.getPackageName()));
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity.class);
        intent.addFlags(335544320);
        context.startActivity(intent, defpackage.luq.d());
    }
}
