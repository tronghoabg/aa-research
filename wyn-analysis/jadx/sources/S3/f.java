package S3;

import Cd.s0;
import E.AbstractC0419i;
import E.AbstractC0426p;
import E.C0420j;
import E.J;
import E.L;
import E5.o0;
import J5.y;
import K.I;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.P;
import Q1.x;
import Va.M6;
import Va.X7;
import X0.E;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.zzcaf;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.C1915d;
import com.wynauto.wyn.R;
import e0.C2452d;
import e0.C2465q;
import ef.C2515C;
import ff.v;
import i0.C2826d;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import k1.InterfaceC3122i;
import k1.Q;
import k1.S;
import k1.h0;
import k1.i0;
import k1.j0;
import k1.k0;
import k1.v0;
import k8.C3208q;
import k8.C3209r;
import k8.InterfaceC3207p;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import lc.C3458b;
import ld.InterfaceC3460b;
import ld.InterfaceC3461c;
import o8.C3656b;
import org.apache.tika.fork.ForkServer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r0.InterfaceC3909n;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4044I;
import t0.InterfaceC4055c;
import t0.t;
import u0.C4188n;
import u0.InterfaceC4193p0;
import u0.M;
import vf.AbstractC4345a;
import x.C4412e;
import x0.C4438h;
import x0.C4440j;
import x0.InterfaceC4439i;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    public static int f10943b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static int f10944c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f10945d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static int f10946e = 17;

    /* renamed from: f, reason: collision with root package name */
    public static X7 f10947f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f10948g = "Overlay is activated";

    /* renamed from: h, reason: collision with root package name */
    public static String f10949h = "Tap to edit settings or disable";

    /* renamed from: i, reason: collision with root package name */
    public static String f10950i = "none";

    /* renamed from: j, reason: collision with root package name */
    public static int f10951j = 0;
    public static boolean k = false;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f10952l = false;

    /* renamed from: m, reason: collision with root package name */
    public static Method f10953m = null;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f10954n = false;

    /* renamed from: o, reason: collision with root package name */
    public static Field f10955o;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10956a = 9;

    public static void A(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof Ke.d) && !(th instanceof Ke.c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof Ke.b)) {
            th = new s0(th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static void B(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (IllegalAccessException e7) {
                J(cls, e7);
                throw null;
            } catch (InstantiationException e10) {
                J(cls, e10);
                throw null;
            } catch (NoSuchMethodException e11) {
                J(cls, e11);
                throw null;
            } catch (InvocationTargetException e12) {
                J(cls, e12);
                throw null;
            }
        } catch (ClassNotFoundException e13) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map C(java.lang.String r5) {
        /*
            com.google.android.gms.common.internal.AbstractC1732v.f(r5)
            java.lang.String r0 = "\\."
            r1 = -1
            java.lang.String[] r0 = r5.split(r0, r1)
            int r1 = r0.length
            r2 = 2
            r3 = 0
            java.lang.String r4 = "FirebaseAppCheck"
            if (r1 >= r2) goto L1d
            java.lang.String r0 = "Invalid token (too few subsections):\n"
            java.lang.String r5 = r0.concat(r5)
            android.util.Log.e(r4, r5, r3)
            java.util.Map r5 = java.util.Collections.EMPTY_MAP
            return r5
        L1d:
            r5 = 1
            r5 = r0[r5]
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L63
            r1 = 11
            byte[] r5 = android.util.Base64.decode(r5, r1)     // Catch: java.io.UnsupportedEncodingException -> L63
            java.lang.String r1 = "UTF-8"
            r0.<init>(r5, r1)     // Catch: java.io.UnsupportedEncodingException -> L63
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.UnsupportedEncodingException -> L63
            if (r5 == 0) goto L35
        L33:
            r5 = r3
            goto L5e
        L35:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L43
            r5.<init>(r0)     // Catch: java.lang.Exception -> L43
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch: java.lang.Exception -> L43
            if (r5 == r0) goto L33
            x.e r5 = M(r5)     // Catch: java.lang.Exception -> L43
            goto L5e
        L43:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L63
            java.lang.String r1 = "Failed to parse JSONObject into Map:\n"
            r0.<init>(r1)     // Catch: java.io.UnsupportedEncodingException -> L63
            r0.append(r5)     // Catch: java.io.UnsupportedEncodingException -> L63
            java.lang.String r5 = r0.toString()     // Catch: java.io.UnsupportedEncodingException -> L63
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch: java.io.UnsupportedEncodingException -> L63
            if (r0 == 0) goto L5c
            android.util.Log.d(r4, r5, r3)     // Catch: java.io.UnsupportedEncodingException -> L63
        L5c:
            java.util.Map r5 = java.util.Collections.EMPTY_MAP     // Catch: java.io.UnsupportedEncodingException -> L63
        L5e:
            if (r5 != 0) goto L65
            java.util.Map r5 = java.util.Collections.EMPTY_MAP     // Catch: java.io.UnsupportedEncodingException -> L63
            goto L65
        L63:
            r5 = move-exception
            goto L66
        L65:
            return r5
        L66:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to decode token (charset unknown):\n"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r4, r5, r3)
            java.util.Map r5 = java.util.Collections.EMPTY_MAP
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.f.C(java.lang.String):java.util.Map");
    }

    public static int D(y yVar, int i5, int i10, int i11) {
        Q1.k.c(Math.max(Math.max(i5, i10), i11) <= 31);
        int i12 = (1 << i5) - 1;
        int i13 = (1 << i10) - 1;
        A6.c.n(A6.c.n(i12, i13), 1 << i11);
        if (yVar.b() < i5) {
            return -1;
        }
        int i14 = yVar.i(i5);
        if (i14 == i12) {
            if (yVar.b() < i10) {
                return -1;
            }
            int i15 = yVar.i(i10);
            i14 += i15;
            if (i15 == i13) {
                if (yVar.b() < i11) {
                    return -1;
                }
                return yVar.i(i11) + i14;
            }
        }
        return i14;
    }

    public static final InterfaceC4044I E(t tVar) {
        AbstractC3340k.e(tVar, "<this>");
        C4188n c4188n = tVar.f45517g;
        if (c4188n != null) {
            return c4188n;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }

    public static int F(long j8) {
        if (j8 > 2147483647L) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static void G(String str) {
        if (str.equalsIgnoreCase("flagNotFocusable") || str.equalsIgnoreCase("defaultFlag")) {
            f10945d = 8;
        }
        if (str.equalsIgnoreCase("flagNotTouchable") || str.equalsIgnoreCase("clickThrough")) {
            f10945d = 792;
        }
        if (str.equalsIgnoreCase("flagNotTouchModal") || str.equalsIgnoreCase("focusPointer")) {
            f10945d = 32;
        }
    }

    public static void H(y yVar) {
        yVar.t(3);
        yVar.t(8);
        boolean zH = yVar.h();
        boolean zH2 = yVar.h();
        if (zH) {
            yVar.t(5);
        }
        if (zH2) {
            yVar.t(6);
        }
    }

    public static void I(y yVar) {
        int i5;
        int i10 = yVar.i(2);
        if (i10 == 0) {
            yVar.t(6);
            return;
        }
        int iD = D(yVar, 5, 8, 16) + 1;
        if (i10 == 1) {
            yVar.t(iD * 7);
            return;
        }
        if (i10 == 2) {
            boolean zH = yVar.h();
            int i11 = zH ? 1 : 5;
            int i12 = zH ? 7 : 5;
            int i13 = zH ? 8 : 6;
            int i14 = 0;
            while (i14 < iD) {
                if (yVar.h()) {
                    yVar.t(7);
                    i5 = 0;
                } else {
                    if (yVar.i(2) == 3 && yVar.i(i12) * i11 != 0) {
                        yVar.s();
                    }
                    i5 = yVar.i(i13) * i11;
                    if (i5 != 0 && i5 != 180) {
                        yVar.s();
                    }
                    yVar.s();
                }
                if (i5 != 0 && i5 != 180 && yVar.h()) {
                    i14++;
                }
                i14++;
            }
        }
    }

    public static void J(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(M6.n(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    public static int[] K(Collection collection) {
        if (collection instanceof C3656b) {
            C3656b c3656b = (C3656b) collection;
            return Arrays.copyOfRange(c3656b.f41427a, c3656b.f41428b, c3656b.f41429c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            Object obj = array[i5];
            obj.getClass();
            iArr[i5] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static ArrayList L(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            Object objM = jSONArray.get(i5);
            if (objM instanceof JSONArray) {
                objM = L((JSONArray) objM);
            } else if (objM instanceof JSONObject) {
                objM = M((JSONObject) objM);
            }
            arrayList.add(objM);
        }
        return arrayList;
    }

    public static C4412e M(JSONObject jSONObject) throws JSONException {
        C4412e c4412e = new C4412e(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objM = jSONObject.get(next);
            if (objM instanceof JSONArray) {
                objM = L((JSONArray) objM);
            } else if (objM instanceof JSONObject) {
                objM = M((JSONObject) objM);
            } else if (objM.equals(JSONObject.NULL)) {
                objM = null;
            }
            c4412e.put(next, objM);
        }
        return c4412e;
    }

    public static long N(long j8, long j10, int i5, long j11) {
        int i10 = x.f9724a;
        return j8 + x.S(j10 - j11, 1000000L, i5, RoundingMode.DOWN);
    }

    public static final String O(float f10) {
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i5 = (int) f11;
        if (f11 - i5 >= 0.5f) {
            i5++;
        }
        float f12 = i5 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static boolean P(View view, InterfaceC3461c interfaceC3461c) {
        if (view != null) {
            if (interfaceC3461c.b(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    if (P(viewGroup.getChildAt(i5), interfaceC3461c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer Q(java.lang.String r21) {
        /*
            r0 = r21
            r1 = 1
            r0.getClass()
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L10
        Ld:
            r0 = r3
            goto L85
        L10:
            r2 = 0
            char r4 = r0.charAt(r2)
            r5 = 45
            if (r4 != r5) goto L1a
            r2 = r1
        L1a:
            int r4 = r0.length()
            if (r2 != r4) goto L21
            goto Ld
        L21:
            int r4 = r2 + 1
            char r5 = r0.charAt(r2)
            r6 = -1
            r7 = 128(0x80, float:1.8E-43)
            if (r5 >= r7) goto L31
            byte[] r8 = o8.AbstractC3657c.f41430a
            r5 = r8[r5]
            goto L34
        L31:
            byte[] r5 = o8.AbstractC3657c.f41430a
            r5 = r6
        L34:
            if (r5 < 0) goto Ld
            r8 = 10
            if (r5 < r8) goto L3b
            goto Ld
        L3b:
            int r5 = -r5
            long r9 = (long) r5
            long r11 = (long) r8
            r13 = -9223372036854775808
            long r15 = r13 / r11
        L42:
            int r5 = r0.length()
            if (r4 >= r5) goto L72
            int r5 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 >= r7) goto L55
            byte[] r17 = o8.AbstractC3657c.f41430a
            r4 = r17[r4]
            goto L58
        L55:
            byte[] r4 = o8.AbstractC3657c.f41430a
            r4 = r6
        L58:
            if (r4 < 0) goto Ld
            if (r4 >= r8) goto Ld
            int r17 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r17 >= 0) goto L61
            goto Ld
        L61:
            long r9 = r9 * r11
            r18 = r2
            long r1 = (long) r4
            long r19 = r1 + r13
            int r4 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r4 >= 0) goto L6c
            goto Ld
        L6c:
            long r9 = r9 - r1
            r4 = r5
            r2 = r18
            r1 = 1
            goto L42
        L72:
            r18 = r2
            if (r18 == 0) goto L7b
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            goto L85
        L7b:
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 != 0) goto L80
            goto Ld
        L80:
            long r0 = -r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L85:
            if (r0 == 0) goto L9e
            long r1 = r0.longValue()
            int r4 = r0.intValue()
            long r4 = (long) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L95
            goto L9e
        L95:
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.f.Q(java.lang.String):java.lang.Integer");
    }

    public static Object R(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            H6.l.d("Unexpected exception.", th);
            zzcaf.zza(context).zzh(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    public static final Bitmap a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    if (bitmapDecodeByteArray != null) {
                        return bitmapDecodeByteArray;
                    }
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "BitmapCreationError", "BitmapFactory failed to decode the byte array", null, false, 12, null);
                    return bitmapDecodeByteArray;
                }
            } catch (Exception e7) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "BitmapCreationError", "Error creating bitmap from base64", e7, false, 8, null);
                return null;
            }
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BitmapCreationError", "Base64 string is null or empty", false, 4, null);
        return null;
    }

    public static final void b(final float f10, final float f11, final long j8, final long j10, final int i5, Z.k kVar, C0740o c0740o, final int i10) {
        int i11;
        float f12;
        boolean z2;
        float f13 = f11;
        C0740o c0740o2 = c0740o;
        c0740o2.N(-293854230);
        long j11 = j10;
        int i12 = i10 | (c0740o2.b(f10) ? 4 : 2) | (c0740o2.b(f13) ? 256 : 128) | (c0740o2.d(j8) ? 2048 : Segment.SHARE_MINIMUM) | (c0740o2.d(j11) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE) | (c0740o2.c(i5) ? 131072 : 65536) | 1572864;
        if ((599187 & i12) == 599186 && c0740o2.x()) {
            c0740o2.I();
        } else {
            Z.i iVar = Z.i.f16922a;
            int iFloor = (int) Math.floor(f10);
            int iH = AbstractC4345a.H(10.0f * f10) - (iFloor * 10);
            c0740o2.M(693286680);
            InterfaceC3909n interfaceC3909nA = J.a(AbstractC0419i.f2743a, c0740o2);
            c0740o2.M(-1323940314);
            L0.b bVar = (L0.b) c0740o2.j(M.f46143e);
            L0.i iVar2 = (L0.i) c0740o2.j(M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o2.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = y(iVar);
            c0740o2.O();
            if (c0740o2.f7843O) {
                c0740o2.k(c4056d);
            } else {
                c0740o2.X();
            }
            c0740o2.f7867x = false;
            C0718d.M(c0740o2, interfaceC3909nA, C4054b.f45456e);
            C0718d.M(c0740o2, bVar, C4054b.f45455d);
            C0718d.M(c0740o2, iVar2, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o2, interfaceC4193p0, C4054b.f45458g, c0740o2), c0740o2, 2058660585);
            c0740o2.M(-678309503);
            c0740o2.M(1766999607);
            int i13 = 1;
            while (true) {
                if (i13 > iFloor) {
                    i11 = i13;
                    if (i11 != iFloor + 1) {
                        f12 = f13;
                        z2 = true;
                    } else if (1 > iH || iH >= 10) {
                        f12 = f13;
                        z2 = true;
                    } else {
                        c0740o2.M(-1057117069);
                        long j12 = j11;
                        z2 = true;
                        c(f13, j8, j12, c0740o2, (i12 >> 6) & 1022);
                        f12 = f13;
                        c0740o2.p(false);
                    }
                    c0740o2.M(-1056869906);
                    C0740o c0740o3 = c0740o2;
                    K.t.b(tg.b.A(), L.c(iVar, f12), j10, c0740o3, ((i12 >> 3) & 7168) | 48);
                    c0740o2 = c0740o3;
                    c0740o2.p(false);
                } else {
                    c0740o2.M(-1057509157);
                    i11 = i13;
                    K.t.b(tg.b.A(), L.c(iVar, f13), j8, c0740o2, (i12 & 7168) | 48);
                    c0740o2.p(false);
                    f12 = f13;
                    z2 = true;
                }
                if (i11 == 5) {
                    break;
                }
                i13 = i11 + 1;
                j11 = j10;
                f13 = f12;
            }
            c0740o2.p(false);
            AbstractC3230e0.b(c0740o2, L.f(4));
            kVar = iVar;
            I.b(String.valueOf(f10), null, C2465q.f34375d, Fe.b.E(i5), null, null, 0L, null, 0L, 0, false, 1, null, null, c0740o, 384, 3072, 57330);
            c0740o2 = c0740o;
            wg.b.e(c0740o2, false, false, z2, false);
            c0740o2.p(false);
        }
        final Z.k kVar2 = kVar;
        C0729i0 c0729i0R = c0740o2.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p(f10, f11, j8, j10, i5, kVar2, i10) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.I

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f30809a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f30810b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f30811c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f30812d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f30813e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Z.k f30814f;

                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i14 = this.f30813e;
                    Z.k kVar3 = this.f30814f;
                    S3.f.b(this.f30809a, this.f30810b, this.f30811c, this.f30812d, i14, kVar3, (C0740o) obj, 49);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final void c(final float f10, final long j8, final long j10, C0740o c0740o, final int i5) {
        int i10;
        c0740o.N(-2016551008);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.b(f10) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= c0740o.d(j8) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= c0740o.d(j10) ? 256 : 128;
        }
        int i11 = i10;
        if ((i11 & 147) == 146 && c0740o.x()) {
            c0740o.I();
        } else {
            Z.k kVarC = L.c(Z.i.f16922a, f10);
            c0740o.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(Z.a.f16900a, false, c0740o);
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(M.f46143e);
            L0.i iVar = (L0.i) c0740o.j(M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = y(kVarC);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(c4056d);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(-2137368960);
            C2826d c2826dA = tg.b.A();
            Z.d dVar = Z.a.f16904e;
            K.t.b(c2826dA, new C0420j(dVar, true), j10, c0740o, ((i11 << 3) & 7168) | 48);
            C2826d c2826dA2 = tg.b.A();
            C0420j c0420j = new C0420j(dVar, true);
            c0740o.M(-1749583561);
            Object objF = c0740o.F();
            if (objF == C0732k.f7800a) {
                objF = new C1915d(17);
                c0740o.U(objF);
            }
            tf.l onDraw = (tf.l) objF;
            c0740o.p(false);
            AbstractC3340k.e(onDraw, "onDraw");
            K.t.b(c2826dA2, M6.f(c0420j, new b0.f(onDraw)), j8, c0740o, ((i11 << 6) & 7168) | 48);
            wg.b.e(c0740o, false, false, true, false);
            c0740o.p(false);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.J
                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i12 = i5 | 1;
                    long j11 = j8;
                    long j12 = j10;
                    S3.f.c(f10, j11, j12, (C0740o) obj, i12);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final void d(final String str, final V.d dVar, C0740o c0740o, final int i5) {
        c0740o.N(701452993);
        if ((((c0740o.e(str) ? 4 : 2) | i5) & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(1831107047);
            boolean zE = c0740o.e(str);
            Object objF = c0740o.F();
            P p10 = C0732k.f7800a;
            if (zE || objF == p10) {
                Bitmap bitmapA = a(str);
                objF = bitmapA != null ? new C2452d(bitmapA) : null;
                c0740o.U(objF);
            }
            C2452d c2452d = (C2452d) objF;
            c0740o.p(false);
            c0740o.M(1831111327);
            if (c2452d == null) {
                dVar.invoke(c0740o, 6);
                c0740o.p(false);
                C0729i0 c0729i0R = c0740o.r();
                if (c0729i0R != null) {
                    final int i10 = 0;
                    c0729i0R.f7788d = new tf.p(str, dVar, i5, i10) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f29872a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ String f29873b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ V.d f29874c;

                        {
                            this.f29872a = i10;
                        }

                        @Override // tf.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = this.f29872a;
                            C0740o c0740o2 = (C0740o) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    S3.f.d(this.f29873b, this.f29874c, c0740o2, 49);
                                    break;
                                default:
                                    S3.f.d(this.f29873b, this.f29874c, c0740o2, 49);
                                    break;
                            }
                            return C2515C.f34653a;
                        }
                    };
                    return;
                }
                return;
            }
            c0740o.p(false);
            Z.i iVar = Z.i.f16922a;
            Z.k kVarA = L.a(iVar);
            c0740o.M(1831116600);
            boolean zE2 = c0740o.e("Watermark Overlay");
            Object objF2 = c0740o.F();
            if (zE2 || objF2 == p10) {
                objF2 = new C1915d(5);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            Z.k kVarJ = Fe.g.J(kVarA, false, (tf.l) objF2);
            c0740o.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(Z.a.f16900a, false, c0740o);
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(M.f46143e);
            L0.i iVar2 = (L0.i) c0740o.j(M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = y(kVarJ);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(c4056d);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar2, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(-2137368960);
            dVar.invoke(c0740o, 6);
            Z.k kVarA2 = L.a(iVar);
            c0740o.M(602568249);
            boolean zE3 = c0740o.e(c2452d);
            Object objF3 = c0740o.F();
            if (zE3 || objF3 == p10) {
                objF3 = new Af.r(c2452d, 18);
                c0740o.U(objF3);
            }
            c0740o.p(false);
            android.support.v4.media.session.b.F(kVarA2, (tf.l) objF3, c0740o, 6);
            wg.b.e(c0740o, false, false, true, false);
            c0740o.p(false);
        }
        C0729i0 c0729i0R2 = c0740o.r();
        if (c0729i0R2 != null) {
            final int i11 = 1;
            c0729i0R2.f7788d = new tf.p(str, dVar, i5, i11) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f29872a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f29873b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ V.d f29874c;

                {
                    this.f29872a = i11;
                }

                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    int i112 = this.f29872a;
                    C0740o c0740o2 = (C0740o) obj;
                    ((Integer) obj2).getClass();
                    switch (i112) {
                        case 0:
                            S3.f.d(this.f29873b, this.f29874c, c0740o2, 49);
                            break;
                        default:
                            S3.f.d(this.f29873b, this.f29874c, c0740o2, 49);
                            break;
                    }
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, Object obj, int i5, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i5, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i5 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i5, i10, 33);
    }

    public static List f(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new C3656b(iArr, 0, iArr.length);
    }

    public static ya.b g(List from, tf.l lVar, tf.p pVar) {
        Object obj;
        AbstractC3340k.e(from, "from");
        List list = from;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) lVar.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) lVar.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        if (obj == null) {
            throw new NoSuchElementException("Unable to build char tree from an empty list");
        }
        ((Number) lVar.invoke(obj)).intValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Number) lVar.invoke(it2.next())).intValue() == 0) {
                    throw new IllegalArgumentException("There should be no empty entries");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        h(arrayList, from, 0, lVar, pVar);
        arrayList.trimToSize();
        new Ld.a((char) 0, v.f35432a, arrayList);
        return new ya.b(22);
    }

    public static void h(ArrayList arrayList, List list, int i5, tf.l lVar, tf.p pVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) pVar.invoke(obj, Integer.valueOf(i5));
            ch.getClass();
            Object arrayList2 = linkedHashMap.get(ch);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(ch, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i10 = i5 + 1;
            ArrayList arrayList3 = new ArrayList();
            List list3 = list2;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list3) {
                if (((Number) lVar.invoke(obj2)).intValue() > i10) {
                    arrayList4.add(obj2);
                }
            }
            h(arrayList3, arrayList4, i10, lVar, pVar);
            arrayList3.trimToSize();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list3) {
                if (((Number) lVar.invoke(obj3)).intValue() == i10) {
                    arrayList5.add(obj3);
                }
            }
            arrayList.add(new Ld.a(cCharValue, arrayList5, arrayList3));
        }
    }

    public static void i(Context context, InterfaceC3460b interfaceC3460b) {
        Rect rect;
        v0 _windowInsetsCompat;
        Activity activityT = t(context);
        if (activityT != null) {
            int i5 = D3.m.f2319a;
            D3.n.f2320a.getClass();
            int i10 = D3.o.f2321b;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                rect = ((WindowManager) activityT.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
                AbstractC3340k.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = activityT.getSystemService("window");
                AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                AbstractC3340k.d(display, "display");
                Point point = new Point();
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i11 < 30) {
                _windowInsetsCompat = (i11 >= 34 ? new k0() : i11 >= 30 ? new j0() : i11 >= 29 ? new i0() : new h0()).b();
                AbstractC3340k.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i11 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = H3.a.f4883a.a(activityT);
            }
            int i12 = rect.left;
            int i13 = rect.top;
            int i14 = rect.right;
            int i15 = rect.bottom;
            if (i12 > i14) {
                throw new IllegalArgumentException(R8.v.e(i12, i14, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i13 > i15) {
                throw new IllegalArgumentException(R8.v.e(i13, i15, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            AbstractC3340k.e(_windowInsetsCompat, "_windowInsetsCompat");
            ((C3458b) interfaceC3460b).f40251a.updateDisplayMetrics(0, new Rect(i12, i13, i14, i15).width(), new Rect(i12, i13, i14, i15).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static He.m j(Callable callable) {
        try {
            Object objCall = callable.call();
            Ne.b.a(objCall, "Scheduler Callable result can't be null");
            return (He.m) objCall;
        } catch (Throwable th) {
            throw Ze.d.c(th);
        }
    }

    public static void k(String str, boolean z2) throws o0 {
        if (!z2) {
            throw o0.a(str, null);
        }
    }

    public static int l(long j8) {
        int i5 = (int) j8;
        Fe.e.o("Out of range: %s", j8, ((long) i5) == j8);
        return i5;
    }

    public static int m(int i5, int i10, int i11) {
        return i5 < i10 ? i10 : i5 > i11 ? i11 : i5;
    }

    public static boolean n(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = S.f38779a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = Q.f38775d;
        Q q4 = (Q) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (q4 == null) {
            q4 = new Q();
            q4.f38776a = null;
            q4.f38777b = null;
            q4.f38778c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, q4);
        }
        WeakReference weakReference2 = q4.f38778c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        q4.f38778c = new WeakReference(keyEvent);
        if (q4.f38777b == null) {
            q4.f38777b = new SparseArray();
        }
        SparseArray sparseArray = q4.f38777b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean o(InterfaceC3122i interfaceC3122i, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC3122i != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC3122i.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f10952l) {
                            try {
                                f10953m = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f10952l = true;
                        }
                        Method method = f10953m;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (S.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f10954n) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f10955o = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f10954n = true;
                }
                Field field = f10955o;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (S.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && S.c(view, keyEvent)) || interfaceC3122i.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final void p(t tVar, ArrayList arrayList) {
        P.d dVarK = tVar.k();
        int i5 = dVarK.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarK.f8970a;
            int i10 = 0;
            do {
                t tVar2 = (t) objArr[i10];
                C4438h c4438hV = v(tVar2);
                if (c4438hV != null) {
                    arrayList.add(c4438hV);
                } else {
                    p(tVar2, arrayList);
                }
                i10++;
            } while (i10 < i5);
        }
    }

    public static final int q(ArrayList paragraphInfoList, int i5) {
        AbstractC3340k.e(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            z0.f fVar = (z0.f) paragraphInfoList.get(i11);
            char c10 = fVar.f48285b > i5 ? (char) 1 : fVar.f48286c <= i5 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else {
                if (c10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int r(ArrayList paragraphInfoList, int i5) {
        AbstractC3340k.e(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            z0.f fVar = (z0.f) paragraphInfoList.get(i11);
            char c10 = fVar.f48287d > i5 ? (char) 1 : fVar.f48288e <= i5 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else {
                if (c10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static int s(byte[] bArr) {
        boolean z2 = bArr.length >= 4;
        int length = bArr.length;
        if (!z2) {
            throw new IllegalArgumentException(Fe.g.E("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        byte b5 = bArr[0];
        byte b10 = bArr[1];
        return (bArr[3] & ForkServer.ERROR) | ((bArr[2] & ForkServer.ERROR) << 8) | (b5 << 24) | ((b10 & ForkServer.ERROR) << 16);
    }

    public static Activity t(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return t(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final C4438h u(t tVar) {
        C4438h c4438h;
        AbstractC3340k.e(tVar, "<this>");
        t0.y yVarN = tVar.f45534y.f45436f;
        while (yVarN != null && !Fe.e.H(yVarN.f45574s, 2)) {
            yVarN = yVarN.N();
        }
        if (yVarN != null && (c4438h = (C4438h) yVarN.f45574s[2]) != null) {
            t0.y yVarN2 = (t0.y) c4438h.f15788b;
            while (yVarN2 != null) {
                while (c4438h != null) {
                    if (((C4440j) ((InterfaceC4439i) ((Z.j) c4438h.f15789c))).f47598b.f47594b) {
                        return c4438h;
                    }
                    c4438h = (C4438h) ((E) c4438h.f15790d);
                }
                yVarN2 = yVarN2.N();
                c4438h = yVarN2 != null ? (C4438h) yVarN2.f45574s[2] : null;
            }
        }
        return null;
    }

    public static final C4438h v(t tVar) {
        C4438h c4438h;
        AbstractC3340k.e(tVar, "<this>");
        t0.y yVarN = tVar.f45534y.f45436f;
        while (yVarN != null && !Fe.e.H(yVarN.f45574s, 2)) {
            yVarN = yVarN.N();
        }
        if (yVarN != null && (c4438h = (C4438h) yVarN.f45574s[2]) != null) {
            t0.y yVarN2 = (t0.y) c4438h.f15788b;
            while (yVarN2 != null) {
                if (c4438h != null) {
                    return c4438h;
                }
                yVarN2 = yVarN2.N();
                c4438h = yVarN2 != null ? (C4438h) yVarN2.f45574s[2] : null;
            }
        }
        return null;
    }

    public static int w(int[] iArr, int i5, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i5) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Af.l x(tf.p pVar) {
        Af.l lVar = new Af.l();
        lVar.f1315c = A6.h.q(lVar, lVar, pVar);
        return lVar;
    }

    public static final V.d y(Z.k modifier) {
        AbstractC3340k.e(modifier, "modifier");
        return new V.d(-1586257396, true, new G.f(modifier, 5));
    }

    public static InterfaceC3207p z(InterfaceC3207p interfaceC3207p) {
        return ((interfaceC3207p instanceof C3209r) || (interfaceC3207p instanceof C3208q)) ? interfaceC3207p : interfaceC3207p instanceof Serializable ? new C3208q(interfaceC3207p) : new C3209r(interfaceC3207p);
    }

    public int hashCode() {
        switch (this.f10956a) {
            case 9:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f10956a) {
            case 9:
                String simpleName = H.f39741a.getOrCreateKotlinClass(getClass()).getSimpleName();
                AbstractC3340k.b(simpleName);
                return simpleName;
            default:
                return super.toString();
        }
    }
}
