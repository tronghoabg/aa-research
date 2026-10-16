package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.moloco.sdk.publisher.Moloco;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.UnsupportedEncodingException;

/* renamed from: Va.g9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0985g9 extends AbstractC1127r9 {

    /* renamed from: e, reason: collision with root package name */
    public static int f14198e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f14199f = 1;

    /* renamed from: h, reason: collision with root package name */
    public static int f14201h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f14202i = 1;
    public static int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f14204l = 1;

    /* renamed from: n, reason: collision with root package name */
    public static int f14206n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static int f14207o = 1;

    /* renamed from: q, reason: collision with root package name */
    public static int f14209q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static int f14210r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static int f14211s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static int f14212t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static int f14213u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static int f14214v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static int f14215w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static int f14216x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static int f14217y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static int f14218z = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14219c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14197d = {-178739692, 1224641553, 695382658, 150277714, 1904753255, 1560876294, 526176487, 160632955, -1504954199, 319112613, -944885437, 1154886072, 786109611, -544092803, 1765205102, -847322824, 1017990372, 1385617906};

    /* renamed from: g, reason: collision with root package name */
    public static final char[] f14200g = {41806, 27610, 12912, 64203, 33060, 18855, 4306, 57195, 59294, 44570, 30376, 15831, 50286, 36080, 23379, 25508, 10953, 61764, 47592, 16388, 2209, 55100, 40521, 42748, 27934, 13713, 64566, 35595, 21502, 6769, 8854, 59755, 45156, 30919, 1906, 53131, 38430, 24250, 26056, 11383, 62606, 33552, 19356, 4801, 55644, 57824, 43036, 28841, 16324, 50753, 36580, 'a', 51452, 37185, 22971, 8712, 60057, 46050, 31821, 17572, 3378, 54659};

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f14203j = {'c', 'o', 'm', '.', 'g', 'l', 'e', 'a', 'n', 'd', 'r', 'i', 's', 'M', 'b', 'A', 'V', 'I', 'f', 'h', 'j', 'k', 'p', 'q', 't'};

    /* renamed from: m, reason: collision with root package name */
    public static final char[] f14205m = {'c', 'o', 'm', '.', 'i', 'r', 'n', 's', 'u', 'e', 'a', 'd', 'q', 'l', 't', 'y', 'k', 'I', 'S', 'A', 'Q', 'h', 'f', 'g', 'j'};

    /* renamed from: p, reason: collision with root package name */
    public static final char[] f14208p = {'1', 'i', 'n', 'M', 'Q', 'q', 'k', 'n', 'v', 'V', 'K', 'I', 'P', 'l', 'k', 't', 'o', 'f', 'd', 'l', 'P', 'G', 'b', 'k', 'P', 'G', 'b', 'l', 'q', 'k', 'n', 'Q', '7', 'R', '\\', 'a', 'k', 'n', 'Z', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '2', 'b', 'm', 'v', 'n', 'k', 'q', 't'};

    public /* synthetic */ C0985g9(int i5) {
        this.f14219c = i5;
    }

    public static boolean f() {
        boolean zG = Y.g(new C0985g9(8));
        int i5 = f14210r + 119;
        f14209q = i5 % 128;
        if (i5 % 2 == 0) {
            return zG;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (Va.AbstractC0897a.p() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g() {
        /*
            int r0 = Va.C0985g9.k
            int r0 = r0 + 77
            int r1 = r0 % 128
            Va.C0985g9.f14204l = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            boolean r0 = Va.AbstractC0897a.p()     // Catch: java.lang.Throwable -> L4c
            r3 = 74
            int r3 = r3 / r2
            if (r0 == 0) goto L2c
            goto L1e
        L18:
            boolean r0 = Va.AbstractC0897a.p()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2c
        L1e:
            int r0 = Va.C0985g9.k
            int r0 = r0 + 39
            int r3 = r0 % 128
            Va.C0985g9.f14204l = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L2b
            return r2
        L2b:
            return r1
        L2c:
            r0 = 0
            float r3 = android.graphics.PointF.length(r0, r0)     // Catch: java.lang.Throwable -> L4c
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            int r0 = r0 + 38
            java.lang.String r3 = "\u0001\u0002\u0003\u0004\u0000\u0002\u0002\u0000\u0006\u0007\u0002\b\t\u0005\u000b\u0000\u000e\u0006\u0004\u0000\u0007\u0011\u0002\b\u0007\u000e\u0001\u0012\u0005\u000b\r\f\u0003\u0006\u0012\u0007\u0010\u0003"
            r4 = 0
            int r4 = android.widget.ExpandableListView.getPackedPositionType(r4)     // Catch: java.lang.Throwable -> L4c
            int r4 = 82 - r4
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = l(r4, r0, r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> L4c
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4c
            return r1
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0985g9.g():boolean");
    }

    public static String h(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14205m;
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
                            int i12 = c10 / 5;
                            int i13 = c10 % 5;
                            int i14 = c11 / 5;
                            int i15 = c11 % 5;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 4) % 5) * 5) + i13];
                                cArr2[i11] = cArr[(((i14 + 4) % 5) * 5) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 5) + ((i13 + 4) % 5)];
                                cArr2[i11] = cArr[(i14 * 5) + ((i15 + 4) % 5)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 5) + i15];
                                cArr2[i11] = cArr[(i14 * 5) + i13];
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

    public static String i(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 60031)) ^ ((c11 >>> 5) + 23079)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 64454) ^ ((c12 + i11) ^ ((c12 << 4) + 34041))));
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

    public static String j(int i5, String str) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-1271976467987319840L));
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

    public static String k(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14200g[i5 + i11] ^ (i11 * (-3015286477703362408L))) ^ c10);
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

    public static String l(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14203j;
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
                            int i12 = c10 / 5;
                            int i13 = c10 % 5;
                            int i14 = c11 / 5;
                            int i15 = c11 % 5;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 4) % 5) * 5) + i13];
                                cArr2[i11] = cArr[(((i14 + 4) % 5) * 5) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 5) + ((i13 + 4) % 5)];
                                cArr2[i11] = cArr[(i14 * 5) + ((i15 + 4) % 5)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 5) + i15];
                                cArr2[i11] = cArr[(i14 * 5) + i13];
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

    public static String m(String str, int i5) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 8374112132067932592L);
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

    public static String n(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - '<');
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String o(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14208p, i5, cArr, 0, i10);
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

    public static String p(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14197d.clone();
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        switch (this.f14219c) {
            case 0:
                f14199f = (f14198e + 63) % 128;
                String strIntern = p(16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new int[]{1121518947, -1272594854, 1433638924, 95353652, 148585053, 18240133, -726702962, 2049997775}).intern();
                int i5 = f14199f + 21;
                f14198e = i5 % 128;
                if (i5 % 2 == 0) {
                    return strIntern;
                }
                throw null;
            case 1:
                int i10 = f14201h + 75;
                f14202i = i10 % 128;
                String strIntern2 = (i10 % 2 == 0 ? k(36 / (ViewConfiguration.getDoubleTapTimeout() % 46), 36 << (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() - 10)) : k(51 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, (char) (ViewConfiguration.getWindowTouchSlop() >> 8))).intern();
                f14201h = (f14202i + 43) % 128;
                return strIntern2;
            case 2:
                int i11 = k + 9;
                f14204l = i11 % 128;
                return (i11 % 2 == 0 ? l((byte) (31 - (TypedValue.complexToFloat(1) > 2.0f ? 1 : (TypedValue.complexToFloat(1) == 2.0f ? 0 : -1))), 5 / TextUtils.indexOf((CharSequence) "", 'a', 0), "\b\u0005\u0003\u0002µ") : l((byte) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 83), 4 - TextUtils.indexOf((CharSequence) "", '0', 0), "\b\u0005\u0003\u0002µ")).intern();
            case 3:
                f14206n = (f14207o + 51) % 128;
                String strIntern3 = h((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 104), KeyEvent.getDeadChar(0, 0) + 14, "\u000b\f\u0011\f\u0014\u000b\u0006\u0005\r\u0006\u0013\t\f\b").intern();
                f14206n = (f14207o + 33) % 128;
                return strIntern3;
            case 4:
                int i12 = f14210r + 85;
                f14209q = i12 % 128;
                int[] iArr = {46, 8, 0, 7};
                return (i12 % 2 != 0 ? o("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", iArr, true) : o("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", iArr, true)).intern();
            case 5:
                f14211s = (f14212t + 53) % 128;
                String strIntern4 = m("맑ቝ\ueefa묋ឫ\ue3d7뱷\u0895", Color.red(0) + 43933).intern();
                f14211s = (f14212t + 113) % 128;
                return strIntern4;
            case 6:
                int i13 = f14214v + 119;
                f14213u = i13 % 128;
                return i(i13 % 2 != 0 ? 86 % TextUtils.getOffsetBefore("", 0) : TextUtils.getOffsetBefore("", 0) + 15, "䦤쨌⧡襍饂칉\ue7dc\udbf1汫莝懮⭷뇖ﾽ৷\uee2c").intern();
            case 7:
                int i14 = f14216x + 17;
                f14215w = i14 % 128;
                return (i14 % 2 != 0 ? n("\ufff7\u0003\u0000\u0003\u0001\u0003", ViewConfiguration.getMinimumFlingVelocity() - 65, MotionEvent.axisFromString("") * 6190, 4 % ExpandableListView.getPackedPositionType(1L), false) : n("\ufff7\u0003\u0000\u0003\u0001\u0003", 6 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), MotionEvent.axisFromString("") + 169, ExpandableListView.getPackedPositionType(0L) + 5, true)).intern();
            default:
                f14218z = (f14217y + 107) % 128;
                String strIntern5 = j((ViewConfiguration.getDoubleTapTimeout() >> 16) + 58657, "뎕嚯秋᳷✝쨤\ued42\uf074").intern();
                int i15 = f14218z + 81;
                f14217y = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 7 / 0;
                }
                return strIntern5;
        }
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        switch (this.f14219c) {
            case 0:
                C0899a1 c0899a1 = new C0899a1(a(), 1);
                f14199f = (f14198e + 73) % 128;
                return c0899a1;
            case 1:
                C0899a1 c0899a12 = new C0899a1(a(), 0);
                int i5 = f14202i + 79;
                f14201h = i5 % 128;
                if (i5 % 2 == 0) {
                    return c0899a12;
                }
                throw null;
            case 2:
                int i10 = k + 51;
                f14204l = i10 % 128;
                if (i10 % 2 == 0) {
                    g();
                    throw null;
                }
                if (g()) {
                    V0 v0 = new V0(a());
                    f14204l = (k + 29) % 128;
                    return v0;
                }
                W0 w02 = new W0(a());
                k = (f14204l + 107) % 128;
                return w02;
            case 3:
                C0899a1 c0899a13 = new C0899a1(a(), 4);
                int i11 = f14206n + 111;
                f14207o = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 24 / 0;
                }
                return c0899a13;
            case 4:
                C0899a1 c0899a14 = new C0899a1(a(), 3);
                f14210r = (f14209q + 121) % 128;
                return c0899a14;
            case 5:
                E1 e12 = new E1(a());
                int i13 = f14212t + 63;
                f14211s = i13 % 128;
                if (i13 % 2 == 0) {
                    return e12;
                }
                throw null;
            case 6:
                C0899a1 c0899a15 = new C0899a1(a(), 5);
                f14214v = (f14213u + 61) % 128;
                return c0899a15;
            case 7:
                C0899a1 c0899a16 = new C0899a1(a(), 2);
                int i14 = f14215w + 107;
                f14216x = i14 % 128;
                if (i14 % 2 != 0) {
                    return c0899a16;
                }
                throw null;
            default:
                P6 p62 = new P6(a());
                f14217y = (f14218z + 73) % 128;
                return p62;
        }
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        char doubleTapTimeout;
        int scrollDefaultDelay;
        int bitsPerPixel;
        int i5;
        byte size;
        int minimumFlingVelocity;
        int size2;
        switch (this.f14219c) {
            case 0:
                int i10 = f14198e + 67;
                f14199f = i10 % 128;
                String strIntern = (i10 % 2 == 0 ? p(77 % (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1)), new int[]{1514605843, 1987786353, -1791855257, 2114537255, -74143364, 38012059, 1389636476, -1953947555, 631020739, -167235100, 214846977, -1327948683, -687676631, 1738255441, -687676631, 1738255441, 955238923, -1005533004, -874501581, -58948541, -713193944, -455037016, -1561816356, 6401604, -1123124134, -464463640}) : p((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 50, new int[]{1514605843, 1987786353, -1791855257, 2114537255, -74143364, 38012059, 1389636476, -1953947555, 631020739, -167235100, 214846977, -1327948683, -687676631, 1738255441, -687676631, 1738255441, 955238923, -1005533004, -874501581, -58948541, -713193944, -455037016, -1561816356, 6401604, -1123124134, -464463640})).intern();
                int i11 = f14199f + 1;
                f14198e = i11 % 128;
                if (i11 % 2 == 0) {
                    return strIntern;
                }
                throw null;
            case 1:
                int i12 = f14202i + 39;
                f14201h = i12 % 128;
                if (i12 % 2 != 0) {
                    doubleTapTimeout = (char) (41773 - (ViewConfiguration.getDoubleTapTimeout() >>> 19));
                    scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() << 118;
                    bitsPerPixel = 17 % ImageFormat.getBitsPerPixel(0);
                } else {
                    doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 41773);
                    scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                    bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 52;
                }
                String strIntern2 = k(scrollDefaultDelay, bitsPerPixel, doubleTapTimeout).intern();
                f14202i = (f14201h + 35) % 128;
                return strIntern2;
            case 2:
                int i13 = k + 7;
                f14204l = i13 % 128;
                if (i13 % 2 == 0) {
                    i5 = 8 >>> (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    size = (byte) (11 % View.MeasureSpec.getSize(1));
                } else {
                    i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35;
                    size = (byte) (View.MeasureSpec.getSize(0) + 74);
                }
                return l(size, i5, "\u0001\u0002\u0003\u0004\u0000\u0002\u0002\u0000\u0006\u0007\u0002\b\t\u0005\u000b\u0000\u000e\u0006\u0004\u0000\u0007\u0011\u0002\b\u0007\u000e\b\u0012\u0004\u000b\n\u0006\u0005\u0010\u0007\u000e").intern();
            case 3:
                int i14 = f14207o + 65;
                f14206n = i14 % 128;
                if (i14 % 2 != 0) {
                    minimumFlingVelocity = 73 >>> (ViewConfiguration.getMinimumFlingVelocity() - 42);
                    size2 = 28 << View.MeasureSpec.getSize(0);
                } else {
                    minimumFlingVelocity = 51 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    size2 = 7 - View.MeasureSpec.getSize(0);
                }
                return h((byte) size2, minimumFlingVelocity, "\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0006\u0002\t\u0006\u0004\u0005\u0000\r\f\r\u0005\r\u000e\u0003\n\u0013\u0006\f\u0012\u0001\u0006\f\u0012\u0001\u000f\u0007\u0006\u000b\u0010\u0003\t\u0006\u0004\u0005\u0010\u000e\u0017\u0005\u000b\u000e\t\u0013\u0080").intern();
            case 4:
                int i15 = f14209q + 71;
                f14210r = i15 % 128;
                if (i15 % 2 == 0) {
                    f();
                    throw null;
                }
                if (!f()) {
                    return o("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 46, 0, 0}, false).intern();
                }
                int i16 = (f14209q + 123) % 128;
                f14210r = i16;
                f14209q = (i16 + 41) % 128;
                return null;
            case 5:
                f14211s = (f14212t + 35) % 128;
                String strIntern3 = m("맓ꏎ跿\uf7ad톕㮕▦ྫ楗卟뵳ꝥ腒\ueb1e픺㼤ᢎː泲嚃남骺蒰\uee5e졆㉊ᱮؐ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 6673).intern();
                int i17 = f14212t + 91;
                f14211s = i17 % 128;
                if (i17 % 2 == 0) {
                    return strIntern3;
                }
                throw null;
            case 6:
                int i18 = f14214v + 37;
                f14213u = i18 % 128;
                String strIntern4 = i(i18 % 2 != 0 ? MotionEvent.axisFromString("") + 78 : MotionEvent.axisFromString("") + 52, "幡\u1c4a\ud936\uf688㞮縗⓸櫓\ud883黽Ịに\uea98堨㹎缜꽺걁㍠桠틪ࠠ㋑ፔꭩ⏇섑嗙ꭩ⏇섑嗙皆␑⓸櫓\ue396ΊỊに\uea98堨\udf18뜙鴭頾饂칉\ue7dc\udbf1䗽잰").intern();
                f14213u = (f14214v + 15) % 128;
                return strIntern4;
            case 7:
                f14216x = (f14215w + 47) % 128;
                String strIntern5 = n("\u0002\u0011ￌ\r\u0001\r\n\r\u000bￌ\u000b\r\u0001\r\u0001\r\n\r￫ￌ\u0010\u0003\u0006\u0011\u0007\n\u0000\u0013\u000eￌ\t", KeyEvent.normalizeMetaState(0) + 31, (Process.myPid() >> 22) + 158, (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, true).intern();
                int i19 = f14216x + 91;
                f14215w = i19 % 128;
                if (i19 % 2 == 0) {
                    return strIntern5;
                }
                throw null;
            default:
                int i20 = f14218z + 31;
                f14217y = i20 % 128;
                return j(i20 % 2 != 0 ? 16180 / View.resolveSize(1, 1) : 8179 - View.resolveSize(0, 0), "뎃걼豫\uec17챙ⰱ\u0c3b氱䰁걘賺\uecbf쳷Ⳓ\u0cd8沫䲹겠貓\uec9a촲ⵚ൬浜䵜괢贝\ued24촆ⴑෳ淮䷥귀").intern();
        }
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        switch (this.f14219c) {
            case 0:
                int i5 = f14198e;
                int i10 = i5 + 33;
                f14199f = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                int i11 = i5 + 99;
                f14199f = i11 % 128;
                if (i11 % 2 != 0) {
                    return IronSourceAdQuality.class;
                }
                throw null;
            case 1:
                int i12 = f14202i + 89;
                f14201h = i12 % 128;
                if (i12 % 2 == 0) {
                    return IronSourceAdQuality.class;
                }
                throw null;
            case 2:
                int i13 = k + 15;
                int i14 = i13 % 128;
                f14204l = i14;
                if (i13 % 2 == 0) {
                    throw null;
                }
                k = (i14 + 59) % 128;
                return MobileAds.class;
            case 3:
                int i15 = (f14206n + 59) % 128;
                f14207o = i15;
                int i16 = i15 + 3;
                f14206n = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 84 / 0;
                }
                return IronSourceAdQuality.class;
            case 4:
                int i18 = f14210r + 9;
                f14209q = i18 % 128;
                if (i18 % 2 != 0) {
                    f();
                    throw null;
                }
                if (f()) {
                    return null;
                }
                f14209q = (f14210r + 41) % 128;
                return AdUnitActivity.class;
            case 5:
                int i19 = f14211s + 5;
                f14212t = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 85 / 0;
                }
                return AppLovinSdk.class;
            case 6:
                int i21 = (f14213u + 5) % 128;
                f14214v = i21;
                int i22 = i21 + 21;
                f14213u = i22 % 128;
                if (i22 % 2 == 0) {
                    return IronSourceAdQuality.class;
                }
                throw null;
            case 7:
                int i23 = f14216x + 31;
                f14215w = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = 33 / 0;
                }
                return Moloco.class;
            default:
                int i25 = f14217y + 59;
                f14218z = i25 % 128;
                if (i25 % 2 != 0) {
                    return UnityServices.class;
                }
                throw null;
        }
    }
}
