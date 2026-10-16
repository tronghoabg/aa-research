package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageAnalysis extends UseCase {
    public static final int COORDINATE_SYSTEM_ORIGINAL = 0;
    public static final int COORDINATE_SYSTEM_SENSOR = 2;
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    private static final int DEFAULT_BACKPRESSURE_STRATEGY = 0;
    private static final int DEFAULT_IMAGE_QUEUE_DEPTH = 6;
    private static final int DEFAULT_OUTPUT_IMAGE_FORMAT = 1;
    private static final boolean DEFAULT_OUTPUT_IMAGE_ROTATION_ENABLED = false;
    private static final int NON_BLOCKING_IMAGE_DEPTH = 4;
    public static final int OUTPUT_IMAGE_FORMAT_NV21 = 3;
    public static final int OUTPUT_IMAGE_FORMAT_PRIVATE = 4;
    public static final int OUTPUT_IMAGE_FORMAT_RGBA_8888 = 2;
    public static final int OUTPUT_IMAGE_FORMAT_YUV_420_888 = 1;
    public static final int STRATEGY_BLOCK_PRODUCER = 1;
    public static final int STRATEGY_KEEP_ONLY_LATEST = 0;
    private static final String TAG = "ImageAnalysis";
    private final Object mAnalysisLock;
    private SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private DeferrableSurface mDeferrableSurface;
    ImageAnalysisAbstractAnalyzer mImageAnalysisAbstractAnalyzer;
    private Matrix mSensorToBufferTransformMatrix;
    SessionConfig.Builder mSessionConfigBuilder;
    private Analyzer mSubscribedAnalyzer;
    private Executor mSubscribedAnalyzerExecutor;
    private Rect mViewPortCropRect;
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final Boolean DEFAULT_ONE_PIXEL_SHIFT_ENABLED = null;

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static boolean isSupported(int i2, int i3, int i4, int i5, long j2) {
            try {
                return HardwareBuffer.isSupported(i2, i3, i4, i5, j2);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BackpressureStrategy {
    }

    /* compiled from: WazeSource */
    class ImageAnalysisCapabilitiesImpl implements ImageAnalysisCapabilities {
        private final CameraInfo mCameraInfo;

        ImageAnalysisCapabilitiesImpl(CameraInfo cameraInfo) {
            this.mCameraInfo = cameraInfo;
        }

        @Override // androidx.camera.core.ImageAnalysisCapabilities
        public boolean isOutputFormatSupported(int i2) {
            Size maxSize;
            if (i2 != 4) {
                return i2 == 1 || i2 == 2 || i2 == 3;
            }
            CameraInfo cameraInfo = this.mCameraInfo;
            Size size = SizeUtil.RESOLUTION_VGA;
            if ((cameraInfo instanceof CameraInfoInternal) && (maxSize = SizeUtil.getMaxSize(((CameraInfoInternal) this.mCameraInfo).getSupportedResolutions(34))) != null) {
                size = maxSize;
            }
            if (ImageAnalysis.isHardwareBufferSupported(size)) {
                CameraInfo cameraInfo2 = this.mCameraInfo;
                if ((cameraInfo2 instanceof CameraInfoInternal) && ((CameraInfoInternal) cameraInfo2).getSupportedOutputFormats().contains(34)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputImageFormat {
    }

    ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.mAnalysisLock = new Object();
    }

    public static ImageAnalysisCapabilities getImageAnalysisCapabilities(CameraInfo cameraInfo) {
        return new ImageAnalysisCapabilitiesImpl(cameraInfo);
    }

    private boolean isFlipWH(CameraInternal cameraInternal) {
        return isOutputImageRotationEnabled() && getRelativeRotation(cameraInternal) % 180 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isHardwareBufferSupported(Size size) {
        return Api29Impl.isSupported(size.getWidth(), size.getHeight(), 34, 1, 256L);
    }

    static /* synthetic */ void lambda$createPipeline$1(SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        safeCloseImageReaderProxy.safeClose();
        if (safeCloseImageReaderProxy2 != null) {
            safeCloseImageReaderProxy2.safeClose();
        }
    }

    static /* synthetic */ List lambda$onMergeConfig$0(Size size, List list, int i2) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    private void recreateImageAnalysisAbstractAnalyzer() {
        Analyzer analyzer;
        synchronized (this.mAnalysisLock) {
            ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) getCurrentConfig();
            if (imageAnalysisConfig.getBackpressureStrategy(0) == 1) {
                this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisBlockingAnalyzer();
            } else {
                this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisNonBlockingAnalyzer(imageAnalysisConfig.getBackgroundExecutor(CameraXExecutors.highPriorityExecutor()));
            }
            this.mImageAnalysisAbstractAnalyzer.setOutputImageFormat(getOutputImageFormat());
            this.mImageAnalysisAbstractAnalyzer.setOutputImageRotationEnabled(isOutputImageRotationEnabled());
            CameraInternal camera = getCamera();
            Boolean onePixelShiftEnabled = getOnePixelShiftEnabled();
            boolean zContains = camera != null ? camera.getCameraInfoInternal().getCameraQuirks().contains(OnePixelShiftQuirk.class) : false;
            ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
            if (onePixelShiftEnabled != null) {
                zContains = onePixelShiftEnabled.booleanValue();
            }
            imageAnalysisAbstractAnalyzer.setOnePixelShiftEnabled(zContains);
            if (camera != null) {
                this.mImageAnalysisAbstractAnalyzer.setRelativeRotation(getRelativeRotation(camera));
            }
            Rect rect = this.mViewPortCropRect;
            if (rect != null) {
                this.mImageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
            }
            Matrix matrix = this.mSensorToBufferTransformMatrix;
            if (matrix != null) {
                this.mImageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
            }
            Executor executor = this.mSubscribedAnalyzerExecutor;
            if (executor != null && (analyzer = this.mSubscribedAnalyzer) != null) {
                this.mImageAnalysisAbstractAnalyzer.setAnalyzer(executor, analyzer);
            }
        }
    }

    private void tryUpdateRelativeRotation() {
        synchronized (this.mAnalysisLock) {
            CameraInternal camera = getCamera();
            if (camera != null) {
                this.mImageAnalysisAbstractAnalyzer.setRelativeRotation(getRelativeRotation(camera));
            }
        }
    }

    public void clearAnalyzer() {
        synchronized (this.mAnalysisLock) {
            ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
            if (imageAnalysisAbstractAnalyzer != null) {
                imageAnalysisAbstractAnalyzer.setAnalyzer(null, null);
            }
            if (this.mSubscribedAnalyzer != null) {
                notifyInactive();
            }
            this.mSubscribedAnalyzerExecutor = null;
            this.mSubscribedAnalyzer = null;
        }
    }

    void clearPipeline() {
        Threads.checkMainThread();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
    }

    SessionConfig.Builder createPipeline(String str, ImageAnalysisConfig imageAnalysisConfig, StreamSpec streamSpec) {
        long j2;
        final ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer;
        Threads.checkMainThread();
        Size resolution = streamSpec.getResolution();
        Executor backgroundExecutor = imageAnalysisConfig.getBackgroundExecutor(CameraXExecutors.highPriorityExecutor());
        Preconditions.checkNotNull(backgroundExecutor);
        boolean z = true;
        int imageQueueDepth = getBackpressureStrategy() == 1 ? getImageQueueDepth() : 4;
        if (getImageFormat() != 34) {
            j2 = 0;
        } else {
            if (!isHardwareBufferSupported(resolution)) {
                throw new IllegalArgumentException("PRIVATE format with resolution " + resolution + " is not supported for ImageAnalysis on the device.");
            }
            j2 = 256;
        }
        long j3 = j2;
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy = imageAnalysisConfig.getImageReaderProxyProvider() != null ? new SafeCloseImageReaderProxy(imageAnalysisConfig.getImageReaderProxyProvider().newInstance(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth, j3)) : new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth, j3));
        synchronized (this.mAnalysisLock) {
            recreateImageAnalysisAbstractAnalyzer();
            imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
        }
        boolean zIsFlipWH = getCamera() != null ? isFlipWH(getCamera()) : false;
        int height = zIsFlipWH ? resolution.getHeight() : resolution.getWidth();
        int width = zIsFlipWH ? resolution.getWidth() : resolution.getHeight();
        int i2 = getOutputImageFormat() == 2 ? 1 : 35;
        boolean z2 = getImageFormat() == 35 && getOutputImageFormat() == 2;
        boolean z3 = getImageFormat() == 35 && getOutputImageFormat() == 3;
        if (getImageFormat() != 35 || (!isOutputImageRotationEnabled() && !Boolean.TRUE.equals(getOnePixelShiftEnabled()))) {
            z = false;
        }
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = (z2 || (z && !z3)) ? new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(height, width, i2, safeCloseImageReaderProxy.getMaxImages())) : null;
        if (safeCloseImageReaderProxy2 != null) {
            imageAnalysisAbstractAnalyzer.setProcessedImageReaderProxy(safeCloseImageReaderProxy2);
        }
        tryUpdateRelativeRotation();
        safeCloseImageReaderProxy.setOnImageAvailableListener(imageAnalysisAbstractAnalyzer, backgroundExecutor);
        SessionConfig.Builder builderCreateFrom = SessionConfig.Builder.createFrom(imageAnalysisConfig, streamSpec.getResolution());
        if (streamSpec.getImplementationOptions() != null) {
            builderCreateFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(safeCloseImageReaderProxy.getSurface(), resolution, getImageFormat());
        this.mDeferrableSurface = immediateSurface;
        immediateSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ImageAnalysis.lambda$createPipeline$1(safeCloseImageReaderProxy, safeCloseImageReaderProxy2);
            }
        }, CameraXExecutors.mainThreadExecutor());
        builderCreateFrom.setSessionType(streamSpec.getSessionType());
        applyExpectedFrameRateRange(builderCreateFrom, streamSpec);
        builderCreateFrom.addSurface(this.mDeferrableSurface, streamSpec.getDynamicRange(), null, -1);
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda3
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                this.f$0.m1315lambda$createPipeline$2$androidxcameracoreImageAnalysis(imageAnalysisAbstractAnalyzer, sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        builderCreateFrom.setErrorListener(closeableErrorListener2);
        return builderCreateFrom;
    }

    public Executor getBackgroundExecutor() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getBackgroundExecutor(null);
    }

    public int getBackpressureStrategy() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0);
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Defaults defaults = DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z) {
            config = Config.CC.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getImageQueueDepth() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getImageQueueDepth(6);
    }

    public Boolean getOnePixelShiftEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOnePixelShiftEnabled(DEFAULT_ONE_PIXEL_SHIFT_ENABLED);
    }

    public int getOutputImageFormat() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOutputImageFormat(1);
    }

    public ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    public ResolutionSelector getResolutionSelector() {
        return ((ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    @Override // androidx.camera.core.UseCase
    public boolean isAutoRotationSupported() {
        return true;
    }

    public boolean isOutputImageRotationEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).isOutputImageRotationEnabled(false).booleanValue();
    }

    /* renamed from: lambda$createPipeline$2$androidx-camera-core-ImageAnalysis, reason: not valid java name */
    /* synthetic */ void m1315lambda$createPipeline$2$androidxcameracoreImageAnalysis(ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, androidx.camera.core.impl.SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        if (getCamera() == null) {
            return;
        }
        clearPipeline();
        imageAnalysisAbstractAnalyzer.clearCache();
        String cameraId = getCameraId();
        ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) getCurrentConfig();
        StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        Preconditions.checkNotNull(attachedStreamSpec);
        SessionConfig.Builder builderCreatePipeline = createPipeline(cameraId, imageAnalysisConfig, attachedStreamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        updateSessionConfig(ImageAnalysis$$ExternalSyntheticBackport1.m(new Object[]{builderCreatePipeline.build()}));
        notifyReset();
    }

    @Override // androidx.camera.core.UseCase
    protected UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        final Size defaultTargetResolution;
        synchronized (this.mAnalysisLock) {
            Analyzer analyzer = this.mSubscribedAnalyzer;
            defaultTargetResolution = analyzer != null ? analyzer.getDefaultTargetResolution() : null;
        }
        if (defaultTargetResolution == null) {
            return builder.getUseCaseConfig();
        }
        if (cameraInfoInternal.getSensorRotationDegrees(((Integer) builder.getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, 0)).intValue()) % 180 == 90) {
            defaultTargetResolution = new Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        if (!builder.getUseCaseConfig().containsOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION)) {
            builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, defaultTargetResolution);
        }
        if (builder.getUseCaseConfig().containsOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR)) {
            ResolutionSelector resolutionSelector = (ResolutionSelector) getAppConfig().retrieveOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, null);
            ResolutionSelector.Builder builder2 = resolutionSelector == null ? new ResolutionSelector.Builder() : ResolutionSelector.Builder.fromResolutionSelector(resolutionSelector);
            if (resolutionSelector == null || resolutionSelector.getResolutionStrategy() == null) {
                builder2.setResolutionStrategy(new ResolutionStrategy(defaultTargetResolution, 1));
            }
            if (resolutionSelector == null) {
                builder2.setResolutionFilter(new ResolutionFilter() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda5
                    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
                    public final List filter(List list, int i2) {
                        return ImageAnalysis.lambda$onMergeConfig$0(defaultTargetResolution, list, i2);
                    }
                });
            }
            builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, builder2.build());
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    protected void onProviderRotationChanged(int i2) {
        setTargetRotation(i2);
    }

    @Override // androidx.camera.core.UseCase
    protected StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        updateSessionConfig(ImageAnalysis$$ExternalSyntheticBackport1.m(new Object[]{this.mSessionConfigBuilder.build()}));
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    protected StreamSpec onSuggestedStreamSpecUpdated(StreamSpec streamSpec, StreamSpec streamSpec2) {
        Logger.d(TAG, "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + streamSpec + ", secondaryStreamSpec " + streamSpec2);
        SessionConfig.Builder builderCreatePipeline = createPipeline(getCameraId(), (ImageAnalysisConfig) getCurrentConfig(), streamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        updateSessionConfig(ImageAnalysis$$ExternalSyntheticBackport1.m(new Object[]{builderCreatePipeline.build()}));
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        clearPipeline();
        synchronized (this.mAnalysisLock) {
            this.mImageAnalysisAbstractAnalyzer.detach();
            this.mImageAnalysisAbstractAnalyzer = null;
        }
    }

    public void setAnalyzer(Executor executor, final Analyzer analyzer) {
        synchronized (this.mAnalysisLock) {
            ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
            if (imageAnalysisAbstractAnalyzer != null) {
                imageAnalysisAbstractAnalyzer.setAnalyzer(executor, new Analyzer() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda4
                    @Override // androidx.camera.core.ImageAnalysis.Analyzer
                    public final void analyze(ImageProxy imageProxy) {
                        analyzer.analyze(imageProxy);
                    }

                    @Override // androidx.camera.core.ImageAnalysis.Analyzer
                    public /* synthetic */ Size getDefaultTargetResolution() {
                        return null;
                    }

                    @Override // androidx.camera.core.ImageAnalysis.Analyzer
                    public /* synthetic */ int getTargetCoordinateSystem() {
                        return 0;
                    }

                    @Override // androidx.camera.core.ImageAnalysis.Analyzer
                    public /* synthetic */ void updateTransform(Matrix matrix) {
                    }
                });
            }
            if (this.mSubscribedAnalyzer == null) {
                notifyActive();
            }
            this.mSubscribedAnalyzerExecutor = executor;
            this.mSubscribedAnalyzer = analyzer;
        }
    }

    @Override // androidx.camera.core.UseCase
    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        super.setSensorToBufferTransformMatrix(matrix);
        synchronized (this.mAnalysisLock) {
            ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
            if (imageAnalysisAbstractAnalyzer != null) {
                imageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
            }
            this.mSensorToBufferTransformMatrix = matrix;
        }
    }

    public void setTargetRotation(int i2) {
        if (setTargetRotationInternal(i2)) {
            tryUpdateRelativeRotation();
        }
    }

    @Override // androidx.camera.core.UseCase
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        synchronized (this.mAnalysisLock) {
            ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
            if (imageAnalysisAbstractAnalyzer != null) {
                imageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
            }
            this.mViewPortCropRect = rect;
        }
    }

    public String toString() {
        return "ImageAnalysis:".concat(String.valueOf(getName()));
    }

    /* compiled from: WazeSource */
    public final class Defaults implements ConfigProvider<ImageAnalysisConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final ImageAnalysisConfig DEFAULT_CONFIG;
        private static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 1;
        private static final Size DEFAULT_TARGET_RESOLUTION;

        static {
            Size size = new Size(640, 480);
            DEFAULT_TARGET_RESOLUTION = size;
            DynamicRange dynamicRange = DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            ResolutionSelector.Builder builder = new ResolutionSelector.Builder();
            builder.setAspectRatioStrategy(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY);
            builder.setResolutionStrategy(new ResolutionStrategy(SizeUtil.RESOLUTION_VGA, 1));
            ResolutionSelector resolutionSelectorBuild = builder.build();
            DEFAULT_RESOLUTION_SELECTOR = resolutionSelectorBuild;
            Builder builder2 = new Builder();
            builder2.setDefaultResolution(size);
            builder2.setSurfaceOccupancyPriority(1);
            builder2.setTargetAspectRatio(0);
            builder2.setResolutionSelector(resolutionSelectorBuild);
            builder2.setDynamicRange(dynamicRange);
            DEFAULT_CONFIG = builder2.getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public ImageAnalysisConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    /* compiled from: WazeSource */
    public final class Builder implements ImageOutputConfig.Builder<Builder>, ThreadConfig.Builder<Builder>, UseCaseConfig.Builder<ImageAnalysis, ImageAnalysisConfig, Builder>, ImageInputConfig.Builder<Builder> {
        private final MutableOptionsBundle mMutableConfig;

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(ImageAnalysis.class)) {
                setCaptureType(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
                setTargetClass(ImageAnalysis.class);
            } else {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
        }

        static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public ImageAnalysis build() {
            ImageAnalysisConfig useCaseConfig = getUseCaseConfig();
            ImageOutputConfig.CC.validateConfig(useCaseConfig);
            if (useCaseConfig.getOutputImageFormat(1) == 4 && useCaseConfig.isOutputImageRotationEnabled(false).booleanValue()) {
                throw new IllegalArgumentException("setOutputImageRotationEnabled(true) is not supported when PRIVATE format is used.");
            }
            return new ImageAnalysis(useCaseConfig);
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public ImageAnalysisConfig getUseCaseConfig() {
            return new ImageAnalysisConfig(OptionsBundle.from(this.mMutableConfig));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public Builder setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        public Builder setBackpressureStrategy(int i2) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i2));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setCustomOrderedResolutions(List<Size> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public Builder setDynamicRange(DynamicRange dynamicRange) {
            if (!Objects.equals(DynamicRange.SDR, dynamicRange)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setHighResolutionDisabled(boolean z) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z));
            return this;
        }

        public Builder setImageQueueDepth(int i2) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i2));
            return this;
        }

        public Builder setImageReaderProxyProvider(ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setMirrorMode(int i2) {
            throw new UnsupportedOperationException("setMirrorMode is not supported.");
        }

        public Builder setOnePixelShiftEnabled(boolean z) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_ONE_PIXEL_SHIFT_ENABLED, Boolean.valueOf(z));
            return this;
        }

        public Builder setOutputImageFormat(int i2) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_FORMAT, Integer.valueOf(i2));
            return this;
        }

        public Builder setOutputImageRotationEnabled(boolean z) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, Boolean.valueOf(z));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setResolutionSelector(ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setStreamUseCase(StreamUseCase streamUseCase) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSurfaceOccupancyPriority(int i2) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i2));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public Builder setTargetAspectRatio(int i2) {
            if (i2 == -1) {
                i2 = 0;
            }
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i2));
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetClass(Class<ImageAnalysis> cls) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(UseCaseConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetRotation(int i2) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i2));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setZslDisabled(boolean z) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z));
            return this;
        }

        public static Builder fromConfig(ImageAnalysisConfig imageAnalysisConfig) {
            return new Builder(MutableOptionsBundle.from((Config) imageAnalysisConfig));
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public /* bridge */ /* synthetic */ Builder setBackgroundExecutor(Executor executor) {
            setBackgroundExecutor(executor);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            setCaptureOptionUnpacker(optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Builder setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            setCaptureType(captureType);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setCustomOrderedResolutions(List list) {
            setCustomOrderedResolutions((List<Size>) list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            setDefaultCaptureConfig(captureConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setDefaultResolution(Size size) {
            setDefaultResolution(size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Builder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
            setDefaultSessionConfig(sessionConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setMaxResolution(Size size) {
            setMaxResolution(size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setResolutionSelector(ResolutionSelector resolutionSelector) {
            setResolutionSelector(resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            setSessionOptionUnpacker(optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Builder setStreamUseCase(StreamUseCase streamUseCase) {
            setStreamUseCase(streamUseCase);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setSupportedResolutions(List list) {
            setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ Object setTargetName(String str) {
            setTargetName(str);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public /* bridge */ /* synthetic */ Builder setTargetResolution(Size size) {
            setTargetResolution(size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Builder setHighResolutionDisabled(boolean z) {
            setHighResolutionDisabled(z);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Builder setSurfaceOccupancyPriority(int i2) {
            setSurfaceOccupancyPriority(i2);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setTargetRotation(int i2) {
            setTargetRotation(i2);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Builder setZslDisabled(boolean z) {
            setZslDisabled(z);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public /* bridge */ /* synthetic */ Builder setTargetAspectRatio(int i2) {
            setTargetAspectRatio(i2);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setDynamicRange(DynamicRange dynamicRange) {
            setDynamicRange(dynamicRange);
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            setTargetClass((Class<ImageAnalysis>) cls);
            return this;
        }

        public Builder() {
            this(MutableOptionsBundle.create());
        }
    }

    /* compiled from: WazeSource */
    public interface Analyzer {
        void analyze(ImageProxy imageProxy);

        Size getDefaultTargetResolution();

        int getTargetCoordinateSystem();

        void updateTransform(Matrix matrix);

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.core.ImageAnalysis$Analyzer$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static Size $default$getDefaultTargetResolution(Analyzer analyzer) {
                return null;
            }

            public static int $default$getTargetCoordinateSystem(Analyzer analyzer) {
                return 0;
            }

            public static void $default$updateTransform(Analyzer analyzer, Matrix matrix) {
            }
        }
    }
}
