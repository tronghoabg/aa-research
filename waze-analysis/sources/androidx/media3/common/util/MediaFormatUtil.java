package androidx.media3.common.util;

import android.media.MediaFormat;
import androidx.camera.video.internal.utils.MediaFormatExt;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import com.google.d.d.bi;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MediaFormatUtil {
    public static final String KEY_MAX_BIT_RATE = "max-bitrate";
    public static final String KEY_PCM_ENCODING_EXTENDED = "exo-pcm-encoding-int";
    public static final String KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";
    private static final int MAX_POWER_OF_TWO_INT = 1073741824;

    private MediaFormatUtil() {
    }

    public static Format createFormatFromMediaFormat(MediaFormat mediaFormat) {
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(mediaFormat.getString("mime"));
        builder.setLanguage(mediaFormat.getString("language"));
        builder.setPeakBitrate(getInteger(mediaFormat, KEY_MAX_BIT_RATE, -1));
        builder.setAverageBitrate(getInteger(mediaFormat, "bitrate", -1));
        builder.setCodecs(getCodecString(mediaFormat));
        builder.setFrameRate(getFloatFromIntOrFloat(mediaFormat, "frame-rate", -1.0f));
        builder.setWidth(getInteger(mediaFormat, "width", -1));
        builder.setHeight(getInteger(mediaFormat, "height", -1));
        builder.setPixelWidthHeightRatio(getPixelWidthHeightRatio(mediaFormat, 1.0f));
        builder.setMaxInputSize(getInteger(mediaFormat, "max-input-size", -1));
        int i2 = 0;
        builder.setRotationDegrees(getInteger(mediaFormat, "rotation-degrees", 0));
        builder.setColorInfo(getColorInfo(mediaFormat));
        builder.setSampleRate(getInteger(mediaFormat, "sample-rate", -1));
        builder.setPcmEncoding(getPcmEncoding(mediaFormat));
        int integer = getInteger(mediaFormat, "channel-count", -1);
        int integer2 = getInteger(mediaFormat, "channel-mask", -1);
        int i3 = (integer == -1 || integer2 == -1 || Integer.bitCount(integer2) == integer) ? integer2 : -1;
        builder.setChannelCount(integer);
        builder.setChannelMask(i3);
        bi biVar = new bi();
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(a.a(i2, "csd-"));
            if (byteBuffer == null) {
                break;
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            biVar.g(bArr);
            i2++;
        }
        builder.setInitializationData(biVar.f());
        if (mediaFormat.containsKey("track-id")) {
            builder.setId(mediaFormat.getInteger("track-id"));
        }
        return builder.build();
    }

    public static MediaFormat createMediaFormatFromFormat(Format format) {
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", format.bitrate);
        maybeSetInteger(mediaFormat, KEY_MAX_BIT_RATE, format.peakBitrate);
        maybeSetInteger(mediaFormat, "channel-count", format.channelCount);
        int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format);
        if (audioTrackChannelConfig != 0) {
            mediaFormat.setInteger("channel-mask", audioTrackChannelConfig);
        }
        maybeSetColorInfo(mediaFormat, format.colorInfo);
        maybeSetString(mediaFormat, "mime", format.sampleMimeType);
        maybeSetString(mediaFormat, "codecs-string", format.codecs);
        maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        maybeSetInteger(mediaFormat, "width", format.width);
        maybeSetInteger(mediaFormat, "height", format.height);
        setCsdBuffers(mediaFormat, format.initializationData);
        maybeSetPcmEncoding(mediaFormat, format.pcmEncoding);
        maybeSetString(mediaFormat, "language", format.language);
        maybeSetInteger(mediaFormat, "max-input-size", format.maxInputSize);
        maybeSetInteger(mediaFormat, "sample-rate", format.sampleRate);
        maybeSetInteger(mediaFormat, "caption-service-number", format.accessibilityChannel);
        mediaFormat.setInteger("rotation-degrees", format.rotationDegrees);
        int i2 = format.selectionFlags;
        setBooleanAsInt(mediaFormat, "is-autoselect", i2 & 4);
        setBooleanAsInt(mediaFormat, "is-default", i2 & 1);
        setBooleanAsInt(mediaFormat, "is-forced-subtitle", i2 & 2);
        mediaFormat.setInteger("encoder-delay", format.encoderDelay);
        mediaFormat.setInteger("encoder-padding", format.encoderPadding);
        maybeSetPixelAspectRatio(mediaFormat, format.pixelWidthHeightRatio);
        String str = format.id;
        if (str != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str));
            } catch (NumberFormatException unused) {
            }
        }
        return mediaFormat;
    }

    public static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static String getCodecString(MediaFormat mediaFormat) {
        if (Objects.equals(mediaFormat.getString("mime"), MimeTypes.VIDEO_H263) && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            return CodecSpecificDataUtil.buildH263CodecString(CodecSpecificDataUtil.h263ConstToProfileNumber(mediaFormat.getInteger("profile")), CodecSpecificDataUtil.h263ConstToLevelNumber(mediaFormat.getInteger("level")));
        }
        if (!Objects.equals(mediaFormat.getString("mime"), MimeTypes.VIDEO_DOLBY_VISION) || !mediaFormat.containsKey("profile")) {
            return mediaFormat.getString("codecs-string");
        }
        int integer = getInteger(mediaFormat, "level", -1);
        if (integer == -1) {
            integer = CodecSpecificDataUtil.calculateMediaCodecDolbyVisionLevel(getInteger(mediaFormat, "width", -1), getInteger(mediaFormat, "height", -1), getFloatFromIntOrFloat(mediaFormat, "frame-rate", -1.0f));
        }
        return CodecSpecificDataUtil.buildDolbyVisionCodecString(CodecSpecificDataUtil.dolbyVisionConstantToProfileNumber(mediaFormat.getInteger("profile")), CodecSpecificDataUtil.dolbyVisionConstantToLevelNumber(integer));
    }

    public static ColorInfo getColorInfo(MediaFormat mediaFormat) {
        int i2 = -1;
        int integer = getInteger(mediaFormat, "color-standard", -1);
        int integer2 = getInteger(mediaFormat, "color-range", -1);
        int integer3 = getInteger(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        if (true != isValidColorSpace(integer)) {
            integer = -1;
        }
        if (true != isValidColorRange(integer2)) {
            integer2 = -1;
        }
        if (true != isValidColorTransfer(integer3)) {
            integer3 = -1;
        }
        if (integer != -1) {
            i2 = integer;
        } else if (integer2 == -1) {
            if (integer3 != -1) {
                integer2 = -1;
            } else {
                if (array == null) {
                    return null;
                }
                integer2 = -1;
                integer3 = -1;
            }
        }
        ColorInfo.Builder builder = new ColorInfo.Builder();
        builder.setColorSpace(i2);
        builder.setColorRange(integer2);
        builder.setColorTransfer(integer3);
        builder.setHdrStaticInfo(array);
        return builder.build();
    }

    public static float getFloat(MediaFormat mediaFormat, String str, float f2) {
        return mediaFormat.getFloat(str, f2);
    }

    public static float getFloatFromIntOrFloat(MediaFormat mediaFormat, String str, float f2) {
        return !mediaFormat.containsKey(str) ? f2 : mediaFormat.getValueTypeForKey(str) == 3 ? mediaFormat.getFloat(str) : mediaFormat.getInteger(str);
    }

    public static int getInteger(MediaFormat mediaFormat, String str, int i2) {
        return mediaFormat.getInteger(str, i2);
    }

    private static int getPcmEncoding(MediaFormat mediaFormat) {
        int integer = getInteger(mediaFormat, KEY_PCM_ENCODING_EXTENDED, -1);
        return integer != -1 ? integer : getInteger(mediaFormat, "pcm-encoding", -1);
    }

    private static float getPixelWidthHeightRatio(MediaFormat mediaFormat, float f2) {
        return (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : f2;
    }

    public static String getString(MediaFormat mediaFormat, String str, String str2) {
        return mediaFormat.getString(str, str2);
    }

    public static Integer getTimeLapseFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey(MediaFormatExt.KEY_TIMELAPSE_ENABLED) && mediaFormat.getInteger(MediaFormatExt.KEY_TIMELAPSE_ENABLED) > 0 && mediaFormat.containsKey(MediaFormatExt.KEY_TIMELAPSE_FPS)) {
            return Integer.valueOf(mediaFormat.getInteger(MediaFormatExt.KEY_TIMELAPSE_FPS));
        }
        return null;
    }

    public static boolean isAudioFormat(MediaFormat mediaFormat) {
        return MimeTypes.isAudio(mediaFormat.getString("mime"));
    }

    private static boolean isValidColorRange(int i2) {
        return i2 == 2 || i2 == 1 || i2 == -1;
    }

    private static boolean isValidColorSpace(int i2) {
        return i2 == 2 || i2 == 1 || i2 == 6 || i2 == -1;
    }

    private static boolean isValidColorTransfer(int i2) {
        return i2 == 1 || i2 == 3 || i2 == 2 || i2 == 6 || i2 == 7 || i2 == -1;
    }

    public static boolean isVideoFormat(MediaFormat mediaFormat) {
        return MimeTypes.isVideo(mediaFormat.getString("mime"));
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            maybeSetInteger(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            maybeSetInteger(mediaFormat, "color-standard", colorInfo.colorSpace);
            maybeSetInteger(mediaFormat, "color-range", colorInfo.colorRange);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f2) {
        if (f2 != -1.0f) {
            mediaFormat.setFloat(str, f2);
        }
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    private static void maybeSetPcmEncoding(MediaFormat mediaFormat, int i2) {
        int i3;
        if (i2 == -1) {
            return;
        }
        maybeSetInteger(mediaFormat, KEY_PCM_ENCODING_EXTENDED, i2);
        if (i2 != 0) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        i3 = 21;
                        if (i2 != 21) {
                            i3 = 22;
                            if (i2 != 22) {
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            i3 = 0;
        }
        mediaFormat.setInteger("pcm-encoding", i3);
    }

    private static void maybeSetPixelAspectRatio(MediaFormat mediaFormat, float f2) {
        int i2;
        mediaFormat.setFloat(KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT, f2);
        int i3 = 1073741824;
        if (f2 < 1.0f) {
            i3 = (int) (f2 * 1.0737418E9f);
            i2 = 1073741824;
        } else if (f2 > 1.0f) {
            i2 = (int) (1.0737418E9f / f2);
        } else {
            i3 = 1;
            i2 = 1;
        }
        mediaFormat.setInteger("sar-width", i3);
        mediaFormat.setInteger("sar-height", i2);
    }

    public static void maybeSetString(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    private static void setBooleanAsInt(MediaFormat mediaFormat, String str, int i2) {
        mediaFormat.setInteger(str, i2 != 0 ? 1 : 0);
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(a.a(i2, "csd-"), ByteBuffer.wrap(list.get(i2)));
        }
    }
}
