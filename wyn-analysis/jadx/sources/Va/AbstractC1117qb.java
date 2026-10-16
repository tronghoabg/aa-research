package Va;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.qb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1117qb {

    /* renamed from: b, reason: collision with root package name */
    public static JSONObject f14542b;

    /* renamed from: d, reason: collision with root package name */
    public static int f14544d;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14543c = {142, '2', 'm', 'o', 'f', 'd', ']', 'd', 'n', 'j', 'o', '[', ':', 'l', 'Y', 'b', 's', 'i', 'i', 'k', 'p', 'K', 'C', 'j', 'k', 'n', 't', 'l', 'f', 'C', 'G', 'k', 'D', 'I', 'p', 'p', 'r', '[', '[', 'k', 'f', 'j', 'g', 'W', 'b', 's', 'i', 'i', 'k', 'p', 'K', 'F', 'n', 'p', 'l', 'C', 'I', 'k', 'f', 'm', '2', 'o', 'q', 'n', 'I', 'G', 'i', 'e', 'k', 'j', 'k', 'I', 'C', 'j', 'k', 'n', 't', 'l', 'l', 'I', 'I', 'p', 'p', 'r', '[', '6', 'm', 'q', 'k', 146, 287, 283, 286, '^', 211, 234, 232, 232, 193, 187, 222, 228, 236, 230, 227, 226, 187, 190, 225, 225, 230, 232, 237, 196, 194, 236, 226, 220, 222, 199, 165, '8', 'q', 'u', 'r', 134, 272, 274, 275, '1', 'i', 'n', 'n', 'i', 'd', 'k', 'n', 'o', 'o', 'n', 'v', '8', 'l', 'k', 'n', 'i', ':', 'k', 'g', 'k', 'l', '6', 'g', 'k', 'r', '8', 'q', 'j', 'g', 'y', 236, 237, 243, 'J', 149, 148, 153, '6', 'g', 'j', 'q', 150, 302, 296, 293, 'w', 245, 245, 236, 253, 241, 258, 254, '8', 'j', 'd', 'f', 'g', 'n', 'p', 147, 304, 311, 307, 141, 279, 284, 284, 279};

    /* renamed from: a, reason: collision with root package name */
    public static JSONObject f14541a = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f14545e = 99 % 128;

    public static synchronized JSONObject a() {
        int i5 = f14544d + 67;
        int i10 = i5 % 128;
        f14545e = i10;
        if (i5 % 2 == 0) {
            throw null;
        }
        JSONObject jSONObject = f14542b;
        int i11 = i10 + 71;
        f14544d = i11 % 128;
        if (i11 % 2 == 0) {
            return jSONObject;
        }
        int i12 = 57 / 0;
        return jSONObject;
    }

    public static synchronized JSONObject b() {
        try {
            int i5 = f14545e + 101;
            f14544d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (f14541a == null) {
                JSONObject jSONObject = new JSONObject();
                f14541a = jSONObject;
                try {
                    jSONObject.put(j(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 165, 1}, true).intern(), -1);
                    f14541a.put(f(1 - TextUtils.getTrimmedLength(""), "獑仝").intern(), -1);
                    f14544d = (f14545e + 67) % 128;
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14541a;
    }

    public static JSONObject c() {
        int i5 = f14544d + 73;
        f14545e = i5 % 128;
        if (i5 % 2 != 0) {
            return Ab.u(a());
        }
        Ab.u(a());
        throw null;
    }

    public static JSONObject d() {
        f14545e = (f14544d + 43) % 128;
        JSONObject jSONObjectU = Ab.u(b());
        int i5 = f14545e + 71;
        f14544d = i5 % 128;
        if (i5 % 2 == 0) {
            return jSONObjectU;
        }
        throw null;
    }

    public static boolean e(int i5, int i10) throws UnsupportedEncodingException {
        JSONObject jSONObjectD;
        String strJ;
        JSONObject jSONObjectD2;
        int iIndexOf;
        int i11 = f14545e;
        int i12 = i11 + 13;
        f14544d = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (i5 >= 0 && i10 >= 0) {
            int i13 = i11 + 75;
            f14544d = i13 % 128;
            if (i13 % 2 != 0) {
                jSONObjectD = d();
                strJ = j(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 165, 1}, false);
            } else {
                jSONObjectD = d();
                strJ = j(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 165, 1}, true);
            }
            int iOptInt = jSONObjectD.optInt(strJ.intern());
            int i14 = f14545e;
            int i15 = i14 + 69;
            f14544d = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 11 / 0;
            }
            if (i5 <= iOptInt) {
                int i17 = i14 + 17;
                f14544d = i17 % 128;
                if (i17 % 2 != 0) {
                    jSONObjectD2 = d();
                    iIndexOf = 1 - TextUtils.indexOf("", "");
                } else {
                    jSONObjectD2 = d();
                    iIndexOf = TextUtils.indexOf("", "") + 1;
                }
                if (i10 <= jSONObjectD2.optInt(f(iIndexOf, "獑仝").intern())) {
                    int i18 = f14544d + 101;
                    f14545e = i18 % 128;
                    return i18 % 2 != 0;
                }
            }
        }
        int i19 = f14545e + 93;
        f14544d = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 8 / 0;
        }
        return false;
    }

    public static String f(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 9950)) ^ ((c11 >>> 5) + 15394)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 19129) ^ ((c12 + i11) ^ ((c12 << 4) + 14904))));
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

    public static synchronized void g(Activity activity) {
        try {
            f14544d = (f14545e + 113) % 128;
            if (activity != null) {
                i(activity.getApplicationContext());
                f14544d = (f14545e + 67) % 128;
            }
            int i5 = f14545e + 67;
            f14544d = i5 % 128;
            if (i5 % 2 != 0) {
                int i10 = 15 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void h(Context context, JSONObject jSONObject, boolean z2) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(j("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE, 12, 0, 0}, false).intern());
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(j("\u0000\u0000\u0001\u0001\u0001", new int[]{141, 5, 0, 0}, false).intern());
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                f14545e = (f14544d + 91) % 128;
                jSONObject.put(f(5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "⯮\uf8a3圕\ue27e").intern(), networkInfo.getState());
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    f14544d = (f14545e + 113) % 128;
                    jSONObject.put(j("\u0000\u0000\u0001\u0000\u0001", new int[]{146, 5, 0, 3}, true).intern(), networkInfo.getType());
                    jSONObject.put(j("\u0001\u0001\u0000\u0000", new int[]{151, 4, 0, 0}, false).intern(), networkInfo.getTypeName());
                    jSONObject.put(f((-16777211) - Color.rgb(0, 0, 0), "⯮\uf8a3븬ޫ\uf3c1柈").intern(), networkInfo.getSubtype());
                    jSONObject.put(j("\u0000\u0001\u0001\u0001", new int[]{155, 4, 0, 0}, true).intern(), networkInfo.getSubtypeName());
                    jSONObject.put(f(3 - ((byte) KeyEvent.getModifierMetaStateMask()), "⯮\uf8a3칝\ue3ee").intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(j("\u0000\u0001\u0001\u0001", new int[]{159, 4, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 0}, false).intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(j("\u0001\u0000\u0001\u0001", new int[]{163, 4, 50, 0}, true).intern(), telephonyManager.getNetworkCountryIso());
                    if (z2) {
                        jSONObject.put(j("\u0001\u0001\u0001\u0000", new int[]{167, 4, 0, 0}, false).intern(), telephonyManager.getSimOperator());
                        jSONObject.put(j("\u0000\u0001\u0001\u0001", new int[]{171, 4, 190, 0}, true).intern(), telephonyManager.getSimOperatorName());
                        f14544d = (f14545e + 67) % 128;
                    }
                }
            }
        } catch (Throwable th) {
            Ab.R(j("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{1, 11, 0, 10}, false).intern(), f(View.combineMeasuredStates(0, 0) + 33, "Ꞧ\uf206\uf111鞎崪嚠\ueb07縻\u001b扦乔兇뮞ぺ쑀㨜Ꝫᓗ\uda6f쌧䳟\u0c5c䦱ꤧ溪喑툴ᙼੌﮑ놼蝱\u0ebfᏇ").intern(), th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r5 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void i(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.AbstractC1117qb.i(android.content.Context):void");
    }

    public static String j(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14543c, i5, cArr, 0, i10);
                if (bArr != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bArr[i13] == 1) {
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

    public static void k(int i5, int i10) {
        if (i5 > 0) {
            int i11 = f14545e;
            int i12 = i11 + 5;
            f14544d = i12 % 128;
            try {
                if (i12 % 2 != 0) {
                    throw null;
                }
                if (i10 > 0) {
                    f14544d = (i11 + 11) % 128;
                    JSONObject jSONObjectB = b();
                    jSONObjectB.put(j(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 165, 1}, true).intern(), i10);
                    jSONObjectB.put(f((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "獑仝").intern(), i5);
                }
            } catch (Throwable th) {
                Ab.R(j("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{1, 11, 0, 10}, false).intern(), j("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{60, 25, 0, 0}, true).intern(), th);
            }
        }
    }
}
