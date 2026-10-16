package tg;

import A.AbstractC0213f;
import Bf.k;
import C8.i;
import E.C0427q;
import E.L;
import E4.F;
import Ef.H;
import Ef.S;
import H6.m;
import H6.n;
import Hf.v0;
import Jd.A;
import Jd.C0674h;
import Jd.l;
import Jd.x;
import Jd.z;
import Lb.h;
import Lf.e;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.P;
import N.V;
import R8.v;
import Va.M6;
import Va.X7;
import Z1.g;
import ac.C1346a;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Trace;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import ba.C1521a;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.moloco.sdk.internal.B;
import com.moloco.sdk.internal.C;
import com.moloco.sdk.internal.j;
import com.moloco.sdk.internal.publisher.C1913b;
import com.moloco.sdk.internal.services.events.c;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2103c;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import dd.C2428g;
import e0.C2444G;
import e0.C2465q;
import ef.C2515C;
import ef.C2537u;
import gc.AbstractC2745a;
import gf.C2759f;
import gf.C2761h;
import hc.C2815a;
import hc.C2816b;
import i0.C2824b;
import i0.C2825c;
import i0.C2826d;
import i0.C2830h;
import i0.C2833k;
import i0.C2834l;
import i0.I;
import i0.O;
import i0.s;
import ic.InterfaceC2864a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.AbstractC3256n;
import kd.C3306b;
import kd.C3322s;
import kotlin.jvm.internal.AbstractC3340k;
import l4.C3389e;
import l4.DialogC3391g;
import n3.f;
import org.apache.tika.utils.StringUtils;
import r0.C3902g;
import r7.AbstractC3935e;
import r7.C3934d;
import s3.AbstractC3994a;
import tf.p;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import w1.C4350a;
import w1.C4351b;
import x4.d;

