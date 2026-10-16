package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.UseCase;
import androidx.camera.core.imagecapture.ImageCaptureControl;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.imagecapture.TakePictureManagerImpl;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import j$.util.Objects;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface UseCaseConfig<T extends UseCase> extends TargetConfig<T>, ImageInputConfig {
    public static final Config.Option<SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = Config.Option.create("camerax.core.useCase.defaultSessionConfig", SessionConfig.class);
    public static final Config.Option<CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = Config.Option.create("camerax.core.useCase.defaultCaptureConfig", CaptureConfig.class);
    public static final Config.Option<SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.OptionUnpacker.class);
    public static final Config.Option<CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.captureConfigUnpacker", CaptureConfig.OptionUnpacker.class);
    public static final Config.Option<Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY = Config.Option.create("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_SESSION_TYPE = Config.Option.create("camerax.core.useCase.sessionType", Integer.TYPE);
    public static final Config.Option<Range<Integer>> OPTION_TARGET_FRAME_RATE = Config.Option.create("camerax.core.useCase.targetFrameRate", Range.class);
    public static final Config.Option<Boolean> OPTION_IS_STRICT_FRAME_RATE_REQUIRED = Config.Option.create("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class);
    public static final Config.Option<Map<Size, Integer>> OPTION_RESOLUTION_TO_MAX_FRAME_RATES = Config.Option.create("camerax.core.useCase.resolutionToMaxFrameRate", Map.class);
    public static final Config.Option<Boolean> OPTION_ZSL_DISABLED = Config.Option.create("camerax.core.useCase.zslDisabled", Boolean.TYPE);
    public static final Config.Option<Boolean> OPTION_HIGH_RESOLUTION_DISABLED = Config.Option.create("camerax.core.useCase.highResolutionDisabled", Boolean.TYPE);
    public static final Config.Option<UseCaseConfigFactory.CaptureType> OPTION_CAPTURE_TYPE = Config.Option.create("camerax.core.useCase.captureType", UseCaseConfigFactory.CaptureType.class);
    public static final Config.Option<Integer> OPTION_PREVIEW_STABILIZATION_MODE = Config.Option.create("camerax.core.useCase.previewStabilizationMode", Integer.TYPE);
    public static final Config.Option<Integer> OPTION_VIDEO_STABILIZATION_MODE = Config.Option.create("camerax.core.useCase.videoStabilizationMode", Integer.TYPE);
    public static final Config.Option<Boolean> OPTION_IS_VIDEO_QUALITY_SELECTOR_DEFAULT = Config.Option.create("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class);
    public static final Config.Option<TakePictureManager.Provider> OPTION_TAKE_PICTURE_MANAGER_PROVIDER = Config.Option.create("camerax.core.useCase.takePictureManagerProvider", TakePictureManager.Provider.class);
    public static final Config.Option<StreamUseCase> OPTION_STREAM_USE_CASE = Config.Option.create("camerax.core.useCase.streamUseCase", StreamUseCase.class);

    /* compiled from: WazeSource */
    public interface Builder<T extends UseCase, C extends UseCaseConfig<T>, B> extends TargetConfig.Builder<T, B>, ExtendableBuilder<T> {
        C getUseCaseConfig();

        B setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker);

        B setCaptureType(UseCaseConfigFactory.CaptureType captureType);

        B setDefaultCaptureConfig(CaptureConfig captureConfig);

        B setDefaultSessionConfig(SessionConfig sessionConfig);

        B setHighResolutionDisabled(boolean z);

        B setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker);

        B setStreamUseCase(StreamUseCase streamUseCase);

        B setSurfaceOccupancyPriority(int i2);

        B setZslDisabled(boolean z);
    }

    CaptureConfig.OptionUnpacker getCaptureOptionUnpacker();

    CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker);

    UseCaseConfigFactory.CaptureType getCaptureType();

    int getCustomMaxFrameRate(Size size);

    CaptureConfig getDefaultCaptureConfig();

    CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig);

    SessionConfig getDefaultSessionConfig();

    SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig);

    int getPreviewStabilizationMode();

    SessionConfig.OptionUnpacker getSessionOptionUnpacker();

    SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker);

    int getSessionType();

    int getSessionType(int i2);

    StreamUseCase getStreamUseCase();

    int getSurfaceOccupancyPriority();

    int getSurfaceOccupancyPriority(int i2);

    TakePictureManager.Provider getTakePictureManagerProvider();

    Range<Integer> getTargetFrameRate();

    Range<Integer> getTargetFrameRate(Range<Integer> range);

    int getVideoStabilizationMode();

    boolean hasTargetFrameRate();

    boolean isHighResolutionDisabled(boolean z);

    boolean isStrictFrameRateRequired();

    boolean isZslDisabled(boolean z);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.UseCaseConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static CaptureConfig.OptionUnpacker $default$getCaptureOptionUnpacker(UseCaseConfig useCaseConfig) {
            return (CaptureConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER);
        }

        public static UseCaseConfigFactory.CaptureType $default$getCaptureType(UseCaseConfig useCaseConfig) {
            return (UseCaseConfigFactory.CaptureType) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_TYPE);
        }

        public static int $default$getCustomMaxFrameRate(UseCaseConfig useCaseConfig, Size size) {
            Map map = (Map) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_RESOLUTION_TO_MAX_FRAME_RATES, null);
            if (map == null || !map.containsKey(size)) {
                return Integer.MAX_VALUE;
            }
            return ((Integer) Objects.requireNonNull((Integer) map.get(size))).intValue();
        }

        public static CaptureConfig $default$getDefaultCaptureConfig(UseCaseConfig useCaseConfig) {
            return (CaptureConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG);
        }

        public static SessionConfig $default$getDefaultSessionConfig(UseCaseConfig useCaseConfig) {
            return (SessionConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG);
        }

        public static SessionConfig.OptionUnpacker $default$getSessionOptionUnpacker(UseCaseConfig useCaseConfig) {
            return (SessionConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER);
        }

        public static StreamUseCase $default$getStreamUseCase(UseCaseConfig useCaseConfig) {
            return (StreamUseCase) Objects.requireNonNull((StreamUseCase) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_STREAM_USE_CASE, StreamUseCase.DEFAULT));
        }

        public static TakePictureManager.Provider $default$getTakePictureManagerProvider(final UseCaseConfig useCaseConfig) {
            return (TakePictureManager.Provider) Objects.requireNonNull((TakePictureManager.Provider) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_TAKE_PICTURE_MANAGER_PROVIDER, new TakePictureManager.Provider() { // from class: androidx.camera.core.impl.UseCaseConfig.1
                @Override // androidx.camera.core.imagecapture.TakePictureManager.Provider
                public TakePictureManager newInstance(ImageCaptureControl imageCaptureControl) {
                    return new TakePictureManagerImpl(imageCaptureControl);
                }
            }));
        }

        public static Range $default$getTargetFrameRate(UseCaseConfig useCaseConfig) {
            return (Range) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE);
        }

        public static CaptureConfig.OptionUnpacker $default$getCaptureOptionUnpacker(UseCaseConfig useCaseConfig, CaptureConfig.OptionUnpacker optionUnpacker) {
            return (CaptureConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
        }

        public static CaptureConfig $default$getDefaultCaptureConfig(UseCaseConfig useCaseConfig, CaptureConfig captureConfig) {
            return (CaptureConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
        }

        public static SessionConfig $default$getDefaultSessionConfig(UseCaseConfig useCaseConfig, SessionConfig sessionConfig) {
            return (SessionConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
        }

        public static SessionConfig.OptionUnpacker $default$getSessionOptionUnpacker(UseCaseConfig useCaseConfig, SessionConfig.OptionUnpacker optionUnpacker) {
            return (SessionConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
        }

        public static Range $default$getTargetFrameRate(UseCaseConfig useCaseConfig, Range range) {
            return (Range) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
        }
    }
}
