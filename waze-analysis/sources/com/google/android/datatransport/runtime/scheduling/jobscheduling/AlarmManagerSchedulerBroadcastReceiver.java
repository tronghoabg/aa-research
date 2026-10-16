package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.ac;
import com.google.android.datatransport.runtime.w;
import com.google.android.datatransport.runtime.x;
import com.google.android.gms.common.api.internal.bc;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        ac.d(context);
        w wVarA = x.a();
        wVarA.b(queryParameter);
        wVarA.d(com.google.android.datatransport.runtime.d.a.b(iIntValue));
        if (queryParameter2 != null) {
            wVarA.c(Base64.decode(queryParameter2, 0));
        }
        ac.c().e().b(wVarA.a(), i2, new bc(1));
    }
}
