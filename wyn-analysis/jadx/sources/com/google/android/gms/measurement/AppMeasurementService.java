package com.google.android.gms.measurement;

import A7.BinderC0287s0;
import A7.C0273n0;
import A7.InterfaceC0306y1;
import A7.L1;
import A7.N;
import A7.RunnableC0253g1;
import A7.RunnableC0278p;
import F1.a;
import S3.l;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* loaded from: classes4.dex */
public final class AppMeasurementService extends Service implements InterfaceC0306y1 {

    /* renamed from: a, reason: collision with root package name */
    public l f26745a;

    @Override // A7.InterfaceC0306y1
    public final void a(Intent intent) {
        SparseArray sparseArray = a.f3808a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f3808a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A7.InterfaceC0306y1
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final l c() {
        if (this.f26745a == null) {
            this.f26745a = new l((Object) this);
        }
        return this.f26745a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l lVarC = c();
        if (intent == null) {
            lVarC.u().f605f.c("onBind called with null intent");
            return null;
        }
        lVarC.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC0287s0(L1.d((Service) lVarC.f10967a));
        }
        lVarC.u().f608i.d("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        N n10 = C0273n0.a((Service) c().f10967a, null, null).f981i;
        C0273n0.d(n10);
        n10.f612n.c("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        N n10 = C0273n0.a((Service) c().f10967a, null, null).f981i;
        C0273n0.d(n10);
        n10.f612n.c("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        l lVarC = c();
        if (intent == null) {
            lVarC.u().f605f.c("onRebind called with null intent");
            return;
        }
        lVarC.getClass();
        lVarC.u().f612n.d("onRebind called. action", intent.getAction());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        l lVarC = c();
        N n10 = C0273n0.a((Service) lVarC.f10967a, null, null).f981i;
        C0273n0.d(n10);
        if (intent == null) {
            n10.f608i.c("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        n10.f612n.b(Integer.valueOf(i10), "Local AppMeasurementService called. startId, action", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        RunnableC0253g1 runnableC0253g1 = new RunnableC0253g1(1);
        runnableC0253g1.f873c = lVarC;
        runnableC0253g1.f872b = i10;
        runnableC0253g1.f874d = n10;
        runnableC0253g1.f875e = intent;
        L1 l1D = L1.d((Service) lVarC.f10967a);
        l1D.zzl().m0(new RunnableC0278p(l1D, false, runnableC0253g1, 12));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        l lVarC = c();
        if (intent == null) {
            lVarC.u().f605f.c("onUnbind called with null intent");
            return true;
        }
        lVarC.getClass();
        lVarC.u().f612n.d("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @Override // A7.InterfaceC0306y1
    public final boolean zza(int i5) {
        return stopSelfResult(i5);
    }
}
