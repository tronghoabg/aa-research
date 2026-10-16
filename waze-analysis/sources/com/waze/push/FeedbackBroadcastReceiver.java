package com.waze.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.content.IntentCompat;
import com.google.firebase.messaging.z;
import com.waze.kw;
import com.waze.ui.z.as;
import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class FeedbackBroadcastReceiver extends BroadcastReceiver implements org.a.d.a.a {
    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws NumberFormatException {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("FeedbackBroadcastReceiver");
        x.e(eVarD, "create(...)");
        if (intent == null) {
            eVarD.g("Got null intent!");
            return;
        }
        z zVar = (z) ((Parcelable) IntentCompat.getParcelableExtra(intent, "RemoteMessage", z.class));
        if (zVar == null) {
            eVarD.g("remote message is missing");
            return;
        }
        g gVar = new g(zVar, false);
        com.waze.x.h hVarB = gVar.b();
        if (hVarB == null) {
            hVarB = com.waze.x.h.b();
            x.e(hVarB, "createBaseDeepLink(...)");
        }
        String stringExtra = intent.getStringExtra("ButtonName");
        eVarD.e("Got feedback for ".concat(String.valueOf(stringExtra)));
        if (stringExtra != null) {
            kw.f25072a.a().c(stringExtra, as.c(eVarD, gVar.k()));
            n.f33443a.a().a(gVar, stringExtra);
        }
        FeedbackBroadcastReceiver feedbackBroadcastReceiver = this;
        if (feedbackBroadcastReceiver instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) feedbackBroadcastReceiver).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(c.class);
        } else {
            bVarC = feedbackBroadcastReceiver.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(c.class);
        }
        new j(context, gVar, hVarB, (c) bVarC.a(mVar, null, null)).b();
    }
}
