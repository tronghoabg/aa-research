package Va;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.sdk.Ogury;
import java.util.HashMap;

/* renamed from: Va.s5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1136s5 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14566R = {36147, 64371, 25024, 60970, 21652, 56586, 19300, 45506, 15926, 42124, 11549, 39803, 495, 36386, 62636, 32026, 60284, 20932, 56880, 17574, 'O', 30208, 60603, 25415, 55781, 20554, 50692, 15525, 45917, 10733, 41077, 5657, 36029, 847, 31179, 61544, 26140, 56470, 21338, 'O', 30208, 60603, 25415, 55781, 20554, 50692, 15525, 45917, 10733, 41077, 5657, 36029, 847, 31179, 61544, 26140, 56470, 21338, 51689, 16485, 46592, 11438, 41764, 6598, 36970, 1540, 6858, 27781, 63038, 31170, 50016, 19156, 56458, 9763, 43484, 13160, 47847, 3213, 38453, 6655, 25411, 30705, 446, 39685, 5369, 44635, 10223, 45489, 19224, 50407, 24147, 55260, 58009, 38120, 3664, 33174, 15128, 45725, 9445, 56905, 20897, 51969, 17029, 62707, 28247, 57776, 39716, 4770, 34046, 15985, 45501, 11068, 41618, 21756, 52830, 16846, 64304, 56476, 43757, 12373, 49032, 1302, 35995, 6884, 57420, 28595, 62741, 31885, 51907, 20575, 57240, 42276, 11413, 47851, ']', 36799, 5423, 40081};

    /* renamed from: S, reason: collision with root package name */
    public static int f14567S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f14568T = 1;

    public static String C0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14566R[i5 + i11] ^ (i11 * 8238053436795745895L)) ^ c10);
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

    public static void D0(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i5 = f14567S + 69;
        f14568T = i5 % 128;
        int i10 = i5 % 2;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        if (i10 == 0) {
            int i11 = 19 / 0;
        }
    }

    public static String E0(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "ಜ랶檁蛸".toCharArray();
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
                        long j8 = (charArray[i10] ^ c12) ^ (-8721103573037478756L);
                        long j10 = 0;
                        cArr3[i10] = (char) ((j8 ^ j10) ^ j10);
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

    public static void F0(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        f14568T = (f14567S + 61) % 128;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        int i5 = f14567S + 49;
        f14568T = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(C0(92 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getTapTimeout() >> 16) + 25, (char) (58090 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern(), new C1111q5());
        map.put(C0((ViewConfiguration.getScrollBarSize() >> 8) + 117, 21 - (ViewConfiguration.getTapTimeout() >> 16), (char) (56558 - TextUtils.indexOf((CharSequence) "", '0'))).intern(), new C1123r5());
        f14567S = (f14568T + 115) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f14568T = (f14567S + 97) % 128;
        try {
            String sdkVersion = Ogury.getSdkVersion();
            int i5 = f14568T + 5;
            f14567S = i5 % 128;
            if (i5 % 2 == 0) {
                return sdkVersion;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1136s5.w0(java.lang.String):java.lang.Class");
    }
}
