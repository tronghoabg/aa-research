package com.waze.gw;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes10.dex */
final class CustomAlertAudio {
    private static final String DIRECTORY = "custom_audio";
    static final int GROUP_ALL = 7;
    static final int GROUP_CURRENT_SPEED = 2;
    static final int GROUP_NEXT_SPEED = 4;
    static final int GROUP_OVERSPEED = 1;
    static final long MAX_BYTES = 16777216;
    static final long MAX_DURATION_MS = 30000;
    private static final long MAX_PACKAGE_BYTES = 134217728;
    private static final int MAX_PACKAGE_RECORDINGS = 64;
    static final int MODE_DEFAULT = 0;
    static final int MODE_FILE = 1;
    static final int MODE_RECORDING = 2;
    private static final String PACKAGE_FORMAT = "wazemod-recordings";
    private static final int PACKAGE_VERSION = 1;
    static final String PREF_MODE_PREFIX = "custom_alert_audio_mode_";
    static final String PREF_NAME_PREFIX = "custom_alert_audio_name_";
    private static final String TAG = "WazeGW-CustomAudio";

    private CustomAlertAudio() {
    }

    static File file(Context context, String str) {
        File file = new File(context.getFilesDir(), DIRECTORY);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, safeSlot(str) + ".audio");
    }

    static File recordingTempFile(Context context, String str) {
        return new File(file(context, str).getParentFile(), safeSlot(str) + ".recording.tmp.m4a");
    }

    static boolean hasAudio(Context context, String str) {
        try {
            File file = file(context, str);
            if (!file.isFile() || file.length() <= 0) {
                return false;
            }
            return isPlayable(file);
        } catch (Throwable th) {
            return false;
        }
    }

    static boolean importUri(Context context, String str, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        File file = file(context, str);
        File file2 = new File(file.getParentFile(), safeSlot(str) + ".import.tmp");
        deleteQuietly(file2);
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                if (inputStreamOpenInputStream != null) {
                    try {
                        byte[] bArr = new byte[16384];
                        long j2 = 0;
                        while (true) {
                            int i2 = inputStreamOpenInputStream.read(bArr);
                            if (i2 >= 0) {
                                j2 += i2;
                                if (j2 > MAX_BYTES) {
                                    throw new IllegalArgumentException("audio too large");
                                }
                                fileOutputStream.write(bArr, 0, i2);
                            } else {
                                fileOutputStream.getFD().sync();
                                fileOutputStream.close();
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                                return installValidated(file2, file);
                            }
                        }
                    } finally {
                    }
                } else {
                    fileOutputStream.close();
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    return false;
                }
            } finally {
            }
        } catch (Throwable th) {
            Log.w(TAG, "Unable to import custom alert audio", th);
            deleteQuietly(file2);
            return false;
        }
    }

    static boolean commitRecording(Context context, String str, File file) {
        if (context == null || file == null || !file.isFile() || file.length() <= 0 || file.length() > MAX_BYTES) {
            deleteQuietly(file);
            return false;
        }
        return installValidated(file, file(context, str));
    }

    static boolean exportToUri(Context context, String str, Uri uri) {
        if (context == null || uri == null || !hasAudio(context, str)) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file(context, str));
            try {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "w");
                if (outputStreamOpenOutputStream != null) {
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i2 = fileInputStream.read(bArr);
                            if (i2 < 0) {
                                break;
                            }
                            outputStreamOpenOutputStream.write(bArr, 0, i2);
                        }
                        outputStreamOpenOutputStream.flush();
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                        fileInputStream.close();
                        return true;
                    } finally {
                    }
                }
                if (outputStreamOpenOutputStream != null) {
                    outputStreamOpenOutputStream.close();
                }
                fileInputStream.close();
                return false;
            } finally {
            }
        } catch (Throwable th) {
            Log.w(TAG, "Unable to export custom alert recording", th);
            return false;
        }
    }

    static int recordingCount(Context context, SharedPreferences sharedPreferences) {
        return recordingSlots(context, sharedPreferences).size();
    }

    static int resetGroups(Context context, SharedPreferences sharedPreferences, int i2) {
        int i3;
        if (context == null || sharedPreferences == null || (i3 = i2 & 7) == 0) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        if ((i3 & 1) != 0) {
            arrayList.add("overspeed");
        }
        if ((i3 & 2) != 0) {
            for (int i4 : supportedSpeeds()) {
                arrayList.add("current_" + i4);
            }
        }
        if ((i3 & 4) != 0) {
            for (int i5 : supportedSpeeds()) {
                arrayList.add("next_" + i5);
            }
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            int i7 = sharedPreferences.getInt(modeKey(str), 0);
            File file = file(context, str);
            if (i7 != 0 || file.exists()) {
                i6++;
            }
            reset(context, str);
            editorEdit.putInt(modeKey(str), 0);
            editorEdit.remove(nameKey(str));
        }
        editorEdit.apply();
        return i6;
    }

    private static int[] supportedSpeeds() {
        return new int[]{10, 20, 30, 35, 40, 50, 60, 70, 80, 90, 100, 110, 120};
    }

    static int exportRecordingPackage(Context context, SharedPreferences sharedPreferences, Uri uri) {
        ZipOutputStream zipOutputStream;
        if (context == null || sharedPreferences == null || uri == null) {
            return -1;
        }
        ArrayList<String> arrayListRecordingSlots = recordingSlots(context, sharedPreferences);
        if (arrayListRecordingSlots.isEmpty()) {
            return 0;
        }
        Properties properties = new Properties();
        properties.setProperty("format", PACKAGE_FORMAT);
        properties.setProperty("version", String.valueOf(1));
        properties.setProperty("created_at_ms", String.valueOf(System.currentTimeMillis()));
        properties.setProperty("count", String.valueOf(arrayListRecordingSlots.size()));
        Iterator<String> it = arrayListRecordingSlots.iterator();
        while (it.hasNext()) {
            String next = it.next();
            File file = file(context, next);
            properties.setProperty("audio." + next + ".size", String.valueOf(file.length()));
            properties.setProperty("audio." + next + ".sha256", sha256(file));
        }
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "w");
            if (outputStreamOpenOutputStream == null) {
                zipOutputStream = null;
            } else {
                try {
                    zipOutputStream = new ZipOutputStream(outputStreamOpenOutputStream);
                } finally {
                }
            }
            if (zipOutputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    properties.store(byteArrayOutputStream, "WazeMod user recordings only");
                    putZipBytes(zipOutputStream, "manifest.properties", byteArrayOutputStream.toByteArray());
                    Iterator<String> it2 = arrayListRecordingSlots.iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        putZipFile(zipOutputStream, "audio/" + next2 + ".m4a", file(context, next2));
                    }
                    zipOutputStream.finish();
                    int size = arrayListRecordingSlots.size();
                    if (zipOutputStream != null) {
                        zipOutputStream.close();
                    }
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                    return size;
                } finally {
                }
            }
            if (zipOutputStream != null) {
                zipOutputStream.close();
            }
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.close();
            }
            return -1;
        } catch (Throwable th) {
            Log.w(TAG, "Unable to export recording package", th);
            return -1;
        }
    }

    static int importRecordingPackage(Context context, SharedPreferences sharedPreferences, Uri uri) {
        return importRecordingPackage(context, sharedPreferences, uri, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0225, code lost:
    
        if (r2.hasNext() == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0227, code lost:
    
        r3 = (java.lang.String) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0231, code lost:
    
        if (slotMatchesGroups(r3, r5) == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0233, code lost:
    
        r1.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023b, code lost:
    
        if (r1.isEmpty() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023d, code lost:
    
        if (r10 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023f, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0242, code lost:
    
        if (r26 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0244, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0247, code lost:
    
        deleteTree(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024d, code lost:
    
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0255, code lost:
    
        if (r2.hasNext() == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0257, code lost:
    
        r3 = (java.lang.String) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x027b, code lost:
    
        if (installValidated(new java.io.File(r8, r3 + ".audio"), file(r24, r3)) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0296, code lost:
    
        throw new java.lang.IllegalStateException("unable to activate " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0297, code lost:
    
        r0 = r25.edit();
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a3, code lost:
    
        if (r2.hasNext() == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a5, code lost:
    
        r3 = (java.lang.String) r2.next();
        r0.putInt(modeKey(r3), 2);
        r0.putString(nameKey(r3), "Bản thu đã nhập");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02bd, code lost:
    
        r0.apply();
        r0 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02c4, code lost:
    
        if (r10 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02c6, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c9, code lost:
    
        if (r26 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02cb, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02d1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e4, code lost:
    
        throw new java.lang.IllegalArgumentException("invalid recording manifest");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
    
        throw new java.lang.IllegalArgumentException("invalid package entry");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014b, code lost:
    
        if (r9 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0159, code lost:
    
        if (com.waze.gw.CustomAlertAudio.PACKAGE_FORMAT.equals(r9.getProperty("format")) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0166, code lost:
    
        if (1 != java.lang.Integer.parseInt(r9.getProperty("version", "-1"))) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        if (r7.isEmpty() != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017c, code lost:
    
        if (r7.size() != java.lang.Integer.parseInt(r9.getProperty("count", "-1"))) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017e, code lost:
    
        r6 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0186, code lost:
    
        if (r6.hasNext() == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0188, code lost:
    
        r11 = (java.lang.String) r6.next();
        r12 = new java.io.File(r8, r11 + ".audio");
        r13 = java.lang.Long.parseLong(r9.getProperty("audio." + r11 + ".size", "-1"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d0, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d2, code lost:
    
        r1 = r9.getProperty("audio." + r11 + ".sha256", "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e8, code lost:
    
        if (r12.length() != r13) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f2, code lost:
    
        if (r1.equalsIgnoreCase(sha256(r12)) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f8, code lost:
    
        if (isPlayable(r12) == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01fa, code lost:
    
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0215, code lost:
    
        throw new java.lang.IllegalArgumentException("invalid recording " + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0216, code lost:
    
        r26 = r1;
        r1 = new java.util.ArrayList();
        r2 = r7.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0302 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[Catch: all -> 0x030b, SYNTHETIC, TRY_LEAVE, TryCatch #9 {all -> 0x030b, blocks: (B:111:0x0244, B:160:0x030a, B:159:0x0307, B:130:0x02cb, B:156:0x0302), top: B:188:0x0056, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int importRecordingPackage(android.content.Context r24, android.content.SharedPreferences r25, android.net.Uri r26, int r27) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.CustomAlertAudio.importRecordingPackage(android.content.Context, android.content.SharedPreferences, android.net.Uri, int):int");
    }

    private static ArrayList<String> recordingSlots(Context context, SharedPreferences sharedPreferences) {
        ArrayList<String> arrayList = new ArrayList<>();
        File[] fileArrListFiles = file(context, "scan").getParentFile().listFiles();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (name.endsWith(".audio")) {
                String strSubstring = name.substring(0, name.length() - ".audio".length());
                if (isSafeSlot(strSubstring) && sharedPreferences.getInt(modeKey(strSubstring), 0) == 2 && hasAudio(context, strSubstring)) {
                    arrayList.add(strSubstring);
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static String packageSlot(String str) {
        if (str == null || !str.startsWith("audio/") || !str.endsWith(".m4a")) {
            return null;
        }
        String strSubstring = str.substring("audio/".length(), str.length() - ".m4a".length());
        if (isSafeSlot(strSubstring) && str.equals("audio/" + strSubstring + ".m4a")) {
            return strSubstring;
        }
        return null;
    }

    private static boolean slotMatchesGroups(String str, int i2) {
        return "overspeed".equals(str) ? (i2 & 1) != 0 : (str == null || !str.startsWith("current_")) ? (str == null || !str.startsWith("next_") || (i2 & 4) == 0) ? false : true : (i2 & 2) != 0;
    }

    private static void putZipBytes(ZipOutputStream zipOutputStream, String str, byte[] bArr) throws Exception {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(bArr);
        zipOutputStream.closeEntry();
    }

    private static void putZipFile(ZipOutputStream zipOutputStream, String str, File file) throws Exception {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 < 0) {
                    fileInputStream.close();
                    zipOutputStream.closeEntry();
                    return;
                }
                zipOutputStream.write(bArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    private static String sha256(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[16384];
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 < 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i2);
                }
                StringBuilder sb = new StringBuilder(64);
                for (byte b2 : messageDigest.digest()) {
                    sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
                }
                String string = sb.toString();
                fileInputStream.close();
                return string;
            } finally {
            }
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    private static void deleteTree(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                deleteTree(file2);
            }
        }
        deleteQuietly(file);
    }

    static void reset(Context context, String str) {
        if (context == null) {
            return;
        }
        deleteQuietly(file(context, str));
        deleteQuietly(recordingTempFile(context, str));
    }

    private static boolean installValidated(File file, File file2) {
        if (!isPlayable(file)) {
            deleteQuietly(file);
            return false;
        }
        deleteQuietly(file2);
        if (file.renameTo(file2)) {
            return true;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 < 0) {
                            fileOutputStream.getFD().sync();
                            deleteQuietly(file);
                            boolean zIsPlayable = isPlayable(file2);
                            fileOutputStream.close();
                            fileInputStream.close();
                            return zIsPlayable;
                        }
                        fileOutputStream.write(bArr, 0, i2);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            Log.w(TAG, "Unable to activate custom alert audio", th);
            deleteQuietly(file);
            deleteQuietly(file2);
            return false;
        }
    }

    private static boolean isPlayable(File file) {
        if (file == null || !file.isFile() || file.length() <= 0 || file.length() > MAX_BYTES) {
            return false;
        }
        long jDurationMs = durationMs(file);
        return jDurationMs > 0 && jDurationMs <= 30000;
    }

    static long durationMs(File file) {
        if (file == null || !file.isFile() || file.length() <= 0) {
            return -1L;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            return strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : -1L;
        } catch (Throwable th) {
            try {
                Log.w(TAG, "Rejected invalid custom alert audio", th);
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable th2) {
                }
                return -1L;
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable th3) {
                }
            }
        }
    }

    static void deleteQuietly(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable th) {
            }
        }
    }

    static String modeKey(String str) {
        return PREF_MODE_PREFIX + safeSlot(str);
    }

    static String nameKey(String str) {
        return PREF_NAME_PREFIX + safeSlot(str);
    }

    private static String safeSlot(String str) {
        return !isSafeSlot(str) ? "invalid" : str;
    }

    private static boolean isSafeSlot(String str) {
        return str != null && str.matches("[a-z0-9_]{1,32}");
    }
}
