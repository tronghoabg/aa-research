package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jqt extends defpackage.mdl {
    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("AapmHunReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("com.google.android.projection.gearhead.ACTION_DSA_AAPM_HUN")) {
            defpackage.jqu.a(defpackage.zbe.AAPM, defpackage.zbd.Ne);
            context.getSharedPreferences("gh_notification_pref", 0).edit().putBoolean("aapm_hun_dsa_pref", true).apply();
        }
        defpackage.nuz.b().g("AAPM_HUN", 0L, context.getPackageName());
    }
}
