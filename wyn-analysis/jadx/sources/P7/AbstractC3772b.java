package p7;

import A.AbstractC0226t;
import A.C0212e;
import A7.RunnableC0299w0;
import C8.i;
import D6.C0395s;
import D6.v1;
import E.AbstractC0426p;
import E.N;
import E.Q;
import Hf.x0;
import Jd.C0672f;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.V;
import U8.v0;
import Va.M6;
import Va.X7;
import W9.p;
import W9.s;
import W9.t;
import Z.k;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.webkit.HttpAuthHandler;
import android.widget.EdgeEffect;
import androidx.datastore.preferences.protobuf.i0;
import b1.C1496e;
import ba.C1521a;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzflg;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.F;
import com.moloco.sdk.internal.ortb.model.H;
import com.moloco.sdk.internal.ortb.model.J;
import com.moloco.sdk.internal.ortb.model.L;
import com.moloco.sdk.internal.ortb.model.P;
import com.moloco.sdk.internal.ortb.model.W;
import com.moloco.sdk.service_locator.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.A0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.B0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.E;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import d0.C2384c;
import ef.C2515C;
import ff.v;
import g0.InterfaceC2663d;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.AbstractC3230e0;
import ka.AbstractC3256n;
import kd.C3306b;
import kd.C3322s;
import kotlin.jvm.internal.AbstractC3340k;
import n1.AbstractC3568b;
import n1.AbstractC3569c;
import n7.AbstractC3598c;
import n9.C3610e;
import p7.AbstractC3772b;
import r7.AbstractC3935e;
import r9.InterfaceC3940A;
import r9.InterfaceC3944a;
import r9.InterfaceC3945b;
import r9.InterfaceC3949f;
import r9.w;
import r9.z;
import s8.g;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import w8.d;
import w9.InterfaceC4396o;
import x.C4410c;
import x.C4412e;
import x.C4429v;
import x0.C4441k;

