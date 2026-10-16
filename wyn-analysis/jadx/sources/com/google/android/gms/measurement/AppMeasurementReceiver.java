package com.google.android.gms.measurement;

import A7.C0273n0;
import A7.N;
import F1.a;
import S3.l;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

/* loaded from: classes4.dex */
public final class AppMeasurementReceiver extends a {

    /* renamed from: c, reason: collision with root package name */
    public l f26744c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f26744c == null) {
            this.f26744c = new l(this);
        }
        l lVar = this.f26744c;
        lVar.getClass();
        N n10 = C0273n0.a(context, null, null).f981i;
        C0273n0.d(n10);
        if (intent == null) {
            n10.f608i.c("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        n10.f612n.d("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                n10.f608i.c("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        n10.f612n.c("Starting wakeful intent.");
        ((AppMeasurementReceiver) lVar.f10967a).getClass();
        SparseArray sparseArray = a.f3808a;
        synchronized (sparseArray) {
            try {
                int i5 = a.f3809b;
                int i10 = i5 + 1;
                a.f3809b = i10;
                if (i10 <= 0) {
                    a.f3809b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i5);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i5, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
