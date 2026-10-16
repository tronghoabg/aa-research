package com.android.billingclient.api;

import E4.F;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.internal.play_billing.zzhl;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20115a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f20116b = false;

    /* renamed from: c, reason: collision with root package name */
    public BillingClientStateListener f20117c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f20118d;

    public /* synthetic */ d(a aVar, BillingClientStateListener billingClientStateListener) {
        this.f20118d = aVar;
        this.f20117c = billingClientStateListener;
    }

    public final void a(BillingResult billingResult) {
        synchronized (this.f20115a) {
            try {
                BillingClientStateListener billingClientStateListener = this.f20117c;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingSetupFinished(billingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service connected.");
        this.f20118d.f20092g = com.google.android.gms.internal.play_billing.zzr.zzu(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzaz
            /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x01b0  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x01bc  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x01cb  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 476
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzaz.call():java.lang.Object");
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzba
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = this.zza;
                dVar.f20118d.f20086a = 0;
                dVar.f20118d.f20092g = null;
                BillingResult billingResult = i.f20143m;
                dVar.f20118d.f(zzcb.zza(24, 6, billingResult));
                dVar.a(billingResult);
            }
        };
        a aVar = this.f20118d;
        if (aVar.e(callable, 30000L, runnable, aVar.a()) == null) {
            a aVar2 = this.f20118d;
            BillingResult billingResultC = aVar2.c();
            aVar2.f(zzcb.zza(25, 6, billingResultC));
            a(billingResultC);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing service disconnected.");
        X2.j jVar = this.f20118d.f20091f;
        zzhl zzhlVarZzz = zzhl.zzz();
        jVar.getClass();
        if (zzhlVarZzz != null) {
            try {
                zzhd zzhdVarZzy = zzhe.zzy();
                zzhdVarZzy.zzn((zzgu) jVar.f16075b);
                zzhdVarZzy.zzo(zzhlVarZzz);
                ((F) jVar.f16076c).x((zzhe) zzhdVarZzy.zzf());
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
            }
        }
        this.f20118d.f20092g = null;
        this.f20118d.f20086a = 0;
        synchronized (this.f20115a) {
            try {
                BillingClientStateListener billingClientStateListener = this.f20117c;
                if (billingClientStateListener != null) {
                    billingClientStateListener.onBillingServiceDisconnected();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
