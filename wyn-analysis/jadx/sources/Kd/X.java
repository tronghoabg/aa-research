package kd;

import Va.M6;
import Va.X7;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.WebViewClient;
import ba.C1521a;
import ef.C2532p;
import ff.AbstractC2641B;
import java.util.List;
import k2.C3146c;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import p7.AbstractC3772b;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import r7.AbstractC3935e;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public class X implements InterfaceC3885b, InterfaceC3964a {

    /* renamed from: a, reason: collision with root package name */
    public C3884a f39628a;

    /* renamed from: b, reason: collision with root package name */
    public C8.i f39629b;

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        C8.i iVar = this.f39629b;
        if (iVar != null) {
            iVar.f1939b = (Activity) ((s1) interfaceC3965b).f43896a;
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        final int i5 = 1;
        final int i10 = 0;
        this.f39628a = c3884a;
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        Context context = c3884a.f44186a;
        C8.i iVar = new C8.i(interfaceC4269f, context, new C3321q(context.getAssets(), c3884a.f44191f));
        this.f39629b = iVar;
        c3884a.f44190e.j("plugins.flutter.io/webview", new ad.Z((C3308d) iVar.f1941d));
        C8.i iVar2 = this.f39629b;
        iVar2.getClass();
        C2532p c2532p = C3310f.f39658b;
        C3308d c3308d = (C3308d) iVar2.f1941d;
        InterfaceC4269f interfaceC4269f2 = (InterfaceC4269f) iVar2.f1940c;
        android.support.v4.media.session.b.q0(interfaceC4269f2, c3308d);
        ic.d.M(interfaceC4269f2, new C3316l(iVar2, 0));
        A6.c.M(interfaceC4269f2, new C3322s(iVar2, 2));
        xg.g.T(interfaceC4269f2, new C3316l(iVar2, 2));
        new X7(interfaceC4269f2, iVar2.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor").n(new com.unity3d.services.core.webview.b(new C3313i(iVar2, 1), 15));
        final r rVar = new r(iVar2, 2);
        InterfaceC4277n interfaceC4277nQ = iVar2.q();
        new X7(interfaceC4269f2, interfaceC4277nQ, (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor").n(new InterfaceC4265b() { // from class: kd.J
            @Override // uc.InterfaceC4265b
            public final void e(Object obj, C1521a c1521a) {
                List listD;
                List listD2;
                r rVar2 = rVar;
                switch (i10) {
                    case 0:
                        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((C3308d) rVar2.f39692a.f1941d).a(((Long) obj2).longValue(), Build.VERSION.SDK_INT >= 24 ? new W(rVar2) : new T(rVar2));
                            listD = AbstractC3935e.C(null);
                        } catch (Throwable th) {
                            if (th instanceof C3305a) {
                                C3305a c3305a = th;
                                listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                            } else {
                                listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                        }
                        c1521a.c(listD);
                        return;
                    default:
                        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj3 = list.get(0);
                        AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof T) {
                                ((T) webViewClient).f39615b = zBooleanValue;
                            } else {
                                rVar2.f39692a.getClass();
                                if (!(Build.VERSION.SDK_INT >= 24) || !(webViewClient instanceof W)) {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                                ((W) webViewClient).f39627b = zBooleanValue;
                            }
                            listD2 = AbstractC3935e.C(null);
                        } catch (Throwable th2) {
                            if (th2 instanceof C3305a) {
                                C3305a c3305a2 = th2;
                                listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                            } else {
                                listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                        }
                        c1521a.c(listD2);
                        return;
                }
            }
        });
        new X7(interfaceC4269f2, interfaceC4277nQ, (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading").n(new InterfaceC4265b() { // from class: kd.J
            @Override // uc.InterfaceC4265b
            public final void e(Object obj, C1521a c1521a) {
                List listD;
                List listD2;
                r rVar2 = rVar;
                switch (i5) {
                    case 0:
                        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((C3308d) rVar2.f39692a.f1941d).a(((Long) obj2).longValue(), Build.VERSION.SDK_INT >= 24 ? new W(rVar2) : new T(rVar2));
                            listD = AbstractC3935e.C(null);
                        } catch (Throwable th) {
                            if (th instanceof C3305a) {
                                C3305a c3305a = th;
                                listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                            } else {
                                listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                        }
                        c1521a.c(listD);
                        return;
                    default:
                        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj3 = list.get(0);
                        AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof T) {
                                ((T) webViewClient).f39615b = zBooleanValue;
                            } else {
                                rVar2.f39692a.getClass();
                                if (!(Build.VERSION.SDK_INT >= 24) || !(webViewClient instanceof W)) {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                                ((W) webViewClient).f39627b = zBooleanValue;
                            }
                            listD2 = AbstractC3935e.C(null);
                        } catch (Throwable th2) {
                            if (th2 instanceof C3305a) {
                                C3305a c3305a2 = th2;
                                listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                            } else {
                                listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                        }
                        c1521a.c(listD2);
                        return;
                }
            }
        });
        new X7(interfaceC4269f2, iVar2.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor").n(new com.unity3d.services.core.webview.b(new C3319o(iVar2, 0), 14));
        AbstractC4345a.M(interfaceC4269f2, new C3313i(iVar2, 2));
        AbstractC3230e0.x(interfaceC4269f2, new r(iVar2, 0));
        C3319o c3319o = new C3319o(iVar2, 2);
        InterfaceC4277n interfaceC4277nQ2 = iVar2.q();
        new X7(interfaceC4269f2, interfaceC4277nQ2, (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance").n(new com.unity3d.services.core.webview.b(c3319o, 17));
        new X7(interfaceC4269f2, interfaceC4277nQ2, (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData").n(new C3293D(c3319o, 16));
        ab.b bVar = new ab.b();
        InterfaceC4277n interfaceC4277nQ3 = iVar2.q();
        new X7(interfaceC4269f2, interfaceC4277nQ3, (Object) null, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant").n(new C3146c(bVar, 21));
        new X7(interfaceC4269f2, interfaceC4277nQ3, (Object) null, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny").n(new C3146c(bVar, 22));
        new X7(interfaceC4269f2, iVar2.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden").n(new C3146c(new ae.b(), 12));
        tg.b.Q(interfaceC4269f2, new C3322s(iVar2, 1));
        new X7(interfaceC4269f2, iVar2.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke").n(new C3146c(new androidx.fragment.app.X(8), 17));
        AbstractC3772b.Q(interfaceC4269f2, new C3322s(iVar2, 0));
        new X7(interfaceC4269f2, iVar2.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget").n(new C3146c(new a2.k(), 5));
        gc.b.L(interfaceC4269f2, new C3313i(iVar2, 0));
        ad.r rVar2 = new ad.r();
        InterfaceC4277n interfaceC4277nQ4 = iVar2.q();
        new X7(interfaceC4269f2, interfaceC4277nQ4, (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel").n(new C3146c(rVar2, 29));
        new X7(interfaceC4269f2, interfaceC4277nQ4, (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed").n(new C3293D(rVar2, 0));
        r rVar3 = new r(iVar2, 1);
        InterfaceC4277n interfaceC4277nQ5 = iVar2.q();
        new X7(interfaceC4269f2, interfaceC4277nQ5, (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError").n(new C3146c(rVar3, 27));
        new X7(interfaceC4269f2, interfaceC4277nQ5, (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError").n(new com.unity3d.services.core.webview.b(rVar3, 16));
        AbstractC2641B.K(interfaceC4269f2, new C3316l(iVar2, 1));
        AbstractC3935e.N(interfaceC4269f2, new C3319o(iVar2, 1));
        new X7(interfaceC4269f2, iVar2.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded").n(new C3146c(new ad.r(), 7));
        new X7(interfaceC4269f2, iVar2.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled").n(new C3293D(new ae.b(), 14));
        new X7(interfaceC4269f2, iVar2.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported").n(new C3293D(new ae.d(9), 22));
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        this.f39629b.f1939b = this.f39628a.f44186a;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f39629b.f1939b = this.f39628a.f44186a;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        C8.i iVar = this.f39629b;
        if (iVar != null) {
            C2532p c2532p = C3310f.f39658b;
            InterfaceC4269f interfaceC4269f = (InterfaceC4269f) iVar.f1940c;
            android.support.v4.media.session.b.q0(interfaceC4269f, null);
            ic.d.M(interfaceC4269f, null);
            A6.c.M(interfaceC4269f, null);
            xg.g.T(interfaceC4269f, null);
            new X7(interfaceC4269f, new C3306b(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor").n(null);
            C3306b c3306b = new C3306b();
            new X7(interfaceC4269f, c3306b, (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor").n(null);
            new X7(interfaceC4269f, c3306b, (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading").n(null);
            new X7(interfaceC4269f, new C3306b(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor").n(null);
            AbstractC4345a.M(interfaceC4269f, null);
            AbstractC3230e0.x(interfaceC4269f, null);
            C3306b c3306b2 = new C3306b();
            new X7(interfaceC4269f, c3306b2, (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance").n(null);
            new X7(interfaceC4269f, c3306b2, (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData").n(null);
            C3306b c3306b3 = new C3306b();
            new X7(interfaceC4269f, c3306b3, (Object) null, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant").n(null);
            new X7(interfaceC4269f, c3306b3, (Object) null, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny").n(null);
            new X7(interfaceC4269f, new C3306b(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden").n(null);
            tg.b.Q(interfaceC4269f, null);
            new X7(interfaceC4269f, new C3306b(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke").n(null);
            AbstractC3772b.Q(interfaceC4269f, null);
            new X7(interfaceC4269f, new C3306b(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget").n(null);
            gc.b.L(interfaceC4269f, null);
            C3306b c3306b4 = new C3306b();
            new X7(interfaceC4269f, c3306b4, (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel").n(null);
            new X7(interfaceC4269f, c3306b4, (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed").n(null);
            C3306b c3306b5 = new C3306b();
            new X7(interfaceC4269f, c3306b5, (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError").n(null);
            new X7(interfaceC4269f, c3306b5, (Object) null, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError").n(null);
            AbstractC2641B.K(interfaceC4269f, null);
            AbstractC3935e.N(interfaceC4269f, null);
            new X7(interfaceC4269f, new C3306b(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded").n(null);
            new X7(interfaceC4269f, new C3306b(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled").n(null);
            new X7(interfaceC4269f, new C3306b(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported").n(null);
            C3308d c3308d = (C3308d) this.f39629b.f1941d;
            c3308d.f39652g.removeCallbacks(c3308d.f39653h);
            c3308d.f39655j = true;
            this.f39629b = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        this.f39629b.f1939b = (Activity) ((s1) interfaceC3965b).f43896a;
    }
}
