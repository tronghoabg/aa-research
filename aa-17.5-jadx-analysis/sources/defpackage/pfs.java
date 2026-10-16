package defpackage;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class pfs extends BroadcastReceiver {
    final /* synthetic */ pgr a;

    public pfs(pgr pgrVar) {
        this.a = pgrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(UiModeManager.ACTION_ENTER_CAR_MODE)) {
            pgr pgrVar = this.a;
            pdk pdkVar = pgrVar.z;
            pdkVar.b(pgrVar.p);
            pdkVar.d(new pct(pgrVar, 16));
            return;
        }
        if (intent.getAction().equals(UiModeManager.ACTION_EXIT_CAR_MODE)) {
            pgr pgrVar2 = this.a;
            pgrVar2.z.d(new pct(pgrVar2, 18));
        }
    }
}
