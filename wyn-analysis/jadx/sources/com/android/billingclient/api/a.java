package com.android.billingclient.api;

import A7.CallableC0308z0;
import A7.W;
import K8.H;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzgz;
import com.google.android.gms.internal.play_billing.zzhb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class a extends BillingClient {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f20084A;

    /* renamed from: B, reason: collision with root package name */
    public ExecutorService f20085B;

    /* renamed from: a, reason: collision with root package name */
    public volatile int f20086a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20087b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f20088c;

    /* renamed from: d, reason: collision with root package name */
    public volatile H f20089d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f20090e;

    /* renamed from: f, reason: collision with root package name */
    public final X2.j f20091f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.zzs f20092g;

    /* renamed from: h, reason: collision with root package name */
    public volatile d f20093h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20094i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20095j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20096l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20097m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20098n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20099o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20100p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20101q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20102r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20103s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20104t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20105u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20106v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20107w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20108x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20109y;

    /* renamed from: z, reason: collision with root package name */
    public final PendingPurchasesParams f20110z;

    public a(Context context) {
        this.f20086a = 0;
        this.f20088c = new Handler(Looper.getMainLooper());
        this.k = 0;
        String strD = d();
        this.f20087b = strD;
        this.f20090e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strD);
        zzgtVarZzy.zzm(this.f20090e.getPackageName());
        this.f20091f = new X2.j(this.f20090e, (zzgu) zzgtVarZzy.zzf());
        this.f20090e.getPackageName();
    }

    public static String d() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    public final Handler a() {
        return Looper.myLooper() == null ? this.f20088c : new Handler(Looper.myLooper());
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            BillingResult billingResult2 = i.f20140i;
            f(zzcb.zza(26, 3, billingResult2));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            return;
        }
        if (!this.f20098n) {
            BillingResult billingResult3 = i.f20133b;
            f(zzcb.zza(27, 3, billingResult3));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else if (e(new Callable() { // from class: com.android.billingclient.api.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a aVar = this.zza;
                AcknowledgePurchaseParams acknowledgePurchaseParams2 = acknowledgePurchaseParams;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                aVar.getClass();
                try {
                    com.google.android.gms.internal.play_billing.zzs zzsVar = aVar.f20092g;
                    String packageName = aVar.f20090e.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams2.getPurchaseToken();
                    String str = aVar.f20087b;
                    Bundle bundle = new Bundle();
                    bundle.putString("playBillingLibraryVersion", str);
                    Bundle bundleZzd = zzsVar.zzd(9, packageName, purchaseToken, bundle);
                    acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(i.a(com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzd, "BillingClient")));
                    return null;
                } catch (Exception e7) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error acknowledge purchase!", e7);
                    BillingResult billingResult4 = i.f20142l;
                    aVar.f(zzcb.zza(28, 3, billingResult4));
                    acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult4);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzv
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                aVar.getClass();
                BillingResult billingResult4 = i.f20143m;
                aVar.f(zzcb.zza(24, 3, billingResult4));
                acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult4);
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 3, billingResultC));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultC);
        }
    }

    public final void b(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return;
        }
        this.f20088c.post(new Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                BillingResult billingResult2 = billingResult;
                if (((PurchasesUpdatedListener) aVar.f20089d.f6584c) != null) {
                    ((PurchasesUpdatedListener) aVar.f20089d.f6584c).onPurchasesUpdated(billingResult2, null);
                } else {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
    }

    public final BillingResult c() {
        return (this.f20086a == 0 || this.f20086a == 3) ? i.f20142l : i.f20141j;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        } else if (e(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int iZza;
                String strZzg;
                a aVar = this.zza;
                ConsumeParams consumeParams2 = consumeParams;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                aVar.getClass();
                String purchaseToken = consumeParams2.getPurchaseToken();
                try {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Consuming purchase with token: " + purchaseToken);
                    if (aVar.f20098n) {
                        com.google.android.gms.internal.play_billing.zzs zzsVar = aVar.f20092g;
                        String packageName = aVar.f20090e.getPackageName();
                        boolean z2 = aVar.f20098n;
                        String str = aVar.f20087b;
                        Bundle bundle = new Bundle();
                        if (z2) {
                            bundle.putString("playBillingLibraryVersion", str);
                        }
                        Bundle bundleZze = zzsVar.zze(9, packageName, purchaseToken, bundle);
                        iZza = bundleZze.getInt("RESPONSE_CODE");
                        strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZze, "BillingClient");
                    } else {
                        iZza = aVar.f20092g.zza(3, aVar.f20090e.getPackageName(), purchaseToken);
                        strZzg = "";
                    }
                    BillingResult billingResultA = i.a(iZza, strZzg);
                    if (iZza == 0) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Successfully consumed purchase.");
                        consumeResponseListener2.onConsumeResponse(billingResultA, purchaseToken);
                        return null;
                    }
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error consuming purchase with token. Response code: " + iZza);
                    aVar.f(zzcb.zza(23, 4, billingResultA));
                    consumeResponseListener2.onConsumeResponse(billingResultA, purchaseToken);
                    return null;
                } catch (Exception e7) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error consuming purchase!", e7);
                    BillingResult billingResult2 = i.f20142l;
                    aVar.f(zzcb.zza(29, 4, billingResult2));
                    consumeResponseListener2.onConsumeResponse(billingResult2, purchaseToken);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                ConsumeParams consumeParams2 = consumeParams;
                aVar.getClass();
                BillingResult billingResult2 = i.f20143m;
                aVar.f(zzcb.zza(24, 4, billingResult2));
                consumeResponseListener2.onConsumeResponse(billingResult2, consumeParams2.getPurchaseToken());
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 4, billingResultC));
            consumeResponseListener.onConsumeResponse(billingResultC, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
        } else {
            if (!this.f20108x) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
                BillingResult billingResult2 = i.f20130C;
                f(zzcb.zza(66, 15, billingResult2));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a aVar = this.zza;
                    AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                    aVar.getClass();
                    try {
                        aVar.f20092g.zzm(21, aVar.f20090e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f20087b), new o4.b(alternativeBillingOnlyReportingDetailsListener2, aVar.f20091f, aVar.k));
                        return null;
                    } catch (Exception unused) {
                        BillingResult billingResult3 = i.f20141j;
                        aVar.f(zzcb.zza(70, 15, billingResult3));
                        alternativeBillingOnlyReportingDetailsListener2.onAlternativeBillingOnlyTokenResponse(billingResult3, null);
                        return null;
                    }
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaa
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                    aVar.getClass();
                    BillingResult billingResult3 = i.f20143m;
                    aVar.f(zzcb.zza(24, 15, billingResult3));
                    alternativeBillingOnlyReportingDetailsListener2.onAlternativeBillingOnlyTokenResponse(billingResult3, null);
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 15, billingResultC));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultC, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 24, billingResult));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
        } else {
            if (!this.f20109y) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
                BillingResult billingResult2 = i.f20153w;
                f(zzcb.zza(103, 24, billingResult2));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, null);
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzab
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a aVar = this.zza;
                    ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = externalOfferReportingDetailsListener;
                    aVar.getClass();
                    try {
                        aVar.f20092g.zzn(22, aVar.f20090e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f20087b), new o4.c(externalOfferReportingDetailsListener2, aVar.f20091f, aVar.k));
                        return null;
                    } catch (Exception e7) {
                        BillingResult billingResult3 = i.f20141j;
                        aVar.f(zzcb.zzb(94, 24, billingResult3, N0.a.g(e7.getClass().getName(), ": ", com.google.android.gms.internal.play_billing.zzab.zzb(e7.getMessage()))));
                        externalOfferReportingDetailsListener2.onExternalOfferReportingDetailsResponse(billingResult3, null);
                        return null;
                    }
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzak
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = externalOfferReportingDetailsListener;
                    aVar.getClass();
                    BillingResult billingResult3 = i.f20143m;
                    aVar.f(zzcb.zza(24, 24, billingResult3));
                    externalOfferReportingDetailsListener2.onExternalOfferReportingDetailsResponse(billingResult3, null);
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 24, billingResultC));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultC, null);
            }
        }
    }

    public final Future e(Callable callable, long j8, final Runnable runnable, Handler handler) {
        if (this.f20085B == null) {
            this.f20085B = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzb.zza, new H6.b());
        }
        try {
            final Future futureSubmit = this.f20085B.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j8 * 0.95d));
            return futureSubmit;
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Async task throws exception!", e7);
            return null;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        g(zzcb.zzc(12));
        try {
            try {
                if (this.f20089d != null) {
                    H h10 = this.f20089d;
                    W w2 = (W) h10.f6587f;
                    Context context = (Context) h10.f6583b;
                    w2.c(context);
                    ((W) h10.f6588g).c(context);
                }
                if (this.f20093h != null) {
                    d dVar = this.f20093h;
                    synchronized (dVar.f20115a) {
                        dVar.f20117c = null;
                        dVar.f20116b = true;
                    }
                }
                if (this.f20093h != null && this.f20092g != null) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unbinding from service.");
                    this.f20090e.unbindService(this.f20093h);
                    this.f20093h = null;
                }
                this.f20092g = null;
                ExecutorService executorService = this.f20085B;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f20085B = null;
                }
            } catch (Exception e7) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "There was an exception while ending connection!", e7);
            }
            this.f20086a = 3;
        } catch (Throwable th) {
            this.f20086a = 3;
            throw th;
        }
    }

    public final void f(zzga zzgaVar) {
        this.f20091f.a0(zzgaVar, this.k);
    }

    public final void g(zzge zzgeVar) {
        X2.j jVar = this.f20091f;
        int i5 = this.k;
        jVar.getClass();
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) jVar.f16075b).zzi();
            zzgtVar.zzl(i5);
            jVar.f16075b = (zzgu) zzgtVar.zzf();
            jVar.b0(zzgeVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        if (!this.f20105u) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support get billing config.");
            BillingResult billingResult2 = i.f20155y;
            f(zzcb.zza(32, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", this.f20087b);
        if (e(new Callable() { // from class: com.android.billingclient.api.zzw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a aVar = this.zza;
                Bundle bundle2 = bundle;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                aVar.getClass();
                try {
                    aVar.f20092g.zzp(18, aVar.f20090e.getPackageName(), bundle2, new f(billingConfigResponseListener2, aVar.f20091f, aVar.k));
                    return null;
                } catch (DeadObjectException e7) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e7);
                    BillingResult billingResult3 = i.f20142l;
                    aVar.f(zzcb.zza(62, 13, billingResult3));
                    billingConfigResponseListener2.onBillingConfigResponse(billingResult3, null);
                    return null;
                } catch (Exception e10) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got an exception.", e10);
                    BillingResult billingResult4 = i.f20141j;
                    aVar.f(zzcb.zza(62, 13, billingResult4));
                    billingConfigResponseListener2.onBillingConfigResponse(billingResult4, null);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzx
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                aVar.getClass();
                BillingResult billingResult3 = i.f20143m;
                aVar.f(zzcb.zza(24, 13, billingResult3));
                billingConfigResponseListener2.onBillingConfigResponse(billingResult3, null);
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 13, billingResultC));
            billingConfigResponseListener.onBillingConfigResponse(billingResultC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.f20086a;
    }

    public final void h(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 11, billingResult));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
        } else if (e(new CallableC0308z0(this, str, purchaseHistoryResponseListener, 6), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                PurchaseHistoryResponseListener purchaseHistoryResponseListener2 = purchaseHistoryResponseListener;
                aVar.getClass();
                BillingResult billingResult2 = i.f20143m;
                aVar.f(zzcb.zza(24, 11, billingResult2));
                purchaseHistoryResponseListener2.onPurchaseHistoryResponse(billingResult2, null);
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 11, billingResultC));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResultC, null);
        }
    }

    public final void i(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 9, billingResult));
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else {
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid product type.");
                BillingResult billingResult2 = i.f20138g;
                f(zzcb.zza(50, 9, billingResult2));
                purchasesResponseListener.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            if (e(new CallableC0308z0(this, str, purchasesResponseListener, 5), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    PurchasesResponseListener purchasesResponseListener2 = purchasesResponseListener;
                    aVar.getClass();
                    BillingResult billingResult3 = i.f20143m;
                    aVar.f(zzcb.zza(24, 9, billingResult3));
                    purchasesResponseListener2.onQueryPurchasesResponse(billingResult3, com.google.android.gms.internal.play_billing.zzai.zzk());
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 9, billingResultC));
                purchasesResponseListener.onQueryPurchasesResponse(billingResultC, com.google.android.gms.internal.play_billing.zzai.zzk());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
        } else {
            if (!this.f20108x) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
                BillingResult billingResult2 = i.f20130C;
                f(zzcb.zza(66, 14, billingResult2));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult2);
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a aVar = this.zza;
                    AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                    aVar.getClass();
                    try {
                        aVar.f20092g.zzr(21, aVar.f20090e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f20087b), new o4.d(alternativeBillingOnlyAvailabilityListener2, aVar.f20091f, aVar.k));
                        return null;
                    } catch (Exception unused) {
                        BillingResult billingResult3 = i.f20141j;
                        aVar.f(zzcb.zza(69, 14, billingResult3));
                        alternativeBillingOnlyAvailabilityListener2.onAlternativeBillingOnlyAvailabilityResponse(billingResult3);
                        return null;
                    }
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzag
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                    aVar.getClass();
                    BillingResult billingResult3 = i.f20143m;
                    aVar.f(zzcb.zza(24, 14, billingResult3));
                    alternativeBillingOnlyAvailabilityListener2.onAlternativeBillingOnlyAvailabilityResponse(billingResult3);
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 14, billingResultC));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultC);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 23, billingResult));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
        } else {
            if (!this.f20109y) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
                BillingResult billingResult2 = i.f20153w;
                f(zzcb.zza(103, 23, billingResult2));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult2);
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a aVar = this.zza;
                    ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                    aVar.getClass();
                    try {
                        aVar.f20092g.zzs(22, aVar.f20090e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f20087b), new o4.e(externalOfferAvailabilityListener2, aVar.f20091f, aVar.k));
                        return null;
                    } catch (Exception e7) {
                        BillingResult billingResult3 = i.f20141j;
                        aVar.f(zzcb.zzb(91, 23, billingResult3, N0.a.g(e7.getClass().getName(), ": ", com.google.android.gms.internal.play_billing.zzab.zzb(e7.getMessage()))));
                        externalOfferAvailabilityListener2.onExternalOfferAvailabilityResponse(billingResult3);
                        return null;
                    }
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzar
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                    aVar.getClass();
                    BillingResult billingResult3 = i.f20143m;
                    aVar.f(zzcb.zza(24, 23, billingResult3));
                    externalOfferAvailabilityListener2.onExternalOfferAvailabilityResponse(billingResult3);
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 23, billingResultC));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultC);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.isFeatureSupported(java.lang.String):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.f20086a != 2 || this.f20092g == null || this.f20093h == null) ? false : true;
    }

    public final void j(int i5, int i10, BillingResult billingResult) {
        zzge zzgeVar = null;
        zzga zzgaVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i11 = zzcb.zza;
            try {
                zzgd zzgdVarZzy = zzge.zzy();
                zzgdVarZzy.zzm(5);
                zzgz zzgzVarZzy = zzhb.zzy();
                zzgzVarZzy.zzl(i10);
                zzgdVarZzy.zzl((zzhb) zzgzVarZzy.zzf());
                zzgeVar = (zzge) zzgdVarZzy.zzf();
            } catch (Exception e7) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e7);
            }
            g(zzgeVar);
            return;
        }
        int i12 = zzcb.zza;
        try {
            zzfz zzfzVarZzy = zzga.zzy();
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(billingResult.getResponseCode());
            zzggVarZzy.zzm(billingResult.getDebugMessage());
            zzggVarZzy.zzo(i5);
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(5);
            zzgz zzgzVarZzy2 = zzhb.zzy();
            zzgzVarZzy2.zzl(i10);
            zzfzVarZzy.zzm((zzhb) zzgzVarZzy2.zzf());
            zzgaVar = (zzga) zzfzVarZzy.zzf();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e10);
        }
        f(zzgaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0471 A[Catch: Exception -> 0x0481, CancellationException -> 0x0483, TimeoutException -> 0x0485, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0483, TimeoutException -> 0x0485, Exception -> 0x0481, blocks: (B:192:0x0471, B:200:0x0487, B:202:0x049b, B:205:0x04b7, B:207:0x04c3), top: B:223:0x046f }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0487 A[Catch: Exception -> 0x0481, CancellationException -> 0x0483, TimeoutException -> 0x0485, TryCatch #4 {CancellationException -> 0x0483, TimeoutException -> 0x0485, Exception -> 0x0481, blocks: (B:192:0x0471, B:200:0x0487, B:202:0x049b, B:205:0x04b7, B:207:0x04c3), top: B:223:0x046f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r33, final com.android.billingclient.api.BillingFlowParams r34) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 7, billingResult));
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else {
            if (!this.f20104t) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Querying product details is not supported.");
                BillingResult billingResult2 = i.f20151u;
                f(zzcb.zza(20, 7, billingResult2));
                productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
                return;
            }
            if (e(new Callable() { // from class: com.android.billingclient.api.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strZzg;
                    int i5;
                    int i10;
                    int i11;
                    String packageName;
                    com.google.android.gms.internal.play_billing.zzai zzaiVar;
                    int i12;
                    Bundle bundle;
                    com.google.android.gms.internal.play_billing.zzs zzsVar;
                    Bundle bundleZzl;
                    int iZzb;
                    a aVar = this.zza;
                    QueryProductDetailsParams queryProductDetailsParams2 = queryProductDetailsParams;
                    ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                    aVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    String strZzb = queryProductDetailsParams2.zzb();
                    com.google.android.gms.internal.play_billing.zzai zzaiVarZza = queryProductDetailsParams2.zza();
                    int size = zzaiVarZza.size();
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 20;
                        ArrayList arrayList2 = new ArrayList(zzaiVarZza.subList(i13, i14 > size ? size : i14));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i15)).zza());
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle2.putString("playBillingLibraryVersion", aVar.f20087b);
                        try {
                            com.google.android.gms.internal.play_billing.zzs zzsVar2 = aVar.f20092g;
                            int i16 = true != aVar.f20107w ? 17 : 20;
                            String str = null;
                            packageName = aVar.f20090e.getPackageName();
                            boolean z2 = aVar.f20106v && aVar.f20110z.f20016a;
                            zzaiVar = zzaiVarZza;
                            String str2 = aVar.f20087b;
                            if (TextUtils.isEmpty(null)) {
                                aVar.f20090e.getPackageName();
                            }
                            if (TextUtils.isEmpty(null)) {
                                aVar.f20090e.getPackageName();
                            }
                            if (TextUtils.isEmpty(null)) {
                                aVar.f20090e.getPackageName();
                            }
                            i12 = i16;
                            bundle = new Bundle();
                            bundle.putString("playBillingLibraryVersion", str2);
                            bundle.putBoolean("enablePendingPurchases", true);
                            bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                            if (z2) {
                                bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
                            }
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            int size3 = arrayList2.size();
                            int i17 = 0;
                            boolean z10 = false;
                            boolean z11 = false;
                            while (i17 < size3) {
                                QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList2.get(i17);
                                int i18 = i17;
                                arrayList4.add(str);
                                z11 |= !TextUtils.isEmpty(r1);
                                String strZzb2 = product.zzb();
                                com.google.android.gms.internal.play_billing.zzs zzsVar3 = zzsVar2;
                                if (strZzb2.equals("first_party")) {
                                    com.google.android.gms.internal.play_billing.zzaa.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                    arrayList5.add(null);
                                    z10 = true;
                                }
                                i17 = i18 + 1;
                                zzsVar2 = zzsVar3;
                                str = null;
                            }
                            zzsVar = zzsVar2;
                            if (z11) {
                                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                            }
                            if (z10 && !TextUtils.isEmpty(null)) {
                                bundle.putString("accountName", null);
                            }
                            i10 = 6;
                            i11 = 7;
                        } catch (Exception e7) {
                            e = e7;
                            i10 = 6;
                            i11 = 7;
                        }
                        try {
                            bundleZzl = zzsVar.zzl(i12, packageName, strZzb, bundle2, bundle);
                            iZzb = 4;
                            strZzg = "Item is unavailable for purchase.";
                        } catch (Exception e10) {
                            e = e10;
                            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                            aVar.f(zzcb.zza(43, i11, i.f20141j));
                            strZzg = "An internal error occurred.";
                            i5 = i10;
                            productDetailsResponseListener2.onProductDetailsResponse(i.a(i5, strZzg), arrayList);
                            return null;
                        }
                        if (bundleZzl == null) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                            aVar.f(zzcb.zza(44, 7, i.f20128A));
                        } else if (bundleZzl.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList == null) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                                aVar.f(zzcb.zza(46, 7, i.f20128A));
                            } else {
                                for (int i19 = 0; i19 < stringArrayList.size(); i19++) {
                                    try {
                                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i19));
                                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                        arrayList.add(productDetails);
                                    } catch (JSONException e11) {
                                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e11);
                                        strZzg = "Error trying to decode SkuDetails.";
                                        aVar.f(zzcb.zza(47, 7, i.a(6, "Error trying to decode SkuDetails.")));
                                    }
                                }
                                i13 = i14;
                                zzaiVarZza = zzaiVar;
                            }
                        } else {
                            iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzl, "BillingClient");
                            strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzl, "BillingClient");
                            if (iZzb != 0) {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb);
                                aVar.f(zzcb.zza(23, 7, i.a(iZzb, strZzg)));
                            } else {
                                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                aVar.f(zzcb.zza(45, 7, i.a(6, strZzg)));
                                i5 = i10;
                            }
                        }
                        i5 = iZzb;
                        break;
                    }
                    strZzg = "";
                    i5 = 0;
                    productDetailsResponseListener2.onProductDetailsResponse(i.a(i5, strZzg), arrayList);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzao
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                    aVar.getClass();
                    BillingResult billingResult3 = i.f20143m;
                    aVar.f(zzcb.zza(24, 7, billingResult3));
                    productDetailsResponseListener2.onProductDetailsResponse(billingResult3, new ArrayList());
                }
            }, a()) == null) {
                BillingResult billingResultC = c();
                f(zzcb.zza(25, 7, billingResultC));
                productDetailsResponseListener.onProductDetailsResponse(billingResultC, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        h(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        i(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 8, billingResult));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            BillingResult billingResult2 = i.f20137f;
            f(zzcb.zza(49, 8, billingResult2));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
            return;
        }
        if (skusList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            BillingResult billingResult3 = i.f20136e;
            f(zzcb.zza(48, 8, billingResult3));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
            return;
        }
        final String str = null;
        if (e(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzac
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 410
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzac.call():java.lang.Object");
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzad
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                SkuDetailsResponseListener skuDetailsResponseListener2 = skuDetailsResponseListener;
                aVar.getClass();
                BillingResult billingResult4 = i.f20143m;
                aVar.f(zzcb.zza(24, 8, billingResult4));
                skuDetailsResponseListener2.onSkuDetailsResponse(billingResult4, null);
            }
        }, a()) == null) {
            BillingResult billingResultC = c();
            f(zzcb.zza(25, 8, billingResultC));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResultC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 16, billingResult));
            return billingResult;
        }
        if (!this.f20108x) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            BillingResult billingResult2 = i.f20130C;
            f(zzcb.zza(66, 16, billingResult2));
            return billingResult2;
        }
        Handler handler = this.f20088c;
        final b bVar = new b(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (e(new Callable() { // from class: com.android.billingclient.api.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a aVar = this.zza;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = bVar;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                aVar.getClass();
                try {
                    aVar.f20092g.zzo(21, aVar.f20090e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f20087b), new e(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (Exception unused) {
                    BillingResult billingResult3 = i.f20141j;
                    aVar.f(zzcb.zza(74, 16, billingResult3));
                    alternativeBillingOnlyInformationDialogListener2.onAlternativeBillingOnlyInformationDialogResponse(billingResult3);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzt
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                aVar.getClass();
                BillingResult billingResult3 = i.f20143m;
                aVar.f(zzcb.zza(24, 16, billingResult3));
                alternativeBillingOnlyInformationDialogListener2.onAlternativeBillingOnlyInformationDialogResponse(billingResult3);
            }
        }, handler) != null) {
            return i.k;
        }
        BillingResult billingResultC = c();
        f(zzcb.zza(25, 16, billingResultC));
        return billingResultC;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = i.f20142l;
            f(zzcb.zza(2, 25, billingResult));
            return billingResult;
        }
        if (!this.f20109y) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support external offer.");
            BillingResult billingResult2 = i.f20153w;
            f(zzcb.zza(103, 25, billingResult2));
            return billingResult2;
        }
        Handler handler = this.f20088c;
        final c cVar = new c(this, handler, externalOfferInformationDialogListener);
        if (e(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a aVar = this.zza;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = cVar;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                aVar.getClass();
                try {
                    aVar.f20092g.zzq(22, aVar.f20090e.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(aVar.f20087b), new g(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (Exception e7) {
                    BillingResult billingResult3 = i.f20141j;
                    aVar.f(zzcb.zzb(98, 25, billingResult3, N0.a.g(e7.getClass().getName(), ": ", com.google.android.gms.internal.play_billing.zzab.zzb(e7.getMessage()))));
                    externalOfferInformationDialogListener2.onExternalOfferInformationDialogResponse(billingResult3);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                aVar.getClass();
                BillingResult billingResult3 = i.f20143m;
                aVar.f(zzcb.zza(24, 25, billingResult3));
                externalOfferInformationDialogListener2.onExternalOfferInformationDialogResponse(billingResult3);
            }
        }, handler) != null) {
            return i.k;
        }
        BillingResult billingResultC = c();
        f(zzcb.zza(25, 25, billingResultC));
        return billingResultC;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            return i.f20142l;
        }
        if (!this.f20100p) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support showing in-app messages.");
            return i.f20152v;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f20087b);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.f20012a);
        Handler handler = this.f20088c;
        final o4.a aVar = new o4.a(handler, inAppMessageResponseListener);
        e(new Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final Object call() throws RemoteException {
                a aVar2 = this.zza;
                Bundle bundle2 = bundle;
                Activity activity2 = activity;
                aVar2.f20092g.zzt(12, aVar2.f20090e.getPackageName(), bundle2, new h(new WeakReference(activity2), aVar));
                return null;
            }
        }, 5000L, null, handler);
        return i.k;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            g(zzcb.zzc(6));
            billingClientStateListener.onBillingSetupFinished(i.k);
            return;
        }
        int i5 = 1;
        if (this.f20086a == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            BillingResult billingResult = i.f20135d;
            f(zzcb.zza(37, 6, billingResult));
            billingClientStateListener.onBillingSetupFinished(billingResult);
            return;
        }
        if (this.f20086a == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            BillingResult billingResult2 = i.f20142l;
            f(zzcb.zza(38, 6, billingResult2));
            billingClientStateListener.onBillingSetupFinished(billingResult2);
            return;
        }
        this.f20086a = 1;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.f20093h = new d(this, billingClientStateListener);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f20090e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i5 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i5 = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f20087b);
                    if (this.f20090e.bindService(intent2, this.f20093h, 1)) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i5 = 39;
                    }
                }
            }
        }
        this.f20086a = 0;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
        BillingResult billingResult3 = i.f20134c;
        f(zzcb.zza(i5, 6, billingResult3));
        billingClientStateListener.onBillingSetupFinished(billingResult3);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        h(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        i(str, purchasesResponseListener);
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context) {
        this.f20086a = 0;
        this.f20088c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.f20087b = d();
        this.f20090e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(d());
        zzgtVarZzy.zzm(this.f20090e.getPackageName());
        this.f20091f = new X2.j(this.f20090e, (zzgu) zzgtVarZzy.zzf());
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f20089d = new H(this.f20090e, (PurchasesUpdatedListener) null, (UserChoiceBillingListener) null, this.f20091f);
        this.f20110z = pendingPurchasesParams;
        this.f20090e.getPackageName();
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        String strD = d();
        this.f20086a = 0;
        this.f20088c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.f20087b = strD;
        this.f20090e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strD);
        zzgtVarZzy.zzm(this.f20090e.getPackageName());
        this.f20091f = new X2.j(this.f20090e, (zzgu) zzgtVarZzy.zzf());
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f20089d = new H(this.f20090e, purchasesUpdatedListener, (UserChoiceBillingListener) null, this.f20091f);
        this.f20110z = pendingPurchasesParams;
        this.f20084A = false;
        this.f20090e.getPackageName();
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener) {
        String strD = d();
        this.f20086a = 0;
        this.f20088c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.f20087b = strD;
        this.f20090e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strD);
        zzgtVarZzy.zzm(this.f20090e.getPackageName());
        this.f20091f = new X2.j(this.f20090e, (zzgu) zzgtVarZzy.zzf());
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f20089d = new H(this.f20090e, purchasesUpdatedListener, userChoiceBillingListener, this.f20091f);
        this.f20110z = pendingPurchasesParams;
        this.f20084A = userChoiceBillingListener != null;
    }
}
