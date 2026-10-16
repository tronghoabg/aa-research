package androidx.camera.core.featuregroup.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.streamsharing.StreamSharing;
import h.d.a;
import h.d.b;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UseCaseType[] $VALUES;
    public static final Companion Companion;
    private final Class<?> surfaceClass;
    public static final UseCaseType PREVIEW = new UseCaseType("PREVIEW", 0, SurfaceHolder.class);
    public static final UseCaseType IMAGE_CAPTURE = new UseCaseType("IMAGE_CAPTURE", 1, null);
    public static final UseCaseType IMAGE_ANALYSIS = new UseCaseType("IMAGE_ANALYSIS", 2, null);
    public static final UseCaseType VIDEO_CAPTURE = new UseCaseType("VIDEO_CAPTURE", 3, MediaCodec.class);
    public static final UseCaseType STREAM_SHARING = new UseCaseType("STREAM_SHARING", 4, SurfaceTexture.class);
    public static final UseCaseType UNDEFINED = new UseCaseType("UNDEFINED", 5, null);

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UseCaseType.values().length];
            try {
                iArr[UseCaseType.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UseCaseType.IMAGE_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UseCaseType.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UseCaseType.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UseCaseType.STREAM_SHARING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UseCaseType.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ UseCaseType[] $values() {
        return new UseCaseType[]{PREVIEW, IMAGE_CAPTURE, IMAGE_ANALYSIS, VIDEO_CAPTURE, STREAM_SHARING, UNDEFINED};
    }

    static {
        UseCaseType[] useCaseTypeArr$values = $values();
        $VALUES = useCaseTypeArr$values;
        $ENTRIES = b.a(useCaseTypeArr$values);
        Companion = new Companion(null);
    }

    private UseCaseType(String str, int i2, Class cls) {
        this.surfaceClass = cls;
    }

    public static a<UseCaseType> getEntries() {
        return $ENTRIES;
    }

    public static final UseCaseType getFeatureGroupUseCaseType(UseCase useCase) {
        return Companion.getFeatureGroupUseCaseType(useCase);
    }

    public static UseCaseType valueOf(String str) {
        return (UseCaseType) Enum.valueOf(UseCaseType.class, str);
    }

    public static UseCaseType[] values() {
        return (UseCaseType[]) $VALUES.clone();
    }

    public final Class<?> getSurfaceClass() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Preview";
        }
        if (iOrdinal == 1) {
            return "ImageCapture";
        }
        if (iOrdinal == 2) {
            return "ImageAnalysis";
        }
        if (iOrdinal == 3) {
            return "VideoCapture";
        }
        if (iOrdinal == 4) {
            return "StreamSharing";
        }
        if (iOrdinal == 5) {
            return "Undefined";
        }
        throw new i();
    }

    /* compiled from: WazeSource */
    public final class Companion {

        /* compiled from: WazeSource */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
                try {
                    iArr[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[FeatureTypeInternal.values().length];
                try {
                    iArr2[FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private Companion() {
        }

        private final boolean isConfiguredToUseCaseByApp(FeatureTypeInternal featureTypeInternal, UseCase useCase) {
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
            FeatureTypeInternal featureTypeInternal2 = FeatureTypeInternal.DYNAMIC_RANGE;
            int iOrdinal = featureTypeInternal.ordinal();
            if (iOrdinal == 0) {
                return isDynamicRangeConfiguredByApp(useCase);
            }
            if (iOrdinal == 1) {
                return isFpsRangeConfiguredByApp(useCase);
            }
            if (iOrdinal == 2) {
                return isStabilizationModeConfiguredByApp(useCase);
            }
            if (iOrdinal == 3) {
                return isImageFormatConfiguredByApp(useCase);
            }
            if (iOrdinal == 4) {
                return isRecordingQualityConfiguredByApp(useCase);
            }
            throw new i();
        }

        private final boolean isDynamicRangeConfiguredByApp(UseCase useCase) {
            return useCase.getAppConfig().hasDynamicRange();
        }

        private final boolean isFpsRangeConfiguredByApp(UseCase useCase) {
            return useCase.getAppConfig().hasTargetFrameRate();
        }

        private final boolean isImageFormatConfiguredByApp(UseCase useCase) {
            return useCase.getAppConfig().containsOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT);
        }

        private final boolean isRecordingQualityConfiguredByApp(UseCase useCase) {
            return x.n(useCase.getAppConfig().retrieveOption(UseCaseConfig.OPTION_IS_VIDEO_QUALITY_SELECTOR_DEFAULT, true), false);
        }

        private final boolean isStabilizationModeConfiguredByApp(UseCase useCase) {
            return useCase.getAppConfig().containsOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE) || useCase.getAppConfig().containsOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE);
        }

        public final FeatureTypeInternal getAppConfiguredGroupableFeatureType$camera_core(UseCase useCase) {
            FeatureTypeInternal next;
            x.f(useCase, "<this>");
            Iterator<FeatureTypeInternal> it = FeatureTypeInternal.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (UseCaseType.Companion.isConfiguredToUseCaseByApp(next, useCase)) {
                    break;
                }
            }
            return next;
        }

        public final UseCaseType getFeatureGroupUseCaseType(UseCaseConfig<?> useCaseConfig) {
            x.f(useCaseConfig, "<this>");
            UseCaseConfigFactory.CaptureType captureType = useCaseConfig.getCaptureType();
            UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
            FeatureTypeInternal featureTypeInternal = FeatureTypeInternal.DYNAMIC_RANGE;
            int iOrdinal = captureType.ordinal();
            return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? UseCaseType.UNDEFINED : UseCaseType.STREAM_SHARING : UseCaseType.VIDEO_CAPTURE : UseCaseType.IMAGE_ANALYSIS : UseCaseType.PREVIEW : UseCaseType.IMAGE_CAPTURE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final UseCaseType getFeatureGroupUseCaseType(UseCase useCase) {
            x.f(useCase, "<this>");
            if (useCase instanceof Preview) {
                return UseCaseType.PREVIEW;
            }
            if (useCase instanceof ImageCapture) {
                return UseCaseType.IMAGE_CAPTURE;
            }
            if (useCase instanceof ImageAnalysis) {
                return UseCaseType.IMAGE_ANALYSIS;
            }
            if (UseCaseUtil.isVideoCapture(useCase)) {
                return UseCaseType.VIDEO_CAPTURE;
            }
            if (useCase instanceof StreamSharing) {
                return UseCaseType.STREAM_SHARING;
            }
            return UseCaseType.UNDEFINED;
        }
    }

    public static final UseCaseType getFeatureGroupUseCaseType(UseCaseConfig<?> useCaseConfig) {
        return Companion.getFeatureGroupUseCaseType(useCaseConfig);
    }
}
