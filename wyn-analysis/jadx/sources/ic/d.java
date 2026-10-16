package ic;

import C8.i;
import E.F;
import Gf.h;
import Gf.p;
import Hf.InterfaceC0602l;
import Hf.e0;
import Hf.k0;
import Hf.u0;
import K.AbstractC0682g;
import K.C0680e;
import L8.l;
import N.C0732k;
import N.C0740o;
import N.P;
import V.e;
import Va.M6;
import Va.X7;
import Z.k;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebView;
import ba.C1521a;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0;
import com.wynauto.wyn.R;
import d0.f;
import e0.C2458j;
import e0.C2459k;
import e0.C2465q;
import e0.InterfaceC2442E;
import e0.r;
import e0.z;
import ef.C2537u;
import ff.AbstractC2641B;
import h0.AbstractC2765c;
import i0.C2826d;
import i0.L;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kd.C3306b;
import kd.C3316l;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.E;
import m9.B;
import mf.C3560b;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p8.m;
import r7.AbstractC3935e;
import u0.M;
import u6.AbstractC4256a;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f36954a;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A() throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.Class<ic.d> r1 = ic.d.class
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3b
            java.lang.String r4 = "getprop ro.build.version.emui"
            java.lang.Process r3 = r3.exec(r4)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3b
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3b
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3b
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3b
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3b
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3b
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            r4.close()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            r4.close()     // Catch: java.io.IOException -> L2a
            return r3
        L2a:
            r2 = move-exception
            java.lang.String r1 = r1.getName()
            android.util.Log.e(r1, r0, r2)
            return r3
        L33:
            r2 = move-exception
            goto L55
        L35:
            r3 = move-exception
            goto L3d
        L37:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L55
        L3b:
            r3 = move-exception
            r4 = r2
        L3d:
            java.lang.String r5 = r1.getName()     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = "Unable to read system property ro.build.version.emui"
            android.util.Log.e(r5, r6, r3)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L54
            r4.close()     // Catch: java.io.IOException -> L4c
            goto L54
        L4c:
            r3 = move-exception
            java.lang.String r1 = r1.getName()
            android.util.Log.e(r1, r0, r3)
        L54:
            return r2
        L55:
            if (r4 == 0) goto L63
            r4.close()     // Catch: java.io.IOException -> L5b
            goto L63
        L5b:
            r3 = move-exception
            java.lang.String r1 = r1.getName()
            android.util.Log.e(r1, r0, r3)
        L63:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.d.A():java.lang.String");
    }

    public static String B(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static String C(String tableName, String triggerType) {
        AbstractC3340k.e(tableName, "tableName");
        AbstractC3340k.e(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    public static final int D(int i5, int i10) {
        return (i5 >> i10) & 31;
    }

    public static void E(String str) {
        if (Log.isLoggable("FIAM.Headless", 3)) {
            Log.d("FIAM.Headless", str);
        }
    }

    public static void F(String str) {
        if (Log.isLoggable("FIAM.Headless", 4)) {
            Log.i("FIAM.Headless", str);
        }
    }

    public static void G(String str) {
        Log.w("FIAM.Headless", str);
    }

    public static String H(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            sb2.append(str.charAt(i5));
            if (str2.length() > i5) {
                sb2.append(str2.charAt(i5));
            }
        }
        return sb2.toString();
    }

    public static long K(Y4.b bVar, int i5, int i10) {
        bVar.A(i5);
        if (bVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iD = bVar.d();
        if ((8388608 & iD) != 0 || ((2096896 & iD) >> 8) != i10 || (iD & 32) == 0 || bVar.q() < 7 || bVar.a() < 7 || (bVar.q() & 16) != 16) {
            return -9223372036854775807L;
        }
        bVar.c(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }

    public static final L L(C2826d c2826d, C0740o c0740o) {
        c0740o.M(1413834416);
        V.d dVarB = e.b(c0740o, 1873274766, new H0.b(c2826d, 1));
        c0740o.M(1068590786);
        L0.b bVar = (L0.b) c0740o.j(M.f46143e);
        float fT = bVar.t(c2826d.f36610b);
        float fT2 = bVar.t(c2826d.f36611c);
        float f10 = c2826d.f36612d;
        float f11 = Float.isNaN(f10) ? fT : f10;
        float f12 = c2826d.f36613e;
        float f13 = Float.isNaN(f12) ? fT2 : f12;
        long j8 = c2826d.f36615g;
        C2465q c2465q = new C2465q(j8);
        int i5 = c2826d.f36616h;
        C2458j c2458j = new C2458j(i5);
        c0740o.M(511388516);
        boolean zE = c0740o.e(c2465q) | c0740o.e(c2458j);
        Object objF = c0740o.F();
        P p10 = C0732k.f7800a;
        if (zE || objF == p10) {
            if (C2465q.b(j8, C2465q.f34380i)) {
                objF = null;
            } else {
                objF = new r(Build.VERSION.SDK_INT >= 29 ? C2459k.f34369a.a(j8, i5) : new PorterDuffColorFilter(z.s(j8), z.u(i5)));
            }
            c0740o.U(objF);
        }
        c0740o.p(false);
        r rVar = (r) objF;
        c0740o.M(-492369756);
        Object objF2 = c0740o.F();
        if (objF2 == p10) {
            objF2 = new L();
            c0740o.U(objF2);
        }
        c0740o.p(false);
        L l10 = (L) objF2;
        l10.f36536f.setValue(new f(H.I(fT, fT2)));
        l10.f36537g.setValue(Boolean.valueOf(c2826d.f36617i));
        l10.f36538h.f36470f.setValue(rVar);
        l10.h(c2826d.f36609a, f11, f13, dVarB, c0740o, 35840);
        c0740o.p(false);
        c0740o.p(false);
        return l10;
    }

    public static void M(InterfaceC4269f binaryMessenger, final C3316l c3316l) {
        i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (c3316l == null || (iVar = c3316l.f39674a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance");
        if (c3316l != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.x
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3316l c3316l2 = c3316l;
                    int i10 = 1;
                    int i11 = 0;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3316l2.f39674a.f1941d).a(((Long) obj3).longValue(), CookieManager.getInstance());
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c3316l2.getClass();
                                cookieManager.setCookie(str, str2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            C3328y c3328y = new C3328y(c1521a, i11);
                            c3316l2.getClass();
                            ((CookieManager) obj7).removeAllCookies(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i10));
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c3316l2.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie");
        if (c3316l != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: kd.x
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3316l c3316l2 = c3316l;
                    int i102 = 1;
                    int i11 = 0;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3316l2.f39674a.f1941d).a(((Long) obj3).longValue(), CookieManager.getInstance());
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c3316l2.getClass();
                                cookieManager.setCookie(str, str2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            C3328y c3328y = new C3328y(c1521a, i11);
                            c3316l2.getClass();
                            ((CookieManager) obj7).removeAllCookies(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c3316l2.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies");
        if (c3316l != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: kd.x
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3316l c3316l2 = c3316l;
                    int i102 = 1;
                    int i112 = 0;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3316l2.f39674a.f1941d).a(((Long) obj3).longValue(), CookieManager.getInstance());
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c3316l2.getClass();
                                cookieManager.setCookie(str, str2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3316l2.getClass();
                            ((CookieManager) obj7).removeAllCookies(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c3316l2.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies");
        if (c3316l == null) {
            x75.n(null);
        } else {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: kd.x
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3316l c3316l2 = c3316l;
                    int i102 = 1;
                    int i112 = 0;
                    switch (i12) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3316l2.f39674a.f1941d).a(((Long) obj3).longValue(), CookieManager.getInstance());
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c3316l2.getClass();
                                cookieManager.setCookie(str, str2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3316l2.getClass();
                            ((CookieManager) obj7).removeAllCookies(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c3316l2.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
                    }
                }
            });
        }
    }

    public static ArrayList N(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static Gf.e a(int i5, int i10, Gf.a aVar) {
        if ((i10 & 2) != 0) {
            aVar = Gf.a.f4780a;
        }
        if (i5 == -2) {
            if (aVar != Gf.a.f4780a) {
                return new p(1, aVar);
            }
            Gf.i.f4824J8.getClass();
            return new Gf.e(h.f4823b);
        }
        if (i5 != -1) {
            return i5 != 0 ? i5 != Integer.MAX_VALUE ? aVar == Gf.a.f4780a ? new Gf.e(i5) : new p(i5, aVar) : new Gf.e(com.google.android.gms.common.api.f.API_PRIORITY_OTHER) : aVar == Gf.a.f4780a ? new Gf.e(0) : new p(1, aVar);
        }
        if (aVar == Gf.a.f4780a) {
            return new p(1, Gf.a.f4781b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(i0.H r20, java.util.Map r21, N.C0740o r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.d.b(i0.H, java.util.Map, N.o, int, int):void");
    }

    public static final e0 c(int i5, Kd.a scope, InterfaceC0602l interfaceC0602l) {
        AbstractC3340k.e(scope, "scope");
        E e7 = new E();
        e7.f39738a = i5;
        E e10 = new E();
        e10.f39738a = i5;
        return k0.x(k0.j(new x0(e10, interfaceC0602l, e7, null)), scope, new u0(), new C2537u(i5));
    }

    public static final V.d d(Z.d dVar, F f10, long j8, long j10, long j11, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z zVar, D d3, C0740o c0740o, int i5) {
        F f11;
        c0740o.M(1043664790);
        Z.d dVar2 = (i5 & 1) != 0 ? Z.a.f16902c : dVar;
        if ((i5 & 2) != 0) {
            float f12 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31057a;
            f11 = new F(f12, f12, f12, f12);
        } else {
            f11 = f10;
        }
        long jB = (i5 & 4) != 0 ? ((C0680e) c0740o.j(AbstractC0682g.f6260a)).b() : j8;
        long j12 = (i5 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31059c : j10;
        long j13 = (i5 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31058b : j11;
        V.d dVarB = AbstractC2641B.b(dVar2, f11, jB, j12, j13, (i5 & 32) != 0 ? f(null, 0L, 0L, c0740o, 15) : zVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32406b, (i5 & 128) != 0 ? null : d3, c0740o);
        c0740o.p(false);
        return dVarB;
    }

    public static final Context e(Context context) {
        if (context != null) {
            gc.b.f35863b = context.getApplicationContext();
        }
        Context context2 = gc.b.f35863b;
        if (context2 != null) {
            return context2;
        }
        AbstractC3340k.m(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        throw null;
    }

    public static final x f(AbstractC2765c abstractC2765c, long j8, long j10, C0740o c0740o, int i5) {
        c0740o.M(-571269297);
        if ((i5 & 1) != 0) {
            abstractC2765c = AbstractC2641B.H(R.drawable.ic_round_skip_next_24, c0740o);
        }
        AbstractC2765c abstractC2765c2 = abstractC2765c;
        if ((i5 & 2) != 0) {
            j8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31059c;
        }
        long j11 = j8;
        H.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31061e;
        if ((i5 & 8) != 0) {
            j10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31060d;
        }
        x xVar = new x(abstractC2765c2, "Skip", j11, dVar, j10);
        c0740o.p(false);
        return xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008c -> B:25:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(java.util.List r6, u1.C4236y r7, lf.AbstractC3464c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof u1.C4217f
            if (r0 == 0) goto L13
            r0 = r8
            u1.f r0 = (u1.C4217f) r0
            int r1 = r0.f46462d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46462d = r1
            goto L18
        L13:
            u1.f r0 = new u1.f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f46461c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f46462d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.util.Iterator r6 = r0.f46460b
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.io.Serializable r7 = r0.f46459a
            kotlin.jvm.internal.G r7 = (kotlin.jvm.internal.G) r7
            Fe.e.U(r8)     // Catch: java.lang.Throwable -> L32
            goto L69
        L32:
            r8 = move-exception
            goto L85
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.io.Serializable r6 = r0.f46459a
            java.util.List r6 = (java.util.List) r6
            Fe.e.U(r8)
            goto L5e
        L44:
            Fe.e.U(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            u1.h r2 = new u1.h
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f46459a = r8
            r0.f46462d = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5d
            goto L9a
        L5d:
            r6 = r8
        L5e:
            kotlin.jvm.internal.G r7 = new kotlin.jvm.internal.G
            r7.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L69:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L92
            java.lang.Object r8 = r6.next()
            tf.l r8 = (tf.l) r8
            r0.f46459a = r7     // Catch: java.lang.Throwable -> L32
            r2 = r6
            java.util.Iterator r2 = (java.util.Iterator) r2     // Catch: java.lang.Throwable -> L32
            r0.f46460b = r2     // Catch: java.lang.Throwable -> L32
            r0.f46462d = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L32
            if (r8 != r1) goto L69
            goto L9a
        L85:
            java.lang.Object r2 = r7.f39740a
            if (r2 != 0) goto L8c
            r7.f39740a = r8
            goto L69
        L8c:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            Fe.b.d(r2, r8)
            goto L69
        L92:
            java.lang.Object r6 = r7.f39740a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L9b
            ef.C r1 = ef.C2515C.f34653a
        L9a:
            return r1
        L9b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.d.g(java.util.List, u1.y, lf.c):java.lang.Object");
    }

    public static final k k(k kVar, InterfaceC2442E shape) {
        AbstractC3340k.e(kVar, "<this>");
        AbstractC3340k.e(shape, "shape");
        return z.k(kVar, shape, 59391);
    }

    public static final k l(k kVar) {
        AbstractC3340k.e(kVar, "<this>");
        return z.k(kVar, null, 61439);
    }

    public static L8.b m(String str, String str2) {
        Y9.a aVar = new Y9.a(str, str2);
        L8.a aVarB = L8.b.b(Y9.a.class);
        aVarB.f6985c = 1;
        aVarB.f6989g = new F5.c(aVar);
        return aVarB.d();
    }

    public static void n(String str, String str2, Object obj) {
        String strB = B(str);
        if (Log.isLoggable(strB, 3)) {
            Log.d(strB, String.format(str2, obj));
        }
    }

    public static void s(Exception exc, String str, String str2) {
        String strB = B(str);
        if (Log.isLoggable(strB, 6)) {
            Log.e(strB, str2, exc);
        }
    }

    public static final C3560b t(Enum[] entries) {
        AbstractC3340k.e(entries, "entries");
        return new C3560b(entries);
    }

    public static L8.b u(String str, B b5) {
        L8.a aVarB = L8.b.b(Y9.a.class);
        aVarB.f6985c = 1;
        aVarB.c(l.d(Context.class));
        aVarB.f6989g = new A5.h(25, str, b5);
        return aVarB.d();
    }

    public static Intent x(String str) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:" + str));
        return intent;
    }

    public static String y() {
        return "Display_id:" + Build.DISPLAY + "MODEL:" + Build.MODEL + "MANUFACTURER:" + Build.MANUFACTURER + "PRODUCT:" + Build.PRODUCT;
    }

    public static String z() {
        try {
            return A();
        } catch (Exception unused) {
            return "";
        }
    }

    public abstract void I(p8.l lVar, p8.l lVar2);

    public abstract void J(p8.l lVar, Thread thread);

    public abstract boolean h(m mVar, p8.c cVar, p8.c cVar2);

    public abstract boolean i(m mVar, Object obj, Object obj2);

    public abstract boolean j(m mVar, p8.l lVar, p8.l lVar2);

    public N1.B o(B2.a aVar) {
        ByteBuffer byteBuffer = aVar.f11358e;
        byteBuffer.getClass();
        Q1.k.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return p(aVar, byteBuffer);
    }

    public abstract N1.B p(B2.a aVar, ByteBuffer byteBuffer);

    public W5.c q(W5.e eVar) {
        ByteBuffer byteBuffer = eVar.f4917d;
        byteBuffer.getClass();
        AbstractC4256a.e(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.h(Integer.MIN_VALUE)) {
            return null;
        }
        return r(eVar, byteBuffer);
    }

    public abstract W5.c r(W5.e eVar, ByteBuffer byteBuffer);

    public abstract p8.c v(m mVar);

    public abstract p8.l w(m mVar);
}
