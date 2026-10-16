package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.a.r;
import h.d.a;
import h.d.b;
import h.g.b.o;
import h.g.b.x;
import h.k;
import h.k.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SurfaceConfig {
    private static final Map<Integer, ConfigType> CONFIG_TYPES_BY_IMAGE_FORMAT;
    public static final Companion Companion = new Companion(null);
    public static final StreamUseCase DEFAULT_STREAM_USE_CASE = StreamUseCase.DEFAULT;
    private static final ConfigSize[] FEATURE_COMBO_QUERY_SUPPORTED_SIZES = {ConfigSize.S720P_16_9, ConfigSize.S1080P_4_3, ConfigSize.S1080P_16_9, ConfigSize.S1440P_16_9, ConfigSize.UHD, ConfigSize.X_VGA};
    private static final Map<ConfigType, Integer> IMAGE_FORMATS_BY_CONFIG_TYPE;
    private final ConfigSize configSize;
    private final ConfigType configType;
    private final int imageFormat;
    private final StreamUseCase streamUseCase;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class ConfigSource {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ConfigSource[] $VALUES;
        public static final ConfigSource FEATURE_COMBINATION_TABLE = new ConfigSource("FEATURE_COMBINATION_TABLE", 0);
        public static final ConfigSource CAPTURE_SESSION_TABLES = new ConfigSource("CAPTURE_SESSION_TABLES", 1);

        private static final /* synthetic */ ConfigSource[] $values() {
            return new ConfigSource[]{FEATURE_COMBINATION_TABLE, CAPTURE_SESSION_TABLES};
        }

        static {
            ConfigSource[] configSourceArr$values = $values();
            $VALUES = configSourceArr$values;
            $ENTRIES = b.a(configSourceArr$values);
        }

        private ConfigSource(String str, int i2) {
        }

        public static a<ConfigSource> getEntries() {
            return $ENTRIES;
        }

        public static ConfigSource valueOf(String str) {
            return (ConfigSource) Enum.valueOf(ConfigSource.class, str);
        }

        public static ConfigSource[] values() {
            return (ConfigSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class ConfigType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ConfigType[] $VALUES;
        public static final ConfigType PRIV = new ConfigType(PrivFrame.ID, 0);
        public static final ConfigType YUV = new ConfigType("YUV", 1);
        public static final ConfigType JPEG = new ConfigType("JPEG", 2);
        public static final ConfigType JPEG_R = new ConfigType("JPEG_R", 3);
        public static final ConfigType RAW = new ConfigType("RAW", 4);

        private static final /* synthetic */ ConfigType[] $values() {
            return new ConfigType[]{PRIV, YUV, JPEG, JPEG_R, RAW};
        }

        static {
            ConfigType[] configTypeArr$values = $values();
            $VALUES = configTypeArr$values;
            $ENTRIES = b.a(configTypeArr$values);
        }

        private ConfigType(String str, int i2) {
        }

        public static a<ConfigType> getEntries() {
            return $ENTRIES;
        }

        public static ConfigType valueOf(String str) {
            return (ConfigType) Enum.valueOf(ConfigType.class, str);
        }

        public static ConfigType[] values() {
            return (ConfigType[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfigSize.values().length];
            try {
                iArr[ConfigSize.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConfigSize.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConfigSize.MAXIMUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConfigSize.MAXIMUM_4_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConfigSize.MAXIMUM_16_9.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ConfigSize.ULTRA_MAXIMUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ConfigSize.NOT_SUPPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Map<ConfigType, Integer> mapK = r.k(new k(ConfigType.YUV, 35), new k(ConfigType.JPEG, 256), new k(ConfigType.JPEG_R, 4101), new k(ConfigType.RAW, 32), new k(ConfigType.PRIV, 34));
        IMAGE_FORMATS_BY_CONFIG_TYPE = mapK;
        Set<Map.Entry<ConfigType, Integer>> setEntrySet = mapK.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(i.q(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (ConfigType) entry.getKey());
        }
        CONFIG_TYPES_BY_IMAGE_FORMAT = linkedHashMap;
    }

    public SurfaceConfig(ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase) {
        x.f(configType, "configType");
        x.f(configSize, "configSize");
        x.f(streamUseCase, "streamUseCase");
        this.configType = configType;
        this.configSize = configSize;
        this.streamUseCase = streamUseCase;
        Integer num = IMAGE_FORMATS_BY_CONFIG_TYPE.get(configType);
        this.imageFormat = num != null ? num.intValue() : 0;
    }

    public static /* synthetic */ SurfaceConfig copy$default(SurfaceConfig surfaceConfig, ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            configType = surfaceConfig.configType;
        }
        if ((i2 & 2) != 0) {
            configSize = surfaceConfig.configSize;
        }
        if ((i2 & 4) != 0) {
            streamUseCase = surfaceConfig.streamUseCase;
        }
        return surfaceConfig.copy(configType, configSize, streamUseCase);
    }

    public static final SurfaceConfig create(ConfigType configType, ConfigSize configSize) {
        return Companion.create(configType, configSize);
    }

    public static final ConfigType getConfigType(int i2) {
        return Companion.getConfigType(i2);
    }

    public static final SurfaceConfig transformSurfaceConfig(int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition, int i3, ConfigSource configSource, StreamUseCase streamUseCase) {
        return Companion.transformSurfaceConfig(i2, size, surfaceSizeDefinition, i3, configSource, streamUseCase);
    }

    public final ConfigType component1() {
        return this.configType;
    }

    public final ConfigSize component2() {
        return this.configSize;
    }

    public final StreamUseCase component3() {
        return this.streamUseCase;
    }

    public final SurfaceConfig copy(ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase) {
        x.f(configType, "configType");
        x.f(configSize, "configSize");
        x.f(streamUseCase, "streamUseCase");
        return new SurfaceConfig(configType, configSize, streamUseCase);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.configType == surfaceConfig.configType && this.configSize == surfaceConfig.configSize && this.streamUseCase == surfaceConfig.streamUseCase;
    }

    public final ConfigSize getConfigSize() {
        return this.configSize;
    }

    public final int getImageFormat() {
        return this.imageFormat;
    }

    public final Size getResolution(SurfaceSizeDefinition surfaceSizeDefinition) {
        Size previewSize;
        x.f(surfaceSizeDefinition, "definition");
        ConfigSize configSize = ConfigSize.VGA;
        int iOrdinal = this.configSize.ordinal();
        if (iOrdinal != 3) {
            switch (iOrdinal) {
                case 9:
                    previewSize = surfaceSizeDefinition.getRecordSize();
                    break;
                case 10:
                    previewSize = surfaceSizeDefinition.getMaximumSize(this.imageFormat);
                    break;
                case 11:
                    previewSize = surfaceSizeDefinition.getMaximum4x3Size(this.imageFormat);
                    break;
                case 12:
                    previewSize = surfaceSizeDefinition.getMaximum16x9Size(this.imageFormat);
                    break;
                case 13:
                    previewSize = surfaceSizeDefinition.getUltraMaximumSize(this.imageFormat);
                    break;
                case 14:
                    throw new IllegalStateException("Not supported config size");
                default:
                    previewSize = this.configSize.getRelatedFixedSize();
                    break;
            }
        } else {
            previewSize = surfaceSizeDefinition.getPreviewSize();
        }
        x.c(previewSize);
        return previewSize;
    }

    public final StreamUseCase getStreamUseCase() {
        return this.streamUseCase;
    }

    public int hashCode() {
        return (((this.configType.hashCode() * 31) + this.configSize.hashCode()) * 31) + this.streamUseCase.hashCode();
    }

    public final boolean isSupported(SurfaceConfig surfaceConfig) {
        StreamUseCase streamUseCase;
        x.f(surfaceConfig, "other");
        if (surfaceConfig.configSize.getId() > this.configSize.getId() || surfaceConfig.configType != this.configType) {
            return false;
        }
        StreamUseCase streamUseCase2 = this.streamUseCase;
        StreamUseCase streamUseCase3 = StreamUseCase.DEFAULT;
        return streamUseCase2 == streamUseCase3 || (streamUseCase = surfaceConfig.streamUseCase) == streamUseCase3 || streamUseCase == this.streamUseCase;
    }

    public String toString() {
        return "SurfaceConfig(configType=" + this.configType + ", configSize=" + this.configSize + ", streamUseCase=" + this.streamUseCase + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ SurfaceConfig create$default(Companion companion, ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
            }
            return companion.create(configType, configSize, streamUseCase);
        }

        public static /* synthetic */ SurfaceConfig transformSurfaceConfig$default(Companion companion, int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition, int i3, ConfigSource configSource, StreamUseCase streamUseCase, int i4, Object obj) {
            if ((i4 & 16) != 0) {
                configSource = ConfigSource.CAPTURE_SESSION_TABLES;
            }
            ConfigSource configSource2 = configSource;
            if ((i4 & 32) != 0) {
                streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
            }
            StreamUseCase streamUseCase2 = streamUseCase;
            if ((i4 & 8) != 0) {
                i3 = 0;
            }
            return companion.transformSurfaceConfig(i2, size, surfaceSizeDefinition, i3, configSource2, streamUseCase2);
        }

        public final SurfaceConfig create(ConfigType configType, ConfigSize configSize) {
            x.f(configType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            x.f(configSize, "size");
            return create$default(this, configType, configSize, null, 4, null);
        }

        public final ConfigType getConfigType(int i2) {
            ConfigType configType = (ConfigType) SurfaceConfig.CONFIG_TYPES_BY_IMAGE_FORMAT.get(Integer.valueOf(i2));
            return configType == null ? ConfigType.PRIV : configType;
        }

        public final SurfaceConfig transformSurfaceConfig(int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition, int i3, ConfigSource configSource, StreamUseCase streamUseCase) {
            x.f(size, "size");
            x.f(surfaceSizeDefinition, "surfaceSizeDefinition");
            x.f(configSource, "configSource");
            x.f(streamUseCase, "streamUseCase");
            ConfigType configType = getConfigType(i2);
            ConfigSize configSize = ConfigSize.NOT_SUPPORT;
            int area = SizeUtil.getArea(size);
            if (i3 == 1) {
                if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS720pSize(i2))) {
                    configSize = ConfigSize.S720P_16_9;
                } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS1440pSize(i2))) {
                    configSize = ConfigSize.S1440P_4_3;
                }
            } else if (configSource == ConfigSource.FEATURE_COMBINATION_TABLE) {
                Size maximumSize = surfaceSizeDefinition.getMaximumSize(i2);
                ConfigSize[] configSizeArr = SurfaceConfig.FEATURE_COMBO_QUERY_SUPPORTED_SIZES;
                int length = configSizeArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    ConfigSize configSize2 = configSizeArr[i4];
                    if (x.n(size, configSize2.getRelatedFixedSize())) {
                        configSize = configSize2;
                        break;
                    }
                    i4++;
                }
                if (configSize == ConfigSize.NOT_SUPPORT && x.n(size, maximumSize)) {
                    configSize = ConfigSize.MAXIMUM;
                }
            } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getAnalysisSize())) {
                configSize = ConfigSize.VGA;
            } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getPreviewSize())) {
                configSize = ConfigSize.PREVIEW;
            } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getRecordSize())) {
                configSize = ConfigSize.RECORD;
            } else {
                Size maximumSize2 = surfaceSizeDefinition.getMaximumSize(i2);
                Size ultraMaximumSize = surfaceSizeDefinition.getUltraMaximumSize(i2);
                if ((maximumSize2 == null || area <= SizeUtil.getArea(maximumSize2)) && i3 != 2) {
                    configSize = ConfigSize.MAXIMUM;
                } else if (ultraMaximumSize != null && area <= SizeUtil.getArea(ultraMaximumSize)) {
                    configSize = ConfigSize.ULTRA_MAXIMUM;
                }
            }
            return create(configType, configSize, streamUseCase);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final SurfaceConfig create(ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase) {
            x.f(configType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            x.f(configSize, "size");
            x.f(streamUseCase, "streamUseCase");
            return new SurfaceConfig(configType, configSize, streamUseCase);
        }

        public final SurfaceConfig transformSurfaceConfig(int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition, int i3) {
            x.f(size, "size");
            x.f(surfaceSizeDefinition, "surfaceSizeDefinition");
            return transformSurfaceConfig$default(this, i2, size, surfaceSizeDefinition, i3, null, null, 48, null);
        }

        public final SurfaceConfig transformSurfaceConfig(int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition, int i3, ConfigSource configSource) {
            x.f(size, "size");
            x.f(surfaceSizeDefinition, "surfaceSizeDefinition");
            x.f(configSource, "configSource");
            return transformSurfaceConfig$default(this, i2, size, surfaceSizeDefinition, i3, configSource, null, 32, null);
        }

        public final SurfaceConfig transformSurfaceConfig(int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition) {
            x.f(size, "size");
            x.f(surfaceSizeDefinition, "surfaceSizeDefinition");
            return transformSurfaceConfig$default(this, i2, size, surfaceSizeDefinition, 0, null, null, 56, null);
        }
    }

    public static final SurfaceConfig create(ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase) {
        return Companion.create(configType, configSize, streamUseCase);
    }

    public final ConfigType getConfigType() {
        return this.configType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class ConfigSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ConfigSize[] $VALUES;
        public static final ConfigSize MAXIMUM;
        public static final ConfigSize MAXIMUM_16_9;
        public static final ConfigSize MAXIMUM_4_3;
        public static final ConfigSize NOT_SUPPORT;
        public static final ConfigSize PREVIEW;
        public static final ConfigSize RECORD;
        public static final ConfigSize ULTRA_MAXIMUM;
        private final int id;
        private final Size relatedFixedSize;
        public static final ConfigSize VGA = new ConfigSize("VGA", 0, 0, new Size(640, 480));
        public static final ConfigSize X_VGA = new ConfigSize("X_VGA", 1, 1, new Size(1024, 768));
        public static final ConfigSize S720P_16_9 = new ConfigSize("S720P_16_9", 2, 2, new Size(DisplayStrings.DS_LOCATION_PREVIEW_TEMPORARILY_CLOSED, DisplayStrings.DS_KM_PD));
        public static final ConfigSize S1080P_4_3 = new ConfigSize("S1080P_4_3", 4, 4, new Size(DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
        public static final ConfigSize S1080P_16_9 = new ConfigSize("S1080P_16_9", 5, 5, new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT));
        public static final ConfigSize S1440P_4_3 = new ConfigSize("S1440P_4_3", 6, 6, new Size(DisplayStrings.DS_CUSTOM_PROMPT_ARRIVE, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT));
        public static final ConfigSize S1440P_16_9 = new ConfigSize("S1440P_16_9", 7, 7, new Size(DisplayStrings.DS_CARPLAY_ENABLE_MIC_PERMISSION_OK, DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT));
        public static final ConfigSize UHD = new ConfigSize("UHD", 8, 8, new Size(DisplayStrings.DS_COMPANINIO_EXPERIMENTAL_BUBBLE_LABEL, DisplayStrings.DS_ALERT_TITLE_BLOCKED_LANE_RIGHT));

        private static final /* synthetic */ ConfigSize[] $values() {
            return new ConfigSize[]{VGA, X_VGA, S720P_16_9, PREVIEW, S1080P_4_3, S1080P_16_9, S1440P_4_3, S1440P_16_9, UHD, RECORD, MAXIMUM, MAXIMUM_4_3, MAXIMUM_16_9, ULTRA_MAXIMUM, NOT_SUPPORT};
        }

        static {
            int i2 = 2;
            o oVar = null;
            Size size = null;
            PREVIEW = new ConfigSize("PREVIEW", 3, 3, size, i2, oVar);
            int i3 = 9;
            RECORD = new ConfigSize("RECORD", i3, i3, size, i2, oVar);
            int i4 = 10;
            MAXIMUM = new ConfigSize("MAXIMUM", i4, i4, null, 2, null);
            int i5 = 11;
            MAXIMUM_4_3 = new ConfigSize("MAXIMUM_4_3", i5, i5, null, 2, null);
            int i6 = 12;
            MAXIMUM_16_9 = new ConfigSize("MAXIMUM_16_9", i6, i6, null, 2, null);
            int i7 = 13;
            ULTRA_MAXIMUM = new ConfigSize("ULTRA_MAXIMUM", i7, i7, null, 2, null);
            int i8 = 14;
            NOT_SUPPORT = new ConfigSize("NOT_SUPPORT", i8, i8, null, 2, null);
            ConfigSize[] configSizeArr$values = $values();
            $VALUES = configSizeArr$values;
            $ENTRIES = b.a(configSizeArr$values);
        }

        /* synthetic */ ConfigSize(String str, int i2, int i3, Size size, int i4, o oVar) {
            this(str, i2, i3, (i4 & 2) != 0 ? null : size);
        }

        public static a<ConfigSize> getEntries() {
            return $ENTRIES;
        }

        public static ConfigSize valueOf(String str) {
            return (ConfigSize) Enum.valueOf(ConfigSize.class, str);
        }

        public static ConfigSize[] values() {
            return (ConfigSize[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }

        public final Size getRelatedFixedSize() {
            return this.relatedFixedSize;
        }

        private ConfigSize(String str, int i2, int i3, Size size) {
            this.id = i3;
            this.relatedFixedSize = size;
        }
    }

    public static final SurfaceConfig transformSurfaceConfig(int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition, int i3) {
        return Companion.transformSurfaceConfig(i2, size, surfaceSizeDefinition, i3);
    }

    public static final SurfaceConfig transformSurfaceConfig(int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition, int i3, ConfigSource configSource) {
        return Companion.transformSurfaceConfig(i2, size, surfaceSizeDefinition, i3, configSource);
    }

    public static final SurfaceConfig transformSurfaceConfig(int i2, Size size, SurfaceSizeDefinition surfaceSizeDefinition) {
        return Companion.transformSurfaceConfig(i2, size, surfaceSizeDefinition);
    }

    public /* synthetic */ SurfaceConfig(ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase, int i2, o oVar) {
        this(configType, configSize, (i2 & 4) != 0 ? DEFAULT_STREAM_USE_CASE : streamUseCase);
    }
}
