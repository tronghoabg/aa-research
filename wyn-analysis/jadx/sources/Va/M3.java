package Va;

import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* loaded from: classes4.dex */
public final class M3 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f13523R = {'M', 6999, 13829, 20941, 27801, 34922, 41783, 44529, 46818, 39834, 64615, 49412, 9682, 3719, 5033, 29810, 22835, 48585, 34444, 60281, 52333, 53552, 13811, 7846, 25423, 17416, 43211, 14853, 8489, 3117, 27552, 22230, 45576, 39236, 33851, 58284, 52973, 10776, 4371, 31878, 23487, 18175, 41527, 35168, 62608, 54215, 16195, 6678, 357, 27789, 19392, 46867, 37445, 63840, 58558, 50165, 12052, 2654, 29067, 23790, 48122, 42807, 33380, 59777, 54472, 12319, 7980, 51312, 54138, 65081, 39414, 42146, 16471, 27407, 30247, 4588, 15519, 55360, 58155, 36563, 43506, 46245, 20580, 31537, 1754, 8589, 'j', 6982, 13890, 20943, 27833, 34919, 41771, 48724, 55747, 62594, 4215, 11132, 18153, 25040, 31888, 39000, 45839, 52991, 59816, 1324, 8304, 15130, 22217, 29110, 36178, 43047, 49935, 57047, 63884, 5471, 12336, 19403, 26275, 33154, 40261, 47124, 54257, 61114, 2685, 'M', 6999, 13829, 20941, 27801, 34922, 41783, 48691, 55774, 62613, 4200, 11059, 18150, 25053, 31889, 36836, 38142, 47532, 56932, 58160, 1987, 11422, 12703, 22128, 31548, 40897, 42142, 51535, 61042, 62255, 'M', 6999, 13829, 20941, 27801, 34922, 41783, 48694, 55769, 62613, 4200, 11063, 18150, 25051, 31878, 39011, 45838, 52962, 59817, 1392, 8286, 15119, 22215, 29119, 's', 6995, 13848, 20975, 27833, 34919, 41771, 48699, 55764, 62613, 4176, 11067, 18171, 25034, 31889, 38980, 45829, 52964};

    /* renamed from: S, reason: collision with root package name */
    public static int f13524S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f13525T = 1;

    public static String C0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13523R[i5 + i11] ^ (i11 * 2529035958020938550L)) ^ c10);
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

    public static void D0(MaioAdsListenerInterface maioAdsListenerInterface) {
        f13524S = (f13525T + 19) % 128;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        int i5 = f13525T + 105;
        f13524S = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(C0(179 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new L3());
        f13524S = (f13525T + 67) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f13525T = (f13524S + 17) % 128;
        String sdkVersion = MaioAds.getSdkVersion();
        f13525T = (f13524S + 79) % 128;
        return sdkVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.M3.w0(java.lang.String):java.lang.Class");
    }
}
