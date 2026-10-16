package com.waze.gw;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import androidx.webkit.ProxyConfig;
import com.waze.strings.DisplayStrings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class PointNoticeClient {
    private static final String KEY_ETAG = "manifest_etag";
    private static final String KEY_LAST_CHECK = "last_check_ms";
    private static final String KEY_LAST_RESULT = "last_result";
    private static final String KEY_SERVER_VERSION = "server_version";
    private static final String MANIFEST_PATH = "/api/client/comments/manifest";
    private static final int MAX_DATABASE_BYTES = 16777216;
    private static final int MAX_MANIFEST_BYTES = 65536;
    private static final long POLL_MS = 21600000;
    private static final String PREFS = "waze_point_notice_client";
    private static final String TAG = "WazeGW-PointData";
    private static volatile boolean booted;
    private static volatile PointNoticeDatabase database;
    private static volatile boolean loaded;
    private static final ScheduledExecutorService NETWORK = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.waze.gw.PointNoticeClient.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "WazeGW-point-data");
            thread.setDaemon(true);
            return thread;
        }
    });
    private static final Object LOCK = new Object();

    private PointNoticeClient() {
    }

    static void start(Context context) {
        final Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext == null || booted) {
            return;
        }
        synchronized (PointNoticeClient.class) {
            if (booted) {
                return;
            }
            booted = true;
            NETWORK.execute(new Runnable() { // from class: com.waze.gw.PointNoticeClient.2
                @Override // java.lang.Runnable
                public void run() {
                    PointNoticeClient.loadLocal(applicationContext);
                    ScheduledExecutorService scheduledExecutorService = PointNoticeClient.NETWORK;
                    final Context context2 = applicationContext;
                    scheduledExecutorService.scheduleWithFixedDelay(new Runnable(this) { // from class: com.waze.gw.PointNoticeClient.2.1
                        final /* synthetic */ AnonymousClass2 this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            PointNoticeClient.poll(context2, false);
                        }
                    }, 0L, PointNoticeClient.POLL_MS, TimeUnit.MILLISECONDS);
                }
            });
        }
    }

    static PointNoticeDatabase get(Context context) {
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (!loaded && applicationContext != null) {
            loadLocal(applicationContext);
        }
        return database;
    }

    static void checkNow(Context context, final Runnable runnable) {
        final Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        NETWORK.execute(new Runnable() { // from class: com.waze.gw.PointNoticeClient.3
            @Override // java.lang.Runnable
            public void run() {
                PointNoticeClient.poll(applicationContext, true);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadLocal(Context context) {
        String str;
        synchronized (LOCK) {
            if (loaded) {
                return;
            }
            PointNoticeDatabase pointNoticeDatabaseLoadVerified = loadVerified(pair(context, "active"));
            if (pointNoticeDatabaseLoadVerified == null) {
                pointNoticeDatabaseLoadVerified = loadVerified(pair(context, "previous"));
            }
            database = pointNoticeDatabaseLoadVerified;
            loaded = true;
            if (pointNoticeDatabaseLoadVerified == null) {
                str = "no verified point database";
            } else {
                str = "loaded dataset=" + pointNoticeDatabaseLoadVerified.datasetVersion;
            }
            Log.i(TAG, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void poll(Context context, boolean z) {
        int i2 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z || jCurrentTimeMillis - sharedPreferences.getLong(KEY_LAST_CHECK, 0L) >= POLL_MS) {
            sharedPreferences.edit().putLong(KEY_LAST_CHECK, jCurrentTimeMillis).apply();
            String[] strArrDefaults = WazeModEndpoints.defaults();
            int length = strArrDefaults.length;
            Throwable th = null;
            while (i2 < length) {
                String str = strArrDefaults[i2];
                try {
                    pollFrom(context, sharedPreferences, str);
                    return;
                } catch (Throwable th2) {
                    Log.w(TAG, "endpoint failed " + str + ": " + reason(th2));
                    i2++;
                    th = th2;
                }
            }
            String strReason = reason(th);
            sharedPreferences.edit().putString(KEY_LAST_RESULT, "ERROR: " + strReason).apply();
            Log.w(TAG, "point update kept old database: " + strReason);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void pollFrom(android.content.Context r23, android.content.SharedPreferences r24, java.lang.String r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.PointNoticeClient.pollFrom(android.content.Context, android.content.SharedPreferences, java.lang.String):void");
    }

    private static String reason(Throwable th) {
        if (th == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        String message = th.getMessage();
        return th.getClass().getSimpleName() + (message == null ? "" : ": " + message);
    }

    private static void install(Context context, byte[] bArr, byte[] bArr2) throws Exception {
        synchronized (LOCK) {
            FilePair filePairPair = pair(context, "active");
            FilePair filePairPair2 = pair(context, "previous");
            if (filePairPair.data.isFile() && filePairPair.manifest.isFile()) {
                copy(filePairPair.data, filePairPair2.data);
                copy(filePairPair.manifest, filePairPair2.manifest);
            }
            File file = new File(context.getFilesDir(), "wme_point_active.pb.tmp");
            File file2 = new File(context.getFilesDir(), "wme_point_active.json.tmp");
            write(file, bArr);
            write(file2, bArr2);
            replace(file, filePairPair.data);
            replace(file2, filePairPair.manifest);
        }
    }

    private static PointNoticeDatabase loadVerified(FilePair filePair) {
        try {
            if (filePair.data.isFile() && filePair.manifest.isFile()) {
                return verify(read(filePair.data, 16777216), read(filePair.manifest, 65536));
            }
            return null;
        } catch (Throwable th) {
            Log.w(TAG, "invalid local point database: " + th.getClass().getSimpleName());
            return null;
        }
    }

    private static PointNoticeDatabase verify(byte[] bArr, byte[] bArr2) throws Exception {
        Manifest manifest = Manifest.parse(bArr2);
        manifest.verifyPlaintext(bArr);
        PointNoticeDatabase pointNoticeDatabase = PointNoticeDatabase.parse(bArr);
        if (!manifest.datasetVersion.equals(pointNoticeDatabase.datasetVersion) || ((manifest.generatedAtMs > 0 && manifest.generatedAtMs != pointNoticeDatabase.generatedAtMs) || manifest.spatialZoom != pointNoticeDatabase.spatialZoom)) {
            return null;
        }
        return pointNoticeDatabase;
    }

    private static HttpURLConnection open(URL url) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestProperty("Accept", "application/json, application/x-protobuf");
        httpURLConnection.setInstanceFollowRedirects(false);
        DiagnosticsLogger.networkStart("point-data", httpURLConnection);
        return httpURLConnection;
    }

    private static int effectivePort(URL url) {
        if (url.getPort() >= 0) {
            return url.getPort();
        }
        if (ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(url.getProtocol())) {
            return DisplayStrings.DS_HEAVY;
        }
        return 80;
    }

    private static byte[] readLimited(HttpURLConnection httpURLConnection, int i2) throws Exception {
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            return read(inputStream, i2);
        } finally {
            inputStream.close();
        }
    }

    private static byte[] read(File file, int i2) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return read(fileInputStream, i2);
        } finally {
            fileInputStream.close();
        }
    }

    private static byte[] read(InputStream inputStream, int i2) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        int i3 = 0;
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 > i2) {
                    throw new IllegalStateException("file too large");
                }
                byteArrayOutputStream.write(bArr, 0, i4);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static void write(File file, byte[] bArr) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.getFD().sync();
        } finally {
            fileOutputStream.close();
        }
    }

    private static void copy(File file, File file2) throws Exception {
        write(file2, read(file, 16777216));
    }

    private static void replace(File file, File file2) throws Exception {
        if (file2.exists() && !file2.delete()) {
            throw new IllegalStateException("delete failed");
        }
        if (!file.renameTo(file2)) {
            throw new IllegalStateException("rename failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String sha256(byte[] bArr) throws Exception {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        StringBuilder sb = new StringBuilder(64);
        for (byte b2 : bArrDigest) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
        }
        return sb.toString();
    }

    private static FilePair pair(Context context, String str) {
        return new FilePair(new File(context.getFilesDir(), "wme_point_" + str + ".pb"), new File(context.getFilesDir(), "wme_point_" + str + ".json"));
    }

    private static final class FilePair {
        final File data;
        final File manifest;

        FilePair(File file, File file2) {
            this.data = file;
            this.manifest = file2;
        }
    }

    private static final class Manifest {
        final String datasetVersion;
        final String downloadSha256;
        final int downloadSize;
        final DatasetEnvelope envelope;
        final String fileUrl;
        final long generatedAtMs;
        final String plaintextSha256;
        final int plaintextSize;
        final byte[] signature;
        final int spatialZoom;

        Manifest(String str, long j2, String str2, int i2, int i3, String str3, int i4, String str4, byte[] bArr, DatasetEnvelope datasetEnvelope) {
            this.datasetVersion = str;
            this.generatedAtMs = j2;
            this.fileUrl = str2;
            this.spatialZoom = i2;
            this.downloadSize = i3;
            this.downloadSha256 = str3;
            this.plaintextSize = i4;
            this.plaintextSha256 = str4;
            this.signature = bArr;
            this.envelope = datasetEnvelope;
        }

        static Manifest parse(byte[] bArr) throws Exception {
            JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
            if (jSONObject.has("encryption")) {
                DatasetEnvelope datasetEnvelope = DatasetEnvelope.parse(bArr, "wme-point-notices", 16777216);
                if (datasetEnvelope.payloadSchemaVersion != 2 || datasetEnvelope.spatialZoom != 14) {
                    throw new IllegalArgumentException("invalid point payload metadata");
                }
                if (!"/api/client/comments/download".equals(datasetEnvelope.artifactUrl)) {
                    throw new IllegalArgumentException("invalid point artifact URL");
                }
                return new Manifest(datasetEnvelope.version, 0L, datasetEnvelope.artifactUrl, datasetEnvelope.spatialZoom, (int) datasetEnvelope.encryptedSize, datasetEnvelope.encryptedSha256, (int) datasetEnvelope.plaintextSize, datasetEnvelope.plaintextSha256, datasetEnvelope.signature, datasetEnvelope);
            }
            if (jSONObject.optInt("schemaVersion", -1) != 2) {
                throw new IllegalArgumentException("unsupported manifest schema");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("file");
            if (!"Ed25519".equalsIgnoreCase(jSONObject2.optString("signatureAlgorithm"))) {
                throw new IllegalArgumentException("unsupported signature");
            }
            String string = jSONObject.getString("datasetVersion");
            if (!string.matches("[0-9]{1,32}")) {
                throw new IllegalArgumentException("invalid dataset version");
            }
            long time = parseTime(jSONObject.getString("generatedAt"));
            int iOptInt = jSONObject.optInt("spatialZoom", -1);
            if (iOptInt != 14) {
                throw new IllegalArgumentException("invalid spatial zoom");
            }
            int i2 = jSONObject2.getInt("size");
            if (i2 <= 0 || i2 > 16777216) {
                throw new IllegalArgumentException("invalid size");
            }
            String string2 = jSONObject2.getString("url");
            if (!("/api/v1/wme-point-notices/files/" + string + "/wme_point_notices.pb").equals(string2)) {
                throw new IllegalArgumentException("invalid file URL");
            }
            String string3 = jSONObject2.getString("sha256");
            if (!string3.matches("(?i)[a-f0-9]{64}")) {
                throw new IllegalArgumentException("invalid SHA-256");
            }
            byte[] bArrDecode = Base64.decode(jSONObject2.getString("signature"), 0);
            if (bArrDecode.length != 64) {
                throw new IllegalArgumentException("invalid Ed25519 signature");
            }
            return new Manifest(string, time, string2, iOptInt, i2, string3, i2, string3, bArrDecode, null);
        }

        void verifyPlaintext(byte[] bArr) throws Exception {
            if (bArr.length != this.plaintextSize || !PointNoticeClient.sha256(bArr).equalsIgnoreCase(this.plaintextSha256) || !RoadNoticeCrypto.verify(bArr, this.signature)) {
                throw new SecurityException("point database authentication rejected");
            }
        }

        private static long parseTime(String str) throws Exception {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                throw new IllegalArgumentException("invalid generatedAt");
            }
            return date.getTime();
        }
    }
}
