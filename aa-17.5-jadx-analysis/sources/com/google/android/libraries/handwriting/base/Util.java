package com.google.android.libraries.handwriting.base;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Environment;
import android.os.PowerManager;
import android.util.Log;
import defpackage.a;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class Util {
    private static final String TAG = "HWRUtil";

    public static class CRCCheckFailedException extends Exception {
        public CRCCheckFailedException(String str) {
            super(str);
        }
    }

    public interface DownloadCallback {
        void onProgressUpdate(int i);
    }

    public static class SizeCheckFailedException extends Exception {
        public SizeCheckFailedException(String str) {
            super(str);
        }
    }

    public static byte[] bytesFromStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                Log.i(TAG, a.bn(i, "Put ", " bytes into byte buffer"));
                return byteArrayOutputStream.toByteArray();
            }
            i += i2;
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static String computeCRCForStream(InputStream inputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 0) {
                return String.format(Locale.ROOT, "%08X", Long.valueOf(crc32.getValue()));
            }
            crc32.update(bArr, 0, i);
        }
    }

    public static String copyToDiskFromAssets(Context context, String str, String str2) throws IOException {
        Log.i(TAG, a.bM(str2, str, "Copying from assets ", " -> "));
        AssetManager assets = context.getAssets();
        String strSubstring = str.substring(9);
        InputStream inputStreamOpen = assets.open(strSubstring);
        long jAvailable = inputStreamOpen.available();
        if (strSubstring.endsWith(".zip")) {
            ZipInputStream zipInputStream = new ZipInputStream(inputStreamOpen);
            jAvailable = zipInputStream.getNextEntry().getSize();
            inputStreamOpen = zipInputStream;
        }
        try {
            writeStreamToFile(inputStreamOpen, a.bK(str2, ".tmp"), null, jAvailable);
            if (new File(a.bK(str2, ".tmp")).renameTo(new File(str2))) {
                inputStreamOpen.close();
                Log.i(TAG, "Done copying. Filename: ".concat(String.valueOf(str2)));
                return str2;
            }
            throw new IOException("Renaming " + str2 + ".tmp -> " + str2 + " failed.");
        } catch (CRCCheckFailedException | SizeCheckFailedException | IOException e) {
            if (!new File(String.valueOf(str2).concat(".tmp")).delete() || !new File(str2).delete()) {
                Log.i(TAG, "Problem with unzipping and with cleaning up the mess we made.");
            }
            throw new IOException(e);
        }
    }

    public static void downloadFile(String str, OutputStream outputStream, DownloadCallback downloadCallback) throws IOException {
        Log.i(TAG, "downloadFile: ".concat(String.valueOf(str)));
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                throw new IOException("Got connection response: " + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage());
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            int contentLength = httpURLConnection.getContentLength();
            byte[] bArr = new byte[8096];
            long j = 0;
            long j2 = 0;
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    outputStream.close();
                    Log.i(TAG, a.bz(str, "Finished downloading "));
                    return;
                }
                long j3 = i;
                j += j3;
                j2 += j3;
                outputStream.write(bArr, 0, i);
                if ((contentLength > 0 && j2 > 65356) || j == contentLength) {
                    if (downloadCallback != null) {
                        downloadCallback.onProgressUpdate((int) ((100 * j) / contentLength));
                    }
                    j2 = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean fileExistsOrCopiedFromAssets(Context context, String str, String str2) {
        if ((!str2.startsWith(Environment.getExternalStorageDirectory().getPath()) || !new File(str2).exists()) && !privateFileExists(context, str2)) {
            Log.i(TAG, a.bq(str2, "File ", " doesn't exist yet."));
            if (!str.startsWith("assets:")) {
                return false;
            }
            Log.i(TAG, a.bq(str2, "Trying to create ", " from assets."));
            PowerManager.WakeLock wakeLockNewWakeLock = null;
            try {
                try {
                    wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "HWRUtil:");
                    wakeLockNewWakeLock.acquire(600000L);
                    copyToDiskFromAssets(context, str, str2);
                    if (wakeLockNewWakeLock != null && wakeLockNewWakeLock.isHeld()) {
                        try {
                            wakeLockNewWakeLock.release();
                        } catch (RuntimeException unused) {
                        }
                    }
                } catch (IOException e) {
                    Log.e(TAG, a.bz(str2, "Cannot create "), e);
                    if (wakeLockNewWakeLock != null && wakeLockNewWakeLock.isHeld()) {
                        try {
                            wakeLockNewWakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (wakeLockNewWakeLock != null && wakeLockNewWakeLock.isHeld()) {
                    try {
                        wakeLockNewWakeLock.release();
                    } catch (RuntimeException unused3) {
                    }
                }
                throw th;
            }
        }
        return true;
    }

    public static String getAbsoluteFilenameForPrivateFile(Context context, String str) {
        return context.getFileStreamPath(str).toString();
    }

    public static boolean haveExternalStoragePermission(Context context) {
        return context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0;
    }

    public static String maybeMakeFilenameFromUrl(Context context, String str) {
        if (str == null) {
            return null;
        }
        Log.i(TAG, "maybeMakeFilename: ".concat(str));
        if (str.startsWith("assets://")) {
            String strSubstring = str.substring(9);
            if (strSubstring.endsWith(".zip")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 4);
            }
            return getAbsoluteFilenameForPrivateFile(context, strSubstring);
        }
        if (!str.startsWith("http:") && !str.startsWith("https:")) {
            return str.contains("/") ? str : getAbsoluteFilenameForPrivateFile(context, str);
        }
        Uri uri = Uri.parse(str);
        Log.i(TAG, "uri: ".concat(String.valueOf(String.valueOf(uri))));
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment.endsWith(".zip")) {
            lastPathSegment = lastPathSegment.substring(0, lastPathSegment.length() - 4);
        }
        return getAbsoluteFilenameForPrivateFile(context, lastPathSegment);
    }

    public static String maybeUnzip(String str) throws SizeCheckFailedException, IOException, CRCCheckFailedException {
        Log.i(TAG, "maybeUnzip: ".concat(String.valueOf(str)));
        if (!str.endsWith(".zip")) {
            Log.i(TAG, "No need to unzip");
            return str;
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(new File(str)));
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        if (nextEntry == null) {
            throw new IOException("ZIP file has no single entry: ".concat(String.valueOf(str)));
        }
        long size = nextEntry.getSize();
        int length = str.length();
        String strSubstring = str.substring(length - 12, length - 4);
        Log.i(TAG, a.bM(strSubstring, str, "uri: ", " expected CRC: "));
        String strSubstring2 = str.substring(0, str.length() - 4);
        writeStreamToFile(zipInputStream, String.valueOf(strSubstring2).concat(".tmp"), strSubstring, size);
        if (!new File(String.valueOf(strSubstring2).concat(".tmp")).renameTo(new File(strSubstring2))) {
            throw new IOException("Renaming " + strSubstring2 + ".tmp -> " + strSubstring2 + " failed.");
        }
        if (new File(str).delete()) {
            Log.i(TAG, a.bq(str, "Deleting file ", " succeeded."));
        } else {
            Log.e(TAG, a.bq(str, "Deleting file ", " failed."));
        }
        Log.i(TAG, "Unzipped " + size + " with expected CRC: " + strSubstring);
        return strSubstring2;
    }

    public static InputStream openStream(String str, Context context) throws IOException {
        Log.i(TAG, "Opening stream ".concat(String.valueOf(str)));
        if (context != null) {
            int identifier = context.getResources().getIdentifier(str, null, context.getPackageName());
            Log.i(TAG, a.bp(identifier, "Got resource id "));
            if (identifier > 0) {
                return context.getResources().openRawResource(identifier);
            }
        }
        Log.i(TAG, "Trying to open as file ".concat(String.valueOf(str)));
        return new FileInputStream(str);
    }

    public static boolean privateFileExists(Context context, String str) {
        return context.getFileStreamPath(new File(str).getName()).exists();
    }

    public static String readStreamToString(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        char[] cArr = new char[1024];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (i == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    public static void writeStreamToFile(InputStream inputStream, String str, String str2, long j) throws SizeCheckFailedException, IOException, CRCCheckFailedException {
        CRC32 crc32 = new CRC32();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 < 0) {
                break;
            }
            bufferedOutputStream.write(bArr, 0, i2);
            i += i2;
            crc32.update(bArr, 0, i2);
        }
        String str3 = String.format(Locale.ROOT, "%08X", Long.valueOf(crc32.getValue()));
        Log.i(TAG, a.bM(str2, str3, "CRC32: ", " expected: "));
        if (str2 != null && !str3.equals(str2)) {
            throw new CRCCheckFailedException(a.bM(str3, str2, "expected: ", " computed: "));
        }
        Log.i(TAG, "size: " + i + " expected: " + j);
        if (j < 0 || i >= j) {
            inputStream.close();
            bufferedOutputStream.close();
        } else {
            throw new SizeCheckFailedException("expected: " + j + " writtenSize: " + i);
        }
    }
}
