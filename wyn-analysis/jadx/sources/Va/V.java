package Va;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class V {

    /* renamed from: o, reason: collision with root package name */
    public static final char[] f13768o = {22, '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '&', 'A', 131, 'l', 'm', 131, 129, 129, 131, '|', 'S', 'Z', 129, 130, '|', 'u', 'z', 127, 127, 'z', 'R', 'T', '{', '|', 'w', 'u', 's', 'Q', 'Z', 129, '\"', 'D', 'H', 'G', 'A', 'G', 'I', '9', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'i', 'A'};

    /* renamed from: p, reason: collision with root package name */
    public static int f13769p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f13770q = 1;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f13771a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public boolean f13772b = false;

    /* renamed from: c, reason: collision with root package name */
    public volatile ArrayList f13773c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13774d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f13775e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f13776f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Z7 f13777g = new Z7();

    /* renamed from: h, reason: collision with root package name */
    public C1203x8 f13778h = C1203x8.a();

    /* renamed from: i, reason: collision with root package name */
    public HashMap f13779i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public volatile C1051la f13780j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final Hb f13781l;

    /* renamed from: m, reason: collision with root package name */
    public final Ha f13782m;

    /* renamed from: n, reason: collision with root package name */
    public final C0963f0 f13783n;

    public V(Ha ha, C1194x c1194x, String str, C1051la c1051la, Hb hb2) {
        this.f13782m = ha;
        Handler handlerD = Cb.d();
        C0963f0 c0963f0 = new C0963f0();
        c0963f0.f14152d = new HashSet();
        c0963f0.f14153e = new HashSet();
        c0963f0.f14151c = c1194x;
        c0963f0.f14150b = handlerD;
        this.f13783n = c0963f0;
        Ab.f13210m = new WeakReference(c0963f0);
        int i5 = Ab.f13213p + 123;
        Ab.f13212o = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        P p10 = new P();
        p10.f13592a = this;
        c0963f0.e(p10);
        this.k = str;
        this.f13780j = c1051la;
        this.f13781l = hb2;
    }

    public static /* synthetic */ C1051la A(V v2) {
        int i5 = f13770q + 83;
        f13769p = i5 % 128;
        int i10 = i5 % 2;
        C1051la c1051la = v2.f13780j;
        if (i10 != 0) {
            throw null;
        }
        f13769p = (f13770q + 49) % 128;
        return c1051la;
    }

    public static String B(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 8023077989044355884L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static JSONObject C(B7 b72) throws JSONException {
        f13769p = (f13770q + 27) % 128;
        JSONObject jSONObjectN = n(b72.h());
        try {
            jSONObjectN.put(AbstractC1141sa.f14600U, b72.n());
        } catch (JSONException e7) {
            Ab.R(B(3671 - Color.argb(0, 0, 0, 0), "药贔鿬ꡇ먕쓼핒\ue722\uf1e6ɮఫỿ⽙㤠䮋呇").intern(), B(View.getDefaultSize(0, 0) + 45943, "荩〩\ue5b0餦亂ɟ랅欟ᣱ챢臾㕘\uead6鹀厎¶됳榥ᴜ튜蘃㮛\uef79鳯値ׅ륟滓≛휾蒱㠫\uedecꄑ嚑ਆ뿾").intern(), e7);
        }
        int i5 = f13770q + 61;
        f13769p = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 55 / 0;
        }
        return jSONObjectN;
    }

    public static /* synthetic */ boolean E(V v2, String str) {
        f13770q = (f13769p + 93) % 128;
        boolean zF = v2.F(str);
        int i5 = f13770q + 123;
        f13769p = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 47 / 0;
        }
        return zF;
    }

    public static B7 G(V v2, Context context, String str, Z0 z02) {
        B7 b72;
        f13769p = (f13770q + 67) % 128;
        v2.getClass();
        int i5 = f13770q;
        f13769p = (i5 + 125) % 128;
        if (str != null) {
            C1203x8 c1203x8 = v2.f13778h;
            C0919b8 c0919b8 = new C0919b8();
            try {
                JSONObject jSONObject = new JSONObject(str);
                c0919b8.f14025a = jSONObject;
                c0919b8.f14026b = c1203x8;
                c0919b8.f14027c = jSONObject.optString(C0919b8.f(View.getDefaultSize(0, 0) + 4, new int[]{43372467, -77124090}).intern());
                c0919b8.f14028d = jSONObject.optString(C0919b8.f(MotionEvent.axisFromString("") + 12, new int[]{1709687171, -816869603, 878528559, 1750968025, 2019826997, 898220020}).intern());
                c0919b8.f14029e = jSONObject.optString(C0919b8.d(1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "ᗲᖄ萔՟\udd82眬\ue397ߦ\ud8ef䒪넟").intern());
                c0919b8.f14030f = jSONObject.optString(C0919b8.d(1 - TextUtils.getCapsMode("", 0, 0), "鷮鶃ꩍﵪꒃ她ᮾ织僾櫷").intern());
                c0919b8.f14031g = jSONObject.optString(C0919b8.d(1 - (ViewConfiguration.getLongPressTimeout() >> 16), "쨂쩯鏶톾\ue429惊㝼㹭ܒ卌").intern());
                if (jSONObject.has(C0919b8.f(12 - (Process.myPid() >> 22), new int[]{1007677873, 711957935, 445411583, -1797405368, -770883293, -421803077}).intern())) {
                    c0919b8.h(jSONObject.optJSONObject(C0919b8.f((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, new int[]{1007677873, 711957935, 445411583, -1797405368, -770883293, -421803077}).intern()));
                }
            } catch (Throwable th) {
                AbstractC0897a.f(c0919b8.f14027c, C0919b8.d(1 - TextUtils.indexOf("", "", 0, 0), "\uea2f\uea6a\u0adf\uf35e駾藺ᖖ䎆✩쨮䜓㸇炢蓻犈\ued68舝儁뱨\u10bb90⎜\uefba陼\ue908ﰊ\u1acf䓗㪷캩䑃㍟瑥鬿矟").intern(), th);
            }
            b72 = new B7();
            b72.f13230a = c0919b8;
            b72.f13231b = v2.f13783n;
            b72.f13232c = v2.f13777g;
            b72.f13233d = z02;
            b72.f13234e = context.getApplicationContext();
            b72.f13235f = new ArrayList();
        } else {
            f13769p = (i5 + 41) % 128;
            b72 = null;
        }
        int i10 = f13770q + 35;
        f13769p = i10 % 128;
        if (i10 % 2 == 0) {
            return b72;
        }
        throw null;
    }

    public static /* synthetic */ JSONObject H(B7 b72) throws JSONException {
        int i5 = f13769p + 9;
        f13770q = i5 % 128;
        int i10 = i5 % 2;
        JSONObject jSONObjectC = C(b72);
        if (i10 == 0) {
            int i11 = 1 / 0;
        }
        f13769p = (f13770q + 1) % 128;
        return jSONObjectC;
    }

    public static /* synthetic */ AtomicBoolean M(V v2) {
        int i5 = f13769p;
        int i10 = i5 + 83;
        f13770q = i10 % 128;
        int i11 = i10 % 2;
        AtomicBoolean atomicBoolean = v2.f13771a;
        if (i11 == 0) {
            int i12 = 22 / 0;
        }
        int i13 = i5 + 63;
        f13770q = i13 % 128;
        if (i13 % 2 != 0) {
            return atomicBoolean;
        }
        throw null;
    }

    public static void N(V v2, Z0 z02, B7 b72, AbstractC1127r9 abstractC1127r9, Ba ba2, Context context, String str, String str2, boolean z2) {
        f13770q = (f13769p + 121) % 128;
        v2.getClass();
        Cb.e(new T(v2, z02, b72, abstractC1127r9, ba2, context, str2, str, z2));
        int i5 = f13770q;
        int i10 = i5 + 11;
        f13769p = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i11 = i5 + 29;
        f13769p = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 98 / 0;
        }
    }

    public static /* synthetic */ void O(V v2, Context context, LinkedHashMap linkedHashMap, C1169v c1169v) {
        int i5 = f13770q + 81;
        f13769p = i5 % 128;
        int i10 = i5 % 2;
        v2.r(context, linkedHashMap, c1169v);
        if (i10 != 0) {
            throw null;
        }
        int i11 = f13769p + 87;
        f13770q = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean g(V v2) {
        int i5 = f13769p + 75;
        f13770q = i5 % 128;
        int i10 = i5 % 2;
        boolean zD = v2.d();
        if (i10 == 0) {
            int i11 = 52 / 0;
        }
        int i12 = f13769p + 81;
        f13770q = i12 % 128;
        if (i12 % 2 != 0) {
            return zD;
        }
        throw null;
    }

    public static /* synthetic */ HashMap h(V v2) {
        f13769p = (f13770q + 81) % 128;
        HashMap mapF = v2.f();
        int i5 = f13769p + 105;
        f13770q = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 60 / 0;
        }
        return mapF;
    }

    public static /* synthetic */ void j(V v2) {
        int i5 = f13769p + 21;
        f13770q = i5 % 128;
        int i10 = i5 % 2;
        v2.b();
        if (i10 == 0) {
            int i11 = 83 / 0;
        }
    }

    public static String l(String str, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13768o, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                char[] cArr4 = new char[i10];
                Ab.f13222y = 0;
                while (true) {
                    int i15 = Ab.f13222y;
                    if (i15 >= i10) {
                        break;
                    }
                    cArr4[i15] = cArr[(i10 - i15) - 1];
                    Ab.f13222y = i15 + 1;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr4[i16] = (char) (cArr4[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static /* synthetic */ HashMap m(V v2) {
        f13769p = (f13770q + 119) % 128;
        HashMap mapC = v2.c();
        int i5 = f13769p + 65;
        f13770q = i5 % 128;
        if (i5 % 2 != 0) {
            return mapC;
        }
        throw null;
    }

    public static JSONObject n(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC1141sa.f14601V, str);
        } catch (JSONException e7) {
            Ab.R(B(3671 - ExpandableListView.getPackedPositionGroup(0L), "药贔鿬ꡇ먕쓼핒\ue722\uf1e6ɮఫỿ⽙㤠䮋呇").intern(), B(45942 - TextUtils.indexOf((CharSequence) "", '0', 0), "荩〩\ue5b0餦亂ɟ랅欟ᣱ챢臾㕘\uead6鹀厎¶됳榥ᴜ튜蘃㮛\uef79鳯値ׅ륟滓≛휾蒱㠫\uedecꄑ嚑ਆ뿾").intern(), e7);
        }
        int i5 = f13770q + 39;
        f13769p = i5 % 128;
        if (i5 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    public static JSONObject o(HashMap map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = new HashSet(map.keySet()).iterator();
        while (it.hasNext()) {
            int i5 = f13770q + 43;
            f13769p = i5 % 128;
            if (i5 % 2 != 0) {
                String str = (String) it.next();
                jSONObject2.put(str.toLowerCase(), (JSONObject) map.get(str));
                int i10 = 26 / 0;
            } else {
                String str2 = (String) it.next();
                jSONObject2.put(str2.toLowerCase(), (JSONObject) map.get(str2));
            }
        }
        jSONObject.put(B((ViewConfiguration.getTouchSlop() >> 8) + 31793, "荚ｮ笠\uf7cc").intern(), jSONObject2);
        int i11 = f13770q + 27;
        f13769p = i11 % 128;
        if (i11 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    public static /* synthetic */ List t(V v2) {
        int i5 = f13769p + 87;
        f13770q = i5 % 128;
        if (i5 % 2 == 0) {
            v2.k();
            throw null;
        }
        List listK = v2.k();
        int i10 = f13769p + 71;
        f13770q = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 5 / 0;
        }
        return listK;
    }

    public static /* synthetic */ void v(V v2, HashMap map) {
        int i5 = (f13770q + 1) % 128;
        f13769p = i5;
        v2.f13779i = map;
        int i10 = i5 + 113;
        f13770q = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean z(Va.B7 r3, java.lang.String r4) {
        /*
            int r0 = Va.V.f13770q
            int r0 = r0 + 67
            int r0 = r0 % 128
            Va.V.f13769p = r0
            r0 = 44
            r1 = 7
            r2 = 0
            int[] r0 = new int[]{r0, r1, r2, r2}
            java.lang.String r1 = "\u0000\u0001\u0001\u0000\u0001\u0001\u0001"
            java.lang.String r0 = l(r1, r0)
            java.lang.String r0 = r0.intern()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L5f
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L27
            goto L56
        L27:
            int r0 = Va.V.f13769p
            int r0 = r0 + 27
            int r1 = r0 % 128
            Va.V.f13770q = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L41
            java.lang.String r0 = r3.f()
            int r0 = Va.AbstractC1104pb.b(r4, r0)
            r1 = 73
            int r1 = r1 / r2
            if (r0 < 0) goto L56
            goto L4b
        L41:
            java.lang.String r0 = r3.f()
            int r0 = Va.AbstractC1104pb.b(r4, r0)
            if (r0 < 0) goto L56
        L4b:
            java.lang.String r3 = r3.e()
            int r3 = Va.AbstractC1104pb.b(r4, r3)
            if (r3 > 0) goto L56
            goto L5f
        L56:
            int r3 = Va.V.f13769p
            int r3 = r3 + 51
            int r3 = r3 % 128
            Va.V.f13770q = r3
            goto L60
        L5f:
            r2 = 1
        L60:
            int r3 = Va.V.f13770q
            int r3 = r3 + 97
            int r3 = r3 % 128
            Va.V.f13769p = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.V.z(Va.B7, java.lang.String):boolean");
    }

    public final void D(Context context, AbstractC1127r9 abstractC1127r9, String str, Ba ba2) {
        Cb.g(new Ga(this, str, context, abstractC1127r9, ba2, 1));
        int i5 = f13770q + 3;
        f13769p = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 77 / 0;
        }
    }

    public final boolean F(String str) {
        int i5 = f13770q + 109;
        f13769p = i5 % 128;
        if (i5 % 2 != 0) {
            this.f13779i.containsKey(str);
            throw null;
        }
        if (!(!this.f13779i.containsKey(str))) {
            int i10 = f13769p + 101;
            f13770q = i10 % 128;
            int i11 = i10 % 2;
            String str2 = this.k;
            if (i11 == 0) {
                ((K) this.f13779i.get(str)).b(str2);
                throw null;
            }
            if (((K) this.f13779i.get(str)).b(str2)) {
                return true;
            }
        }
        int i12 = f13769p + 53;
        f13770q = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final void I(B7 b72, String str) {
        int i5 = f13770q + 85;
        f13769p = i5 % 128;
        if (i5 % 2 != 0) {
            this.f13771a.get();
            throw null;
        }
        if (this.f13771a.get()) {
            return;
        }
        String strJ = b72.j();
        C1051la c1051la = this.f13780j;
        if (c1051la != null) {
            Cb.g(new Da(c1051la, strJ, EnumC0898a0.f13944c, 8));
            Cb.g(new O(this, b72, strJ, str));
        } else {
            int i10 = f13770q + 95;
            f13769p = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [Va.Ga] */
    public final void J(Context context, ArrayList arrayList, ArrayList arrayList2, Da da2) {
        Context context2;
        int i5 = f13770q + 61;
        f13769p = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 16 / 0;
            if (arrayList.isEmpty()) {
                return;
            }
        } else if (arrayList.isEmpty()) {
            return;
        }
        AbstractC1127r9 abstractC1127r9 = (AbstractC1127r9) arrayList.remove(0);
        String str = (String) arrayList2.remove(0);
        if (arrayList.isEmpty()) {
            int i11 = f13770q + 123;
            f13769p = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            context2 = context;
        } else {
            context2 = context;
            da2 = new Ga(this, context2, arrayList, arrayList2, da2, 2);
        }
        D(context2, abstractC1127r9, str, da2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3.f13771a.getAndSet(true) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void K() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = Va.V.f13769p     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + 105
            int r1 = r0 % 128
            Va.V.f13770q = r1     // Catch: java.lang.Throwable -> L17
            int r0 = r0 % 2
            if (r0 != 0) goto L19
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f13771a     // Catch: java.lang.Throwable -> L17
            r1 = 0
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L24
            goto L22
        L17:
            r0 = move-exception
            goto L53
        L19:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f13771a     // Catch: java.lang.Throwable -> L17
            r1 = 1
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L24
        L22:
            monitor-exit(r3)
            return
        L24:
            Va.la r0 = r3.f13780j     // Catch: java.lang.Throwable -> L17
            Va.L r1 = new Va.L     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            r1.f13510d = r3     // Catch: java.lang.Throwable -> L17
            Va.Cb.e(r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L46
            Va.v r1 = new Va.v     // Catch: java.lang.Throwable -> L17
            r2 = 14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            r1.f14690d = r0     // Catch: java.lang.Throwable -> L17
            Va.Cb.g(r1)     // Catch: java.lang.Throwable -> L17
            int r0 = Va.V.f13770q     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + 115
            int r0 = r0 % 128
            Va.V.f13769p = r0     // Catch: java.lang.Throwable -> L17
        L46:
            r0 = 0
            r3.f13780j = r0     // Catch: java.lang.Throwable -> L17
            int r0 = Va.V.f13769p     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + 105
            int r0 = r0 % 128
            Va.V.f13770q = r0     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)
            return
        L53:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.V.K():void");
    }

    public final synchronized ISAdQualityInitListener L() {
        int i5 = f13770q;
        Hb hb2 = this.f13781l;
        int i10 = i5 + 79;
        f13769p = i10 % 128;
        if (i10 % 2 == 0) {
            return hb2;
        }
        int i11 = 19 / 0;
        return hb2;
    }

    public final void P(Context context, Da da2) {
        List list = Y.f13862a;
        List listAsList = Arrays.asList(new C0985g9(3), new C0985g9(1), new C0985g9(0));
        Y.f13865d = (Y.f13866e + 41) % 128;
        J(context, new ArrayList(listAsList), new ArrayList(Y.c()), da2);
        f13769p = (f13770q + 99) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:3:0x0001, B:5:0x000e, B:16:0x002a, B:18:0x0030, B:26:0x0042, B:11:0x001d, B:14:0x0020, B:24:0x0040, B:7:0x0018), top: B:35:0x0001, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = Va.V.f13769p     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 + 97
            int r1 = r0 % 128
            Va.V.f13770q = r1     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L20
            Va.G r0 = Va.G.S()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.C()     // Catch: java.lang.Throwable -> L1e
            r2 = 48
            int r2 = r2 / r1
            if (r0 == 0) goto L43
            goto L2a
        L1c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = move-exception
            goto L45
        L20:
            Va.G r0 = Va.G.S()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.C()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L43
        L2a:
            boolean r0 = r3.d()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L43
            int r0 = Va.V.f13770q     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 + 117
            int r1 = r0 % 128
            Va.V.f13769p = r1     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 % 2
            if (r0 != 0) goto L3f
            monitor-exit(r3)
            r0 = 1
            return r0
        L3f:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1e
        L43:
            monitor-exit(r3)
            return r1
        L45:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.V.a():boolean");
    }

    public final synchronized void b() {
        f13769p = (f13770q + 121) % 128;
        C1051la c1051la = this.f13780j;
        if (c1051la == null) {
            f13770q = (f13769p + 89) % 128;
        } else {
            if (c1051la.q(a())) {
                ((Hb) L()).adQualitySdkInitSuccess();
                return;
            }
            ((Hb) L()).adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, B(TextUtils.getOffsetBefore("", 0) + 60703, "荢湜夲䐒㜿⋙\u0df8\uf890\uebb7핏쁵댋鸫覟瓩枘劮㱆⼢ᨍԯ\uf0c6\ue3e2캀릠ꬋ陹脜氫忌䫫㖞₿Ꮅ﵇\ue87d\udb1c옮").intern());
        }
    }

    public final synchronized HashMap c() {
        HashMap map;
        int i5 = f13769p;
        map = this.f13776f;
        int i10 = i5 + 75;
        f13770q = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return map;
    }

    public final synchronized boolean d() {
        boolean zD;
        try {
            int i5 = f13769p + 73;
            f13770q = i5 % 128;
            if (i5 % 2 == 0) {
                zD = G.S().D();
                int i10 = 68 / 0;
            } else {
                zD = G.S().D();
            }
            int i11 = f13769p + 3;
            f13770q = i11 % 128;
            if (i11 % 2 != 0) {
                return zD;
            }
            int i12 = 97 / 0;
            return zD;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ArrayList e() {
        f13770q = (f13769p + 63) % 128;
        if (this.f13773c != null) {
            ArrayList arrayList = new ArrayList(this.f13773c);
            int i5 = f13769p + 11;
            f13770q = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 2 / 0;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = f13769p + 109;
        f13770q = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList2;
        }
        throw null;
    }

    public final synchronized HashMap f() {
        HashMap map;
        int i5 = (f13770q + 37) % 128;
        f13769p = i5;
        map = this.f13775e;
        int i10 = i5 + 5;
        f13770q = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return map;
    }

    public final synchronized ArrayList i() {
        ArrayList arrayList;
        int i5 = (f13769p + 7) % 128;
        f13770q = i5;
        arrayList = this.f13774d;
        int i10 = i5 + 75;
        f13769p = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return arrayList;
    }

    public final synchronized List k() {
        ArrayList arrayList;
        f13770q = (f13769p + 103) % 128;
        arrayList = this.f13773c;
        f13770q = (f13769p + 107) % 128;
        return arrayList;
    }

    public final void p(Context context) {
        f13770q = (f13769p + 9) % 128;
        if (!d()) {
            L l10 = new L(this);
            G gS = G.S();
            gS.getClass();
            int i5 = G.f13354E + 1;
            G.f13355F = i5 % 128;
            int i10 = i5 % 2;
            int i11 = gS.f13361j;
            JSONObject jSONObjectE = gS.e();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Cb.f(l10, jSONObjectE.optInt(G.T(i10 == 0 ? 3 >> (jUptimeMillis > 1L ? 1 : (jUptimeMillis == 1L ? 0 : -1)) : (jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1)) + 3, "㕺쫅樵㘄").intern(), i11));
            f13769p = (f13770q + 107) % 128;
        }
        Cb.g(new Da(this, context, Y.e()));
    }

    public final void q(Context context, String str, String str2, List list, M m10) {
        Q q4 = new Q();
        q4.f13624h = this;
        q4.f13619c = str2;
        q4.f13620d = context;
        q4.f13621e = str;
        q4.f13622f = list;
        q4.f13623g = m10;
        Cb.e(q4);
        int i5 = f13770q + 113;
        f13769p = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 30 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        Va.V.f13770q = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:2:0x0000->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(android.content.Context r10, java.util.LinkedHashMap r11, Va.C1169v r12) {
        /*
            r9 = this;
        L0:
            int r0 = r11.size()
            if (r0 <= 0) goto L89
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r11.remove(r5)
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L4f
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            goto L4f
        L25:
            int r0 = Va.V.f13770q
            int r0 = r0 + 115
            int r0 = r0 % 128
            Va.V.f13769p = r0
            r0 = 0
            java.lang.Object r1 = r6.get(r0)
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r6.get(r0)
            Va.r9 r1 = (Va.AbstractC1127r9) r1
            java.lang.String r1 = r1.a()
            int r2 = Va.V.f13769p
            int r2 = r2 + 117
            int r3 = r2 % 128
            Va.V.f13770q = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L4d
            r2 = 9
            int r2 = r2 / r0
        L4d:
            r3 = r1
            goto L51
        L4f:
            r1 = 0
            goto L4d
        L51:
            if (r3 == 0) goto L0
            Va.la r0 = r9.f13780j
            if (r0 == 0) goto L6b
            java.util.HashMap r0 = r0.f14368a
            Va.c0 r1 = new Va.c0
            r1.<init>()
            Va.a0 r2 = Va.EnumC0898a0.f13942a
            r1.f14061g = r2
            Va.b0 r2 = Va.EnumC0911b0.f14011a
            r1.f14062h = r2
            r1.f14055a = r3
            r0.put(r3, r1)
        L6b:
            Va.N r1 = new Va.N
            r2 = r9
            r4 = r10
            r7 = r11
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            Va.Cb.c(r1)
            boolean r10 = r9.d()
            if (r10 != 0) goto L88
            r9.r(r4, r7, r8)
            int r10 = Va.V.f13769p
            int r10 = r10 + 69
        L84:
            int r10 = r10 % 128
            Va.V.f13770q = r10
        L88:
            return
        L89:
            r8 = r12
            Va.v r10 = new Va.v
            r11 = 12
            r10.<init>(r8, r11)
            Va.Cb.e(r10)
            int r10 = Va.V.f13769p
            int r10 = r10 + 101
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.V.r(android.content.Context, java.util.LinkedHashMap, Va.v):void");
    }

    public final void s(String str, JSONObject jSONObject) throws JSONException {
        C1051la c1051la = this.f13780j;
        if (c1051la != null) {
            Cb.g(new Da(c1051la, str, EnumC0898a0.f13946e, 8));
            f13769p = (f13770q + 29) % 128;
        }
        if (jSONObject != null) {
            try {
                jSONObject.put(B((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 39798, "荈ᠸ떱").intern(), true);
                int i5 = f13770q + 73;
                f13769p = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final JSONObject u() {
        int i5 = f13770q + 117;
        f13769p = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                o(f());
                throw null;
            }
            JSONObject jSONObjectO = o(f());
            int i10 = f13770q + 85;
            f13769p = i10 % 128;
            if (i10 % 2 == 0) {
                return jSONObjectO;
            }
            throw null;
        } catch (JSONException e7) {
            Ab.R(B(Color.red(0) + 3671, "药贔鿬ꡇ먕쓼핒\ue722\uf1e6ɮఫỿ⽙㤠䮋呇").intern(), B(View.MeasureSpec.makeMeasureSpec(0, 0) + 14593, "荩멟\uf15c⡀杚鸉핋\u0c4f䭀艌륈\uf040⼀時鵍푍ፒ䩘腝롋\uf757⹋攚鱍\udb51ቇ䥅聞뽟\uf65fⵁ").intern(), e7);
            return new JSONObject();
        }
    }

    public final void w(Context context, String str, String str2, AbstractC1127r9 abstractC1127r9, Ba ba2) {
        Pa oa2;
        abstractC1127r9.getClass();
        int i5 = AbstractC1127r9.f14558b + 95;
        AbstractC1127r9.f14557a = i5 % 128;
        if (i5 % 2 != 0) {
            G.S().J().x();
            throw null;
        }
        long j8 = 0;
        if (G.S().J().x()) {
            String strU = G.S().J().u(abstractC1127r9.a());
            if (TextUtils.isEmpty(strU)) {
                int i10 = AbstractC1127r9.f14557a + 109;
                AbstractC1127r9.f14558b = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                oa2 = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractC1127r9.b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17291, "豍쿊ୖ䛡艧\uddfaᤘ和逄펾⽯").intern());
                sb2.append(abstractC1127r9.a());
                oa2 = new Ma(sb2.toString(), AbstractC1127r9.b(3371 - KeyEvent.normalizeMetaState(0), "谙脫陈").intern(), strU);
                AbstractC1127r9.f14558b = (AbstractC1127r9.f14557a + 3) % 128;
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(AbstractC1127r9.b(17290 - TextUtils.lastIndexOf("", '0', 0, 0), "豍쿊ୖ䛡艧\uddfaᤘ和逄펾⽯").intern());
            sb3.append(abstractC1127r9.a());
            oa2 = new Oa(1, sb3.toString(), AbstractC1127r9.b(3419 - AndroidCharacter.getMirror('0'), "谙脫陈").intern());
        }
        if (oa2 == null) {
            Cb.e(ba2);
            return;
        }
        f13769p = (f13770q + 53) % 128;
        Z0 z0C = abstractC1127r9.c();
        f13769p = (f13770q + 71) % 128;
        f().put(str2, n(z0C.x0()));
        f13770q = (f13769p + 119) % 128;
        C1051la c1051la = this.f13780j;
        if (c1051la != null) {
            Cb.g(new Da(c1051la, str2, EnumC0898a0.f13943b, 8));
            f13770q = (f13769p + 31) % 128;
        }
        Ha ha = this.f13782m;
        q.s1 s1Var = new q.s1();
        s1Var.f43902g = this;
        s1Var.f43896a = context;
        s1Var.f43897b = z0C;
        s1Var.f43898c = str;
        s1Var.f43899d = str2;
        s1Var.f43900e = abstractC1127r9;
        s1Var.f43901f = ba2;
        String strC = ha.c(oa2, s1Var);
        U u10 = new U();
        u10.f13742j = this;
        u10.f13735c = context;
        u10.f13736d = strC;
        u10.f13737e = z0C;
        u10.f13738f = str;
        u10.f13739g = str2;
        u10.f13740h = abstractC1127r9;
        u10.f13741i = ba2;
        f13770q = (f13769p + 83) % 128;
        if (G.S().R()) {
            int i11 = (f13770q + 69) % 128;
            f13769p = i11;
            f13770q = (i11 + 13) % 128;
        } else {
            Ha ha2 = this.f13782m;
            ha2.getClass();
            int i12 = Ha.f13416h + 47;
            Ha.f13415g = i12 % 128;
            int i13 = i12 % 2;
            Ra ra2 = ha2.f13417a;
            if (i13 != 0) {
                ra2.m(oa2.d());
                throw null;
            }
            if (ra2.m(oa2.d()) != null) {
                int i14 = Ha.f13415g + 121;
                Ha.f13416h = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 67 / 0;
                }
                Cb.f(u10, j8);
            }
            int i16 = f13769p + 39;
            f13770q = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
        }
        j8 = 2000;
        Cb.f(u10, j8);
    }

    public final void x(Context context, String str, String str2, List list, M m10) {
        Iterator it;
        int i5 = f13769p + 63;
        f13770q = i5 % 128;
        if (i5 % 2 == 0) {
            it = list.iterator();
            int i10 = 1 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            int i11 = f13769p + 21;
            f13770q = i11 % 128;
            if (i11 % 2 == 0) {
                w(context, str, str2, (AbstractC1127r9) it.next(), m10);
                throw null;
            }
            w(context, str, str2, (AbstractC1127r9) it.next(), m10);
        }
    }

    public final void y(String str, List list) {
        int i5;
        if (this.f13771a.get()) {
            i5 = f13770q + 43;
        } else {
            Iterator it = e().iterator();
            while (it.hasNext()) {
                int i10 = f13770q + 69;
                f13769p = i10 % 128;
                if (i10 % 2 != 0) {
                    ((B7) it.next()).p(str, list);
                    throw null;
                }
                ((B7) it.next()).p(str, list);
            }
            i5 = f13770q + 125;
        }
        f13769p = i5 % 128;
    }
}
