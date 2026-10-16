package Fe;

import A.AbstractC0226t;
import A.Z;
import A7.AbstractC0279p0;
import B.C0313d;
import B.C0317h;
import B.E;
import C6.n;
import D6.C0392q;
import D6.C0395s;
import E.AbstractC0426p;
import E.C0427q;
import G6.L;
import G6.U;
import Hf.InterfaceC0602l;
import Hf.e0;
import Hf.v0;
import J5.w;
import K.AbstractC0682g;
import K.AbstractC0684i;
import K.C0680e;
import K.F;
import K.G;
import K.q;
import K.x;
import N.C0718d;
import N.C0725g0;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.C0745t;
import N.D;
import N.L0;
import N.V;
import N.Y;
import N.u0;
import Wf.h0;
import Wf.i0;
import X.p;
import X.v;
import X0.AbstractC1278f;
import ab.AbstractServiceC1345a;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import c8.C1580d;
import c8.C1582f;
import c8.C1583g;
import c8.C1585i;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzfkn;
import com.google.android.gms.internal.ads.zzgtf;
import com.google.android.gms.internal.ads.zzgug;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z;
import com.unity3d.services.UnityAdsConstants;
import d0.AbstractC2382a;
import d0.C2384c;
import e0.C2465q;
import e0.InterfaceC2442E;
import e0.t;
import ef.C2515C;
import ef.C2537u;
import ff.o;
import gf.AbstractC2758e;
import gf.C2756c;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import jf.C3109i;
import k1.J;
import k1.S;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lf.AbstractC3464c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q.O0;
import r0.InterfaceC3906k;
import r0.InterfaceC3909n;
import r7.AbstractC3935e;
import t0.C4054b;
import t0.C4061i;
import t0.InterfaceC4055c;
import t0.y;
import u0.M;
import u6.AbstractC4256a;
import z.C4597b;

/* loaded from: classes5.dex */
public abstract class g {
    public static String A(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir().getPath() : context.getApplicationInfo().dataDir;
    }

    public static Drawable B(Context context, int i5) {
        return O0.d().f(context, i5);
    }

    public static void C(Intent intent) {
        Set<String> categories;
        if (intent == null) {
            return;
        }
        try {
            if (AbstractC3340k.a(intent.getAction(), "android.intent.action.MAIN") && (categories = intent.getCategories()) != null && categories.contains("android.intent.category.LAUNCHER") && AbstractC3340k.a(intent.getStringExtra("intentData"), "onNotificationPressed")) {
                e0 e0Var = AbstractServiceC1345a.f17485a;
            }
        } catch (Exception e7) {
            e0 e0Var2 = AbstractServiceC1345a.f17485a;
            Log.e("a", e7.getMessage(), e7);
        }
    }

