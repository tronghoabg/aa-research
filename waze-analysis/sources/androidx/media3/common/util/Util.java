package androidx.media3.common.util;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.audio.IamfUtil;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.muxer.MuxerUtil;
import androidx.webkit.ProxyConfig;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.h.f;
import com.google.d.h.h;
import com.google.d.j.b;
import com.google.d.j.e;
import com.google.d.l.j;
import com.google.d.m.a.ag;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.bv;
import com.google.d.m.a.cf;
import com.waze.strings.DisplayStrings;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Util {
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final String TAG = "Util";
    private static final int ZLIB_INFLATE_HEADER = 120;
    private static HashMap<String, String> languageTagReplacementMap;

    @Deprecated
    public static final int SDK_INT = Build.VERSION.SDK_INT;

    @Deprecated
    public static final String DEVICE = Build.DEVICE;

    @Deprecated
    public static final String MANUFACTURER = Build.MANUFACTURER;

    @Deprecated
    public static final String MODEL = Build.MODEL;
    public static final String DEVICE_DEBUG_INFO = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + Build.VERSION.SDK_INT;
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    private static final Pattern XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
    private static final Pattern XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    private static final Pattern ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static final Pattern ISM_PATH_PATTERN = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    private static final String[] additionalIsoLanguageReplacements = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_IDENTIFIER, "may", AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_STRING_LITERAL, "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", TtmlNode.ATTR_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    private static final String[] isoLegacyTagReplacements = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    private static final int[] CRC32_BYTES_MSBF = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    private static final int[] CRC16_BYTES_MSBF = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
    private static final int[] CRC8_BYTES_MSBF = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_1, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, 251, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_5, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_2, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_7, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_2, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_5, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_8, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_HAZARD_PLURAL, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_HAZARD, 202, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_4, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_USUAL_ROUTE, 192, 201, 206, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_10, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_4, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_1, 255, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1, 241, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_3, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_6, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_7, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_5, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_2, 183, 176, 185, DisplayStrings.DS_TRIP_OVERVIEW_REQUIRED_RESTRICTED_AREA_LABEL, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, DisplayStrings.DS_TRIP_OVERVIEW_FERRY_LABEL, DisplayStrings.DS_TRIP_OVERVIEW_LICENSE_PLATE_RESTRICTION_ALERT, DisplayStrings.DS_TRIP_OVERVIEW_PTL_LABEL, 173, 170, 163, 164, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_2, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2, 247, 240, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_1, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_5, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_3, 236, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_POLICE, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_CRASH_PLURAL, 207, 200, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_12, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_9, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_2, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_3, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_1, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7, 215, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_POLICE_PLURAL, DisplayStrings.DS_TRIP_OVERVIEW_BADGE_CRASH, 204, 203, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_2, 225, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_2, 250, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_1, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_1, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PREFERENCES_6};

    /* compiled from: WazeSource */
    class Api24 {
        private Api24() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void stopForeground(Service service, boolean z) {
            service.stopForeground(true != z ? 2 : 1);
        }
    }

    /* compiled from: WazeSource */
    class Api26 {
        private Api26() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void createNotificationChannel(NotificationManager notificationManager, String str, String str2) {
            notificationManager.createNotificationChannel(new NotificationChannel(str, str2, 2));
        }
    }

    /* compiled from: WazeSource */
    class Api29 {
        private Api29() {
        }

        public static void startForeground(Service service, int i2, Notification notification, int i3, String str) {
            try {
                service.startForeground(i2, notification, i3);
            } catch (RuntimeException e2) {
                Log.e(Util.TAG, "The service must be declared with a foregroundServiceType that includes ".concat(String.valueOf(str)));
                throw e2;
            }
        }
    }

    private Util() {
    }

    public static long addWithOverflowDefault(long j2, long j3, long j4) {
        long jE = e.e(j2, j3);
        if (jE != Long.MIN_VALUE || j2 + j3 == Long.MIN_VALUE) {
            if (jE != Long.MAX_VALUE) {
                return jE;
            }
            if (j2 + j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        }
        return j4;
    }

    @Deprecated
    public static boolean areEqual(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= size || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.min(list.size() - 1, i3) : i3;
    }

    public static int binarySearchFloor(LongArray longArray, long j2, boolean z, boolean z2) {
        int i2;
        int size = longArray.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            if (longArray.get(i4) < j2) {
                i3 = i4 + 1;
            } else {
                size = i4 - 1;
            }
        }
        if (z && (i2 = size + 1) < longArray.size() && longArray.get(i2) == j2) {
            return i2;
        }
        if (z2 && size == -1) {
            return 0;
        }
        return size;
    }

    public static <T> T castNonNull(T t) {
        return t;
    }

    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    public static long ceilDivide(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItemArr) {
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (isTrafficRestricted(localConfiguration.uri)) {
                    return false;
                }
                for (int i2 = 0; i2 < mediaItem.localConfiguration.subtitleConfigurations.size(); i2++) {
                    if (isTrafficRestricted(mediaItem.localConfiguration.subtitleConfigurations.get(i2).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static int compareLong(long j2, long j3) {
        return Long.compare(j2, j3);
    }

    public static double constrainValue(double d2, double d3, double d4) {
        return Math.max(d3, Math.min(d2, d4));
    }

    public static boolean contains(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean contentEquals(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                return false;
            }
        }
        return true;
    }

    public static <T> int contentHashCode(SparseArray<T> sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i2)) * 31) + Objects.hashCode(sparseArray.valueAt(i2));
        }
        return iKeyAt;
    }

    public static Bundle convertToNullIfInvalid(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ClassLoader classLoader = Util.class.getClassLoader();
        an.B(classLoader);
        bundle.setClassLoader(classLoader);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (RuntimeException e2) {
            Log.e(TAG, "Ignoring invalid bundle", e2);
            return null;
        }
    }

    public static int crc16(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            int iD = j.d(bArr[i2]);
            i4 = crc16UpdateFourBits(iD & 15, crc16UpdateFourBits(iD >> 4, i4));
            i2++;
        }
        return i4;
    }

    private static int crc16UpdateFourBits(int i2, int i3) {
        return (char) (CRC16_BYTES_MSBF[(i2 ^ ((i3 >> 12) & 255)) & 255] ^ ((char) (i3 << 4)));
    }

    public static int crc32(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = CRC32_BYTES_MSBF[(i4 >>> 24) ^ (bArr[i2] & 255)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int crc8(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = CRC8_BYTES_MSBF[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    public static Handler createHandler(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler createHandlerForCurrentLooper(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        an.B(looperMyLooper);
        return createHandler(looperMyLooper, callback);
    }

    public static Handler createHandlerForCurrentOrMainLooper(Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(additionalIsoLanguageReplacements.length + iSOLanguages.length);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = additionalIsoLanguageReplacements;
            if (i2 >= strArr.length) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static ByteBuffer createReadOnlyByteBuffer(ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    public static File createTempDirectory(Context context, String str) {
        File fileCreateTempFile = createTempFile(context, str);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    public static File createTempFile(Context context, String str) {
        File cacheDir = context.getCacheDir();
        an.B(cacheDir);
        return File.createTempFile(str, null, cacheDir);
    }

    public static long durationUsToSampleCount(long j2, int i2) {
        return scaleLargeValue(j2, i2, 1000000L, RoundingMode.UP);
    }

    public static void ensureNotificationChannel(NotificationManager notificationManager, String str, String str2) {
        if (notificationManager.getNotificationChannel(str) != null) {
            return;
        }
        Api26.createNotificationChannel(notificationManager, str, str2);
    }

    public static String escapeFileName(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (shouldEscapeCharacter(str.charAt(i4))) {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i3 + i3 + length);
        while (i3 > 0) {
            int i5 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (shouldEscapeCharacter(cCharAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(cCharAt));
                i3--;
            } else {
                sb.append(cCharAt);
            }
            i2 = i5;
        }
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        return sb.toString();
    }

    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = ISM_PATH_PATTERN.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int generateAudioSessionIdV21(Context context) {
        int iGenerateAudioSessionId = AudioManagerCompat.getAudioManager(context).generateAudioSessionId();
        if (iGenerateAudioSessionId != -1) {
            return iGenerateAudioSessionId;
        }
        return 0;
    }

    public static String getAdaptiveMimeTypeForContentType(int i2) {
        if (i2 == 0) {
            return MimeTypes.APPLICATION_MPD;
        }
        if (i2 == 1) {
            return MimeTypes.APPLICATION_SS;
        }
        if (i2 != 2) {
            return null;
        }
        return MimeTypes.APPLICATION_M3U8;
    }

    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i2) {
        switch (i2) {
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
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    @Deprecated
    public static int getAudioContentTypeForStreamType(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 8) {
                return 4;
            }
            if (i2 != 10) {
                return 2;
            }
        }
        return 1;
    }

    public static AudioFormat getAudioFormat(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static int getAudioTrackChannelConfig(int i2) {
        int i3;
        int i4 = 6396;
        if (i2 != 10) {
            if (i2 == 16) {
                i3 = 205215996;
            } else if (i2 != 24) {
                switch (i2) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11;
                    case 6:
                        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5;
                    case 7:
                        return DisplayStrings.DS_LOCATION_PREVIEW_CLOSES_SOON_AT;
                    case 8:
                        return 6396;
                    default:
                        switch (i2) {
                            case 12:
                                return 743676;
                            case 13:
                                i3 = 30136348;
                                break;
                            case 14:
                                i3 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                }
            } else {
                i3 = IamfUtil.CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_H_9_10_3;
            }
            i4 = 0;
        } else {
            i3 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i3 : i4;
    }

    public static int getAudioUsageForStreamType(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 1) {
            return 13;
        }
        if (i2 == 2) {
            return 6;
        }
        int i3 = 4;
        if (i2 != 4) {
            i3 = 5;
            if (i2 != 5) {
                if (i2 != 8) {
                    return i2 != 10 ? 1 : 11;
                }
                return 3;
            }
        }
        return i3;
    }

    public static String getAuxiliaryTrackTypeString(int i2) {
        if (i2 == 0) {
            return "undefined";
        }
        if (i2 == 1) {
            return "original";
        }
        if (i2 == 2) {
            return "depth-linear";
        }
        if (i2 == 3) {
            return "depth-inverse";
        }
        if (i2 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    public static Player.Commands getAvailableCommands(Player player, Player.Commands commands) {
        boolean zIsPlayingAd = player.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean zHasNextMediaItem = player.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean zIsEmpty = player.getCurrentTimeline().isEmpty();
        Player.Commands.Builder builder = new Player.Commands.Builder();
        builder.addAll(commands);
        boolean z = !zIsPlayingAd;
        builder.addIf(4, z);
        boolean z2 = false;
        builder.addIf(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        builder.addIf(6, zHasPreviousMediaItem && !zIsPlayingAd);
        builder.addIf(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd);
        builder.addIf(8, zHasNextMediaItem && !zIsPlayingAd);
        builder.addIf(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd);
        builder.addIf(10, z);
        builder.addIf(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z2 = true;
        }
        builder.addIf(12, z2);
        return builder.build();
    }

    public static int getBigEndianInt(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static int getBufferFlagsFromMediaCodecFlags(int i2) {
        int i3 = i2 & 1;
        return (i2 & 4) == 4 ? i3 | 4 : i3;
    }

    public static int getByteDepth(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    if (i2 == 1879048192) {
                                        return 8;
                                    }
                                    if (i2 != 1895825408) {
                                        if (i2 == 1912602624) {
                                            return 8;
                                        }
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static byte[] getBytesFromHexString(String str) {
        return f.l().f().q(str);
    }

    public static int getCodecCountOfType(String str, int i2) {
        int i3 = 0;
        for (String str2 : splitCodecs(str)) {
            if (i2 == MimeTypes.getTrackTypeOfCodec(str2)) {
                i3++;
            }
        }
        return i3;
    }

    public static String getCodecsOfType(String str, int i2) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i2 == MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String getCodecsWithoutType(String str, int i2) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i2 != MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[PHI: r0
  0x0040: PHI (r0v1 int) = (r0v0 int), (r0v0 int), (r0v0 int), (r0v4 int) binds: [B:7:0x0012, B:9:0x001a, B:11:0x0022, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.common.ColorInfo getColorInfoForDolbyVision(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            if (r3 != 0) goto L3
            goto L57
        L3:
            boolean r4 = androidx.media3.common.MimeTypes.isDolbyVisionCodec(r3, r4)
            if (r4 == 0) goto L57
            java.lang.String r4 = "dvhe"
            boolean r4 = r3.startsWith(r4)
            r0 = 1
            r1 = -1
            r2 = 6
            if (r4 != 0) goto L40
            java.lang.String r4 = "dvh1"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L40
            java.lang.String r4 = "dav1"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L25
            goto L40
        L25:
            if (r5 == 0) goto L3c
            java.lang.String r3 = "db1p"
            boolean r3 = r5.equals(r3)
            r0 = 2
            if (r3 == 0) goto L31
            goto L40
        L31:
            java.lang.String r3 = "db4"
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L3c
            r3 = 7
            r4 = r2
            goto L42
        L3c:
            r3 = r1
            r4 = r3
            r0 = r4
            goto L42
        L40:
            r3 = r2
            r4 = r3
        L42:
            if (r4 == r1) goto L57
            androidx.media3.common.ColorInfo$Builder r4 = new androidx.media3.common.ColorInfo$Builder
            r4.<init>()
            r4.setColorSpace(r2)
            r4.setColorRange(r0)
            r4.setColorTransfer(r3)
            androidx.media3.common.ColorInfo r3 = r4.build()
            return r3
        L57:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.getColorInfoForDolbyVision(java.lang.String, java.lang.String, java.lang.String):androidx.media3.common.ColorInfo");
    }

    public static String getCountryCode(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return an.L(networkCountryIso);
            }
        }
        return an.L(Locale.getDefault().getCountry());
    }

    public static Point getCurrentDisplayModeSize(Context context, Display display) throws ClassNotFoundException, NumberFormatException {
        if (display.getDisplayId() == 0 && isTv(context)) {
            String systemProperty = getSystemProperty("vendor.display-size");
            if (!TextUtils.isEmpty(systemProperty)) {
                try {
                    String[] strArrSplit = split(systemProperty.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e(TAG, "Invalid display size: ".concat(String.valueOf(systemProperty)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(DisplayStrings.DS_COMPANINIO_EXPERIMENTAL_BUBBLE_LABEL, DisplayStrings.DS_ALERT_TITLE_BLOCKED_LANE_RIGHT);
            }
        }
        Point point = new Point();
        getDisplaySize(display, point);
        return point;
    }

    public static Looper getCurrentOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static Uri getDataUriForString(String str, String str2) {
        return Uri.parse("data:" + str + ";base64," + Base64.encodeToString(str2.getBytes(), 2));
    }

    public static Locale getDefaultDisplayLocale() {
        return Locale.getDefault(Locale.Category.DISPLAY);
    }

    private static void getDisplaySize(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static Drawable getDrawable(Context context, Resources resources, int i2) {
        return resources.getDrawable(i2, context.getTheme());
    }

    public static UUID getDrmUuid(String str) {
        String strK = an.K(str);
        int iHashCode = strK.hashCode();
        if (iHashCode != -1860423953) {
            if (iHashCode != -1400551171) {
                if (iHashCode == 790309106 && strK.equals("clearkey")) {
                    return C.CLEARKEY_UUID;
                }
            } else if (strK.equals("widevine")) {
                return C.WIDEVINE_UUID;
            }
        } else if (strK.equals("playready")) {
            return C.PLAYREADY_UUID;
        }
        try {
            return UUID.fromString(str);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static String getEncodingString(int i2) {
        if (i2 == -1) {
            return "unset";
        }
        if (i2 == 0) {
            return "invalid";
        }
        if (i2 == 30) {
            return "dts-uhd-p2";
        }
        if (i2 == 31) {
            return "dsd";
        }
        if (i2 == 268435456) {
            return "pcm-16be";
        }
        if (i2 == 1073741824) {
            return "aac-er-bsac";
        }
        if (i2 == 1342177280) {
            return "pcm-24be";
        }
        if (i2 == 1610612736) {
            return "pcm-32be";
        }
        if (i2 == 1879048192) {
            return "pcm-double";
        }
        if (i2 == 1895825408) {
            return "pcm-float-be";
        }
        if (i2 == 1912602624) {
            return "pcm-double-be";
        }
        switch (i2) {
            case 2:
                return "pcm-16";
            case 3:
                return "pcm-8";
            case 4:
                return "pcm-float";
            case 5:
                return "ac3";
            case 6:
                return "eac3";
            case 7:
                return "dts";
            case 8:
                return "dts-hd";
            case 9:
                return "mp3";
            case 10:
                return "aac-lc";
            case 11:
                return "aac-he-v1";
            case 12:
                return "aac-he-v2";
            default:
                switch (i2) {
                    case 14:
                        return "truehd";
                    case 15:
                        return "aac-eld";
                    case 16:
                        return "aac-xhe";
                    case 17:
                        return "ac4";
                    case 18:
                        return "eac3-joc";
                    default:
                        switch (i2) {
                            case 20:
                                return "opus";
                            case 21:
                                return "pcm-24";
                            case 22:
                                return "pcm-32";
                            default:
                                return "unknown(" + i2 + ")";
                        }
                }
        }
    }

    public static int getErrorCodeForMediaDrmErrorCode(int i2) {
        if (i2 == 2 || i2 == 4) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i2 == 10) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i2 == 7) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i2 == 8) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        switch (i2) {
            case 15:
                return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
            case 16:
            case 18:
                return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        int i2 = 0;
        if (str == null || (length = (strArrSplit = split(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            an.B(str2);
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static int getFloatPcmEncoding(int i2, ByteOrder byteOrder) {
        if (i2 != 32) {
            if (i2 != 64) {
                return 0;
            }
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? C.ENCODING_PCM_DOUBLE : C.ENCODING_PCM_DOUBLE_BIG_ENDIAN;
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return 4;
        }
        return C.ENCODING_PCM_FLOAT_BIG_ENDIAN;
    }

    public static String getFormatSupportString(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_SUBTYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static int getInt24(ByteBuffer byteBuffer, int i2) {
        byte b2 = byteBuffer.get(byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : i2 + 2);
        byte b3 = byteBuffer.get(i2 + 1);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            i2 += 2;
        }
        return (((byteBuffer.get(i2) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (((b2 << StylePropertiesKt.TranslationXId) & (-16777216)) | ((b3 << StylePropertiesKt.BottomId) & 16711680))) >> 8;
    }

    public static int getIntegerCodeForString(String str) {
        int length = str.length();
        an.l(length <= 4);
        int iCharAt = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt << 8) | str.charAt(i2);
        }
        return iCharAt;
    }

    public static String getLocaleLanguageTag(Locale locale) {
        return locale.toLanguageTag();
    }

    public static int getMaxPendingFramesCountForMediaCodecDecoders(Context context) {
        return isFrameDropAllowedOnSurfaceInput(context) ? 1 : 5;
    }

    public static long getMediaDurationForPlayoutDuration(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long getNowUnixTimeMs(long j2) {
        return j2 == C.TIME_UNSET ? System.currentTimeMillis() : android.os.SystemClock.elapsedRealtime() + j2;
    }

    public static int getPcmEncoding(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 21;
            }
            return C.ENCODING_PCM_24BIT_BIG_ENDIAN;
        }
        if (i2 != 32) {
            return 0;
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return 22;
        }
        return C.ENCODING_PCM_32BIT_BIG_ENDIAN;
    }

    public static Format getPcmFormat(int i2, int i3, int i4) {
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(MimeTypes.AUDIO_RAW);
        builder.setChannelCount(i3);
        builder.setSampleRate(i4);
        builder.setPcmEncoding(i2);
        return builder.build();
    }

    public static int getPcmFrameSize(int i2, int i3) {
        return getByteDepth(i2) * i3;
    }

    public static long getPlayoutDurationForMediaDuration(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static List<String> getRoleFlagStrings(int i2) {
        ArrayList arrayList = new ArrayList();
        if ((i2 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i2 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i2 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i2 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i2 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i2 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i2 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i2 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i2 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i2 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i2 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i2 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i2 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i2 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i2 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static List<String> getSelectionFlagStrings(int i2) {
        ArrayList arrayList = new ArrayList();
        if ((i2 & 4) != 0) {
            arrayList.add(TtmlNode.TEXT_EMPHASIS_AUTO);
        }
        if ((i2 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    @Deprecated
    public static int getStreamTypeForAudioUsage(int i2) {
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static String getStringForTime(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == C.TIME_UNSET) {
            j2 = 0;
        }
        long jAbs = Math.abs(j2) + 500;
        sb.setLength(0);
        String str = j2 < 0 ? "-" : "";
        long j3 = jAbs / 1000;
        long j4 = j3 / 3600;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 % 60;
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j6)).toString();
    }

    public static String[] getSystemLanguageCodes() {
        String[] systemLocales = getSystemLocales();
        for (int i2 = 0; i2 < systemLocales.length; i2++) {
            systemLocales[i2] = normalizeLanguageCode(systemLocales[i2]);
        }
        return systemLocales;
    }

    private static String[] getSystemLocales() {
        return getSystemLocalesV24(Resources.getSystem().getConfiguration());
    }

    private static String[] getSystemLocalesV24(Configuration configuration) {
        return split(configuration.getLocales().toLanguageTags(), ",");
    }

    public static String getSystemProperty(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            Log.e(TAG, "Failed to read system property ".concat(String.valueOf(str)), e2);
            return null;
        }
    }

    public static String getTrackTypeString(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return EnvironmentCompat.MEDIA_UNKNOWN;
            case 0:
                return "default";
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i2 < 10000) {
                    return "?";
                }
                return "custom (" + i2 + ")";
        }
    }

    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + DomExceptionUtils.SEPARATOR + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") AndroidXMedia3/1.11.0-alpha01";
    }

    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] gzip(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static boolean handlePauseButtonAction(Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        player.pause();
        return true;
    }

    public static boolean handlePlayButtonAction(Player player) {
        boolean z = false;
        if (player == null) {
            return false;
        }
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            if (player.isCommandAvailable(2)) {
                player.prepare();
                z = true;
            }
        } else if (playbackState == 4 && player.isCommandAvailable(4)) {
            player.seekToDefaultPosition();
            z = true;
        }
        if (!player.isCommandAvailable(1)) {
            return z;
        }
        player.play();
        return true;
    }

    public static boolean handlePlayPauseButtonAction(Player player, boolean z) {
        return shouldShowPlayButton(player, z) ? handlePlayButtonAction(player) : handlePauseButtonAction(player);
    }

    public static <T> void ignoreFuture(Future<T> future) {
    }

    public static int inferContentType(Uri uri) {
        int iInferContentTypeForExtension;
        String scheme = uri.getScheme();
        if (scheme != null && (an.M("rtsp", scheme) || an.M("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iInferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iInferContentTypeForExtension;
        }
        Pattern pattern = ISM_PATH_PATTERN;
        String path = uri.getPath();
        an.B(path);
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains(ISM_DASH_FORMAT_EXTENSION)) {
                return 0;
            }
            if (strGroup.contains(ISM_HLS_FORMAT_EXTENSION)) {
                return 2;
            }
        }
        return 1;
    }

    public static int inferContentTypeForExtension(String str) {
        String strK = an.K(str);
        switch (strK.hashCode()) {
            case 104579:
                return strK.equals("ism") ? 1 : 4;
            case 108321:
                return strK.equals("mpd") ? 0 : 4;
            case 3242057:
                return strK.equals("isml") ? 1 : 4;
            case 3299913:
                return strK.equals("m3u8") ? 2 : 4;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        switch (str.hashCode()) {
            case -979127466:
                return str.equals(MimeTypes.APPLICATION_M3U8) ? 2 : 4;
            case -156749520:
                return str.equals(MimeTypes.APPLICATION_SS) ? 1 : 4;
            case 64194685:
                return str.equals(MimeTypes.APPLICATION_MPD) ? 0 : 4;
            case 1154777587:
                return str.equals(MimeTypes.APPLICATION_RTSP) ? 3 : 4;
            default:
                return 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r4.setLimit(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean inflate(androidx.media3.common.util.ParsableByteArray r3, androidx.media3.common.util.ParsableByteArray r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.bytesLeft()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.capacity()
            int r2 = r3.bytesLeft()
            if (r0 >= r2) goto L1a
            int r0 = r3.bytesLeft()
            int r0 = r0 + r0
            r4.ensureCapacity(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.getData()
            int r2 = r3.getPosition()
            int r3 = r3.bytesLeft()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.getData()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r4.capacity()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L4a
            r4.setLimit(r3)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            r1 = 1
            goto L6b
        L4a:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 != 0) goto L6b
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L57
            goto L6b
        L57:
            int r0 = r4.capacity()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r3 != r0) goto L31
            int r0 = r4.capacity()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r0 = r0 + r0
            r4.ensureCapacity(r0)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            goto L31
        L66:
            r3 = move-exception
            r5.reset()
            throw r3
        L6b:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.inflate(androidx.media3.common.util.ParsableByteArray, androidx.media3.common.util.ParsableByteArray, java.util.zip.Inflater):boolean");
    }

    public static String intToStringMaxRadix(int i2) {
        return Integer.toString(i2, 36);
    }

    private static boolean isAppSpecificStorageFileUri(Activity activity, Uri uri) throws IOException {
        try {
            String path = uri.getPath();
            if (path == null) {
                return false;
            }
            String canonicalPath = new File(path).getCanonicalPath();
            String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            String canonicalPath3 = null;
            File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                canonicalPath3 = externalFilesDir.getCanonicalPath();
            }
            if (canonicalPath.startsWith(canonicalPath2)) {
                return true;
            }
            if (canonicalPath3 != null) {
                if (canonicalPath.startsWith(canonicalPath3)) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isAutomotive(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean isBitmapFactorySupportedMimeType(String str) {
        switch (str.hashCode()) {
            case -1487656890:
                if (!str.equals(MimeTypes.IMAGE_AVIF) || Build.VERSION.SDK_INT < 34) {
                }
                break;
            case -1487464693:
                if (str.equals(MimeTypes.IMAGE_HEIC)) {
                }
                break;
            case -1487464690:
                if (str.equals(MimeTypes.IMAGE_HEIF)) {
                }
                break;
            case -1487394660:
                if (str.equals(MimeTypes.IMAGE_JPEG)) {
                }
                break;
            case -1487018032:
                if (str.equals(MimeTypes.IMAGE_WEBP)) {
                }
                break;
            case -879272239:
                if (str.equals(MimeTypes.IMAGE_BMP)) {
                }
                break;
            case -879258763:
                if (str.equals(MimeTypes.IMAGE_PNG)) {
                }
                break;
        }
        return true;
    }

    public static boolean isEncodingHighResolutionPcm(int i2) {
        return i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1895825408 || i2 == 1879048192 || i2 == 1912602624;
    }

    public static boolean isEncodingLinearPcm(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1895825408 || i2 == 1879048192 || i2 == 1912602624;
    }

    public static boolean isFrameDropAllowedOnSurfaceInput(Context context) {
        if (context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (Build.VERSION.SDK_INT == 30 && (an.M(Build.MODEL, "moto g(20)") || an.M(Build.MODEL, "rmx3231"))) {
            return true;
        }
        return Build.VERSION.SDK_INT == 34 && an.M(Build.MODEL, "sm-x200");
    }

    public static boolean isLinebreak(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || Objects.equals(scheme, "file");
    }

    private static boolean isMediaStoreExternalContentUri(Uri uri) {
        if (!Objects.equals(uri.getScheme(), "content") || !Objects.equals(uri.getAuthority(), "media")) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        return "external".equals(str) || "external_primary".equals(str);
    }

    private static boolean isReadStoragePermissionRequestNeeded(Activity activity, Uri uri) {
        return isLocalFileUri(uri) ? !isAppSpecificStorageFileUri(activity, uri) : isMediaStoreExternalContentUri(uri);
    }

    public static boolean isRunningOnEmulator() {
        String strK = an.K(Build.DEVICE);
        return strK.contains("emulator") || strK.contains("emu64a") || strK.contains("emu64x") || strK.contains("generic") || strK.contains("vsoc");
    }

    public static boolean isSorted(long[] jArr) {
        int i2 = 0;
        while (i2 < jArr.length - 1) {
            long j2 = jArr[i2];
            i2++;
            if (j2 > jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isTrafficRestricted(Uri uri) {
        if (!ProxyConfig.MATCH_HTTP.equals(uri.getScheme())) {
            return false;
        }
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        String host = uri.getHost();
        an.B(host);
        return !networkSecurityPolicy.isCleartextTrafficPermitted(host);
    }

    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean isWear(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    static /* synthetic */ Thread lambda$newSingleThreadExecutor$0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    static /* synthetic */ Thread lambda$newSingleThreadScheduledExecutor$0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    static /* synthetic */ void lambda$postOrRunWithCompletion$0(bv bvVar, Runnable runnable, Object obj) {
        try {
            if (bvVar.isCancelled()) {
                return;
            }
            runnable.run();
            bvVar.c(obj);
        } catch (Throwable th) {
            bvVar.d(th);
        }
    }

    static /* synthetic */ void lambda$transformFutureAsync$0(bv bvVar, bm bmVar) {
        if (bvVar.isCancelled()) {
            bmVar.cancel(false);
        }
    }

    static /* synthetic */ void lambda$transformFutureAsync$1(bm bmVar, bv bvVar, ag agVar) {
        try {
            try {
                bvVar.e(agVar.apply(bd.o(bmVar)));
            } catch (Throwable th) {
                bvVar.d(th);
            }
        } catch (Error e2) {
            e = e2;
            bvVar.d(e);
        } catch (CancellationException unused) {
            bvVar.cancel(false);
        } catch (RuntimeException e3) {
            e = e3;
            bvVar.d(e);
        } catch (ExecutionException e4) {
            e = e4;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            bvVar.d(e);
        }
    }

    public static int linearSearch(long[] jArr, long j2) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (jArr[i2] == j2) {
                return i2;
            }
        }
        return -1;
    }

    public static String loadAsset(Context context, String str) throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                String strFromUtf8Bytes = fromUtf8Bytes(h.b(inputStreamOpen));
                closeQuietly(inputStreamOpen);
                return strFromUtf8Bytes;
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(inputStreamOpen);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
    }

    public static String loadRawResource(Context context, int i2) throws Throwable {
        Throwable th;
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = context.getResources().openRawResource(i2);
            try {
                String strFromUtf8Bytes = fromUtf8Bytes(h.b(inputStreamOpenRawResource));
                closeQuietly(inputStreamOpenRawResource);
                return strFromUtf8Bytes;
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenRawResource = null;
        }
    }

    public static long maxValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMax = Long.MIN_VALUE;
        for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
            jMax = Math.max(jMax, sparseLongArray.valueAt(i2));
        }
        return jMax;
    }

    public static boolean maybeInflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, Inflater inflater) {
        return parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 120 && inflate(parsableByteArray, parsableByteArray2, inflater);
    }

    private static String maybeReplaceLegacyLanguageTags(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = isoLegacyTagReplacements;
            if (i2 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i2])) {
                return String.valueOf(strArr[i2 + 1]).concat(String.valueOf(str.substring(strArr[i2].length())));
            }
            i2 += 2;
        }
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (maybeRequestReadStoragePermission(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static boolean maybeRequestReadStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (maybeRequestReadStoragePermission(activity, localConfiguration.uri)) {
                    return true;
                }
                bn<MediaItem.SubtitleConfiguration> bnVar = mediaItem.localConfiguration.subtitleConfigurations;
                for (int i2 = 0; i2 < bnVar.size(); i2++) {
                    if (maybeRequestReadStoragePermission(activity, bnVar.get(i2).uri)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
            jMin = Math.min(jMin, sparseLongArray.valueAt(i2));
        }
        return jMin;
    }

    public static <T> void moveItems(List<T> list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i5 = i3 - i2;
        while (true) {
            i5--;
            if (i5 < 0) {
                list.addAll(Math.min(i4, list.size()), arrayDeque);
                return;
            }
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
    }

    public static long msToUs(long j2) {
        return (j2 == C.TIME_UNSET || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static ExecutorService newSingleThreadExecutor(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.lambda$newSingleThreadExecutor$0(str, runnable);
            }
        });
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.lambda$newSingleThreadScheduledExecutor$0(str, runnable);
            }
        });
    }

    public static String normalizeLanguageCode(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String strK = an.K(str);
        String str2 = splitAtFirst(strK, "-")[0];
        HashMap<String, String> mapCreateIsoLanguageReplacementMap = languageTagReplacementMap;
        if (mapCreateIsoLanguageReplacementMap == null) {
            mapCreateIsoLanguageReplacementMap = createIsoLanguageReplacementMap();
            languageTagReplacementMap = mapCreateIsoLanguageReplacementMap;
        }
        String str3 = mapCreateIsoLanguageReplacementMap.get(str2);
        if (str3 != null) {
            strK = str3.concat(String.valueOf(strK.substring(str2.length())));
            str2 = str3;
        }
        return ("no".equals(str2) || CmcdData.OBJECT_TYPE_INIT_SEGMENT.equals(str2) || "zh".equals(str2)) ? maybeReplaceLegacyLanguageTags(strK) : strK;
    }

    public static long nsToMs(long j2) {
        return (j2 == C.TIME_UNSET || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000000;
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        return tArr2;
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i2) {
        an.l(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i2, int i3) {
        an.l(i2 >= 0);
        an.l(i3 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i2, i3);
    }

    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
        an.u(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static long parseXsDateTime(String str) throws ParserException {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedContainer("Invalid date/time format: ".concat(String.valueOf(str)), null);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int i3 = Integer.parseInt(matcher.group(12)) * 60;
            String strGroup = matcher.group(13);
            if (strGroup != null) {
                i3 += Integer.parseInt(strGroup);
            }
            i2 = i3;
            if ("-".equals(matcher.group(11))) {
                i2 = -i2;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0.".concat(String.valueOf(matcher.group(8)))).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (i2 * 60000) : timeInMillis;
    }

    public static long parseXsDuration(String str) throws NumberFormatException {
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d3 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d4 = d3 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d5 = d4 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d7 = d6 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        if (strGroup6 != null) {
            d2 = Double.parseDouble(strGroup6);
        }
        long j2 = (long) ((d7 + d2) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    public static float percentFloat(long j2, long j3) {
        if (j3 != 0 && j2 == j3) {
            return 100.0f;
        }
        return (j2 / j3) * 100.0f;
    }

    public static int percentInt(long j2, long j3) {
        long jF = e.f(j2, 100L);
        return j.k((jF == Long.MAX_VALUE || jF == Long.MIN_VALUE) ? j2 / (j3 / 100) : jF / j3);
    }

    public static boolean postOrRun(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static <T> bm<T> postOrRunWithCompletion(Handler handler, final Runnable runnable, final T t) {
        final bv bvVarF = bv.f();
        postOrRun(handler, new Runnable() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Util.lambda$postOrRunWithCompletion$0(bvVarF, runnable, t);
            }
        });
        return bvVarF;
    }

    public static void putInt24(ByteBuffer byteBuffer, int i2) {
        an.q(((-16777216) & i2) == 0 || (i2 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
        an.l(byteBuffer.remaining() >= 3);
        byte b2 = (byte) (byteBuffer.order() == ByteOrder.BIG_ENDIAN ? (i2 >> 16) & 255 : i2 & 255);
        int i3 = (i2 >> 8) & 255;
        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
            i2 >>= 16;
        }
        byteBuffer.put(b2).put((byte) i3).put((byte) (i2 & 255));
    }

    public static boolean readBoolean(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    public static Intent registerReceiverNotExported(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static <T> void removeRange(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    private static boolean requestExternalStoragePermission(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    private static boolean requestReadMediaPermissions(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    public static long sampleCountToDurationUs(long j2, int i2) {
        return scaleLargeValue(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long scaleLargeTimestamp(long j2, long j3, long j4) {
        return scaleLargeValue(j2, j3, j4, RoundingMode.DOWN);
    }

    public static long[] scaleLargeTimestamps(List<Long> list, long j2, long j3) {
        return scaleLargeValues(list, j2, j3, RoundingMode.DOWN);
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j2, long j3) {
        scaleLargeValuesInPlace(jArr, j2, j3, RoundingMode.DOWN);
    }

    public static long scaleLargeValue(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (j4 < j2 || j4 % j2 != 0) ? (j4 >= j2 || j2 % j4 != 0) ? scaleLargeValueFallback(j2, j3, j4, roundingMode) : e.f(j3, e.c(j2, j4, RoundingMode.UNNECESSARY)) : e.c(j3, e.c(j4, j2, RoundingMode.UNNECESSARY), roundingMode) : e.f(j2, e.c(j3, j4, RoundingMode.UNNECESSARY)) : e.c(j2, e.c(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
    }

    private static long scaleLargeValueFallback(long j2, long j3, long j4, RoundingMode roundingMode) {
        long jF = e.f(j2, j3);
        if (jF != Long.MAX_VALUE && jF != Long.MIN_VALUE) {
            return e.c(jF, j4, roundingMode);
        }
        long jD = e.d(Math.abs(j3), Math.abs(j4));
        long jC = e.c(j3, jD, RoundingMode.UNNECESSARY);
        long jC2 = e.c(j4, jD, RoundingMode.UNNECESSARY);
        long jD2 = e.d(Math.abs(j2), Math.abs(jC2));
        long jC3 = e.c(j2, jD2, RoundingMode.UNNECESSARY);
        long jC4 = e.c(jC2, jD2, RoundingMode.UNNECESSARY);
        long jF2 = e.f(jC3, jC);
        if (jF2 != Long.MAX_VALUE && jF2 != Long.MIN_VALUE) {
            return e.c(jF2, jC4, roundingMode);
        }
        double d2 = jC3 * (jC / jC4);
        if (d2 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d2 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return b.b(d2, roundingMode);
    }

    public static long[] scaleLargeValues(List<Long> list, long j2, long j3, RoundingMode roundingMode) {
        long j4 = j2;
        long j5 = j3;
        RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j4 != 0) {
            int i2 = 0;
            if (j5 >= j4 && j5 % j4 == 0) {
                long jC = e.c(j5, j4, RoundingMode.UNNECESSARY);
                while (i2 < size) {
                    jArr[i2] = e.c(list.get(i2).longValue(), jC, roundingMode2);
                    i2++;
                }
            } else if (j5 >= j4 || j4 % j5 != 0) {
                int i3 = 0;
                while (i3 < size) {
                    long jLongValue = list.get(i3).longValue();
                    if (jLongValue != 0) {
                        if (j5 >= jLongValue && j5 % jLongValue == 0) {
                            jArr[i3] = e.c(j4, e.c(j5, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j5 >= jLongValue || jLongValue % j5 != 0) {
                            jArr[i3] = scaleLargeValueFallback(jLongValue, j4, j5, roundingMode2);
                        } else {
                            jArr[i3] = e.f(j4, e.c(jLongValue, j5, RoundingMode.UNNECESSARY));
                        }
                    }
                    i3++;
                    j4 = j2;
                    j5 = j3;
                    roundingMode2 = roundingMode;
                }
            } else {
                long jC2 = e.c(j4, j5, RoundingMode.UNNECESSARY);
                while (i2 < size) {
                    jArr[i2] = e.f(list.get(i2).longValue(), jC2);
                    i2++;
                }
            }
        }
        return jArr;
    }

    public static void scaleLargeValuesInPlace(long[] jArr, long j2, long j3, RoundingMode roundingMode) {
        long j4 = j3;
        RoundingMode roundingMode2 = roundingMode;
        if (j2 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i2 = 0;
        if (j4 >= j2 && j4 % j2 == 0) {
            long jC = e.c(j4, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = e.c(jArr[i2], jC, roundingMode2);
                i2++;
            }
            return;
        }
        if (j4 < j2 && j2 % j4 == 0) {
            long jC2 = e.c(j2, j4, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = e.f(jArr[i2], jC2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j5 = jArr[i3];
            if (j5 != 0) {
                if (j4 >= j5 && j4 % j5 == 0) {
                    jArr[i3] = e.c(j2, e.c(j4, j5, RoundingMode.UNNECESSARY), roundingMode2);
                } else if (j4 >= j5 || j5 % j4 != 0) {
                    jArr[i3] = scaleLargeValueFallback(j5, j2, j4, roundingMode2);
                } else {
                    jArr[i3] = e.f(j2, e.c(j5, j4, RoundingMode.UNNECESSARY));
                }
            }
            i3++;
            j4 = j3;
            roundingMode2 = roundingMode;
        }
    }

    public static void setForegroundServiceNotification(Service service, int i2, Notification notification, int i3, String str) {
        Api29.startForeground(service, i2, notification, i3, str);
    }

    public static boolean shouldEnablePlayPauseButton(Player player) {
        boolean z;
        if (player == null) {
            return false;
        }
        int playbackState = player.getPlaybackState();
        boolean z2 = (player.isCommandAvailable(16) && player.getCurrentMediaItem() == null) ? false : true;
        boolean zIsCommandAvailable = player.isCommandAvailable(1);
        if (playbackState != 1) {
            z = false;
        } else if (player.isCommandAvailable(2)) {
            playbackState = 1;
            z = true;
        } else {
            z = false;
            playbackState = 1;
        }
        boolean z3 = playbackState == 4 && player.isCommandAvailable(4);
        if (z2) {
            return zIsCommandAvailable || z || z3;
        }
        return false;
    }

    private static boolean shouldEscapeCharacter(char c2) {
        return c2 == '\"' || c2 == '%' || c2 == '*' || c2 == '/' || c2 == ':' || c2 == '<' || c2 == '\\' || c2 == '|' || c2 == '>' || c2 == '?';
    }

    public static boolean shouldShowPlayButton(Player player, boolean z) {
        if (player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4) {
            return true;
        }
        return (!z || player.getPlaybackSuppressionReason() == 0 || player.getPlaybackSuppressionReason() == 4) ? false : true;
    }

    public static void sneakyThrow(Throwable th) throws Throwable {
        sneakyThrowInternal(th);
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th) throws Throwable {
        throw th;
    }

    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] splitCodecs(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    public static ComponentName startForegroundService(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }

    public static void stopForeground(Service service, boolean z) {
        Api24.stopForeground(service, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long subtractWithOverflowDefault(long r5, long r7, long r9) {
        /*
            long r0 = r5 ^ r7
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 < 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r4
        Ld:
            long r7 = r5 - r7
            long r5 = r5 ^ r7
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 < 0) goto L15
            goto L16
        L15:
            r1 = r4
        L16:
            r5 = r0 | r1
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r5 == 0) goto L21
            r5 = r7
            goto L29
        L21:
            r5 = 63
            long r5 = r7 >>> r5
            r2 = 1
            long r5 = r5 ^ r2
            long r5 = r5 + r0
        L29:
            r2 = -9223372036854775808
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto L34
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L3c
            r7 = r2
        L34:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L3e
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 == 0) goto L3d
        L3c:
            return r9
        L3d:
            return r0
        L3e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.subtractWithOverflowDefault(long, long, long):long");
    }

    public static long sum(long... jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        return j2;
    }

    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i2 = 0;
        for (int i3 : iArr) {
            bArr[i2] = (byte) (i3 >> 24);
            bArr[i2 + 1] = (byte) (i3 >> 16);
            bArr[i2 + 2] = (byte) (i3 >> 8);
            bArr[i2 + 3] = (byte) i3;
            i2 += 4;
        }
        return bArr;
    }

    public static String toFourccString(int i2) {
        return new String(j.n(i2), StandardCharsets.US_ASCII);
    }

    public static String toHexString(byte[] bArr, int i2, int i3) {
        return f.l().g().p(bArr, i2, i3);
    }

    public static long toLong(int i2, int i3) {
        return toUnsignedLong(i3) | (toUnsignedLong(i2) << 32);
    }

    public static int toUnsignedInt(long j2) {
        an.u(j2 <= MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return (int) j2;
    }

    public static long toUnsignedLong(int i2) {
        return i2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
    }

    public static <T, U> bm<T> transformFutureAsync(final bm<U> bmVar, final ag<U, T> agVar) {
        final bv bvVarF = bv.f();
        bvVarF.addListener(new Runnable() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Util.lambda$transformFutureAsync$0(bvVarF, bmVar);
            }
        }, cf.y());
        bmVar.addListener(new Runnable() { // from class: androidx.media3.common.util.Util$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Util.lambda$transformFutureAsync$1(bmVar, bvVarF, agVar);
            }
        }, cf.y());
        return bvVarF;
    }

    public static String unescapeFileName(String str) {
        int length = str.length();
        int iEnd = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 + i2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i2 > 0 && matcher.find()) {
            String strGroup = matcher.group(1);
            an.B(strGroup);
            char c2 = (char) Integer.parseInt(strGroup, 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c2);
            iEnd = matcher.end();
            i2--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    public static long usToMs(long j2) {
        return (j2 == C.TIME_UNSET || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static void writeBoolean(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static int ceilDivide(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static String fromUtf8Bytes(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, StandardCharsets.UTF_8);
    }

    public static float constrainValue(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    public static int constrainValue(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long constrainValue(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    public static boolean handlePlayPauseButtonAction(Player player) {
        return handlePlayPauseButtonAction(player, true);
    }

    public static int linearSearch(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static boolean contains(SparseBooleanArray sparseBooleanArray, int i2) {
        return sparseBooleanArray.indexOfKey(i2) >= 0;
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        return maybeRequestReadStoragePermission(activity, mediaItemArr);
    }

    public static boolean contains(SparseIntArray sparseIntArray, int i2) {
        return sparseIntArray.indexOfKey(i2) >= 0;
    }

    public static <T> boolean contains(SparseArray<T> sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static Format getPcmFormat(AudioProcessor.AudioFormat audioFormat) {
        return getPcmFormat(audioFormat.encoding, audioFormat.channelCount, audioFormat.sampleRate);
    }

    public static boolean postOrRun(HandlerWrapper handlerWrapper, Runnable runnable) {
        Looper looper = handlerWrapper.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handlerWrapper.post(runnable);
    }

    public static int getFloatPcmEncoding(int i2) {
        return getFloatPcmEncoding(i2, ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean shouldShowPlayButton(Player player) {
        return shouldShowPlayButton(player, true);
    }

    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) {
        return h.b(inputStream);
    }

    public static byte[] toByteArray(float f2) {
        return j.n(Float.floatToIntBits(f2));
    }

    public static int binarySearchCeil(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = ~iBinarySearch;
        } else {
            while (true) {
                i3 = iBinarySearch + 1;
                if (i3 >= iArr.length || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.min(iArr.length - 1, i4) : i4;
    }

    public static int binarySearchCeil(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= jArr.length || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.min(jArr.length - 1, i3) : i3;
    }

    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    private static boolean maybeRequestReadStoragePermission(Activity activity, Uri uri) {
        if (!isReadStoragePermissionRequestNeeded(activity, uri)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            return requestExternalStoragePermission(activity);
        }
        return requestReadMediaPermissions(activity);
    }

    public static int binarySearchFloor(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static int binarySearchFloor(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static int getPcmEncoding(int i2) {
        return getPcmEncoding(i2, ByteOrder.LITTLE_ENDIAN);
    }

    public static int getAudioTrackChannelConfig(Format format) {
        int i2 = format.channelMask;
        return i2 != -1 ? i2 : getAudioTrackChannelConfig(format.channelCount);
    }

    @Deprecated
    public static int inferContentType(Uri uri, String str) {
        if (TextUtils.isEmpty(str)) {
            return inferContentType(uri);
        }
        return inferContentTypeForExtension(str);
    }

    @Deprecated
    public static int inferContentType(String str) {
        return inferContentType(Uri.parse("file:///".concat(String.valueOf(str))));
    }

    public static String getStringForTime(long j2) {
        StringBuilder sb = new StringBuilder();
        return getStringForTime(sb, new Formatter(sb, Locale.getDefault()), j2);
    }

    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            an.B(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }
}
