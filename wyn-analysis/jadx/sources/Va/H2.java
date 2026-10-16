package Va;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.inmobi.ads.AdContainer;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.sdk.InMobiSdk;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class H2 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f13401R = {562507611, -915395194, -1952573310, -1012846282, 1800988401, -285658014, 1522885977, 766100903, 1393412104, 792542038, 1819201026, -211117223, -1660652813, -757948543, -1858581880, -755617891, 831784239, -2002228277};

    /* renamed from: S, reason: collision with root package name */
    public static int f13402S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f13403T = 1;

    public static Map C0(Ad ad2) {
        f13402S = (f13403T + 9) % 128;
        Map rewards = ad2.getRewards();
        f13403T = (f13402S + 93) % 128;
        return rewards;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Enum D0(java.lang.String r10) {
        /*
            int r0 = Va.H2.f13402S
            int r0 = r0 + 121
            int r0 = r0 % 128
            Va.H2.f13403T = r0
            int r0 = r10.hashCode()
            r1 = -2102692847(0xffffffff82ab7411, float:-2.519281E-37)
            r2 = 0
            java.lang.String r4 = ""
            r5 = 2
            r6 = 1
            r7 = 0
            if (r0 == r1) goto L7f
            r1 = -1357644918(0xffffffffaf13fb8a, float:-1.3458937E-10)
            if (r0 == r1) goto L4b
            r1 = 235669401(0xe0c0799, float:1.725999E-30)
            if (r0 == r1) goto L24
            goto La5
        L24:
            int r0 = android.text.TextUtils.getTrimmedLength(r4)
            int r0 = r0 + 24
            r1 = 48
            int r1 = android.text.TextUtils.lastIndexOf(r4, r1, r7)
            int r1 = 132 - r1
            long r8 = android.widget.ExpandableListView.getPackedPositionForChild(r7, r7)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            int r2 = r2 + 25
            java.lang.String r3 = "\u0000\t\u0001\u0000�\u0000\u0007\u0011\ufff7\u0002\u000b\u0006\u0011\ufff7\b\ufffb\u0006\ufff3\ufff7\u0004\ufff5\u0011\ufff6\ufff3"
            java.lang.String r0 = K0(r3, r0, r1, r2, r6)
            java.lang.String r0 = r0.intern()
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto La5
            goto La6
        L4b:
            int r0 = android.os.Process.myTid()
            int r0 = r0 >> 22
            int r0 = 22 - r0
            int r1 = android.os.Process.getThreadPriority(r7)
            int r1 = r1 + 20
            int r1 = r1 >> 6
            int r1 = r1 + 132
            int r2 = android.view.ViewConfiguration.getTouchSlop()
            int r2 = r2 >> 8
            int r2 = 1 - r2
            java.lang.String r3 = "\u0002\ufff4\ufff7\u0012\ufff6\u0005\ufff8\ufff4\u0007￼\t\ufff8\u0012\u0007\f\u0003\ufff8\u0012\t￼\ufff7\ufff8"
            java.lang.String r0 = K0(r3, r0, r1, r2, r7)
            java.lang.String r0 = r0.intern()
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto La5
            int r10 = Va.H2.f13402S
            int r10 = r10 + 85
            int r10 = r10 % 128
            Va.H2.f13403T = r10
            r7 = r6
            goto La6
        L7f:
            int r0 = android.os.Process.getGidForName(r4)
            int r0 = 23 - r0
            int r1 = android.graphics.Color.blue(r7)
            int r1 = r1 + 132
            long r8 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            int r2 = r2 + 18
            java.lang.String r3 = "\ufff8\ufff4\u0007￼\t\ufff8\u0012\u0007\f\u0003\ufff8\u0012\ufff7￼\u0006\u0003\uffff\ufff4\f\ufff4\ufff7\u0012\ufff6\u0005"
            java.lang.String r0 = K0(r3, r0, r1, r2, r7)
            java.lang.String r0 = r0.intern()
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto La5
            r7 = r5
            goto La6
        La5:
            r7 = -1
        La6:
            r10 = 0
            if (r7 == 0) goto Lb4
            if (r7 == r6) goto Lb1
            if (r7 == r5) goto Lae
            return r10
        Lae:
            com.inmobi.ads.AdUnit$AdCreativeType r10 = com.inmobi.ads.AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY
            return r10
        Lb1:
            com.inmobi.ads.AdUnit$AdCreativeType r10 = com.inmobi.ads.AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO
            return r10
        Lb4:
            com.inmobi.ads.AdUnit$AdCreativeType r0 = com.inmobi.ads.AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN
            int r1 = Va.H2.f13403T
            int r1 = r1 + 9
            int r2 = r1 % 128
            Va.H2.f13402S = r2
            int r1 = r1 % r5
            if (r1 != 0) goto Lc2
            return r0
        Lc2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.H2.D0(java.lang.String):java.lang.Enum");
    }

    public static String E0(Ad ad2) {
        f13402S = (f13403T + 107) % 128;
        String webVast = ad2.getWebVast();
        f13402S = (f13403T + 85) % 128;
        return webVast;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Enum F0(java.lang.String r8) {
        /*
            r0 = 12
            int r1 = r8.hashCode()
            r2 = 556003820(0x2123f1ec, float:5.554673E-19)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == r2) goto L6a
            r2 = 556062505(0x2124d729, float:5.5850123E-19)
            if (r1 == r2) goto L35
            r2 = 1382961856(0x526e52c0, float:2.5589763E11)
            if (r1 == r2) goto L1a
            goto L8c
        L1a:
            int[] r0 = new int[r0]
            r0 = {x009e: FILL_ARRAY_DATA , data: [1951500403, -1165699746, 1145231371, -1075977298, 1014658262, -931103497, 9950061, 603694691, 948739616, -152366165, -191671302, -1048146467} // fill-array
            int r1 = android.view.View.combineMeasuredStates(r5, r5)
            int r1 = r1 + 22
            java.lang.String r0 = L0(r1, r0)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L8c
            r5 = r3
            goto L8d
        L35:
            long r0 = android.os.Process.getElapsedCpuTime()
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            int r0 = r0 + 22
            int r1 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r1 = r1 >> 16
            int r1 = 135 - r1
            float r2 = android.util.TypedValue.complexToFloat(r5)
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            int r2 = r2 + 13
            java.lang.String r5 = "\u0000\t\u0004\u000f\u0000\u0005\ufffb\u0002\ufff1�\u000f\ufff4\ufff1\ufffe\uffff\u0003\ufffa\u000f�\ufffe\ufff9\u000f\ufff5"
            java.lang.String r0 = K0(r5, r0, r1, r2, r4)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L8c
            int r8 = Va.H2.f13402S
            int r8 = r8 + 29
            int r8 = r8 % 128
            Va.H2.f13403T = r8
            r5 = r4
            goto L8d
        L6a:
            int[] r0 = new int[r0]
            r0 = {x00ba: FILL_ARRAY_DATA , data: [1951500403, -1165699746, 1145231371, -1075977298, 1014658262, -931103497, 1674407392, -1141969328, 2047657469, -577441720, -732839063, -1528047205} // fill-array
            int r1 = android.view.View.resolveSize(r5, r5)
            int r1 = r1 + 23
            java.lang.String r0 = L0(r1, r0)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L8c
            int r8 = Va.H2.f13403T
            int r8 = r8 + 99
            int r8 = r8 % 128
            Va.H2.f13402S = r8
            goto L8d
        L8c:
            r5 = -1
        L8d:
            if (r5 == 0) goto L9b
            if (r5 == r4) goto L98
            if (r5 == r3) goto L95
            r8 = 0
            return r8
        L95:
            com.inmobi.ads.AdUnit$AdMarkupType r8 = com.inmobi.ads.AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN
            return r8
        L98:
            com.inmobi.ads.AdUnit$AdMarkupType r8 = com.inmobi.ads.AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON
            return r8
        L9b:
            com.inmobi.ads.AdUnit$AdMarkupType r8 = com.inmobi.ads.AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.H2.F0(java.lang.String):java.lang.Enum");
    }

    public static Enum G0(String str) {
        int i5 = f13403T + 59;
        f13402S = i5 % 128;
        if (i5 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        int iHashCode = str.hashCode();
        char c10 = 65535;
        if (iHashCode != -1097819034) {
            if (iHashCode == 1554700484) {
                if (!(!str.equals(L0(KeyEvent.getDeadChar(0, 0) + 21, new int[]{-124999537, -1345533637, -1210132634, 1368948542, -2096984458, -41170721, 1674407392, -1141969328, -1675239349, -1346203610, 1940773470, -1826856372}).intern()))) {
                    f13402S = (f13403T + 79) % 128;
                    c10 = 0;
                }
            }
        } else if (str.equals(K0("\u0012\ufff9\b\uffff\uffff\u0006\ufff6\u0005\ufff8\ufff8\u0001\u0003\uffff\ufff4\ufff6\ufff8\u0000\ufff8\u0001\u0007\u0012\u0007\f\u0003\ufff8", 25 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 132 - (Process.myTid() >> 22), 11 - TextUtils.getOffsetAfter("", 0), false).intern())) {
            c10 = 1;
        }
        if (c10 == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (c10 != 1) {
            return null;
        }
        return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
    }

    public static String H0(Ad ad2) {
        int i5 = f13403T + 111;
        f13402S = i5 % 128;
        int i10 = i5 % 2;
        String creativeId = ad2.getCreativeId();
        if (i10 != 0) {
            int i11 = 50 / 0;
        }
        return creativeId;
    }

    public static List I0(AdResponse adResponse) {
        int i5 = f13402S + 17;
        f13403T = i5 % 128;
        if (i5 % 2 != 0) {
            return adResponse.getAdSets();
        }
        adResponse.getAdSets();
        throw null;
    }

    public static Boolean J0(AdSet adSet) {
        f13403T = (f13402S + 13) % 128;
        Boolean boolValueOf = Boolean.valueOf(adSet.isRewarded());
        int i5 = f13403T + 19;
        f13402S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 92 / 0;
        }
        return boolValueOf;
    }

    public static String K0(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - '7');
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

    public static String L0(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13401R.clone();
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

    public static String M0(ContextData contextData) {
        f13403T = (f13402S + 39) % 128;
        String advertisedContent = contextData.getAdvertisedContent();
        int i5 = f13403T + 7;
        f13402S = i5 % 128;
        if (i5 % 2 == 0) {
            return advertisedContent;
        }
        throw null;
    }

    public static LinkedList N0(AdSet adSet) {
        int i5 = f13403T + 1;
        f13402S = i5 % 128;
        int i10 = i5 % 2;
        LinkedList ads = adSet.getAds();
        if (i10 != 0) {
            int i11 = 29 / 0;
        }
        return ads;
    }

    public static Long O0(AdResponse adResponse) {
        Long lValueOf;
        int i5 = f13402S + 75;
        f13403T = i5 % 128;
        if (i5 % 2 == 0) {
            lValueOf = Long.valueOf(adResponse.getPlacementId());
            int i10 = 28 / 0;
        } else {
            lValueOf = Long.valueOf(adResponse.getPlacementId());
        }
        int i11 = f13403T + 103;
        f13402S = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 88 / 0;
        }
        return lValueOf;
    }

    public static Object P0(AdContainer adContainer) {
        int i5 = f13403T + 91;
        f13402S = i5 % 128;
        if (i5 % 2 == 0) {
            return adContainer.getDataModel();
        }
        adContainer.getDataModel();
        throw null;
    }

    public static Object Q0(Ad ad2) {
        int i5 = f13403T + 17;
        f13402S = i5 % 128;
        if (i5 % 2 != 0) {
            ad2.getContextData();
            throw null;
        }
        ContextData contextData = ad2.getContextData();
        f13402S = (f13403T + 23) % 128;
        return contextData;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(K0("\u0007\ufffe\u0006\ufffe￼\ufffa\u0005￩\r\ufffe\u0000\u0006\u000e\u0007\uffde\ufffe\t\u0012￭\r", 20 - Color.red(0), View.combineMeasuredStates(0, 0) + 158, TextUtils.indexOf("", "", 0) + 11, true).intern(), new B1(21));
        map.put(L0(19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new int[]{970138680, -2008091511, 349578956, 335032656, 1041954642, -868887232, 2052114233, -1704509948, 48064122, -905601641}).intern(), new B1(23));
        map.put(K0("\u0002\u0011￡\ufffe\u0011\ufffe￪\f\u0001\u0002\t\u0004", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, KeyEvent.getDeadChar(0, 0) + 154, 11 - View.resolveSizeAndState(0, 0, 0), false).intern(), new C1197x2());
        map.put(K0("\uffffￜ\u000f\u0000\u0002\u0000\u000b\u0014\uffef\u0000\u0011\u0004\u000f￼\u0000\r\uffde", 17 - Color.blue(0), 156 - (ViewConfiguration.getTouchSlop() >> 8), View.combineMeasuredStates(0, 0) + 5, true).intern(), new B1(22));
        map.put(L0((ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, new int[]{-927567458, 1501058169, -1888050994, 703981013, 1852768155, -716249168, -1253389799, -1455011673}).intern(), new G2());
        map.put(L0(((Process.getThreadPriority(0) + 20) >> 6) + 9, new int[]{970138680, -2008091511, 1883952003, -2110210192, -515331481, -1691358230}).intern(), new F2());
        map.put(L0((ViewConfiguration.getTapTimeout() >> 16) + 10, new int[]{991916618, -1169169017, -888966311, 2060120649, 1593797696, -1762186947}).intern(), new A2());
        map.put(L0(View.MeasureSpec.makeMeasureSpec(0, 0) + 6, new int[]{970138680, -2008091511, -398300370, 1347680163}).intern(), new C1209y2());
        map.put(L0(14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new int[]{1419834114, -1083736733, -2080496507, 1768678064, -1270700691, -2051588244, 439545563, 174511689}).intern(), new C1221z2());
        map.put(L0(11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new int[]{-2047958724, 1802777980, -1916031351, 1162252702, -398300370, 1347680163}).intern(), new C2());
        map.put(K0("\ufff0\ufffb\r\u000e\u0001\uffff\u000e\ufff1\uffff￼", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9, 157 - TextUtils.indexOf("", ""), View.resolveSizeAndState(0, 0, 0) + 4, false).intern(), new D2());
        map.put(L0(13 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), new int[]{1419834114, -1083736733, 559628199, 562221892, -2134671351, -328540407, -1653694672, 1716761448}).intern(), new E2());
        map.put(L0((ViewConfiguration.getLongPressTimeout() >> 16) + 20, new int[]{970138680, -2008091511, -1133514536, 977919822, 1168316515, 873651306, -1916570316, 435599446, -1140736757, -438061370}).intern(), new B2());
        f13402S = (f13403T + 67) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f13402S = (f13403T + 95) % 128;
        String version = InMobiSdk.getVersion();
        f13403T = (f13402S + 11) % 128;
        return version;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03cf  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.H2.w0(java.lang.String):java.lang.Class");
    }
}
