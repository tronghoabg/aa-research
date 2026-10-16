package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mee implements mdv {
    private final /* synthetic */ int a;

    public mee(int i) {
        this.a = i;
    }

    public final defpackage.zbe a() {
        return this.a != 0 ? defpackage.zbe.SENSITIVE_PERMISSION_POLLER_NOTIFICATION : defpackage.zbe.SENSITIVE_PERMISSION_POLLER_SYSTEM_ALERT_WINDOW;
    }

    public final java.lang.String b() {
        return this.a != 0 ? "NOTIFICATION_LISTENER_SERVICE" : "SYSTEM_ALERT_WINDOW_PERMISSION";
    }

    public final void c(android.content.Context context) {
        if (this.a != 0) {
            android.content.Intent intent = new android.content.Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            intent.setFlags(1073741824);
            context.startActivity(intent);
        } else {
            android.content.Intent intent2 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:".concat(java.lang.String.valueOf(context.getPackageName()))));
            intent2.addFlags(1073741824);
            context.startActivity(intent2);
        }
    }

    public final boolean d() {
        return this.a != 0 ? defpackage.mdp.d().m() : defpackage.mdp.d().n();
    }
}
