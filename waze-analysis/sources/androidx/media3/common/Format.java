package androidx.media3.common;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.b.w;
import com.google.d.d.bn;
import com.google.d.d.fo;
import com.google.d.j.b;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.MissingResourceException;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Format {
    public static final int CUE_REPLACEMENT_BEHAVIOR_MERGE = 1;
    public static final int CUE_REPLACEMENT_BEHAVIOR_REPLACE = 2;
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int auxiliaryTrackType;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final int channelMask;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final int cryptoType;
    public final int cueReplacementBehavior;
    public final Object customData;
    public final int decodedHeight;
    public final int decodedWidth;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    public final boolean hasPrerollSamples;
    private int hashCode;
    public final int height;
    public final String id;
    public final List<byte[]> initializationData;
    public final String label;
    public final List<Label> labels;
    public final String language;
    public final int maxInputSize;
    public final int maxNumReorderSamples;
    public final int maxSubLayers;
    public final Metadata metadata;
    public final boolean mirrorHorizontal;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final int pixelFormat;
    public final float pixelWidthHeightRatio;
    public final String primaryTrackGroupId;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final float selectionPriority;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int tileCountHorizontal;
    public final int tileCountVertical;
    public final int width;
    private static final Format DEFAULT = new Builder().build();
    private static final String FIELD_ID = Util.intToStringMaxRadix(0);
    private static final String FIELD_LABEL = Util.intToStringMaxRadix(1);
    private static final String FIELD_LANGUAGE = Util.intToStringMaxRadix(2);
    private static final String FIELD_SELECTION_FLAGS = Util.intToStringMaxRadix(3);
    private static final String FIELD_ROLE_FLAGS = Util.intToStringMaxRadix(4);
    private static final String FIELD_AVERAGE_BITRATE = Util.intToStringMaxRadix(5);
    private static final String FIELD_PEAK_BITRATE = Util.intToStringMaxRadix(6);
    private static final String FIELD_CODECS = Util.intToStringMaxRadix(7);
    private static final String UNUSED_FIELD_METADATA = Util.intToStringMaxRadix(8);
    private static final String FIELD_CONTAINER_MIME_TYPE = Util.intToStringMaxRadix(9);
    private static final String FIELD_SAMPLE_MIME_TYPE = Util.intToStringMaxRadix(10);
    private static final String FIELD_MAX_INPUT_SIZE = Util.intToStringMaxRadix(11);
    private static final String FIELD_INITIALIZATION_DATA = Util.intToStringMaxRadix(12);
    private static final String FIELD_DRM_INIT_DATA = Util.intToStringMaxRadix(13);
    private static final String FIELD_SUBSAMPLE_OFFSET_US = Util.intToStringMaxRadix(14);
    private static final String FIELD_WIDTH = Util.intToStringMaxRadix(15);
    private static final String FIELD_HEIGHT = Util.intToStringMaxRadix(16);
    private static final String FIELD_FRAME_RATE = Util.intToStringMaxRadix(17);
    private static final String FIELD_ROTATION_DEGREES = Util.intToStringMaxRadix(18);
    private static final String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = Util.intToStringMaxRadix(19);
    private static final String FIELD_PROJECTION_DATA = Util.intToStringMaxRadix(20);
    private static final String FIELD_STEREO_MODE = Util.intToStringMaxRadix(21);
    private static final String FIELD_COLOR_INFO = Util.intToStringMaxRadix(22);
    private static final String FIELD_CHANNEL_COUNT = Util.intToStringMaxRadix(23);
    private static final String FIELD_SAMPLE_RATE = Util.intToStringMaxRadix(24);
    private static final String FIELD_PCM_ENCODING = Util.intToStringMaxRadix(25);
    private static final String FIELD_ENCODER_DELAY = Util.intToStringMaxRadix(26);
    private static final String FIELD_ENCODER_PADDING = Util.intToStringMaxRadix(27);
    private static final String FIELD_ACCESSIBILITY_CHANNEL = Util.intToStringMaxRadix(28);
    private static final String FIELD_CRYPTO_TYPE = Util.intToStringMaxRadix(29);
    private static final String FIELD_TILE_COUNT_HORIZONTAL = Util.intToStringMaxRadix(30);
    private static final String FIELD_TILE_COUNT_VERTICAL = Util.intToStringMaxRadix(31);
    private static final String FIELD_LABELS = Util.intToStringMaxRadix(32);
    private static final String FIELD_AUXILIARY_TRACK_TYPE = Util.intToStringMaxRadix(33);
    private static final String FIELD_MAX_SUB_LAYERS = Util.intToStringMaxRadix(34);
    private static final String FIELD_DECODED_WIDTH = Util.intToStringMaxRadix(35);
    private static final String FIELD_DECODED_HEIGHT = Util.intToStringMaxRadix(36);
    private static final String FIELD_PRIMARY_TRACK_GROUP_ID = Util.intToStringMaxRadix(37);
    private static final String FIELD_CHANNEL_MASK = Util.intToStringMaxRadix(38);
    private static final String FIELD_MIRROR_HORIZONTAL = Util.intToStringMaxRadix(39);
    private static final String FIELD_PIXEL_FORMAT = Util.intToStringMaxRadix(40);
    private static final String FIELD_SELECTION_PRIORITY = Util.intToStringMaxRadix(41);

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CueReplacementBehavior {
    }

    private Format(Builder builder) throws MissingResourceException {
        this.id = builder.id;
        String strNormalizeLanguageCode = Util.normalizeLanguageCode(builder.language);
        this.language = strNormalizeLanguageCode;
        if (builder.labels.isEmpty() && builder.label != null) {
            this.labels = bn.q(new Label(strNormalizeLanguageCode, builder.label));
            this.label = builder.label;
        } else if (builder.labels.isEmpty() || builder.label != null) {
            an.u(isLabelPartOfLabels(builder));
            this.labels = builder.labels;
            this.label = builder.label;
        } else {
            this.labels = builder.labels;
            this.label = getDefaultLabel(builder.labels, strNormalizeLanguageCode);
        }
        this.selectionFlags = builder.selectionFlags;
        an.v(builder.auxiliaryTrackType == 0 || (builder.roleFlags & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.roleFlags = builder.roleFlags;
        this.selectionPriority = builder.selectionPriority;
        this.auxiliaryTrackType = builder.auxiliaryTrackType;
        int i2 = builder.averageBitrate;
        this.averageBitrate = i2;
        int i3 = builder.peakBitrate;
        this.peakBitrate = i3;
        this.bitrate = i3 != -1 ? i3 : i2;
        this.codecs = builder.codecs;
        this.metadata = builder.metadata;
        this.customData = builder.customData;
        this.primaryTrackGroupId = builder.primaryTrackGroupId;
        this.containerMimeType = builder.containerMimeType;
        this.sampleMimeType = builder.sampleMimeType;
        this.maxInputSize = builder.maxInputSize;
        this.maxNumReorderSamples = builder.maxNumReorderSamples;
        this.initializationData = builder.initializationData == null ? Collections.EMPTY_LIST : builder.initializationData;
        DrmInitData drmInitData = builder.drmInitData;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.subsampleOffsetUs;
        this.hasPrerollSamples = builder.hasPrerollSamples;
        this.width = builder.width;
        this.height = builder.height;
        this.pixelFormat = builder.pixelFormat;
        this.decodedWidth = builder.decodedWidth;
        this.decodedHeight = builder.decodedHeight;
        this.frameRate = builder.frameRate;
        this.rotationDegrees = builder.rotationDegrees == -1 ? 0 : builder.rotationDegrees;
        this.mirrorHorizontal = builder.mirrorHorizontal;
        this.pixelWidthHeightRatio = builder.pixelWidthHeightRatio == -1.0f ? 1.0f : builder.pixelWidthHeightRatio;
        this.projectionData = builder.projectionData;
        this.stereoMode = builder.stereoMode;
        this.colorInfo = builder.colorInfo;
        this.maxSubLayers = builder.maxSubLayers;
        int i4 = builder.channelCount;
        this.channelCount = i4;
        int i5 = builder.channelMask;
        this.channelMask = i5;
        if (i4 != -1 && i5 != -1 && Integer.bitCount(i5) != i4) {
            throw new IllegalStateException(an.d("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i4), Integer.valueOf(i5)));
        }
        this.sampleRate = builder.sampleRate;
        this.pcmEncoding = builder.pcmEncoding;
        this.encoderDelay = builder.encoderDelay == -1 ? 0 : builder.encoderDelay;
        this.encoderPadding = builder.encoderPadding != -1 ? builder.encoderPadding : 0;
        this.accessibilityChannel = builder.accessibilityChannel;
        this.cueReplacementBehavior = builder.cueReplacementBehavior;
        this.tileCountHorizontal = builder.tileCountHorizontal;
        this.tileCountVertical = builder.tileCountVertical;
        if (builder.cryptoType != 0 || drmInitData == null) {
            this.cryptoType = builder.cryptoType;
        } else {
            this.cryptoType = 1;
        }
    }

    private static <T> T defaultIfNull(T t, T t2) {
        return t != null ? t : t2;
    }

    public static Format fromBundle(Bundle bundle) {
        Builder builder = new Builder();
        BundleCollectionUtil.ensureClassLoader(bundle);
        String string = bundle.getString(FIELD_ID);
        Format format = DEFAULT;
        builder.setId((String) defaultIfNull(string, format.id));
        builder.setLabel((String) defaultIfNull(bundle.getString(FIELD_LABEL), format.label));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_LABELS);
        builder.setLabels(parcelableArrayList == null ? bn.p() : BundleCollectionUtil.fromBundleList(new t() { // from class: androidx.media3.common.Format$$ExternalSyntheticLambda1
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return Label.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList));
        builder.setLanguage((String) defaultIfNull(bundle.getString(FIELD_LANGUAGE), format.language));
        builder.setSelectionFlags(bundle.getInt(FIELD_SELECTION_FLAGS, format.selectionFlags));
        builder.setRoleFlags(bundle.getInt(FIELD_ROLE_FLAGS, format.roleFlags));
        builder.setSelectionPriority(bundle.getFloat(FIELD_SELECTION_PRIORITY, format.selectionPriority));
        builder.setAuxiliaryTrackType(bundle.getInt(FIELD_AUXILIARY_TRACK_TYPE, format.auxiliaryTrackType));
        builder.setAverageBitrate(bundle.getInt(FIELD_AVERAGE_BITRATE, format.averageBitrate));
        builder.setPeakBitrate(bundle.getInt(FIELD_PEAK_BITRATE, format.peakBitrate));
        builder.setCodecs((String) defaultIfNull(bundle.getString(FIELD_CODECS), format.codecs));
        builder.setPrimaryTrackGroupId((String) defaultIfNull(bundle.getString(FIELD_PRIMARY_TRACK_GROUP_ID), format.primaryTrackGroupId));
        builder.setContainerMimeType((String) defaultIfNull(bundle.getString(FIELD_CONTAINER_MIME_TYPE), format.containerMimeType));
        builder.setSampleMimeType((String) defaultIfNull(bundle.getString(FIELD_SAMPLE_MIME_TYPE), format.sampleMimeType));
        builder.setMaxInputSize(bundle.getInt(FIELD_MAX_INPUT_SIZE, format.maxInputSize));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(keyForInitializationData(i2));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i2++;
        }
        String str = FIELD_FRAME_RATE;
        Format format2 = DEFAULT;
        float f2 = bundle.getFloat(str, format2.frameRate);
        if (f2 <= 0.0f) {
            f2 = -1.0f;
        }
        builder.setInitializationData(arrayList);
        builder.setDrmInitData((DrmInitData) bundle.getParcelable(FIELD_DRM_INIT_DATA));
        builder.setSubsampleOffsetUs(bundle.getLong(FIELD_SUBSAMPLE_OFFSET_US, format2.subsampleOffsetUs));
        builder.setWidth(bundle.getInt(FIELD_WIDTH, format2.width));
        builder.setHeight(bundle.getInt(FIELD_HEIGHT, format2.height));
        builder.setPixelFormat(bundle.getInt(FIELD_PIXEL_FORMAT, format2.pixelFormat));
        builder.setDecodedWidth(bundle.getInt(FIELD_DECODED_WIDTH, format2.decodedWidth));
        builder.setDecodedHeight(bundle.getInt(FIELD_DECODED_HEIGHT, format2.decodedHeight));
        builder.setFrameRate(f2);
        builder.setRotationDegrees(bundle.getInt(FIELD_ROTATION_DEGREES, format2.rotationDegrees));
        builder.setMirrorHorizontal(bundle.getBoolean(FIELD_MIRROR_HORIZONTAL, format2.mirrorHorizontal));
        builder.setPixelWidthHeightRatio(bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, format2.pixelWidthHeightRatio));
        builder.setProjectionData(bundle.getByteArray(FIELD_PROJECTION_DATA));
        builder.setStereoMode(bundle.getInt(FIELD_STEREO_MODE, format2.stereoMode));
        builder.setMaxSubLayers(bundle.getInt(FIELD_MAX_SUB_LAYERS, format2.maxSubLayers));
        Bundle bundle2 = bundle.getBundle(FIELD_COLOR_INFO);
        if (bundle2 != null) {
            builder.setColorInfo(ColorInfo.fromBundle(bundle2));
        }
        builder.setChannelCount(bundle.getInt(FIELD_CHANNEL_COUNT, format2.channelCount));
        builder.setChannelMask(bundle.getInt(FIELD_CHANNEL_MASK, format2.channelMask));
        builder.setSampleRate(bundle.getInt(FIELD_SAMPLE_RATE, format2.sampleRate));
        builder.setPcmEncoding(bundle.getInt(FIELD_PCM_ENCODING, format2.pcmEncoding));
        builder.setEncoderDelay(bundle.getInt(FIELD_ENCODER_DELAY, format2.encoderDelay));
        builder.setEncoderPadding(bundle.getInt(FIELD_ENCODER_PADDING, format2.encoderPadding));
        builder.setAccessibilityChannel(bundle.getInt(FIELD_ACCESSIBILITY_CHANNEL, format2.accessibilityChannel));
        builder.setTileCountHorizontal(bundle.getInt(FIELD_TILE_COUNT_HORIZONTAL, format2.tileCountHorizontal));
        builder.setTileCountVertical(bundle.getInt(FIELD_TILE_COUNT_VERTICAL, format2.tileCountVertical));
        builder.setCryptoType(bundle.getInt(FIELD_CRYPTO_TYPE, format2.cryptoType));
        return builder.build();
    }

    private static String getDefaultLabel(List<Label> list, String str) {
        for (Label label : list) {
            if (TextUtils.equals(label.language, str)) {
                return label.value;
            }
        }
        return list.get(0).value;
    }

    private static boolean isLabelPartOfLabels(Builder builder) {
        if (builder.labels.isEmpty() && builder.label == null) {
            return true;
        }
        for (int i2 = 0; i2 < builder.labels.size(); i2++) {
            if (((Label) builder.labels.get(i2)).value.equals(builder.label)) {
                return true;
            }
        }
        return false;
    }

    private static String keyForInitializationData(int i2) {
        return FIELD_INITIALIZATION_DATA + "_" + Integer.toString(i2, 36);
    }

    static /* synthetic */ String lambda$toLogString$0(Label label) {
        return label.language + ": " + label.value;
    }

    public static String toLogString(Format format) {
        if (format == null) {
            return "null";
        }
        w wVarF = w.f();
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.id);
        sb.append(", mimeType=");
        sb.append(format.sampleMimeType);
        if (format.containerMimeType != null) {
            sb.append(", container=");
            sb.append(format.containerMimeType);
        }
        if (format.primaryTrackGroupId != null) {
            sb.append(", primaryGroupId=");
            sb.append(format.primaryTrackGroupId);
        }
        if (format.bitrate != -1) {
            sb.append(", bitrate=");
            sb.append(format.bitrate);
        }
        if (format.selectionPriority != -1.0f) {
            sb.append(", selectionPriority=");
            sb.append(format.selectionPriority);
        }
        if (format.codecs != null) {
            sb.append(", codecs=");
            sb.append(format.codecs);
        }
        if (format.drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (true) {
                DrmInitData drmInitData = format.drmInitData;
                if (i2 >= drmInitData.schemeDataCount) {
                    break;
                }
                UUID uuid = drmInitData.get(i2).uuid;
                if (uuid.equals(C.COMMON_PSSH_UUID)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(C.CLEARKEY_UUID)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C.PLAYREADY_UUID)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C.WIDEVINE_UUID)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C.UUID_NIL)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + String.valueOf(uuid) + ")");
                }
                i2++;
            }
            sb.append(", drm=[");
            wVarF.h(sb, linkedHashSet);
            sb.append(']');
        }
        if (format.width != -1 && format.height != -1) {
            sb.append(", res=");
            sb.append(format.width);
            sb.append("x");
            sb.append(format.height);
        }
        if (format.decodedWidth != -1 && format.decodedHeight != -1) {
            sb.append(", decRes=");
            sb.append(format.decodedWidth);
            sb.append("x");
            sb.append(format.decodedHeight);
        }
        float f2 = format.pixelWidthHeightRatio;
        int i3 = b.f7936a;
        double d2 = f2;
        if (Math.copySign((-1.0d) + d2, 1.0d) > 0.001d && d2 != 1.0d && (!Double.isNaN(d2) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            sb.append(Util.formatInvariant("%.3f", Float.valueOf(format.pixelWidthHeightRatio)));
        }
        ColorInfo colorInfo = format.colorInfo;
        if (colorInfo != null && colorInfo.isValid()) {
            sb.append(", color=");
            sb.append(format.colorInfo.toLogString());
        }
        if (format.pixelFormat != -1) {
            sb.append(", pixelFormat=");
            sb.append(format.pixelFormat);
        }
        if (format.frameRate != -1.0f) {
            sb.append(", fps=");
            sb.append(format.frameRate);
        }
        if (format.rotationDegrees != 0) {
            sb.append(", rotation=");
            sb.append(format.rotationDegrees);
        }
        if (format.mirrorHorizontal) {
            sb.append(", mirrorHorizontal");
        }
        if (format.maxSubLayers != -1) {
            sb.append(", maxSubLayers=");
            sb.append(format.maxSubLayers);
        }
        if (format.channelCount != -1) {
            sb.append(", channels=");
            sb.append(format.channelCount);
        }
        if (format.channelMask != -1) {
            sb.append(", channel_mask=");
            sb.append(format.channelMask);
        }
        if (format.sampleRate != -1) {
            sb.append(", sample_rate=");
            sb.append(format.sampleRate);
        }
        if (format.language != null) {
            sb.append(", language=");
            sb.append(format.language);
        }
        if (!format.labels.isEmpty()) {
            sb.append(", labels=[");
            wVarF.h(sb, fo.G(format.labels, new t() { // from class: androidx.media3.common.Format$$ExternalSyntheticLambda2
                @Override // com.google.d.b.t
                public final Object apply(Object obj) {
                    return Format.lambda$toLogString$0((Label) obj);
                }
            }));
            sb.append("]");
        }
        if (format.selectionFlags != 0) {
            sb.append(", selectionFlags=[");
            wVarF.h(sb, Util.getSelectionFlagStrings(format.selectionFlags));
            sb.append("]");
        }
        if (format.roleFlags != 0) {
            sb.append(", roleFlags=[");
            wVarF.h(sb, Util.getRoleFlagStrings(format.roleFlags));
            sb.append("]");
        }
        if (format.customData != null) {
            sb.append(", customData=");
            sb.append(format.customData);
        }
        if ((format.roleFlags & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            sb.append(Util.getAuxiliaryTrackTypeString(format.auxiliaryTrackType));
        }
        return sb.toString();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public Format copyWithCryptoType(int i2) {
        Builder builderBuildUpon = buildUpon();
        builderBuildUpon.setCryptoType(i2);
        return builderBuildUpon.build();
    }

    public boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Format format = (Format) obj;
            int i3 = this.hashCode;
            if ((i3 == 0 || (i2 = format.hashCode) == 0 || i3 == i2) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.auxiliaryTrackType == format.auxiliaryTrackType && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.pixelFormat == format.pixelFormat && this.decodedWidth == format.decodedWidth && this.decodedHeight == format.decodedHeight && this.rotationDegrees == format.rotationDegrees && this.mirrorHorizontal == format.mirrorHorizontal && this.stereoMode == format.stereoMode && this.maxSubLayers == format.maxSubLayers && this.channelCount == format.channelCount && this.channelMask == format.channelMask && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && this.tileCountHorizontal == format.tileCountHorizontal && this.tileCountVertical == format.tileCountVertical && this.cryptoType == format.cryptoType && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.selectionPriority, format.selectionPriority) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && Objects.equals(this.id, format.id) && Objects.equals(this.label, format.label) && this.labels.equals(format.labels) && Objects.equals(this.codecs, format.codecs) && Objects.equals(this.primaryTrackGroupId, format.primaryTrackGroupId) && Objects.equals(this.containerMimeType, format.containerMimeType) && Objects.equals(this.sampleMimeType, format.sampleMimeType) && Objects.equals(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && Objects.equals(this.metadata, format.metadata) && Objects.equals(this.colorInfo, format.colorInfo) && Objects.equals(this.drmInitData, format.drmInitData) && initializationDataEquals(format) && Objects.equals(this.customData, format.customData)) {
                return true;
            }
        }
        return false;
    }

    public int getPixelCount() {
        int i2;
        int i3 = this.width;
        if (i3 == -1 || (i2 = this.height) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.label;
        int iHashCode2 = ((((iHashCode + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.labels.hashCode();
        String str3 = this.language;
        int iHashCode3 = ((((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + Float.floatToIntBits(this.selectionPriority)) * 31) + this.auxiliaryTrackType) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
        String str4 = this.codecs;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Metadata metadata = this.metadata;
        int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
        Object obj = this.customData;
        int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str5 = this.primaryTrackGroupId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.containerMimeType;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sampleMimeType;
        int iHashCode9 = ((((((((((((((((((((((((((((((((((((((((((((((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + this.pixelFormat) * 31) + this.decodedWidth) * 31) + this.decodedHeight) * 31) + Float.floatToIntBits(this.frameRate)) * 31) + this.rotationDegrees) * 31) + (this.mirrorHorizontal ? 1 : 0)) * 31) + Float.floatToIntBits(this.pixelWidthHeightRatio)) * 31) + this.stereoMode) * 31) + this.maxSubLayers) * 31) + this.channelCount) * 31) + this.channelMask) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31) + this.tileCountHorizontal) * 31) + this.tileCountVertical) * 31) + this.cryptoType;
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.initializationData.size(); i2++) {
            if (!Arrays.equals(this.initializationData.get(i2), format.initializationData.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(FIELD_ID, this.id);
        bundle.putString(FIELD_LABEL, this.label);
        bundle.putParcelableArrayList(FIELD_LABELS, BundleCollectionUtil.toBundleArrayList(this.labels, new t() { // from class: androidx.media3.common.Format$$ExternalSyntheticLambda0
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return ((Label) obj).toBundle();
            }
        }));
        bundle.putString(FIELD_LANGUAGE, this.language);
        bundle.putInt(FIELD_SELECTION_FLAGS, this.selectionFlags);
        bundle.putInt(FIELD_ROLE_FLAGS, this.roleFlags);
        bundle.putFloat(FIELD_SELECTION_PRIORITY, this.selectionPriority);
        int i2 = DEFAULT.auxiliaryTrackType;
        int i3 = this.auxiliaryTrackType;
        if (i3 != i2) {
            bundle.putInt(FIELD_AUXILIARY_TRACK_TYPE, i3);
        }
        bundle.putInt(FIELD_AVERAGE_BITRATE, this.averageBitrate);
        bundle.putInt(FIELD_PEAK_BITRATE, this.peakBitrate);
        bundle.putString(FIELD_CODECS, this.codecs);
        String str = this.primaryTrackGroupId;
        if (str != null) {
            bundle.putString(FIELD_PRIMARY_TRACK_GROUP_ID, str);
        }
        bundle.putString(FIELD_CONTAINER_MIME_TYPE, this.containerMimeType);
        bundle.putString(FIELD_SAMPLE_MIME_TYPE, this.sampleMimeType);
        bundle.putInt(FIELD_MAX_INPUT_SIZE, this.maxInputSize);
        for (int i4 = 0; i4 < this.initializationData.size(); i4++) {
            bundle.putByteArray(keyForInitializationData(i4), this.initializationData.get(i4));
        }
        bundle.putParcelable(FIELD_DRM_INIT_DATA, this.drmInitData);
        bundle.putLong(FIELD_SUBSAMPLE_OFFSET_US, this.subsampleOffsetUs);
        bundle.putInt(FIELD_WIDTH, this.width);
        bundle.putInt(FIELD_HEIGHT, this.height);
        bundle.putInt(FIELD_PIXEL_FORMAT, this.pixelFormat);
        bundle.putInt(FIELD_DECODED_WIDTH, this.decodedWidth);
        bundle.putInt(FIELD_DECODED_HEIGHT, this.decodedHeight);
        bundle.putFloat(FIELD_FRAME_RATE, this.frameRate);
        bundle.putInt(FIELD_ROTATION_DEGREES, this.rotationDegrees);
        bundle.putBoolean(FIELD_MIRROR_HORIZONTAL, this.mirrorHorizontal);
        bundle.putFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, this.pixelWidthHeightRatio);
        bundle.putByteArray(FIELD_PROJECTION_DATA, this.projectionData);
        bundle.putInt(FIELD_STEREO_MODE, this.stereoMode);
        ColorInfo colorInfo = this.colorInfo;
        if (colorInfo != null) {
            bundle.putBundle(FIELD_COLOR_INFO, colorInfo.toBundle());
        }
        bundle.putInt(FIELD_MAX_SUB_LAYERS, this.maxSubLayers);
        bundle.putInt(FIELD_CHANNEL_COUNT, this.channelCount);
        bundle.putInt(FIELD_CHANNEL_MASK, this.channelMask);
        bundle.putInt(FIELD_SAMPLE_RATE, this.sampleRate);
        bundle.putInt(FIELD_PCM_ENCODING, this.pcmEncoding);
        bundle.putInt(FIELD_ENCODER_DELAY, this.encoderDelay);
        bundle.putInt(FIELD_ENCODER_PADDING, this.encoderPadding);
        bundle.putInt(FIELD_ACCESSIBILITY_CHANNEL, this.accessibilityChannel);
        bundle.putInt(FIELD_TILE_COUNT_HORIZONTAL, this.tileCountHorizontal);
        bundle.putInt(FIELD_TILE_COUNT_VERTICAL, this.tileCountVertical);
        bundle.putInt(FIELD_CRYPTO_TYPE, this.cryptoType);
        return bundle;
    }

    public String toString() {
        return "Format(" + this.id + ", " + this.label + ", " + this.containerMimeType + ", " + this.sampleMimeType + ", " + this.codecs + ", " + this.bitrate + ", " + this.language + ", [" + this.width + ", " + this.height + ", " + this.frameRate + ", " + String.valueOf(this.colorInfo) + "], [" + this.channelCount + ", " + this.channelMask + ", " + this.sampleRate + "])";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.common.Format withManifestFormatInfo(androidx.media3.common.Format r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L7
            return r0
        L7:
            java.lang.String r2 = r0.sampleMimeType
            int r2 = androidx.media3.common.MimeTypes.getTrackType(r2)
            java.lang.String r3 = r1.id
            float r4 = r1.selectionPriority
            int r5 = r1.tileCountHorizontal
            int r6 = r1.tileCountVertical
            java.lang.String r7 = r1.label
            if (r7 != 0) goto L1b
            java.lang.String r7 = r0.label
        L1b:
            java.util.List<androidx.media3.common.Label> r8 = r1.labels
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L26
            java.util.List<androidx.media3.common.Label> r8 = r1.labels
            goto L28
        L26:
            java.util.List<androidx.media3.common.Label> r8 = r0.labels
        L28:
            java.lang.String r9 = r0.language
            r10 = 3
            r11 = 1
            if (r2 == r10) goto L31
            if (r2 != r11) goto L36
            r2 = r11
        L31:
            java.lang.String r10 = r1.language
            if (r10 == 0) goto L36
            r9 = r10
        L36:
            int r10 = r0.averageBitrate
            r12 = -1
            if (r10 != r12) goto L3d
            int r10 = r1.averageBitrate
        L3d:
            int r13 = r0.peakBitrate
            if (r13 != r12) goto L43
            int r13 = r1.peakBitrate
        L43:
            java.lang.String r12 = r0.codecs
            if (r12 != 0) goto L55
            java.lang.String r14 = r1.codecs
            java.lang.String r14 = androidx.media3.common.util.Util.getCodecsOfType(r14, r2)
            java.lang.String[] r15 = androidx.media3.common.util.Util.splitCodecs(r14)
            int r15 = r15.length
            if (r15 != r11) goto L55
            r12 = r14
        L55:
            java.lang.String r11 = r0.primaryTrackGroupId
            if (r11 != 0) goto L5b
            java.lang.String r11 = r1.primaryTrackGroupId
        L5b:
            androidx.media3.common.Metadata r14 = r0.metadata
            if (r14 != 0) goto L62
            androidx.media3.common.Metadata r14 = r1.metadata
            goto L68
        L62:
            androidx.media3.common.Metadata r15 = r1.metadata
            androidx.media3.common.Metadata r14 = r14.copyWithAppendedEntriesFrom(r15)
        L68:
            float r15 = r0.frameRate
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r16 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r16 != 0) goto L78
            r16 = r15
            r15 = 2
            if (r2 != r15) goto L7a
            float r15 = r1.frameRate
            goto L7c
        L78:
            r16 = r15
        L7a:
            r15 = r16
        L7c:
            int r2 = r0.selectionFlags
            r16 = r2
            int r2 = r1.selectionFlags
            r2 = r16 | r2
            r16 = r6
            int r6 = r0.roleFlags
            r17 = r6
            int r6 = r1.roleFlags
            r6 = r17 | r6
            androidx.media3.common.DrmInitData r1 = r1.drmInitData
            r17 = r5
            androidx.media3.common.DrmInitData r5 = r0.drmInitData
            androidx.media3.common.DrmInitData r1 = androidx.media3.common.DrmInitData.createSessionCreationData(r1, r5)
            androidx.media3.common.Format$Builder r0 = r0.buildUpon()
            r0.setId(r3)
            r0.setLabel(r7)
            r0.setLabels(r8)
            r0.setLanguage(r9)
            r0.setSelectionFlags(r2)
            r0.setRoleFlags(r6)
            r0.setSelectionPriority(r4)
            r0.setAverageBitrate(r10)
            r0.setPeakBitrate(r13)
            r0.setCodecs(r12)
            r0.setMetadata(r14)
            r0.setPrimaryTrackGroupId(r11)
            r0.setDrmInitData(r1)
            r0.setFrameRate(r15)
            r1 = r17
            r0.setTileCountHorizontal(r1)
            r1 = r16
            r0.setTileCountVertical(r1)
            androidx.media3.common.Format r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.Format.withManifestFormatInfo(androidx.media3.common.Format):androidx.media3.common.Format");
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private int accessibilityChannel;
        private int auxiliaryTrackType;
        private int averageBitrate;
        private int channelCount;
        private int channelMask;
        private String codecs;
        private ColorInfo colorInfo;
        private String containerMimeType;
        private int cryptoType;
        private int cueReplacementBehavior;
        private Object customData;
        private int decodedHeight;
        private int decodedWidth;
        private DrmInitData drmInitData;
        private int encoderDelay;
        private int encoderPadding;
        private float frameRate;
        private boolean hasPrerollSamples;
        private int height;
        private String id;
        private List<byte[]> initializationData;
        private String label;
        private List<Label> labels;
        private String language;
        private int maxInputSize;
        private int maxNumReorderSamples;
        private int maxSubLayers;
        private Metadata metadata;
        private boolean mirrorHorizontal;
        private int pcmEncoding;
        private int peakBitrate;
        private int pixelFormat;
        private float pixelWidthHeightRatio;
        private String primaryTrackGroupId;
        private byte[] projectionData;
        private int roleFlags;
        private int rotationDegrees;
        private String sampleMimeType;
        private int sampleRate;
        private int selectionFlags;
        private float selectionPriority;
        private int stereoMode;
        private long subsampleOffsetUs;
        private int tileCountHorizontal;
        private int tileCountVertical;
        private int width;

        private Builder(Format format) {
            this.id = format.id;
            this.label = format.label;
            this.labels = format.labels;
            this.language = format.language;
            this.selectionFlags = format.selectionFlags;
            this.roleFlags = format.roleFlags;
            this.selectionPriority = format.selectionPriority;
            this.averageBitrate = format.averageBitrate;
            this.peakBitrate = format.peakBitrate;
            this.codecs = format.codecs;
            this.metadata = format.metadata;
            this.customData = format.customData;
            this.primaryTrackGroupId = format.primaryTrackGroupId;
            this.containerMimeType = format.containerMimeType;
            this.sampleMimeType = format.sampleMimeType;
            this.maxInputSize = format.maxInputSize;
            this.maxNumReorderSamples = format.maxNumReorderSamples;
            this.initializationData = format.initializationData;
            this.drmInitData = format.drmInitData;
            this.subsampleOffsetUs = format.subsampleOffsetUs;
            this.hasPrerollSamples = format.hasPrerollSamples;
            this.width = format.width;
            this.height = format.height;
            this.pixelFormat = format.pixelFormat;
            this.decodedWidth = format.decodedWidth;
            this.decodedHeight = format.decodedHeight;
            this.frameRate = format.frameRate;
            this.rotationDegrees = format.rotationDegrees;
            this.mirrorHorizontal = format.mirrorHorizontal;
            this.pixelWidthHeightRatio = format.pixelWidthHeightRatio;
            this.projectionData = format.projectionData;
            this.stereoMode = format.stereoMode;
            this.colorInfo = format.colorInfo;
            this.maxSubLayers = format.maxSubLayers;
            this.channelCount = format.channelCount;
            this.channelMask = format.channelMask;
            this.sampleRate = format.sampleRate;
            this.pcmEncoding = format.pcmEncoding;
            this.encoderDelay = format.encoderDelay;
            this.encoderPadding = format.encoderPadding;
            this.accessibilityChannel = format.accessibilityChannel;
            this.cueReplacementBehavior = format.cueReplacementBehavior;
            this.tileCountHorizontal = format.tileCountHorizontal;
            this.tileCountVertical = format.tileCountVertical;
            this.cryptoType = format.cryptoType;
        }

        public Format build() {
            return new Format(this);
        }

        public Builder setAccessibilityChannel(int i2) {
            this.accessibilityChannel = i2;
            return this;
        }

        public Builder setAuxiliaryTrackType(int i2) {
            this.auxiliaryTrackType = i2;
            return this;
        }

        public Builder setAverageBitrate(int i2) {
            this.averageBitrate = i2;
            return this;
        }

        public Builder setChannelCount(int i2) {
            this.channelCount = i2;
            return this;
        }

        public Builder setChannelMask(int i2) {
            this.channelMask = i2;
            return this;
        }

        public Builder setCodecs(String str) {
            this.codecs = str;
            return this;
        }

        public Builder setColorInfo(ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public Builder setContainerMimeType(String str) {
            this.containerMimeType = MimeTypes.normalizeMimeType(str);
            return this;
        }

        public Builder setCryptoType(int i2) {
            this.cryptoType = i2;
            return this;
        }

        public Builder setCueReplacementBehavior(int i2) {
            this.cueReplacementBehavior = i2;
            return this;
        }

        public Builder setCustomData(Object obj) {
            this.customData = obj;
            return this;
        }

        public Builder setDecodedHeight(int i2) {
            this.decodedHeight = i2;
            return this;
        }

        public Builder setDecodedWidth(int i2) {
            this.decodedWidth = i2;
            return this;
        }

        public Builder setDrmInitData(DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            return this;
        }

        public Builder setEncoderDelay(int i2) {
            this.encoderDelay = i2;
            return this;
        }

        public Builder setEncoderPadding(int i2) {
            this.encoderPadding = i2;
            return this;
        }

        public Builder setFrameRate(float f2) {
            boolean z = true;
            if (f2 != -1.0f && f2 <= 0.0f) {
                z = false;
            }
            an.l(z);
            this.frameRate = f2;
            return this;
        }

        public Builder setHasPrerollSamples(boolean z) {
            this.hasPrerollSamples = z;
            return this;
        }

        public Builder setHeight(int i2) {
            this.height = i2;
            return this;
        }

        public Builder setId(int i2) {
            this.id = Integer.toString(i2);
            return this;
        }

        public Builder setInitializationData(List<byte[]> list) {
            this.initializationData = list;
            return this;
        }

        public Builder setLabel(String str) {
            this.label = str;
            return this;
        }

        public Builder setLabels(List<Label> list) {
            this.labels = bn.n(list);
            return this;
        }

        public Builder setLanguage(String str) {
            this.language = str;
            return this;
        }

        public Builder setMaxInputSize(int i2) {
            this.maxInputSize = i2;
            return this;
        }

        public Builder setMaxNumReorderSamples(int i2) {
            this.maxNumReorderSamples = i2;
            return this;
        }

        public Builder setMaxSubLayers(int i2) {
            this.maxSubLayers = i2;
            return this;
        }

        public Builder setMetadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMirrorHorizontal(boolean z) {
            this.mirrorHorizontal = z;
            return this;
        }

        public Builder setPcmEncoding(int i2) {
            this.pcmEncoding = i2;
            return this;
        }

        public Builder setPeakBitrate(int i2) {
            this.peakBitrate = i2;
            return this;
        }

        public Builder setPixelFormat(int i2) {
            this.pixelFormat = i2;
            return this;
        }

        public Builder setPixelWidthHeightRatio(float f2) {
            this.pixelWidthHeightRatio = f2;
            return this;
        }

        public Builder setPrimaryTrackGroupId(String str) {
            this.primaryTrackGroupId = str;
            return this;
        }

        public Builder setProjectionData(byte[] bArr) {
            this.projectionData = bArr;
            return this;
        }

        public Builder setRoleFlags(int i2) {
            this.roleFlags = i2;
            return this;
        }

        public Builder setRotationDegrees(int i2) {
            this.rotationDegrees = i2;
            return this;
        }

        public Builder setSampleMimeType(String str) {
            this.sampleMimeType = MimeTypes.normalizeMimeType(str);
            return this;
        }

        public Builder setSampleRate(int i2) {
            this.sampleRate = i2;
            return this;
        }

        public Builder setSelectionFlags(int i2) {
            this.selectionFlags = i2;
            return this;
        }

        public Builder setSelectionPriority(float f2) {
            this.selectionPriority = f2;
            return this;
        }

        public Builder setStereoMode(int i2) {
            this.stereoMode = i2;
            return this;
        }

        public Builder setSubsampleOffsetUs(long j2) {
            this.subsampleOffsetUs = j2;
            return this;
        }

        public Builder setTileCountHorizontal(int i2) {
            this.tileCountHorizontal = i2;
            return this;
        }

        public Builder setTileCountVertical(int i2) {
            this.tileCountVertical = i2;
            return this;
        }

        public Builder setWidth(int i2) {
            this.width = i2;
            return this;
        }

        public Builder setId(String str) {
            this.id = str;
            return this;
        }

        public Builder() {
            this.labels = bn.p();
            this.selectionPriority = -1.0f;
            this.averageBitrate = -1;
            this.peakBitrate = -1;
            this.maxInputSize = -1;
            this.maxNumReorderSamples = -1;
            this.subsampleOffsetUs = Long.MAX_VALUE;
            this.width = -1;
            this.height = -1;
            this.pixelFormat = -1;
            this.decodedWidth = -1;
            this.decodedHeight = -1;
            this.frameRate = -1.0f;
            this.pixelWidthHeightRatio = 1.0f;
            this.stereoMode = -1;
            this.maxSubLayers = -1;
            this.channelCount = -1;
            this.channelMask = -1;
            this.sampleRate = -1;
            this.pcmEncoding = -1;
            this.accessibilityChannel = -1;
            this.cueReplacementBehavior = 1;
            this.tileCountHorizontal = -1;
            this.tileCountVertical = -1;
            this.cryptoType = 0;
            this.auxiliaryTrackType = 0;
        }
    }
}
