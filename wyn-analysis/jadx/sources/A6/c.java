package A6;

import A.AbstractC0213f;
import A.AbstractC0226t;
import A.C0212e;
import A.X;
import A7.AbstractC0279p0;
import Bf.r;
import E.AbstractC0419i;
import E.AbstractC0426p;
import E.C0415e;
import E.C0416f;
import E.J;
import E.L;
import E5.Q;
import E5.o0;
import Jd.A;
import Jd.AbstractC0668b;
import Jd.x;
import K.I;
import N.C;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.L0;
import N.P;
import N.V;
import N.Y;
import U8.v0;
import Va.M6;
import Va.X7;
import a.AbstractC1304a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1457v;
import ba.C1521a;
import c0.C1542g;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.internal.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2041b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C2077k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import com.unity3d.services.UnityAdsConstants;
import e0.C2465q;
import ef.C2515C;
import ef.C2537u;
import ef.InterfaceC2525i;
import g0.InterfaceC2663d;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kd.C3306b;
import kd.C3322s;
import kotlin.jvm.internal.AbstractC3340k;
import l8.j0;
import lf.AbstractC3471j;
import n1.InterfaceC3572f;
import n8.AbstractC3605d;
import p9.C3789j;
import p9.EnumC3788i;
import r0.InterfaceC3909n;
import r7.AbstractC3935e;
import t0.C4053a;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import t0.t;
import t0.y;
import tf.p;
import u0.InterfaceC4193p0;
import u0.M;
import u6.AbstractC4256a;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;

/* loaded from: classes3.dex */
public abstract class c implements InterfaceC3572f {

    /* renamed from: a, reason: collision with root package name */
    public static Class f386a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f387b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f388c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f389d;

