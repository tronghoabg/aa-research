package com.waze.gw;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class RoadNoticeClient {
    private static final int CONNECT_TIMEOUT_MS = 10000;
    private static final String KEY_ETAG = "manifest_etag";
    private static final String KEY_LAST_CHECK = "last_check_ms";
    private static final String MANIFEST_PATH = "/api/v1/road-notices/manifest";
    private static final int MAX_DATABASE_BYTES = 67108864;
    private static final int MAX_MANIFEST_BYTES = 65536;
    private static final long POLL_MS = 21600000;
    private static final String PREFS = "waze_road_notice_client";
    private static final int READ_TIMEOUT_MS = 30000;
    private static final String TAG = "WazeGW-RoadData";
    private static volatile boolean bootScheduled;
    private static volatile RoadNoticeDatabase database;
    private static volatile boolean loaded;
    private static volatile boolean pollingStarted;
    private static final ScheduledExecutorService NETWORK = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.waze.gw.RoadNoticeClient.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "WazeGW-road-data");
            thread.setDaemon(true);
            return thread;
        }
    });
    private static final Object LOAD_LOCK = new Object();

    private RoadNoticeClient() {
    }

    static void start(Context context) {
        final Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext == null || bootScheduled) {
            return;
        }
        synchronized (RoadNoticeClient.class) {
            if (bootScheduled) {
                return;
            }
            bootScheduled = true;
            NETWORK.execute(new Runnable() { // from class: com.waze.gw.RoadNoticeClient.2
                @Override // java.lang.Runnable
                public void run() {
                    RoadNoticeClient.loadLocalOnce(applicationContext);
                    RoadNoticeClient.startPollingOnce(applicationContext);
                }
            });
        }
    }

    static RoadNoticeDatabase get(Context context) {
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (!loaded && applicationContext != null) {
            loadLocalOnce(applicationContext);
        }
        if (applicationContext != null) {
            startPollingOnce(applicationContext);
        }
        return database;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadLocalOnce(Context context) {
        String str;
        synchronized (LOAD_LOCK) {
            if (loaded) {
                return;
            }
            boolean zAvailable = RoadNoticeCrypto.available();
            RoadNoticeDatabase roadNoticeDatabaseLoadVerified = loadVerified(pair(context, "active"));
            if (roadNoticeDatabaseLoadVerified == null && (roadNoticeDatabaseLoadVerified = loadVerified(pair(context, "previous"))) != null) {
                Log.w(TAG, "using previous verified road database");
            }
            database = roadNoticeDatabaseLoadVerified;
            loaded = true;
            String str2 = zAvailable ? "Ed25519 ready; " : "Ed25519 unavailable; ";
            if (roadNoticeDatabaseLoadVerified == null) {
                str = "no verified local road database";
            } else {
                str = "loaded dataset=" + roadNoticeDatabaseLoadVerified.datasetVersion + " segments=" + roadNoticeDatabaseLoadVerified.segmentIds.length + " points=" + roadNoticeDatabaseLoadVerified.pointOffsets.length;
            }
            Log.i(TAG, str2 + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startPollingOnce(final Context context) {
        if (pollingStarted) {
            return;
        }
        synchronized (RoadNoticeClient.class) {
            if (pollingStarted) {
                return;
            }
            pollingStarted = true;
            long jCurrentTimeMillis = System.currentTimeMillis() - context.getSharedPreferences(PREFS, 0).getLong(KEY_LAST_CHECK, 0L);
            NETWORK.scheduleWithFixedDelay(new Runnable() { // from class: com.waze.gw.RoadNoticeClient.3
                @Override // java.lang.Runnable
                public void run() {
                    RoadNoticeClient.poll(context);
                }
            }, jCurrentTimeMillis < POLL_MS ? POLL_MS - Math.max(0L, jCurrentTimeMillis) : 0L, POLL_MS, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void poll(Context context) {
        int i2 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        sharedPreferences.edit().putLong(KEY_LAST_CHECK, System.currentTimeMillis()).apply();
        String[] strArrDefaults = WazeModEndpoints.defaults();
        int length = strArrDefaults.length;
        Throwable th = null;
        while (i2 < length) {
            String str = strArrDefaults[i2];
            try {
                pollFrom(context, sharedPreferences, str);
                return;
            } catch (Throwable th2) {
                Log.w(TAG, "endpoint failed " + str + ": " + safeMessage(th2));
                i2++;
                th = th2;
            }
        }
        Log.w(TAG, "update kept old database: " + safeMessage(th));
    }

    private static void pollFrom(Context context, SharedPreferences sharedPreferences, String str) throws Exception {
        Throwable th;
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            URL url2 = new URL(url, MANIFEST_PATH);
            String string = sharedPreferences.getString(KEY_ETAG, "");
            if (database == null || string == null || string.isEmpty()) {
                string = null;
            }
            HttpURLConnection httpURLConnectionOpenSameOrigin = openSameOrigin(url, url2, 3, string);
            try {
                int responseCode = httpURLConnectionOpenSameOrigin.getResponseCode();
                if (responseCode == 304) {
                    DiagnosticsLogger.networkEnd("road-manifest", httpURLConnectionOpenSameOrigin, responseCode, 0L, null);
                    Log.i(TAG, "manifest unchanged (304)");
                    if (httpURLConnectionOpenSameOrigin != null) {
                        httpURLConnectionOpenSameOrigin.disconnect();
                        return;
                    }
                    return;
                }
                if (responseCode == 204) {
                    DiagnosticsLogger.networkEnd("road-manifest", httpURLConnectionOpenSameOrigin, responseCode, 0L, null);
                    Log.i(TAG, "no published road dataset (204)");
                    if (httpURLConnectionOpenSameOrigin != null) {
                        httpURLConnectionOpenSameOrigin.disconnect();
                        return;
                    }
                    return;
                }
                if (responseCode != 200) {
                    DiagnosticsLogger.networkEnd("road-manifest", httpURLConnectionOpenSameOrigin, responseCode, 0L, null);
                    throw new Exception("manifest HTTP " + responseCode);
                }
                byte[] bounded = readBounded(httpURLConnectionOpenSameOrigin, 65536, -1L);
                DiagnosticsLogger.networkEnd("road-manifest", httpURLConnectionOpenSameOrigin, responseCode, bounded.length, null);
                RoadNoticeDatabase roadNoticeDatabaseDownloadAndVerify = downloadAndVerify(context, url, Manifest.parse(bounded), bounded);
                activate(context);
                database = roadNoticeDatabaseDownloadAndVerify;
                String headerField = httpURLConnectionOpenSameOrigin.getHeaderField("ETag");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (headerField == null || headerField.isEmpty()) {
                    editorEdit.remove(KEY_ETAG);
                } else {
                    editorEdit.putString(KEY_ETAG, headerField);
                }
                editorEdit.apply();
                Log.i(TAG, "activated dataset=" + roadNoticeDatabaseDownloadAndVerify.datasetVersion + " origin=" + url.getHost() + " segments=" + roadNoticeDatabaseDownloadAndVerify.segmentIds.length + " points=" + roadNoticeDatabaseDownloadAndVerify.pointOffsets.length);
                if (httpURLConnectionOpenSameOrigin != null) {
                    httpURLConnectionOpenSameOrigin.disconnect();
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionOpenSameOrigin;
                if (httpURLConnection == null) {
                    throw th;
                }
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        throw new java.lang.Exception("database exceeds declared size");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.waze.gw.RoadNoticeDatabase downloadAndVerify(android.content.Context r12, java.net.URL r13, com.waze.gw.RoadNoticeClient.Manifest r14, byte[] r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.RoadNoticeClient.downloadAndVerify(android.content.Context, java.net.URL, com.waze.gw.RoadNoticeClient$Manifest, byte[]):com.waze.gw.RoadNoticeDatabase");
    }

    private static RoadNoticeDatabase loadVerified(FilePair filePair) {
        if (!filePair.data.isFile() || !filePair.meta.isFile()) {
            return null;
        }
        try {
            Manifest manifest = Manifest.parse(readFile(filePair.meta, 65536));
            if (filePair.data.length() != manifest.plaintextSize) {
                throw new Exception("stored size mismatch");
            }
            byte[] file = readFile(filePair.data, 67108864);
            manifest.verifyPlaintext(file);
            RoadNoticeDatabase roadNoticeDatabase = RoadNoticeDatabase.parse(file);
            manifest.assertMatches(roadNoticeDatabase);
            return roadNoticeDatabase;
        } catch (Throwable th) {
            Log.w(TAG, "invalid " + filePair.data.getName() + ": " + safeMessage(th));
            return null;
        }
    }

    private static void activate(Context context) throws Exception {
        FilePair filePairPair = pair(context, "active");
        FilePair filePairPair2 = pair(context, "previous");
        FilePair filePairPair3 = pair(context, "download");
        if (!filePairPair3.data.isFile() || !filePairPair3.meta.isFile()) {
            throw new Exception("verified temporary pair missing");
        }
        deleteFile(filePairPair2.data);
        deleteFile(filePairPair2.meta);
        boolean zExists = filePairPair.data.exists();
        boolean zExists2 = filePairPair.meta.exists();
        boolean z = !zExists || filePairPair.data.renameTo(filePairPair2.data);
        boolean z2 = !zExists2 || filePairPair.meta.renameTo(filePairPair2.meta);
        if (!z || !z2) {
            if (z && zExists && filePairPair2.data.isFile()) {
                filePairPair2.data.renameTo(filePairPair.data);
            }
            if (z2 && zExists2 && filePairPair2.meta.isFile()) {
                filePairPair2.meta.renameTo(filePairPair.meta);
            }
            throw new Exception("could not rotate active database");
        }
        if (!filePairPair3.data.renameTo(filePairPair.data) || !filePairPair3.meta.renameTo(filePairPair.meta)) {
            deleteFile(filePairPair.data);
            deleteFile(filePairPair.meta);
            if (filePairPair2.data.isFile()) {
                filePairPair2.data.renameTo(filePairPair.data);
            }
            if (filePairPair2.meta.isFile()) {
                filePairPair2.meta.renameTo(filePairPair.meta);
            }
            throw new Exception("could not activate database");
        }
    }

    private static HttpURLConnection openSameOrigin(URL url, URL url2, int i2, String str) throws Exception {
        int i3 = 0;
        while (i3 <= i2) {
            requireSameOrigin(url, url2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(READ_TIMEOUT_MS);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            if (str != null && !str.isEmpty()) {
                httpURLConnection.setRequestProperty("If-None-Match", str);
            }
            DiagnosticsLogger.networkStart("road-data", httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                return httpURLConnection;
            }
            DiagnosticsLogger.networkEnd("road-redirect", httpURLConnection, responseCode, 0L, null);
            String headerField = httpURLConnection.getHeaderField("Location");
            httpURLConnection.disconnect();
            if (headerField != null && !headerField.isEmpty()) {
                i3++;
                url2 = new URL(url2, headerField);
            } else {
                throw new Exception("redirect without location");
            }
        }
        throw new Exception("too many redirects");
    }

    private static void requireSameOrigin(URL url, URL url2) throws Exception {
        int port = url.getPort() >= 0 ? url.getPort() : url.getDefaultPort();
        int port2 = url2.getPort() >= 0 ? url2.getPort() : url2.getDefaultPort();
        if (!url.getProtocol().equalsIgnoreCase(url2.getProtocol()) || !url.getHost().equalsIgnoreCase(url2.getHost()) || port != port2) {
            throw new Exception("cross-origin URL rejected");
        }
        String lowerCase = url2.getProtocol().toLowerCase(Locale.ROOT);
        if (!ProxyConfig.MATCH_HTTPS.equals(lowerCase) && !ProxyConfig.MATCH_HTTP.equals(lowerCase)) {
            throw new Exception("unsupported URL scheme");
        }
    }

    private static byte[] readBounded(HttpURLConnection httpURLConnection, int i2, long j2) throws Exception {
        long contentLengthLong = httpURLConnection.getContentLengthLong();
        if (contentLengthLong > i2 || (j2 >= 0 && contentLengthLong >= 0 && contentLengthLong != j2)) {
            throw new Exception("invalid Content-Length");
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            return readBounded(inputStream, i2, j2);
        } finally {
            inputStream.close();
        }
    }

    private static byte[] readFile(File file, int i2) throws Exception {
        if (file.length() < 0 || file.length() > i2) {
            throw new Exception("file too large");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return readBounded(fileInputStream, i2, file.length());
        } finally {
            fileInputStream.close();
        }
    }

    private static byte[] readBounded(InputStream inputStream, int i2, long j2) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((j2 <= 0 || j2 > ((long) i2)) ? 4096 : (int) j2);
        byte[] bArr = new byte[16384];
        int i3 = 0;
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 == -1) {
                if (j2 < 0 || i3 == j2) {
                    return byteArrayOutputStream.toByteArray();
                }
                throw new Exception("response truncated");
            }
            if (i4 > i2 - i3) {
                throw new Exception("response too large");
            }
            byteArrayOutputStream.write(bArr, 0, i4);
            i3 += i4;
        }
    }

    private static void writeSynced(File file, byte[] bArr) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.getFD().sync();
        } finally {
            fileOutputStream.close();
        }
    }

    private static FilePair pair(Context context, String str) {
        File file = new File(context.getFilesDir(), "road_notices");
        if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
            Log.w(TAG, "cannot create road database directory");
        }
        return new FilePair(new File(file, str + ".pb"), new File(file, str + ".json"));
    }

    private static void deleteFile(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        Log.w(TAG, "could not delete " + file.getName());
    }

    private static String hex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
        }
        return sb.toString();
    }

    private static String safeMessage(Throwable th) {
        String message = th.getMessage();
        return th.getClass().getSimpleName() + (message == null ? "" : ": " + message);
    }

    private static final class FilePair {
        final File data;
        final File meta;

        FilePair(File file, File file2) {
            this.data = file;
            this.meta = file2;
        }
    }

    private static final class Manifest {
        final long datasetVersion;
        final String downloadSha256;
        final long downloadSize;
        final DatasetEnvelope envelope;
        final String fileUrl;
        final String plaintextSha256;
        final long plaintextSize;
        final int schemaVersion;
        final byte[] signature;
        final long targetMapBuildId;

        Manifest(int i2, long j2, long j3, String str, long j4, String str2, long j5, String str3, byte[] bArr, DatasetEnvelope datasetEnvelope) {
            this.schemaVersion = i2;
            this.datasetVersion = j2;
            this.targetMapBuildId = j3;
            this.fileUrl = str;
            this.downloadSize = j4;
            this.downloadSha256 = str2;
            this.plaintextSize = j5;
            this.plaintextSha256 = str3;
            this.signature = bArr;
            this.envelope = datasetEnvelope;
        }

        static Manifest parse(byte[] bArr) throws Exception {
            JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
            if (jSONObject.has("encryption")) {
                DatasetEnvelope datasetEnvelope = DatasetEnvelope.parse(bArr, "road-notices", 67108864);
                if (datasetEnvelope.payloadSchemaVersion != 2) {
                    throw new Exception("unsupported road database schema");
                }
                if (!("/api/v1/road-notices/files/" + datasetEnvelope.version + "/road_notices.pb").equals(datasetEnvelope.artifactUrl)) {
                    throw new Exception("invalid road artifact URL");
                }
                return new Manifest(datasetEnvelope.payloadSchemaVersion, parsePositiveLong(datasetEnvelope.version, "datasetVersion"), datasetEnvelope.targetMapBuildId, datasetEnvelope.artifactUrl, datasetEnvelope.encryptedSize, datasetEnvelope.encryptedSha256, datasetEnvelope.plaintextSize, datasetEnvelope.plaintextSha256, datasetEnvelope.signature, datasetEnvelope);
            }
            int i2 = jSONObject.getInt("schemaVersion");
            if (i2 != 2) {
                throw new Exception("unsupported manifest schema");
            }
            long positiveLong = parsePositiveLong(jSONObject.getString("datasetVersion"), "datasetVersion");
            long positiveLong2 = parsePositiveLong(jSONObject.getString("targetWazeMapBuildId"), "targetWazeMapBuildId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("file");
            if (!"Ed25519".equals(jSONObject2.getString("signatureAlgorithm"))) {
                throw new Exception("signature algorithm mismatch");
            }
            long j2 = jSONObject2.getLong("size");
            if (j2 <= 0 || j2 > 67108864) {
                throw new Exception("invalid database size");
            }
            String string = jSONObject2.getString("sha256");
            if (!string.matches("(?i)[0-9a-f]{64}")) {
                throw new Exception("invalid SHA-256");
            }
            byte[] bArrDecode = Base64.decode(jSONObject2.getString("signature"), 0);
            if (bArrDecode.length != 64) {
                throw new Exception("invalid Ed25519 signature length");
            }
            String string2 = jSONObject2.getString("url");
            if (string2.isEmpty()) {
                throw new Exception("empty database URL");
            }
            return new Manifest(i2, positiveLong, positiveLong2, string2, j2, string, j2, string, bArrDecode, null);
        }

        void verifyPlaintext(byte[] bArr) throws Exception {
            if (bArr.length != this.plaintextSize || !DatasetEnvelope.sha256(bArr).equalsIgnoreCase(this.plaintextSha256) || !RoadNoticeCrypto.verify(bArr, this.signature)) {
                throw new SecurityException("road database authentication rejected");
            }
        }

        void assertMatches(RoadNoticeDatabase roadNoticeDatabase) throws Exception {
            if (roadNoticeDatabase.schemaVersion != this.schemaVersion || roadNoticeDatabase.datasetVersion != this.datasetVersion || roadNoticeDatabase.targetMapBuildId != this.targetMapBuildId) {
                throw new Exception("manifest/database metadata mismatch");
            }
        }

        private static long parsePositiveLong(String str, String str2) throws Exception {
            try {
                long j2 = Long.parseLong(str);
                if (j2 <= 0) {
                    throw new NumberFormatException();
                }
                return j2;
            } catch (NumberFormatException e2) {
                throw new Exception("invalid " + str2);
            }
        }
    }
}
