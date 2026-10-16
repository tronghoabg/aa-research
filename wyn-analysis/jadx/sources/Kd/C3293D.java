package kd;

import Va.M6;
import android.util.Log;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import ba.C1521a;
import java.io.IOException;
import java.util.List;
import k8.InterfaceC3199h;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import ld.InterfaceC3461c;
import r7.AbstractC3935e;
import uc.InterfaceC4265b;
import uc.InterfaceC4266c;

/* renamed from: kd.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C3293D implements InterfaceC4265b, InterfaceC4266c, jg.a, InterfaceC3461c, jg.b, InterfaceC3199h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39564a;

    public /* synthetic */ C3293D(int i5) {
        this.f39564a = i5;
    }

    @Override // jg.a
    public void accept(Object obj) throws IOException {
        throw ((IOException) obj);
    }

    @Override // k8.InterfaceC3199h
    public Object apply(Object obj) {
        P2.a aVar = (P2.a) obj;
        switch (this.f39564a) {
            case 28:
                return Long.valueOf(aVar.f9056b);
            default:
                return Long.valueOf(aVar.f9057c);
        }
    }

    @Override // ld.InterfaceC3461c
    public boolean b(View view) {
        return view.hasFocus();
    }

    @Override // uc.InterfaceC4266c
    public void c(Object obj) {
        switch (this.f39564a) {
            case 1:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", "");
                    int i5 = C3311g.f39660e;
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i10 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i11 = C3311g.f39660e;
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", "");
                    int i12 = P.f39597h;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i13 = P.f39597h;
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i14 = P.f39597h;
                        break;
                    }
                }
            case 3:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", "");
                    int i15 = P.f39597h;
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i16 = P.f39597h;
                        break;
                    } else {
                        Object obj6 = list3.get(0);
                        AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i17 = P.f39597h;
                        break;
                    }
                }
            case 4:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", "");
                    int i18 = P.f39597h;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i19 = P.f39597h;
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i20 = P.f39597h;
                        break;
                    }
                }
            case 5:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", "");
                    int i21 = P.f39597h;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i22 = P.f39597h;
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i23 = P.f39597h;
                        break;
                    }
                }
            case 6:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", "");
                    int i24 = P.f39597h;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i25 = P.f39597h;
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i26 = P.f39597h;
                        break;
                    }
                }
            case 7:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", "");
                    int i27 = P.f39597h;
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i28 = P.f39597h;
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i29 = P.f39597h;
                        break;
                    }
                }
            case 8:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", "");
                    int i30 = P.f39597h;
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i31 = P.f39597h;
                        break;
                    } else {
                        Object obj16 = list8.get(0);
                        AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i32 = P.f39597h;
                        break;
                    }
                }
            case 9:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", "");
                    int i33 = C3311g.f39660e;
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i34 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj18 = list9.get(0);
                        AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i35 = C3311g.f39660e;
                        break;
                    }
                }
            case 10:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance'.", "");
                    int i36 = C3311g.f39660e;
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        int i37 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj20 = list10.get(0);
                        AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj20, (String) obj21, (String) list10.get(2)));
                        int i38 = C3311g.f39660e;
                        break;
                    }
                }
            case 11:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", "");
                    int i39 = C3311g.f39660e;
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        int i40 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj22 = list11.get(0);
                        AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj22, (String) obj23, (String) list11.get(2)));
                        int i41 = C3311g.f39660e;
                        break;
                    }
                }
            case 12:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", "");
                    int i42 = C3311g.f39660e;
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        int i43 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj24 = list12.get(0);
                        AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj24, (String) obj25, (String) list12.get(2)));
                        int i44 = C3311g.f39660e;
                        break;
                    }
                }
            case 13:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", "");
                    int i45 = C3311g.f39660e;
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        int i46 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj26 = list13.get(0);
                        AbstractC3340k.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj26, (String) obj27, (String) list13.get(2)));
                        int i47 = C3311g.f39660e;
                        break;
                    }
                }
            case 14:
            case 16:
            case 22:
            default:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", "");
                    int i48 = C3311g.f39660e;
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        int i49 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj28 = list14.get(0);
                        AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        AbstractC3340k.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i50 = C3311g.f39660e;
                        break;
                    }
                }
            case 15:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", "");
                    int i51 = C3311g.f39660e;
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        int i52 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj30 = list15.get(0);
                        AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        AbstractC3340k.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj30, (String) obj31, (String) list15.get(2)));
                        int i53 = C3311g.f39660e;
                        break;
                    }
                }
            case 17:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", "");
                    int i54 = C3311g.f39660e;
                    break;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        int i55 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj32 = list16.get(0);
                        AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        AbstractC3340k.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj32, (String) obj33, (String) list16.get(2)));
                        int i56 = C3311g.f39660e;
                        break;
                    }
                }
            case 18:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", "");
                    int i57 = a0.f39640d;
                    break;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        int i58 = a0.f39640d;
                        break;
                    } else {
                        Object obj34 = list17.get(0);
                        AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list17.get(1);
                        AbstractC3340k.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj34, (String) obj35, (String) list17.get(2)));
                        int i59 = a0.f39640d;
                        break;
                    }
                }
            case 19:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", "");
                    int i60 = C3311g.f39660e;
                    break;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        int i61 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj36 = list18.get(0);
                        AbstractC3340k.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list18.get(1);
                        AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj36, (String) obj37, (String) list18.get(2)));
                        int i62 = C3311g.f39660e;
                        break;
                    }
                }
            case 20:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat'.", "");
                    int i63 = T.f39613c;
                    break;
                } else {
                    List list19 = (List) obj;
                    if (list19.size() <= 1) {
                        int i64 = T.f39613c;
                        break;
                    } else {
                        Object obj38 = list19.get(0);
                        AbstractC3340k.c(obj38, "null cannot be cast to non-null type kotlin.String");
                        Object obj39 = list19.get(1);
                        AbstractC3340k.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj38, (String) obj39, (String) list19.get(2)));
                        int i65 = T.f39613c;
                        break;
                    }
                }
            case 21:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", "");
                    int i66 = W.f39625c;
                    break;
                } else {
                    List list20 = (List) obj;
                    if (list20.size() <= 1) {
                        int i67 = W.f39625c;
                        break;
                    } else {
                        Object obj40 = list20.get(0);
                        AbstractC3340k.c(obj40, "null cannot be cast to non-null type kotlin.String");
                        Object obj41 = list20.get(1);
                        AbstractC3340k.c(obj41, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj40, (String) obj41, (String) list20.get(2)));
                        int i68 = W.f39625c;
                        break;
                    }
                }
            case 23:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", "");
                    int i69 = C3311g.f39660e;
                    break;
                } else {
                    List list21 = (List) obj;
                    if (list21.size() <= 1) {
                        int i70 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj42 = list21.get(0);
                        AbstractC3340k.c(obj42, "null cannot be cast to non-null type kotlin.String");
                        Object obj43 = list21.get(1);
                        AbstractC3340k.c(obj43, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj42, (String) obj43, (String) list21.get(2)));
                        int i71 = C3311g.f39660e;
                        break;
                    }
                }
        }
    }

    @Override // uc.InterfaceC4265b
    public void e(Object obj, C1521a c1521a) {
        List listD;
        List listD2;
        List listD3;
        List listD4;
        switch (this.f39564a) {
            case 0:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                AbstractC3340k.c(obj2, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj2).proceed();
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
                break;
            case 14:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj3 = list.get(0);
                AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj3;
                Object obj4 = list.get(1);
                AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    ae.b.f(webSettings, ((Boolean) obj4).booleanValue());
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
                break;
            case 16:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj5).deleteAllData();
                    listD3 = AbstractC3935e.C(null);
                } catch (Throwable th3) {
                    if (th3 instanceof C3305a) {
                        C3305a c3305a3 = th3;
                        listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                    } else {
                        listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                    }
                }
                c1521a.c(listD3);
                break;
            default:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj6 = ((List) obj).get(0);
                AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                try {
                    listD4 = AbstractC3935e.C(Boolean.valueOf(com.moloco.sdk.internal.publisher.H.b0((String) obj6)));
                } catch (Throwable th4) {
                    if (th4 instanceof C3305a) {
                        C3305a c3305a4 = th4;
                        listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                    } else {
                        listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                    }
                }
                c1521a.c(listD4);
                break;
        }
    }

    @Override // jg.b
    public Object h(lg.b bVar) {
        return lg.a.f40284a;
    }

    public /* synthetic */ C3293D(Object obj, int i5) {
        this.f39564a = i5;
    }
}