/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3772b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f43263a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f43264b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f43265c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f43266d = 0;

    public static final String A(Charset charset) {
        AbstractC3340k.e(charset, "<this>");
        String strName = charset.name();
        AbstractC3340k.d(strName, "name(...)");
        return strName;
    }

    public static t F(Map map) {
        Object obj = map.get(PglCryptUtils.KEY_MESSAGE);
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("to");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        Bundle bundle = new Bundle();
        C4412e c4412e = new C4412e(0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid to: ".concat(str));
        }
        bundle.putString("google.to", str);
        String str2 = (String) map2.get("collapseKey");
        String str3 = (String) map2.get("messageId");
        String str4 = (String) map2.get("messageType");
        Integer num = (Integer) map2.get("ttl");
        Map map3 = (Map) map2.get(JsonStorageKeyNames.DATA_KEY);
        if (str2 != null) {
            bundle.putString("collapse_key", str2);
        }
        if (str4 != null) {
            bundle.putString("message_type", str4);
        }
        if (str3 != null) {
            bundle.putString("google.message_id", str3);
        }
        if (num != null) {
            bundle.putString("google.ttl", String.valueOf(num.intValue()));
        }
        if (map3 != null) {
            c4412e.clear();
            c4412e.putAll(map3);
        }
        Bundle bundle2 = new Bundle();
        Iterator it = ((i0) c4412e.entrySet()).iterator();
        while (true) {
            C4410c c4410c = (C4410c) it;
            if (!c4410c.hasNext()) {
                bundle2.putAll(bundle);
                bundle.remove("from");
                return new t(bundle2);
            }
            c4410c.next();
            C4410c c4410c2 = c4410c;
            bundle2.putString((String) c4410c2.getKey(), (String) c4410c2.getValue());
        }
    }

    public static synchronized boolean H(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f43263a;
        if (context2 != null && (bool = f43264b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f43264b = null;
        if (AbstractC3598c.h()) {
            f43264b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f43264b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f43264b = Boolean.FALSE;
            }
        }
        f43263a = applicationContext;
        return f43264b.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db A[PHI: r6
  0x00db: PHI (r6v22 java.lang.String) = (r6v21 java.lang.String), (r6v34 java.lang.String) binds: [B:46:0x00c3, B:50:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void K(android.content.Intent r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC3772b.K(android.content.Intent):void");
    }

    public static void L(Bundle bundle, String str) {
        try {
            g.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e7);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String str2 = p.l(bundle) ? "display" : JsonStorageKeyNames.DATA_KEY;
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            d dVar = (d) g.e().c(d.class);
            if (dVar != null) {
                dVar.b("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static float M(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC3569c.c(edgeEffect, f10, f11);
        }
        AbstractC3568b.a(edgeEffect, f10, f11);
        return f10;
    }

    public static HashMap N(t tVar) throws NumberFormatException {
        int iIntValue;
        long jLongValue;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (tVar.f15385a.getString("collapse_key") != null) {
            map.put("collapseKey", tVar.f15385a.getString("collapse_key"));
        }
        if (tVar.f15385a.getString("from") != null) {
            map.put("from", tVar.f15385a.getString("from"));
        }
        if (tVar.f15385a.getString("google.to") != null) {
            map.put("to", tVar.f15385a.getString("google.to"));
        }
        if (tVar.W() != null) {
            map.put("messageId", tVar.W());
        }
        if (tVar.f15385a.getString("message_type") != null) {
            map.put("messageType", tVar.f15385a.getString("message_type"));
        }
        if (((C4429v) tVar.V()).f47563c > 0) {
            for (Map.Entry entry : ((C4412e) tVar.V()).entrySet()) {
                map2.put((String) entry.getKey(), entry.getValue());
            }
        }
        map.put(JsonStorageKeyNames.DATA_KEY, map2);
        Bundle bundle = tVar.f15385a;
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            iIntValue = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                iIntValue = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            }
        } else {
            iIntValue = 0;
        }
        map.put("ttl", Integer.valueOf(iIntValue));
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            jLongValue = ((Long) obj2).longValue();
        } else if (obj2 instanceof String) {
            try {
                jLongValue = Long.parseLong((String) obj2);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
            }
        } else {
            jLongValue = 0;
        }
        map.put("sentTime", Long.valueOf(jLongValue));
        if (tVar.X() != null) {
            s sVarX = tVar.X();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            String str = sVarX.f15368a;
            if (str != null) {
                map3.put("title", str);
            }
            String str2 = sVarX.f15369b;
            if (str2 != null) {
                map3.put("titleLocKey", str2);
            }
            String[] strArr = sVarX.f15370c;
            if (strArr != null) {
                map3.put("titleLocArgs", Arrays.asList(strArr));
            }
            String str3 = sVarX.f15371d;
            if (str3 != null) {
                map3.put("body", str3);
            }
            String str4 = sVarX.f15372e;
            if (str4 != null) {
                map3.put("bodyLocKey", str4);
            }
            String[] strArr2 = sVarX.f15373f;
            if (strArr2 != null) {
                map3.put("bodyLocArgs", Arrays.asList(strArr2));
            }
            String str5 = sVarX.f15379m;
            if (str5 != null) {
                map4.put("channelId", str5);
            }
            String str6 = sVarX.f15378l;
            if (str6 != null) {
                map4.put("clickAction", str6);
            }
            String str7 = sVarX.k;
            if (str7 != null) {
                map4.put("color", str7);
            }
            String str8 = sVarX.f15374g;
            if (str8 != null) {
                map4.put("smallIcon", str8);
            }
            String str9 = sVarX.f15375h;
            if ((str9 != null ? Uri.parse(str9) : null) != null) {
                map4.put("imageUrl", (str9 != null ? Uri.parse(str9) : null).toString());
            }
            Uri uri = sVarX.f15380n;
            if (uri != null) {
                map4.put("link", uri.toString());
            }
            Integer num = sVarX.f15384r;
            if (num != null) {
                map4.put("count", num);
            }
            Integer num2 = sVarX.f15382p;
            if (num2 != null) {
                map4.put("priority", num2);
            }
            String str10 = sVarX.f15376i;
            if (str10 != null) {
                map4.put("sound", str10);
            }
            String str11 = sVarX.f15381o;
            if (str11 != null) {
                map4.put("ticker", str11);
            }
            Integer num3 = sVarX.f15383q;
            if (num3 != null) {
                map4.put("visibility", num3);
            }
            String str12 = sVarX.f15377j;
            if (str12 != null) {
                map4.put("tag", str12);
            }
            map3.put("android", map4);
            map.put("notification", map3);
        }
        return map;
    }

    public static void Q(InterfaceC4269f binaryMessenger, final C3322s c3322s) {
        i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (c3322s == null || (iVar = c3322s.f39693a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword");
        if (c3322s != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.A
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3322s c3322s2 = c3322s;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c3322s2.getClass();
                                listD = AbstractC3935e.C(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
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
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c3322s2.getClass();
                                httpAuthHandler2.cancel();
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c3322s2.getClass();
                                httpAuthHandler3.proceed(str, str2);
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
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel");
        if (c3322s != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: kd.A
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3322s c3322s2 = c3322s;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c3322s2.getClass();
                                listD = AbstractC3935e.C(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
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
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c3322s2.getClass();
                                httpAuthHandler2.cancel();
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c3322s2.getClass();
                                httpAuthHandler3.proceed(str, str2);
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
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed");
        if (c3322s == null) {
            x74.n(null);
        } else {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: kd.A
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3322s c3322s2 = c3322s;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                c3322s2.getClass();
                                listD = AbstractC3935e.C(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
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
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                c3322s2.getClass();
                                httpAuthHandler2.cancel();
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
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c3322s2.getClass();
                                httpAuthHandler3.proceed(str, str2);
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

    public static boolean R(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(extras.getString("google.c.a.e"));
    }

    public static void U(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final N V(Q q4, Q insets) {
        AbstractC3340k.e(insets, "insets");
        return new N(q4, insets);
    }

    public static int W(int i5) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i5) {
                return i11;
            }
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String X(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "unspecified"
            return r1
        L9:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L62;
                case 1743582863: goto L58;
                case 1743582864: goto L4e;
                case 1743582865: goto L44;
                case 1743582866: goto L3a;
                case 1743582867: goto L30;
                case 1743582868: goto L26;
                case 1743582869: goto L1c;
                case 1743582870: goto L11;
                default: goto L10;
            }
        L10:
            goto L6c
        L11:
            java.lang.String r0 = "requester_type_8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 8
            goto L6d
        L1c:
            java.lang.String r0 = "requester_type_7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 7
            goto L6d
        L26:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 6
            goto L6d
        L30:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 5
            goto L6d
        L3a:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 4
            goto L6d
        L44:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 3
            goto L6d
        L4e:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 2
            goto L6d
        L58:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 1
            goto L6d
        L62:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 0
            goto L6d
        L6c:
            r0 = -1
        L6d:
            switch(r0) {
                case 0: goto L89;
                case 1: goto L86;
                case 2: goto L83;
                case 3: goto L80;
                case 4: goto L7d;
                case 5: goto L7a;
                case 6: goto L77;
                case 7: goto L74;
                case 8: goto L71;
                default: goto L70;
            }
        L70:
            return r1
        L71:
            java.lang.String r1 = "8"
            return r1
        L74:
            java.lang.String r1 = "7"
            return r1
        L77:
            java.lang.String r1 = "6"
            return r1
        L7a:
            java.lang.String r1 = "5"
            return r1
        L7d:
            java.lang.String r1 = "4"
            return r1
        L80:
            java.lang.String r1 = "3"
            return r1
        L83:
            java.lang.String r1 = "2"
            return r1
        L86:
            java.lang.String r1 = "1"
            return r1
        L89:
            java.lang.String r1 = "0"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC3772b.X(java.lang.String):java.lang.String");
    }

    public static String Y(v1 v1Var) {
        Bundle bundle;
        return (v1Var == null || (bundle = v1Var.f2506c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfqv Z(android.os.Bundle r1) {
        /*
            java.lang.String r0 = "com.google.ads.mediation.admob.AdMobAdapter"
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 == 0) goto L9
            r1 = r0
        L9:
            java.lang.String r0 = "query_info_type"
            java.lang.String r1 = r1.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_UNSPECIFIED
            return r1
        L18:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L71;
                case 1743582863: goto L67;
                case 1743582864: goto L5d;
                case 1743582865: goto L53;
                case 1743582866: goto L49;
                case 1743582867: goto L3f;
                case 1743582868: goto L35;
                case 1743582869: goto L2b;
                case 1743582870: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L7b
        L20:
            java.lang.String r0 = "requester_type_8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 8
            goto L7c
        L2b:
            java.lang.String r0 = "requester_type_7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 7
            goto L7c
        L35:
            java.lang.String r0 = "requester_type_6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 6
            goto L7c
        L3f:
            java.lang.String r0 = "requester_type_5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 5
            goto L7c
        L49:
            java.lang.String r0 = "requester_type_4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 4
            goto L7c
        L53:
            java.lang.String r0 = "requester_type_3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 3
            goto L7c
        L5d:
            java.lang.String r0 = "requester_type_2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 2
            goto L7c
        L67:
            java.lang.String r0 = "requester_type_1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 1
            goto L7c
        L71:
            java.lang.String r0 = "requester_type_0"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7b
            r1 = 0
            goto L7c
        L7b:
            r1 = -1
        L7c:
            switch(r1) {
                case 0: goto L9a;
                case 1: goto L97;
                case 2: goto L94;
                case 3: goto L91;
                case 4: goto L8e;
                case 5: goto L8b;
                case 6: goto L88;
                case 7: goto L85;
                case 8: goto L82;
                default: goto L7f;
            }
        L7f:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_UNSPECIFIED
            return r1
        L82:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_GAM_S2S
            return r1
        L85:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_GUILDER
            return r1
        L88:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_PAW
            return r1
        L8b:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_UNITY
            return r1
        L8e:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_YAVIN
            return r1
        L91:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_GOLDENEYE
            return r1
        L94:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_GBID
            return r1
        L97:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_INBOUND_MEDIATION
            return r1
        L9a:
            com.google.android.gms.internal.ads.zzfqv r1 = com.google.android.gms.internal.ads.zzfqv.SCAR_REQUEST_TYPE_ADMOB
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC3772b.Z(android.os.Bundle):com.google.android.gms.internal.ads.zzfqv");
    }

    public static final z0 a(F f10) {
        C0 c02;
        A0 a02;
        E0 e02;
        AbstractC3340k.e(f10, "<this>");
        J j8 = f10.f28712i;
        String str = j8 != null ? j8.f28720a : null;
        Integer num = j8 != null ? j8.f28721b : null;
        com.moloco.sdk.internal.ortb.model.N n10 = f10.f28709f;
        if (n10 != null) {
            L l10 = n10.f28733e;
            c02 = new C0(n10.f28729a, n10.f28730b, n10.f28731c, n10.f28732d, l10 != null ? b(l10) : null, n10.f28734f, n10.f28735g);
        } else {
            c02 = null;
        }
        H h10 = f10.f28710g;
        if (h10 != null) {
            L l11 = h10.f28717c;
            a02 = new A0(h10.f28715a, h10.f28716b, l11 != null ? b(l11) : null);
        } else {
            a02 = null;
        }
        P p10 = f10.f28711h;
        if (p10 != null) {
            String str2 = p10.f28739b;
            if (str2 == null) {
                str2 = "#FFFFFF00";
            }
            String str3 = str2;
            String str4 = p10.f28740c;
            if (str4 == null) {
                str4 = "#FF888888";
            }
            String str5 = str4;
            Integer num2 = p10.f28741d;
            int iIntValue = num2 != null ? num2.intValue() : 12;
            Integer num3 = p10.f28742e;
            e02 = new E0(p10.f28738a, str3, str5, iIntValue, num3 != null ? num3.intValue() : 9);
        } else {
            e02 = null;
        }
        return new z0(str, f10.f28705b, f10.f28706c, f10.f28704a, f10.f28707d, num, c02, a02, e02);
    }

    public static void a0(zzdzy zzdzyVar, String str, Pair... pairArr) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhZ)).booleanValue()) {
            zzcfy.zza.execute(new RunnableC0299w0(16, zzdzyVar, str, pairArr, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ff.v] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static final B0 b(L l10) {
        ?? arrayList;
        AbstractC3340k.e(l10, "<this>");
        List list = l10.f28726b;
        if (list != null) {
            arrayList = new ArrayList(ff.p.a0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((W) it.next()).f28751a);
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = v.f35432a;
        }
        return new B0(l10.f28725a, arrayList);
    }

    public static int b0(zzflg zzflgVar) {
        if (zzflgVar.zzs) {
            return 2;
        }
        v1 v1Var = zzflgVar.zzd;
        D6.Q q4 = v1Var.f2521s;
        String str = v1Var.f2526x;
        if (q4 == null && str == null) {
            return 1;
        }
        if (q4 == null || str == null) {
            return q4 != null ? 3 : 4;
        }
        return 5;
    }

    public static void c() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        WeakReference weakReference = FullscreenWebviewActivity.f30710d;
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Closing ad", null, false, 12, null);
        FullscreenWebviewActivity.f30710d.clear();
        x0 x0Var = FullscreenWebviewActivity.f30713g;
        if (x0Var != null) {
            x0Var.k(null, Boolean.FALSE);
        }
        FullscreenWebviewActivity.f30713g = null;
        FullscreenWebviewActivity fullscreenWebviewActivity = (FullscreenWebviewActivity) FullscreenWebviewActivity.f30711e.get();
        if (fullscreenWebviewActivity != null && !fullscreenWebviewActivity.isFinishing() && !fullscreenWebviewActivity.isDestroyed()) {
            fullscreenWebviewActivity.finish();
        }
        FullscreenWebviewActivity.f30711e.clear();
        FullscreenWebviewActivity.f30712f.clear();
    }

    public static void d(Context context, x0 isAdDisplayingEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c webviewAd, com.moloco.sdk.acm.recorder.c cVar, x0 isAdForciblyClosed) {
        AbstractC3340k.e(isAdDisplayingEvent, "isAdDisplayingEvent");
        AbstractC3340k.e(webviewAd, "webviewAd");
        AbstractC3340k.e(isAdForciblyClosed, "isAdForciblyClosed");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        WeakReference weakReference = FullscreenWebviewActivity.f30710d;
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Showing ad", null, false, 12, null);
        FullscreenWebviewActivity.f30710d = new WeakReference(webviewAd);
        FullscreenWebviewActivity.f30713g = isAdDisplayingEvent;
        FullscreenWebviewActivity.f30714h = isAdForciblyClosed;
        FullscreenWebviewActivity.f30712f = new WeakReference(cVar);
        Intent intent = new Intent(context, (Class<?>) FullscreenWebviewActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    public static final void e(final boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar, k kVar, final long j8, C0740o c0740o, final int i5) {
        k kVar2;
        float f10;
        Object e7;
        final C0212e c0212e;
        ?? r82;
        Object obj;
        final k kVar3;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p progress = pVar;
        AbstractC3340k.e(progress, "progress");
        c0740o.N(632891183);
        if (((i5 | (c0740o.f(z2) ? 4 : 2) | (c0740o.e(progress) ? 32 : 16) | 384 | (c0740o.d(j8) ? 2048 : Segment.SHARE_MINIMUM)) & 1171) == 1170 && c0740o.x()) {
            c0740o.I();
            kVar3 = kVar;
        } else {
            c0740o.K();
            if ((i5 & 1) == 0 || c0740o.w()) {
                kVar2 = Z.i.f16922a;
            } else {
                c0740o.I();
                kVar2 = kVar;
            }
            c0740o.q();
            final float f11 = 4;
            Object[] objArr = new Object[0];
            c0740o.M(-1652713005);
            Object objF = c0740o.F();
            Object obj2 = C0732k.f7800a;
            if (objF == obj2) {
                objF = new h(19);
                c0740o.U(objF);
            }
            c0740o.p(false);
            V v2 = (V) gc.b.E(objArr, null, (tf.a) objF, c0740o, 3072, 6);
            if (progress instanceof l) {
                f10 = 100.0f;
            } else {
                if (progress instanceof n) {
                    long j10 = ((n) progress).f32075b;
                    if (j10 != 0) {
                        f10 = (float) (r5.f32074a / j10);
                    }
                } else if (!(progress instanceof o) && !progress.equals(m.f32073a)) {
                    throw new E5.Q((byte) 0, 9);
                }
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float fMax = Math.max(f10, ((Number) v2.getValue()).floatValue());
            c0740o.M(-1652708774);
            Object objF2 = c0740o.F();
            if (objF2 == obj2) {
                objF2 = AbstractC0226t.a(fMax);
                c0740o.U(objF2);
            }
            C0212e c0212e2 = (C0212e) objF2;
            c0740o.p(false);
            v2.setValue(Float.valueOf(((Number) c0212e2.d()).floatValue()));
            Boolean boolValueOf = Boolean.valueOf(z2);
            c0740o.M(-1652703908);
            boolean zE = c0740o.e(c0212e2) | c0740o.b(fMax) | c0740o.f(z2) | c0740o.e(progress);
            Object objF3 = c0740o.F();
            if (zE || objF3 == obj2) {
                c0212e = c0212e2;
                r82 = 0;
                obj = obj2;
                e7 = new E(c0212e, fMax, z2, pVar, null);
                progress = pVar;
                c0740o.U(e7);
            } else {
                c0212e = c0212e2;
                r82 = 0;
                e7 = objF3;
                obj = obj2;
            }
            c0740o.p(r82);
            C0718d.f(progress, boolValueOf, (tf.p) e7, c0740o);
            k kVarB = E.L.b(kVar2, f11);
            c0740o.M(-1652687792);
            boolean zE2 = c0740o.e(c0212e) | c0740o.b(f11) | c0740o.d(j8);
            Object objF4 = c0740o.F();
            if (zE2 || objF4 == obj) {
                objF4 = new tf.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C
                    @Override // tf.l
                    public final Object invoke(Object obj3) {
                        InterfaceC2663d drawBehind = (InterfaceC2663d) obj3;
                        AbstractC3340k.e(drawBehind, "$this$drawBehind");
                        long jI = com.moloco.sdk.internal.publisher.H.I(d0.f.d(drawBehind.c()) * ((Number) c0212e.d()).floatValue(), d0.f.b(drawBehind.c()));
                        float f12 = f11;
                        long jA = Fe.g.a(f12, f12);
                        drawBehind.z(j8, C2384c.f33931b, jI, jA, g0.f.f35488b);
                        return C2515C.f34653a;
                    }
                };
                c0740o.U(objF4);
            }
            c0740o.p(r82);
            AbstractC0426p.a(AbstractC3230e0.m(kVarB, (tf.l) objF4), c0740o, r82);
            kVar3 = kVar2;
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p(z2, progress, kVar3, j8, i5) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.D

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f31708a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p f31709b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Z.k f31710c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f31711d;

                @Override // tf.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    Z.k kVar4 = this.f31710c;
                    long j11 = this.f31711d;
                    AbstractC3772b.e(this.f31708a, this.f31709b, kVar4, j11, (C0740o) obj3, 1);
                    return C2515C.f34653a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(Gf.t r4, tf.a r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof Gf.q
            if (r0 == 0) goto L13
            r0 = r6
            Gf.q r0 = (Gf.q) r0
            int r1 = r0.f4836c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4836c = r1
            goto L18
        L13:
            Gf.q r0 = new Gf.q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4835b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f4836c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            tf.a r5 = r0.f4834a
            Fe.e.U(r6)     // Catch: java.lang.Throwable -> L29
            goto L64
        L29:
            r4 = move-exception
            goto L6a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            Fe.e.U(r6)
            jf.h r6 = r0.getContext()
            Ef.l0 r2 = Ef.C0499l0.f3748a
            jf.f r6 = r6.get(r2)
            if (r6 != r4) goto L6e
            r0.f4834a = r5     // Catch: java.lang.Throwable -> L29
            r0.f4836c = r3     // Catch: java.lang.Throwable -> L29
            Ef.n r6 = new Ef.n     // Catch: java.lang.Throwable -> L29
            jf.c r0 = A6.h.A(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.t()     // Catch: java.lang.Throwable -> L29
            Gf.r r0 = new Gf.r     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            Gf.s r4 = (Gf.s) r4     // Catch: java.lang.Throwable -> L29
            r4.c0(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.s()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L64
            return r1
        L64:
            r5.invoke()
            ef.C r4 = ef.C2515C.f34653a
            return r4
        L6a:
            r5.invoke()
            throw r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC3772b.f(Gf.t, tf.a, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ff.v] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean g(ArrayList arrayList) {
        Collection arrayList2;
        long j8;
        if (arrayList.size() >= 2) {
            if (arrayList.size() == 0 || arrayList.size() == 1) {
                arrayList2 = v.f35432a;
            } else {
                arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iZ = AbstractC3935e.z(arrayList);
                int i5 = 0;
                while (i5 < iZ) {
                    i5++;
                    Object obj2 = arrayList.get(i5);
                    C4441k c4441k = (C4441k) obj2;
                    C4441k c4441k2 = (C4441k) obj;
                    arrayList2.add(new C2384c(v0.f(Math.abs(C2384c.b(c4441k2.d().a()) - C2384c.b(c4441k.d().a())), Math.abs(C2384c.c(c4441k2.d().a()) - C2384c.c(c4441k.d().a())))));
                    obj = obj2;
                }
            }
            if (arrayList2.size() == 1) {
                j8 = ((C2384c) ff.o.q0(arrayList2)).f33935a;
            } else {
                if (arrayList2.isEmpty()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object objQ0 = ff.o.q0(arrayList2);
                int iZ2 = AbstractC3935e.z(arrayList2);
                if (1 <= iZ2) {
                    int i10 = 1;
                    while (true) {
                        objQ0 = new C2384c(C2384c.f(((C2384c) objQ0).f33935a, ((C2384c) arrayList2.get(i10)).f33935a));
                        if (i10 == iZ2) {
                            break;
                        }
                        i10++;
                    }
                }
                j8 = ((C2384c) objQ0).f33935a;
            }
            if (C2384c.c(j8) >= C2384c.b(j8)) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(C1496e[] c1496eArr, C1496e[] c1496eArr2) {
        if (c1496eArr == null || c1496eArr2 == null || c1496eArr.length != c1496eArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < c1496eArr.length; i5++) {
            C1496e c1496e = c1496eArr[i5];
            char c10 = c1496e.f19126a;
            C1496e c1496e2 = c1496eArr2[i5];
            if (c10 != c1496e2.f19126a || c1496e.f19127b.length != c1496e2.f19127b.length) {
                return false;
            }
        }
        return true;
    }

    public static final Charset i(C0672f c0672f) {
        AbstractC3340k.e(c0672f, "<this>");
        String strL = c0672f.l("charset");
        if (strL == null) {
            return null;
        }
        try {
            Charset charset = Bf.a.f1670a;
            Charset charsetForName = Charset.forName(strL);
            AbstractC3340k.d(charsetForName, "forName(...)");
            return charsetForName;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final void j(Long l10, long j8, Jd.s method) {
        AbstractC3340k.e(method, "method");
        if (l10 == null || l10.longValue() < 0) {
            return;
        }
        Jd.s sVar = Jd.s.f6065b;
        if (method.equals(Jd.s.f6067d) || l10.longValue() == j8) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l10 + " bytes, but received " + j8 + " bytes").toString());
    }

    public static int k(int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (i5 == 90) {
            return 1;
        }
        if (i5 == 180) {
            return 2;
        }
        if (i5 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i5, "Invalid rotation: "));
    }

    public static float[] l(float[] fArr, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i5, length);
        float[] fArr2 = new float[i5];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final void m(int i5, int i10) {
        if (i5 > i10) {
            throw new IndexOutOfBoundsException(N0.a.e("toIndex (", i5, ") is greater than size (", i10, ")."));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b1.C1496e[] n(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC3772b.n(java.lang.String):b1.e[]");
    }

    public static Path o(String str) {
        Path path = new Path();
        try {
            C1496e.b(n(str), path);
            return path;
        } catch (RuntimeException e7) {
            throw new RuntimeException("Error in parsing ".concat(str), e7);
        }
    }

    public static C1496e[] p(C1496e[] c1496eArr) {
        C1496e[] c1496eArr2 = new C1496e[c1496eArr.length];
        for (int i5 = 0; i5 < c1496eArr.length; i5++) {
            c1496eArr2[i5] = new C1496e(c1496eArr[i5]);
        }
        return c1496eArr2;
    }

    public static boolean q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            g.e();
            g gVarE = g.e();
            gVarE.a();
            Context context = gVarE.f45328a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final byte[] r(CharsetEncoder charsetEncoder, String input, int i5, int i10) {
        AbstractC3340k.e(charsetEncoder, "<this>");
        AbstractC3340k.e(input, "input");
        if (i5 == 0 && i10 == input.length()) {
            byte[] bytes = input.getBytes(charsetEncoder.charset());
            AbstractC3340k.d(bytes, "getBytes(...)");
            return bytes;
        }
        String strSubstring = input.substring(i5, i10);
        AbstractC3340k.d(strSubstring, "substring(...)");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        AbstractC3340k.d(bytes2, "getBytes(...)");
        return bytes2;
    }

    public static final int t(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static float w(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC3569c.b(edgeEffect) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public abstract w B();

    public abstract String[] C(Class cls);

    public abstract z D();

    public abstract InterfaceC3940A E();

    public abstract r9.Q G();

    public abstract boolean I(Class cls);

    public abstract boolean J();

    public abstract Object O(String str, InterfaceC4396o interfaceC4396o);

    public abstract void P(String str, Runnable runnable);

    public abstract void S();

    public abstract void T();

    public abstract Method s(Class cls, Field field);

    public abstract InterfaceC3944a u();

    public abstract Constructor v(Class cls);

    public abstract InterfaceC3945b x(C3610e c3610e);

    public abstract InterfaceC3949f y(C3610e c3610e);

    public abstract r9.v z(C3610e c3610e, InterfaceC3949f interfaceC3949f);
}
