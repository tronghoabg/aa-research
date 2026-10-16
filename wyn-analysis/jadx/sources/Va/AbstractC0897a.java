package Va;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import org.json.JSONObject;

/* renamed from: Va.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0897a implements Lb {

    /* renamed from: c, reason: collision with root package name */
    public static int f13920c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f13921d = 1;

    /* renamed from: f, reason: collision with root package name */
    public static int f13923f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f13924g = 1;

    /* renamed from: i, reason: collision with root package name */
    public static int f13926i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f13927j = 1;
    public static int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f13928l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f13929m = 0;

    /* renamed from: o, reason: collision with root package name */
    public static int f13931o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f13932p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static int f13933q;

    /* renamed from: s, reason: collision with root package name */
    public static int f13935s;

    /* renamed from: t, reason: collision with root package name */
    public static int f13936t;

    /* renamed from: v, reason: collision with root package name */
    public static int f13938v;

    /* renamed from: w, reason: collision with root package name */
    public static int f13939w;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13941a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13919b = {-1114918010, 842280557, 1814131441, -2020790066, -1460963615, -1849956010, 507104337, 328168651, -299376099, 444399546, -2066626417, -1857866589, 1989214282, 1571197419, 470549943, 426554165, -118622915, 766931779};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13922e = {817065767, -2136142836, -266385091, -152372046, -709605310, 1194132331, -1283317232, -1182896738, 1086014787, 950692622, 689422918, -937270331, -987929511, -1190556387, 2015879889, -739374129, -2129436872, 1895251807};

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f13925h = {'L', 169, 184, 187, 192, 175, 172, 182, 178, 183, 141, 281, 281, 242, 237, 276, 240, 234, 275, 276, 268, 275, 277, 259, 266, 281, 284, 289, 263, 253, 269, 274, 281, 274, 275, 282, 281, 242, 244, 281, 279, 279, 237, 236, 271, 277, 260, 258, 279, 282, 277, 279, 287, 260, 256, 271, 275, 284, 264, 262, 273, 267, 269, 276, 260, 260, '9', 'k', 'd', 'b', 'h', ']', '_', 's', 'j', 'f', 'W', '[', 'l', 'f', 'C', 'D', 'n', 'n', 'p', 'K', 'I', 'p', 'q', 'j', 'i', 'p', 'i', 'd', 'T', '^', 'x', 's', 'p', 'a', 'Z', 'l', 'j', 'c', 'k', 'j', 'A', 'G', 'k', 'D', 'I', 'p', 'p', 'r', '['};

    /* renamed from: n, reason: collision with root package name */
    public static final Object f13930n = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f13934r = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final Object f13937u = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final Object f13940x = new Object();

    public /* synthetic */ AbstractC0897a(int i5) {
        this.f13941a = i5;
    }

    public static boolean F(Object obj) {
        int i5 = f13927j + 111;
        f13926i = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (obj != null && Proxy.isProxyClass(obj.getClass()) && (obj instanceof H9)) {
            return true;
        }
        int i10 = f13927j + 93;
        f13926i = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static int G(int i5) {
        int[][] iArr = C0937d0.f14089b.f14090a;
        return ((iArr[0][i5 >>> 24] + iArr[1][(i5 >>> 16) & 255]) ^ iArr[2][(i5 >>> 8) & 255]) + iArr[3][i5 & 255];
    }

    public static String H(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 58010)) ^ ((c11 >>> 5) + 4783)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 10592) ^ ((c12 + i11) ^ ((c12 << 4) + 35945))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String I(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13925h, i5, cArr, 0, i10);
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
                if (z2) {
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
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static void J(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q(TextUtils.getOffsetAfter("", 0) + 4, "\u0b79巧磂腚").intern());
        sb2.append(str);
        String string = sb2.toString();
        Ab.f13215r = (Ab.f13216s + 109) % 128;
        Ab.Z(string, string, str2, false);
        Ab.f13215r = (Ab.f13216s + 57) % 128;
        int i5 = f13931o + 55;
        f13932p = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static String d(int i5, int[] iArr) {
        String str;
        synchronized (f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13919b.clone();
                k = 0;
                while (true) {
                    int i10 = k;
                    if (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        char c10 = (char) (i11 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i11;
                        cArr[1] = c11;
                        int i12 = iArr[i10 + 1];
                        char c12 = (char) (i12 >> 16);
                        cArr[2] = c12;
                        char c13 = (char) i12;
                        cArr[3] = c13;
                        f13928l = (c10 << 16) + c11;
                        f13929m = (c12 << 16) + c13;
                        o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = f13928l ^ iArr2[i13];
                            f13928l = i14;
                            int iG = G(i14) ^ f13929m;
                            int i15 = f13928l;
                            f13928l = iG;
                            f13929m = i15;
                        }
                        int i16 = f13928l;
                        int i17 = f13929m;
                        f13928l = i17;
                        f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        o(iArr2);
                        int i20 = k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        k = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static void e(String str, String str2) {
        f13932p = (f13931o + 59) % 128;
        x(str, str2, null, null);
        f13931o = (f13932p + 59) % 128;
    }

    public static void f(String str, String str2, Throwable th) {
        int i5 = f13932p + 113;
        f13931o = i5 % 128;
        int i10 = i5 % 2;
        x(str, str2, th, null);
        if (i10 != 0) {
            throw null;
        }
    }

    public static void o(int[] iArr) {
        for (int i5 = 0; i5 < iArr.length / 2; i5++) {
            int i10 = iArr[i5];
            iArr[i5] = iArr[(iArr.length - i5) - 1];
            iArr[(iArr.length - i5) - 1] = i10;
        }
    }

    public static boolean p() {
        return !AbstractC0897a.class.getName().equals("com.ironsource.adqualitysdk.sdk.i.Prode");
    }

    public static String q(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 1805)) ^ ((c11 >>> 5) + 51068)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 61710) ^ ((c12 + i11) ^ ((c12 << 4) + 24949))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String t(int i5, int[] iArr) {
        String str;
        synchronized (f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13922e.clone();
                k = 0;
                while (true) {
                    int i10 = k;
                    if (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        char c10 = (char) (i11 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i11;
                        cArr[1] = c11;
                        int i12 = iArr[i10 + 1];
                        char c12 = (char) (i12 >> 16);
                        cArr[2] = c12;
                        char c13 = (char) i12;
                        cArr[3] = c13;
                        f13928l = (c10 << 16) + c11;
                        f13929m = (c12 << 16) + c13;
                        o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = f13928l ^ iArr2[i13];
                            f13928l = i14;
                            int iG = G(i14) ^ f13929m;
                            int i15 = f13928l;
                            f13928l = iG;
                            f13929m = i15;
                        }
                        int i16 = f13928l;
                        int i17 = f13929m;
                        f13928l = i17;
                        f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        o(iArr2);
                        int i20 = k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        k = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String u(Context context) {
        int i5 = f13923f + 117;
        f13924g = i5 % 128;
        try {
            String str = (i5 % 2 == 0 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 0) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0)).versionName;
            int i10 = f13923f + 89;
            f13924g = i10 % 128;
            if (i10 % 2 != 0) {
                return str;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException e7) {
            String strIntern = H(8 - (ViewConfiguration.getWindowTouchSlop() >> 8), "䖳輖쾡鶜㦽麟툭띍").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(t(KeyEvent.getDeadChar(0, 0) + 33, new int[]{-705128250, 411297831, 521637694, 134635620, 540422820, -17819908, -1218430229, 1385216179, -983593031, -873023621, -1581437908, -570450465, -2094481686, 414791373, 293545415, 359009839, 791504049, -2043350236}).intern());
            sb2.append((String) context);
            sb2.append(H(10 - TextUtils.indexOf("", "", 0, 0), "挚埛淝䟑\uf83f붱ꉗ軗ᡄ頹").intern());
            sb2.append(e7.getLocalizedMessage());
            Ab.b(strIntern, sb2.toString());
            return null;
        }
    }

    public static void x(String str, String str2, Throwable th, C1023j8 c1023j8) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q(5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0b79巧鶶㨈").intern());
        sb2.append(str);
        String string = sb2.toString();
        String hexString = Integer.toHexString(str2.hashCode());
        Ab.f13212o = (Ab.f13213p + 21) % 128;
        try {
            Ab.f0(string, str2, hexString, th, c1023j8, null, true, false, false);
            int i5 = Ab.f13213p + 75;
            Ab.f13212o = i5 % 128;
            if (i5 % 2 != 0) {
                int i10 = 5 / 0;
            }
        } catch (Throwable unused) {
        }
        f13931o = (f13932p + 35) % 128;
    }

    public abstract void A(JSONObject jSONObject, WebView webView, InterfaceC0950e0 interfaceC0950e0, Activity activity);

    public abstract void B(JSONObject jSONObject, WebView webView, Activity activity);

    public abstract void C(JSONObject jSONObject, View view, Vb vb2, Activity activity);

    public abstract void D(JSONObject jSONObject, View view, Activity activity);

    public abstract void E(JSONObject jSONObject, WebView webView, Activity activity);

    public abstract void K(JSONObject jSONObject, View view, Activity activity);

    public abstract void L(JSONObject jSONObject, WebView webView, Activity activity);

    public abstract void a(JSONObject jSONObject, View view, Activity activity);

    public abstract void b(JSONObject jSONObject, WebView webView, InterfaceC0950e0 interfaceC0950e0, Activity activity);

    public abstract void c(JSONObject jSONObject, WebView webView, Activity activity);

    public abstract void g(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Activity activity);

    @Override // Va.Lb
    public /* synthetic */ void h(JSONObject jSONObject, View view, Object obj) {
        switch (this.f13941a) {
            case 9:
                c(jSONObject, (WebView) view, (Activity) obj);
                break;
            default:
                D(jSONObject, view, (Activity) obj);
                break;
        }
    }

    public abstract void i(JSONObject jSONObject, View view, Activity activity);

    public abstract void j(JSONObject jSONObject, WebView webView, Vb vb2, Activity activity);

    @Override // Va.Lb
    public /* synthetic */ void k(JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        switch (this.f13941a) {
            case 9:
                B(jSONObject, (WebView) view, (Activity) callback);
                break;
            default:
                a(jSONObject, view, (Activity) callback);
                break;
        }
    }

    public abstract void l(JSONObject jSONObject, WebView webView, Activity activity);

    @Override // Va.Lb
    public /* synthetic */ void m(JSONObject jSONObject, Object obj, Object obj2) {
        switch (this.f13941a) {
            case 9:
                L(jSONObject, (WebView) obj, (Activity) obj2);
                break;
            default:
                i(jSONObject, (View) obj, (Activity) obj2);
                break;
        }
    }

    @Override // Va.Lb
    public /* synthetic */ void n(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Object obj) {
        switch (this.f13941a) {
            case 9:
                A(jSONObject, (WebView) view, interfaceC0950e0, (Activity) obj);
                break;
            default:
                y(jSONObject, view, interfaceC0950e0, (Activity) obj);
                break;
        }
    }

    @Override // Va.Lb
    public /* synthetic */ void r(JSONObject jSONObject, View view, Object obj) {
        switch (this.f13941a) {
            case 9:
                l(jSONObject, (WebView) view, (Activity) obj);
                break;
            default:
                z(jSONObject, view, (Activity) obj);
                break;
        }
    }

    @Override // Va.Lb
    public /* synthetic */ void s(JSONObject jSONObject, Object obj, InterfaceC0950e0 interfaceC0950e0, Object obj2) {
        switch (this.f13941a) {
            case 9:
                b(jSONObject, (WebView) obj, interfaceC0950e0, (Activity) obj2);
                break;
            default:
                g(jSONObject, (View) obj, interfaceC0950e0, (Activity) obj2);
                break;
        }
    }

    @Override // Va.Lb
    public /* synthetic */ void v(JSONObject jSONObject, View view, Object obj) {
        switch (this.f13941a) {
            case 9:
                E(jSONObject, (WebView) view, (Activity) obj);
                break;
            default:
                K(jSONObject, view, (Activity) obj);
                break;
        }
    }

    @Override // Va.Lb
    public /* synthetic */ void w(JSONObject jSONObject, View view, Vb vb2, Object obj) {
        switch (this.f13941a) {
            case 9:
                j(jSONObject, (WebView) view, vb2, (Activity) obj);
                break;
            default:
                C(jSONObject, view, vb2, (Activity) obj);
                break;
        }
    }

    public abstract void y(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Activity activity);

    public abstract void z(JSONObject jSONObject, View view, Activity activity);
}
