package Va;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class K1 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final byte[] f13472R = {-101, -95, -119, -93, -117, -89, -72, 99, -105, -102, -106, -93, -124, -104, -89, -113, -69, 97, 100, 96, 109, 78, 98, 113, 89, -123, -119, -85, -110, -102, -111, -97, -71, 104, -103, -100, -104, -91, -122, -102, -87, -111, -67, 112, -96, -102, -105, -107, -102, -102, -121, -74, 17, 23, -1, 25, 1, 29, 46, -33, 11, 18, 2, 12, 26, -1, 14, 15, 48, 19, 11, 33, -63, 34, 14, 6, 14, 5, 74, -49, 19, -3, 81, -58, 13, 16, 12, 25, -6, 14, 29, 5, 17, 65, -51, 10, 24, 27, 8, 5, 27, 5, 17, 17, 29, 1, 22, 53, -2, 0, -15, 16, -23, 17, 18, -79, -85, -88, -97, -87, -76, -57, -120, -88, -86, -101, -70, -109, -69, -68, 92, 86, 83, 74, 84, 95, 114, 35, 86, 101, 65, 117, -54, -48, -72, -46, -70, -42, -25, -104, -60, -53, -69, -59, -45, -72, -57, -56, -23, -52, -60, -38, 124, -41, -63, -72, 13, -120, -52, -74, 10, 127, -58, -55, -59, -46, -77, -57, -42, -66, -54, -6, -122, -61, -47, 53, 48, 54, 43, 115, -121, -114, 89, 123, -86, 72, -118, 121, 67, 101, 76, 84, 75, 89, 115, 52, 96, 51, 92, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: S, reason: collision with root package name */
    public static int f13473S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f13474T = 1;

    public static Object C0() {
        f13474T = (f13473S + 105) % 128;
        com.chartboost.sdk.a delegate = Chartboost.getDelegate();
        int i5 = f13473S + 93;
        f13474T = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 98 / 0;
        }
        return delegate;
    }

    public static boolean D0() {
        f13474T = (f13473S + 89) % 128;
        boolean zIsWebViewEnabled = Chartboost.isWebViewEnabled();
        int i5 = f13474T + 63;
        f13473S = i5 % 128;
        if (i5 % 2 == 0) {
            return zIsWebViewEnabled;
        }
        throw null;
    }

    public static Object E0() {
        int i5 = f13473S + 121;
        f13474T = i5 % 128;
        if (i5 % 2 == 0) {
            com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.d;
            throw null;
        }
        com.chartboost.sdk.impl.a aVar2 = com.chartboost.sdk.g.d;
        int i10 = f13473S + 7;
        f13474T = i10 % 128;
        if (i10 % 2 != 0) {
            return aVar2;
        }
        throw null;
    }

    public static String F0(CBInPlay cBInPlay) {
        f13474T = (f13473S + 59) % 128;
        String appName = cBInPlay.getAppName();
        f13474T = (f13473S + 23) % 128;
        return appName;
    }

    public static void G0(ChartboostDelegate chartboostDelegate) {
        int i5 = f13474T + 17;
        f13473S = i5 % 128;
        int i10 = i5 % 2;
        Chartboost.setDelegate(chartboostDelegate);
        if (i10 != 0) {
            throw null;
        }
    }

    public static String H0(CBInPlay cBInPlay) {
        f13474T = (f13473S + 95) % 128;
        String location = cBInPlay.getLocation();
        int i5 = f13474T + 55;
        f13473S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 83 / 0;
        }
        return location;
    }

    public static String I0(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 65;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13472R[1568892743 + i11] + 65);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-1568892741)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 1060878042);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13472R;
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

    public static void J0() {
        f13473S = (f13474T + 65) % 128;
        J1 j12 = new J1((ChartboostDelegate) C0());
        int i5 = f13473S + 35;
        f13474T = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        G0(j12);
        f13473S = (f13474T + 13) % 128;
    }

    public static String o(int i5, String str) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-1711821536687410055L));
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

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        String strIntern = o(12457 - TextUtils.indexOf("", "", 0), "㐊ҵ啟ꗖ\uf6bf읰\u17ea悊녔臯튂⍎珰").intern();
        C1208y1 c1208y1 = new C1208y1(1);
        c1208y1.f14801b = this;
        map.put(strIntern, c1208y1);
        map.put(o(8069 - (ViewConfiguration.getFadingEdgeLength() >> 16), "㐞⮙ଇ檵䨅ꦁ褕\ue8ae젳⾻༤溽丱근赚\uecde챌⏋͂拒䉸").intern(), new B1(8));
        map.put(o(Color.green(0) + 12941, "㐞ڑ儗ꎝ︥죙ᭅ嗖ꁳ\uf2e3추᠅檑ꔆ\uf7f7쉥Ო潻릣\uf44a윘ᆄ氂뺵褠\udbc8ᙎ").intern(), new B1(7));
        String strIntern2 = o(MotionEvent.axisFromString("") + 4814, "㐚⛆ᆆ౿缹樝䓣랠ꉒ鴤蠚醙햑쁲㌠⸕ᣚஐ晗儫䰑뻍ꦀ葳\uf735\ue219").intern();
        F1 f1 = new F1();
        f1.f13329a = this;
        map.put(strIntern2, f1);
        map.put(o(25758 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "㐊傃ﴳ᧧ꙭ쌃澱\uf454უ북\uda20曟荹⠮뒮텄緬骑✶䏀\ue870").intern(), new G1());
        map.put(o(52433 - Color.alpha(0), "㐐\uf8db권副ݟ㐺\uf8f6궫劆ݥ㐽\uf8e3귗劈ݲ㐢").intern(), new B1(6));
        map.put(o(21139 - KeyEvent.normalizeMetaState(0), "㐞暏鄫쎌繚ꣅ\udb6a瘈ꂈ팽ඩ").intern(), new I1());
        map.put(I0((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1060877939, (-55) - Color.argb(0, 0, 0, 0), (byte) View.MeasureSpec.getMode(0), (short) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 123), (-1568892554) - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), new H1());
        map.put(I0((-1060877937) - Color.argb(0, 0, 0, 0), (-53) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (short) ((-83) - Process.getGidForName("")), TextUtils.indexOf("", "", 0, 0) - 1568892545).intern(), new B1(9));
        int i5 = f13474T + 73;
        f13473S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 98 / 0;
        }
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        int i5 = f13473S + 11;
        f13474T = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                return Chartboost.getSDKVersion();
            }
            int i10 = 73 / 0;
            return Chartboost.getSDKVersion();
        } catch (Error unused) {
            return I0((-1060877988) - TextUtils.indexOf("", ""), (-60) - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 51), (-1568892558) - Color.alpha(0)).intern();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:65:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.K1.w0(java.lang.String):java.lang.Class");
    }
}
