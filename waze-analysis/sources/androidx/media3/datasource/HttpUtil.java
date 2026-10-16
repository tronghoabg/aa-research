package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.util.Log;
import com.google.d.b.an;
import com.google.d.d.bs;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HttpUtil {
    private static final String TAG = "HttpUtil";
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    public static String buildRangeRequestHeader(long j2, long j3) {
        if (j2 == 0) {
            if (j3 == -1) {
                return null;
            }
            j2 = 0;
        }
        StringBuilder sb = new StringBuilder("bytes=");
        sb.append(j2);
        sb.append("-");
        if (j3 != -1) {
            sb.append((j2 + j3) - 1);
        }
        return sb.toString();
    }

    public static long getContentLength(String str, String str2) throws NumberFormatException {
        long j2 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j2 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                Log.e(TAG, "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j2;
        }
        Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
        if (!matcher.matches()) {
            return j2;
        }
        try {
            String strGroup = matcher.group(2);
            an.B(strGroup);
            String str3 = strGroup;
            long j3 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            an.B(strGroup2);
            String str4 = strGroup2;
            long j4 = (j3 - Long.parseLong(strGroup2)) + 1;
            if (j2 < 0) {
                return j4;
            }
            if (j2 == j4) {
                return j2;
            }
            Log.w(TAG, "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j2, j4);
        } catch (NumberFormatException unused2) {
            Log.e(TAG, "Unexpected Content-Range [" + str2 + "]");
            return j2;
        }
    }

    public static String getCookieHeader(String str, Map<String, List<String>> map, CookieHandler cookieHandler) throws IOException {
        List<String> list;
        if (cookieHandler == null) {
            return "";
        }
        Map<String, List<String>> mapF = bs.f();
        try {
            mapF = cookieHandler.get(new URI(str), map);
        } catch (Exception e2) {
            Log.w(TAG, "Failed to read cookies from CookieHandler", e2);
        }
        StringBuilder sb = new StringBuilder();
        if (mapF.containsKey("Cookie") && (list = mapF.get("Cookie")) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("; ");
            }
        }
        return HttpUtil$$ExternalSyntheticBackport0.m(sb.toString());
    }

    public static long getDocumentSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        an.B(strGroup);
        return Long.parseLong(strGroup);
    }

    public static void storeCookiesFromHeaders(String str, Map<String, List<String>> map, CookieHandler cookieHandler) throws IOException {
        if (cookieHandler == null) {
            return;
        }
        try {
            cookieHandler.put(new URI(str), map);
        } catch (Exception e2) {
            Log.w(TAG, "Failed to store cookies in CookieHandler", e2);
        }
    }
}