/* loaded from: classes5.dex */
public abstract class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public static C2826d f46042a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f46043b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f46044c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f46045d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f46046e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f46047f;

    public static final C2826d A() {
        C2826d c2826d = f46042a;
        if (c2826d != null) {
            return c2826d;
        }
        C2825c c2825c = new C2825c("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, C2465q.f34380i, 5, false);
        int i5 = I.f36530a;
        C2444G c2444g = new C2444G(C2465q.f34373b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2834l(12.0f, 17.27f));
        arrayList.add(new C2833k(18.18f, 21.0f));
        arrayList.add(new s(-1.64f, -7.03f));
        arrayList.add(new C2833k(22.0f, 9.24f));
        arrayList.add(new s(-7.19f, -0.61f));
        arrayList.add(new C2833k(12.0f, 2.0f));
        arrayList.add(new C2833k(9.19f, 8.63f));
        arrayList.add(new C2833k(2.0f, 9.24f));
        arrayList.add(new s(5.46f, 4.73f));
        arrayList.add(new C2833k(5.82f, 21.0f));
        arrayList.add(C2830h.f36647c);
        c2825c.b();
        ((C2824b) AbstractC3256n.e(c2825c.f36607i, 1)).f36598j.add(new O("", arrayList, 0, c2444g, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        C2826d c2826dA = c2825c.a();
        f46042a = c2826dA;
        return c2826dA;
    }

    public static String B(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void C(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean D() {
        String[] strArr = {"/system/app/Superuser.apk", "/system/app/SuperSU.apk", "/system/priv-app/SuperSU/SuperSU.apk", "/system/xbin/daemonsu", "/data/local/tmp/supersu", "/dev/com.koushikdutta.superuser.daemon/"};
        for (int i5 = 0; i5 < 6; i5++) {
            if (new File(strArr[i5]).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean E() {
        String str = Build.TYPE;
        boolean z2 = str.equals("eng") || str.equals("userdebug");
        String str2 = Build.TAGS;
        return z2 || (str2 != null && (str2.contains("dev-keys") || str2.contains("test-keys"))) || UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(B("ro.debuggable"));
    }

    public static boolean F() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC3994a.c();
        }
        try {
            if (f46045d == null) {
                f46044c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f46045d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f46045d.invoke(null, Long.valueOf(f46044c))).booleanValue();
        } catch (Exception e7) {
            C("isTagEnabled", e7);
            return false;
        }
    }

    public static boolean G(Context context) {
        String packageName = context.getApplicationContext().getPackageName();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isIgnoringBatteryOptimizations(packageName);
    }

    public static boolean H(Context context) {
        d dVar = new d(26);
        boolean zE = E();
        boolean zA = dVar.a();
        boolean zBooleanValue = N(context).booleanValue();
        boolean zR = r();
        boolean zV = v();
        boolean zP = p(zE);
        String lowerCase = Build.BRAND.toLowerCase();
        if (!lowerCase.contains("xiaomi") && !lowerCase.contains("redmi") && !lowerCase.contains("poco")) {
            return zE ? zA || D() || zV : zA || zBooleanValue || zR || zV || zP;
        }
        if (D()) {
            return true;
        }
        return zA && zV;
    }

    public static boolean I(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static x L(String query) {
        int i5;
        AbstractC3340k.e(query, "query");
        if (k.s0(query) < 0) {
            x.f6091b.getClass();
            return C0674h.f6055c;
        }
        l lVar = x.f6091b;
        z zVar = new z(8);
        int iS0 = k.s0(query);
        int i10 = 0;
        int i11 = -1;
        if (iS0 >= 0) {
            int i12 = 0;
            i5 = 0;
            int i13 = -1;
            while (i10 != 1000) {
                char cCharAt = query.charAt(i12);
                if (cCharAt == '&') {
                    g(zVar, query, i5, i13, i12);
                    i5 = i12 + 1;
                    i10++;
                    i13 = -1;
                } else if (cCharAt == '=' && i13 == -1) {
                    i13 = i12;
                }
                if (i12 != iS0) {
                    i12++;
                } else {
                    i11 = i13;
                }
            }
            Map values = (Map) zVar.f421a;
            AbstractC3340k.e(values, "values");
            return new A(values);
        }
        i5 = 0;
        if (i10 != 1000) {
            g(zVar, query, i5, i11, query.length());
        }
        Map values2 = (Map) zVar.f421a;
        AbstractC3340k.e(values2, "values");
        return new A(values2);
    }

    public static C4351b M(String name, C1346a c1346a, int i5) {
        if ((i5 & 2) != 0) {
            c1346a = null;
        }
        C4350a c4350a = C4350a.f47273i;
        e eVar = S.f3698a;
        Kd.a aVarC = H.c(Lf.d.f7120b.plus(H.f()));
        AbstractC3340k.e(name, "name");
        return new C4351b(name, c1346a, c4350a, aVarC);
    }

    public static Boolean N(Context context) {
        F f10 = new F(context, 8);
        f10.f2853b = false;
        Fe.b.f4078a = 0;
        String lowerCase = Build.BRAND.toLowerCase();
        return (lowerCase.contains("oneplus") || lowerCase.contains("moto") || lowerCase.contains("xiaomi") || lowerCase.contains("lenovo") || lowerCase.contains("samsung")) ? Boolean.valueOf(f10.g()) : Boolean.valueOf(f10.g());
    }

    public static final void O(View view, f fVar) {
        AbstractC3340k.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static Set P(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC3340k.d(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static void Q(InterfaceC4269f binaryMessenger, final C3322s c3322s) {
        i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (c3322s == null || (iVar = c3322s.f39693a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo");
        if (c3322s != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.E
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3322s c3322s2 = c3322s;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c3322s2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c3322s2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c3322s2.getClass();
                                listD3 = AbstractC3935e.C(new Y(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c3322s2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c3322s2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC3325v enumC3325v = (EnumC3325v) obj15;
                            try {
                                c3322s2.getClass();
                                int iOrdinal = enumC3325v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC3325v enumC3325v2 = EnumC3325v.f39700c;
                                    c3322s2.f39693a.getClass();
                                    throw new IllegalArgumentException(enumC3325v2 + " doesn't represent a native value.");
                                }
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
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy");
        if (c3322s != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: kd.E
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3322s c3322s2 = c3322s;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c3322s2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c3322s2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c3322s2.getClass();
                                listD3 = AbstractC3935e.C(new Y(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c3322s2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c3322s2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC3325v enumC3325v = (EnumC3325v) obj15;
                            try {
                                c3322s2.getClass();
                                int iOrdinal = enumC3325v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC3325v enumC3325v2 = EnumC3325v.f39700c;
                                    c3322s2.f39693a.getClass();
                                    throw new IllegalArgumentException(enumC3325v2 + " doesn't represent a native value.");
                                }
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
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition");
        if (c3322s != null) {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: kd.E
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3322s c3322s2 = c3322s;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c3322s2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c3322s2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c3322s2.getClass();
                                listD3 = AbstractC3935e.C(new Y(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c3322s2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c3322s2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC3325v enumC3325v = (EnumC3325v) obj15;
                            try {
                                c3322s2.getClass();
                                int iOrdinal = enumC3325v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC3325v enumC3325v2 = EnumC3325v.f39700c;
                                    c3322s2.f39693a.getClass();
                                    throw new IllegalArgumentException(enumC3325v2 + " doesn't represent a native value.");
                                }
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
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled");
        if (c3322s != null) {
            final int i12 = 3;
            x75.n(new InterfaceC4265b() { // from class: kd.E
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3322s c3322s2 = c3322s;
                    switch (i12) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c3322s2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c3322s2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c3322s2.getClass();
                                listD3 = AbstractC3935e.C(new Y(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c3322s2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c3322s2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC3325v enumC3325v = (EnumC3325v) obj15;
                            try {
                                c3322s2.getClass();
                                int iOrdinal = enumC3325v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC3325v enumC3325v2 = EnumC3325v.f39700c;
                                    c3322s2.f39693a.getClass();
                                    throw new IllegalArgumentException(enumC3325v2 + " doesn't represent a native value.");
                                }
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
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled");
        if (c3322s != null) {
            final int i13 = 4;
            x76.n(new InterfaceC4265b() { // from class: kd.E
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3322s c3322s2 = c3322s;
                    switch (i13) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c3322s2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c3322s2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c3322s2.getClass();
                                listD3 = AbstractC3935e.C(new Y(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c3322s2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c3322s2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC3325v enumC3325v = (EnumC3325v) obj15;
                            try {
                                c3322s2.getClass();
                                int iOrdinal = enumC3325v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC3325v enumC3325v2 = EnumC3325v.f39700c;
                                    c3322s2.f39693a.getClass();
                                    throw new IllegalArgumentException(enumC3325v2 + " doesn't represent a native value.");
                                }
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
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode");
        if (c3322s == null) {
            x77.n(null);
        } else {
            final int i14 = 5;
            x77.n(new InterfaceC4265b() { // from class: kd.E
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    C3322s c3322s2 = c3322s;
                    switch (i14) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c3322s2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c3322s2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c3322s2.getClass();
                                listD3 = AbstractC3935e.C(new Y(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c3322s2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c3322s2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC3325v enumC3325v = (EnumC3325v) obj15;
                            try {
                                c3322s2.getClass();
                                int iOrdinal = enumC3325v.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC3325v enumC3325v2 = EnumC3325v.f39700c;
                                    c3322s2.f39693a.getClass();
                                    throw new IllegalArgumentException(enumC3325v2 + " doesn't represent a native value.");
                                }
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
                    }
                }
            });
        }
    }

    public static void R(Context context, int i5, String str, String str2, InterfaceC2864a interfaceC2864a, ic.b bVar) {
        int i10 = 8;
        int i11 = 1;
        int iF = 0;
        if (!gc.b.z(context, i5)) {
            interfaceC2864a.a();
            return;
        }
        if (str == null) {
            str = v.g("Your Device ", Build.MANUFACTURER, StringUtils.SPACE, Build.MODEL, " has additional battery optimization");
        }
        C2816b c2816b = new C2816b();
        c2816b.f36382a = context;
        c2816b.f36384c = false;
        c2816b.f36385d = str;
        c2816b.f36386e = str2;
        c2816b.f36387f = "Ok";
        c2816b.f36389h = new h(interfaceC2864a, i10);
        c2816b.f36390i = new h(bVar, 9);
        c2816b.f36383b = i5;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        }
        if (i5 == 0) {
            throw new NullPointerException("Action can't be null");
        }
        gc.b.f35862a = AbstractC2745a.a();
        if (!gc.b.z(c2816b.f36382a, c2816b.f36383b)) {
            Log.i(C2816b.class.getName(), "This action is not available for this device no need to show the dialog");
            return;
        }
        if (gc.b.f35862a == null) {
            Log.i(C2816b.class.getName(), "Device not in the list no need to show the dialog");
            return;
        }
        Context context2 = c2816b.f36382a;
        C3389e c3389e = new C3389e(context2);
        if (c2816b.f36387f == null) {
            c2816b.f36387f = c2816b.f36382a.getText(R.string.dialog_button).toString();
        }
        if (c2816b.f36388g == null) {
            c2816b.f36388g = c2816b.f36382a.getText(android.R.string.cancel).toString();
        }
        c3389e.k = c2816b.f36387f;
        View viewInflate = LayoutInflater.from(context2).inflate(R.layout.md_dialog_custom_view, (ViewGroup) null);
        if (viewInflate.getParent() != null && (viewInflate.getParent() instanceof ViewGroup)) {
            ((ViewGroup) viewInflate.getParent()).removeView(viewInflate);
        }
        c3389e.f39972m = viewInflate;
        c3389e.f39978s = new a2.v(c2816b, 11);
        c3389e.f39971l = c2816b.f36388g;
        c3389e.f39979t = new com.google.android.gms.ads.nativead.l(c2816b, 5);
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = a1.l.f17132a;
        c3389e.f39983x = resources.getDrawable(android.R.drawable.ic_dialog_alert, null);
        if (c2816b.f36385d.isEmpty()) {
            c3389e.f39962b = c2816b.f36382a.getString(R.string.dialog_title_notification, gc.b.f35862a.d().toString());
        } else {
            c3389e.f39962b = c2816b.f36385d;
        }
        if (c2816b.f36384c) {
            C2815a c2815a = new C2815a(c2816b, iF);
            c3389e.f39958C = context2.getResources().getText(R.string.dialog_do_not_show_again);
            c3389e.f39959D = c2815a;
        }
        if (c2816b.f36384c && c2816b.f36382a.getSharedPreferences("KillerManager", 0).getBoolean("DONT_SHOW_AGAIN".concat(com.google.android.gms.internal.consent_sdk.a.j(c2816b.f36383b)), false)) {
            return;
        }
        DialogC3391g dialogC3391g = new DialogC3391g(c3389e);
        dialogC3391g.show();
        View view = dialogC3391g.f39988c.f39972m;
        TextView textView = (TextView) view.findViewById(R.id.md_content);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.md_promptCheckbox);
        ImageView imageView = (ImageView) view.findViewById(R.id.md_imageView);
        String str3 = c2816b.f36386e;
        if (str3 == null || str3.isEmpty()) {
            textView.setText(String.format(c2816b.f36382a.getString(R.string.dialog_huawei_notification), c2816b.f36382a.getString(R.string.app_name)));
        } else {
            textView.setText(c2816b.f36386e);
        }
        if (c2816b.f36384c) {
            checkBox.setVisibility(0);
            checkBox.setText(R.string.dialog_do_not_show_again);
            checkBox.setOnCheckedChangeListener(new C2815a(c2816b, i11));
        }
        int iF2 = AbstractC0213f.f(c2816b.f36383b);
        if (iF2 == 0) {
            iF = gc.b.f35862a.f();
        } else if (iF2 == 1) {
            iF = gc.b.f35862a.g();
        } else if (iF2 == 2) {
            iF = gc.b.f35862a.h();
        }
        if (iF != 0) {
            imageView.setImageResource(iF);
        } else {
            imageView.setVisibility(8);
        }
    }

    public static final int S(int i5, int i10, String str) {
        while (i10 > i5 && I(str.charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    public static final int T(int i5, int i10, String str) {
        while (i5 < i10 && I(str.charAt(i5))) {
            i5++;
        }
        return i5;
    }

    public static String U(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static ArrayList V(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C2428g) {
            C2428g c2428g = (C2428g) th;
            arrayList.add(c2428g.f34269a);
            arrayList.add(c2428g.getMessage());
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static Object W(Context context, String str, m mVar) throws n {
        try {
            return mVar.zza(X(context).b(str));
        } catch (Exception e7) {
            throw new n(e7);
        }
    }

    public static C3934d X(Context context) throws n {
        try {
            return C3934d.c(context, C3934d.f44523b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e7) {
            throw new n(e7);
        }
    }

    public static C1913b a(AdShowListener adShowListener, u appLifecycleTrackerService, c customUserEventBuilderService, tf.a aVar, tf.a aVar2, AdFormatType adType, com.moloco.sdk.acm.recorder.c metricsRecorder, tf.a aVar3, int i5) {
        B sdkEventUrlTracker = (B) C.f28485a.getValue();
        j bUrlTracker = (j) com.moloco.sdk.internal.k.f28659a.getValue();
        Y2.B b5 = new Y2.B(metricsRecorder);
        tf.a aVar4 = (i5 & Segment.SHARE_MINIMUM) != 0 ? null : aVar3;
        AbstractC3340k.e(appLifecycleTrackerService, "appLifecycleTrackerService");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(sdkEventUrlTracker, "sdkEventUrlTracker");
        AbstractC3340k.e(bUrlTracker, "bUrlTracker");
        AbstractC3340k.e(adType, "adType");
        AbstractC3340k.e(metricsRecorder, "metricsRecorder");
        return new C1913b(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, aVar, aVar2, sdkEventUrlTracker, bUrlTracker, adType, metricsRecorder, b5, aVar4);
    }

    public static final void b(final v0 v0Var, final tf.a aVar, final tf.l lVar, final tf.c cVar, final boolean z2, C0740o c0740o, final int i5) {
        Object obj = C0427q.f2765a;
        c0740o.N(706979519);
        int i10 = i5 | (c0740o.e(obj) ? 4 : 2) | (c0740o.e(v0Var) ? 32 : 16) | (c0740o.e(aVar) ? 256 : 128) | (c0740o.e(lVar) ? 2048 : Segment.SHARE_MINIMUM) | (c0740o.e(cVar) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE) | (c0740o.f(z2) ? 131072 : 65536);
        if ((74899 & i10) == 74898 && c0740o.x()) {
            c0740o.I();
        } else {
            V vN = Fe.b.n(v0Var, c0740o, (i10 >> 3) & 14);
            c0740o.M(-2101080690);
            Object objF = c0740o.F();
            Object obj2 = C0732k.f7800a;
            if (objF == obj2) {
                objF = C0718d.G(0, P.f7730f);
                c0740o.U(objF);
            }
            V v2 = (V) objF;
            c0740o.p(false);
            C2515C c2515c = C2515C.f34653a;
            c0740o.M(-2101078598);
            boolean zE = c0740o.e(vN) | c0740o.e(v2);
            Object objF2 = c0740o.F();
            if (zE || objF2 == obj2) {
                objF2 = new r(vN, v2, null);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            C0718d.d(c0740o, c2515c, (p) objF2);
            int iIntValue = ((Number) v2.getValue()).intValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) vN.getValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d dVar = fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d) fVar : null;
            int i11 = dVar != null ? dVar.f31962a : 0;
            Boolean boolValueOf = Boolean.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) vN.getValue()) instanceof C2103c);
            Boolean boolValueOf2 = Boolean.valueOf(!(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) vN.getValue()) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e));
            Boolean boolValueOf3 = Boolean.valueOf(z2);
            C2537u c2537u = new C2537u(iIntValue);
            C2537u c2537u2 = new C2537u(i11);
            c0740o.M(-2101047518);
            Object objF3 = c0740o.F();
            if (objF3 == obj2) {
                objF3 = new com.moloco.sdk.service_locator.h(14);
                c0740o.U(objF3);
            }
            c0740o.p(false);
            int i12 = i10 << 3;
            cVar.invoke(obj, boolValueOf, boolValueOf2, aVar, lVar, boolValueOf3, c2537u, c2537u2, (tf.a) objF3, c0740o, Integer.valueOf((i12 & 7168) | (i10 & 14) | 100663296 | (57344 & i12) | (i10 & 458752) | ((i10 << 15) & 1879048192)));
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p(aVar, lVar, cVar, z2, i5) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ tf.a f30957b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ tf.l f30958c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ tf.c f30959d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f30960e;

                @Override // tf.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    tf.c cVar2 = this.f30959d;
                    boolean z10 = this.f30960e;
                    tg.b.b(this.f30956a, this.f30957b, this.f30958c, cVar2, z10, (C0740o) obj3, 1);
                    return C2515C.f34653a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y r9, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x r10, final tf.c r11, final tf.c r12, tf.c r13, N.C0740o r14, final int r15, final int r16) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x, tf.c, tf.c, tf.c, N.o, int, int):void");
    }

    public static final void d(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r imageResource, final Z.k kVar, C0740o c0740o, final int i5, final int i10) {
        int i11;
        AbstractC3340k.e(imageResource, "imageResource");
        c0740o.N(1666152349);
        if ((i5 & 6) == 0) {
            i11 = (c0740o.e(imageResource) ? 4 : 2) | i5;
        } else {
            i11 = i5;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i5 & 48) == 0) {
            i11 |= c0740o.e(kVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            if (i12 != 0) {
                kVar = Z.i.f16922a;
            }
            t.a(imageResource.f32078a, C3902g.f44297b, L.e(kVar, imageResource.f32079b, imageResource.f32080c), c0740o, 48);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.U
                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i13 = i5 | 1;
                    Z.k kVar2 = kVar;
                    int i14 = i10;
                    tg.b.d(imageResource, kVar2, (C0740o) obj, i13, i14);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final List e(Throwable th) {
        return AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
    }

    public static final void g(z zVar, String str, int i5, int i10, int i11) {
        if (i10 == -1) {
            int iT = T(i5, i11, str);
            int iS = S(iT, i11, str);
            if (iS > iT) {
                String strSubstring = str.substring(iT, iS);
                AbstractC3340k.d(strSubstring, "substring(...)");
                zVar.f(strSubstring, ff.v.f35432a);
                return;
            }
            return;
        }
        int iT2 = T(i5, i10, str);
        int iS2 = S(iT2, i10, str);
        if (iS2 > iT2) {
            String strSubstring2 = str.substring(iT2, iS2);
            AbstractC3340k.d(strSubstring2, "substring(...)");
            int iT3 = T(i10 + 1, i11, str);
            String strSubstring3 = str.substring(iT3, S(iT3, i11, str));
            AbstractC3340k.d(strSubstring3, "substring(...)");
            zVar.z(strSubstring2, strSubstring3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(androidx.lifecycle.AbstractC1451o r6, lf.AbstractC3464c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof k4.b
            if (r0 == 0) goto L13
            r0 = r7
            k4.b r0 = (k4.b) r0
            int r1 = r0.f39261d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39261d = r1
            goto L18
        L13:
            k4.b r0 = new k4.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f39260c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f39261d
            ef.C r3 = ef.C2515C.f34653a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.G r6 = r0.f39259b
            androidx.lifecycle.o r0 = r0.f39258a
            Fe.e.U(r7)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L2d:
            r7 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Fe.e.U(r7)
            androidx.lifecycle.n r7 = r6.b()
            androidx.lifecycle.n r2 = androidx.lifecycle.EnumC1450n.f18679d
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L47
            return r3
        L47:
            kotlin.jvm.internal.G r7 = new kotlin.jvm.internal.G
            r7.<init>()
            r0.f39258a = r6     // Catch: java.lang.Throwable -> L7b
            r0.f39259b = r7     // Catch: java.lang.Throwable -> L7b
            r0.f39261d = r4     // Catch: java.lang.Throwable -> L7b
            Ef.n r2 = new Ef.n     // Catch: java.lang.Throwable -> L7b
            jf.c r0 = A6.h.A(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7b
            r2.t()     // Catch: java.lang.Throwable -> L7b
            k4.c r0 = new k4.c     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            r7.f39740a = r0     // Catch: java.lang.Throwable -> L7b
            r6.a(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r2.s()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r6
            r6 = r7
        L71:
            java.lang.Object r6 = r6.f39740a
            androidx.lifecycle.u r6 = (androidx.lifecycle.InterfaceC1456u) r6
            if (r6 == 0) goto L7a
            r0.c(r6)
        L7a:
            return r3
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            java.lang.Object r6 = r6.f39740a
            androidx.lifecycle.u r6 = (androidx.lifecycle.InterfaceC1456u) r6
            if (r6 == 0) goto L89
            r0.c(r6)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.i(androidx.lifecycle.o, lf.c):java.lang.Object");
    }

    public static C2761h m(C2761h c2761h) {
        C2759f c2759f = c2761h.f35910a;
        c2759f.c();
        return c2759f.f35903i > 0 ? c2761h : C2761h.f35909b;
    }

    public static boolean n(String str) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()));
            String line = bufferedReader.readLine();
            bufferedReader.close();
            return line != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Object o(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean p(boolean z2) {
        if (!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(B("ro.debuggable")) || z2) {
            return "0".equals(B("ro.secure")) ? !z2 : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(B("service.adb.root")) && !z2;
        }
        return true;
    }

    public static final void q(int i5, int i10) {
        if (i5 < 0 || i5 >= i10) {
            throw new IndexOutOfBoundsException(v.e(i5, i10, "index: ", ", size: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.r():boolean");
    }

    public static final void s(int i5, int i10) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(v.e(i5, i10, "index: ", ", size: "));
        }
    }

    public static void t(int i5) {
        if (2 > i5 || i5 >= 37) {
            StringBuilder sbL = pd.f.l(i5, "radix ", " was not in valid range ");
            sbL.append(new zf.g(2, 36, 1));
            throw new IllegalArgumentException(sbL.toString());
        }
    }

    public static final void u(int i5, int i10, int i11) {
        if (i5 < 0 || i10 > i11) {
            StringBuilder sbH = v.h("fromIndex: ", i5, ", toIndex: ", i10, ", size: ");
            sbH.append(i11);
            throw new IndexOutOfBoundsException(sbH.toString());
        }
        if (i5 > i10) {
            throw new IllegalArgumentException(v.e(i5, i10, "fromIndex: ", " > toIndex: "));
        }
    }

    public static boolean v() {
        String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i5 = 0; i5 < 9; i5++) {
            if (new File(strArr[i5]).exists()) {
                return true;
            }
        }
        return n("which su") || n("type su") || n("su --version");
    }

    public static boolean w(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i5 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i5 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean x(char c10, char c11, boolean z2) {
        if (c10 == c11) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final f y(View view) {
        return (f) Af.n.X(Af.n.d0(Af.n.a0(view, n3.g.f40913j), n3.g.k));
    }

    public static final int z(E0.l fontWeight, int i5) {
        AbstractC3340k.e(fontWeight, "fontWeight");
        boolean z2 = fontWeight.compareTo(E0.l.f2796b) >= 0;
        boolean z10 = i5 == 1;
        if (z10 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z10 ? 2 : 0;
    }

    public abstract void J(Throwable th);

    public abstract void K(X7 x72);
}
