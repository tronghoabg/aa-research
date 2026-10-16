package Va;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import c8.C1581e;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wa.C4398a;

/* loaded from: classes4.dex */
public abstract class Ab {

    /* renamed from: A, reason: collision with root package name */
    public static int f13193A = 0;

    /* renamed from: C, reason: collision with root package name */
    public static int f13195C = 0;

    /* renamed from: D, reason: collision with root package name */
    public static int f13196D = 1;

    /* renamed from: E, reason: collision with root package name */
    public static int f13197E = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f13208j = 1;

    /* renamed from: m, reason: collision with root package name */
    public static WeakReference f13210m = null;

    /* renamed from: o, reason: collision with root package name */
    public static int f13212o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f13213p = 1;

    /* renamed from: r, reason: collision with root package name */
    public static int f13215r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static int f13216s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static int f13217t;

    /* renamed from: v, reason: collision with root package name */
    public static int f13219v;

    /* renamed from: w, reason: collision with root package name */
    public static int f13220w;

    /* renamed from: y, reason: collision with root package name */
    public static int f13222y;

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f13206h = {'v', 246, 248, 218, 226, 253, 247, 248, 245, 246, 245, 246, 246, 240, 209, 176, 208, 243, 252, 245, 207, 213, 17, '%', ')', '2', 'r', 233, 233, 232, 232, 196, 203, 242, 234, 232, 235, 216, 222, 239, 232, 224, 221, 228, 223, 188, 195, 234, 236, 232, 196, 203, 206, 203, 234, 233, 241, 243, 218, 'k', 236, 261, 259, 251, 252, 221, 224, 221, 214, 250, 254, 252, 213, 206, 241, 246, 229, 232, 256, 259, 257, 252, 231, 234, 253, 250, 252, 260, 221, 214, 250, 250, 251, 251, '9', 'o', 'j', 'n', 'd', 'f', 'n', 'g', '_', '\\', 'c', '^', '9', 's', 'q', 'i', 'g', 'j', 'g', 'A', 'I', 'k', 'i', 'n', 'k', 'D', 'I', 'p', 'j', 'C', 'C', 'j', 'k', 'j', 'g', 'd', 'f', 'e', 'A', 'I', 'p', 'p', 'r', '[', 145, 286, 247, 240, 275, 280, 273, 276, 284, 291, 274, 268, 287, 284, 286, 294, 273, 272, 295, 293, 293, 254, 246, 282, 283, 281, 284, 287, 288, 287, 248, 249, 284, 248, 254, 287, 237, 166, 248, 245, 248, 248, 203, 234, 242, 235, 239, 236, 166, 250, 244, 235, 239, 242, 233, 166, 237, 244, 239, 250, 250, 235};

    /* renamed from: a, reason: collision with root package name */
    public static boolean f13199a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f13200b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f13201c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f13202d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f13203e = false;

    /* renamed from: f, reason: collision with root package name */
    public static zb f13204f = new zb();

    /* renamed from: g, reason: collision with root package name */
    public static zb f13205g = new zb();

