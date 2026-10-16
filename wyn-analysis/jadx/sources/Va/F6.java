package Va;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okio.Utf8;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class F6 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f13330R = {'[', 'X', 'h', 'U', 'x', 'g', 127, 'w', 131, 129, 'B', 133, 'y', 'u', 135, '}', 128, '{', 136, 138, 141, 'd', 134, 'i', 130, 'z', ']', 'f', 139, 'j', '`', 'V', 'Y', 132, 'W', 'v', 'a', 140};

    /* renamed from: S, reason: collision with root package name */
    public static final byte[] f13331S = {-116, 65, 71, 47, 73, 49, 77, 94, 57, Utf8.REPLACEMENT_BYTE, -103, -114, -108, 124, -106, 126, -102, -85, -122, -116, -100, 68, -104, -116, -68, 82, -64, 70, -119, -52, 74, -121, -107, -112, -82, -76, -100, -74, -98, -70, -53, -125, -95, -84, -76, -95, -50, -107, -124, -118, 114, -116, 116, -112, -95, 124, -126, 91, 116, -114, 125, 111, -114, 117, -116, -108, -94, 59, 65, 41, 67, 43, 71, 88, 51, 57, 18, 43, 69, 52, 38, 69, 44, 67, 75, 84, -15, 69, 57, 105, -1, 109, -13, 54, 121, -9, 52, 66, -96, 14, 20, -4, 22, -2, 26, 43, 6, 12, -27, -2, 24, 7, -7, 24, -1, 22, 30, -26, 19, 10, 4, -4, 27, -5, 26, -13, 27, 28, -83, -116, -110, 122, -108, 124, -104, -87, -124, -118, 99, 124, -106, -123, 119, -106, 125, -108, -100, 100, -111, -120, -126, 122, -103, 121, -104, 113, -103, -102, -85, 66, -106, -118, -70, 80, -66, 68, -121, -54, 72, -123, -109, -97, 110, 116, 92, 118, 94, 122, -117, 102, 108, 54, 116, 113, 88, 103, 107, 108, -120, 74, 115, 106, 100, 92, 123, 91, 122, 83, 123, 124, -84, 110, 116, 92, 118, 94, 122, -117, 102, 108, 54, 116, 113, 88, 103, 107, 108, -120, 74, 115, 106, 100, 92, 123, 91, 122, 83, 123, 124, -115, 36, 120, 108, -100, 50, -96, 38, 105, -84, 42, 103, 117, -97, 36, 14, 32, 8, 24, 33, 52, 31, 26, -20, 34, 15, 12, 34, 12, 24, 24, 36, 8, 29, 60, -4, 22, 19, 26, 20, 18, 48, -113, 71, 22, 78, 69, Utf8.REPLACEMENT_BYTE, 87, 54, 54, 85, 46, 86, 87, -114, 51, 57, 28, 62, 62, 25, 80, 10, 48, 31, 80, -109, -42, -64, -41, -88, -47, -69, -60, -47, -29, -94, -61, -64, -57, -63, -65, -35, -117, -77, -74, -56, -94, -42, -72, -75, -60};

    /* renamed from: T, reason: collision with root package name */
    public static int f13332T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f13333U = 1;

    public static IGDTAdManager C0() {
        int i5 = f13332T + 113;
        f13333U = i5 % 128;
        if (i5 % 2 == 0) {
            GDTAdSdk.getGDTAdManger();
            throw null;
        }
        IGDTAdManager gDTAdManger = GDTAdSdk.getGDTAdManger();
        f13332T = (f13333U + 63) % 128;
        return gDTAdManger;
    }

    public static Map D0(LiteAbstractAD liteAbstractAD) {
        int i5 = f13333U + 63;
        f13332T = i5 % 128;
        if (i5 % 2 != 0) {
            liteAbstractAD.getExtraInfo();
            throw null;
        }
        Map extraInfo = liteAbstractAD.getExtraInfo();
        int i10 = f13333U + 95;
        f13332T = i10 % 128;
        if (i10 % 2 == 0) {
            return extraInfo;
        }
        throw null;
    }

    public static Map E0(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i5 = f13333U + 93;
        f13332T = i5 % 128;
        if (i5 % 2 == 0) {
            return unifiedInterstitialAD.getExt();
        }
        unifiedInterstitialAD.getExt();
        throw null;
    }

    public static int F0(RewardVideoAD rewardVideoAD) {
        int i5 = f13333U + 105;
        f13332T = i5 % 128;
        if (i5 % 2 == 0) {
            return rewardVideoAD.getRewardAdType();
        }
        rewardVideoAD.getRewardAdType();
        throw null;
    }

    public static String G0(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13330R;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 20);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String H0(APPStatus aPPStatus) {
        int i5 = f13332T + 91;
        f13333U = i5 % 128;
        if (i5 % 2 != 0) {
            return aPPStatus.getAPPID();
        }
        aPPStatus.getAPPID();
        throw null;
    }

    public static String I0(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 126;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13331S[(-1598564796) + i11] + 126);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1598564798) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 508274539);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13331S;
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

    public static Map J0(RewardVideoAD rewardVideoAD) {
        int i5 = f13332T + 95;
        f13333U = i5 % 128;
        if (i5 % 2 != 0) {
            return rewardVideoAD.getExts();
        }
        rewardVideoAD.getExts();
        throw null;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(G0(127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0097\u008d\u0092\u0099\u008e¥\u0085\u0084\u0083\u0082\u0081\u0093\u008d\u0092").intern(), new N3(9));
        map.put(G0(View.combineMeasuredStates(0, 0) + 127, "\u0085\u009b¢¢\u0084\u0093\u008d\u0092").intern(), new A6());
        map.put(G0(127 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0089\u009a\u0099\u009b\u008e\u0097\u0093¦¡\u0093\u008d\u0092").intern(), new D6());
        map.put(G0(TextUtils.indexOf((CharSequence) "", '0') + 128, "\u008d¢\u0095\u0083\u0085\u0084\u0085\u0097\u008e\u009d\u008d\u009c\u0093\u008d\u0092").intern(), new B6());
        map.put(G0(Drawable.resolveOpacity(0, 0) + 127, "\u008f\u0093¦¡\u0085\u008d\u0085\u0097\u008e\u009d\u008d\u009c\u0093\u008d\u0092").intern(), new C6());
        map.put(G0((Process.myPid() >> 22) + 127, "\u0093¦¡\u0091\u008e\u0090\u0093\u0090\u0093\u008f\u0097\u008d\u0093\u0099\u009b\u0093\u008d\u0092").intern(), new E6());
        f13332T = (f13333U + 29) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f13333U = (f13332T + 49) % 128;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        f13333U = (f13332T + 99) % 128;
        return integrationSDKVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0040  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.F6.w0(java.lang.String):java.lang.Class");
    }
}
