package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class moy extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ohs ohsVarJ = ebf.j();
        String action = intent.getAction();
        yph yphVar = moz.a;
        ((ype) yphVar.l().ai((char) 5134)).y("Received action: %s", action);
        if ("android.intent.action.USER_PRESENT".equals(action)) {
            ohsVarJ.F(rrc.h(yxy.GEARHEAD, yzz.NO_FACET, yzy.pZ).l());
        } else {
            ((ype) ((ype) yphVar.g()).ai((char) 5135)).y("Unexpected action: %s", action);
        }
    }
}
