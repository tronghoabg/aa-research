package com.waze.gw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.TrafficStats;
import android.os.Build;
import android.os.FileObserver;
import android.os.Process;
import android.os.SystemClock;
import androidx.core.os.EnvironmentCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.strings.DisplayStrings;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes10.dex */
public final class DiagnosticsLogger {
    private static final String DIR_NAME = "wazemod_diagnostics";
    public static final int EXPORT_ALL = 4;
    public static final int EXPORT_ERRORS = 1;
    public static final int EXPORT_LOGCAT = 2;
    public static final int EXPORT_NETWORK = 3;
    private static final int KEEP_CRASH_FILES = 8;
    private static final int KEEP_LOGCAT_FILES = 3;
    private static final long MAX_EVENT_BYTES = 1048576;
    private static final int MAX_INVENTORY_ENTRIES = 2500;
    private static final long MAX_LOGCAT_BYTES = 2097152;
    private static final String TAG = "WazeGW-Diagnostics";
    private static Context app;
    private static Process logcatProcess;
    private static ConnectivityManager.NetworkCallback networkCallback;
    private static final Object IO_LOCK = new Object();
    private static final AtomicBoolean INSTALLED = new AtomicBoolean(false);
    private static final Map<HttpURLConnection, Long> REQUEST_STARTS = Collections.synchronizedMap(new WeakHashMap());
    private static final List<FileObserver> FILE_OBSERVERS = new ArrayList();
    private static final ScheduledExecutorService TRAFFIC_SAMPLER = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.waze.gw.DiagnosticsLogger.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "WazeMod-NetworkSampler");
            thread.setDaemon(true);
            return thread;
        }
    });
    private static final Pattern SECRET_PATTERN = Pattern.compile("(?i)(authorization|cookie|set-cookie|token|access[_-]?token|refresh[_-]?token|password|passwd|secret|api[_-]?key)(\\s*[:=]\\s*)([^\\s,;]+)");
    private static final Pattern BEARER_PATTERN = Pattern.compile("(?i)\\b(bearer|basic)\\s+[a-z0-9._~+/=-]{8,}");
    private static final Pattern COORD_PATTERN = Pattern.compile("(?<![\\d.])-?\\d{1,3}\\.\\d{5,}(?![\\d.])");
    private static long lastUidRx = -1;
    private static long lastUidTx = -1;

    private DiagnosticsLogger() {
    }

    public static void install(Context context) {
        if (context == null) {
            return;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        app = context;
        if (INSTALLED.compareAndSet(false, true)) {
            try {
                File fileRoot = root(context);
                if (!fileRoot.exists()) {
                    fileRoot.mkdirs();
                }
                trimOldFiles(new File(fileRoot, "logcat"), 3);
                trimOldFiles(new File(fileRoot, "errors"), 8);
                installCrashHandler(context);
                startLogcatCapture(context);
                startConnectivityCapture(context);
                startTrafficSampler();
                startFileObservers(context);
                appendEvent("lifecycle.log", "BOOT", "diagnostics installed; pid=" + Process.myPid());
            } catch (Throwable th) {
            }
        }
    }

    public static void networkStart(String str, HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            REQUEST_STARTS.put(httpURLConnection, Long.valueOf(SystemClock.elapsedRealtime()));
            appendEvent("network.log", "REQUEST", field(str) + "\t" + method(httpURLConnection) + "\t" + safeEndpoint(httpURLConnection.getURL()));
        } catch (Throwable th) {
        }
    }

    public static void networkEnd(String str, HttpURLConnection httpURLConnection, int i2, long j2, Throwable th) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            Long lRemove = REQUEST_STARTS.remove(httpURLConnection);
            long jMax = lRemove == null ? -1L : Math.max(0L, SystemClock.elapsedRealtime() - lRemove.longValue());
            String str2 = field(str) + "\t" + method(httpURLConnection) + "\t" + safeEndpoint(httpURLConnection.getURL()) + "\tstatus=" + i2 + "\tbytes=" + j2 + "\tms=" + jMax;
            if (th != null) {
                str2 = str2 + "\terror=" + field(th.getClass().getSimpleName()) + ":" + redact(th.getMessage());
            }
            appendEvent("network.log", th == null ? "RESPONSE" : "FAIL", str2);
        } catch (Throwable th2) {
        }
    }

    public static String summary(Context context) {
        try {
            File fileRoot = root(context);
            return "Logger: " + (INSTALLED.get() ? "đang chạy" : "chưa khởi tạo") + "\nDung lượng đã giữ: " + humanBytes(directorySize(fileRoot, 0)) + "\nBáo cáo crash Java: " + listFiles(new File(fileRoot, "errors")).size() + "\nLogcat chỉ chứa tiến trình Waze Mod; log mạng không lưu payload/token.";
        } catch (Throwable th) {
            return "Không đọc được trạng thái logger";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3 A[Catch: all -> 0x01c0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01c0, blocks: (B:52:0x0135, B:72:0x01a3), top: B:96:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba A[Catch: all -> 0x01be, TRY_LEAVE, TryCatch #13 {all -> 0x01be, blocks: (B:80:0x01b4, B:82:0x01ba), top: B:117:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean export(android.content.Context r13, android.net.Uri r14, int r15) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.DiagnosticsLogger.export(android.content.Context, android.net.Uri, int):boolean");
    }

    private static void writeArchive(Context context, File file, int i2) throws Exception {
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream;
        ZipOutputStream zipOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 65536);
                try {
                    ZipOutputStream zipOutputStream2 = new ZipOutputStream(bufferedOutputStream);
                    try {
                        addText(zipOutputStream2, "README.txt", reportReadme(i2));
                        addText(zipOutputStream2, "device_report.txt", deviceReport(context, i2));
                        File fileRoot = root(context);
                        if (i2 == 1 || i2 == 4) {
                            addDirectory(zipOutputStream2, new File(fileRoot, "errors"), "errors/");
                            addText(zipOutputStream2, "errors/logcat_error_extract.txt", extractErrors(fileRoot));
                        }
                        if (i2 == 2 || i2 == 4) {
                            addDirectory(zipOutputStream2, new File(fileRoot, "logcat"), "logcat/");
                        }
                        if (i2 == 3 || i2 == 4) {
                            addFile(zipOutputStream2, new File(fileRoot, "network.log"), "network/network.log");
                            addText(zipOutputStream2, "network/connectivity.txt", currentConnectivity(context));
                        }
                        if (i2 == 4) {
                            addFile(zipOutputStream2, new File(fileRoot, "files.log"), "files/files.log");
                            addFile(zipOutputStream2, new File(fileRoot, "lifecycle.log"), "lifecycle.log");
                            addText(zipOutputStream2, "files/inventory.txt", buildInventory(context));
                        }
                        zipOutputStream2.finish();
                        zipOutputStream2.close();
                    } catch (Throwable th) {
                        th = th;
                        zipOutputStream = zipOutputStream2;
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (Throwable th2) {
                            }
                        }
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th3) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (Throwable th4) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedOutputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            bufferedOutputStream = null;
            fileOutputStream = null;
        }
    }

    private static void validateArchive(File file) throws Exception {
        if (file == null || !file.isFile() || file.length() <= 0) {
            throw new IllegalStateException("Staged archive is empty");
        }
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                if (zipFile2.getEntry("README.txt") == null || zipFile2.getEntry("device_report.txt") == null) {
                    throw new IllegalStateException("Staged archive misses required entries");
                }
                try {
                    zipFile2.close();
                } catch (Throwable th) {
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Throwable th3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static void installCrashHandler(final Context context) {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.waze.gw.DiagnosticsLogger.2
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                try {
                    DiagnosticsLogger.writeCrash(context, thread, th);
                } catch (Throwable th2) {
                }
                if (defaultUncaughtExceptionHandler != null) {
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeCrash(Context context, Thread thread, Throwable th) throws Exception {
        File file = new File(root(context), "errors");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "crash_" + fileStamp() + ".txt");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        writeText(file2, "time=" + isoNow() + "\nthread=" + (thread == null ? EnvironmentCompat.MEDIA_UNKNOWN : field(thread.getName())) + "\n" + redact(stringWriter.toString()));
        trimOldFiles(file, 8);
    }

    private static void startLogcatCapture(final Context context) {
        Thread thread = new Thread(new Runnable() { // from class: com.waze.gw.DiagnosticsLogger.3
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x012a
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Throwable] */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    Method dump skipped, instructions count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.DiagnosticsLogger.AnonymousClass3.run():void");
            }
        }, "WazeMod-Logcat");
        thread.setDaemon(true);
        thread.start();
    }

    private static void startConnectivityCapture(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return;
            }
            networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.waze.gw.DiagnosticsLogger.4
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    DiagnosticsLogger.appendEvent("network.log", "LINK_UP", "network=" + DiagnosticsLogger.networkId(network));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    DiagnosticsLogger.appendEvent("network.log", "LINK_DOWN", "network=" + DiagnosticsLogger.networkId(network));
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    DiagnosticsLogger.appendEvent("network.log", "LINK_CAPS", "network=" + DiagnosticsLogger.networkId(network) + "\t" + DiagnosticsLogger.capabilities(networkCapabilities));
                }
            };
            if (Build.VERSION.SDK_INT >= 24) {
                connectivityManager.registerDefaultNetworkCallback(networkCallback);
            } else {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), networkCallback);
            }
            appendEvent("network.log", "LINK_STATE", currentConnectivity(context));
        } catch (Throwable th) {
            appendEvent("network.log", "LINK_MONITOR_FAIL", th.getClass().getSimpleName());
        }
    }

    private static void startTrafficSampler() {
        try {
            TRAFFIC_SAMPLER.scheduleAtFixedRate(new Runnable() { // from class: com.waze.gw.DiagnosticsLogger.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
                        long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
                        if (uidRxBytes >= 0 && uidTxBytes >= 0) {
                            long jMax = DiagnosticsLogger.lastUidRx < 0 ? 0L : Math.max(0L, uidRxBytes - DiagnosticsLogger.lastUidRx);
                            long jMax2 = DiagnosticsLogger.lastUidTx < 0 ? 0L : Math.max(0L, uidTxBytes - DiagnosticsLogger.lastUidTx);
                            DiagnosticsLogger.lastUidRx = uidRxBytes;
                            DiagnosticsLogger.lastUidTx = uidTxBytes;
                            if (jMax != 0 || jMax2 != 0) {
                                DiagnosticsLogger.appendEvent("network.log", "UID_TRAFFIC", "rxDelta=" + jMax + "\ttxDelta=" + jMax2 + "\trxTotal=" + uidRxBytes + "\ttxTotal=" + uidTxBytes);
                            }
                        }
                    } catch (Throwable th) {
                    }
                }
            }, 0L, 30L, TimeUnit.SECONDS);
        } catch (Throwable th) {
        }
    }

    private static void startFileObservers(Context context) {
        watchDirectory(context.getFilesDir(), "files");
        watchDirectory(context.getCacheDir(), "cache");
        if (Build.VERSION.SDK_INT >= 21) {
            watchDirectory(context.getNoBackupFilesDir(), "no_backup");
        }
        try {
            watchDirectory(context.getExternalFilesDir(null), "external_files");
        } catch (Throwable th) {
        }
    }

    private static void watchDirectory(final File file, final String str) {
        if (file == null) {
            return;
        }
        try {
            final String absolutePath = app == null ? "" : root(app).getAbsolutePath();
            FileObserver fileObserver = new FileObserver(file.getAbsolutePath(), DisplayStrings.DS_ONBOARDING_VEHICLE_TYPE_SELECTION_TAXI) { // from class: com.waze.gw.DiagnosticsLogger.6
                @Override // android.os.FileObserver
                public void onEvent(int i2, String str2) {
                    if (str2 == null || str2.contains(DiagnosticsLogger.DIR_NAME)) {
                        return;
                    }
                    File file2 = new File(file, str2);
                    if (absolutePath.isEmpty() || !file2.getAbsolutePath().startsWith(absolutePath)) {
                        DiagnosticsLogger.appendEvent("files.log", DiagnosticsLogger.fileEvent(i2), str + DomExceptionUtils.SEPARATOR + DiagnosticsLogger.safePath(str2) + "\tsize=" + (file2.isFile() ? file2.length() : -1L));
                    }
                }
            };
            fileObserver.startWatching();
            synchronized (FILE_OBSERVERS) {
                FILE_OBSERVERS.add(fileObserver);
            }
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fileEvent(int i2) {
        int i3 = i2 & 4095;
        return (i3 & 256) != 0 ? "FILE_CREATE" : (i3 & 512) != 0 ? "FILE_DELETE" : (i3 & 64) != 0 ? "FILE_MOVE_FROM" : (i3 & 128) != 0 ? "FILE_MOVE_TO" : (i3 & 8) != 0 ? "FILE_WRITE" : "FILE_EVENT_" + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendEvent(String str, String str2, String str3) {
        Context context = app;
        if (context == null) {
            return;
        }
        synchronized (IO_LOCK) {
            try {
                File file = new File(root(context), str);
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                if (file.length() >= MAX_EVENT_BYTES) {
                    rotateEvent(file);
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8));
                bufferedWriter.write(isoNow());
                bufferedWriter.write(9);
                bufferedWriter.write(field(str2));
                bufferedWriter.write(9);
                bufferedWriter.write(redact(str3));
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (Throwable th) {
            }
        }
    }

    private static void rotateEvent(File file) {
        File file2 = new File(file.getParentFile(), file.getName() + ".1");
        if (file2.exists()) {
            file2.delete();
        }
        file.renameTo(file2);
    }

    private static String reportReadme(int i2) {
        return "Waze Mod diagnostic report\nSelection: " + exportLabel(i2) + "\nCreated: " + isoNow() + "\n\nPrivacy: network entries contain method, host/path, status, byte count and duration only. Query strings, request/response bodies, cookies and auth headers are never collected. File inventory contains metadata only, not file contents.\n";
    }

    private static String deviceReport(Context context, int i2) {
        long longVersionCode;
        String str = "?";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (Throwable th) {
            longVersionCode = -1;
        }
        return "time=" + isoNow() + "\nselection=" + exportLabel(i2) + "\npackage=" + context.getPackageName() + "\nversionName=" + field(str) + "\nversionCode=" + longVersionCode + "\nandroid=" + Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + ")\nmanufacturer=" + field(Build.MANUFACTURER) + "\nmodel=" + field(Build.MODEL) + "\ndevice=" + field(Build.DEVICE) + "\nprocessUptimeMs=" + SystemClock.elapsedRealtime() + "\nconnectivity=" + currentConnectivity(context) + "\n";
    }

    private static String buildInventory(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("Metadata only; contents and SharedPreferences values are excluded.\n");
        int[] iArr = {0};
        appendInventory(sb, context.getFilesDir(), "files", 0, iArr);
        appendInventory(sb, context.getCacheDir(), "cache", 0, iArr);
        if (Build.VERSION.SDK_INT >= 21) {
            appendInventory(sb, context.getNoBackupFilesDir(), "no_backup", 0, iArr);
        }
        try {
            appendInventory(sb, context.getExternalFilesDir(null), "external_files", 0, iArr);
        } catch (Throwable th) {
        }
        return sb.toString();
    }

    private static void appendInventory(StringBuilder sb, File file, String str, int i2, int[] iArr) {
        File[] fileArrListFiles;
        if (file == null || iArr[0] >= 2500 || i2 > 6 || file.getAbsolutePath().contains(DIR_NAME)) {
            return;
        }
        iArr[0] = iArr[0] + 1;
        sb.append(file.isDirectory() ? "D" : "F").append('\t').append(safePath(str)).append('\t').append(file.isFile() ? file.length() : -1L).append('\t').append(file.lastModified()).append('\n');
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.waze.gw.DiagnosticsLogger.7
                @Override // java.util.Comparator
                public int compare(File file2, File file3) {
                    return file2.getName().compareTo(file3.getName());
                }
            });
            for (File file2 : fileArrListFiles) {
                appendInventory(sb, file2, str + DomExceptionUtils.SEPARATOR + file2.getName(), i2 + 1, iArr);
                if (iArr[0] >= 2500) {
                    return;
                }
            }
        }
    }

    private static String extractErrors(File file) {
        StringBuilder sb = new StringBuilder();
        Iterator<File> it = listFiles(new File(file, "logcat")).iterator();
        while (it.hasNext()) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(it.next()), StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            String lowerCase = line.toLowerCase(Locale.US);
                            if (lowerCase.contains("fatal exception") || lowerCase.contains("fatal signal") || lowerCase.contains("sigabrt") || lowerCase.contains("anr in ") || lowerCase.contains("androidruntime") || lowerCase.contains("noclassdeffounderror")) {
                                sb.append(redact(line)).append('\n');
                            }
                        } else {
                            try {
                                break;
                            } catch (Throwable th) {
                            }
                        }
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                    }
                }
                bufferedReader2.close();
            } catch (Throwable th3) {
            }
        }
        if (sb.length() == 0) {
            sb.append("No matching fatal/ANR lines in retained logcat.\n");
        }
        return sb.toString();
    }

    private static void addDirectory(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        for (File file2 : listFiles(file)) {
            addFile(zipOutputStream, file2, str + file2.getName());
        }
    }

    private static void addFile(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        if (file == null || !file.isFile()) {
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[16384];
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 == -1) {
                fileInputStream.close();
                zipOutputStream.closeEntry();
                return;
            }
            zipOutputStream.write(bArr, 0, i2);
        }
    }

    private static void addText(ZipOutputStream zipOutputStream, String str, String str2) throws Exception {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(str2.getBytes(StandardCharsets.UTF_8));
        zipOutputStream.closeEntry();
    }

    private static List<File> listFiles(File file) {
        ArrayList arrayList = new ArrayList();
        if (file == null) {
            return arrayList;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
            }
        }
        Collections.sort(arrayList, new Comparator<File>() { // from class: com.waze.gw.DiagnosticsLogger.8
            @Override // java.util.Comparator
            public int compare(File file3, File file4) {
                return (file3.lastModified() > file4.lastModified() ? 1 : (file3.lastModified() == file4.lastModified() ? 0 : -1));
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void trimOldFiles(File file, int i2) {
        List<File> listListFiles = listFiles(file);
        while (listListFiles.size() > i2) {
            listListFiles.remove(0).delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File root(Context context) {
        return new File(context.getFilesDir(), DIR_NAME);
    }

    private static long directorySize(File file, int i2) {
        long jDirectorySize = 0;
        if (file == null || !file.exists() || i2 > 8) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jDirectorySize += directorySize(file2, i2 + 1);
            }
        }
        return jDirectorySize;
    }

    private static String currentConnectivity(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "unavailable";
            }
            String str = "offline";
            if (Build.VERSION.SDK_INT >= 23) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                return activeNetwork == null ? "offline" : capabilities(activeNetwork == null ? null : connectivityManager.getNetworkCapabilities(activeNetwork));
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                str = field(activeNetworkInfo.getTypeName()) + ",connected=" + activeNetworkInfo.isConnected();
            }
            return str;
        } catch (Throwable th) {
            return "unknown:" + th.getClass().getSimpleName();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String capabilities(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        StringBuilder sb = new StringBuilder();
        if (networkCapabilities.hasTransport(1)) {
            sb.append("wifi");
        } else if (networkCapabilities.hasTransport(0)) {
            sb.append("cellular");
        } else if (networkCapabilities.hasTransport(3)) {
            sb.append("ethernet");
        } else if (networkCapabilities.hasTransport(4)) {
            sb.append("vpn");
        } else {
            sb.append("other");
        }
        sb.append(",internet=").append(networkCapabilities.hasCapability(12));
        sb.append(",validated=").append(networkCapabilities.hasCapability(16));
        sb.append(",metered=").append(!networkCapabilities.hasCapability(11));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String networkId(Network network) {
        return network == null ? "?" : Integer.toHexString(network.hashCode());
    }

    private static String method(HttpURLConnection httpURLConnection) {
        try {
            return field(httpURLConnection.getRequestMethod());
        } catch (Throwable th) {
            return "?";
        }
    }

    private static String safeEndpoint(URL url) {
        String str;
        if (url == null) {
            return "?";
        }
        String path = url.getPath();
        if (path == null || path.isEmpty()) {
            path = DomExceptionUtils.SEPARATOR;
        }
        String protocol = url.getProtocol();
        String host = url.getHost();
        if (url.getPort() >= 0) {
            str = ":" + url.getPort();
        } else {
            str = "";
        }
        String strSubstring = protocol + "://" + host + str + path;
        if (strSubstring.length() > 320) {
            strSubstring = strSubstring.substring(0, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT);
        }
        return field(strSubstring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String redact(String str) {
        if (str == null) {
            return "";
        }
        String strReplaceAll = COORD_PATTERN.matcher(BEARER_PATTERN.matcher(SECRET_PATTERN.matcher(str).replaceAll("$1$2<redacted>")).replaceAll("$1 <redacted>")).replaceAll("<coord>");
        if (strReplaceAll.length() <= 4096) {
            return strReplaceAll;
        }
        return strReplaceAll.substring(0, 4096) + "…";
    }

    private static String field(String str) {
        return str == null ? "" : str.replace('\t', ' ').replace('\r', ' ').replace('\n', ' ');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String safePath(String str) {
        return field(str).replace("..", "_");
    }

    private static String exportLabel(int i2) {
        return i2 == 1 ? "errors" : i2 == 2 ? "logcat" : i2 == 3 ? "network" : TtmlNode.COMBINE_ALL;
    }

    private static String isoNow() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.US).format(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fileStamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date());
    }

    private static void writeText(File file, String str) throws Exception {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    private static String humanBytes(long j2) {
        if (j2 < 1024) {
            return j2 + " B";
        }
        if (j2 < MAX_EVENT_BYTES) {
            Locale locale = Locale.US;
            double d2 = j2;
            Double.isNaN(d2);
            return String.format(locale, "%.1f KB", Double.valueOf(d2 / 1024.0d));
        }
        Locale locale2 = Locale.US;
        double d3 = j2;
        Double.isNaN(d3);
        return String.format(locale2, "%.1f MB", Double.valueOf(d3 / 1048576.0d));
    }
}
