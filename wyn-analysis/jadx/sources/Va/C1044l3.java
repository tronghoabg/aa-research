package Va;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdViewEventListener;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* renamed from: Va.l3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1044l3 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14348R = {'F', 'i', 'v', 'e', 'A', 'd', 'C', 'u', 's', 't', 'o', 'm', 'L', 'a', 'y', 'I', 'n', 'r', 'l', 'V', 'w', 'E', 'c', '.', 'f', '_', 'p', 'R', 'g', 'T', 'P', 'S', 'N', 'G', 'H', 'J'};

    /* renamed from: S, reason: collision with root package name */
    public static int f14349S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f14350T = 1;

    public static String A(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14348R;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 6;
                            int i13 = c10 % 6;
                            int i14 = c11 / 6;
                            int i15 = c11 % 6;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 5) % 6) * 6) + i13];
                                cArr2[i11] = cArr[(((i14 + 5) % 6) * 6) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 6) + ((i13 + 5) % 6)];
                                cArr2[i11] = cArr[(i14 * 6) + ((i15 + 5) % 6)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 6) + i15];
                                cArr2[i11] = cArr[(i14 * 6) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static FiveAd C0() {
        f14349S = (f14350T + 101) % 128;
        FiveAd singleton = FiveAd.getSingleton();
        f14349S = (f14350T + 91) % 128;
        return singleton;
    }

    public static FiveAdListener D0(FiveAdInterface fiveAdInterface) {
        int i5 = f14350T + 49;
        f14349S = i5 % 128;
        if (i5 % 2 != 0) {
            fiveAdInterface.getListener();
            throw null;
        }
        FiveAdListener listener = fiveAdInterface.getListener();
        int i10 = f14349S + 109;
        f14350T = i10 % 128;
        if (i10 % 2 != 0) {
            return listener;
        }
        throw null;
    }

    public static String E0(FiveAdInterface fiveAdInterface) {
        int i5 = f14350T + 39;
        f14349S = i5 % 128;
        if (i5 % 2 == 0) {
            return fiveAdInterface.getSlotId();
        }
        fiveAdInterface.getSlotId();
        throw null;
    }

    public static String F0(FiveAdInterface fiveAdInterface) {
        int i5 = f14350T + 111;
        f14349S = i5 % 128;
        int i10 = i5 % 2;
        String adParameter = fiveAdInterface.getAdParameter();
        if (i10 != 0) {
            int i11 = 17 / 0;
        }
        return adParameter;
    }

    public static String G0(FiveAdInterface fiveAdInterface) {
        int i5 = f14350T + 105;
        f14349S = i5 % 128;
        if (i5 % 2 == 0) {
            return fiveAdInterface.getFiveAdTag();
        }
        fiveAdInterface.getFiveAdTag();
        throw null;
    }

    public static CreativeType H0(FiveAdInterface fiveAdInterface) {
        f14349S = (f14350T + 49) % 128;
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        int i5 = f14350T + 5;
        f14349S = i5 % 128;
        if (i5 % 2 == 0) {
            return creativeType;
        }
        throw null;
    }

    public static void I0(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i5 = f14350T + 25;
        f14349S = i5 % 128;
        int i10 = i5 % 2;
        fiveAdInterface.setListener(fiveAdListener);
        if (i10 != 0) {
            throw null;
        }
        f14349S = (f14350T + 37) % 128;
    }

    public static String J0(FiveAdConfig fiveAdConfig) {
        int i5 = f14350T + 5;
        f14349S = i5 % 128;
        int i10 = i5 % 2;
        String str = fiveAdConfig.appId;
        if (i10 == 0) {
            return str;
        }
        throw null;
    }

    public static void K0(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i5 = f14349S + 5;
        f14350T = i5 % 128;
        int i10 = i5 % 2;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        if (i10 == 0) {
            int i11 = 16 / 0;
        }
    }

    public static String L0(char c10, String str, String str2, int i5) {
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
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 376399573) ^ 0);
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

    public static String M0(FiveAdCustomLayout fiveAdCustomLayout) {
        f14350T = (f14349S + 23) % 128;
        String advertiserName = fiveAdCustomLayout.getAdvertiserName();
        int i5 = f14350T + 27;
        f14349S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 1 / 0;
        }
        return advertiserName;
    }

    public static void N0(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f14350T = (f14349S + 33) % 128;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        f14349S = (f14350T + 17) % 128;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(L0((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "颶䈩艹\ue7c8", "ḃ不\uf71fⰣ蘪歍䝹㩁ችө棍ቷ䪪裫籡ᾈ䔀㧽愀쉴", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern(), new C0966f3());
        map.put(L0((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "튐铏ၽ\udbb0", "⹍䄺\ude51쩽ָ݆씦偯軋\ue952槷㭆⮲\u187c綠䔅䇆⫮븒직⬯呉廖走", View.resolveSizeAndState(0, 0, 0)).intern(), new C0940d3());
        map.put(A((byte) (35 - Color.blue(0)), View.MeasureSpec.getSize(0) + 21, "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0003\u0011\u000f\n\u0005\u000f\u0019\f\u0015\u0004\u0019\u0011\u008a").intern(), new C0953e3());
        map.put(A((byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 76), 30 - View.MeasureSpec.getMode(0), "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0003\u0011\u000f\n\u0005\u000f\u0019\f\u0015\u0004\u000b\f\u0001\u000f\u0007\u0003\u0003\u0004\u001a\u0011\u001b\u0002").intern(), new C1005i3());
        map.put(A((byte) (39 - TextUtils.indexOf("", "", 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0003\u0011\u000f\n\u0005\u000f\u0019\f\u0015\u0004\u0005\u0000\u001f\f\f\u000e\t\u0005\u000f\t\u0099").intern(), new C1018j3());
        map.put(A((byte) (99 - TextUtils.indexOf((CharSequence) "", '0', 0)), 'J' - AndroidCharacter.getMirror('0'), "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0003\u0011\u000f\n\u0005\u000f\u0019\f\u0015\u0004\r\u0000\t\n\u0004\u000f\u0005\u000f").intern(), new C0992h3());
        map.put(L0((char) (TextUtils.indexOf((CharSequence) "", '0') + 41631), "䖼苺鸙暢", "⡦를ߑ憦湭㚵\uec49骭\ue1f9쎹葿空榕\u0cdf墧攸ẩ怕\ue30dɔ幺š\ue6d1⊠䐜꼯", TextUtils.getCapsMode("", 0, 0)).intern(), new C1031k3());
        map.put(A((byte) (69 - Color.green(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0001#\u0004\r\u0018\u0016\t\u000f\u0010\u0016").intern(), new B1(27));
        map.put(A((byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 88), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0000\u000b\b\t\n\u000b\u0006\u0011\u000e\u000f\u000b\b\n\u0003\u0000\u0003\u0005\u000f\u0007\u0003\t\u0002\u000e#\u0011\u0007¼").intern(), new C0914b3());
        map.put(L0((char) (49250 - TextUtils.indexOf("", "", 0, 0)), "螫ꢔ扽닀", "喺ꛏ︶ᒬọ纀걵\ue78d\uec4d憱瀿愶߆荻\ue9b8", TextUtils.lastIndexOf("", '0', 0) + 2108200072).intern(), new C0979g3());
        map.put(A((byte) (45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 19, "\t\u0002\u0007\u0015\u0002\u0004\u0015\u0016\u0003\u0004\u000f\n\r\u0000\t\n\u0004\u000f\u0005\u000f").intern(), new C0927c3());
        f14349S = (f14350T + 69) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f14349S = (f14350T + 105) % 128;
        String sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        f14350T = (f14349S + 29) % 128;
        return sdkSemanticVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0299  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1044l3.w0(java.lang.String):java.lang.Class");
    }
}
