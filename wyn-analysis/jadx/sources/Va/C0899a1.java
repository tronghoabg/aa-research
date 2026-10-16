package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.Moloco;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: Va.a1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0899a1 extends Z0 {

    /* renamed from: T, reason: collision with root package name */
    public static int f13952T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f13953U = 1;

    /* renamed from: W, reason: collision with root package name */
    public static int f13955W = 1;

    /* renamed from: Z, reason: collision with root package name */
    public static int f13958Z = 0;

    /* renamed from: a0, reason: collision with root package name */
    public static int f13959a0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    public static int f13961c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public static int f13962d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public static int f13963e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public static int f13964f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public static int f13965g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public static int f13966h0 = 1;

    /* renamed from: R, reason: collision with root package name */
    public final /* synthetic */ int f13967R;

    /* renamed from: S, reason: collision with root package name */
    public static final byte[] f13951S = {-28, -30, 17, 26, -24, 18, 0};

    /* renamed from: V, reason: collision with root package name */
    public static final int[] f13954V = {-1222929184, 267990628, 1743918729, 737593395, -1240632785, -1192734261, -582626783, 1088467721, -1753097205, 1890667780, -2089414503, -1576928094, -1141384491, 1194939094, 1936889454, -861711517, 1946119068, -1710287583};

    /* renamed from: X, reason: collision with root package name */
    public static final byte[] f13956X = {-86, 35, -74, -15, -46, -19, -81, -72, 42, -81, 33, -91, -104, -32, -111, -25, -78, -89, -80, -127, -33, 103, -48, 110, -79, -83, -104, -18, -100, -12, -92, -101, -120, -48, -99, -98, -112, -10, -62, -66, 37, 111, 24, 37, 23, 12, -76, 37, 117, 109, 34, 117, 34, -123, 29, -38, 91, 31, 105, -35, -73, 36, 108, 27, 117, 26, 55, 89, 118, 36, -83, -8, -54, 32, -81, -86, 32, -86, 22, 22, 34, -90, 29, -6, -71, 39, 97, 43, 99, 51, 44, 55, 127, 42, 49, Utf8.REPLACEMENT_BYTE, 73, 21, 127, 45, 90, 95, 45, 95, 51, 51, 39, 99, 48, 15, -84, 5, 52, -31, 87, 59, 2, 49, 15, 52, 1, 59, 20, -81, 4, 2, -6, -4, -12, 24, 41, -52, 42, -51, -15, -12, 26, -36, 40, -77, 0, -107, -3, -99, 1, 5, -27, -84, 3, -15, -90, -2, -106, -1, -115, -32, -87, -5, -116, -74, -120, -110, -124, -116, 124, -121, 120, -80, -123, -126, 112, -86, 94, -54, -120, -110, 125, -120, 122, -53, -118, -101};

    /* renamed from: Y, reason: collision with root package name */
    public static final char[] f13957Y = {'M', 'o', 'l', 'c', 'I', 'n', 'i', 't', 'P', 'a', 'r', 'm', 's', 'A', 'd', 'F', 'T', 'y', 'p', 'e', 'B', 'S', 'h', 'w', 'L', 'u', 'R', 'v', '.', 'k', 'x', 'V', 'N', 'O', 'Q', 'U'};

    /* renamed from: b0, reason: collision with root package name */
    public static final char[] f13960b0 = {264, 284, 319, 304, 329, 324, 335, 318, 337, 340, 330, 328, 265, 336, 270, 334, 320, 333, 316, 285, 305, 338, 317};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0899a1(String str, int i5) {
        super(str);
        this.f13967R = i5;
    }

    public static Moloco C0() {
        int i5 = f13959a0 + 19;
        f13958Z = i5 % 128;
        if (i5 % 2 != 0) {
            Moloco moloco = Moloco.INSTANCE;
            throw null;
        }
        Moloco moloco2 = Moloco.INSTANCE;
        f13959a0 = (f13958Z + 45) % 128;
        return moloco2;
    }

    private final String D0() {
        String str;
        f13964f0 = (f13963e0 + 41) % 128;
        int i5 = (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 6;
        int doubleTapTimeout = 155 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3;
        char[] charArray = "\ufffb\b\uffff\ufffe\uffff\u0006￼".toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i10 = Ab.f13219v;
                    if (i10 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i10] + doubleTapTimeout);
                    cArr[i10] = c10;
                    cArr[i10] = (char) (c10 - 'U');
                    Ab.f13219v = i10 + 1;
                }
                if (keyRepeatDelay > 0) {
                    Ab.f13220w = keyRepeatDelay;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i11 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i11, i11);
                    int i12 = Ab.f13220w;
                    System.arraycopy(cArr2, i12, cArr, 0, i5 - i12);
                }
                char[] cArr3 = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i13 = Ab.f13219v;
                    if (i13 >= i5) {
                        break;
                    }
                    cArr3[i13] = cArr[(i5 - i13) - 1];
                    Ab.f13219v = i13 + 1;
                }
                str = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        int i14 = f13963e0 + 65;
        f13964f0 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 41 / 0;
        }
        return strIntern;
    }

    private final String E0() {
        String string;
        f13952T = (f13953U + 81) % 128;
        short s10 = (short) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
        int i5 = (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1));
        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
        int offsetBefore = TextUtils.getOffsetBefore("", 0);
        int i10 = (-781795593) - offsetBefore;
        byte tapTimeout = (byte) (27 - (ViewConfiguration.getTapTimeout() >> 16));
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i11 = iLastIndexOf + 8;
                int i12 = i11 == -1 ? 1 : 0;
                if (i12 != 0) {
                    i11 = (byte) (f13951S[0 - offsetBefore] + 109);
                }
                if (i11 > 0) {
                    AbstractC1104pb.f14486F = ((i10 + i11) - (-781795591)) + i12;
                    AbstractC1104pb.f14487G = tapTimeout;
                    char c10 = (char) (i5 + 69);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i11) {
                        byte[] bArr = f13951S;
                        int i13 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i13 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i13] + s10)) ^ AbstractC1104pb.f14487G));
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
        String strIntern = string.intern();
        int i14 = f13952T + 123;
        f13953U = i14 % 128;
        if (i14 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public static String F0(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13960b0;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 219);
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

    public static String G0(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 97;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13956X[1374052995 + i11] + 97);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-1374052993)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 576455473);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13956X;
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

    public static String H0(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13954V.clone();
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

    public static String V(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13957Y;
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

    @Override // Va.Z0
    public final HashMap A0() {
        switch (this.f13967R) {
            case 0:
                HashMap map = new HashMap();
                f13952T = (f13953U + 121) % 128;
                return map;
            case 1:
                return new HashMap();
            case 2:
                HashMap map2 = new HashMap();
                map2.put(G0((short) (ImageFormat.getBitsPerPixel(0) - 70), (-576455371) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) - 98, (-1374052856) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (((Process.getThreadPriority(0) + 20) >> 6) - 69)).intern(), new N3(0));
                map2.put(G0((short) ((-12) - View.MeasureSpec.getSize(0)), (-576455370) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-98) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-1374052836) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (113 - TextUtils.indexOf("", ""))).intern(), new N3(2));
                map2.put(V((byte) (111 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\r\u0012\b\u0013\u000b\u0003\u0001\u0017\u0007\u0010\u000f\u0014\u0013\u0004\u0012\u001d\f\u0012\r\u0019\u0001\u0017á").intern(), new N3(1));
                f13959a0 = (f13958Z + 5) % 128;
                return map2;
            case 3:
                HashMap map3 = new HashMap();
                int i5 = f13961c0 + 95;
                f13962d0 = i5 % 128;
                if (i5 % 2 != 0) {
                    return map3;
                }
                throw null;
            case 4:
                HashMap map4 = new HashMap();
                f13964f0 = (f13963e0 + 9) % 128;
                return map4;
            default:
                HashMap map5 = new HashMap();
                f13966h0 = (f13965g0 + 111) % 128;
                return map5;
        }
    }

    @Override // Va.Z0
    public boolean q0() {
        switch (this.f13967R) {
            case 0:
                f13952T = (f13953U + 115) % 128;
                return true;
            case 1:
                f13955W = (((f13955W + 67) % 128) + 105) % 128;
                return true;
            case 2:
            case 3:
            default:
                return super.q0();
            case 4:
                int i5 = f13963e0 + 49;
                int i10 = i5 % 128;
                f13964f0 = i10;
                boolean z2 = i5 % 2 != 0;
                int i11 = i10 + 81;
                f13963e0 = i11 % 128;
                if (i11 % 2 == 0) {
                    return z2;
                }
                throw null;
            case 5:
                int i12 = (f13965g0 + 89) % 128;
                f13966h0 = i12;
                int i13 = i12 + 19;
                f13965g0 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 3 / 0;
                }
                return true;
        }
    }

    @Override // Va.Z0
    public boolean r0() {
        switch (this.f13967R) {
            case 0:
                f13953U = (f13952T + 7) % 128;
                return true;
            case 5:
                int i5 = f13965g0 + 95;
                f13966h0 = i5 % 128;
                return !(i5 % 2 == 0);
            default:
                return super.r0();
        }
    }

    @Override // Va.Z0
    public final String t0() {
        String strH0;
        String str;
        switch (this.f13967R) {
            case 0:
                return E0();
            case 1:
                if ((f13955W + 5) % 2 != 0) {
                    strH0 = H0(43 >>> (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1)), new int[]{-446018298, 1772613516, 1209205989, 618116398});
                } else {
                    strH0 = H0((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 6, new int[]{-446018298, 1772613516, 1209205989, 618116398});
                }
                return strH0.intern();
            case 2:
                f13958Z = (f13959a0 + 45) % 128;
                try {
                    C1051la c1051la = (C1051la) C0999ha.j().f14264b;
                    String strIntern = G0((short) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19), Color.rgb(0, 0, 0) - 559678163, (-98) - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1374052995, (byte) (View.resolveSizeAndState(0, 0, 0) - 54)).intern();
                    c1051la.getClass();
                    String strN = C1051la.n(BuildConfig.class, strIntern);
                    int i5 = f13958Z + 47;
                    f13959a0 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return strN;
                    }
                    throw null;
                } catch (Throwable unused) {
                    return null;
                }
            case 3:
                int i10 = f13961c0 + 63;
                f13962d0 = i10 % 128;
                if (i10 % 2 == 0) {
                    UnityAds.getVersion();
                    throw null;
                }
                String version = UnityAds.getVersion();
                if (version == null) {
                    return null;
                }
                String str2 = version.split(F0(127 - View.resolveSize(0, 0), "\u0081").intern())[0];
                f13962d0 = (f13961c0 + 13) % 128;
                return str2;
            case 4:
                return D0();
            default:
                f13966h0 = (f13965g0 + 61) % 128;
                int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26152;
                char[] charArray = "㨝尿\uf64bࡡꊰ쓐廪".toCharArray();
                synchronized (AbstractC0897a.f13937u) {
                    try {
                        AbstractC0897a.f13936t = i11;
                        char[] cArr = new char[charArray.length];
                        AbstractC0897a.f13935s = 0;
                        while (true) {
                            int i12 = AbstractC0897a.f13935s;
                            if (i12 < charArray.length) {
                                cArr[i12] = (char) ((charArray[i12] ^ (AbstractC0897a.f13936t * i12)) ^ 8179498684762241624L);
                                AbstractC0897a.f13935s = i12 + 1;
                            } else {
                                str = new String(cArr);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String strIntern2 = str.intern();
                f13966h0 = (f13965g0 + 93) % 128;
                return strIntern2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x047b  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0899a1.w0(java.lang.String):java.lang.Class");
    }
}
