package com.waze.gw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import androidx.car.app.CarAppService;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.navigation.compose.DialogNavigator;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class Updater {
    private static final String TAG = "WazeOTA";
    private static volatile boolean checkedThisProcess;

    private interface Progress {
        void on(int i2);
    }

    Updater() {
    }

    static synchronized void ensureChecked() {
        if (checkedThisProcess) {
            return;
        }
        if (Gateway.trustedBuild()) {
            if (pref("ota_auto", false)) {
                checkedThisProcess = true;
                Thread thread = new Thread(new Runnable() { // from class: com.waze.gw.Updater.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Updater.runCheck(false, null);
                    }
                }, "ota-check");
                thread.setDaemon(true);
                thread.start();
            }
        }
    }

    static void checkNow(final Activity activity) {
        if (!Gateway.trustedBuild(activity)) {
            toast(activity, "Bản cài đặt không được phép cập nhật");
            return;
        }
        toast(activity, "Đang kiểm tra cập nhật…");
        Thread thread = new Thread(new Runnable() { // from class: com.waze.gw.Updater.2
            @Override // java.lang.Runnable
            public void run() {
                Updater.runCheck(true, activity);
            }
        }, "ota-check");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void runCheck(boolean z, final Activity activity) {
        final String strOptString;
        if (!z) {
            try {
                if (!pref("ota_auto", false)) {
                    return;
                }
            } catch (Throwable th) {
                Log.w(TAG, "check", th);
                if (z) {
                    toast(activity, "Lỗi kiểm tra cập nhật");
                    return;
                }
                return;
            }
        }
        int iDeviceAndroidVer = deviceAndroidVer();
        int i2 = 1;
        int i3 = thisAppHasAA() ? 1 : 0;
        if (!isClone()) {
            i2 = 0;
        }
        GetResult getResultHttpGetWithFallback = httpGetWithFallback("/api/check?av=" + iDeviceAndroidVer + "&aa=" + i3 + "&clone=" + i2, 5);
        if (getResultHttpGetWithFallback == null) {
            if (z) {
                toast(activity, "Không kiểm tra được cập nhật");
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject(getResultHttpGetWithFallback.body);
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JsonPOJOBuilder.DEFAULT_BUILD_METHOD);
        if (jSONObjectOptJSONObject != null && matches(jSONObjectOptJSONObject)) {
            jSONObjectOptJSONObject.put("_wazemod_base", getResultHttpGetWithFallback.base);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("changelog");
            if (jSONObjectOptJSONObject2 == null) {
                strOptString = jSONObject.optString("changelog", "");
            } else {
                strOptString = jSONObjectOptJSONObject2.optString("content", "");
            }
            String strOptString2 = jSONObjectOptJSONObject.optString("sha256", "");
            if (strOptString2.isEmpty()) {
                Log.w(TAG, "latest build has no sha256; cannot detect update");
                if (z) {
                    toast(activity, "Đã là bản mới nhất");
                    return;
                }
                return;
            }
            String strSelfSha256 = selfSha256();
            if (strSelfSha256 != null && strOptString2.equalsIgnoreCase(strSelfSha256)) {
                if (z) {
                    toast(activity, "Đã là bản mới nhất");
                    return;
                }
                return;
            } else {
                if (z || !strOptString2.equalsIgnoreCase(prefStr("ota_skip_hash", ""))) {
                    if (z && activity != null) {
                        activity.runOnUiThread(new Runnable() { // from class: com.waze.gw.Updater.3
                            @Override // java.lang.Runnable
                            public void run() {
                                Updater.showUpdateDialog(activity, jSONObjectOptJSONObject, strOptString);
                            }
                        });
                    } else if (pref("ota_auto", false)) {
                        notifyUpdate(jSONObjectOptJSONObject.optString("buildName", "bản mới"));
                    }
                    return;
                }
                return;
            }
        }
        if (z) {
            toast(activity, "Không có bản phù hợp thiết bị");
        }
    }

    static void onAutoSettingChanged(boolean z) {
        NotificationManager notificationManager;
        if (z) {
            return;
        }
        try {
            Context contextAppCtx = appCtx();
            if (contextAppCtx == null || (notificationManager = (NotificationManager) contextAppCtx.getSystemService("notification")) == null) {
                return;
            }
            notificationManager.cancel(71);
        } catch (Throwable th) {
            Log.w(TAG, "cancel auto notification", th);
        }
    }

    private static boolean matches(JSONObject jSONObject) {
        if (!"stable".equals(jSONObject.optString(NotificationCompat.CATEGORY_STATUS, "stable"))) {
            return false;
        }
        int iDeviceAndroidVer = deviceAndroidVer();
        int iOptInt = jSONObject.optInt("minAndroid", 0);
        int iOptInt2 = jSONObject.isNull("maxAndroid") ? 99 : jSONObject.optInt("maxAndroid", 99);
        if (iDeviceAndroidVer < iOptInt || iDeviceAndroidVer > iOptInt2 || jSONObject.optBoolean("androidAuto", false) != thisAppHasAA()) {
            return false;
        }
        return (isClone() ? "dual" : "overwrite").equals(jSONObject.optString("installType", "overwrite"));
    }

    private static String selfSha256() {
        try {
            Context contextAppCtx = appCtx();
            if (contextAppCtx == null) {
                return null;
            }
            File file = new File(contextAppCtx.getApplicationInfo().sourceDir);
            long jLastModified = file.lastModified();
            if (jLastModified == prefLong("self_hash_stamp", -1L)) {
                String strPrefStr = prefStr("self_hash", "");
                if (!strPrefStr.isEmpty()) {
                    return strPrefStr;
                }
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[65536];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    fileInputStream.close();
                    String strHex = hex(messageDigest.digest());
                    putLong("self_hash_stamp", jLastModified);
                    putStr("self_hash", strHex);
                    return strHex;
                }
                messageDigest.update(bArr, 0, i2);
            }
        } catch (Throwable th) {
            Log.w(TAG, "selfSha256", th);
            return null;
        }
    }

    private static int deviceAndroidVer() {
        return androidVerFor(Build.VERSION.SDK_INT);
    }

    private static int androidVerFor(int i2) {
        switch (i2) {
            case 23:
                return 6;
            case 24:
            case 25:
                return 7;
            case 26:
            case 27:
                return 8;
            case 28:
                return 9;
            case 29:
                return 10;
            case 30:
                return 11;
            case 31:
            case 32:
                return 12;
            case 33:
                return 13;
            case 34:
                return 14;
            case 35:
                return 15;
            default:
                if (i2 < 23) {
                    return 5;
                }
                return i2 - 19;
        }
    }

    private static boolean thisAppHasAA() {
        try {
            Context contextAppCtx = appCtx();
            Intent intent = new Intent(CarAppService.SERVICE_INTERFACE);
            intent.setPackage(contextAppCtx.getPackageName());
            List<ResolveInfo> listQueryIntentServices = contextAppCtx.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices != null) {
                return !listQueryIntentServices.isEmpty();
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean isClone() {
        Context contextAppCtx = appCtx();
        return (contextAppCtx == null || "com.waze".equals(contextAppCtx.getPackageName())) ? false : true;
    }

    private static void notifyUpdate(String str) {
        try {
            Context contextAppCtx = appCtx();
            if (contextAppCtx == null) {
                return;
            }
            NotificationManager notificationManager = (NotificationManager) contextAppCtx.getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("wazemod_ota", "Cập nhật Waze Mod", 3));
            }
            Intent intent = new Intent();
            intent.setClassName(contextAppCtx, "com.waze.gw.ModSettingsActivity");
            intent.putExtra("ota_check", true);
            intent.addFlags(268435456);
            PendingIntent activity = PendingIntent.getActivity(contextAppCtx, 71, intent, (Build.VERSION.SDK_INT >= 23 ? 67108864 : 0) | 134217728);
            Notification.Builder builder = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(contextAppCtx, "wazemod_ota") : new Notification.Builder(contextAppCtx);
            builder.setContentTitle("Có bản cập nhật Waze Mod").setContentText(str + " — chạm để cập nhật").setSmallIcon(contextAppCtx.getApplicationInfo().icon).setAutoCancel(true).setContentIntent(activity);
            notificationManager.notify(71, builder.build());
        } catch (Throwable th) {
            Log.w(TAG, "notify", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showUpdateDialog(final Activity activity, final JSONObject jSONObject, String str) {
        try {
            String size = formatSize(jSONObject.optLong("apkSizeBytes", 0L));
            StringBuilder sb = new StringBuilder();
            sb.append(jSONObject.optString("buildName", "")).append(size.isEmpty() ? "" : "\n" + size).append("\n\n");
            if (str != null && !str.isEmpty()) {
                sb.append(str);
            }
            new AlertDialog.Builder(activity).setTitle("Có bản cập nhật mới").setMessage(sb.toString()).setPositiveButton("Cập nhật", new DialogInterface.OnClickListener() { // from class: com.waze.gw.Updater.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    Updater.downloadAndInstall(activity, jSONObject);
                }
            }).setNegativeButton("Để sau", new DialogInterface.OnClickListener() { // from class: com.waze.gw.Updater.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    Updater.putStr("ota_skip_hash", jSONObject.optString("sha256", ""));
                }
            }).show();
        } catch (Throwable th) {
            Log.w(TAG, DialogNavigator.NAME, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void downloadAndInstall(final Activity activity, final JSONObject jSONObject) {
        if (!Gateway.trustedBuild(activity)) {
            toast(activity, "Bản cài đặt không được phép cập nhật");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26 && !activity.getPackageManager().canRequestPackageInstalls()) {
                activity.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + activity.getPackageName())));
                toast(activity, "Bật 'Cài ứng dụng không rõ nguồn' rồi bấm Cập nhật lại");
                return;
            }
        } catch (Throwable th) {
        }
        final ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle("Đang tải cập nhật");
        progressDialog.setProgressStyle(1);
        progressDialog.setCancelable(false);
        progressDialog.setMax(100);
        progressDialog.show();
        Thread thread = new Thread(new Runnable() { // from class: com.waze.gw.Updater.6
            @Override // java.lang.Runnable
            public void run() {
                final File file = new File(activity.getCacheDir(), "wazemod-update.apk");
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Throwable th2) {
                }
                try {
                    JSONObject jSONObject2 = jSONObject;
                    final Activity activity2 = activity;
                    final ProgressDialog progressDialog2 = progressDialog;
                    Updater.downloadWithFallback(jSONObject2, file, new Progress(this) { // from class: com.waze.gw.Updater.6.1
                        final /* synthetic */ AnonymousClass6 this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // com.waze.gw.Updater.Progress
                        public void on(final int i2) {
                            Activity activity3 = activity2;
                            final ProgressDialog progressDialog3 = progressDialog2;
                            activity3.runOnUiThread(new Runnable(this) { // from class: com.waze.gw.Updater.6.1.1
                                final /* synthetic */ AnonymousClass1 this$1;

                                {
                                    this.this$1 = this;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    progressDialog3.setProgress(i2);
                                }
                            });
                        }
                    });
                    Activity activity3 = activity;
                    final ProgressDialog progressDialog3 = progressDialog;
                    final Activity activity4 = activity;
                    activity3.runOnUiThread(new Runnable(this) { // from class: com.waze.gw.Updater.6.2
                        final /* synthetic */ AnonymousClass6 this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            progressDialog3.dismiss();
                            Updater.install(activity4, file);
                        }
                    });
                } catch (Throwable th3) {
                    Log.w(Updater.TAG, "download", th3);
                    Activity activity5 = activity;
                    final ProgressDialog progressDialog4 = progressDialog;
                    final Activity activity6 = activity;
                    activity5.runOnUiThread(new Runnable(this) { // from class: com.waze.gw.Updater.6.3
                        final /* synthetic */ AnonymousClass6 this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            progressDialog4.dismiss();
                            Updater.toast(activity6, "Tải cập nhật thất bại");
                        }
                    });
                }
            }
        }, "ota-dl");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void downloadWithFallback(JSONObject jSONObject, File file, Progress progress) throws Exception {
        String[] strArrOrderedDownloadBases = orderedDownloadBases(jSONObject.optString("_wazemod_base", ""));
        int length = strArrOrderedDownloadBases.length;
        Exception exc = null;
        int i2 = 0;
        while (i2 < length) {
            String str = strArrOrderedDownloadBases[i2];
            try {
                if (file.exists() && !file.delete()) {
                    throw new Exception("cannot reset download file");
                }
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                if (downloadWithRedirects(str + "/api/download/" + jSONObject.optString(TtmlNode.ATTR_ID), file, messageDigest, progress) <= 0) {
                    throw new Exception("empty download");
                }
                String strOptString = jSONObject.optString("sha256", "");
                if (!strOptString.isEmpty() && !hex(messageDigest.digest()).equalsIgnoreCase(strOptString)) {
                    throw new Exception("SHA-256 mismatch");
                }
                return;
            } catch (Throwable th) {
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Throwable th2) {
                }
                Log.w(TAG, "download endpoint failed " + str, th);
                i2++;
                exc = th;
            }
        }
        if (!(exc instanceof Exception)) {
            throw new Exception("all download endpoints failed", exc);
        }
        throw exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static long downloadWithRedirects(String str, File file, MessageDigest messageDigest, Progress progress) throws Exception {
        int i2;
        boolean z = 0;
        String headerField = str;
        int i3 = 0;
        while (i3 < 6) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            httpURLConnection.setInstanceFollowRedirects(z);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(30000);
            DiagnosticsLogger.networkStart("ota-download", httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308) {
                DiagnosticsLogger.networkEnd("ota-download", httpURLConnection, responseCode, 0L, null);
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    i3++;
                    z = 0;
                } else {
                    throw new Exception("redirect without Location");
                }
            } else {
                if (responseCode != 200) {
                    DiagnosticsLogger.networkEnd("ota-download", httpURLConnection, responseCode, 0L, null);
                    httpURLConnection.disconnect();
                    throw new Exception("http " + responseCode);
                }
                long contentLength = httpURLConnection.getContentLength();
                InputStream inputStream = httpURLConnection.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[65536];
                int i4 = -1;
                long j2 = 0;
                int i5 = z;
                while (true) {
                    int i6 = inputStream.read(bArr);
                    if (i6 > 0) {
                        fileOutputStream.write(bArr, i5, i6);
                        messageDigest.update(bArr, i5, i6);
                        long j3 = contentLength;
                        j2 += i6;
                        if (j3 > 0 && (i2 = (int) ((100 * j2) / j3)) != i4) {
                            progress.on(i2);
                            i4 = i2;
                        }
                        contentLength = j3;
                        i5 = 0;
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        long j4 = j2;
                        DiagnosticsLogger.networkEnd("ota-download", httpURLConnection, responseCode, j4, null);
                        httpURLConnection.disconnect();
                        return j4;
                    }
                }
            }
        }
        throw new Exception("too many redirects");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void install(Activity activity, File file) {
        try {
            Uri uri = Uri.parse("content://" + activity.getPackageName() + ".provider/cache_internal/" + file.getName());
            Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
            intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", "com.android.vending");
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
            intent.addFlags(268435457);
            activity.startActivity(intent);
        } catch (Throwable th) {
            Log.w(TAG, "install", th);
            toast(activity, "Không mở được trình cài đặt");
        }
    }

    private static String[] updateBases() {
        return WazeModEndpoints.forConfiguredBase(prefStr("ota_base", ""));
    }

    private static String[] orderedDownloadBases(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String strTrim = WazeModEndpoints.trim(str);
        if (strTrim.length() > 0) {
            linkedHashSet.add(strTrim);
        }
        for (String str2 : updateBases()) {
            linkedHashSet.add(str2);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    private static GetResult httpGetWithFallback(String str, int i2) {
        String strHttpGet;
        for (String str2 : updateBases()) {
            try {
                strHttpGet = httpGet(str2 + str, i2);
            } catch (Throwable th) {
                Log.w(TAG, "check endpoint failed " + str2, th);
            }
            if (strHttpGet == null) {
                Log.w(TAG, "check endpoint returned no data: " + str2);
            } else {
                new JSONObject(strHttpGet);
                return new GetResult(str2, strHttpGet);
            }
        }
        return null;
    }

    private static final class GetResult {
        final String base;
        final String body;

        GetResult(String str, String str2) {
            this.base = str;
            this.body = str2;
        }
    }

    private static String httpGet(String str, int i2) throws Exception {
        for (int i3 = 0; i3 < i2; i3++) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(12000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setRequestProperty("Accept", "application/json");
            DiagnosticsLogger.networkStart("ota-manifest", httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308) {
                DiagnosticsLogger.networkEnd("ota-manifest", httpURLConnection, responseCode, 0L, null);
                str = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (str == null) {
                    return null;
                }
            } else {
                if (responseCode != 200) {
                    DiagnosticsLogger.networkEnd("ota-manifest", httpURLConnection, responseCode, 0L, null);
                    httpURLConnection.disconnect();
                    return null;
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i4 = inputStream.read(bArr);
                    if (i4 > 0) {
                        byteArrayOutputStream.write(bArr, 0, i4);
                    } else {
                        inputStream.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        DiagnosticsLogger.networkEnd("ota-manifest", httpURLConnection, responseCode, byteArray.length, null);
                        httpURLConnection.disconnect();
                        return new String(byteArray, "UTF-8");
                    }
                }
            }
        }
        return null;
    }

    private static String formatSize(long j2) {
        if (j2 <= 0) {
            return "";
        }
        double d2 = j2;
        Double.isNaN(d2);
        return String.format(Locale.US, "%.0f MB", Double.valueOf(d2 / 1048576.0d));
    }

    private static String hex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 >> 4) & 15, 16));
            sb.append(Character.forDigit(b2 & StylePropertiesKt.RightId, 16));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toast(final Activity activity, final String str) {
        if (activity != null) {
            try {
                activity.runOnUiThread(new Runnable() { // from class: com.waze.gw.Updater.7
                    @Override // java.lang.Runnable
                    public void run() {
                        Toast.makeText(activity, str, 0).show();
                    }
                });
            } catch (Throwable th) {
            }
        }
    }

    private static Context appCtx() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }

    private static SharedPreferences p() {
        Context contextAppCtx = appCtx();
        if (contextAppCtx == null) {
            return null;
        }
        return contextAppCtx.getSharedPreferences("waze_hud_gw", 0);
    }

    private static boolean pref(String str, boolean z) {
        SharedPreferences sharedPreferencesP = p();
        return sharedPreferencesP == null ? z : sharedPreferencesP.getBoolean(str, z);
    }

    private static String prefStr(String str, String str2) {
        SharedPreferences sharedPreferencesP = p();
        return sharedPreferencesP == null ? str2 : sharedPreferencesP.getString(str, str2);
    }

    private static long prefLong(String str, long j2) {
        SharedPreferences sharedPreferencesP = p();
        return sharedPreferencesP == null ? j2 : sharedPreferencesP.getLong(str, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putStr(String str, String str2) {
        SharedPreferences sharedPreferencesP = p();
        if (sharedPreferencesP != null) {
            sharedPreferencesP.edit().putString(str, str2).apply();
        }
    }

    private static void putLong(String str, long j2) {
        SharedPreferences sharedPreferencesP = p();
        if (sharedPreferencesP != null) {
            sharedPreferencesP.edit().putLong(str, j2).apply();
        }
    }
}
