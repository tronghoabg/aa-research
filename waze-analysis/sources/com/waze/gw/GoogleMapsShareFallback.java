package com.waze.gw;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.AudioStats;
import androidx.webkit.ProxyConfig;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
final class GoogleMapsShareFallback {
    private static final int CONNECT_TIMEOUT_MS = 5000;
    private static final int MAX_REDIRECTS = 6;
    private static final long PENDING_TTL_MS = 20000;
    private static final int READ_TIMEOUT_MS = 5000;
    private static final String TAG = "WazeGW.Share";
    private static long generation;
    private static boolean launched;
    private static long receivedAt;
    private static boolean searchReturnedEmpty;
    private static final Object LOCK = new Object();
    private static final Pattern WEB_URL = Pattern.compile("https://[^\\s<>\\\"']+", 2);
    private static final Pattern AT_COORDINATES = Pattern.compile("/@(-?\\d{1,2}(?:\\.\\d+)?),(-?\\d{1,3}(?:\\.\\d+)?)", 2);
    private static final Pattern DATA_COORDINATES = Pattern.compile("!3d(-?\\d{1,2}(?:\\.\\d+)?)!4d(-?\\d{1,3}(?:\\.\\d+)?)", 2);
    private static final Pattern QUERY_COORDINATES = Pattern.compile("(?:^|[?&])(?:query|destination|q|ll)=(-?\\d{1,2}(?:\\.\\d+)?)[,\\s]+(-?\\d{1,3}(?:\\.\\d+)?)(?:$|[&#])", 2);
    private static double latitude = Double.NaN;
    private static double longitude = Double.NaN;

    private GoogleMapsShareFallback() {
    }

    static void onSharedText(String str) {
        final String strExtractGoogleMapsUrl = extractGoogleMapsUrl(str);
        synchronized (LOCK) {
            final long j2 = generation + 1;
            generation = j2;
            receivedAt = SystemClock.elapsedRealtime();
            searchReturnedEmpty = false;
            launched = false;
            latitude = Double.NaN;
            longitude = Double.NaN;
            if (strExtractGoogleMapsUrl == null) {
                receivedAt = 0L;
                return;
            }
            Log.i(TAG, "Accepted Google Maps share; resolving coordinate in background");
            Thread thread = new Thread(new Runnable() { // from class: com.waze.gw.GoogleMapsShareFallback.1
                @Override // java.lang.Runnable
                public void run() {
                    double[] dArrResolve;
                    try {
                        dArrResolve = GoogleMapsShareFallback.resolve(strExtractGoogleMapsUrl);
                    } catch (Throwable th) {
                        Log.w(GoogleMapsShareFallback.TAG, "Google Maps coordinate resolution failed", th);
                        dArrResolve = null;
                    }
                    if (dArrResolve == null) {
                        Log.i(GoogleMapsShareFallback.TAG, "Google Maps share contained no usable coordinate");
                        return;
                    }
                    Log.i(GoogleMapsShareFallback.TAG, "Google Maps coordinate resolved");
                    synchronized (GoogleMapsShareFallback.LOCK) {
                        if (j2 == GoogleMapsShareFallback.generation && !GoogleMapsShareFallback.expiredLocked()) {
                            GoogleMapsShareFallback.latitude = dArrResolve[0];
                            GoogleMapsShareFallback.longitude = dArrResolve[1];
                            boolean z = GoogleMapsShareFallback.searchReturnedEmpty && !GoogleMapsShareFallback.launched;
                            if (z) {
                                GoogleMapsShareFallback.launched = true;
                            }
                            if (z) {
                                GoogleMapsShareFallback.openPreview(dArrResolve[0], dArrResolve[1], j2);
                            }
                        }
                    }
                }
            }, "WazeGW-GMapsResolve");
            thread.setDaemon(true);
            thread.start();
        }
    }