    public static void A(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return;
        }
        s(str, objArr);
        throw null;
    }

    public static final boolean B(z0.j jVar) {
        AbstractC3340k.e(jVar, "<this>");
        return (jVar.f48305f == null && jVar.f48303d == null && jVar.f48302c == null) ? false : true;
    }

    public static boolean C(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            String[] strArr = (Build.VERSION.SDK_INT < 33 ? packageManager.getPackageInfo(packageName, 4096) : packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L))).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return false;
    }

    public static final boolean D(C1542g c1542g) {
        t tVar;
        AbstractC3340k.e(c1542g, "<this>");
        y yVar = c1542g.k;
        return yVar != null && (tVar = yVar.f45561e) != null && tVar.f45528s && tVar.r();
    }

    public static int F(int i5) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i5 <= 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "x (", ") must be > 0"));
        }
        switch (AbstractC3605d.f40941a[roundingMode.ordinal()]) {
            case 1:
                Ba.c.m((i5 > 0) & (((i5 + (-1)) & i5) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i5 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i5);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i5))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i5);
    }

    public static boolean G(C3789j c3789j, s9.d dVar) {
        if (c3789j != null) {
            if (c3789j.f43373c.equals(dVar.f45367a)) {
                EnumC3788i enumC3788i = EnumC3788i.ARRAY_CONTAINS;
                EnumC3788i enumC3788i2 = c3789j.f43371a;
                if (AbstractC0213f.b(dVar.f45368b, 3) == (enumC3788i2.equals(enumC3788i) || enumC3788i2.equals(EnumC3788i.ARRAY_CONTAINS_ANY))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean H(p9.t tVar, s9.d dVar) {
        if (!tVar.f43407b.equals(dVar.f45367a)) {
            return false;
        }
        int i5 = dVar.f45368b;
        boolean zB = AbstractC0213f.b(i5, 1);
        int i10 = tVar.f43406a;
        return (zB && AbstractC0213f.b(i10, 1)) || (AbstractC0213f.b(i5, 2) && AbstractC0213f.b(i10, 2));
    }

    public static int I(int i5) {
        int i10 = i5 % 65536;
        return i10 >= 0 ? i10 : i10 + 65536;
    }

    public static Long J(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static void M(InterfaceC4269f binaryMessenger, final C3322s c3322s) {
        C8.i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (c3322s == null || (iVar = c3322s.f39693a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor");
        if (c3322s != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i10 = 2;
                    int i11 = 1;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i11);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i10));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.settings");
        if (c3322s != null) {
            final int i10 = 2;
            x73.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i11 = 1;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i11);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData");
        if (c3322s != null) {
            final int i11 = 6;
            x74.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl");
        if (c3322s != null) {
            final int i12 = 7;
            x75.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i12) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl");
        if (c3322s != null) {
            final int i13 = 8;
            x76.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i13) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl");
        if (c3322s != null) {
            final int i14 = 9;
            x77.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i14) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x77.n(null);
        }
        X7 x78 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl");
        if (c3322s != null) {
            final int i15 = 10;
            x78.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i15) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x78.n(null);
        }
        X7 x79 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack");
        if (c3322s != null) {
            final int i16 = 12;
            x79.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i16) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x79.n(null);
        }
        X7 x710 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward");
        if (c3322s != null) {
            final int i17 = 13;
            x710.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i17) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x710.n(null);
        }
        X7 x711 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack");
        if (c3322s != null) {
            final int i18 = 14;
            x711.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i18) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x711.n(null);
        }
        X7 x712 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward");
        if (c3322s != null) {
            final int i19 = 11;
            x712.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i19) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x712.n(null);
        }
        X7 x713 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.reload");
        if (c3322s != null) {
            final int i20 = 15;
            x713.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i20) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x713.n(null);
        }
        X7 x714 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache");
        if (c3322s != null) {
            final int i21 = 16;
            x714.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i21) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x714.n(null);
        }
        X7 x715 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript");
        if (c3322s != null) {
            final int i22 = 17;
            x715.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i22) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x715.n(null);
        }
        X7 x716 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle");
        if (c3322s != null) {
            final int i23 = 18;
            x716.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i23) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x716.n(null);
        }
        X7 x717 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled");
        if (c3322s != null) {
            final int i24 = 19;
            x717.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i24) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x717.n(null);
        }
        X7 x718 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient");
        if (c3322s != null) {
            final int i25 = 20;
            x718.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i25) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x718.n(null);
        }
        X7 x719 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel");
        if (c3322s != null) {
            final int i26 = 21;
            x719.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i26) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x719.n(null);
        }
        X7 x720 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel");
        if (c3322s != null) {
            final int i27 = 22;
            x720.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i27) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x720.n(null);
        }
        X7 x721 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener");
        if (c3322s != null) {
            final int i28 = 1;
            x721.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i28) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x721.n(null);
        }
        X7 x722 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient");
        if (c3322s != null) {
            final int i29 = 3;
            x722.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i29) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x722.n(null);
        }
        X7 x723 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor");
        if (c3322s != null) {
            final int i30 = 4;
            x723.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i30) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        } else {
            x723.n(null);
        }
        X7 x724 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy");
        if (c3322s == null) {
            x724.n(null);
        } else {
            final int i31 = 5;
            x724.n(new InterfaceC4265b() { // from class: kd.I
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    List listD22;
                    C3322s c3322s2 = c3322s;
                    int i102 = 2;
                    int i112 = 1;
                    switch (i31) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj3).longValue(), c3322s2.a());
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
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj4;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c3322s2.getClass();
                                webView.setDownloadListener(downloadListener);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C3308d) c3322s2.f39693a.f1941d).a(((Long) obj6).longValue(), webView2.getSettings());
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj7;
                            P p10 = (P) list3.get(1);
                            try {
                                c3322s2.getClass();
                                webView3.setWebChromeClient(p10);
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
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj9).longValue();
                            try {
                                c3322s2.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
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
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj10;
                            try {
                                c3322s2.getClass();
                                webView5.destroy();
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
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj11 = list5.get(0);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj11;
                            Object obj12 = list5.get(1);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj12;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c3322s2.getClass();
                                webView6.loadData(str, str2, str3);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj13 = list6.get(0);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj13;
                            String str4 = (String) list6.get(1);
                            Object obj14 = list6.get(2);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj14;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c3322s2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
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
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj15 = list7.get(0);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj15;
                            Object obj16 = list7.get(1);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list7.get(2);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj17;
                            try {
                                c3322s2.getClass();
                                webView8.loadUrl(str9, map);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj18 = list8.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj18;
                            Object obj19 = list8.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list8.get(2);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj20;
                            try {
                                c3322s2.getClass();
                                webView9.postUrl(str10, bArr);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj21;
                            try {
                                c3322s2.getClass();
                                listD11 = AbstractC3935e.C(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj22;
                            try {
                                c3322s2.getClass();
                                webView11.goForward();
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj23;
                            try {
                                c3322s2.getClass();
                                listD13 = AbstractC3935e.C(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj24;
                            try {
                                c3322s2.getClass();
                                listD14 = AbstractC3935e.C(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj25;
                            try {
                                c3322s2.getClass();
                                webView14.goBack();
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj26;
                            try {
                                c3322s2.getClass();
                                webView15.reload();
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        case 16:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj27 = list9.get(0);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj27;
                            Object obj28 = list9.get(1);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj28).booleanValue();
                            try {
                                c3322s2.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                        case 17:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj29 = list10.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj30 = list10.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type kotlin.String");
                            C3328y c3328y = new C3328y(c1521a, i112);
                            c3322s2.getClass();
                            ((WebView) obj29).evaluateJavascript((String) obj30, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c3328y, i102));
                            break;
                        case 18:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj31;
                            try {
                                c3322s2.getClass();
                                listD18 = AbstractC3935e.C(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C3305a) {
                                    C3305a c3305a18 = th18;
                                    listD18 = AbstractC3935e.D(c3305a18.f39637a, c3305a18.f39638b, c3305a18.f39639c);
                                } else {
                                    listD18 = AbstractC3935e.D(th18.getClass().getSimpleName(), th18.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            c1521a.c(listD18);
                            break;
                        case 19:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj32 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj32).booleanValue();
                            try {
                                c3322s2.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD19 = AbstractC3935e.C(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C3305a) {
                                    C3305a c3305a19 = th19;
                                    listD19 = AbstractC3935e.D(c3305a19.f39637a, c3305a19.f39638b, c3305a19.f39639c);
                                } else {
                                    listD19 = AbstractC3935e.D(th19.getClass().getSimpleName(), th19.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            c1521a.c(listD19);
                            break;
                        case 20:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj33 = list11.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj33;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c3322s2.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD20 = AbstractC3935e.C(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C3305a) {
                                    C3305a c3305a20 = th20;
                                    listD20 = AbstractC3935e.D(c3305a20.f39637a, c3305a20.f39638b, c3305a20.f39639c);
                                } else {
                                    listD20 = AbstractC3935e.D(th20.getClass().getSimpleName(), th20.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            c1521a.c(listD20);
                            break;
                        case 21:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj34 = list12.get(0);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj34;
                            Object obj35 = list12.get(1);
                            AbstractC3340k.c(obj35, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C3323t c3323t = (C3323t) obj35;
                            try {
                                c3322s2.getClass();
                                webView19.addJavascriptInterface(c3323t, c3323t.f39694a);
                                listD21 = AbstractC3935e.C(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C3305a) {
                                    C3305a c3305a21 = th21;
                                    listD21 = AbstractC3935e.D(c3305a21.f39637a, c3305a21.f39638b, c3305a21.f39639c);
                                } else {
                                    listD21 = AbstractC3935e.D(th21.getClass().getSimpleName(), th21.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            c1521a.c(listD21);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj36 = list13.get(0);
                            AbstractC3340k.c(obj36, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj36;
                            Object obj37 = list13.get(1);
                            AbstractC3340k.c(obj37, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj37;
                            try {
                                c3322s2.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD22 = AbstractC3935e.C(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C3305a) {
                                    C3305a c3305a22 = th22;
                                    listD22 = AbstractC3935e.D(c3305a22.f39637a, c3305a22.f39638b, c3305a22.f39639c);
                                } else {
                                    listD22 = AbstractC3935e.D(th22.getClass().getSimpleName(), th22.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            c1521a.c(listD22);
                            break;
                    }
                }
            });
        }
    }

    public static U5.f N(int i5, J5.h hVar, Y4.b bVar) throws o0 {
        U5.f fVarB = U5.f.b(hVar, bVar);
        while (true) {
            int i10 = fVarB.f12344a;
            if (i10 == i5) {
                return fVarB;
            }
            AbstractC0279p0.u(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j8 = fVarB.f12345b + 8;
            if (j8 > 2147483647L) {
                throw o0.b("Chunk is too large (~2GB+) to skip; id: " + i10);
            }
            hVar.j((int) j8);
            fVarB = U5.f.b(hVar, bVar);
        }
    }

    public static zzsb P(int i5) {
        switch (i5) {
            case 1:
                return zzsb.LATIN;
            case 2:
                return zzsb.LATIN_AND_CHINESE;
            case 3:
                return zzsb.LATIN_AND_DEVANAGARI;
            case 4:
                return zzsb.LATIN_AND_JAPANESE;
            case 5:
                return zzsb.LATIN_AND_KOREAN;
            case 6:
                return zzsb.CREDIT_CARD;
            case 7:
                return zzsb.DOCUMENT;
            case 8:
                return zzsb.PIXEL_AI;
            default:
                return zzsb.TYPE_UNKNOWN;
        }
    }

    public static final long a(float f10, float f11) {
        long jFloatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i5 = L0.e.f6797c;
        return jFloatToIntBits;
    }

    public static final long b(float f10, float f11) {
        long jFloatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i5 = L0.f.f6801c;
        return jFloatToIntBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r7v10, types: [ef.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(android.content.Context r16, java.util.List r17, long r18, lf.AbstractC3464c r20) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.c.c(android.content.Context, java.util.List, long, lf.c):java.lang.Object");
    }

    public static final Object d(com.moloco.sdk.internal.publisher.nativead.model.e eVar, InterfaceC2525i interfaceC2525i, long j8, AbstractC3471j abstractC3471j) {
        if (eVar instanceof com.moloco.sdk.internal.publisher.nativead.model.a) {
            return new z(new com.moloco.sdk.internal.publisher.nativead.model.i((com.moloco.sdk.internal.publisher.nativead.model.a) eVar));
        }
        if (eVar instanceof com.moloco.sdk.internal.publisher.nativead.model.b) {
            return i((com.moloco.sdk.internal.publisher.nativead.model.b) eVar, (o) com.moloco.sdk.service_locator.g.f29851b.getValue(), abstractC3471j);
        }
        if (eVar instanceof com.moloco.sdk.internal.publisher.nativead.model.c) {
            return new z(new com.moloco.sdk.internal.publisher.nativead.model.k((com.moloco.sdk.internal.publisher.nativead.model.c) eVar));
        }
        if (eVar instanceof com.moloco.sdk.internal.publisher.nativead.model.d) {
            return j((com.moloco.sdk.internal.publisher.nativead.model.d) eVar, (E) interfaceC2525i.getValue(), j8, abstractC3471j);
        }
        throw new Q((byte) 0, 9);
    }

    public static final void e(final long j8, final long j10, final Z.k kVar, float f10, final float f11, final tf.a onTimerFinish, final String customTimerString, InterfaceC1457v interfaceC1457v, final int i5, final int i10, C0740o c0740o, final int i11) {
        int i12;
        float f12;
        InterfaceC1457v interfaceC1457v2;
        int i13;
        boolean z2;
        Object obj;
        Object hVar;
        float f13;
        char c10;
        int i14;
        C0212e c0212e;
        boolean z10;
        Object obj2;
        C0740o c0740o2;
        boolean z11;
        final float f14;
        boolean z12;
        final float f15;
        final InterfaceC1457v interfaceC1457v3;
        AbstractC3340k.e(onTimerFinish, "onTimerFinish");
        AbstractC3340k.e(customTimerString, "customTimerString");
        c0740o.N(1415937460);
        if ((i11 & 6) == 0) {
            i12 = (c0740o.d(j8) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0740o.d(j10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0740o.e(kVar) ? 256 : 128;
        }
        int i15 = i12 | 3072;
        if ((i11 & 24576) == 0) {
            i15 |= c0740o.b(f11) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((196608 & i11) == 0) {
            i15 |= c0740o.e(onTimerFinish) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i15 |= c0740o.e(customTimerString) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i15 |= 4194304;
        }
        if ((100663296 & i11) == 0) {
            i15 |= c0740o.c(i5) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i15 |= c0740o.c(i10) ? 536870912 : 268435456;
        }
        if ((306783379 & i15) == 306783378 && c0740o.x()) {
            c0740o.I();
            f15 = f10;
            interfaceC1457v3 = interfaceC1457v;
            c0740o2 = c0740o;
        } else {
            c0740o.K();
            int i16 = i11 & 1;
            Z.i iVar = Z.i.f16922a;
            int i17 = i15;
            if (i16 == 0 || c0740o.w()) {
                f12 = 5;
                interfaceC1457v2 = (InterfaceC1457v) c0740o.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                i13 = i17 & (-29360129);
            } else {
                c0740o.I();
                interfaceC1457v2 = interfaceC1457v;
                i13 = i17 & (-29360129);
                f12 = f10;
            }
            c0740o.q();
            c0740o.M(-1077278555);
            Object objF = c0740o.F();
            P p10 = C0732k.f7800a;
            P p11 = P.f7730f;
            Object obj3 = objF;
            if (objF == p10) {
                Y yG = C0718d.G(new L0.h(0L), p11);
                c0740o.U(yG);
                obj3 = yG;
            }
            final V v2 = (V) obj3;
            c0740o.p(false);
            c0740o.M(-1077276327);
            boolean zE = c0740o.e(interfaceC1457v2);
            Object objF2 = c0740o.F();
            Object obj4 = objF2;
            if (zE || objF2 == p10) {
                Y yG2 = C0718d.G(Boolean.TRUE, p11);
                c0740o.U(yG2);
                obj4 = yG2;
            }
            V v10 = (V) obj4;
            c0740o.p(false);
            Object[] objArr = new Object[0];
            c0740o.M(-1077272712);
            boolean zC = c0740o.c(i10);
            Object objF3 = c0740o.F();
            if (zC || objF3 == p10) {
                z2 = false;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b(i10, false ? 1 : 0);
                c0740o.U(bVar);
                obj = bVar;
            } else {
                z2 = false;
                obj = objF3;
            }
            c0740o.p(z2);
            InterfaceC1457v interfaceC1457v4 = interfaceC1457v2;
            boolean z13 = z2;
            V v11 = (V) gc.b.E(objArr, null, (tf.a) obj, c0740o, 0, 6);
            c0740o.M(-1077269958);
            Object objF4 = c0740o.F();
            Object obj5 = objF4;
            if (objF4 == p10) {
                C0212e c0212eA = AbstractC0226t.a(xg.g.d(i10, i5));
                c0740o.U(c0212eA);
                obj5 = c0212eA;
            }
            C0212e c0212e2 = (C0212e) obj5;
            c0740o.p(z13);
            C2537u c2537u = new C2537u(i10);
            c0740o.M(-1077264621);
            boolean zE2 = c0740o.e(v11) | c0740o.c(i10) | c0740o.c(i5) | c0740o.e(c0212e2) | c0740o.e(onTimerFinish);
            Object objF5 = c0740o.F();
            if (zE2 || objF5 == p10) {
                f13 = f12;
                c10 = 6;
                i14 = i10;
                hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.h(i14, i5, c0212e2, onTimerFinish, v11, null);
                c0212e = c0212e2;
                c0740o.U(hVar);
            } else {
                hVar = objF5;
                f13 = f12;
                i14 = i10;
                c0212e = c0212e2;
                c10 = 6;
            }
            c0740o.p(false);
            C0718d.d(c0740o, c2537u, (p) hVar);
            Boolean bool = (Boolean) v10.getValue();
            bool.getClass();
            c0740o.M(-1077230899);
            boolean zE3 = c0740o.e(v10) | c0740o.e(c0212e);
            Object objF6 = c0740o.F();
            Object obj6 = objF6;
            if (zE3 || objF6 == p10) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.i iVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.i(c0212e, v10, null);
                c0740o.U(iVar2);
                obj6 = iVar2;
            }
            c0740o.p(false);
            C0718d.d(c0740o, bool, (p) obj6);
            c0740o.M(-1077226486);
            boolean zE4 = c0740o.e(v10) | c0740o.e(c0212e) | c0740o.e(interfaceC1457v4);
            Object objF7 = c0740o.F();
            if (zE4 || objF7 == p10) {
                z10 = false;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c(interfaceC1457v4, c0212e, v10, false ? 1 : 0);
                c0740o.U(cVar);
                obj2 = cVar;
            } else {
                z10 = false;
                obj2 = objF7;
            }
            c0740o.p(z10);
            C0718d.c(interfaceC1457v4, (tf.l) obj2, c0740o);
            C0416f c0416f = AbstractC0419i.f2743a;
            C0415e c0415e = new C0415e(8);
            c0740o.M(693286680);
            InterfaceC3909n interfaceC3909nA = J.a(c0415e, c0740o);
            c0740o.M(-1323940314);
            L0 l02 = M.f46143e;
            L0.b bVar2 = (L0.b) c0740o.j(l02);
            L0 l03 = M.k;
            L0.i iVar3 = (L0.i) c0740o.j(l03);
            L0 l04 = M.f46152o;
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(l04);
            InterfaceC4055c.g9.getClass();
            final C0212e c0212e3 = c0212e;
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = S3.f.y(kVar);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(c4056d);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C4053a c4053a = C4054b.f45456e;
            C0718d.M(c0740o, interfaceC3909nA, c4053a);
            C4053a c4053a2 = C4054b.f45455d;
            C0718d.M(c0740o, bVar2, c4053a2);
            C4053a c4053a3 = C4054b.f45457f;
            C0718d.M(c0740o, iVar3, c4053a3);
            C4053a c4053a4 = C4054b.f45458g;
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, c4053a4, c0740o), c0740o, 2058660585);
            c0740o.M(-678309503);
            String strH0 = r.h0(customTimerString, "[SECONDS_LEFT]", Long.toString(i14 & 4294967295L, 10), false);
            long j11 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31058b;
            c0740o.M(-447505287);
            boolean zE5 = c0740o.e("custom_countdown_timer_text");
            Object objF8 = c0740o.F();
            Object obj7 = objF8;
            if (zE5 || objF8 == p10) {
                C1915d c1915d = new C1915d(13);
                c0740o.U(c1915d);
                obj7 = c1915d;
            }
            c0740o.p(false);
            float f16 = f13;
            I.b(strH0, Fe.g.J(iVar, false, (tf.l) obj7), j10, j11, null, null, 0L, new K0.c(5), 0L, 0, false, 2, null, null, c0740o, ((i13 << 3) & 896) | 3072, 3072, 56816);
            c0740o2 = c0740o;
            Z.d dVar = Z.a.f16904e;
            Z.k kVarF0 = H.f0(L.c(iVar, f11), 2);
            c0740o2.M(-447492116);
            boolean zE6 = c0740o2.e(v2);
            Object objF9 = c0740o2.F();
            if (zE6 || objF9 == p10) {
                z11 = false;
                objF9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.d(v2, false ? 1 : 0);
                c0740o2.U(objF9);
            } else {
                z11 = false;
            }
            tf.l onSizeChanged = (tf.l) objF9;
            c0740o2.p(z11);
            AbstractC3340k.e(kVarF0, "<this>");
            AbstractC3340k.e(onSizeChanged, "onSizeChanged");
            Z.k kVarL = v0.l(kVarF0.g(new r0.r(onSizeChanged)), C2465q.a(C2465q.f34375d, 0.9f), H.e.f4848a);
            c0740o2.M(-447486932);
            boolean zE7 = c0740o2.e("custom_timer_container");
            Object objF10 = c0740o2.F();
            if (zE7 || objF10 == p10) {
                objF10 = new C1915d(14);
                c0740o2.U(objF10);
            }
            c0740o2.p(false);
            Z.k kVarJ = Fe.g.J(kVarL, false, (tf.l) objF10);
            c0740o2.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(dVar, false, c0740o2);
            c0740o2.M(-1323940314);
            L0.b bVar3 = (L0.b) c0740o2.j(l02);
            L0.i iVar4 = (L0.i) c0740o2.j(l03);
            InterfaceC4193p0 interfaceC4193p02 = (InterfaceC4193p0) c0740o2.j(l04);
            V.d dVarY2 = S3.f.y(kVarJ);
            c0740o2.O();
            if (c0740o2.f7843O) {
                c0740o2.k(c4056d);
            } else {
                c0740o2.X();
            }
            c0740o2.f7867x = false;
            C0718d.M(c0740o2, interfaceC3909nC, c4053a);
            C0718d.M(c0740o2, bVar3, c4053a2);
            C0718d.M(c0740o2, iVar4, c4053a3);
            wg.b.d(0, dVarY2, wg.b.b(c0740o2, interfaceC4193p02, c4053a4, c0740o2), c0740o2, 2058660585);
            c0740o2.M(-2137368960);
            Z.k kVarA = L.a(iVar);
            c0740o2.M(-1178257690);
            boolean zD = c0740o2.d(j8) | c0740o2.e(v2) | c0740o2.b(f16) | c0740o2.e(c0212e3) | c0740o2.d(j10);
            Object objF11 = c0740o2.F();
            if (zD || objF11 == p10) {
                f14 = f16;
                z12 = false;
                tf.l lVar = new tf.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.e
                    @Override // tf.l
                    public final Object invoke(Object obj8) {
                        InterfaceC2663d Canvas = (InterfaceC2663d) obj8;
                        AbstractC3340k.e(Canvas, "$this$Canvas");
                        V v12 = v2;
                        long jI = H.I((int) (((L0.h) v12.getValue()).f6805a >> 32), (int) (((L0.h) v12.getValue()).f6805a & 4294967295L));
                        float f17 = f14;
                        com.google.android.gms.internal.consent_sdk.a.c(Canvas, j8, 360.0f, 360.0f, jI, new g0.g(Canvas.t(f17), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, 26));
                        C0212e c0212e4 = c0212e3;
                        float fFloatValue = ((Number) c0212e4.d()).floatValue();
                        float f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (fFloatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float fFloatValue2 = ((Number) c0212e4.d()).floatValue();
                            if (fFloatValue2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f18 = fFloatValue2;
                            }
                            com.google.android.gms.internal.consent_sdk.a.c(Canvas, j10, 270.0f, f18 * (-360.0f), H.I((int) (((L0.h) v12.getValue()).f6805a >> 32), (int) (((L0.h) v12.getValue()).f6805a & 4294967295L)), new g0.g(Canvas.t(f17), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, 26));
                        }
                        return C2515C.f34653a;
                    }
                };
                c0740o2.U(lVar);
                objF11 = lVar;
            } else {
                f14 = f16;
                z12 = false;
            }
            c0740o2.p(z12);
            android.support.v4.media.session.b.F(kVarA, (tf.l) objF11, c0740o2, 6);
            wg.b.e(c0740o2, z12, z12, true, z12);
            wg.b.e(c0740o2, z12, z12, z12, true);
            c0740o2.p(z12);
            c0740o2.p(z12);
            f15 = f14;
            interfaceC1457v3 = interfaceC1457v4;
        }
        C0729i0 c0729i0R = c0740o2.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.f
                @Override // tf.p
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int i18 = i11 | 1;
                    int i19 = i5;
                    int i20 = i10;
                    A6.c.e(j8, j10, kVar, f15, f11, onTimerFinish, customTimerString, interfaceC1457v3, i19, i20, (C0740o) obj8, i18);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final void f(final WebView webView, Z.k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, C0740o c0740o, int i5) {
        int i10;
        AbstractC3340k.e(webView, "webView");
        c0740o.N(-1111633024);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.e(webView) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= c0740o.e(kVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= c0740o.e(tVar) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(1539490980);
            c0740o.M(1539458953);
            boolean zE = c0740o.e(webView);
            Object objF = c0740o.F();
            P p10 = C0732k.f7800a;
            if (zE || objF == p10) {
                final int i11 = 0;
                objF = new tf.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a
                    @Override // tf.l
                    public final Object invoke(Object obj) {
                        switch (i11) {
                            case 0:
                                Context it = (Context) obj;
                                AbstractC3340k.e(it, "it");
                                FrameLayout frameLayout = new FrameLayout(it);
                                WebView webView2 = webView;
                                webView2.setBackgroundColor(0);
                                webView2.setVisibility(0);
                                frameLayout.addView(webView2, new ViewGroup.LayoutParams(-1, -1));
                                return frameLayout;
                            default:
                                C DisposableEffect = (C) obj;
                                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                                return new X(webView, 3);
                        }
                    }
                };
                c0740o.U(objF);
            }
            c0740o.p(false);
            AbstractC1304a.c((tf.l) objF, kVar, null, c0740o, i10 & 112, 4);
            c0740o.M(1539491745);
            if (tVar != null) {
                ((v) tVar).a(V.e.b(c0740o, 1018657295, new C2077k(1)), c0740o, ((i10 >> 3) & 112) | 6);
            }
            c0740o.p(false);
            c0740o.p(false);
            c0740o.M(1539498319);
            boolean zE2 = c0740o.e(webView);
            Object objF2 = c0740o.F();
            if (zE2 || objF2 == p10) {
                final int i12 = 1;
                objF2 = new tf.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a
                    @Override // tf.l
                    public final Object invoke(Object obj) {
                        switch (i12) {
                            case 0:
                                Context it = (Context) obj;
                                AbstractC3340k.e(it, "it");
                                FrameLayout frameLayout = new FrameLayout(it);
                                WebView webView2 = webView;
                                webView2.setBackgroundColor(0);
                                webView2.setVisibility(0);
                                frameLayout.addView(webView2, new ViewGroup.LayoutParams(-1, -1));
                                return frameLayout;
                            default:
                                C DisposableEffect = (C) obj;
                                AbstractC3340k.e(DisposableEffect, "$this$DisposableEffect");
                                return new X(webView, 3);
                        }
                    }
                };
                c0740o.U(objF2);
            }
            c0740o.p(false);
            C0718d.c(webView, (tf.l) objF2, c0740o);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new C2041b(webView, kVar, tVar, i5, 2);
        }
    }

    public static final P.d g(C1542g c1542g) {
        AbstractC3340k.e(c1542g, "<this>");
        P.d dVar = c1542g.f19499c;
        int i5 = dVar.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVar.f8970a;
            int i10 = 0;
            int i11 = 0;
            while (!((C1542g) objArr[i11]).f19500d.a()) {
                i11++;
                if (i11 >= i5) {
                }
            }
            P.d dVar2 = new P.d(new C1542g[16]);
            int i12 = dVar.f8972c;
            if (i12 > 0) {
                Object[] objArr2 = dVar.f8970a;
                do {
                    C1542g c1542g2 = (C1542g) objArr2[i10];
                    if (c1542g2.f19500d.a()) {
                        dVar2.c(dVar2.f8972c, g(c1542g2));
                    } else {
                        dVar2.b(c1542g2);
                    }
                    i10++;
                } while (i10 < i12);
            }
            return dVar2;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(p0.s r7, lf.AbstractC3462a r8) {
        /*
            boolean r0 = r8 instanceof C.b
            if (r0 == 0) goto L13
            r0 = r8
            C.b r0 = (C.b) r0
            int r1 = r0.f1703c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1703c = r1
            goto L18
        L13:
            C.b r0 = new C.b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1702b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1703c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            p0.s r7 = r0.f1701a
            Fe.e.U(r8)
            goto L5e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            Fe.e.U(r8)
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r7, r8)
            p0.t r8 = r7.f43177e
            p0.f r8 = r8.f43180e
            java.util.List r8 = r8.f43133a
            int r2 = r8.size()
            r5 = r4
        L45:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r8.get(r5)
            p0.k r6 = (p0.k) r6
            boolean r6 = r6.f43144d
            if (r6 == 0) goto L77
        L51:
            p0.g r8 = p0.g.f43138c
            r0.f1701a = r7
            r0.f1703c = r3
            java.lang.Object r8 = r7.e(r8, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            p0.f r8 = (p0.f) r8
            java.util.List r8 = r8.f43133a
            int r2 = r8.size()
            r5 = r4
        L67:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r8.get(r5)
            p0.k r6 = (p0.k) r6
            boolean r6 = r6.f43144d
            if (r6 == 0) goto L74
            goto L51
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            int r5 = r5 + 1
            goto L45
        L7a:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.c.h(p0.s, lf.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(com.moloco.sdk.internal.publisher.nativead.model.b r7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o r8, lf.AbstractC3464c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof com.moloco.sdk.internal.publisher.nativead.parser.b
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.publisher.nativead.parser.b r0 = (com.moloco.sdk.internal.publisher.nativead.parser.b) r0
            int r1 = r0.f29218c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29218c = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.parser.b r0 = new com.moloco.sdk.internal.publisher.nativead.parser.b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29217b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f29218c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.moloco.sdk.internal.publisher.nativead.model.b r7 = r0.f29216a
            Fe.e.U(r9)
            goto L4e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            Fe.e.U(r9)
            java.lang.String r9 = r7.f29178c
            r0.f29216a = r7
            r0.f29218c = r3
            r8.getClass()
            Lf.e r2 = Ef.S.f3698a
            Lf.d r2 = Lf.d.f7120b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j r3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j
            r4 = 0
            r3.<init>(r9, r8, r4)
            java.lang.Object r9 = Ef.H.P(r2, r3, r0)
            if (r9 != r1) goto L4e
            return r1
        L4e:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i) r9
            boolean r8 = r9 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h
            if (r8 == 0) goto L9d
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Successfully loaded image asset media"
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L85
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h) r9     // Catch: java.lang.Exception -> L85
            java.io.File r8 = r9.f30282a     // Catch: java.lang.Exception -> L85
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Exception -> L85
            java.lang.String r9 = "getAbsolutePath(...)"
            kotlin.jvm.internal.AbstractC3340k.d(r8, r9)     // Catch: java.lang.Exception -> L85
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Exception -> L85
            java.lang.String r9 = "parse(this)"
            kotlin.jvm.internal.AbstractC3340k.d(r8, r9)     // Catch: java.lang.Exception -> L85
            com.moloco.sdk.internal.z r9 = new com.moloco.sdk.internal.z
            com.moloco.sdk.internal.publisher.nativead.model.j r0 = new com.moloco.sdk.internal.publisher.nativead.model.j
            r0.<init>(r7, r8)
            r9.<init>(r0)
            return r9
        L83:
            r3 = r7
            goto L88
        L85:
            r0 = move-exception
            r7 = r0
            goto L83
        L88:
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r2 = "Failed to prepare image asset"
            r4 = 0
            java.lang.String r1 = "PrepareNativeAssets"
            r5 = 8
            r6 = 0
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.y r7 = new com.moloco.sdk.internal.y
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f30118c
            r7.<init>(r8)
            return r7
        L9d:
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r3 = 0
            r4 = 0
            java.lang.String r1 = "PrepareNativeAssets"
            java.lang.String r2 = "Failed to fetch image asset media"
            r5 = 12
            r6 = 0
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.y r7 = new com.moloco.sdk.internal.y
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f30117b
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.c.i(com.moloco.sdk.internal.publisher.nativead.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o, lf.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r15 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(com.moloco.sdk.internal.publisher.nativead.model.d r11, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E r12, long r13, lf.AbstractC3464c r15) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.c.j(com.moloco.sdk.internal.publisher.nativead.model.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E, long, lf.c):java.lang.Object");
    }

    public static S1.k k(Y1.m mVar, String str, Y1.j jVar, int i5) {
        j0 j0Var = j0.f40119g;
        Map map = Collections.EMPTY_MAP;
        Uri uriU = Q1.k.u(str, jVar.f16353c);
        String strA = mVar.a();
        if (strA == null) {
            strA = Q1.k.u(((Y1.b) mVar.f16359b.get(0)).f16306a, jVar.f16353c).toString();
        }
        String str2 = strA;
        Q1.k.i(uriU, "The uri must be set.");
        return new S1.k(uriU, 1, null, j0Var, jVar.f16351a, jVar.f16352b, str2, i5);
    }

    public static final Nd.c l(String str) {
        AbstractC3340k.e(str, "<this>");
        return new Nd.c(str);
    }

    public static boolean m(J5.h hVar) {
        Y4.b bVar = new Y4.b(8);
        int i5 = U5.f.b(hVar, bVar).f12344a;
        if (i5 != 1380533830 && i5 != 1380333108) {
            return false;
        }
        hVar.c(bVar.f16679a, 0, 4, false);
        bVar.A(0);
        int iD = bVar.d();
        if (iD == 1463899717) {
            return true;
        }
        AbstractC4256a.o("WavHeaderReader", "Unsupported form type: " + iD);
        return false;
    }

    public static int n(int i5, int i10) {
        long j8 = i5 + i10;
        int i11 = (int) j8;
        if (j8 == ((long) i11)) {
            return i11;
        }
        throw new ArithmeticException(N0.a.e("overflow: checkedAdd(", i5, ", ", i10, ")"));
    }

    public static final String o(byte[] bArr, int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i5;
        if (i16 < 0 || i10 > bArr.length || i16 > i10) {
            StringBuilder sb2 = new StringBuilder("size=");
            R8.v.i(bArr.length, i16, " beginIndex=", " endIndex=", sb2);
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        char[] cArr = new char[i10 - i16];
        int i17 = 0;
        while (i16 < i10) {
            byte b5 = bArr[i16];
            if (b5 >= 0) {
                i11 = i17 + 1;
                cArr[i17] = (char) b5;
                i16++;
                while (i16 < i10) {
                    byte b10 = bArr[i16];
                    if (b10 < 0) {
                        break;
                    }
                    i16++;
                    cArr[i11] = (char) b10;
                    i11++;
                }
            } else {
                if ((b5 >> 5) == -2) {
                    int i18 = i16 + 1;
                    if (i10 <= i18) {
                        i11 = i17 + 1;
                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b11 = bArr[i18];
                        if ((b11 & 192) == 128) {
                            int i19 = (b5 << 6) ^ (b11 ^ 3968);
                            if (i19 < 128) {
                                i11 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i11 = i17 + 1;
                                cArr[i17] = (char) i19;
                            }
                        } else {
                            i11 = i17 + 1;
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                } else if ((b5 >> 4) == -2) {
                    int i20 = i16 + 2;
                    if (i10 <= i20) {
                        i11 = i17 + 1;
                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        int i21 = i16 + 1;
                        i12 = (i10 <= i21 || (bArr[i21] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b12 = bArr[i16 + 1];
                        if ((b12 & 192) == 128) {
                            byte b13 = bArr[i20];
                            if ((b13 & 192) == 128) {
                                int i22 = (b5 << 12) ^ ((b13 ^ (-123008)) ^ (b12 << 6));
                                if (i22 < 2048) {
                                    i11 = i17 + 1;
                                    cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 > i22 || i22 >= 57344) {
                                    i11 = i17 + 1;
                                    cArr[i17] = (char) i22;
                                } else {
                                    i11 = i17 + 1;
                                    cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                }
                                i12 = 3;
                            } else {
                                i11 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            }
                        } else {
                            i11 = i17 + 1;
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                } else {
                    if ((b5 >> 3) == -2) {
                        int i23 = i16 + 3;
                        if (i10 <= i23) {
                            i13 = i17 + 1;
                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                            int i24 = i16 + 1;
                            if (i10 > i24 && (bArr[i24] & 192) == 128) {
                                int i25 = i16 + 2;
                                i15 = (i10 <= i25 || (bArr[i25] & 192) != 128) ? 2 : 3;
                            }
                            i15 = 1;
                        } else {
                            byte b14 = bArr[i16 + 1];
                            if ((b14 & 192) == 128) {
                                byte b15 = bArr[i16 + 2];
                                if ((b15 & 192) == 128) {
                                    byte b16 = bArr[i23];
                                    if ((b16 & 192) == 128) {
                                        int i26 = (b5 << 18) ^ (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12));
                                        if (i26 > 1114111) {
                                            i13 = i17 + 1;
                                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if ((55296 > i26 || i26 >= 57344) && i26 >= 65536) {
                                            if (i26 != 65533) {
                                                cArr[i17] = (char) ((i26 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                i14 = i17 + 2;
                                                cArr[i17 + 1] = (char) ((i26 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                            } else {
                                                cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                                i14 = i17 + 1;
                                            }
                                            i13 = i14;
                                        } else {
                                            i13 = i17 + 1;
                                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        i15 = 4;
                                    } else {
                                        i13 = i17 + 1;
                                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                    }
                                } else {
                                    i13 = i17 + 1;
                                    cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                }
                            } else {
                                i13 = i17 + 1;
                                cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                i15 = 1;
                            }
                        }
                        i16 += i15;
                    } else {
                        i13 = i17 + 1;
                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                        i16++;
                    }
                    i17 = i13;
                }
                i16 += i12;
            }
            i17 = i11;
        }
        return r.Z(cArr, 0, i17);
    }

    public static final x p(Jd.y parameters) {
        AbstractC3340k.e(parameters, "parameters");
        Jd.z zVar = new Jd.z(8);
        for (String str : parameters.names()) {
            List listI = parameters.i(str);
            if (listI == null) {
                listI = ff.v.f35432a;
            }
            String strD = AbstractC0668b.d(0, 0, 15, str);
            List list = listI;
            ArrayList arrayList = new ArrayList(ff.p.a0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0668b.d(0, 0, 11, (String) it.next()));
            }
            zVar.f(strD, arrayList);
        }
        Map values = (Map) zVar.f421a;
        AbstractC3340k.e(values, "values");
        return new A(values);
    }

    public static int q(int i5, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i5 / i10;
        int i12 = i5 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i5 ^ i10) >> 31) | 1;
        switch (AbstractC3605d.f40941a[roundingMode.ordinal()]) {
            case 1:
                Ba.c.m(i12 == 0);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i11;
                }
                if (iAbs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static int r(int i5, int i10) {
        RoundingMode roundingMode = RoundingMode.UP;
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i5 / i10;
        int i12 = i5 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i5 ^ i10) >> 31) | 1;
        switch (q9.d.f44179a[roundingMode.ordinal()]) {
            case 1:
            case 2:
                return i11;
            case 3:
                break;
            case 4:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 5:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i11;
                }
                if (iAbs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static void s(String str, Object... objArr) {
        throw new AssertionError("INTERNAL ASSERTION FAILED: ".concat(String.format(str, objArr)));
    }

    public static final C1542g t(C1542g c1542g) {
        AbstractC3340k.e(c1542g, "<this>");
        int iOrdinal = c1542g.f19500d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                throw new Q((byte) 0, 9);
                            }
                        }
                    }
                    return null;
                }
            }
            C1542g c1542g2 = c1542g.f19501e;
            if (c1542g2 != null) {
                return t(c1542g2);
            }
            return null;
        }
        return c1542g;
    }

    public static final C1542g u(C1542g c1542g) {
        AbstractC3340k.e(c1542g, "<this>");
        C1542g c1542g2 = c1542g.f19498b;
        if (c1542g2 == null) {
            return null;
        }
        int iOrdinal = c1542g.f19500d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return c1542g;
            }
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                throw new Q((byte) 0, 9);
            }
        }
        return u(c1542g2);
    }

    public static final d0.d v(C1542g c1542g) {
        AbstractC3340k.e(c1542g, "<this>");
        y yVar = c1542g.k;
        return yVar != null ? ((y) Fe.g.z(yVar)).U(yVar, false) : d0.d.f33936e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r4 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        if (r4 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        if (r12 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r12 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [p0.t] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [jf.h] */
    /* JADX WARN: Type inference failed for: r10v12, types: [jf.h] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [jf.h] */
    /* JADX WARN: Type inference failed for: r10v3, types: [jf.h] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [p0.t] */
    /* JADX WARN: Type inference failed for: r2v12, types: [p0.t] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p0.t] */
    /* JADX WARN: Type inference failed for: r2v3, types: [p0.t] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(p0.t r10, tf.p r11, lf.AbstractC3464c r12) {
        /*
            boolean r0 = r12 instanceof C.c
            if (r0 == 0) goto L13
            r0 = r12
            C.c r0 = (C.c) r0
            int r1 = r0.f1708e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1708e = r1
            goto L18
        L13:
            C.c r0 = new C.c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f1707d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1708e
            r3 = 0
            ef.C r4 = ef.C2515C.f34653a
            r5 = 2
            r6 = 3
            r7 = 1
            if (r2 == 0) goto L56
            if (r2 == r7) goto L4c
            if (r2 == r5) goto L3e
            if (r2 != r6) goto L36
            jf.h r10 = r0.f1706c
            tf.p r11 = r0.f1705b
            p0.t r2 = r0.f1704a
            Fe.e.U(r12)
            goto L47
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            jf.h r10 = r0.f1706c
            tf.p r11 = r0.f1705b
            p0.t r2 = r0.f1704a
            Fe.e.U(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
        L47:
            r12 = r10
            r10 = r2
            goto L5d
        L4a:
            r12 = move-exception
            goto L93
        L4c:
            jf.h r10 = r0.f1706c
            tf.p r11 = r0.f1705b
            p0.t r2 = r0.f1704a
            Fe.e.U(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
            goto L74
        L56:
            Fe.e.U(r12)
            jf.h r12 = r0.getContext()
        L5d:
            boolean r2 = Ef.H.z(r12)
            if (r2 == 0) goto Lb4
            r0.f1704a = r10     // Catch: java.util.concurrent.CancellationException -> L8e
            r0.f1705b = r11     // Catch: java.util.concurrent.CancellationException -> L8e
            r0.f1706c = r12     // Catch: java.util.concurrent.CancellationException -> L8e
            r0.f1708e = r7     // Catch: java.util.concurrent.CancellationException -> L8e
            java.lang.Object r2 = r11.invoke(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L8e
            if (r2 != r1) goto L72
            goto Lb2
        L72:
            r2 = r10
            r10 = r12
        L74:
            r0.f1704a = r2     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f1705b = r11     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f1706c = r10     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f1708e = r5     // Catch: java.util.concurrent.CancellationException -> L4a
            C.a r12 = new C.a     // Catch: java.util.concurrent.CancellationException -> L4a
            r12.<init>(r5, r3)     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.Object r12 = r2.A(r12, r0)     // Catch: java.util.concurrent.CancellationException -> L4a
            kf.a r8 = kf.a.f39711a     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r12 != r8) goto L8a
            goto L8b
        L8a:
            r12 = r4
        L8b:
            if (r12 != r1) goto L47
            goto Lb2
        L8e:
            r2 = move-exception
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
        L93:
            boolean r8 = Ef.H.z(r10)
            if (r8 == 0) goto Lb3
            r0.f1704a = r2
            r0.f1705b = r11
            r0.f1706c = r10
            r0.f1708e = r6
            C.a r12 = new C.a
            r12.<init>(r5, r3)
            java.lang.Object r12 = r2.A(r12, r0)
            kf.a r8 = kf.a.f39711a
            if (r12 != r8) goto Laf
            goto Lb0
        Laf:
            r12 = r4
        Lb0:
            if (r12 != r1) goto L47
        Lb2:
            return r1
        Lb3:
            throw r12
        Lb4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.c.w(p0.t, tf.p, lf.c):java.lang.Object");
    }

    public static S1.k y(int i5) {
        int i10 = Q1.x.f9724a;
        Locale locale = Locale.US;
        return new S1.k(Uri.parse("rtp://0.0.0.0:" + i5), 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
    }

    public static void z(boolean z2, String str, Object... objArr) {
        if (z2) {
            return;
        }
        s(str, objArr);
        throw null;
    }

    public abstract boolean E();

    public abstract void K(boolean z2);

    public abstract void L(boolean z2);

    public abstract TransformationMethod O(TransformationMethod transformationMethod);

    public abstract InputFilter[] x(InputFilter[] inputFilterArr);
}
