package androidx.media3.common;

import android.text.TextUtils;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MimeTypes {
    public static final String APPLICATION_AIT = "application/vnd.dvb.ait";
    public static final String APPLICATION_CAMERA_MOTION = "application/x-camera-motion";
    public static final String APPLICATION_CEA608 = "application/cea-608";
    public static final String APPLICATION_CEA708 = "application/cea-708";
    public static final String APPLICATION_DEPTH_METADATA = "application/x-depth-metadata";
    public static final String APPLICATION_DVBSUBS = "application/dvbsubs";
    public static final String APPLICATION_EMSG = "application/x-emsg";
    public static final String APPLICATION_EXIF = "application/x-exif";
    public static final String APPLICATION_EXTERNALLY_LOADED_IMAGE = "application/x-image-uri";
    public static final String APPLICATION_ICY = "application/x-icy";
    public static final String APPLICATION_ID3 = "application/id3";
    public static final String APPLICATION_ITUT_T35 = "application/x-itut-t35";
    public static final String APPLICATION_M3U8 = "application/x-mpegURL";
    public static final String APPLICATION_MATROSKA = "application/x-matroska";
    public static final String APPLICATION_MEDIA3_CUES = "application/x-media3-cues";
    public static final String APPLICATION_META = "application/meta";
    public static final String APPLICATION_MP4 = "application/mp4";
    public static final String APPLICATION_MP4CEA608 = "application/x-mp4-cea-608";
    public static final String APPLICATION_MP4VTT = "application/x-mp4-vtt";
    public static final String APPLICATION_MPD = "application/dash+xml";
    public static final String APPLICATION_PGS = "application/pgs";

    @Deprecated
    public static final String APPLICATION_RAWCC = "application/x-rawcc";
    public static final String APPLICATION_RTSP = "application/x-rtsp";
    public static final String APPLICATION_SCTE35 = "application/x-scte35";
    public static final String APPLICATION_SDP = "application/sdp";
    public static final String APPLICATION_SS = "application/vnd.ms-sstr+xml";
    public static final String APPLICATION_SUBRIP = "application/x-subrip";
    public static final String APPLICATION_TTML = "application/ttml+xml";
    public static final String APPLICATION_TX3G = "application/x-quicktime-tx3g";
    public static final String APPLICATION_VOBSUB = "application/vobsub";
    public static final String APPLICATION_WEBM = "application/webm";
    public static final String AUDIO_AAC = "audio/mp4a-latm";
    public static final String AUDIO_AC3 = "audio/ac3";
    public static final String AUDIO_AC4 = "audio/ac4";
    public static final String AUDIO_ALAC = "audio/alac";
    public static final String AUDIO_ALAW = "audio/g711-alaw";
    public static final String AUDIO_AMR = "audio/amr";
    public static final String AUDIO_AMR_NB = "audio/3gpp";
    public static final String AUDIO_AMR_WB = "audio/amr-wb";
    public static final String AUDIO_DSD = "audio/dsd";
    public static final String AUDIO_DTS = "audio/vnd.dts";
    public static final String AUDIO_DTS_EXPRESS = "audio/vnd.dts.hd;profile=lbr";
    public static final String AUDIO_DTS_HD = "audio/vnd.dts.hd";
    public static final String AUDIO_DTS_UHD_P2 = "audio/vnd.dts.uhd;profile=p2";

    @Deprecated
    public static final String AUDIO_DTS_X = "audio/vnd.dts.uhd;profile=p2";
    public static final String AUDIO_EXOPLAYER_MIDI = "audio/x-exoplayer-midi";
    public static final String AUDIO_E_AC3 = "audio/eac3";
    public static final String AUDIO_E_AC3_JOC = "audio/eac3-joc";
    public static final String AUDIO_FLAC = "audio/flac";
    public static final String AUDIO_IAMF = "audio/iamf";
    public static final String AUDIO_MATROSKA = "audio/x-matroska";
    public static final String AUDIO_MIDI = "audio/midi";
    public static final String AUDIO_MLAW = "audio/g711-mlaw";
    public static final String AUDIO_MP4 = "audio/mp4";
    public static final String AUDIO_MPEG = "audio/mpeg";
    public static final String AUDIO_MPEGH_MHA1 = "audio/mha1";
    public static final String AUDIO_MPEGH_MHM1 = "audio/mhm1";
    public static final String AUDIO_MPEG_L1 = "audio/mpeg-L1";
    public static final String AUDIO_MPEG_L2 = "audio/mpeg-L2";
    public static final String AUDIO_MSGSM = "audio/gsm";
    public static final String AUDIO_OGG = "audio/ogg";
    public static final String AUDIO_OPUS = "audio/opus";
    public static final String AUDIO_RAW = "audio/raw";
    public static final String AUDIO_TRUEHD = "audio/true-hd";
    public static final String AUDIO_UNKNOWN = "audio/x-unknown";
    public static final String AUDIO_VORBIS = "audio/vorbis";
    public static final String AUDIO_WAV = "audio/wav";
    public static final String AUDIO_WEBM = "audio/webm";
    public static final String BASE_TYPE_APPLICATION = "application";
    public static final String BASE_TYPE_AUDIO = "audio";
    public static final String BASE_TYPE_IMAGE = "image";
    public static final String BASE_TYPE_TEXT = "text";
    public static final String BASE_TYPE_VIDEO = "video";
    public static final String CODEC_E_AC3_JOC = "ec+3";
    public static final String IMAGE_AVIF = "image/avif";
    public static final String IMAGE_BMP = "image/bmp";
    public static final String IMAGE_HEIC = "image/heic";
    public static final String IMAGE_HEIF = "image/heif";
    public static final String IMAGE_JPEG = "image/jpeg";
    public static final String IMAGE_JPEG_R = "image/jpeg_r";
    public static final String IMAGE_PNG = "image/png";
    public static final String IMAGE_RAW = "image/raw";
    public static final String IMAGE_WEBP = "image/webp";
    public static final String TEXT_SSA = "text/x-ssa";
    public static final String TEXT_UNKNOWN = "text/x-unknown";
    public static final String TEXT_VTT = "text/vtt";
    public static final String VIDEO_APV = "video/apv";
    public static final String VIDEO_AV1 = "video/av01";
    public static final String VIDEO_AVI = "video/x-msvideo";
    public static final String VIDEO_DIVX = "video/divx";
    public static final String VIDEO_DOLBY_VISION = "video/dolby-vision";
    public static final String VIDEO_FLV = "video/x-flv";
    public static final String VIDEO_H263 = "video/3gpp";
    public static final String VIDEO_H264 = "video/avc";
    public static final String VIDEO_H265 = "video/hevc";
    public static final String VIDEO_H266 = "video/vvc";
    public static final String VIDEO_MATROSKA = "video/x-matroska";
    public static final String VIDEO_MJPEG = "video/mjpeg";
    public static final String VIDEO_MP2T = "video/mp2t";
    public static final String VIDEO_MP4 = "video/mp4";
    public static final String VIDEO_MP42 = "video/mp42";
    public static final String VIDEO_MP43 = "video/mp43";
    public static final String VIDEO_MP4V = "video/mp4v-es";
    public static final String VIDEO_MPEG = "video/mpeg";
    public static final String VIDEO_MPEG2 = "video/mpeg2";
    public static final String VIDEO_MV_HEVC = "video/mv-hevc";
    public static final String VIDEO_OGG = "video/ogg";
    public static final String VIDEO_PS = "video/mp2p";
    public static final String VIDEO_QUICK_TIME = "video/quicktime";
    public static final String VIDEO_RAW = "video/raw";
    public static final String VIDEO_UNKNOWN = "video/x-unknown";
    public static final String VIDEO_VC1 = "video/wvc1";
    public static final String VIDEO_VP8 = "video/x-vnd.on2.vp8";
    public static final String VIDEO_VP9 = "video/x-vnd.on2.vp9";
    public static final String VIDEO_WEBM = "video/webm";
    private static final ArrayList<CustomMimeType> customMimeTypes = new ArrayList<>();
    private static final Pattern MP4A_RFC_6381_CODEC_PATTERN = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: WazeSource */
    final class CustomMimeType {
        public final String codecPrefix;
        public final String mimeType;
        public final int trackType;

        public CustomMimeType(String str, String str2, int i2) {
            this.mimeType = str;
            this.codecPrefix = str2;
            this.trackType = i2;
        }
    }

    /* compiled from: WazeSource */
    final class Mp4aObjectType {
        public final int audioObjectTypeIndication;
        public final int objectTypeIndication;

        public Mp4aObjectType(int i2, int i3) {
            this.objectTypeIndication = i2;
            this.audioObjectTypeIndication = i3;
        }

        public int getEncoding() {
            int i2 = this.audioObjectTypeIndication;
            if (i2 == 2) {
                return 10;
            }
            if (i2 == 5) {
                return 11;
            }
            if (i2 == 29) {
                return 12;
            }
            if (i2 == 42) {
                return 16;
            }
            if (i2 != 22) {
                return i2 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    private MimeTypes() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean allSamplesAreSyncSamples(String str, String str2) {
        Mp4aObjectType objectTypeFromMp4aRFC6381CodecString;
        int encoding;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(AUDIO_E_AC3_JOC)) {
                }
                break;
            case -1354451219:
                if (str.equals(APPLICATION_AIT)) {
                }
                break;
            case -1348231605:
                if (str.equals(APPLICATION_ICY)) {
                }
                break;
            case -1265048566:
                if (str.equals(APPLICATION_CAMERA_MOTION)) {
                }
                break;
            case -1248341703:
                if (str.equals(APPLICATION_ID3)) {
                }
                break;
            case -432837260:
                if (str.equals(AUDIO_MPEG_L1)) {
                }
                break;
            case -432837259:
                if (str.equals(AUDIO_MPEG_L2)) {
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null || (objectTypeFromMp4aRFC6381CodecString = getObjectTypeFromMp4aRFC6381CodecString(str2)) == null || (encoding = objectTypeFromMp4aRFC6381CodecString.getEncoding()) == 0 || encoding == 16) {
                }
                break;
            case -43764892:
                if (str.equals(APPLICATION_META)) {
                }
                break;
            case 187078296:
                if (str.equals(AUDIO_AC3)) {
                }
                break;
            case 187094639:
                if (str.equals(AUDIO_RAW)) {
                }
                break;
            case 469933706:
                if (str.equals(APPLICATION_MEDIA3_CUES)) {
                }
                break;
            case 1054472807:
                if (str.equals(APPLICATION_ITUT_T35)) {
                }
                break;
            case 1154383568:
                if (str.equals(APPLICATION_EMSG)) {
                }
                break;
            case 1331836563:
                if (str.equals(VIDEO_APV)) {
                }
                break;
            case 1504578661:
                if (str.equals(AUDIO_E_AC3)) {
                }
                break;
            case 1504619009:
                if (str.equals(AUDIO_FLAC)) {
                }
                break;
            case 1504831518:
                if (str.equals(AUDIO_MPEG)) {
                }
                break;
            case 1652648887:
                if (str.equals(APPLICATION_SCTE35)) {
                }
                break;
            case 1903231877:
                if (str.equals(AUDIO_ALAW)) {
                }
                break;
            case 1903589369:
                if (str.equals(AUDIO_MLAW)) {
                }
                break;
        }
        return false;
    }

    public static void clearRegisteredCustomMimeTypes() {
        customMimeTypes.clear();
    }

    public static boolean containsCodecsCorrespondingToMimeType(String str, String str2) {
        return getCodecsCorrespondingToMimeType(str, str2) != null;
    }

    public static String getAudioMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isAudio(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static String getCodecsCorrespondingToMimeType(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrSplitCodecs = Util.splitCodecs(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrSplitCodecs) {
            if (str2.equals(getMediaMimeType(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    private static String getCustomMimeTypeForCodec(String str) {
        int size = customMimeTypes.size();
        for (int i2 = 0; i2 < size; i2++) {
            CustomMimeType customMimeType = customMimeTypes.get(i2);
            if (str.startsWith(customMimeType.codecPrefix)) {
                return customMimeType.mimeType;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getEncoding(java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = r3.hashCode()
            r1 = 8
            r2 = 0
            switch(r0) {
                case -2123537834: goto L95;
                case -1365340241: goto L8c;
                case -1095064472: goto L82;
                case -53558318: goto L6b;
                case 187078296: goto L61;
                case 187078297: goto L56;
                case 187081724: goto L4b;
                case 550520934: goto L40;
                case 1504578661: goto L36;
                case 1504831518: goto L2b;
                case 1504891608: goto L20;
                case 1505942594: goto L17;
                case 1556697186: goto Lc;
                default: goto La;
            }
        La:
            goto La0
        Lc:
            java.lang.String r4 = "audio/true-hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 14
            return r3
        L17:
            java.lang.String r4 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            return r1
        L20:
            java.lang.String r4 = "audio/opus"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 20
            return r3
        L2b:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 9
            return r3
        L36:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 6
            return r3
        L40:
            java.lang.String r4 = "audio/vnd.dts.uhd;profile=p2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 30
            return r3
        L4b:
            java.lang.String r4 = "audio/dsd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 31
            return r3
        L56:
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 17
            return r3
        L61:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 5
            return r3
        L6b:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto La0
            if (r4 != 0) goto L76
            return r2
        L76:
            androidx.media3.common.MimeTypes$Mp4aObjectType r3 = getObjectTypeFromMp4aRFC6381CodecString(r4)
            if (r3 != 0) goto L7d
            return r2
        L7d:
            int r3 = r3.getEncoding()
            return r3
        L82:
            java.lang.String r4 = "audio/vnd.dts"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 7
            return r3
        L8c:
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            return r1
        L95:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La0
            r3 = 18
            return r3
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.MimeTypes.getEncoding(java.lang.String, java.lang.String):int");
    }

    public static String getMediaMimeType(String str) {
        Mp4aObjectType objectTypeFromMp4aRFC6381CodecString;
        String mimeTypeFromMp4ObjectType = null;
        if (str == null) {
            return null;
        }
        String strK = an.K(str.trim());
        if (strK.startsWith("avc1") || strK.startsWith("avc3")) {
            return "video/avc";
        }
        if (strK.startsWith("hev1") || strK.startsWith("hvc1")) {
            return VIDEO_H265;
        }
        if (strK.startsWith("vvc1") || strK.startsWith("vvi1")) {
            return VIDEO_H266;
        }
        if (strK.startsWith("dvav") || strK.startsWith("dva1") || strK.startsWith("dvhe") || strK.startsWith("dvh1") || strK.startsWith("dav1")) {
            return VIDEO_DOLBY_VISION;
        }
        if (strK.startsWith("av01")) {
            return VIDEO_AV1;
        }
        if (strK.startsWith("vp9") || strK.startsWith("vp09")) {
            return VIDEO_VP9;
        }
        if (strK.startsWith("vp8") || strK.startsWith("vp08")) {
            return VIDEO_VP8;
        }
        if (!strK.startsWith("mp4a")) {
            return strK.startsWith("mha1") ? AUDIO_MPEGH_MHA1 : strK.startsWith("mhm1") ? AUDIO_MPEGH_MHM1 : (strK.startsWith("ac-3") || strK.startsWith("dac3")) ? AUDIO_AC3 : (strK.startsWith("ec-3") || strK.startsWith("dec3")) ? AUDIO_E_AC3 : strK.startsWith(CODEC_E_AC3_JOC) ? AUDIO_E_AC3_JOC : (strK.startsWith("ac-4") || strK.startsWith("dac4")) ? AUDIO_AC4 : strK.startsWith("dtsc") ? AUDIO_DTS : strK.startsWith("dtse") ? AUDIO_DTS_EXPRESS : (strK.startsWith("dtsh") || strK.startsWith("dtsl")) ? AUDIO_DTS_HD : strK.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : strK.startsWith("opus") ? AUDIO_OPUS : strK.startsWith("vorbis") ? AUDIO_VORBIS : strK.startsWith("flac") ? AUDIO_FLAC : strK.startsWith("stpp") ? APPLICATION_TTML : strK.startsWith("wvtt") ? TEXT_VTT : strK.contains("cea708") ? APPLICATION_CEA708 : (strK.contains("eia608") || strK.contains("cea608")) ? APPLICATION_CEA608 : getCustomMimeTypeForCodec(strK);
        }
        if (strK.startsWith("mp4a.") && (objectTypeFromMp4aRFC6381CodecString = getObjectTypeFromMp4aRFC6381CodecString(strK)) != null) {
            mimeTypeFromMp4ObjectType = getMimeTypeFromMp4ObjectType(objectTypeFromMp4aRFC6381CodecString.objectTypeIndication);
        }
        return mimeTypeFromMp4ObjectType == null ? "audio/mp4a-latm" : mimeTypeFromMp4ObjectType;
    }

    public static String getMimeTypeFromMp4ObjectType(int i2) {
        if (i2 == 32) {
            return VIDEO_MP4V;
        }
        if (i2 == 33) {
            return "video/avc";
        }
        if (i2 == 35) {
            return VIDEO_H265;
        }
        if (i2 == 64) {
            return "audio/mp4a-latm";
        }
        if (i2 == 163) {
            return VIDEO_VC1;
        }
        if (i2 == 177) {
            return VIDEO_VP9;
        }
        if (i2 == 221) {
            return AUDIO_VORBIS;
        }
        if (i2 == 165) {
            return AUDIO_AC3;
        }
        if (i2 == 166) {
            return AUDIO_E_AC3;
        }
        switch (i2) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return AUDIO_MPEG;
            case 106:
                return VIDEO_MPEG;
            case 108:
                return IMAGE_JPEG;
            default:
                switch (i2) {
                    case 169:
                    case 172:
                        return AUDIO_DTS;
                    case 170:
                    case 171:
                        return AUDIO_DTS_HD;
                    case 173:
                        return AUDIO_OPUS;
                    case 174:
                        return AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    public static Byte getMp4ObjectTypeFromMimeType(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1003765268) {
            return str.equals(AUDIO_VORBIS) ? (byte) -35 : null;
        }
        if (iHashCode == -53558318) {
            return str.equals("audio/mp4a-latm") ? (byte) 64 : null;
        }
        if (iHashCode == 1187890754 && str.equals(VIDEO_MP4V)) {
            return Byte.valueOf(StylePropertiesKt.ZIndexId);
        }
        return null;
    }

    static Mp4aObjectType getObjectTypeFromMp4aRFC6381CodecString(String str) {
        Matcher matcher = MP4A_RFC_6381_CODEC_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        an.B(strGroup);
        String strGroup2 = matcher.group(2);
        try {
            return new Mp4aObjectType(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String getTextMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isText(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    private static String getTopLevelType(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int getTrackType(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isAudio(str)) {
            return 1;
        }
        if (isVideo(str)) {
            return 2;
        }
        if (isText(str)) {
            return 3;
        }
        if (isImage(str)) {
            return 4;
        }
        if (APPLICATION_ID3.equals(str) || APPLICATION_EMSG.equals(str) || APPLICATION_SCTE35.equals(str) || APPLICATION_ICY.equals(str) || APPLICATION_AIT.equals(str) || APPLICATION_META.equals(str) || APPLICATION_ITUT_T35.equals(str)) {
            return 5;
        }
        if (APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        return getTrackTypeForCustomMimeType(str);
    }

    private static int getTrackTypeForCustomMimeType(String str) {
        int size = customMimeTypes.size();
        for (int i2 = 0; i2 < size; i2++) {
            CustomMimeType customMimeType = customMimeTypes.get(i2);
            if (str.equals(customMimeType.mimeType)) {
                return customMimeType.trackType;
            }
        }
        return -1;
    }

    public static int getTrackTypeOfCodec(String str) {
        return getTrackType(getMediaMimeType(str));
    }

    public static String getVideoMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isVideo(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static boolean isAudio(String str) {
        return BASE_TYPE_AUDIO.equals(getTopLevelType(str));
    }

    public static boolean isDolbyVisionCodec(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        if (str2.startsWith("dvhe") && str.startsWith("hev1")) {
            return true;
        }
        if (str2.startsWith("dvh1") && str.startsWith("hvc1")) {
            return true;
        }
        if (str2.startsWith("dvav") && str.startsWith("avc3")) {
            return true;
        }
        if (str2.startsWith("dva1") && str.startsWith("avc1")) {
            return true;
        }
        return str2.startsWith("dav1") && str.startsWith("av01");
    }

    public static boolean isImage(String str) {
        return "image".equals(getTopLevelType(str)) || APPLICATION_EXTERNALLY_LOADED_IMAGE.equals(str);
    }

    public static boolean isMatroska(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(VIDEO_WEBM) || str.startsWith(AUDIO_WEBM) || str.startsWith(APPLICATION_WEBM) || str.startsWith(VIDEO_MATROSKA) || str.startsWith(AUDIO_MATROSKA) || str.startsWith(APPLICATION_MATROSKA);
    }

    public static boolean isText(String str) {
        return "text".equals(getTopLevelType(str)) || APPLICATION_MEDIA3_CUES.equals(str) || APPLICATION_CEA608.equals(str) || APPLICATION_CEA708.equals(str) || APPLICATION_MP4CEA608.equals(str) || APPLICATION_SUBRIP.equals(str) || APPLICATION_TTML.equals(str) || APPLICATION_TX3G.equals(str) || APPLICATION_MP4VTT.equals(str) || APPLICATION_RAWCC.equals(str) || APPLICATION_VOBSUB.equals(str) || APPLICATION_PGS.equals(str) || APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean isVideo(String str) {
        return BASE_TYPE_VIDEO.equals(getTopLevelType(str));
    }

    public static String normalizeMimeType(String str) {
        if (str == null) {
            return null;
        }
        String strK = an.K(str);
        switch (strK.hashCode()) {
            case -1833600100:
                return strK.equals("video/x-mvhevc") ? VIDEO_MV_HEVC : strK;
            case -1007807498:
                return strK.equals("audio/x-flac") ? AUDIO_FLAC : strK;
            case -979095690:
                return strK.equals("application/x-mpegurl") ? APPLICATION_M3U8 : strK;
            case -586683234:
                return strK.equals("audio/x-wav") ? AUDIO_WAV : strK;
            case -432836268:
                return strK.equals("audio/mpeg-l1") ? AUDIO_MPEG_L1 : strK;
            case -432836267:
                return strK.equals("audio/mpeg-l2") ? AUDIO_MPEG_L2 : strK;
            case 187090231:
                return strK.equals("audio/mp3") ? AUDIO_MPEG : strK;
            default:
                return strK;
        }
    }

    public static void registerCustomMimeType(String str, String str2, int i2) {
        CustomMimeType customMimeType = new CustomMimeType(str, str2, i2);
        int size = customMimeTypes.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            ArrayList<CustomMimeType> arrayList = customMimeTypes;
            if (str.equals(arrayList.get(i3).mimeType)) {
                arrayList.remove(i3);
                break;
            }
            i3++;
        }
        customMimeTypes.add(customMimeType);
    }
}
