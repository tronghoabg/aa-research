package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.abnj;
import defpackage.abnv;
import defpackage.abon;
import defpackage.upk;
import defpackage.vys;
import defpackage.vyt;
import defpackage.yfq;
import defpackage.zfl;
import defpackage.zfq;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                vys vysVar = (vys) abnv.B(vys.a, byteArrayExtra, abnj.a());
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((vyt) declaredConstructor.newInstance(null)).a(context, vysVar));
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                zfl zflVar = new zfl(yfq.n(arrayList), false);
                pendingResultGoAsync.getClass();
                zflVar.c(new upk(pendingResultGoAsync, 13), zfq.a);
            } catch (abon e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
