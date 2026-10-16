package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
final class mdw implements mdn {
    private final /* synthetic */ int a;

    public mdw(int i) {
        this.a = i;
    }

    @Override // defpackage.mdn
    public final yzz a() {
        return this.a != 0 ? yzz.SENSITIVE_PERMISSION_POLLER_NOTIFICATION : yzz.SENSITIVE_PERMISSION_POLLER_SYSTEM_ALERT_WINDOW;
    }

    @Override // defpackage.mdn
    public final String b() {
        return this.a != 0 ? "NOTIFICATION_LISTENER_SERVICE" : "SYSTEM_ALERT_WINDOW_PERMISSION";
    }

    @Override // defpackage.mdn
    public final void c(Context context) {
        if (this.a != 0) {
            Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            intent.setFlags(1073741824);
            context.startActivity(intent);
        } else {
            Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:".concat(String.valueOf(context.getPackageName()))));
            intent2.addFlags(1073741824);
            context.startActivity(intent2);
        }
    }

    @Override // defpackage.mdn
    public final boolean d() {
        return this.a != 0 ? ((mdk) mki.a.i(mdk.class)).m() : lgv.c().n();
    }
}
