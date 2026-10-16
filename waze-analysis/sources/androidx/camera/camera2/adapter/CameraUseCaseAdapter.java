package androidx.camera.camera2.adapter;

import android.app.Application;
import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.compat.workaround.ImageCapturePixelHDRPlusKt;
import androidx.camera.camera2.compat.workaround.PreviewPixelHDRnetKt;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraUseCaseAdapter implements UseCaseConfigFactory {
    private final DisplayInfoManager displayInfoManager;
    private final boolean isPreviewResolutionBypassEnabled;

    /* compiled from: WazeSource */
    public final class DefaultSessionOptionsUnpacker implements SessionConfig.OptionUnpacker {
        public static final DefaultSessionOptionsUnpacker INSTANCE = new DefaultSessionOptionsUnpacker();

        private DefaultSessionOptionsUnpacker() {
        }

        @Override // androidx.camera.core.impl.SessionConfig.OptionUnpacker
        public void unpack(Size size, UseCaseConfig<?> useCaseConfig, SessionConfig.Builder builder) {
            x.f(size, "resolution");
            x.f(useCaseConfig, "config");
            x.f(builder, "builder");
            SessionConfig defaultSessionConfig = useCaseConfig.getDefaultSessionConfig(null);
            OptionsBundle optionsBundleEmptyBundle = OptionsBundle.emptyBundle();
            x.e(optionsBundleEmptyBundle, "emptyBundle(...)");
            OptionsBundle implementationOptions = optionsBundleEmptyBundle;
            int templateType = SessionConfig.defaultEmptySessionConfig().getTemplateType();
            if (defaultSessionConfig != null) {
                templateType = defaultSessionConfig.getTemplateType();
                builder.addAllDeviceStateCallbacks(defaultSessionConfig.getDeviceStateCallbacks());
                builder.addAllSessionStateCallbacks(defaultSessionConfig.getSessionStateCallbacks());
                builder.addAllRepeatingCameraCaptureCallbacks(defaultSessionConfig.getRepeatingCameraCaptureCallbacks());
                implementationOptions = defaultSessionConfig.getImplementationOptions();
                x.e(implementationOptions, "getImplementationOptions(...)");
            }
            builder.setImplementationOptions(implementationOptions);
            if (useCaseConfig instanceof PreviewConfig) {
                PreviewPixelHDRnetKt.setupHDRnet(builder, size);
            }
            Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(useCaseConfig);
            builder.setTemplateType(camera2ImplConfig.getCaptureRequestTemplate(templateType));
            CameraDevice.StateCallback deviceStateCallback$default = Camera2ImplConfig.getDeviceStateCallback$default(camera2ImplConfig, null, 1, null);
            if (deviceStateCallback$default != null) {
                builder.addDeviceStateCallback(deviceStateCallback$default);
            }
            CameraCaptureSession.StateCallback sessionStateCallback$default = Camera2ImplConfig.getSessionStateCallback$default(camera2ImplConfig, null, 1, null);
            if (sessionStateCallback$default != null) {
                builder.addSessionStateCallback(sessionStateCallback$default);
            }
            CameraCaptureSession.CaptureCallback sessionCaptureCallback$default = Camera2ImplConfig.getSessionCaptureCallback$default(camera2ImplConfig, null, 1, null);
            if (sessionCaptureCallback$default != null) {
                builder.addCameraCaptureCallback(CaptureCallbackContainer.Companion.create(sessionCaptureCallback$default));
            }
            builder.setPreviewStabilization(useCaseConfig.getPreviewStabilizationMode());
            builder.setVideoStabilization(useCaseConfig.getVideoStabilizationMode());
            MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
            String physicalCameraId$default = Camera2ImplConfig.getPhysicalCameraId$default(camera2ImplConfig, null, 1, null);
            if (physicalCameraId$default != null) {
                mutableOptionsBundleCreate.insertOption(Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, physicalCameraId$default);
            }
            Long streamUseCase$default = Camera2ImplConfig.getStreamUseCase$default(camera2ImplConfig, null, 1, null);
            if (streamUseCase$default != null) {
                mutableOptionsBundleCreate.insertOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION, Long.valueOf(streamUseCase$default.longValue()));
            }
            x.e(mutableOptionsBundleCreate, "apply(...)");
            builder.addImplementationOptions(mutableOptionsBundleCreate);
            builder.addImplementationOptions(camera2ImplConfig.getCaptureRequestOptions());
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.METERING_REPEATING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CameraUseCaseAdapter(Context context, boolean z) {
        x.f(context, "context");
        this.isPreviewResolutionBypassEnabled = z;
        this.displayInfoManager = DisplayInfoManager.Companion.getInstance(context);
        if (context instanceof Application) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isInfoEnabled(Log.TAG)) {
                android.util.Log.i(Camera2Logger.TRUNCATED_TAG, "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
            }
        }
        Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Created UseCaseConfigurationMap");
        }
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public Config getConfig(UseCaseConfigFactory.CaptureType captureType, int i2) {
        x.f(captureType, "captureType");
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            Objects.toString(captureType);
            android.util.Log.d(str, "Creating config for ".concat(String.valueOf(captureType)));
        }
        MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
        x.e(mutableOptionsBundleCreate, "create(...)");
        SessionConfig.Builder builder = new SessionConfig.Builder();
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
        int iOrdinal = captureType.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            builder.setTemplateType(1);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4 && iOrdinal != 5) {
                throw new i();
            }
            builder.setTemplateType(1);
        } else {
            builder.setTemplateType(DeviceQuirks.INSTANCE.get(PreviewUnderExposureQuirk.class) != null ? 1 : 3);
        }
        mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, builder.build());
        CaptureConfig.Builder builder2 = new CaptureConfig.Builder();
        int iOrdinal2 = captureType.ordinal();
        if (iOrdinal2 == 0) {
            builder2.setTemplateType(i2 != 2 ? 2 : 5);
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            builder2.setTemplateType(1);
        } else if (iOrdinal2 != 3) {
            if (iOrdinal2 != 4 && iOrdinal2 != 5) {
                throw new i();
            }
            builder2.setTemplateType(1);
        } else {
            builder2.setTemplateType(DeviceQuirks.INSTANCE.get(PreviewUnderExposureQuirk.class) != null ? 1 : 3);
        }
        mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, builder2.build());
        mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? ImageCaptureOptionUnpacker.Companion.getINSTANCE() : DefaultCaptureOptionsUnpacker.Companion.getINSTANCE());
        mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, DefaultSessionOptionsUnpacker.INSTANCE);
        if (captureType == UseCaseConfigFactory.CaptureType.PREVIEW && !this.isPreviewResolutionBypassEnabled) {
            mutableOptionsBundleCreate.insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, this.displayInfoManager.getPreviewSize());
        }
        mutableOptionsBundleCreate.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(this.displayInfoManager.getMaxSizeDisplay(1 == ((false ? 1 : 0) | (1 & 1))).getRotation()));
        OptionsBundle optionsBundleFrom = OptionsBundle.from(mutableOptionsBundleCreate);
        x.e(optionsBundleFrom, "from(...)");
        return optionsBundleFrom;
    }

    /* compiled from: WazeSource */
    public final class CaptureCallbackContainer extends CameraCaptureCallback {
        public static final Companion Companion = new Companion(null);
        private final CameraCaptureSession.CaptureCallback captureCallback;

        private CaptureCallbackContainer(CameraCaptureSession.CaptureCallback captureCallback) {
            this.captureCallback = captureCallback;
        }

        public final CameraCaptureSession.CaptureCallback getCaptureCallback() {
            return this.captureCallback;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final CaptureCallbackContainer create(CameraCaptureSession.CaptureCallback captureCallback) {
                x.f(captureCallback, "captureCallback");
                return new CaptureCallbackContainer(captureCallback, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ CaptureCallbackContainer(CameraCaptureSession.CaptureCallback captureCallback, o oVar) {
            this(captureCallback);
        }
    }

    /* compiled from: WazeSource */
    public class DefaultCaptureOptionsUnpacker implements CaptureConfig.OptionUnpacker {
        public static final Companion Companion = new Companion(null);
        private static final DefaultCaptureOptionsUnpacker INSTANCE = new DefaultCaptureOptionsUnpacker();

        @Override // androidx.camera.core.impl.CaptureConfig.OptionUnpacker
        public void unpack(UseCaseConfig<?> useCaseConfig, CaptureConfig.Builder builder) {
            x.f(useCaseConfig, "config");
            x.f(builder, "builder");
            CaptureConfig defaultCaptureConfig = useCaseConfig.getDefaultCaptureConfig(null);
            OptionsBundle optionsBundleEmptyBundle = OptionsBundle.emptyBundle();
            x.e(optionsBundleEmptyBundle, "emptyBundle(...)");
            OptionsBundle implementationOptions = optionsBundleEmptyBundle;
            int templateType = CaptureConfig.defaultEmptyCaptureConfig().getTemplateType();
            if (defaultCaptureConfig != null) {
                templateType = defaultCaptureConfig.getTemplateType();
                builder.addAllCameraCaptureCallbacks(defaultCaptureConfig.getCameraCaptureCallbacks());
                implementationOptions = defaultCaptureConfig.getImplementationOptions();
                x.e(implementationOptions, "getImplementationOptions(...)");
                builder.setUseRepeatingSurface(defaultCaptureConfig.isUseRepeatingSurface());
                builder.addAllTags(defaultCaptureConfig.getTagBundle());
                List<DeferrableSurface> surfaces = defaultCaptureConfig.getSurfaces();
                x.e(surfaces, "getSurfaces(...)");
                Iterator<T> it = surfaces.iterator();
                while (it.hasNext()) {
                    builder.addSurface((DeferrableSurface) it.next());
                }
            }
            builder.setImplementationOptions(implementationOptions);
            Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(useCaseConfig);
            builder.setTemplateType(camera2ImplConfig.getCaptureRequestTemplate(templateType));
            CameraCaptureSession.CaptureCallback sessionCaptureCallback$default = Camera2ImplConfig.getSessionCaptureCallback$default(camera2ImplConfig, null, 1, null);
            if (sessionCaptureCallback$default != null) {
                builder.addCameraCaptureCallback(CaptureCallbackContainer.Companion.create(sessionCaptureCallback$default));
            }
            builder.addImplementationOptions(camera2ImplConfig.getCaptureRequestOptions());
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final DefaultCaptureOptionsUnpacker getINSTANCE() {
                return DefaultCaptureOptionsUnpacker.INSTANCE;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class ImageCaptureOptionUnpacker extends DefaultCaptureOptionsUnpacker {
        public static final Companion Companion = new Companion(null);
        private static final ImageCaptureOptionUnpacker INSTANCE = new ImageCaptureOptionUnpacker();

        @Override // androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker, androidx.camera.core.impl.CaptureConfig.OptionUnpacker
        public void unpack(UseCaseConfig<?> useCaseConfig, CaptureConfig.Builder builder) {
            x.f(useCaseConfig, "config");
            x.f(builder, "builder");
            super.unpack(useCaseConfig, builder);
            if (!(useCaseConfig instanceof ImageCaptureConfig)) {
                throw new IllegalArgumentException("config is not ImageCaptureConfig");
            }
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            ImageCapturePixelHDRPlusKt.toggleHDRPlus(builder2, (ImageCaptureConfig) useCaseConfig);
            builder.addImplementationOptions(builder2.build());
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final ImageCaptureOptionUnpacker getINSTANCE() {
                return ImageCaptureOptionUnpacker.INSTANCE;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    public /* synthetic */ CameraUseCaseAdapter(Context context, boolean z, int i2, o oVar) {
        this(context, z & ((i2 & 2) == 0));
    }
}
