package androidx.camera.video.internal.utils;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.LruCache;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CodecUtil {
    private static final int MAX_CODEC_INFO_CACHE_COUNT = 10;
    private static List<String> allAudioEncoderMimeTypesCache;
    private static List<MediaCodecInfo> allEncoderInfosCache;
    private static List<String> allEncoderMimeTypesCache;
    private static List<String> allVideoEncoderMimeTypesCache;
    public static final CodecUtil INSTANCE = new CodecUtil();
    private static final LruCache<String, MediaCodecInfo> codecInfoCache = new LruCache<>(10);

    private CodecUtil() {
    }

    private final MediaCodec createCodec(String str) throws InvalidConfigException, IOException {
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
            x.c(mediaCodecCreateEncoderByType);
            return mediaCodecCreateEncoderByType;
        } catch (IOException e2) {
            throw new InvalidConfigException(e2);
        } catch (IllegalArgumentException e3) {
            throw new InvalidConfigException(e3);
        }
    }

    public static final MediaCodecInfo findCodecAndGetCodecInfo(String str) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateCodec;
        x.f(str, "mimeType");
        LruCache<String, MediaCodecInfo> lruCache = codecInfoCache;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(str);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodecCreateCodec = INSTANCE.createCodec(str);
            try {
                MediaCodecInfo codecInfo = mediaCodecCreateCodec.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(str, codecInfo);
                }
                if (mediaCodecCreateCodec != null) {
                    mediaCodecCreateCodec.release();
                }
                return codecInfo;
            } catch (Throwable th) {
                th = th;
                if (mediaCodecCreateCodec != null) {
                    mediaCodecCreateCodec.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodecCreateCodec = null;
        }
    }

    private final List<String> getAllAudioEncoderMimeTypes() {
        List<String> list = allAudioEncoderMimeTypesCache;
        if (list != null) {
            return list;
        }
        List<String> allEncoderMimeTypes = getAllEncoderMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allEncoderMimeTypes) {
            if (o.ah((String) obj, "audio/")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        allAudioEncoderMimeTypesCache = arrayList2;
        return arrayList2;
    }

    private final List<MediaCodecInfo> getAllEncoderInfos() {
        List<MediaCodecInfo> list = allEncoderInfosCache;
        if (list != null) {
            return list;
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        x.e(codecInfos, "getCodecInfos(...)");
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        ArrayList arrayList2 = arrayList;
        allEncoderInfosCache = arrayList2;
        return arrayList2;
    }

    private final List<String> getAllEncoderMimeTypes() {
        ArrayList arrayListH;
        List<String> list = allEncoderMimeTypesCache;
        if (list != null) {
            return list;
        }
        List<MediaCodecInfo> allEncoderInfos = getAllEncoderInfos();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = allEncoderInfos.iterator();
        while (it.hasNext()) {
            String[] supportedTypes = ((MediaCodecInfo) it.next()).getSupportedTypes();
            if (supportedTypes != null) {
                ArrayList arrayList2 = new ArrayList(supportedTypes.length);
                for (String str : supportedTypes) {
                    x.c(str);
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    x.e(lowerCase, "toLowerCase(...)");
                    arrayList2.add(lowerCase);
                }
                arrayListH = arrayList2;
            } else {
                arrayListH = i.h();
            }
            i.aD(arrayList, arrayListH);
        }
        List<String> listAa = i.aa(arrayList);
        allEncoderMimeTypesCache = listAa;
        return listAa;
    }

    private final List<String> getAllVideoEncoderMimeTypes() {
        List<String> list = allVideoEncoderMimeTypesCache;
        if (list != null) {
            return list;
        }
        List<String> allEncoderMimeTypes = getAllEncoderMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allEncoderMimeTypes) {
            if (o.ah((String) obj, "video/")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        allVideoEncoderMimeTypesCache = arrayList2;
        return arrayList2;
    }

    public static final List<String> getAudioEncoderMimeTypes() {
        return INSTANCE.getAllAudioEncoderMimeTypes();
    }

    public static final List<String> getVideoEncoderMimeTypes() {
        return INSTANCE.getAllVideoEncoderMimeTypes();
    }

    public final void reset() {
        allEncoderInfosCache = null;
        allEncoderMimeTypesCache = null;
        allVideoEncoderMimeTypesCache = null;
        allAudioEncoderMimeTypesCache = null;
        LruCache<String, MediaCodecInfo> lruCache = codecInfoCache;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
    }

    public static final MediaCodec createCodec(EncoderConfig encoderConfig) {
        x.f(encoderConfig, "encoderConfig");
        CodecUtil codecUtil = INSTANCE;
        String mimeType = encoderConfig.getMimeType();
        x.e(mimeType, "getMimeType(...)");
        return codecUtil.createCodec(mimeType);
    }
}