    /* renamed from: i, reason: collision with root package name */
    public static int f13207i = 112;
    public static final byte[] k = {64, -54, -113, -47, 98, -52, 87, -102, -65, -127, 89, 51, -11, -35, 30, 77, -45, 75, -26, 3};

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f13209l = {-41, -56, -38, 92, 86, 96, 117, -39, 100, 93, 110, -17, -114, -122, -98, 122, -104, -126, -108, -87, 94, -111, -108, 122, -68, -123, -110, 124, 101, -112, -106, -120, -106, 119, -81, 120, -82, 8, -99, -102, -89, -24, 79, -103, -14, 89, -106, -94, -109, -14, 89, -113, -79, -101, -110, -103, -13, 74, -97, -80, -109, -37, 97, -98, -87, -117, -97, -93, -93, -25, 74, -97, -97, -89, -95, -28, 87, -105, -93, -93, -98, -95, -33, 76, -95, -101, -98, -53};

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f13211n = {70, -122, -126, -117, 48, -114, 100, 39, -30, -36, -9, -11, -36, -36, 7, -40, -17, 105, -75, 94, 111, 98, 107, 47, 26, 49, -50, 117, 34, 40, 35, -8, 89, 42, 19, 36, 6, 58, 30, 23, 40, 19, 20, -32, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f13214q = {-113, 106, -82, -76, -90, -76, -107, -51, -106, -52, -54, 100, -85, -102, -90, -81, -59, -114, -88, -90, -46, 0, 0};

    /* renamed from: u, reason: collision with root package name */
    public static final Object f13218u = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final Object f13221x = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static final Object f13223z = new Object();

    /* renamed from: B, reason: collision with root package name */
    public static final Object f13194B = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static final Object f13198F = new Object();

    public static void A(String str, String str2, String str3, Throwable th) {
        f13213p = (f13212o + 29) % 128;
        try {
            f0(str, str2, str3, th, null, null, false, false, false);
            int i5 = f13212o + 109;
            f13213p = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 46 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static void B(String str, String str2, Throwable th) {
        f13216s = (f13215r + 123) % 128;
        P(str, str, str2, th, null, true);
        f13215r = (f13216s + 121) % 128;
    }

    public static void C(String str, String str2, boolean z2) {
        f13216s = (f13215r + 113) % 128;
        n(str, str, str2, z2);
        int i5 = f13215r + 93;
        f13216s = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void D(JSONArray jSONArray, int i5) throws JSONException {
        int i10 = f13195C + 97;
        f13196D = i10 % 128;
        int i11 = i10 % 2 == 0 ? 1 : 0;
        while (i11 < jSONArray.length()) {
            int i12 = f13196D + 33;
            f13195C = i12 % 128;
            if (i12 % 2 != 0) {
                r(jSONArray, i11, i5);
                i11 += 100;
            } else {
                r(jSONArray, i11, i5);
                i11++;
            }
        }
    }

    public static zb E(WebView webView, Object obj, InterfaceC1064ma interfaceC1064ma) {
        zb zbVar = new zb();
        List listB = s().B();
        int iU = s().u();
        f13207i = (f13208j + 45) % 128;
        C1077na c1077naD = d(webView, interfaceC1064ma, listB, iU);
        int i5 = f13208j;
        f13207i = (i5 + 111) % 128;
        if (c1077naD != null) {
            f13207i = (i5 + 49) % 128;
            Object objS0 = c1077naD.s0();
            if (objS0 == obj) {
                int i10 = f13208j;
                zbVar.f14848a = true;
                f13207i = (i10 + 45) % 128;
                return zbVar;
            }
            List listZ = s().z();
            int iX = s().x();
            int i11 = f13207i + 17;
            f13208j = i11 % 128;
            if (i11 % 2 == 0) {
                d(objS0, interfaceC1064ma, listZ, iX);
                throw null;
            }
            C1077na c1077naD2 = d(objS0, interfaceC1064ma, listZ, iX);
            if (c1077naD2 != null) {
                int i12 = f13208j + 85;
                f13207i = i12 % 128;
                if (i12 % 2 != 0) {
                    c1077naD2.s0();
                    throw null;
                }
                if (c1077naD2.s0() == obj) {
                    zbVar.f14849b = true;
                    return zbVar;
                }
            }
        }
        return zbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebViewClient F(android.webkit.WebView r13) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Ab.F(android.webkit.WebView):android.webkit.WebViewClient");
    }

    public static String G(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i11 + 27;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13214q[(-719865405) + i10] + 27);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i10 + i12) - 719865407) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 - 1047196710);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13214q;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static String H(int i5, Object obj) throws JSONException {
        if (obj instanceof JSONObject) {
            f13195C = (f13196D + 43) % 128;
            q(null, i5, (JSONObject) obj);
            f13195C = (f13196D + 5) % 128;
            return null;
        }
        if (obj instanceof JSONArray) {
            int i10 = f13196D + 45;
            f13195C = i10 % 128;
            if (i10 % 2 == 0) {
                D((JSONArray) obj, i5);
                return null;
            }
            D((JSONArray) obj, i5);
            throw null;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        f13195C = (f13196D + 43) % 128;
        String str = (String) obj;
        if (str.length() <= i5) {
            f13196D = (f13195C + 91) % 128;
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, i5));
        sb2.append(T((char) ((ViewConfiguration.getTouchSlop() >> 8) + 57798), "䭠뢾욬듡", "\uf4de啴ố쇬\ud8ec\uee1cᘃ◑\uf6b3ꊕ﵂ᔩ噚럯", KeyEvent.getMaxKeyCode() >> 16).intern());
        return sb2.toString();
    }

    public static String I(String str, C1023j8 c1023j8) {
        int i5 = (f13216s + 51) % 128;
        f13215r = i5;
        if (c1023j8 != null) {
            StringBuilder sbJ = N0.a.j(str);
            sbJ.append(G(1047196719 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 719865405, (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) (MotionEvent.axisFromString("") - 55), Process.getGidForName("") - 25).intern());
            sbJ.append(c1023j8);
            return sbJ.toString();
        }
        int i10 = i5 + 29;
        f13216s = i10 % 128;
        if (i10 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static String J(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 43;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13209l[1365682921 + i11] + 43);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-1365682919)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 - 847216854);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13209l;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static Throwable K(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
            f13213p = (f13212o + 93) % 128;
        }
        int i5 = f13212o + 57;
        f13213p = i5 % 128;
        if (i5 % 2 != 0) {
            return th;
        }
        throw null;
    }

