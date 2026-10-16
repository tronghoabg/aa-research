package com.vungle.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.V;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public AtomicBoolean f33884a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f33885b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f33886c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final n2 f33887d = new n2(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    public final void a(Context context, String appId, InitializationListener initializationCallback) throws Throwable {
        int i5 = 0;
        AbstractC3340k.e(appId, "appId");
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(initializationCallback, "initializationCallback");
        AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (com.vungle.ads.internal.util.s) null, 6);
        this.f33887d.e();
        this.f33886c.add(initializationCallback);
        if (!Bf.k.y0(appId)) {
            for (int i10 = 0; i10 < appId.length(); i10++) {
                char cCharAt = appId.charAt(i10);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '.') {
                }
            }
            if (com.vungle.ads.internal.util.z.a()) {
                boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.b("VungleInitializer", "Init: SDK is supported only for API versions 25 and above.");
                a(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
                return;
            }
            ConfigManager.INSTANCE.getClass();
            ConfigManager.b(appId);
            if (this.f33884a.get()) {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "init already complete");
                b();
                return;
            } else if (this.f33885b.getAndSet(true)) {
                boolean z11 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "init already in progress");
                return;
            } else {
                EnumC2526j enumC2526j = EnumC2526j.f34667a;
                ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) Fe.c.y(enumC2526j, new r2(context)).getValue())).b().a(new V(this, context, appId, Fe.c.y(enumC2526j, new s2(context)), 4), new zb.b(this, i5));
                return;
            }
        }
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("App id invalid: ", appId, ", package name: ");
        sbW.append(context.getPackageName());
        a(new InvalidAppId(sbW.toString()).logError$vungle_ads_release());
    }

    public final void b() throws Throwable {
        this.f33885b.set(false);
        this.f33887d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.f33887d.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f33887d, (com.vungle.ads.internal.util.s) null, 6);
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onSuccess ");
        sbA.append(Thread.currentThread().getId());
        com.vungle.ads.internal.util.t.a("VungleInitializer", sbA.toString());
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new v2(this));
    }

    public static final void a(w2 this$0, Context context, String appId, InterfaceC2525i vungleApiClient$delegate) {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(context, "$context");
        AbstractC3340k.e(appId, "$appId");
        AbstractC3340k.e(vungleApiClient$delegate, "$vungleApiClient$delegate");
        boolean z2 = false;
        boolean z10 = Y0.e.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        boolean z11 = Y0.e.checkSelfPermission(context, "android.permission.INTERNET") == 0;
        if (z10 && z11) {
            PrivacyManager.INSTANCE.a(context);
            ((VungleApiClient) vungleApiClient$delegate.getValue()).c(appId);
            try {
                EnumC2526j enumC2526j = EnumC2526j.f34667a;
                InterfaceC2525i interfaceC2525iY = Fe.c.y(enumC2526j, new o2(context));
                ConfigManager configManager = ConfigManager.INSTANCE;
                FilePreferences filePreferences = (FilePreferences) interfaceC2525iY.getValue();
                configManager.getClass();
                com.vungle.ads.internal.model.v2 v2VarA = ConfigManager.a(filePreferences, appId);
                if (v2VarA != null) {
                    configManager.a(context, v2VarA, true, null);
                    z2 = true;
                }
                this$0.f33884a.set(true);
                this$0.b();
                boolean z12 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "Running cleanup jobs. " + Thread.currentThread().getId());
                ((com.vungle.ads.internal.task.s) ((com.vungle.ads.internal.task.h) Fe.c.y(enumC2526j, new p2(context)).getValue())).a(com.vungle.ads.internal.task.a.a(null));
                if (z2) {
                    return;
                }
                ConfigManager.a(context, q2.f33597a);
                return;
            } catch (Throwable th) {
                boolean z13 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "Cannot get config", th);
                return;
            }
        }
        boolean z14 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", "Network permissions not granted");
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new t2(this$0));
    }

    public static final void a(w2 this$0) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.a(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    public final void a(VungleError vungleError) {
        this.f33885b.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Exception code is ");
            sbA.append(vungleError.getCode());
            localizedMessage = sbA.toString();
        }
        this.f33887d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.f33887d.d();
        AnalyticsClient.INSTANCE.a(this.f33887d, (com.vungle.ads.internal.util.s) null, localizedMessage);
        Handler handler = com.vungle.ads.internal.util.y.f33878a;
        com.vungle.ads.internal.util.y.a(new u2(this, vungleError));
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", localizedMessage);
    }

    public final void a() {
        synchronized (ServiceLocator.f32912d) {
            ServiceLocator.INSTANCE = null;
        }
        Xf.c cVar = VungleApiClient.f33374n;
        com.vungle.ads.internal.network.d0.f33403a = com.vungle.ads.internal.network.d0.a();
        this.f33884a.set(false);
        this.f33885b.set(false);
        this.f33886c.clear();
    }

    public final void a(String integrationName, String version) {
        AbstractC3340k.e(integrationName, "integrationName");
        AbstractC3340k.e(version, "version");
        if (Bf.k.y0(integrationName)) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.b("VungleInitializer", "integrationName is empty");
            return;
        }
        String strD = com.vungle.ads.internal.network.d0.d();
        String strA = com.iab.omid.library.vungle.d.a(integrationName, !Bf.k.y0(version) ? "/".concat(version) : "");
        if (Bf.k.n0(strD, strA, false)) {
            boolean z10 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "Wrapper info already set");
            return;
        }
        com.vungle.ads.internal.network.d0.c(strD + ';' + strA);
        if (this.f33884a.get()) {
            boolean z11 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
