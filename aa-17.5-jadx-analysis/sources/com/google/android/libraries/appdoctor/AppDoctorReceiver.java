package com.google.android.libraries.appdoctor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.pfl;
import defpackage.qnj;
import defpackage.rju;
import defpackage.roc;
import defpackage.spu;
import defpackage.sxp;
import defpackage.wub;
import defpackage.zgp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class AppDoctorReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a(zgp zgpVar, BroadcastReceiver.PendingResult pendingResult) throws Exception {
        try {
            try {
                zgpVar.get(8L, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                Log.w("AppDoctorReceiver", "Failed to complete fix in time for broadcast.");
            }
        } finally {
            Log.i("AppDoctorReceiver", "App doctor is complete.");
            pendingResult.setResultCode(-1);
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"com.google.android.libraries.appdoctor.ACTION_TELE_DOCTOR_FIX".equals(intent.getAction())) {
            Log.e("AppDoctorReceiver", "Wrong action.");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("com.google.android.libraries.appdoctor.EXTRA_TELE_FIX")) {
            Log.w("AppDoctorReceiver", "No fix found in broadcast.");
            return;
        }
        byte[] bArr = null;
        zgp zgpVarY = !spu.ay(context) ? wub.Y(false) : roc.aW(new sxp(new rju(new rju((byte[]) null)), context, qnj.TELEDOCTOR, 0));
        setResultCode(-1);
        if (zgpVarY.isDone()) {
            Log.i("AppDoctorReceiver", "Fix has already been completed.");
        } else {
            roc.aW(new pfl(zgpVarY, goAsync(), 6, bArr));
        }
    }
}
