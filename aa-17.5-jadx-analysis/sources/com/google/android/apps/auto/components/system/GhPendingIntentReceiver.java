package com.google.android.apps.auto.components.system;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.ebf;
import defpackage.lbh;
import defpackage.mdd;
import defpackage.mpe;
import defpackage.ohs;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.vky;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class GhPendingIntentReceiver extends mdd {
    private static int a;

    public static PendingIntent c(Intent intent, Context context) {
        int i = a;
        a = i + 1;
        return PendingIntent.getBroadcast(context, i, new Intent("com.google.android.apps.auto.components.system.INTENT_ACTION").setPackage("com.google.android.projection.gearhead").putExtra("AppIntent", intent), 67108864);
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("PendingIntentBroadcastReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if (lbh.d().gN()) {
            Intent intent2 = intent.hasExtra("AppIntent") ? (Intent) intent.getParcelableExtra("AppIntent") : null;
            if (intent2 == null) {
                return;
            }
            ComponentName component = intent2.getComponent();
            if (component != null) {
                yzz yzzVarB = yzz.b(intent2.getIntExtra("ui_context", -1));
                yzy yzyVarB = yzy.b(intent2.getIntExtra("ui_action", -1));
                if (yzzVarB != null && yzyVarB != null) {
                    ohs ohsVarJ = ebf.j();
                    rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVarB, yzyVarB);
                    rrbVarH.p(component);
                    ohsVarJ.F(rrbVarH.l());
                }
            }
            mpe.a().i(intent2);
        }
    }
}
