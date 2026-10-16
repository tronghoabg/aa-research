package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;

/* loaded from: classes2.dex */
public final class phc extends BroadcastReceiver {
    final /* synthetic */ WirelessSetupSharedService a;

    public phc(WirelessSetupSharedService wirelessSetupSharedService) {
        this.a = wirelessSetupSharedService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        pgt pgtVar = this.a.n;
        if (pgtVar != null) {
            pgtVar.i();
        }
    }
}
