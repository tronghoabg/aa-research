package com.moloco.sdk.internal.publisher;

import Ef.H0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebView;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1892f;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.ortb.model.C1910y;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import ef.C2515C;
import ef.C2530n;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;
import x3.AbstractC4467j;

/* loaded from: classes4.dex */
public final class B implements AdLoad {

    /* renamed from: a, reason: collision with root package name */
    public final tf.l f28892a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28893b;

    /* renamed from: c, reason: collision with root package name */
    public final C3338i f28894c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.e f28895d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.X f28896e;

    /* renamed from: f, reason: collision with root package name */
    public final AdFormatType f28897f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.l f28898g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f28899h;

    /* renamed from: i, reason: collision with root package name */
    public final tf.a f28900i;

    /* renamed from: j, reason: collision with root package name */
    public final Kd.a f28901j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public String f28902l;

    /* renamed from: m, reason: collision with root package name */
    public C1910y f28903m;

    /* renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.acm.l f28904n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f28905o;

    /* JADX WARN: Multi-variable type inference failed */
    public B(Kd.a aVar, tf.l lVar, String adUnitId, tf.l lVar2, com.moloco.sdk.internal.ortb.e parseBidResponse, androidx.fragment.app.X x5, AdFormatType adFormatType, com.moloco.sdk.internal.services.l webViewChecker, com.moloco.sdk.acm.recorder.c cVar, tf.a aVar2) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(parseBidResponse, "parseBidResponse");
        AbstractC3340k.e(adFormatType, "adFormatType");
        AbstractC3340k.e(webViewChecker, "webViewChecker");
        this.f28892a = lVar;
        this.f28893b = adUnitId;
        this.f28894c = (C3338i) lVar2;
        this.f28895d = parseBidResponse;
        this.f28896e = x5;
        this.f28897f = adFormatType;
        this.f28898g = webViewChecker;
        this.f28899h = cVar;
        this.f28900i = aVar2;
        Lf.e eVar = Ef.S.f3698a;
        this.f28901j = Ef.H.F(aVar, Jf.n.f6132a);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
        this.f28904n = cVar.c("load_ad_time");
    }

    public static final C1906u a(B b5, C1910y c1910y) {
        List list;
        C1892f c1892f;
        List list2;
        if (c1910y == null || (list = c1910y.f28880a) == null || (c1892f = (C1892f) list.get(0)) == null || (list2 = c1892f.f28799a) == null) {
            return null;
        }
        return (C1906u) list2.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.moloco.sdk.internal.publisher.B r4, java.lang.String r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.internal.publisher.C1933w
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.internal.publisher.w r0 = (com.moloco.sdk.internal.publisher.C1933w) r0
            int r1 = r0.f29352d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29352d = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.w r0 = new com.moloco.sdk.internal.publisher.w
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f29350b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f29352d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.f29349a
            Fe.e.U(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            Fe.e.U(r6)
            r0.f29349a = r5
            r0.f29352d = r3
            androidx.fragment.app.X r4 = r4.f28896e
            Lf.e r6 = Ef.S.f3698a
            com.moloco.sdk.internal.publisher.W r2 = new com.moloco.sdk.internal.publisher.W
            r3 = 0
            r2.<init>(r4, r5, r3)
            java.lang.Object r6 = Ef.H.P(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4e
            return r6
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.B.b(com.moloco.sdk.internal.publisher.B, java.lang.String, lf.c):java.lang.Object");
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String bidResponseJson, AdLoad.Listener listener) {
        PackageInfo packageInfoB;
        String str;
        Object objZ;
        AbstractC3340k.e(bidResponseJson, "bidResponseJson");
        com.moloco.sdk.internal.services.l lVar = this.f28898g;
        lVar.getClass();
        boolean z2 = AbstractC4467j.f47677a;
        if (Build.VERSION.SDK_INT >= 26) {
            packageInfoB = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoB = AbstractC4467j.b();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoB = null;
            }
        }
        Context context = lVar.f29707a;
        if (packageInfoB == null) {
            try {
                str = Build.VERSION.SDK_INT <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            packageInfoB = str == null ? null : context.getPackageManager().getPackageInfo(str, 0);
        }
        if (packageInfoB == null) {
            lVar.a("no_package");
            objZ = Fe.e.z(new Exception("No current WebView package exists"));
        } else {
            try {
                int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting(packageInfoB.packageName);
                if (applicationEnabledSetting == 2) {
                    lVar.a("disabled_by_system");
                    objZ = Fe.e.z(new Exception("WebView component is disabled by system"));
                } else if (applicationEnabledSetting == 3) {
                    lVar.a("disabled_by_user");
                    objZ = Fe.e.z(new Exception("WebView component is disabled by user"));
                } else if (applicationEnabledSetting != 4) {
                    objZ = C2515C.f34653a;
                } else {
                    lVar.a("disabled_until_used");
                    objZ = Fe.e.z(new Exception("WebView component is disabled until used"));
                }
            } catch (IllegalArgumentException e7) {
                lVar.a("unknown_package");
                objZ = Fe.e.z(e7);
            }
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            MolocoLogger.INSTANCE.error("AdLoad", "WebView Error: " + thA.getMessage(), thA, true);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(this.f28893b, MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        com.moloco.sdk.service_locator.i.b().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdLoadImpl", "load() called with bidResponseJson: ".concat(bidResponseJson), false, 4, null);
        this.f28904n.f28449a.f28475a.set(System.currentTimeMillis());
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("load_ad_attempted");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        String lowerCase = this.f28897f.name().toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        hVar.a("ad_type", lowerCase);
        this.f28899h.a(hVar);
        Ef.H.D(this.f28901j, null, new C1932v(this, bidResponseJson, listener, jCurrentTimeMillis, null), 3);
    }
}
