package Q1;

import A7.AbstractC0279p0;
import N1.C;
import N1.D;
import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.AbstractC3409K;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9724a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f9725b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f9726c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f9727d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f9728e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9729f;

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f9730g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f9731h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f9732i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f9733j;
    public static HashMap k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f9734l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f9735m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f9736n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f9737o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f9738p;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f9724a = i5;
        String str = Build.DEVICE;
        f9725b = str;
        String str2 = Build.MANUFACTURER;
        f9726c = str2;
        String str3 = Build.MODEL;
        f9727d = str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        f9728e = N0.a.d(i5, ", ", sb2);
        f9729f = new byte[0];
        f9730g = new long[0];
        f9731h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f9732i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f9733j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f9734l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f9735m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f9736n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f9737o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f9738p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 196, 195, Sdk.SDKError.Reason.AD_CONSUMED_VALUE, Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, 144, 151, 158, 153, 140, 139, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE, 128, 149, 146, 155, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, 240, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, Sdk.SDKError.Reason.AD_IS_LOADING_VALUE, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static long A(long j8, float f10) {
        return f10 == 1.0f ? j8 : Math.round(j8 / f10);
    }

    public static String B(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            k.l("Util", "Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    public static String C(int i5) {
        switch (i5) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return BuildConfig.FLAVOR;
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return ExternalParsersConfigReaderMetKeys.METADATA_TAG;
            case 6:
                return "camera motion";
            default:
                return i5 >= 10000 ? AbstractC0279p0.i(i5, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int D(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.x.D(android.net.Uri, java.lang.String):int");
    }

    public static void E(int i5) {
        Integer.toString(i5, 36);
    }

    public static boolean F(int i5) {
        return i5 == 3 || i5 == 2 || i5 == 268435456 || i5 == 21 || i5 == 1342177280 || i5 == 22 || i5 == 1610612736 || i5 == 4;
    }

    public static boolean G(Context context) {
        int i5 = f9724a;
        if (i5 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        String str = f9727d;
        if (i5 == 30 && (A6.h.v(str, "moto g(20)") || A6.h.v(str, "rmx3231"))) {
            return true;
        }
        return i5 == 34 && A6.h.v(str, "sm-x200");
    }

    public static boolean H(int i5) {
        return i5 == 10 || i5 == 13;
    }

    public static boolean I(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void J(ArrayList arrayList, int i5, int i10, int i11) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i12 = (i10 - i5) - 1; i12 >= 0; i12--) {
            arrayDeque.addFirst(arrayList.remove(i5 + i12));
        }
        arrayList.addAll(Math.min(i11, arrayList.size()), arrayDeque);
    }

    public static long K(long j8) {
        return (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? j8 : j8 * 1000;
    }

    public static String L(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strO = A6.h.O(str);
        int i5 = 0;
        String str2 = strO.split("-", 2)[0];
        if (k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f9734l;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                map.put(strArr[i10], strArr[i10 + 1]);
            }
            k = map;
        }
        String str4 = (String) k.get(str2);
        if (str4 != null) {
            StringBuilder sbJ = N0.a.j(str4);
            sbJ.append(strO.substring(str2.length()));
            strO = sbJ.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strO;
        }
        while (true) {
            String[] strArr2 = f9735m;
            if (i5 >= strArr2.length) {
                return strO;
            }
            if (strO.startsWith(strArr2[i5])) {
                return strArr2[i5 + 1] + strO.substring(strArr2[i5].length());
            }
            i5 += 2;
        }
    }

    public static Object[] M(int i5, Object[] objArr) {
        k.c(i5 <= objArr.length);
        return Arrays.copyOf(objArr, i5);
    }

    public static long N(String str) throws D {
        Matcher matcher = f9731h.matcher(str);
        if (!matcher.matches()) {
            throw D.a(null, "Invalid date/time format: " + str);
        }
        int i5 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i5 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i5 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i5 != 0 ? timeInMillis - (i5 * 60000) : timeInMillis;
    }

    public static void O(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void P(ArrayList arrayList, int i5, int i10) {
        if (i5 < 0 || i10 > arrayList.size() || i5 > i10) {
            throw new IllegalArgumentException();
        }
        if (i5 != i10) {
            arrayList.subList(i5, i10).clear();
        }
    }

    public static long Q(int i5, long j8) {
        return S(j8, 1000000L, i5, RoundingMode.DOWN);
    }

    public static void R(long[] jArr, long j8) {
        long j10;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i5 = 0;
        if (j8 >= 1000000 && j8 % 1000000 == 0) {
            long jT = A6.h.t(j8, 1000000L, RoundingMode.UNNECESSARY);
            while (i5 < jArr.length) {
                jArr[i5] = A6.h.t(jArr[i5], jT, roundingMode);
                i5++;
            }
            return;
        }
        if (j8 < 1000000 && 1000000 % j8 == 0) {
            long jT2 = A6.h.t(1000000L, j8, RoundingMode.UNNECESSARY);
            while (i5 < jArr.length) {
                jArr[i5] = A6.h.M(jArr[i5], jT2);
                i5++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < jArr.length) {
            long j11 = jArr[i10];
            if (j11 != 0) {
                if (j8 >= j11 && j8 % j11 == 0) {
                    jArr[i10] = A6.h.t(1000000L, A6.h.t(j8, j11, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j8 >= j11 || j11 % j8 != 0) {
                    j10 = j8;
                    jArr[i10] = T(j11, 1000000L, j10, roundingMode);
                } else {
                    jArr[i10] = A6.h.M(1000000L, A6.h.t(j11, j8, RoundingMode.UNNECESSARY));
                }
                j10 = j8;
            } else {
                j10 = j8;
            }
            i10++;
            j8 = j10;
        }
    }

    public static long S(long j8, long j10, long j11, RoundingMode roundingMode) {
        if (j8 == 0 || j10 == 0) {
            return 0L;
        }
        return (j11 < j10 || j11 % j10 != 0) ? (j11 >= j10 || j10 % j11 != 0) ? (j11 < j8 || j11 % j8 != 0) ? (j11 >= j8 || j8 % j11 != 0) ? T(j8, j10, j11, roundingMode) : A6.h.M(j10, A6.h.t(j8, j11, RoundingMode.UNNECESSARY)) : A6.h.t(j10, A6.h.t(j11, j8, RoundingMode.UNNECESSARY), roundingMode) : A6.h.M(j8, A6.h.t(j10, j11, RoundingMode.UNNECESSARY)) : A6.h.t(j8, A6.h.t(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long T(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.x.T(long, long, long, java.math.RoundingMode):long");
    }

    public static String[] U(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static String V(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i5 = 0; i5 < bArr.length; i5++) {
            sb2.append(Character.forDigit((bArr[i5] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i5] & 15, 16));
        }
        return sb2.toString();
    }

    public static long W(long j8) {
        return (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? j8 : j8 / 1000;
    }

    public static int a(long[] jArr, long j8, boolean z2) {
        int i5;
        int iBinarySearch = Arrays.binarySearch(jArr, j8);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i5 = iBinarySearch + 1;
            if (i5 >= jArr.length || jArr[i5] != j8) {
                break;
            }
            iBinarySearch = i5;
        }
        return z2 ? iBinarySearch : i5;
    }

    public static int b(l lVar, long j8) {
        int i5 = lVar.f9690b - 1;
        int i10 = 0;
        while (i10 <= i5) {
            int i11 = (i10 + i5) >>> 1;
            if (lVar.c(i11) < j8) {
                i10 = i11 + 1;
            } else {
                i5 = i11 - 1;
            }
        }
        int i12 = i5 + 1;
        if (i12 < lVar.f9690b && lVar.c(i12) == j8) {
            return i12;
        }
        if (i5 == -1) {
            return 0;
        }
        return i5;
    }

    public static int c(AbstractC3409K abstractC3409K, Long l10, boolean z2) {
        int i5;
        int iBinarySearch = Collections.binarySearch(abstractC3409K, l10);
        if (iBinarySearch < 0) {
            i5 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || ((Comparable) abstractC3409K.get(i10)).compareTo(l10) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i5 = iBinarySearch;
        }
        return z2 ? Math.max(0, i5) : i5;
    }

    public static int d(int[] iArr, int i5, boolean z2, boolean z10) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i5);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || iArr[i10] != i5) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z2 ? iBinarySearch : i10;
        }
        return z10 ? Math.max(0, i11) : i11;
    }

    public static int e(long[] jArr, long j8, boolean z2) {
        int i5;
        int iBinarySearch = Arrays.binarySearch(jArr, j8);
        if (iBinarySearch < 0) {
            i5 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j8) {
                    break;
                }
                iBinarySearch = i10;
            }
            i5 = iBinarySearch;
        }
        return z2 ? Math.max(0, i5) : i5;
    }

    public static int f(int i5, int i10) {
        return ((i5 + i10) - 1) / i10;
    }

    public static void g(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int i(int i5, int i10, int i11) {
        return Math.max(i10, Math.min(i5, i11));
    }

    public static long j(long j8, long j10, long j11) {
        return Math.max(j10, Math.min(j8, j11));
    }

    public static boolean k(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int l(int i5, byte[] bArr, int i10, int i11) {
        while (i5 < i10) {
            i11 = f9736n[((i11 >>> 24) ^ (bArr[i5] & 255)) & 255] ^ (i11 << 8);
            i5++;
        }
        return i11;
    }

    public static Handler m(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        k.h(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    public static String n(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int o(int i5) {
        if (i5 == 20) {
            return 30;
        }
        if (i5 == 22) {
            return 31;
        }
        if (i5 == 30) {
            return 34;
        }
        switch (i5) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i5) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                }
        }
    }

    public static AudioFormat p(int i5, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i5).setChannelMask(i10).setEncoding(i11).build();
    }

    public static int q(int i5) {
        int i10 = f9724a;
        if (i5 == 10) {
            return i10 >= 32 ? 737532 : 6396;
        }
        if (i5 == 12) {
            return 743676;
        }
        if (i5 == 24) {
            return i10 >= 32 ? 67108860 : 0;
        }
        switch (i5) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static byte[] r(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i10 = i5 * 2;
            bArr[i5] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static int s(int i5, String str) {
        int i10 = 0;
        for (String str2 : U(str)) {
            if (i5 == C.h(C.d(str2))) {
                i10++;
            }
        }
        return i10;
    }

    public static String t(int i5, String str) {
        String[] strArrU = U(str);
        if (strArrU.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrU) {
            if (i5 == C.h(C.d(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static int u(int i5) {
        if (i5 == 2 || i5 == 4) {
            return 6005;
        }
        if (i5 == 10) {
            return 6004;
        }
        if (i5 == 7) {
            return 6005;
        }
        if (i5 == 8) {
            return 6003;
        }
        switch (i5) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i5) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int v(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        int i5 = 0;
        if (str == null || (length = (strArrSplit = str.split(Constants.USER_ID_SEPARATOR, -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z2 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i5 = Integer.parseInt(str2);
            if (z2) {
                return -i5;
            }
        } catch (NumberFormatException unused) {
        }
        return i5;
    }

    public static long w(long j8, float f10) {
        return f10 == 1.0f ? j8 : Math.round(j8 * f10);
    }

    public static long x(long j8) {
        return j8 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j8;
    }

    public static int y(int i5) {
        if (i5 == 8) {
            return 3;
        }
        if (i5 == 16) {
            return 2;
        }
        if (i5 != 24) {
            return i5 != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int z(int r4, int r5) {
        /*
            r0 = 2
            if (r4 == r0) goto L29
            r1 = 3
            if (r4 == r1) goto L28
            r2 = 4
            if (r4 == r2) goto L26
            r3 = 21
            if (r4 == r3) goto L24
            r3 = 22
            if (r4 == r3) goto L26
            r3 = 268435456(0x10000000, float:2.524355E-29)
            if (r4 == r3) goto L29
            r0 = 1342177280(0x50000000, float:8.589935E9)
            if (r4 == r0) goto L24
            r0 = 1610612736(0x60000000, float:3.689349E19)
            if (r4 != r0) goto L1e
            goto L26
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L24:
            r0 = r1
            goto L29
        L26:
            r0 = r2
            goto L29
        L28:
            r0 = 1
        L29:
            int r0 = r0 * r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.x.z(int, int):int");
    }
}
