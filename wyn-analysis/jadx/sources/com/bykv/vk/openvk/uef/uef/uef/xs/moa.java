package com.bykv.vk.openvk.uef.uef.uef.xs;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class moa {
    public static JSONArray uef() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        HashSet hashSet = new HashSet();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder() && (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias())) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equals(MimeTypes.VIDEO_H265) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(MimeTypes.VIDEO_H265)) != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            hashSet.add(uef(codecProfileLevel.level));
                        }
                    }
                }
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    private static String uef(int i5) throws SecurityException {
        for (Field field : MediaCodecInfo.CodecProfileLevel.class.getFields()) {
            String name = field.getName();
            if (field.getType() == Integer.TYPE && name.contains("HEVC")) {
                try {
                    if (field.getInt(null) == i5) {
                        return name;
                    }
                } catch (IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return String.valueOf(i5);
    }

    public static int uef(File file) throws Throwable {
        FileInputStream fileInputStream;
        if (file != null && file.exists()) {
            long length = file.length();
            if (length <= 0) {
                return -1;
            }
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[8];
                long j8 = 0;
                while (fileInputStream.read(bArr) == 8) {
                    long j10 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (255 & bArr[3]);
                    if (bArr[4] != 109 || bArr[5] != 111 || bArr[6] != 111 || bArr[7] != 118) {
                        long j11 = j10 - 8;
                        if (j11 > 0 && fileInputStream.skip(j11) < j11) {
                            break;
                        }
                        j8 += j10;
                    } else {
                        break;
                    }
                }
                int i5 = (int) ((j8 * 100.0f) / length);
                try {
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
                return i5;
            } catch (Exception unused3) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused5) {
                    }
                }
                throw th;
            }
        }
        return -1;
    }

    public static int uef(String str) {
        MediaExtractor mediaExtractor;
        try {
            mediaExtractor = new MediaExtractor();
        } catch (Throwable unused) {
            mediaExtractor = null;
        }
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            for (int i5 = 0; i5 < trackCount; i5++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i5);
                String string = trackFormat.getString("mime");
                if (string != null && ((MimeTypes.VIDEO_H264.equals(string) || MimeTypes.VIDEO_H265.equals(string)) && trackFormat.containsKey(AppLovinEventTypes.USER_COMPLETED_LEVEL))) {
                    int integer = trackFormat.getInteger(AppLovinEventTypes.USER_COMPLETED_LEVEL);
                    mediaExtractor.release();
                    return integer;
                }
            }
        } catch (Throwable unused2) {
            if (mediaExtractor == null) {
                return -1;
            }
            mediaExtractor.release();
            return -1;
        }
        mediaExtractor.release();
        return -1;
    }
}
