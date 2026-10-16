package Va;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: Va.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0924c0 {

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f14052i = {'E', 'N', 'A', 'B', 'L', 'D', 'I', 'S', '/', 'W', 'e', 'b', 'V', 'i', 'w', ' ', '-', 'K', 'v', 'r', 's', 'o', 'n', ':', 'F', 'a', 'l', 'd', 't', 'c', 'G', 'H', 'J', 'M', 'O', 'P'};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f14053j = {1694579170, 466726624, 1209865885, 2014549593, 661124310, -909625227, -1740918106, -102678596, -81996465, -639074382, -685860641, -702137486, -1585789510, 113427635, -844101894, 975195765, 515822038, 1413667826};
    public static int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f14054l = 1;

    /* renamed from: a, reason: collision with root package name */
    public String f14055a;

    /* renamed from: b, reason: collision with root package name */
    public String f14056b;

    /* renamed from: c, reason: collision with root package name */
    public String f14057c;

    /* renamed from: d, reason: collision with root package name */
    public String f14058d;

    /* renamed from: e, reason: collision with root package name */
    public String f14059e;

    /* renamed from: f, reason: collision with root package name */
    public String f14060f;

    /* renamed from: g, reason: collision with root package name */
    public EnumC0898a0 f14061g;

    /* renamed from: h, reason: collision with root package name */
    public EnumC0911b0 f14062h;

    public static String a(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14053j.clone();
                AbstractC0897a.k = 0;
                while (true) {
                    int i10 = AbstractC0897a.k;
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
                        AbstractC0897a.f13928l = (c10 << 16) + c11;
                        AbstractC0897a.f13929m = (c12 << 16) + c13;
                        AbstractC0897a.o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = AbstractC0897a.f13928l ^ iArr2[i13];
                            AbstractC0897a.f13928l = i14;
                            int iG = AbstractC0897a.G(i14) ^ AbstractC0897a.f13929m;
                            int i15 = AbstractC0897a.f13928l;
                            AbstractC0897a.f13928l = iG;
                            AbstractC0897a.f13929m = i15;
                        }
                        int i16 = AbstractC0897a.f13928l;
                        int i17 = AbstractC0897a.f13929m;
                        AbstractC0897a.f13928l = i17;
                        AbstractC0897a.f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        AbstractC0897a.f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        AbstractC0897a.f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        AbstractC0897a.o(iArr2);
                        int i20 = AbstractC0897a.k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        AbstractC0897a.k = i20 + 2;
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

    public static String b(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14052i;
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

    public final String c(EnumC0911b0 enumC0911b0) {
        if (enumC0911b0 != null) {
            int i5 = k + 119;
            f14054l = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = Z.f13884b[enumC0911b0.ordinal()];
                throw null;
            }
            int i11 = Z.f13884b[enumC0911b0.ordinal()];
            if (i11 == 1) {
                return a(22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new int[]{1920330904, -810162721, -322958251, -1164817216, 1623780481, -1344288151, 1406513750, -1080652919, 1902517434, -871291513, 1611859305, -1151203275}).intern();
            }
            if (i11 == 2) {
                return String.format(a(62 - TextUtils.indexOf("", "", 0, 0), new int[]{-1581910059, -2051099077, 904656269, 691342388, 1753212518, -682257973, 9871459, 798540326, 801200485, -1195187505, -1569773862, 915300984, 245961683, 584920110, -519392186, 427122627, -1189741076, 838219772, -1355700641, -1711980924, 1490087708, 979723242, 1753212518, -682257973, 9871459, 798540326, -896250988, -2076763069, 670901477, 567131762, -1198448804, -67657726}).intern(), this.f14055a, this.f14057c, this.f14060f);
            }
            if (i11 == 3) {
                return String.format(a(55 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), new int[]{681646080, 14808136, 1490087708, 979723242, 1753212518, -682257973, 9871459, 798540326, -678614871, -764342181, 103957503, -2077413177, 638527252, 1091456289, 266630127, 1045115234, -1286367475, -1028487940, -1837482641, -945234165, -2037030787, 1958074208, 1059709463, -266389808, -759158108, -1246854210, 99309397, 816847260}).intern(), this.f14055a, this.f14057c);
            }
            if (i11 == 4) {
                return a((ViewConfiguration.getJumpTapTimeout() >> 16) + 30, new int[]{325596508, 1403841246, -1505446374, -691723468, 2031372390, -996280460, -1460022541, -863867324, 1135938243, -249499165, 989749680, 862900096, 253294959, -736563596, 874094955, 1394844081}).intern();
            }
            if (i11 == 5) {
                String strIntern = b((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 91), 26 - View.resolveSizeAndState(0, 0, 0), "\u0019\u001a\u000e\u0019\t\u001c\u0010\u001b\u001b\u0015\u0019\u0017\u0007\u001c\"\u0010\u0011\u001b\u0016\u0017\u001c\u0010\u0018\u001d\u0016\u0014").intern();
                int i12 = f14054l + 97;
                k = i12 % 128;
                if (i12 % 2 == 0) {
                    return strIntern;
                }
                throw null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(Va.EnumC0898a0 r21) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0924c0.d(Va.a0):void");
    }
}
