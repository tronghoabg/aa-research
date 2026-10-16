package Va;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: Va.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1218z {

    /* renamed from: d, reason: collision with root package name */
    public static int f14822d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14823e = 1;

    /* renamed from: g, reason: collision with root package name */
    public static int f14825g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f14826h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static Xa f14827i = null;

    /* renamed from: j, reason: collision with root package name */
    public static int f14828j = 0;
    public static int k = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f14829a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14830b;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14821c = {-476758169, -1693109424, 528455195, 599217691, -1775891542, 341386915, -150819157, -473117234, -2070869909, -135602810, 611117096, 1623706857, -322491909, 74854571, -1965878988, 1744346535, -1959626240, 821498109};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f14824f = {152805258, 1083603431, -1688174579, -1810382133, 173385578, 1701427532, 332872348, -1658482986, 338892128, -711813355, -1819274943, -938195943, -1941513997, -902256295, -327963027, -1564881536, -1755269125, 1010982692};

    public C1218z(Context context) {
        this.f14829a = false;
        Context applicationContext = context.getApplicationContext();
        Ea ea2 = new Ea();
        ea2.f13322b = false;
        ea2.f13323c = new HashSet();
        Context applicationContext2 = applicationContext.getApplicationContext();
        ea2.f13321a = applicationContext2;
        Ab.b(Ea.f13317d, Ea.c("\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{0, 30, 0, 0}, true).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Ea.c("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{30, 36, 26, 21}, false).intern());
        applicationContext2.registerReceiver(ea2, intentFilter);
        this.f14830b = ea2;
    }

    public static String d(int i5, String str) {
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 9129661839050511924L);
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

    public static /* synthetic */ Ea e(C1218z c1218z) {
        int i5 = f14825g;
        f14826h = (i5 + 37) % 128;
        Ea ea2 = (Ea) c1218z.f14830b;
        int i10 = i5 + 107;
        f14826h = i10 % 128;
        if (i10 % 2 != 0) {
            return ea2;
        }
        throw null;
    }

    public static String f(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14821c.clone();
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

    public static String g(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            return f(6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new int[]{-960684408, -386532194, 602403550, 1340359428}).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            f14822d = (f14823e + 125) % 128;
            return f(7 - (ViewConfiguration.getWindowTouchSlop() >> 8), new int[]{-741903794, 1571967932, 1341513580, -18738732}).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return l("\u0002\n\ufffe\u0001\ufffa�", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, 256 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 6 - Color.argb(0, 0, 0, 0), true).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY) {
            return l("\b\u0003\ufff8\u0005\u0006\u0002\u0001￼\ufff6\u0006", 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 259, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10, false).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
            String strIntern = l("￼\t\u0002\uffff\u0003\u0003\ufff4\u0001", (ViewConfiguration.getPressedStateDuration() >> 16) + 8, (Process.myPid() >> 22) + 258, 8 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true).intern();
            f14823e = (f14822d + 91) % 128;
            return strIntern;
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY) {
            int i5 = f14823e + 121;
            f14822d = i5 % 128;
            return i5 % 2 != 0 ? l("\u0000\ufffb\u0006\u000b\ufff3\ufff6\u0005\u0007", 48 >> (ViewConfiguration.getMaximumFlingVelocity() >>> 29), ViewConfiguration.getMaximumDrawingCacheSize() + 5929, 93 - (ViewConfiguration.getKeyRepeatTimeout() >>> 72), true).intern() : l("\u0000\ufffb\u0006\u000b\ufff3\ufff6\u0005\u0007", 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 259 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 7 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), false).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED) {
            return l("�\f\ufff9\u0001￼�\u0005\ufffe\u0004�\u000b￼", 12 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 253, 11 - ((Process.getThreadPriority(0) + 20) >> 6), true).intern();
        }
        if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.OTHER) {
            return "";
        }
        String strIntern2 = f(5 - Color.argb(0, 0, 0, 0), new int[]{-1515472970, -1806589893, -962241985, -1827851283}).intern();
        f14823e = (f14822d + 5) % 128;
        return strIntern2;
    }

    public static String j(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14824f.clone();
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

    public static String k() {
        k = (f14828j + 117) % 128;
        E eJ = G.S().J();
        eJ.getClass();
        int i5 = E.f13294i + 43;
        E.f13295j = i5 % 128;
        int i10 = i5 % 2;
        String strOptString = eJ.e().optString(E.t(i10 == 0 ? TextUtils.indexOf("", "", 1, 1) * 10 : TextUtils.indexOf("", "", 0, 0) + 127, "\u0083\u008a\u0089").intern(), eJ.f13296g);
        f14828j = (k + 69) % 128;
        return strOptString;
    }

    public static String l(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - 149);
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

    public Ea a() {
        int i5 = f14825g + 39;
        f14826h = i5 % 128;
        int i10 = i5 % 2;
        Ea ea2 = (Ea) this.f14830b;
        if (i10 == 0) {
            int i11 = 31 / 0;
        }
        return ea2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        Va.Ab.x(j(14 - (android.os.Process.myPid() >> 22), new int[]{-1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 2124998195, 884916705}).intern(), j(63 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), new int[]{-218561969, -1726415466, -2115630913, -1948082808, 2132187580, 1956854740, -519368911, 998001218, 804929055, -1926007260, -1222030987, -321602038, -843488621, 925521992, -412300803, 623630580, -407461321, 467213452, -1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 1300267611, -1115487813, -150568476, -760631457, 633722901, -1056687297, -1257262344, 1565034230}).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3.f14829a != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r3.f14829a != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        Va.AbstractC1104pb.I(new Va.Da(r3, r4, r5, 19));
        r4 = Va.C1218z.f14825g + 47;
        Va.C1218z.f14826h = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(Va.Ia r4, Va.C0999ha r5) {
        /*
            r3 = this;
            int r0 = Va.C1218z.f14825g
            int r0 = r0 + 55
            int r1 = r0 % 128
            Va.C1218z.f14826h = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L15
            boolean r0 = r3.f14829a
            r2 = 62
            int r2 = r2 / r1
            if (r0 == 0) goto L1a
            goto L33
        L15:
            boolean r0 = r3.f14829a
            r2 = 1
            if (r0 == r2) goto L33
        L1a:
            Va.Da r0 = new Va.Da
            r1 = 19
            r0.<init>(r3, r4, r5, r1)
            Va.AbstractC1104pb.I(r0)
            int r4 = Va.C1218z.f14825g
            int r4 = r4 + 47
            int r5 = r4 % 128
            Va.C1218z.f14826h = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L31
            return
        L31:
            r4 = 0
            throw r4
        L33:
            r4 = 8
            int[] r4 = new int[r4]
            r4 = {x0064: FILL_ARRAY_DATA , data: [-1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 2124998195, 884916705} // fill-array
            int r5 = android.os.Process.myPid()
            int r5 = r5 >> 22
            int r5 = 14 - r5
            java.lang.String r4 = j(r5, r4)
            java.lang.String r4 = r4.intern()
            r5 = 32
            int[] r5 = new int[r5]
            r5 = {x0078: FILL_ARRAY_DATA , data: [-218561969, -1726415466, -2115630913, -1948082808, 2132187580, 1956854740, -519368911, 998001218, 804929055, -1926007260, -1222030987, -321602038, -843488621, 925521992, -412300803, 623630580, -407461321, 467213452, -1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 1300267611, -1115487813, -150568476, -760631457, 633722901, -1056687297, -1257262344, 1565034230} // fill-array
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r0 = 63 - r0
            java.lang.String r5 = j(r0, r5)
            java.lang.String r5 = r5.intern()
            Va.Ab.x(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1218z.b(Va.Ia, Va.ha):void");
    }

    public String c() {
        String strReplace;
        String strIntern;
        Xa xa2;
        int i5;
        int i10;
        String strReplace2;
        k = (f14828j + 77) % 128;
        Xa xa3 = f14827i;
        xa3.getClass();
        int i11 = (Xa.f13854m + 77) % 128;
        Xa.f13855n = i11;
        int i12 = i11 + 101;
        Xa.f13854m = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        String strReplace3 = (String) xa3.f13858c;
        try {
            strReplace = strReplace3.replace(d(29567 - (ViewConfiguration.getWindowTouchSlop() >> 8), "陯\ue510炃찇宂휊⊍븙ඓ餕ᒃ怓ﾟ䬉욇刈ꆁ㴆袇").intern(), k());
            strIntern = d(View.MeasureSpec.getMode(0) + 34129, "陯ጾ鳕ᦈ茽೬覝㍍볣㦧ꍍⰒꦥ").intern();
            xa2 = f14827i;
            xa2.getClass();
            i5 = Xa.f13854m + 63;
            i10 = i5 % 128;
            Xa.f13855n = i10;
        } catch (Throwable th) {
            String strIntern2 = d(167 - Color.blue(0), "陣零霘鞗铁锒閩鋯鍿鎢郜酳醅鸬齢龒鰶").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d(37987 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "陱ȥ뺀⭲쟊珻\uec0f飯㔌ꄨ嶏\uf601拚ὀ謊➖큍䳉\uf8a8锈ǫ멟嚌싱").intern());
            sb2.append(th.getLocalizedMessage());
            Ab.x(strIntern2, sb2.toString());
        }
        if (i5 % 2 == 0) {
            throw null;
        }
        Xa.f13854m = (i10 + 23) % 128;
        String strReplace4 = strReplace.replace(strIntern, (String) xa2.f13859d);
        if (!(!this.f14829a)) {
            k = (f14828j + 65) % 128;
            String strIntern3 = d((-16721705) - Color.rgb(0, 0, 0), "陯亸⟟ᳩ\uf53c꩕荿箊僆২\uee0f읔").intern();
            Xa xa4 = f14827i;
            xa4.getClass();
            int i13 = Xa.f13854m + 63;
            Xa.f13855n = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            strReplace2 = strReplace4.replace(strIntern3, (String) xa4.f13860e);
        } else {
            strReplace2 = strReplace4.replace(d(55511 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "陯亸⟟ᳩ\uf53c꩕荿箊僆২\uee0f읔").intern(), "");
        }
        strReplace3 = strReplace2.replace(d(KeyEvent.normalizeMetaState(0) + 42131, "陯㋼\udf51篂жꂥ䴃ᙲ닸彐ﯘ萺ₚ촐陣㋴").intern(), (String) this.f14830b);
        k = (f14828j + 79) % 128;
        String strZ = AbstractC1104pb.Z(strReplace3.getBytes());
        int i14 = k + 59;
        f14828j = i14 % 128;
        if (i14 % 2 == 0) {
            return strZ;
        }
        throw null;
    }

    public void h() {
        int i5 = f14826h + 81;
        f14825g = i5 % 128;
        int i10 = i5 % 2;
        Ea ea2 = (Ea) this.f14830b;
        if (i10 != 0) {
            ea2.getClass();
            Ea.f13319f = (Ea.f13320g + 35) % 128;
            ea2.f13321a.unregisterReceiver(ea2);
            Ea.f13319f = (Ea.f13320g + 91) % 128;
            this.f14829a = true;
            return;
        }
        ea2.getClass();
        Ea.f13319f = (Ea.f13320g + 35) % 128;
        ea2.f13321a.unregisterReceiver(ea2);
        Ea.f13319f = (Ea.f13320g + 91) % 128;
        this.f14829a = true;
    }

    public void i(String str, JSONObject jSONObject, Ia ia2) {
        String strIntern;
        String strJ;
        if (!TextUtils.isEmpty(str)) {
            C0999ha c0999ha = new C0999ha();
            c0999ha.f14263a = jSONObject;
            c0999ha.f14264b = str;
            b(ia2, c0999ha);
            return;
        }
        int i5 = f14826h + 101;
        f14825g = i5 % 128;
        if (i5 % 2 != 0) {
            strIntern = j(68 % View.getDefaultSize(1, 0), new int[]{-1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 2124998195, 884916705}).intern();
            strJ = j(3 >> TextUtils.getCapsMode("", 1, 1), new int[]{-197046752, 690282354, -1084880868, -1976525755, -48341775, -218830675, -1295962599, -309692173, -1814621462, -765006245, -138410433, -1223045738, 1090664149, -2046199326, -1509240222, 900545158, 2141654512, -1860045339, 988092674, 293043076, 958077684, 1449222222, -1987805850, -2013279271, 2129821917, 1716880685, 1998295820, -87576369, -1417634323, 1284200575, -909978493, -536717264, 1813545178, -1776430591, -630769496, -1049350335, 1447149647, 282752702, -912687106, -1280156183});
        } else {
            strIntern = j(14 - View.getDefaultSize(0, 0), new int[]{-1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 2124998195, 884916705}).intern();
            strJ = j(TextUtils.getCapsMode("", 0, 0) + 77, new int[]{-197046752, 690282354, -1084880868, -1976525755, -48341775, -218830675, -1295962599, -309692173, -1814621462, -765006245, -138410433, -1223045738, 1090664149, -2046199326, -1509240222, 900545158, 2141654512, -1860045339, 988092674, 293043076, 958077684, 1449222222, -1987805850, -2013279271, 2129821917, 1716880685, 1998295820, -87576369, -1417634323, 1284200575, -909978493, -536717264, 1813545178, -1776430591, -630769496, -1049350335, 1447149647, 282752702, -912687106, -1280156183});
        }
        Ab.c(strIntern, strJ.intern());
        int i10 = f14825g + 61;
        f14826h = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 85 / 0;
        }
    }

    public C1218z(V v2) {
        this.f14830b = v2;
        C0974fb.e().f(new C1105q(this, 1));
    }

    public C1218z(String str, boolean z2) {
        this.f14830b = str;
        this.f14829a = z2;
    }
}
