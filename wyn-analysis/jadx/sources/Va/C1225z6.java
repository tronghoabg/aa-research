package Va;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.Tapjoy;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: Va.z6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1225z6 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14836R = {'<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'Z', 'q', 'i', 'l', 'q', 'n', 'Y', 'F', 'O', 'R', 171, 176, 143, 147, 172, 170, 175, 174, 182, 149, 131, 145, 136, 155, 176, 179, 174, 171, 179, 156, 148, 173, 176, 177, 177, 176, 184, 'y', 237, 235, 252, 260, 256, 258, 263, 263, 263, 271, 250, 240, 264, 264, '1', 'i', 'n', 'M', 'Q', 'j', 'h', 'm', 'l', 't', 'S', 'M', 'o', 'i', 'e', 'f', 'I', 'R', 'o', 'g', 'n', 'R', '8', 'Z', 'p', 's', 'u', 'l', 'k', 'P', 154, 157, 165, 172, 163, 141, 142, 156, '2', 'g', '_', '\\', 'c', '^', 'P', 'O', 'A', 'S', 't', 'l', 'm', 'h', 'j', 'Q', 'M', 'n', 'i', 'm', ':', 'n', 'k', 'a', '\\', 'R', 'E', 'O', '=', 'v', 't', 133, 141, 137, 139, 144, 144, 144, 152, 135, 129, 149, 154, 147, 144, 144, 146, '&', ']', 'j', 'd', 'f', '_', 'e', 'q', 'i', 'i', 'i', 'd', 'b', 'f', '^', 'M', 'O', 'c', 'k', 'i', 'i', 'l', 's', 'n', '6', '^', 'M', 'O', 'd', 'q', 'i', 'i', 'i', 'd', 'b', 147, 285, 290, 304, 302, 304, 301, 276, 263, 273, 294, 309, 302, 303, 309, '\\', 189, 187, 171, 181, 192, 186};

    /* renamed from: S, reason: collision with root package name */
    public static int f14837S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f14838T = 1;

    public static TJPlacementVideoListener C0(TJPlacement tJPlacement) {
        int i5 = f14837S + 11;
        f14838T = i5 % 128;
        if (i5 % 2 == 0) {
            tJPlacement.getVideoListener();
            throw null;
        }
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        int i10 = f14838T + 43;
        f14837S = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 62 / 0;
        }
        return videoListener;
    }

    public static String D0(TJPlacementData tJPlacementData) {
        f14837S = (f14838T + 5) % 128;
        String httpResponse = tJPlacementData.getHttpResponse();
        f14837S = (f14838T + 37) % 128;
        return httpResponse;
    }

    public static String E0(TJPlacementData tJPlacementData) {
        int i5 = f14837S + 51;
        f14838T = i5 % 128;
        if (i5 % 2 == 0) {
            tJPlacementData.getUrl();
            throw null;
        }
        String url = tJPlacementData.getUrl();
        f14838T = (f14837S + 75) % 128;
        return url;
    }

    public static TJPlacementListener F0(TJPlacement tJPlacement) {
        int i5 = f14837S + 49;
        f14838T = i5 % 128;
        if (i5 % 2 == 0) {
            tJPlacement.getListener();
            throw null;
        }
        TJPlacementListener listener = tJPlacement.getListener();
        int i10 = f14838T + 45;
        f14837S = i10 % 128;
        if (i10 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    public static void G0(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        f14837S = (f14838T + 49) % 128;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        int i5 = f14837S + 9;
        f14838T = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static String H0(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 58784)) ^ ((c11 >>> 5) + 56280)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 62286) ^ ((c12 + i11) ^ ((c12 << 4) + 30447))));
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

    public static String I0(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14836R, i5, cArr, 0, i10);
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

    public static String J0(TJPlacement tJPlacement) {
        int i5 = f14838T + 103;
        f14837S = i5 % 128;
        if (i5 % 2 == 0) {
            return tJPlacement.getName();
        }
        tJPlacement.getName();
        throw null;
    }

    public static String K0(TJPlacementData tJPlacementData) {
        int i5 = f14837S + 33;
        f14838T = i5 % 128;
        int i10 = i5 % 2;
        String placementName = tJPlacementData.getPlacementName();
        if (i10 == 0) {
            int i11 = 48 / 0;
        }
        int i12 = f14837S + 97;
        f14838T = i12 % 128;
        if (i12 % 2 != 0) {
            return placementName;
        }
        throw null;
    }

    public static String L0(TJSplitWebView tJSplitWebView) {
        f14837S = (f14838T + 117) % 128;
        String lastUrl = tJSplitWebView.getLastUrl();
        f14838T = (f14837S + 107) % 128;
        return lastUrl;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(H0((ViewConfiguration.getWindowTouchSlop() >> 8) + 16, "\uf383㔗澍卯똌渠ﯡ᧘ꦚŻ鈛핅\udff2患ꦚŻ").intern(), new C1137s6());
        map.put(H0(Process.getGidForName("") + 7, "\uf383㔗⹏ꗨ渴㢙").intern(), new C1176v6());
        map.put(H0(15 - (Process.myTid() >> 22), "\uf383㔗㡧㮳\u0cfd\u1979ᕅ濑鿦藴\ue408ᢾ᭺㛽煉訨").intern(), new C1189w6());
        map.put(I0("\u0001\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{195, 7, 84, 0}, true).intern(), new C1163u6());
        map.put(H0(TextUtils.indexOf((CharSequence) "", '0', 0) + 12, "\uf383㔗琩鈱茴ᄔ⍔̈́鮩ꚬᜉ誡").intern(), new C1150t6());
        map.put(H0(16 - Color.blue(0), "\uf383㔗雋迾뱈淄硜䭋꤬㴯覥\uab08㔊ደ硸뚽").intern(), new C1201x6());
        map.put(H0(16 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "ᖦ吓雋迾뱈淄硜䭋꤬㴯覥\uab08㔊ደ硸뚽").intern(), new C1213y6());
        map.put(H0(Color.rgb(0, 0, 0) + 16777226, "\uf383㔗琩鈱ី囝⹏ꗨ渴㢙").intern(), new C1124r6());
        int i5 = f14837S + 65;
        f14838T = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // Va.Z0
    public final String t0() {
        String version;
        int i5 = f14837S + 11;
        f14838T = i5 % 128;
        if (i5 % 2 == 0) {
            version = Tapjoy.getVersion();
            int i10 = 31 / 0;
        } else {
            version = Tapjoy.getVersion();
        }
        int i11 = f14838T + 5;
        f14837S = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 31 / 0;
        }
        return version;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030a  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1225z6.w0(java.lang.String):java.lang.Class");
    }
}
