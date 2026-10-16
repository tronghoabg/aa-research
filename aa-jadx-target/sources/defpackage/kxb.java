package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class kxb extends defpackage.mdl {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.WPExReceivr");

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        if (((defpackage.kwv) defpackage.mkp.a.i(defpackage.kwv.class)).b()) {
            ((defpackage.yqj) a.l().ai((char) 3460)).y("Broadcast receiver %s detected in work profile, will disable.", getClass());
            context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, getClass()), 2, 1);
            return;
        }
        android.os.UserManager userManager = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
        if (defpackage.c.a() && userManager.isPrivateProfile()) {
            if (!defpackage.adax.am()) {
                ((defpackage.yqj) a.l().ai((char) 3458)).u("Intent received for private profile, will ignore.");
                return;
            }
            ((defpackage.yqj) a.l().ai((char) 3459)).y("Broadcast receiver %s detected for private profile user, will disable.", getClass());
            context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, getClass()), 2, 1);
            return;
        }
        if (!userManager.isSystemUser()) {
            if (defpackage.adax.ak()) {
                ((defpackage.yqj) a.l().ai((char) 3457)).y("Broadcast receiver %s detected for non system user, will disable.", getClass());
                context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, getClass()), 2, 1);
                return;
            } else if (defpackage.adax.aC()) {
                ((defpackage.yqj) a.l().ai((char) 3456)).u("Intent received for non system user, will ignore.");
                return;
            }
        }
        c(context, intent);
    }

    public abstract void c(android.content.Context context, android.content.Intent intent);
}
