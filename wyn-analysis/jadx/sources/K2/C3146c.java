package k2;

import Va.M6;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import ba.C1521a;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import k8.InterfaceC3199h;
import ka.AbstractC3256n;
import kd.C3305a;
import kd.C3311g;
import kd.EnumC3301L;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import r7.AbstractC3935e;
import uc.InterfaceC4265b;
import uc.InterfaceC4266c;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3146c implements InterfaceC3199h, Q1.c, InterfaceC4266c, InterfaceC4265b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39025a;

    public /* synthetic */ C3146c(int i5) {
        this.f39025a = i5;
    }

    @Override // Q1.c
    public void accept(Object obj) {
        ((a0) obj).f39024b.getClass();
    }

    @Override // k8.InterfaceC3199h
    public Object apply(Object obj) {
        switch (this.f39025a) {
            case 0:
                return ((s2.m) obj).h().getClass().getSimpleName();
            case 1:
                n0 n0VarJ = ((F) obj).j();
                return AbstractC3409K.j(AbstractC3437s.v(n0VarJ.f39129b, new C3146c(3)));
            default:
                return Integer.valueOf(((N1.O) obj).f8075c);
        }
    }

    @Override // uc.InterfaceC4266c
    public void c(Object obj) {
        switch (this.f39025a) {
            case 4:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", "");
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
            case 5:
            case 7:
            case 12:
            case 17:
            case 21:
            case 22:
            default:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", "");
                    int i12 = C3311g.f39660e;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i13 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i14 = C3311g.f39660e;
                        break;
                    }
                }
            case 6:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", "");
                    int i15 = C3311g.f39660e;
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i16 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj6 = list3.get(0);
                        AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i17 = C3311g.f39660e;
                        break;
                    }
                }
            case 8:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", "");
                    int i18 = C3311g.f39660e;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i19 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i20 = C3311g.f39660e;
                        break;
                    }
                }
            case 9:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", "");
                    int i21 = C3311g.f39660e;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i22 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i23 = C3311g.f39660e;
                        break;
                    }
                }
            case 10:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", "");
                    int i24 = C3311g.f39660e;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i25 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i26 = C3311g.f39660e;
                        break;
                    }
                }
            case 11:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", "");
                    int i27 = C3311g.f39660e;
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i28 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i29 = C3311g.f39660e;
                        break;
                    }
                }
            case 13:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", "");
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj16 = list8.get(0);
                        AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj16, (String) obj17, (String) list8.get(2)));
                        break;
                    }
                }
                break;
            case 14:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", "");
                    int i30 = C3311g.f39660e;
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i31 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj18 = list9.get(0);
                        AbstractC3340k.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i32 = C3311g.f39660e;
                        break;
                    }
                }
            case 15:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", "");
                    int i33 = C3311g.f39660e;
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        int i34 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj20 = list10.get(0);
                        AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj20, (String) obj21, (String) list10.get(2)));
                        int i35 = C3311g.f39660e;
                        break;
                    }
                }
            case 16:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", "");
                    int i36 = C3311g.f39660e;
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        int i37 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj22 = list11.get(0);
                        AbstractC3340k.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj22, (String) obj23, (String) list11.get(2)));
                        int i38 = C3311g.f39660e;
                        break;
                    }
                }
            case 18:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", "");
                    int i39 = C3311g.f39660e;
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        int i40 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj24 = list12.get(0);
                        AbstractC3340k.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj24, (String) obj25, (String) list12.get(2)));
                        int i41 = C3311g.f39660e;
                        break;
                    }
                }
            case 19:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", "");
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj26 = list13.get(0);
                        AbstractC3340k.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj26, (String) obj27, (String) list13.get(2)));
                        break;
                    }
                }
                break;
            case 20:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", "");
                    int i42 = C3311g.f39660e;
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        int i43 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj28 = list14.get(0);
                        AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        AbstractC3340k.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i44 = C3311g.f39660e;
                        break;
                    }
                }
            case 23:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", "");
                    int i45 = C3311g.f39660e;
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        int i46 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj30 = list15.get(0);
                        AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        AbstractC3340k.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj30, (String) obj31, (String) list15.get(2)));
                        int i47 = C3311g.f39660e;
                        break;
                    }
                }
            case 24:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", "");
                    int i48 = C3311g.f39660e;
                    break;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        int i49 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj32 = list16.get(0);
                        AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        AbstractC3340k.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj32, (String) obj33, (String) list16.get(2)));
                        int i50 = C3311g.f39660e;
                        break;
                    }
                }
            case 25:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", "");
                    int i51 = C3311g.f39660e;
                    break;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        int i52 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj34 = list17.get(0);
                        AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list17.get(1);
                        AbstractC3340k.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj34, (String) obj35, (String) list17.get(2)));
                        int i53 = C3311g.f39660e;
                        break;
                    }
                }
            case 26:
                if (!(obj instanceof List)) {
                    AbstractC3256n.o("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", "");
                    int i54 = C3311g.f39660e;
                    break;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        int i55 = C3311g.f39660e;
                        break;
                    } else {
                        Object obj36 = list18.get(0);
                        AbstractC3340k.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list18.get(1);
                        AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        Fe.e.z(new C3305a((String) obj36, (String) obj37, (String) list18.get(2)));
                        int i56 = C3311g.f39660e;
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
        List listD5;
        List listD6;
        List listD7;
        List listD8;
        switch (this.f39025a) {
            case 5:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                AbstractC3340k.c(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
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
            case 7:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                AbstractC3340k.c(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        listD2 = AbstractC3935e.C(((Certificate) obj3).getEncoded());
                    } catch (CertificateEncodingException e7) {
                        throw new RuntimeException(e7);
                    }
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
            case 12:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
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
                return;
            case 17:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj5 = list.get(0);
                AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj5;
                Object obj6 = list.get(1);
                AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj6;
                Object obj7 = list.get(2);
                AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                Object obj8 = list.get(3);
                AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, zBooleanValue, ((Boolean) obj8).booleanValue());
                    listD4 = AbstractC3935e.C(null);
                } catch (Throwable th4) {
                    if (th4 instanceof C3305a) {
                        C3305a c3305a4 = th4;
                        listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                    } else {
                        listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                    }
                }
                c1521a.c(listD4);
                return;
            case 21:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj9 = list2.get(0);
                AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj9;
                Object obj10 = list2.get(1);
                AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj10).toArray(new String[0]));
                    listD5 = AbstractC3935e.C(null);
                } catch (Throwable th5) {
                    if (th5 instanceof C3305a) {
                        C3305a c3305a5 = th5;
                        listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                    } else {
                        listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                    }
                }
                c1521a.c(listD5);
                return;
            case 22:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj11 = ((List) obj).get(0);
                AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj11).deny();
                    listD6 = AbstractC3935e.C(null);
                } catch (Throwable th6) {
                    if (th6 instanceof C3305a) {
                        C3305a c3305a6 = th6;
                        listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                    } else {
                        listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                    }
                }
                c1521a.c(listD6);
                return;
            case 27:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj12 = ((List) obj).get(0);
                AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj12).getPrimaryError();
                    listD7 = AbstractC3935e.C(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? EnumC3301L.f39588i : EnumC3301L.f39585f : EnumC3301L.f39582c : EnumC3301L.f39587h : EnumC3301L.f39584e : EnumC3301L.f39583d : EnumC3301L.f39586g);
                } catch (Throwable th7) {
                    if (th7 instanceof C3305a) {
                        C3305a c3305a7 = th7;
                        listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                    } else {
                        listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                    }
                }
                c1521a.c(listD7);
                return;
            default:
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj13 = ((List) obj).get(0);
                AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj13).cancel();
                    listD8 = AbstractC3935e.C(null);
                } catch (Throwable th8) {
                    if (th8 instanceof C3305a) {
                        C3305a c3305a8 = th8;
                        listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                    } else {
                        listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                    }
                }
                c1521a.c(listD8);
                return;
        }
    }

    public /* synthetic */ C3146c(Object obj, int i5) {
        this.f39025a = i5;
    }
}
