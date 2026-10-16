package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lqm extends defpackage.mdl {
    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("DisableAutoplayReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        context.getSharedPreferences("media_autoplay_manager", 0).edit().putInt("autoplay_media_pause_history", 0).apply();
        if (action.equals("com.google.android.gearhead.autoplay.ACTION_DISABLE_AUTOPLAY")) {
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gq).l());
            defpackage.mpr.f().a().a("key_settings_always_autoplay_media_3", false);
            defpackage.ocn.a().f(context, new android.content.ComponentName(context, (java.lang.Class<?>) defpackage.lqm.class), 2132083977, 0);
        } else if (action.equals("com.google.android.gearhead.autoplay.ACTION_KEEP_ON_AUTOPLAY")) {
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gr).l());
        }
        defpackage.nuz.b().g(defpackage.zaw.MEDIA.name(), 881096330L, context.getPackageName());
    }
}
