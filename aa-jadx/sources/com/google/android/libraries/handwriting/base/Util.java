package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class Util {
    private static final java.lang.String TAG = "HWRUtil";

    public static class CRCCheckFailedException extends java.lang.Exception {
        public CRCCheckFailedException(java.lang.String str) {
            super(str);
        }
    }

    public interface DownloadCallback {
        void onProgressUpdate(int i);
    }

    public static class SizeCheckFailedException extends java.lang.Exception {
        public SizeCheckFailedException(java.lang.String str) {
            super(str);
        }
    }

    public static byte[] bytesFromStream(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(inputStream.available());
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                android.util.Log.i(TAG, defpackage.a.bm(i, "Put ", " bytes into byte buffer"));
                return byteArrayOutputStream.toByteArray();
            }
            i += i2;
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static java.lang.String computeCRCForStream(java.io.InputStream inputStream) throws java.io.IOException {
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 0) {
                return java.lang.String.format(java.util.Locale.ROOT, "%08X", java.lang.Long.valueOf(crc32.getValue()));
            }
            crc32.update(bArr, 0, i);
        }
    }

    public static java.lang.String copyToDiskFromAssets(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        android.util.Log.i(TAG, defpackage.a.bL(str2, str, "Copying from assets ", " -> "));
        android.content.res.AssetManager assets = context.getAssets();
        java.lang.String strSubstring = str.substring(9);
        java.io.InputStream inputStreamOpen = assets.open(strSubstring);
        long jAvailable = inputStreamOpen.available();
        if (strSubstring.endsWith(".zip")) {
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(inputStreamOpen);
            jAvailable = zipInputStream.getNextEntry().getSize();
            inputStreamOpen = zipInputStream;
        }
        try {
            writeStreamToFile(inputStreamOpen, defpackage.a.bJ(str2, ".tmp"), null, jAvailable);
            if (new java.io.File(defpackage.a.bJ(str2, ".tmp")).renameTo(new java.io.File(str2))) {
                inputStreamOpen.close();
                android.util.Log.i(TAG, "Done copying. Filename: ".concat(java.lang.String.valueOf(str2)));
                return str2;
            }
            throw new java.io.IOException("Renaming " + str2 + ".tmp -> " + str2 + " failed.");
        } catch (com.google.android.libraries.handwriting.base.Util.CRCCheckFailedException | com.google.android.libraries.handwriting.base.Util.SizeCheckFailedException | java.io.IOException e) {
            if (!new java.io.File(java.lang.String.valueOf(str2).concat(".tmp")).delete() || !new java.io.File(str2).delete()) {
                android.util.Log.i(TAG, "Problem with unzipping and with cleaning up the mess we made.");
            }
            throw new java.io.IOException(e);
        }
    }

    public static void downloadFile(java.lang.String str, java.io.OutputStream outputStream, com.google.android.libraries.handwriting.base.Util.DownloadCallback downloadCallback) {
        android.util.Log.i(TAG, "downloadFile: ".concat(java.lang.String.valueOf(str)));
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                throw new java.io.IOException("Got connection response: " + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage());
            }
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            int contentLength = httpURLConnection.getContentLength();
            byte[] bArr = new byte[8096];
            long j = 0;
            long j2 = 0;
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    outputStream.close();
                    android.util.Log.i(TAG, defpackage.a.bA(str, "Finished downloading "));
                    return;
                }
                long j3 = i;
                j += j3;
                j2 += j3;
                outputStream.write(bArr, 0, i);
                if ((contentLength > 0 && j2 > 65356) || j == contentLength) {
                    if (downloadCallback != null) {
                        downloadCallback.onProgressUpdate((int) ((100 * j) / ((long) contentLength)));
                    }
                    j2 = 0;
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean fileExistsOrCopiedFromAssets(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if ((!str2.startsWith(android.os.Environment.getExternalStorageDirectory().getPath()) || !new java.io.File(str2).exists()) && !privateFileExists(context, str2)) {
            android.util.Log.i(TAG, defpackage.a.bp(str2, "File ", " doesn't exist yet."));
            if (!str.startsWith("assets:")) {
                return false;
            }
            android.util.Log.i(TAG, defpackage.a.bp(str2, "Trying to create ", " from assets."));
            android.os.PowerManager.WakeLock wakeLockNewWakeLock = null;
            try {
                wakeLockNewWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, "HWRUtil:");
                wakeLockNewWakeLock.acquire(600000L);
                copyToDiskFromAssets(context, str, str2);
            } catch (java.io.IOException e) {
                android.util.Log.e(TAG, defpackage.a.bA(str2, "Cannot create "), e);
                return false;
            } finally {
                if (wakeLockNewWakeLock != null && wakeLockNewWakeLock.isHeld()) {
                    try {
                        wakeLockNewWakeLock.release();
                    } catch (java.lang.RuntimeException unused) {
                    }
                }
            }
        }
        return true;
    }

    public static java.lang.String getAbsoluteFilenameForPrivateFile(android.content.Context context, java.lang.String str) {
        return context.getFileStreamPath(str).toString();
    }

    public static boolean haveExternalStoragePermission(android.content.Context context) {
        return context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0;
    }

    public static java.lang.String maybeMakeFilenameFromUrl(android.content.Context context, java.lang.String str) {
        if (str == null) {
            return null;
        }
        android.util.Log.i(TAG, "maybeMakeFilename: ".concat(str));
        if (str.startsWith("assets://")) {
            java.lang.String strSubstring = str.substring(9);
            if (strSubstring.endsWith(".zip")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 4);
            }
            return getAbsoluteFilenameForPrivateFile(context, strSubstring);
        }
        if (!str.startsWith("http:") && !str.startsWith("https:")) {
            return str.contains("/") ? str : getAbsoluteFilenameForPrivateFile(context, str);
        }
        android.net.Uri uri = android.net.Uri.parse(str);
        android.util.Log.i(TAG, "uri: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment.endsWith(".zip")) {
            lastPathSegment = lastPathSegment.substring(0, lastPathSegment.length() - 4);
        }
        return getAbsoluteFilenameForPrivateFile(context, lastPathSegment);
    }

    public static java.lang.String maybeUnzip(java.lang.String str) throws com.google.android.libraries.handwriting.base.Util.SizeCheckFailedException, java.io.IOException, com.google.android.libraries.handwriting.base.Util.CRCCheckFailedException {
        android.util.Log.i(TAG, "maybeUnzip: ".concat(java.lang.String.valueOf(str)));
        if (!str.endsWith(".zip")) {
            android.util.Log.i(TAG, "No need to unzip");
            return str;
        }
        java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new java.io.FileInputStream(new java.io.File(str)));
        java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
        if (nextEntry == null) {
            throw new java.io.IOException("ZIP file has no single entry: ".concat(java.lang.String.valueOf(str)));
        }
        long size = nextEntry.getSize();
        int length = str.length();
        java.lang.String strSubstring = str.substring(length - 12, length - 4);
        android.util.Log.i(TAG, defpackage.a.bL(strSubstring, str, "uri: ", " expected CRC: "));
        java.lang.String strSubstring2 = str.substring(0, str.length() - 4);
        writeStreamToFile(zipInputStream, java.lang.String.valueOf(strSubstring2).concat(".tmp"), strSubstring, size);
        if (!new java.io.File(java.lang.String.valueOf(strSubstring2).concat(".tmp")).renameTo(new java.io.File(strSubstring2))) {
            throw new java.io.IOException("Renaming " + strSubstring2 + ".tmp -> " + strSubstring2 + " failed.");
        }
        if (new java.io.File(str).delete()) {
            android.util.Log.i(TAG, defpackage.a.bp(str, "Deleting file ", " succeeded."));
        } else {
            android.util.Log.e(TAG, defpackage.a.bp(str, "Deleting file ", " failed."));
        }
        android.util.Log.i(TAG, "Unzipped " + size + " with expected CRC: " + strSubstring);
        return strSubstring2;
    }

    public static java.io.InputStream openStream(java.lang.String str, android.content.Context context) throws java.io.IOException {
        android.util.Log.i(TAG, "Opening stream ".concat(java.lang.String.valueOf(str)));
        if (context != null) {
            int identifier = context.getResources().getIdentifier(str, null, context.getPackageName());
            android.util.Log.i(TAG, defpackage.a.bo(identifier, "Got resource id "));
            if (identifier > 0) {
                return context.getResources().openRawResource(identifier);
            }
        }
        android.util.Log.i(TAG, "Trying to open as file ".concat(java.lang.String.valueOf(str)));
        return new java.io.FileInputStream(str);
    }

    public static boolean privateFileExists(android.content.Context context, java.lang.String str) {
        return context.getFileStreamPath(new java.io.File(str).getName()).exists();
    }

    public static java.lang.String readStreamToString(java.io.InputStream inputStream) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, java.nio.charset.StandardCharsets.UTF_8);
        char[] cArr = new char[1024];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (i == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    public static void writeStreamToFile(java.io.InputStream inputStream, java.lang.String str, java.lang.String str2, long j) throws com.google.android.libraries.handwriting.base.Util.SizeCheckFailedException, java.io.IOException, com.google.android.libraries.handwriting.base.Util.CRCCheckFailedException {
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(str));
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
        java.lang.String str3 = java.lang.String.format(java.util.Locale.ROOT, "%08X", java.lang.Long.valueOf(crc32.getValue()));
        android.util.Log.i(TAG, defpackage.a.bL(str2, str3, "CRC32: ", " expected: "));
        if (str2 != null && !str3.equals(str2)) {
            throw new com.google.android.libraries.handwriting.base.Util.CRCCheckFailedException(defpackage.a.bL(str3, str2, "expected: ", " computed: "));
        }
        android.util.Log.i(TAG, "size: " + i + " expected: " + j);
        if (j < 0 || i >= j) {
            inputStream.close();
            bufferedOutputStream.close();
        } else {
            throw new com.google.android.libraries.handwriting.base.Util.SizeCheckFailedException("expected: " + j + " writtenSize: " + i);
        }
    }
}
