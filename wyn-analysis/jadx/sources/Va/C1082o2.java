package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* renamed from: Va.o2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1082o2 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final byte[] f14448R = {49, -77, -31, -78, -45, -94, 15, -23, 14, -17, 30, 14, -90, -6, -2, 46, -66, -23, -3, -8, -24, -1, -1, -26, 37, -68, -21, -7, Utf8.REPLACEMENT_BYTE, 19, 58, 15, 15, 16, 56, 17, 94, -15, 93, 2, 50, 7, 14, 15, 68, 87, -65, -111, -41, 100, 113, -41, 113, -35, -35, -39, 109, -30, -63, 26, 100, 22, 94, 14, 23, 10, 117, 48, Utf8.REPLACEMENT_BYTE, 23, 14, 104, 0, 95, 108, 14, 95, -2, 119, -1, 0, -93, -95, -7, -101, -13, -105, -56, -44, -17, -87, -18, -87, -99, -107, -1, -88, -13, -97, -22, -93, -3, -78, -103, 49, -99, -87, -71, -23, -22, -90, -101, -21, -88, -88, -15, -82, -25, -20, -102, 67, Utf8.REPLACEMENT_BYTE, 71, 49, 64, 39, 118, 61, 65, Utf8.REPLACEMENT_BYTE, 80, 31, 89, 72, 78, 62, 79, 85, 21, 37, -59, -62, 1, -42, -1, 18, -80, 40, -58, -58, 126, -110, 84, -86, 95, 84, 66, -124, -78, 84, -84, 78, 78, 73, -25, 74, -23, 58, 7, -10, 88, -16, 74, 74, 84, 78, 88, 80, 96, 89, 100, 55, -126, 35, 54, 84, 76, 114, 114, -124, 121, 106, 90, 127, 118, 50, -121, 81, -125, 96, -80, 49, 100, -126, 90, -128, -128, -127, 99, -7, -29, -8, -39, 40, -69, -27, -30, 51, -23, 0, -70, 13, 14, -33, 15, 9, 9, -38, 3, -61, 20, -27, -45, 9, -49, 7, -41, -50, -29, -16, -75, 19, -47, 6, 122, 116, -75, -107, -124, -105, 127, 122, -89, -100, 127, 112, -79, -104, 103, -62, -117, -123, -99, -125, -101, 127, 108, -72, -105, -115, -106, -115, -127, 121, -89, -116, -101, -121, -110, -117, -95, 90, -61, -127, -112, 30, 32, 110, 43, -111, -126, 19, -125, -115, -115, 30, 119, 55, -120, 25, -55, -80, -33, -49, -74, -69, -9, -50, -40, -54, -43, -91, -8, -23, -57, -49, -75, -75, -56, -22, -23, -45, -75, -40, -43, -55, -118, -65, 124, -37, 120, -74, -67, -109, -74, -116, -33, -35, 15, 7, 56, -26, -39, 45, 30, 43, 3, 8, 59, 38, 3, 18, 81, 42, -5, 74, 30, 19, 45, 5, 38, 49, 19, 38, 3, 62, 6, 5, 57, 48, 20, 31, 47, 22, 22, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: S, reason: collision with root package name */
    public static final char[] f14449S = {'A', 60869, 56067, 51335, 46821, 42069, 37298, 32514, 28026, 60128, 1892, 12710, 8752, 23639, 20203, 31509, 25846, 35186, 49081, 44093, 53824, 49382, 62740, 7102, 2522, 15980, 'A', 60869, 56082, 51343, 46821, 42054, 37283, 32522, 28013, 23239, 18494, 13759, 9205, 4445, 65195, 21762, 47236, 36477, 40397, 58301, 61725, 50425, 10821, 14391, 3979, 7520, 24780, 30342, 17410, 43977, 47437, 36648, 37518, 57468, 63446, 50618, 11020, 26347, 35709, 48524, 44603, 53327, 49912, 63258, 6586, 3047, 15481, 11927, 21303, 17754, 30677, 38931, 'A', 60884, 56102, 51338, 46817, 42059, 37285, 32514, 27974, 23244, 18494, 13724, 9187, 4447, 65189, 60462, 55923, 51141, 46395, 41605, 37117, 32321, 27567, 42104, 18934, 32512, 27836, 4804, 'v', 13745, 56117, 'C', 60872, 56112, 51328, 46833, 42057, 37287, 32533, 27992, 23259, 18469, 13708, 9214, 4424, 65213, 60444, 55878, 51160, 46391, 41604, 26630, 34180, 45931, 41160, 56994, 52269, 63998, 5954, 1315, 12935, 8291, 24000, 19381, 30995, 38601, 33860, 45620, 44954, 56703, 51932, 63660, 'g', 60868, 56118, 51379, 46824, 42052, 37285, 32514, 28005, 23244, 18468, 13727, 9157, 4425, 65160, 60445, 55935, 51164, 46355, 41623, 'g', 60868, 56118, 51362, 46833, 42049, 37295, 32514, 28006, 23242, 18479, 13733, 9193, 4441, 65209, 60416, 55906, 51162, 46355, 41616, 37088, 32348, 27552, 22814, 18284, 13504, 8716, 3986, 65017, 60234, 55434, 50694, 46160, 41380, 36649, 32102, 27357, 12095, 49800, 62586, 59366, 39334, 35613, 48879, 20569, 16951, 30097, 26479, 6867, 3233, 15885, 53699, 49991, 62736, 59540, 39533, 36299, 49085, 20759, 17663, 30281, 'g', 60868, 56118, 51367, 46845, 42059, 37287, 32522, 28001, 23242, 18438, 13700, 9197, 4425, 65195, 60445};

    /* renamed from: T, reason: collision with root package name */
    public static int f14450T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f14451U = 1;

    public static DynamicLoader C0() {
        int i5 = f14450T + 23;
        f14451U = i5 % 128;
        if (i5 % 2 != 0) {
            return DynamicLoaderFactory.getDynamicLoader();
        }
        DynamicLoaderFactory.getDynamicLoader();
        throw null;
    }

    public static String D0() {
        f14450T = (f14451U + 29) % 128;
        String strIntern = H0((-1487592129) - Color.alpha(0), (-87) - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 33), (short) (View.combineMeasuredStates(0, 0) - 8), 1933574201 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        int i5 = f14450T + 103;
        f14451U = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public static String E0() {
        f14450T = (f14451U + 123) % 128;
        String strIntern = H0(Gravity.getAbsoluteGravity(0, 0) - 1487592145, TextUtils.getOffsetAfter("", 0) - 60, (byte) (View.MeasureSpec.getSize(0) + 113), (short) (93 - View.resolveSize(0, 0)), 1933574207 - ImageFormat.getBitsPerPixel(0)).intern();
        int i5 = f14450T + 5;
        f14451U = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public static String F0(AdView adView) {
        int i5 = f14451U + 11;
        f14450T = i5 % 128;
        int i10 = i5 % 2;
        String placementId = adView.getPlacementId();
        if (i10 != 0) {
            int i11 = 20 / 0;
        }
        f14450T = (f14451U + 75) % 128;
        return placementId;
    }

    public static AdPlacementType G0(AdAdapter adAdapter) {
        int i5 = f14450T + 81;
        f14451U = i5 % 128;
        if (i5 % 2 == 0) {
            adAdapter.getPlacementType();
            throw null;
        }
        AdPlacementType placementType = adAdapter.getPlacementType();
        f14450T = (f14451U + 111) % 128;
        return placementType;
    }

    public static String H0(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 94;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14448R[(-1933573865) + i11] + 94);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1933573867) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 1487592247);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14448R;
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

    public static String I0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14449S[i5 + i11] ^ (i11 * (-5398969115034260063L))) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String J0(Ad ad2) {
        f14451U = (f14450T + 13) % 128;
        String placementId = ad2.getPlacementId();
        f14450T = (f14451U + 61) % 128;
        return placementId;
    }

    public static void K0(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        f14450T = (f14451U + 49) % 128;
        interstitialAd.setAdListener(interstitialAdListener);
        int i5 = f14450T + 67;
        f14451U = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void L0(AdView adView, AdListener adListener) {
        int i5 = f14450T + 79;
        f14451U = i5 % 128;
        int i10 = i5 % 2;
        adView.setAdListener(adListener);
        if (i10 == 0) {
            int i11 = 78 / 0;
        }
        f14451U = (f14450T + 101) % 128;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(H0((-1487592144) - Color.argb(0, 0, 0, 0), (-70) - TextUtils.indexOf("", "", 0, 0), (byte) (MotionEvent.axisFromString("") - 110), (short) ((-117) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1933574074 - View.MeasureSpec.getMode(0)).intern(), new C1030k2());
        map.put(I0(151 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.alpha(0) + 20, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), new C1004i2());
        map.put(H0((-1487592131) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-81) - (ViewConfiguration.getEdgeSlop() >> 16), (byte) (106 - TextUtils.lastIndexOf("", '0', 0)), (short) ((-109) - ExpandableListView.getPackedPositionType(0L)), 1933574097 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new C1017j2());
        map.put(I0(170 - KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0') + 38, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), new B1(18));
        map.put(H0((ViewConfiguration.getScrollBarSize() >> 8) - 1487592144, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 53, (byte) (126 - (Process.myPid() >> 22)), (short) ((ViewConfiguration.getTapTimeout() >> 16) - 16), 1933574108 - TextUtils.indexOf((CharSequence) "", '0')).intern(), new B1(17));
        map.put(I0(208 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 24, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12108)).intern(), new C1056m2());
        map.put(I0(230 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new B1(16));
        map.put(H0((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1487592144, ((byte) KeyEvent.getModifierMetaStateMask()) - 77, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 58), (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 83), 1933574149 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), new C1043l2());
        String strIntern = H0((-1487592149) - TextUtils.indexOf((CharSequence) "", '0'), View.resolveSizeAndState(0, 0, 0) - 67, (byte) (118 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 80), 1933574165 - Color.green(0)).intern();
        C1208y1 c1208y1 = new C1208y1(2);
        c1208y1.f14801b = this;
        map.put(strIntern, c1208y1);
        f14451U = (f14450T + 61) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f14451U = (f14450T + 85) % 128;
        try {
            try {
                try {
                    String str = (String) ((C0921ba) C0999ha.j().f14263a).a(AdSdkVersion.class, String.class).get(null);
                    int i5 = f14450T + 17;
                    f14451U = i5 % 128;
                    if (i5 % 2 != 0) {
                        return str;
                    }
                    throw null;
                } catch (Throwable unused) {
                    C1051la c1051la = (C1051la) C0999ha.j().f14264b;
                    String strIntern = H0((-1487592153) - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 83, (byte) (24 - TextUtils.indexOf((CharSequence) "", '0', 0)), (short) (91 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 1933574191 - Gravity.getAbsoluteGravity(0, 0)).intern();
                    c1051la.getClass();
                    return C1051la.n(BuildConfig.class, strIntern);
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (Throwable unused3) {
            return (String) ((C0921ba) C0999ha.j().f14263a).a(AdSdkVersion.class, String.class).get(null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04cd  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1082o2.w0(java.lang.String):java.lang.Class");
    }
}