    public static boolean D(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static String E(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i5 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e7) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e7);
                    StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("<", str2, " threw ");
                    sbW.append(e7.getClass().getName());
                    sbW.append(">");
                    string = sbW.toString();
                }
            }
            objArr[i10] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i11 = 0;
        while (i5 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) strValueOf, i11, iIndexOf);
            sb2.append(objArr[i5]);
            i11 = iIndexOf + 2;
            i5++;
        }
        sb2.append((CharSequence) strValueOf, i11, strValueOf.length());
        if (i5 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i5]);
            for (int i12 = i5 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static final Object F(Object obj) {
        return obj instanceof JSONArray ? L((JSONArray) obj) : obj instanceof JSONObject ? M((JSONObject) obj) : obj;
    }

    public static final long G(InterfaceC3906k interfaceC3906k) {
        AbstractC3340k.e(interfaceC3906k, "<this>");
        int i5 = C2384c.f33934e;
        return ((y) interfaceC3906k).W(C2384c.f33931b);
    }

    public static final void H(Object[] objArr, int i5, int i10) {
        AbstractC3340k.e(objArr, "<this>");
        while (i5 < i10) {
            objArr[i5] = null;
            i5++;
        }
    }

    public static o6.f I(o6.f fVar, String[] strArr, Map map) {
        int i5 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (o6.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                o6.f fVar2 = new o6.f();
                int length = strArr.length;
                while (i5 < length) {
                    fVar2.a((o6.f) map.get(strArr[i5]));
                    i5++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((o6.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i5 < length2) {
                    fVar.a((o6.f) map.get(strArr[i5]));
                    i5++;
                }
            }
        }
        return fVar;
    }

    public static final Z.k J(Z.k kVar, boolean z2, tf.l properties) {
        AbstractC3340k.e(kVar, "<this>");
        AbstractC3340k.e(properties, "properties");
        return AbstractC3935e.n(kVar, new E(3, properties, z2));
    }

    public static void K(View view, C1583g c1583g) {
        V7.a aVar = c1583g.f19729a.f19714b;
        if (aVar == null || !aVar.f13161a) {
            return;
        }
        float fE = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = S.f38779a;
            fE += J.e((View) parent);
        }
        C1582f c1582f = c1583g.f19729a;
        if (c1582f.f19723l != fE) {
            c1582f.f19723l = fE;
            c1583g.m();
        }
    }

    public static final List L(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            Object obj = jSONArray.get(i5);
            AbstractC3340k.d(obj, "get(...)");
            arrayList.add(F(obj));
        }
        return o.S0(arrayList);
    }

    public static final LinkedHashMap M(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC3340k.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            AbstractC3340k.d(obj, "get(...)");
            Object objF = F(obj);
            AbstractC3340k.b(next);
            linkedHashMap.put(next, objF);
        }
        return linkedHashMap;
    }

    public static final double N(long j8) {
        return ((j8 >>> 11) * 2048) + (j8 & 2047);
    }

    public static boolean O(int i5) {
        zzbio zzbioVar = zzbix.zzey;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            return ((Boolean) c0395s.f2492c.zzd(zzbix.zzez)).booleanValue() || i5 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:85|24)|33|81|34|35|(9:37|(1:42)(1:46)|47|(2:49|(1:51)(1:54))(1:55)|80|58|(3:83|60|(1:62))|65|(2:74|67))(9:43|(1:45)(0)|47|(0)(0)|80|58|(0)|65|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
    
        r3 = G6.L.f4523b;
        H6.l.d("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153 A[Catch: JSONException -> 0x014c, TRY_LEAVE, TryCatch #6 {JSONException -> 0x014c, blocks: (B:34:0x011b, B:51:0x0148, B:54:0x014e, B:55:0x0153), top: B:81:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject P(android.content.Context r17, android.view.View r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.g.P(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject Q(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                zzbio zzbioVar = zzbix.zzjj;
                C0395s c0395s = C0395s.f2489e;
                if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                    if (((Boolean) c0395s.f2492c.zzd(zzbix.zzjk)).booleanValue()) {
                        U u10 = n.f1857D.f1863c;
                        jSONObject.put("contained_in_scroll_view", U.a(view) != 0);
                    }
                    if (((Boolean) c0395s.f2492c.zzd(zzbix.zzjl)).booleanValue()) {
                        U u11 = n.f1857D.f1863c;
                        jSONObject.put("scroll_view_type", U.a(view));
                        return jSONObject;
                    }
                } else {
                    U u12 = n.f1857D.f1863c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject R(Context context, View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                U u10 = n.f1857D.f1863c;
                jSONObject.put("can_show_on_lock_screen", U.K(view));
                boolean z2 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z2 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z2);
                return jSONObject;
            } catch (JSONException unused) {
                int i5 = L.f4523b;
                H6.l.f("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject S(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) throws JSONException {
        String str;
        int[] iArr;
        JSONObject jSONObject;
        ViewGroup.LayoutParams layoutParams;
        String str2 = "ad_view";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i5 = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i5];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            C0392q c0392q = C0392q.f2477g;
                            H6.f fVar = c0392q.f2478a;
                            H6.f fVar2 = c0392q.f2478a;
                            jSONObject4.put("width", fVar.h(context, measuredWidth));
                            jSONObject4.put("height", fVar2.h(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", fVar2.h(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", fVar2.h(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", str2);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = X(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", fVar2.h(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", fVar2.h(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", str2);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                zzbio zzbioVar = zzbix.zzjm;
                                C0395s c0395s = C0395s.f2489e;
                                zzbiv zzbivVar = c0395s.f2492c;
                                zzbiv zzbivVar2 = c0395s.f2492c;
                                if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) zzbivVar2.zzd(zzbix.zzjn)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject3.put("view_width_layout_type", Y(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", Y(layoutParams.height) - 1);
                                }
                                if (((Boolean) zzbivVar2.zzd(zzbix.zzjq)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str2;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    int i10 = L.f4523b;
                                    H6.l.f("Unable to get asset views information");
                                    it = it2;
                                    str2 = str;
                                    iArr2 = iArr;
                                    i5 = 2;
                                }
                            } else {
                                str = str2;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjr)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str2;
                        }
                    } catch (JSONException unused3) {
                        str = str2;
                        iArr = iArr2;
                    }
                    it = it2;
                    str2 = str;
                    iArr2 = iArr;
                    i5 = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject T(String str, Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e7) {
            e = e7;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i5 = point2.x;
                C0392q c0392q = C0392q.f2477g;
                jSONObject3.put("x", c0392q.f2478a.h(context, i5));
                jSONObject3.put("y", c0392q.f2478a.h(context, point2.y));
                jSONObject3.put("start_x", c0392q.f2478a.h(context, point.x));
                jSONObject3.put("start_y", c0392q.f2478a.h(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e10) {
                int i10 = L.f4523b;
                H6.l.d("Error occurred while putting signals into JSON object.", e10);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            jSONObject2 = jSONObject;
            int i11 = L.f4523b;
            H6.l.d("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static boolean U(Context context, zzfkn zzfknVar) {
        if (!zzfknVar.zzN) {
            return false;
        }
        zzbio zzbioVar = zzbix.zzjs;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            return ((Boolean) c0395s.f2492c.zzd(zzbix.zzjv)).booleanValue();
        }
        String str = (String) c0395s.f2492c.zzd(zzbix.zzjt);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzgug.zza(zzgtf.zzd(';')).zzf(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject V(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        U u10 = n.f1857D.f1863c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i5 = displayMetrics.widthPixels;
            C0392q c0392q = C0392q.f2477g;
            jSONObject.put("width", c0392q.f2478a.h(context, i5));
            jSONObject.put("height", c0392q.f2478a.h(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams W() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzju)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject X(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i5 = rect.right - rect.left;
        C0392q c0392q = C0392q.f2477g;
        jSONObject.put("width", c0392q.f2478a.h(context, i5));
        int i10 = rect.bottom - rect.top;
        H6.f fVar = c0392q.f2478a;
        jSONObject.put("height", fVar.h(context, i10));
        jSONObject.put("x", fVar.h(context, rect.left));
        jSONObject.put("y", fVar.h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int Y(int i5) {
        if (i5 != -2) {
            return i5 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static final long a(float f10, float f11) {
        long jFloatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i5 = AbstractC2382a.f33926b;
        return jFloatToIntBits;
    }

    public static final void b(A.U u10, Z.k kVar, Z z2, C4597b c4597b, V.d dVar, C0740o c0740o, int i5) {
        boolean z10;
        int i10;
        int iZ;
        A.U u11 = u10;
        c0740o.N(679005231);
        int i11 = (i5 & 14) == 0 ? i5 | (c0740o.e(u11) ? 4 : 2) : i5;
        if ((i5 & 112) == 0) {
            i11 |= c0740o.e(kVar) ? 32 : 16;
        }
        int i12 = i11 | 3072;
        V.d dVar2 = dVar;
        if ((i5 & 57344) == 0) {
            i12 |= c0740o.e(dVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        int i13 = i12;
        C4597b c4597b2 = C4597b.k;
        c0740o.M(-492369756);
        Object objF = c0740o.F();
        Object obj = C0732k.f7800a;
        Object obj2 = objF;
        if (objF == obj) {
            p pVarF = C0718d.F();
            pVarF.add(u11.b());
            c0740o.U(pVarF);
            obj2 = pVarF;
        }
        c0740o.p(false);
        p pVar = (p) obj2;
        c0740o.M(-492369756);
        Object objF2 = c0740o.F();
        if (objF2 == obj) {
            objF2 = new LinkedHashMap();
            c0740o.U(objF2);
        }
        c0740o.p(false);
        Map map = (Map) objF2;
        c0740o.M(-1621449801);
        Object objB = u11.b();
        Y y10 = u11.f81c;
        if (!AbstractC3340k.a(objB, y10.getValue()) || (pVar.size() == 1 && AbstractC3340k.a(pVar.get(0), y10.getValue()))) {
            z10 = false;
        } else {
            c0740o.M(1157296644);
            boolean zE = c0740o.e(u11);
            Object objF3 = c0740o.F();
            if (zE || objF3 == obj) {
                objF3 = new A.Y(u11, 1);
                c0740o.U(objF3);
            }
            c0740o.p(false);
            tf.l predicate = (tf.l) objF3;
            AbstractC3340k.e(predicate, "predicate");
            int iZ2 = AbstractC3935e.z(pVar);
            if (iZ2 >= 0) {
                int i14 = 0;
                i10 = 0;
                while (true) {
                    Object obj3 = pVar.get(i14);
                    if (!((Boolean) predicate.invoke(obj3)).booleanValue()) {
                        if (i10 != i14) {
                            pVar.set(i10, obj3);
                        }
                        i10++;
                    }
                    if (i14 == iZ2) {
                        break;
                    } else {
                        i14++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 < pVar.size() && i10 <= (iZ = AbstractC3935e.z(pVar))) {
                while (true) {
                    pVar.remove(iZ);
                    if (iZ == i10) {
                        break;
                    } else {
                        iZ--;
                    }
                }
            }
            map.clear();
            z10 = false;
        }
        c0740o.p(z10);
        if (!map.containsKey(y10.getValue())) {
            ListIterator listIterator = pVar.listIterator();
            int i15 = 0;
            while (true) {
                v vVar = (v) listIterator;
                if (!vVar.hasNext()) {
                    i15 = -1;
                    break;
                } else if (AbstractC3340k.a(vVar.next(), y10.getValue())) {
                    break;
                } else {
                    i15++;
                }
            }
            if (i15 == -1) {
                pVar.add(y10.getValue());
            } else {
                pVar.set(i15, y10.getValue());
            }
            map.clear();
            int size = pVar.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj4 = pVar.get(i16);
                map.put(obj4, V.e.b(c0740o, -1426421288, new V.a(u11, i13, z2, obj4, dVar2)));
                i16++;
                u11 = u10;
                dVar2 = dVar;
            }
        }
        c0740o.M(-1990474327);
        InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(Z.a.f16900a, false, c0740o);
        c0740o.M(1376089335);
        L0.b bVar = (L0.b) c0740o.j(M.f46143e);
        L0.i iVar = (L0.i) c0740o.j(M.k);
        InterfaceC4055c.g9.getClass();
        tf.a aVar = C4054b.f45453b;
        V.d dVarY = S3.f.y(kVar);
        c0740o.O();
        if (c0740o.f7843O) {
            c0740o.k(aVar);
        } else {
            c0740o.X();
        }
        c0740o.f7867x = false;
        C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
        C0718d.M(c0740o, bVar, C4054b.f45455d);
        C0718d.M(c0740o, iVar, C4054b.f45457f);
        c0740o.o();
        wg.b.d(0, dVarY, new u0(c0740o), c0740o, 2058660585);
        c0740o.M(-1253629305);
        c0740o.M(1930908853);
        int size2 = pVar.size();
        for (int i17 = 0; i17 < size2; i17++) {
            Object obj5 = pVar.get(i17);
            c0740o.J(-450541954, obj5, 0, null);
            tf.p pVar2 = (tf.p) map.get(obj5);
            if (pVar2 != null) {
                pVar2.invoke(c0740o, 0);
            }
            c0740o.p(false);
        }
        wg.b.e(c0740o, false, false, false, true);
        c0740o.p(false);
        c0740o.p(false);
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new V.b(u10, kVar, z2, c4597b2, dVar, i5, 3);
    }

    public static final void c(Object obj, Z.k kVar, Z z2, V.d dVar, C0740o c0740o, int i5, int i10) {
        int i11;
        Z.k kVar2;
        Z z10;
        c0740o.N(523603005);
        if ((i5 & 14) == 0) {
            i11 = (c0740o.e(obj) ? 4 : 2) | i5;
        } else {
            i11 = i5;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i5 & 112) == 0) {
            i11 |= c0740o.e(kVar) ? 32 : 16;
        }
        int i13 = i11 | 128;
        if ((i5 & 7168) == 0) {
            i13 |= c0740o.e(dVar) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i13 & 5851) == 1170 && c0740o.x()) {
            c0740o.I();
            kVar2 = kVar;
            z10 = z2;
        } else {
            Z.k kVar3 = i12 != 0 ? Z.i.f16922a : kVar;
            Z zJ = AbstractC0226t.j(0, null, 7);
            Z.k kVar4 = kVar3;
            b(AbstractC0226t.l(obj, c0740o, i13 & 14, 2), kVar4, zJ, null, dVar, c0740o, (i13 & 112) | 512 | ((i13 << 3) & 57344));
            kVar2 = kVar4;
            z10 = zJ;
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new x(obj, kVar2, z10, dVar, i5, i10, 2);
    }

    public static final h0 d(String str) {
        Uf.e eVar = Uf.e.f12814x;
        if (Bf.k.y0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((S.j) i0.f15607a.values()).iterator();
        while (((AbstractC2758e) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((C2756c) it).next();
            if (str.equals(kSerializer.getDescriptor().h())) {
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbW.append(H.f39741a.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName());
                sbW.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(Bf.l.V(sbW.toString()));
            }
        }
        return new h0(str, eVar);
    }

    public static final void e(Z.i iVar, InterfaceC2442E interfaceC2442E, long j8, long j10, float f10, V.d dVar, C0740o c0740o, int i5) {
        InterfaceC2442E interfaceC2442E2;
        Z.i iVar2;
        long jB;
        int i10;
        float f11;
        Z.i iVar3;
        long j11;
        c0740o.N(1412203386);
        int i11 = i5 | 6;
        if ((i5 & 112) == 0) {
            interfaceC2442E2 = interfaceC2442E;
            i11 |= c0740o.e(interfaceC2442E2) ? 32 : 16;
        } else {
            interfaceC2442E2 = interfaceC2442E;
        }
        if ((i5 & 896) == 0) {
            i11 |= c0740o.d(j8) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i11 |= Segment.SHARE_MINIMUM;
        }
        int i12 = i11 | 221184;
        if ((3670016 & i5) == 0) {
            i12 |= c0740o.e(dVar) ? 1048576 : 524288;
        }
        if ((2995931 & i12) == 599186 && c0740o.x()) {
            c0740o.I();
            iVar3 = iVar;
            j11 = j10;
            f11 = f10;
        } else {
            c0740o.K();
            if ((i5 & 1) == 0 || c0740o.w()) {
                iVar2 = Z.i.f16922a;
                jB = AbstractC0682g.b(j8, c0740o);
                i10 = i12 & (-7169);
                f11 = 0;
            } else {
                c0740o.I();
                i10 = i12 & (-7169);
                iVar2 = iVar;
                jB = j10;
                f11 = f10;
            }
            c0740o.q();
            D d3 = q.f6288b;
            float f12 = ((L0.d) c0740o.j(d3)).f6795a + f11;
            iVar3 = iVar2;
            C0718d.a(new C0725g0[]{AbstractC0684i.f6262a.a(new C2465q(jB)), d3.a(new L0.d(f12))}, V.e.b(c0740o, -1822160838, new K.D(iVar3, interfaceC2442E2, j8, f12, i10, f11, dVar)), c0740o, 56);
            j11 = jB;
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new K.E(iVar3, interfaceC2442E, j8, j11, f11, dVar, i5);
    }

    public static final void f(tf.a onClick, Z.k kVar, boolean z2, InterfaceC2442E interfaceC2442E, long j8, long j10, C0317h c0317h, float f10, D.i iVar, V.d dVar, C0740o c0740o, int i5) {
        int i10;
        Z.k kVar2;
        InterfaceC2442E interfaceC2442E2;
        long j11;
        C0317h c0317h2;
        D.i iVar2;
        char c10;
        AbstractC3340k.e(onClick, "onClick");
        c0740o.N(1560876237);
        if ((i5 & 14) == 0) {
            i10 = (c0740o.e(onClick) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 112) == 0) {
            kVar2 = kVar;
            i10 |= c0740o.e(kVar2) ? 32 : 16;
        } else {
            kVar2 = kVar;
        }
        if ((i5 & 896) == 0) {
            i10 |= c0740o.f(z2) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            interfaceC2442E2 = interfaceC2442E;
            i10 |= c0740o.e(interfaceC2442E2) ? 2048 : Segment.SHARE_MINIMUM;
        } else {
            interfaceC2442E2 = interfaceC2442E;
        }
        if ((57344 & i5) == 0) {
            j11 = j8;
            i10 |= c0740o.d(j11) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        } else {
            j11 = j8;
        }
        if ((458752 & i5) == 0) {
            i10 |= c0740o.d(j10) ? 131072 : 65536;
        }
        if ((3670016 & i5) == 0) {
            c0317h2 = c0317h;
            i10 |= c0740o.e(c0317h2) ? 1048576 : 524288;
        } else {
            c0317h2 = c0317h;
        }
        if ((29360128 & i5) == 0) {
            i10 |= c0740o.b(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i5) == 0) {
            iVar2 = iVar;
            i10 |= c0740o.e(iVar2) ? 67108864 : 33554432;
        } else {
            iVar2 = iVar;
        }
        if ((i5 & 1879048192) == 0) {
            c10 = 1;
            i10 |= c0740o.e(dVar) ? 536870912 : 268435456;
        } else {
            c10 = 1;
        }
        if ((i10 & 1533916891) == 306783378 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.K();
            if ((i5 & 1) != 0 && !c0740o.w()) {
                c0740o.I();
            }
            c0740o.q();
            D d3 = q.f6288b;
            float f11 = ((L0.d) c0740o.j(d3)).f6795a + f10;
            int i11 = i10;
            C0725g0 c0725g0A = AbstractC0684i.f6262a.a(new C2465q(j10));
            C0725g0 c0725g0A2 = d3.a(new L0.d(f11));
            C0725g0[] c0725g0Arr = new C0725g0[2];
            c0725g0Arr[0] = c0725g0A;
            c0725g0Arr[c10] = c0725g0A2;
            C0718d.a(c0725g0Arr, V.e.b(c0740o, 2031491085, new F(kVar2, interfaceC2442E2, j11, f11, i11, c0317h2, f10, iVar2, z2, onClick, dVar)), c0740o, 56);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new G(onClick, kVar, z2, interfaceC2442E, j8, j10, c0317h, f10, iVar, dVar, i5);
    }

    public static final Object g(Nf.d dVar, tf.l lVar, AbstractC3464c abstractC3464c) {
        com.moloco.sdk.internal.utils.c cVar = new com.moloco.sdk.internal.utils.c(dVar);
        return abstractC3464c.getContext().get(cVar) != null ? lVar.invoke(abstractC3464c) : Ef.H.P(new com.moloco.sdk.internal.utils.b(cVar), new com.moloco.sdk.internal.utils.a(dVar, lVar, null), abstractC3464c);
    }

    public static final void h(final z initialSecondsLeft, final boolean z2, final tf.a onCountdownFinished, final tf.a aVar, final tf.l onButtonRendered, final tf.c cVar, final boolean z10, final InterfaceC0602l interfaceC0602l, C0740o c0740o, final int i5) {
        int i10;
        Object obj = C0427q.f2765a;
        AbstractC3340k.e(initialSecondsLeft, "initialSecondsLeft");
        AbstractC3340k.e(onCountdownFinished, "onCountdownFinished");
        AbstractC3340k.e(onButtonRendered, "onButtonRendered");
        c0740o.N(1211286303);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.e(obj) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= c0740o.e(initialSecondsLeft) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= c0740o.f(true) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i10 |= c0740o.f(z2) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i5 & 24576) == 0) {
            i10 |= c0740o.e(onCountdownFinished) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((196608 & i5) == 0) {
            i10 |= c0740o.e(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i10 |= c0740o.e(onButtonRendered) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i10 |= c0740o.e(cVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i10 |= c0740o.f(z10) ? 67108864 : 33554432;
        }
        if ((805306368 & i5) == 0) {
            i10 |= c0740o.e(interfaceC0602l) ? 536870912 : 268435456;
        }
        if ((306783379 & i10) == 306783378 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(773894976);
            c0740o.M(-492369756);
            Object objF = c0740o.F();
            Object obj2 = C0732k.f7800a;
            if (objF == obj2) {
                Object c0745t = new C0745t(C0718d.x(C3109i.f38759a, c0740o));
                c0740o.U(c0745t);
                objF = c0745t;
            }
            c0740o.p(false);
            Kd.a aVar2 = ((C0745t) objF).f7923a;
            c0740o.p(false);
            c0740o.M(1117957914);
            boolean zE = c0740o.e(initialSecondsLeft) | c0740o.e(interfaceC0602l);
            Object objF2 = c0740o.F();
            Comparable comparable = initialSecondsLeft.f32100a;
            if (zE || objF2 == obj2) {
                objF2 = ic.d.c(((C2537u) comparable).f34686a, aVar2, interfaceC0602l);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            V vN = b.n((v0) objF2, c0740o, 0);
            V vI = C0718d.I(onCountdownFinished, c0740o);
            C2515C c2515c = C2515C.f34653a;
            c0740o.M(1117966956);
            boolean zE2 = c0740o.e(vN) | c0740o.e(vI);
            Object objF3 = c0740o.F();
            if (zE2 || objF3 == obj2) {
                objF3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.H(vN, vI, null);
                c0740o.U(objF3);
            }
            c0740o.p(false);
            C0718d.d(c0740o, c2515c, (tf.p) objF3);
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean bool = Boolean.TRUE;
            Boolean boolValueOf2 = Boolean.valueOf(z10);
            C2537u c2537u = new C2537u(((C2537u) vN.getValue()).f34686a);
            tf.a aVar3 = (tf.a) vI.getValue();
            int i11 = i10 >> 6;
            cVar.invoke(obj, boolValueOf, bool, aVar, onButtonRendered, boolValueOf2, comparable, c2537u, aVar3, c0740o, Integer.valueOf((i10 & 14) | (i11 & 112) | (i10 & 896) | (i11 & 7168) | (i11 & 57344) | ((i10 >> 9) & 458752) | ((i10 << 6) & 1879048192)));
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.F
                @Override // tf.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int i12 = i5 | 1;
                    tf.a aVar4 = aVar;
                    tf.c cVar2 = cVar;
                    boolean z11 = z10;
                    InterfaceC0602l interfaceC0602l2 = interfaceC0602l;
                    Fe.g.h(initialSecondsLeft, z2, onCountdownFinished, aVar4, onButtonRendered, cVar2, z11, interfaceC0602l2, (C0740o) obj3, i12);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final long i(float f10, boolean z2) {
        return ((z2 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
    }

    public static final void j(int i5, List list) {
        int size = list.size();
        if (i5 < 0 || i5 >= size) {
            throw new IndexOutOfBoundsException(N0.a.e("Index ", i5, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void k(int i5, int i10, List list) {
        int size = list.size();
        if (i5 > i10) {
            throw new IllegalArgumentException(N0.a.e("Indices are out of order. fromIndex (", i5, ") is greater than toIndex (", i10, ")."));
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0279p0.i(i5, "fromIndex (", ") is less than 0."));
        }
        if (i10 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + size + ')');
    }

    public static final boolean l(Object[] objArr, int i5, int i10, List list) {
        if (i10 == list.size()) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (AbstractC3340k.a(objArr[i5 + i11], list.get(i11))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String m(Object[] objArr, int i5, int i10, ff.h hVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i5 + i11];
            if (obj == hVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }

    public static final Z.k n(Z.k shadow, InterfaceC2442E shape, long j8, C0317h c0317h, float f10) {
        InterfaceC2442E interfaceC2442E;
        long j10 = t.f34386a;
        AbstractC3340k.e(shadow, "$this$shadow");
        AbstractC3340k.e(shape, "shape");
        int iCompare = Float.compare(f10, 0);
        Z.k kVarN = Z.i.f16922a;
        if (iCompare <= 0) {
            interfaceC2442E = shape;
        } else {
            interfaceC2442E = shape;
            shadow = u0.Y.a(shadow, e0.z.j(kVarN, new b0.i(f10, interfaceC2442E, j10, j10)));
        }
        if (c0317h != null) {
            kVarN = AbstractC3935e.n(kVarN, new C0313d(c0317h.f1431a, interfaceC2442E, c0317h.f1432b));
        }
        return ic.d.k(U8.v0.l(shadow.g(kVarN), j8, interfaceC2442E), interfaceC2442E);
    }

    public static final long o(long j8, K.o oVar, float f10, C0740o c0740o, int i5) {
        c0740o.M(1561611256);
        L0 l02 = AbstractC0682g.f6260a;
        if (C2465q.b(j8, ((C0680e) c0740o.j(l02)).c()) && oVar != null) {
            C0680e c0680e = (C0680e) c0740o.j(l02);
            if (Float.compare(f10, 0) > 0 && !c0680e.d()) {
                L0 l03 = q.f6287a;
                j8 = e0.z.g(C2465q.a(AbstractC0682g.b(j8, c0740o), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f), j8);
            }
        }
        c0740o.p(false);
        return j8;
    }

    public static final d0.d p(C4061i c4061i) {
        AbstractC3340k.e(c4061i, "<this>");
        y yVarM = c4061i.M();
        if (yVarM != null) {
            return yVarM.U(c4061i, true);
        }
        long j8 = c4061i.f44309c;
        return new d0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j8 >> 32), (int) (j8 & 4294967295L));
    }

    public static final d0.d q(y yVar) {
        AbstractC3340k.e(yVar, "<this>");
        return ((y) z(yVar)).U(yVar, true);
    }

    public static final Uf.g r(String str, SerialDescriptor[] serialDescriptorArr, tf.l lVar) {
        if (Bf.k.y0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Uf.a aVar = new Uf.a(str);
        lVar.invoke(aVar);
        return new Uf.g(str, Uf.j.f12831p, aVar.f12796c.size(), ff.m.L0(serialDescriptorArr), aVar);
    }

    public static final Uf.g s(String serialName, S3.f fVar, SerialDescriptor[] serialDescriptorArr, tf.l lVar) {
        AbstractC3340k.e(serialName, "serialName");
        if (Bf.k.y0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (fVar.equals(Uf.j.f12831p)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        Uf.a aVar = new Uf.a(serialName);
        lVar.invoke(aVar);
        return new Uf.g(serialName, fVar, aVar.f12796c.size(), ff.m.L0(serialDescriptorArr), aVar);
    }

    public static Uf.g t(String serialName, S3.f fVar, SerialDescriptor[] serialDescriptorArr) {
        AbstractC3340k.e(serialName, "serialName");
        if (Bf.k.y0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (fVar.equals(Uf.j.f12831p)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        Uf.a aVar = new Uf.a(serialName);
        return new Uf.g(serialName, fVar, aVar.f12796c.size(), ff.m.L0(serialDescriptorArr), aVar);
    }

    public static void u(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int v(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC1278f.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void w(long j8, Y4.b bVar, w[] wVarArr) {
        int i5;
        while (true) {
            if (bVar.a() <= 1) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (bVar.a() == 0) {
                    i5 = -1;
                    break;
                }
                int iQ = bVar.q();
                i10 += iQ;
                if (iQ != 255) {
                    i5 = i10;
                    break;
                }
            }
            int i11 = 0;
            while (true) {
                if (bVar.a() == 0) {
                    i11 = -1;
                    break;
                }
                int iQ2 = bVar.q();
                i11 += iQ2;
                if (iQ2 != 255) {
                    break;
                }
            }
            int i12 = bVar.f16680b + i11;
            if (i11 == -1 || i11 > bVar.a()) {
                AbstractC4256a.E("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i12 = bVar.f16681c;
            } else if (i5 == 4 && i11 >= 8) {
                int iQ3 = bVar.q();
                int iV = bVar.v();
                int iD = iV == 49 ? bVar.d() : 0;
                int iQ4 = bVar.q();
                if (iV == 47) {
                    bVar.B(1);
                }
                boolean z2 = iQ3 == 181 && (iV == 49 || iV == 47) && iQ4 == 3;
                if (iV == 49) {
                    z2 &= iD == 1195456820;
                }
                if (z2) {
                    x(j8, bVar, wVarArr);
                }
            }
            bVar.A(i12);
        }
    }

    public static void x(long j8, Y4.b bVar, w[] wVarArr) {
        long j10;
        int iQ = bVar.q();
        if ((iQ & 64) != 0) {
            bVar.B(1);
            int i5 = (iQ & 31) * 3;
            int i10 = bVar.f16680b;
            int length = wVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                w wVar = wVarArr[i11];
                bVar.A(i10);
                wVar.c(i5, bVar);
                if (j8 != -9223372036854775807L) {
                    j10 = j8;
                    wVar.b(j10, 1, i5, 0, null);
                } else {
                    j10 = j8;
                }
                i11++;
                j8 = j10;
            }
        }
    }

    public static e y(int i5) {
        return i5 != 0 ? i5 != 1 ? new C1585i() : new C1580d() : new C1585i();
    }

    public static final InterfaceC3906k z(InterfaceC3906k interfaceC3906k) {
        InterfaceC3906k interfaceC3906k2;
        AbstractC3340k.e(interfaceC3906k, "<this>");
        y yVarM = ((y) interfaceC3906k).M();
        InterfaceC3906k interfaceC3906k3 = interfaceC3906k;
        while (true) {
            y yVar = yVarM;
            interfaceC3906k2 = interfaceC3906k3;
            y yVar2 = yVar;
            if (yVar2 == null) {
                break;
            }
            yVarM = yVar2.M();
            interfaceC3906k3 = yVar2;
        }
        y yVar3 = interfaceC3906k2 instanceof y ? (y) interfaceC3906k2 : null;
        if (yVar3 == null) {
            return interfaceC3906k2;
        }
        y yVar4 = yVar3.f45562f;
        while (true) {
            y yVar5 = yVar4;
            y yVar6 = yVar3;
            yVar3 = yVar5;
            if (yVar3 == null) {
                return yVar6;
            }
            yVar4 = yVar3.f45562f;
        }
    }
}