    static void onSearchResultsEmpty() {
        synchronized (LOCK) {
            if (receivedAt != 0 && !expiredLocked() && !launched) {
                searchReturnedEmpty = true;
                Log.i(TAG, "Waze returned no result for the active Google Maps share");
                if (validCoordinate(latitude, longitude)) {
                    launched = true;
                    long j2 = generation;
                    openPreview(latitude, longitude, j2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean expiredLocked() {
        return receivedAt == 0 || SystemClock.elapsedRealtime() - receivedAt > 20000;
    }

    private static String extractGoogleMapsUrl(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Matcher matcher = WEB_URL.matcher(str);
        while (matcher.find()) {
            String strTrimUrlPunctuation = trimUrlPunctuation(matcher.group());
            if (isAllowedMapsUrl(new URL(strTrimUrlPunctuation), true)) {
                return strTrimUrlPunctuation;
            }
        }
        return null;
    }

    private static String trimUrlPunctuation(String str) {
        int length = str.length();
        while (length > 0) {
            char cCharAt = str.charAt(length - 1);
            if (cCharAt != '.' && cCharAt != ',' && cCharAt != ';' && cCharAt != ')' && cCharAt != ']' && cCharAt != '}') {
                break;
            }
            length--;
        }
        return str.substring(0, length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r0 = r5.getURL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (isAllowedMapsUrl(r0, false) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r5.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        r10 = parseCoordinates(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        r5.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double[] resolve(java.lang.String r10) throws java.lang.Exception {
        /*
            java.net.URL r0 = new java.net.URL
            r0.<init>(r10)
            r10 = 0
            r1 = 0
        L7:
            r2 = 6
            r3 = 0
            if (r1 > r2) goto Lb4
            if (r1 != 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            boolean r2 = isAllowedMapsUrl(r0, r2)
            if (r2 != 0) goto L17
            return r3
        L17:
            java.lang.String r2 = r0.toString()
            double[] r2 = parseCoordinates(r2)
            if (r2 == 0) goto L22
            return r2
        L22:
            java.net.URLConnection r2 = r0.openConnection()     // Catch: java.lang.Throwable -> Lac
            r5 = r2
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> Lac
            r5.setInstanceFollowRedirects(r10)     // Catch: java.lang.Throwable -> La8
            r2 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> La8
            r5.setReadTimeout(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "GET"
            r5.setRequestMethod(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "User-Agent"
            java.lang.String r4 = "Mozilla/5.0 (Android) WazeMod"
            r5.setRequestProperty(r2, r4)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "Accept"
            java.lang.String r4 = "text/html,application/xhtml+xml"
            r5.setRequestProperty(r2, r4)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "google-maps-resolve"
            com.waze.gw.DiagnosticsLogger.networkStart(r2, r5)     // Catch: java.lang.Throwable -> La8
            int r6 = r5.getResponseCode()     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = "google-maps-resolve"
            r7 = 0
            r9 = 0
            com.waze.gw.DiagnosticsLogger.networkEnd(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> La8
            r2 = 300(0x12c, float:4.2E-43)
            if (r6 < r2) goto L8a
            r2 = 400(0x190, float:5.6E-43)
            if (r6 >= r2) goto L8a
            java.lang.String r2 = "Location"
            java.lang.String r2 = r5.getHeaderField(r2)     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto L84
            int r4 = r2.length()     // Catch: java.lang.Throwable -> La8
            if (r4 != 0) goto L70
            goto L84
        L70:
            java.net.URI r0 = r0.toURI()     // Catch: java.lang.Throwable -> La8
            java.net.URI r0 = r0.resolve(r2)     // Catch: java.lang.Throwable -> La8
            java.net.URL r0 = r0.toURL()     // Catch: java.lang.Throwable -> La8
            if (r5 == 0) goto L81
            r5.disconnect()
        L81:
            int r1 = r1 + 1
            goto L7
        L84:
            if (r5 == 0) goto L89
            r5.disconnect()
        L89:
            return r3
        L8a:
            java.net.URL r0 = r5.getURL()     // Catch: java.lang.Throwable -> La8
            boolean r10 = isAllowedMapsUrl(r0, r10)     // Catch: java.lang.Throwable -> La8
            if (r10 != 0) goto L9a
            if (r5 == 0) goto L99
            r5.disconnect()
        L99:
            return r3
        L9a:
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> La8
            double[] r10 = parseCoordinates(r10)     // Catch: java.lang.Throwable -> La8
            if (r5 == 0) goto La7
            r5.disconnect()
        La7:
            return r10
        La8:
            r0 = move-exception
            r10 = r0
            r3 = r5
            goto Lae
        Lac:
            r0 = move-exception
            r10 = r0
        Lae:
            if (r3 == 0) goto Lb3
            r3.disconnect()
        Lb3:
            throw r10
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.GoogleMapsShareFallback.resolve(java.lang.String):double[]");
    }

    private static boolean isAllowedMapsUrl(URL url, boolean z) {
        String host;
        if (url == null || !ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(url.getProtocol()) || (host = url.getHost()) == null) {
            return false;
        }
        String lowerCase = host.toLowerCase(Locale.US);
        String path = url.getPath();
        if (path == null) {
            path = "";
        }
        if ("maps.app.goo.gl".equals(lowerCase)) {
            return true;
        }
        if ("goo.gl".equals(lowerCase)) {
            return path.startsWith("/maps/") || path.equals("/maps");
        }
        if ("maps.google.com".equals(lowerCase)) {
            return true;
        }
        if ("google.com".equals(lowerCase) || "www.google.com".equals(lowerCase)) {
            return path.startsWith("/maps") || (!z && path.startsWith("/url"));
        }
        return false;
    }

    private static double[] parseCoordinates(String str) {
        if (str == null) {
            return null;
        }
        try {
            str = URLDecoder.decode(str, "UTF-8");
        } catch (Throwable th) {
        }
        double[] dArrMatch = match(str, AT_COORDINATES);
        if (dArrMatch == null) {
            dArrMatch = match(str, DATA_COORDINATES);
        }
        return dArrMatch == null ? match(str, QUERY_COORDINATES) : dArrMatch;
    }

    private static double[] match(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        try {
            double d2 = Double.parseDouble(matcher.group(1));
            double d3 = Double.parseDouble(matcher.group(2));
            if (validCoordinate(d2, d3)) {
                return new double[]{d2, d3};
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean validCoordinate(double d2, double d3) {
        return !Double.isNaN(d2) && !Double.isNaN(d3) && d2 >= -90.0d && d2 <= 90.0d && d3 >= -180.0d && d3 <= 180.0d && !(d2 == AudioStats.AUDIO_AMPLITUDE_NONE && d3 == AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void openPreview(double d2, double d3, long j2) {
        synchronized (LOCK) {
            if (j2 == generation && !expiredLocked()) {
                try {
                    Context contextCurrentApplication = currentApplication();
                    if (contextCurrentApplication == null) {
                        return;
                    }
                    Class<?> cls = Class.forName("com.waze.MainActivity");
                    String str = String.format(Locale.US, "%.7f,%.7f", Double.valueOf(d2), Double.valueOf(d3));
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("waze://?ll=" + str));
                    intent.setClass(contextCurrentApplication, cls);
                    intent.addFlags(872415232);
                    contextCurrentApplication.startActivity(intent);
                    Log.i(TAG, "Opened Waze coordinate preview after empty shared search: " + str);
                    clear(j2);
                } catch (Throwable th) {
                    Log.w(TAG, "Unable to open Waze coordinate preview", th);
                    clear(j2);
                }
            }
        }
    }

    private static Context currentApplication() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }

    private static void clear(long j2) {
        synchronized (LOCK) {
            if (j2 != generation) {
                return;
            }
            receivedAt = 0L;
            searchReturnedEmpty = false;
            latitude = Double.NaN;
            longitude = Double.NaN;
        }
    }
}