    public static ArrayList L(JSONArray jSONArray) {
        int i5 = f13195C;
        f13196D = (i5 + 11) % 128;
        if (jSONArray == null) {
            f13196D = (i5 + 119) % 128;
            return null;
        }
        ArrayList arrayListI = i(jSONArray);
        f13195C = (f13196D + 85) % 128;
        return arrayListI;
    }

    public static HashMap M(JSONObject jSONObject, InterfaceC1129rb interfaceC1129rb) {
        if (jSONObject == null) {
            int i5 = f13196D + 103;
            f13195C = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        f13196D = (f13195C + 55) % 128;
        while (itKeys.hasNext()) {
            f13195C = (f13196D + 97) % 128;
            String next = itKeys.next();
            map.put(next, interfaceC1129rb.n(next, jSONObject));
        }
        return map;
    }

    public static Map N(JSONObject jSONObject) {
        HashMap mapM = M(jSONObject, new C1581e(28));
        f13195C = (f13196D + 39) % 128;
        return mapM;
    }

    public static m9.S O() {
        m9.S s10 = new m9.S(28);
        int i5 = f13207i + 123;
        f13208j = i5 % 128;
        if (i5 % 2 != 0) {
            return s10;
        }
        throw null;
    }

    public static void P(String str, String str2, String str3, Throwable th, C1023j8 c1023j8, boolean z2) {
        if (!h0()) {
            if (z2) {
                f13216s = (f13215r + 125) % 128;
                if (e().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
                    Log.e(g(str2), I(str3, c1023j8), th);
                }
            }
            f13216s = (f13215r + 61) % 128;
            return;
        }
        int i5 = f13215r + 107;
        f13216s = i5 % 128;
        if (i5 % 2 != 0) {
            Log.e(g(str), I(str3, c1023j8), th);
        } else {
            Log.e(g(str), I(str3, c1023j8), th);
            int i10 = 78 / 0;
        }
    }

    public static void Q(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z2) {
        f13213p = (f13212o + 9) % 128;
        try {
            f0(str, str2, str3, th, null, jSONObject, true, false, z2);
            int i5 = f13212o + 15;
            f13213p = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    public static void R(String str, String str2, Throwable th) {
        f13215r = (f13216s + 43) % 128;
        P(str, str, str2, th, null, false);
        f13215r = (f13216s + 25) % 128;
    }

    public static void S(JSONObject jSONObject, JSONObject jSONObject2, boolean z2) throws JSONException {
        int i5 = f13195C + 83;
        f13196D = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        f13196D = (f13195C + 85) % 128;
        while (itKeys.hasNext()) {
            int i10 = f13195C + 87;
            f13196D = i10 % 128;
            if (i10 % 2 == 0) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.opt(next));
                throw null;
            }
            String next2 = itKeys.next();
            try {
                jSONObject.put(next2, jSONObject2.opt(next2));
                f13195C = (f13196D + 99) % 128;
            } catch (JSONException unused) {
            }
        }
        if (z2) {
            jSONObject.remove(AbstractC1141sa.f14615f);
        }
    }

    public static String T(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 62518);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    public static String U(Throwable th, C1023j8 c1023j8) {
        if (c1023j8 != null) {
            int i5 = f13213p + 53;
            f13212o = i5 % 128;
            if (i5 % 2 == 0) {
                return c1023j8.toString();
            }
            String string = c1023j8.toString();
            int i10 = 9 / 0;
            return string;
        }
        if (!(th instanceof C1023j8)) {
            return Log.getStackTraceString(th);
        }
        int i11 = f13213p + 1;
        f13212o = i11 % 128;
        if (i11 % 2 != 0) {
            th.toString();
            throw null;
        }
        String string2 = th.toString();
        f13213p = (f13212o + 7) % 128;
        return string2;
    }

    public static List V(JSONObject jSONObject, String str, List list) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            return L(jSONArrayOptJSONArray);
        }
        int i5 = (f13195C + 73) % 128;
        f13196D = i5;
        int i10 = i5 + 115;
        f13195C = i10 % 128;
        if (i10 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static JSONObject W(int i5, int i10, long j8, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j8 > -1) {
                f13196D = (f13195C + 39) % 128;
                jSONObject.put(T((char) (45963 - View.MeasureSpec.getSize(0)), "→\uf26c謝妳", "塡", 502426657 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), i5);
                jSONObject.put(T((char) (50150 - TextUtils.indexOf("", "", 0, 0)), "ℤ㱩\ue658\ue2c3", "搽", TextUtils.lastIndexOf("", '0', 0) + 1480354082).intern(), i10);
                jSONObject.put(T((char) (45758 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), "ꪺ䞮붱캲", "紉", Gravity.getAbsoluteGravity(0, 0) - 1320702294).intern(), j8);
                jSONObject.put(T((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26743), "ㄍ䐼磆꽨", "葃", (-968606671) - KeyEvent.keyCodeFromString("")).intern(), j10);
            } else {
                jSONObject.put(T((char) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 45963), "→\uf26c謝妳", "塡", 502426657 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), -1);
                jSONObject.put(T((char) (50150 - (ViewConfiguration.getPressedStateDuration() >> 16)), "ℤ㱩\ue658\ue2c3", "搽", TextUtils.indexOf("", "") + 1480354081).intern(), -1);
                jSONObject.put(T((char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 45756), "ꪺ䞮붱캲", "紉", TextUtils.getOffsetBefore("", 0) - 1320702294).intern(), -1);
                jSONObject.put(T((char) (26744 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "ㄍ䐼磆꽨", "葃", (-968606671) - View.resolveSizeAndState(0, 0, 0)).intern(), -1);
                f13196D = (f13195C + 37) % 128;
            }
        } catch (JSONException e7) {
            R(T((char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), "䀜ᯕహ剈", "鮶댺뚀萸䵎マ魴❍쟿", 958125376 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), T((char) (43701 - KeyEvent.getDeadChar(0, 0)), "\uf8da㟴딨\ueaaa", "瀁圫햍讓됟춭澥\ueb7d手്朄뱇ႆ⒘羽ﰴ낯ӓ㊷ᯚ譜\uddab\ue98fꞚ\ua95c跡ᘰ\uf15f\uebf6", 674755832 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), e7);
        }
        int i11 = f13195C + 121;
        f13196D = i11 % 128;
        if (i11 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject X(org.json.JSONObject r2, boolean r3) {
        /*
            int r0 = Va.Ab.f13196D
            int r0 = r0 + 47
            int r1 = r0 % 128
            Va.Ab.f13195C = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L13
            r0 = 65
            int r0 = r0 / 0
            if (r2 == 0) goto L34
            goto L15
        L13:
            if (r2 == 0) goto L34
        L15:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L34
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L34
            r0.<init>(r2)     // Catch: org.json.JSONException -> L34
            if (r3 == 0) goto L25
            java.lang.String r2 = Va.AbstractC1141sa.f14615f     // Catch: org.json.JSONException -> L34
            r0.remove(r2)     // Catch: org.json.JSONException -> L34
        L25:
            int r2 = Va.Ab.f13195C
            int r2 = r2 + 5
            int r3 = r2 % 128
            Va.Ab.f13196D = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L32
            return r0
        L32:
            r2 = 0
            throw r2
        L34:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Ab.X(org.json.JSONObject, boolean):org.json.JSONObject");
    }

    public static void Y(String str, String str2) {
        int i5 = f13216s + 75;
        f13215r = i5 % 128;
        Z(str, str, str2, i5 % 2 == 0);
    }

    public static void Z(String str, String str2, String str3, boolean z2) {
        f13216s = (f13215r + 43) % 128;
        if (h0()) {
            Log.i(g(str), str3);
            return;
        }
        if ((!z2) || !e().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            return;
        }
        int i5 = f13216s + 69;
        f13215r = i5 % 128;
        if (i5 % 2 == 0) {
            Log.i(g(str2), str3);
        } else {
            Log.i(g(str2), str3);
            int i10 = 21 / 0;
        }
    }

    public static void a(String str, String str2) {
        int i5 = f13216s + 49;
        f13215r = i5 % 128;
        int i10 = i5 % 2;
        w(null, str, str, str2);
        if (i10 != 0) {
            throw null;
        }
    }

    public static void a0(String str, String str2, Throwable th, boolean z2) {
        f13213p = (f13212o + 55) % 128;
        try {
            b0(str, str2, th, z2, false);
            f13213p = (f13212o + 97) % 128;
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, String str2) {
        int i5 = (f13215r + 87) % 128;
        f13216s = i5;
        int i10 = i5 + 97;
        f13215r = i10 % 128;
        int i11 = i10 % 2;
        z(str, str, str2, null, false);
        f13215r = (f13216s + 29) % 128;
    }

    public static void b0(String str, String str2, Throwable th, boolean z2, boolean z10) {
        f13213p = (f13212o + 105) % 128;
        try {
            p(str, str2, th, z2, z10, false);
            int i5 = f13212o + 63;
            f13213p = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(String str, String str2) {
        f13215r = (f13216s + 61) % 128;
        if (h0()) {
            f13215r = (f13216s + 17) % 128;
            Log.v(g(str), str2);
        } else if (e().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
            f13216s = (f13215r + 87) % 128;
            Log.v(g(str), str2);
        }
        f13215r = (f13216s + 117) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebChromeClient c0(android.webkit.WebView r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Ab.c0(android.webkit.WebView):android.webkit.WebChromeClient");
    }

    public static C1077na d(Object obj, InterfaceC1064ma interfaceC1064ma, List list, int i5) {
        C1051la c1051la = (C1051la) C0999ha.j().f14264b;
        yb ybVar = new yb();
        ybVar.f14820a = list;
        c1051la.getClass();
        C0921ba c0921ba = new C0921ba();
        C1025ja c1025ja = new C1025ja();
        c1025ja.f14324f = -1;
        c1025ja.f14325g = -1;
        c1025ja.f14326h = -1;
        c1025ja.f14328j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        c1025ja.k = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        c1025ja.f14329l = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        c1025ja.f14330m = true;
        c0921ba.f14043a = c1025ja;
        c1025ja.f14327i = -1;
        c0921ba.f14044b = interfaceC1064ma;
        c0921ba.f14045c = ybVar;
        c1025ja.f14322d = list;
        c1025ja.f14323e = i5;
        c1025ja.f14320b = interfaceC1064ma.getClass();
        c1025ja.f14321c = yb.class;
        C1077na c1077naI = c1051la.i(obj, c0921ba);
        C1051la.f14366c = (C1051la.f14367d + 97) % 128;
        int i10 = f13207i + 21;
        f13208j = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 8 / 0;
        }
        return c1077naI;
    }

    public static ArrayList d0(JSONArray jSONArray, InterfaceC1142sb interfaceC1142sb) {
        f13195C = (f13196D + 117) % 128;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            Object objU = interfaceC1142sb.u(jSONArray, i5);
            if (objU != null) {
                int i10 = f13195C + 85;
                f13196D = i10 % 128;
                if (i10 % 2 == 0) {
                    arrayList.add(objU);
                    throw null;
                }
                arrayList.add(objU);
            }
        }
        return arrayList;
    }

    public static ISAdQualityLogLevel e() {
        int i5 = f13216s + 7;
        f13215r = i5 % 128;
        if (i5 % 2 != 0) {
            Kb.u().E();
            throw null;
        }
        ISAdQualityLogLevel iSAdQualityLogLevelE = Kb.u().E();
        int i10 = f13216s + 55;
        f13215r = i10 % 128;
        if (i10 % 2 == 0) {
            return iSAdQualityLogLevelE;
        }
        throw null;
    }

    public static void e0(String str, String str2, String str3) {
        int i5 = f13216s + 11;
        f13215r = i5 % 128;
        if (i5 % 2 != 0) {
            h0();
            throw null;
        }
        if (h0()) {
            Log.w(g(str), str3);
            int i10 = f13216s + 61;
            f13215r = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (e().shouldPrintLog(ISAdQualityLogLevel.WARNING)) {
            int i11 = f13216s + 47;
            f13215r = i11 % 128;
            if (i11 % 2 == 0) {
                Log.w(g(str2), str3);
            } else {
                Log.w(g(str2), str3);
                throw null;
            }
        }
    }

    public static String f(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 5;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13211n[(-1121337513) + i11] + 5);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1121337515) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 - 1125684661);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13211n;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static void f0(String str, String str2, String str3, Throwable th, C1023j8 c1023j8, JSONObject jSONObject, boolean z2, boolean z10, boolean z11) {
        String str4;
        String str5;
        if (z2) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(f(1125684719 - Color.blue(0), (-4) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) ((-22) - TextUtils.indexOf((CharSequence) "", '0')), (short) ((-81) - View.combineMeasuredStates(0, 0)), 1121337529 - (Process.myTid() >> 22)).intern());
                sb2.append(str);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                str4 = str2;
                sb3.append(str4);
                sb3.append(f(1125684692 - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 34), (short) (117 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (Process.myPid() >> 22) + 1121337529).intern());
                sb3.append(string);
                sb3.append(f(1125684701 - MotionEvent.axisFromString(""), KeyEvent.keyCodeFromString("") - 4, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 72), (short) (90 - Color.argb(0, 0, 0, 0)), 1121337535 - View.getDefaultSize(0, 0)).intern());
                String string2 = sb3.toString();
                f13215r = (f13216s + 45) % 128;
                P(str, str, string2, th, c1023j8, z11);
                f13215r = (f13216s + 113) % 128;
                f13213p = (f13212o + 99) % 128;
                str5 = string;
            } catch (Throwable unused) {
                return;
            }
        } else {
            str4 = str2;
            str5 = str3;
        }
        C0963f0 c0963f0 = (C0963f0) f13210m.get();
        if (c0963f0 != null) {
            f13213p = (f13212o + 53) % 128;
            c0963f0.j(str, str4, str5, U(th, c1023j8), jSONObject, z10);
        }
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G(1047196783 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 719865405, (byte) (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (short) (TextUtils.indexOf("", "", 0, 0) + 87), View.MeasureSpec.makeMeasureSpec(0, 0) - 5).intern());
        sb2.append(str);
        String string = sb2.toString();
        int i5 = f13215r + 105;
        f13216s = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static void g0(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        f13196D = (f13195C + 1) % 128;
        S(jSONObject, jSONObject2, false);
        f13195C = (f13196D + 25) % 128;
    }

    public static String h(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13206h, i5, cArr, 0, i10);
                if (bArr != null) {
                    char[] cArr2 = new char[i10];
                    f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bArr[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        f13222y = i13 + 1;
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
                if (z2) {
                    char[] cArr4 = new char[i10];
                    f13222y = 0;
                    while (true) {
                        int i15 = f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    f13222y = 0;
                    while (true) {
                        int i16 = f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static boolean h0() {
        f13215r = (f13216s + 97) % 128;
        boolean zT = Kb.u().t();
        f13216s = (f13215r + 63) % 128;
        return zT;
    }

    public static ArrayList i(JSONArray jSONArray) {
        f13195C = (f13196D + 117) % 128;
        ArrayList arrayList = null;
        if (jSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                Object objOpt = jSONArray.opt(i5);
                if (objOpt != null) {
                    int i10 = f13195C + 85;
                    f13196D = i10 % 128;
                    if (i10 % 2 == 0) {
                        arrayList2.add(objOpt);
                        throw null;
                    }
                    arrayList2.add(objOpt);
                }
            }
            arrayList = arrayList2;
        }
        f13196D = (f13195C + 123) % 128;
        return arrayList;
    }

    public static C4398a j() {
        C4398a c4398a = new C4398a(28);
        int i5 = f13208j + 77;
        f13207i = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 5 / 0;
        }
        return c4398a;
    }

    public static void k(String str, String str2) {
        f13216s = (f13215r + 115) % 128;
        B(str, str2, null);
        int i5 = f13216s + 93;
        f13215r = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 51 / 0;
        }
    }

    public static void l(String str, String str2, String str3, String str4) {
        String string = "";
        f13213p = (f13212o + 109) % 128;
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(f(1125684719 - KeyEvent.getDeadChar(0, 0), (-4) - Color.argb(0, 0, 0, 0), (byte) ((-21) - (Process.myTid() >> 22)), (short) ((-82) - ((byte) KeyEvent.getModifierMetaStateMask())), 1121337529 - View.resolveSizeAndState(0, 0, 0)).intern());
            sb2.append(str);
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(f(TextUtils.indexOf("", "", 0, 0) + 1125684730, View.getDefaultSize(0, 0) + 6, (byte) (TextUtils.indexOf((CharSequence) "", '0') - 1), (short) ((-38) - ExpandableListView.getPackedPositionChild(0L)), 1121337535 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
            sb3.append(string2);
            sb3.append(f(1125684692 - TextUtils.indexOf((CharSequence) "", '0', 0), '8' - AndroidCharacter.getMirror('0'), (byte) (TextUtils.getTrimmedLength("") + 119), (short) (94 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 1121337545).intern());
            C(str, sb3.toString(), false);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            if (str4 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(f(1125684671 - (ViewConfiguration.getTapTimeout() >> 16), (-4) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((-74) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (short) (View.MeasureSpec.getMode(0) - 67), TextUtils.lastIndexOf("", '0', 0) + 1121337558).intern());
                sb5.append(str4);
                string = sb5.toString();
            }
            sb4.append(string);
            C(str, sb4.toString(), false);
            C0963f0 c0963f0 = (C0963f0) f13210m.get();
            if (c0963f0 != null) {
                f13213p = (f13212o + 29) % 128;
                c0963f0.getClass();
                int i5 = C0963f0.f14147g + 9;
                C0963f0.f14148h = i5 % 128;
                if (i5 % 2 == 0) {
                    c0963f0.j(str, str2, string2, str4, null, false);
                } else {
                    c0963f0.j(str, str2, string2, str4, null, false);
                }
                int i10 = C0963f0.f14147g + 91;
                C0963f0.f14148h = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 82 / 0;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void m(String str, String str2, String str3, Throwable th) {
        int i5 = f13212o + 13;
        f13213p = i5 % 128;
        int i10 = i5 % 2;
        try {
            A(str, str2, str3, th);
            f13213p = (f13212o + 3) % 128;
        } catch (Throwable unused) {
        }
    }

    public static void n(String str, String str2, String str3, boolean z2) {
        f13215r = (f13216s + 5) % 128;
        P(str, str2, str3, null, null, z2);
        f13215r = (f13216s + 25) % 128;
    }

    public static void o(String str, String str2, Throwable th, boolean z2) {
        int i5 = f13215r + 43;
        f13216s = i5 % 128;
        if (i5 % 2 != 0) {
            P(str, str, str2, th, null, z2);
        } else {
            P(str, str, str2, th, null, z2);
            throw null;
        }
    }

    public static void p(String str, String str2, Throwable th, boolean z2, boolean z10, boolean z11) {
        try {
            if (z2) {
                int i5 = f13213p + 41;
                f13212o = i5 % 128;
                if (i5 % 2 != 0) {
                    C(str, str2, z11);
                    throw null;
                }
                C(str, str2, z11);
                if (th != null) {
                    f13213p = (f13212o + 57) % 128;
                    short s10 = (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30);
                    o(str, f(1125684729 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 3, (byte) ((-94) - TextUtils.getOffsetBefore("", 0)), s10, TextUtils.getCapsMode("", 0, 0) + 1121337513).intern(), th, z11);
                    f13212o = (f13213p + 123) % 128;
                }
            } else {
                o(str, str2, th, z11);
            }
            StringBuilder sb2 = new StringBuilder();
            short scrollBarFadeDuration = (short) ((-105) - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            sb2.append(f(1125684744 - TextUtils.indexOf((CharSequence) "", '0'), 5 - TextUtils.indexOf("", "", 0), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 113), scrollBarFadeDuration, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1121337519).intern());
            sb2.append(str);
            f0(str, str2, sb2.toString(), th, null, null, false, z10, z11);
        } catch (Throwable unused) {
        }
    }

    public static void q(List list, int i5, JSONObject jSONObject) throws JSONException {
        f13195C = (f13196D + 75) % 128;
        try {
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames != null) {
                f13195C = (f13196D + 79) % 128;
                for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                    int i11 = f13195C + 31;
                    f13196D = i11 % 128;
                    if (i11 % 2 == 0) {
                        jSONArrayNames.optString(i10);
                        throw null;
                    }
                    String strOptString = jSONArrayNames.optString(i10);
                    if (list == null || !list.contains(strOptString)) {
                        String strH = H(i5, jSONObject.opt(strOptString));
                        if (strH != null) {
                            int i12 = f13195C + 37;
                            f13196D = i12 % 128;
                            if (i12 % 2 == 0) {
                                strH.equals("");
                                throw null;
                            }
                            if (strH.equals("")) {
                                f13195C = (f13196D + 37) % 128;
                                strH = null;
                            }
                            jSONObject.put(strOptString, strH);
                        } else {
                            continue;
                        }
                    }
                }
            }
            int i13 = f13195C + 71;
            f13196D = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } catch (JSONException e7) {
            R(T((char) (TextUtils.lastIndexOf("", '0') + 1), "䀜ᯕహ剈", "鮶댺뚀萸䵎マ魴❍쟿", 958125376 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), T((char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "ᶷ끂썿⿍", "\uf746\uf6bc㗤쵧㫡攒᮲῍\ue668\uf5ee䶣\u074c喧悈誨窼얹ㄎ팥\ud7a6\ueb82", 2142257693 - KeyEvent.getDeadChar(0, 0)).intern(), e7);
        }
    }

    public static void r(JSONArray jSONArray, int i5, int i10) throws JSONException {
        f13195C = (f13196D + 97) % 128;
        String strH = H(i10, jSONArray.opt(i5));
        if (strH != null) {
            jSONArray.put(i5, strH);
            f13196D = (f13195C + 23) % 128;
        }
    }

    public static synchronized C s() {
        C c10;
        try {
            int i5 = f13207i + 49;
            f13208j = i5 % 128;
            if (i5 % 2 == 0) {
                G gS = G.S();
                int i10 = G.f13355F;
                C c11 = gS.f13364n;
                G.f13354E = (i10 + 71) % 128;
                throw null;
            }
            G gS2 = G.S();
            int i11 = G.f13355F;
            c10 = gS2.f13364n;
            G.f13354E = (i11 + 71) % 128;
            int i12 = f13208j + 105;
            f13207i = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
        return c10;
    }

    public static C1077na t(WebView webView, InterfaceC1064ma interfaceC1064ma, zb zbVar) {
        try {
            if (!(zbVar.f14848a || zbVar.f14849b)) {
                f13207i = (f13208j + 55) % 128;
                return null;
            }
            List listB = s().B();
            int iU = s().u();
            f13207i = (f13208j + 45) % 128;
            C1077na c1077naD = d(webView, interfaceC1064ma, listB, iU);
            int i5 = (f13208j + 111) % 128;
            f13207i = i5;
            if (!(!zbVar.f14849b) && c1077naD != null) {
                f13208j = (i5 + 73) % 128;
                Object objS0 = c1077naD.s0();
                if (objS0 != null && !objS0.getClass().equals(c1077naD.t0().getType())) {
                    List listZ = s().z();
                    int iX = s().x();
                    int i10 = f13207i + 17;
                    f13208j = i10 % 128;
                    if (i10 % 2 != 0) {
                        return d(objS0, interfaceC1064ma, listZ, iX);
                    }
                    d(objS0, interfaceC1064ma, listZ, iX);
                    throw null;
                }
            }
            return c1077naD;
        } catch (Throwable th) {
            a0(h("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{94, 12, 0, 0}, true).intern(), h(null, new int[]{174, 26, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, 7}, true).intern(), th, false);
            return null;
        }
    }

    public static JSONObject u(JSONObject jSONObject) {
        int i5 = f13196D + 99;
        f13195C = i5 % 128;
        int i10 = i5 % 2;
        JSONObject jSONObjectX = X(jSONObject, false);
        int i11 = f13195C + 53;
        f13196D = i11 % 128;
        if (i11 % 2 != 0) {
            return jSONObjectX;
        }
        throw null;
    }

    public static void v(Context context) {
        f13208j = (f13207i + 37) % 128;
        if (f13199a) {
            f13199a = false;
            try {
                WebView webView = new WebView(context);
                V9 v92 = new V9(null, new wb(1));
                webView.setWebViewClient(v92);
                Z9 z92 = new Z9(null, new xb());
                webView.setWebChromeClient(z92);
                f13204f = E(webView, v92, j());
                f13205g = E(webView, z92, O());
                return;
            } catch (Throwable th) {
                a0(h("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{94, 12, 0, 0}, true).intern(), h("\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{106, 32, 0, 0}, true).intern(), th, false);
            }
        }
        int i5 = f13208j + 65;
        f13207i = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static void w(Object obj, String str, String str2, String str3) {
        f13215r = (f13216s + 67) % 128;
        z(str, str2, str3, obj, true);
        f13216s = (f13215r + 47) % 128;
    }

    public static void x(String str, String str2) {
        f13215r = (f13216s + 115) % 128;
        R(str, str2, null);
        f13215r = (f13216s + 63) % 128;
    }

    public static void y(String str, String str2, Object obj) {
        int i5 = f13215r + 11;
        f13216s = i5 % 128;
        int i10 = i5 % 2;
        w(obj, str, str, str2);
        if (i10 == 0) {
            throw null;
        }
        int i11 = f13215r + 19;
        f13216s = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 35 / 0;
        }
    }

    public static void z(String str, String str2, String str3, Object obj, boolean z2) {
        if (obj != null) {
            StringBuilder sbJ = N0.a.j(str3);
            sbJ.append(G(TextUtils.getOffsetAfter("", 0) + 1047196720, 719865405 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), (short) ((-57) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) - 26).intern());
            sbJ.append(obj.toString());
            str3 = sbJ.toString();
            f13216s = (f13215r + 41) % 128;
        }
        if (!h0()) {
            if (z2 && e().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                f13216s = (f13215r + 99) % 128;
                Log.d(g(str2), str3);
                return;
            }
            return;
        }
        int i5 = f13216s + 73;
        f13215r = i5 % 128;
        if (i5 % 2 == 0) {
            Log.d(g(str), str3);
        } else {
            Log.d(g(str), str3);
            int i10 = 54 / 0;
        }
    }
}
