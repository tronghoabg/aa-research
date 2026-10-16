package com.google.android.gms.car;

import android.app.job.JobInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.oni;
import defpackage.rrd;
import defpackage.sso;

/* loaded from: classes2.dex */
public class UpdateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (oni.j("UpdateReceiver")) {
            rrd.a("UpdateReceiver", null, "Received package update");
        }
        sso.a(context, new JobInfo.Builder(194622160, new ComponentName(context, StagingService.class.getName())).setMinimumLatency(1L).setOverrideDeadline(10000L).build(), "UpdateReceiver");
    }
}
