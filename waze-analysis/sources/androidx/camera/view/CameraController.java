package androidx.camera.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.LiveDataUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FileDescriptorOutputOptions;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.HighSpeedVideoSessionConfig;
import androidx.camera.video.MediaStoreOutputOptions;
import androidx.camera.video.OutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.internal.muxer.MuxerFactory;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import androidx.camera.view.video.AudioConfig;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.d.m.a.bm;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class CameraController {
    private static final float AE_SIZE = 0.25f;
    private static final float AF_SIZE = 0.16666667f;
    private static final String CAMERA_NOT_ATTACHED = "Use cases not attached to camera.";
    private static final String CAMERA_NOT_INITIALIZED = "Camera not initialized.";

    @Deprecated
    public static final int COORDINATE_SYSTEM_VIEW_REFERENCED = 1;
    public static final int IMAGE_ANALYSIS = 2;
    public static final int IMAGE_CAPTURE = 1;
    private static final String IMAGE_CAPTURE_DISABLED = "ImageCapture disabled.";
    private static final ImageCapture.ScreenFlash NO_OP_SCREEN_FLASH = new ImageCapture.ScreenFlash() { // from class: androidx.camera.view.CameraController.1
        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public void apply(long j2, ImageCapture.ScreenFlashListener screenFlashListener) {
            screenFlashListener.onCompleted();
        }

        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public void clear() {
        }
    };
    private static final String PREVIEW_VIEW_NOT_ATTACHED = "PreviewView not attached to CameraController.";
    private static final String TAG = "CameraController";
    public static final int TAP_TO_FOCUS_FAILED = 4;
    public static final int TAP_TO_FOCUS_FOCUSED = 2;
    public static final int TAP_TO_FOCUS_NOT_FOCUSED = 3;
    public static final int TAP_TO_FOCUS_NOT_STARTED = 0;
    public static final int TAP_TO_FOCUS_STARTED = 1;
    public static final int VIDEO_CAPTURE = 4;
    private static final String VIDEO_CAPTURE_DISABLED = "VideoCapture disabled.";
    private static final String VIDEO_RECORDING_UNFINISHED = "Recording video. Only one recording can be active at a time.";
    Recording mActiveRecording;
    private ImageAnalysis.Analyzer mAnalysisAnalyzer;
    private Executor mAnalysisBackgroundExecutor;
    private Executor mAnalysisExecutor;
    private final Context mAppContext;
    private boolean mAutoRotationEnabled;
    private SessionConfig mBoundSessionConfig;
    Camera mCamera;
    ProcessCameraProviderWrapper mCameraProvider;
    CameraSelector mCameraSelector;
    private final Set<CameraEffect> mEffects;
    private int mEnabledUseCases;
    private FocusMeteringResultCallback mFocusMeteringResultCallback;
    ImageAnalysis mImageAnalysis;
    ResolutionSelector mImageAnalysisResolutionSelector;
    OutputSize mImageAnalysisTargetSize;
    ImageCapture mImageCapture;
    Executor mImageCaptureIoExecutor;
    ResolutionSelector mImageCaptureResolutionSelector;
    OutputSize mImageCaptureTargetSize;
    private final bm<Void> mInitializationFuture;
    private final PendingValue<Boolean> mPendingEnableTorch;
    private final PendingValue<Float> mPendingLinearZoom;
    private final PendingValue<Float> mPendingZoomRatio;
    private boolean mPinchToZoomEnabled;
    Preview mPreview;
    private DynamicRange mPreviewDynamicRange;
    ResolutionSelector mPreviewResolutionSelector;
    OutputSize mPreviewTargetSize;
    Map<Consumer<VideoRecordEvent>, Recording> mRecordingMap;
    private final Map<ScreenFlashUiInfo.ProviderType, ScreenFlashUiInfo> mScreenFlashUiInfoMap;
    private SessionConfig mSessionConfig;
    Preview.SurfaceProvider mSurfaceProvider;
    private long mTapToFocusAutoCancelDurationNanos;
    private boolean mTapToFocusEnabled;
    final MutableLiveData<TapToFocusInfo> mTapToFocusInfoState;
    final LiveData<Integer> mTapToFocusState;
    private final ForwardingLiveData<Integer> mTorchState;
    VideoCapture<Recorder> mVideoCapture;
    private DynamicRange mVideoCaptureDynamicRange;
    private int mVideoCaptureMirrorMode;
    MuxerFactory mVideoCaptureMuxerFactory;
    QualitySelector mVideoCaptureQualitySelector;
    private Range<Integer> mVideoCaptureTargetFrameRate;
    ViewPort mViewPort;
    private final ForwardingLiveData<ZoomState> mZoomState;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.view.CameraController$2, reason: invalid class name */
    class AnonymousClass2 implements Consumer<VideoRecordEvent> {
        final /* synthetic */ Consumer val$listener;
        final /* synthetic */ Executor val$mainExecutor;

        AnonymousClass2(Executor executor, Consumer consumer) {
            this.val$mainExecutor = executor;
            this.val$listener = consumer;
        }

        @Override // androidx.core.util.Consumer
        public void accept(VideoRecordEvent videoRecordEvent) {
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                if (Threads.isMainThread()) {
                    CameraController.this.deactivateRecordingByListener(this);
                } else {
                    this.val$mainExecutor.execute(new Runnable() { // from class: androidx.camera.view.CameraController$2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m1527lambda$accept$0$androidxcameraviewCameraController$2();
                        }
                    });
                }
            }
            this.val$listener.accept(videoRecordEvent);
        }

        /* renamed from: lambda$accept$0$androidx-camera-view-CameraController$2, reason: not valid java name */
        /* synthetic */ void m1527lambda$accept$0$androidxcameraviewCameraController$2() {
            CameraController.this.deactivateRecordingByListener(this);
        }
    }

    /* compiled from: WazeSource */
    class FocusMeteringResultCallback implements FutureCallback<FocusMeteringResult> {
        private boolean mIsCanceled = false;
        private final Object mLock = new Object();
        private final PointF mTapPoint;
        private final MutableLiveData<TapToFocusInfo> mTapToFocusInfoState;

        FocusMeteringResultCallback(PointF pointF, MutableLiveData<TapToFocusInfo> mutableLiveData) {
            this.mTapPoint = pointF;
            this.mTapToFocusInfoState = mutableLiveData;
        }

        void close() {
            synchronized (this.mLock) {
                this.mIsCanceled = true;
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            synchronized (this.mLock) {
                if (this.mIsCanceled) {
                    return;
                }
                if (!(th instanceof CameraControl.OperationCanceledException)) {
                    Logger.d(CameraController.TAG, "Tap-to-focus failed.", th);
                    this.mTapToFocusInfoState.postValue(new TapToFocusInfo(4, this.mTapPoint));
                } else {
                    Logger.d(CameraController.TAG, "Tap-to-focus canceled", th);
                    this.mTapToFocusInfoState.postValue(new TapToFocusInfo(0, null));
                    close();
                }
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(FocusMeteringResult focusMeteringResult) {
            synchronized (this.mLock) {
                if (this.mIsCanceled) {
                    return;
                }
                if (focusMeteringResult == null) {
                    return;
                }
                Logger.d(CameraController.TAG, "Tap-to-focus onSuccess: " + focusMeteringResult.isFocusSuccessful());
                this.mTapToFocusInfoState.postValue(new TapToFocusInfo(true != focusMeteringResult.isFocusSuccessful() ? 3 : 2, this.mTapPoint));
            }
        }

        void resetStateAndClose() {
            synchronized (this.mLock) {
                if (this.mIsCanceled) {
                    return;
                }
                Logger.d(CameraController.TAG, "Tap-to-focus reset.");
                this.mTapToFocusInfoState.postValue(new TapToFocusInfo(0, null));
                this.mIsCanceled = true;
            }
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface UseCases {
    }

    CameraController(Context context, bm<ProcessCameraProviderWrapper> bmVar) {
        this.mCameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        this.mEnabledUseCases = 3;
        this.mActiveRecording = null;
        this.mRecordingMap = new HashMap();
        this.mVideoCaptureQualitySelector = Recorder.DEFAULT_QUALITY_SELECTOR;
        this.mVideoCaptureMuxerFactory = null;
        this.mVideoCaptureMirrorMode = 0;
        DynamicRange dynamicRange = DynamicRange.UNSPECIFIED;
        this.mVideoCaptureDynamicRange = dynamicRange;
        this.mPreviewDynamicRange = dynamicRange;
        this.mVideoCaptureTargetFrameRate = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        this.mPinchToZoomEnabled = true;
        this.mTapToFocusEnabled = true;
        this.mZoomState = new ForwardingLiveData<>();
        this.mTorchState = new ForwardingLiveData<>();
        MutableLiveData<TapToFocusInfo> mutableLiveData = new MutableLiveData<>(new TapToFocusInfo(0, null));
        this.mTapToFocusInfoState = mutableLiveData;
        this.mTapToFocusState = LiveDataUtil.map(mutableLiveData, new Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((TapToFocusInfo) obj).getFocusState());
            }
        });
        this.mPendingEnableTorch = new PendingValue<>();
        this.mPendingLinearZoom = new PendingValue<>();
        this.mPendingZoomRatio = new PendingValue<>();
        this.mEffects = new HashSet();
        this.mScreenFlashUiInfoMap = new HashMap();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.mTapToFocusAutoCancelDurationNanos = 5000000000L;
        this.mAutoRotationEnabled = true;
        this.mSessionConfig = null;
        this.mBoundSessionConfig = null;
        this.mAppContext = ContextUtil.getPersistentApplicationContext(context);
        this.mPreview = createPreview();
        this.mImageCapture = createImageCapture(null);
        this.mImageAnalysis = createImageAnalysis(null, null, null);
        this.mVideoCapture = createVideoCapture();
        this.mInitializationFuture = Futures.transform(bmVar, new Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda6
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f$0.m1523lambda$new$0$androidxcameraviewCameraController((ProcessCameraProviderWrapper) obj);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    private void checkAudioPermissionGranted() {
        if (PermissionChecker.checkSelfPermission(this.mAppContext, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
        }
    }

    private void configureResolution(ImageOutputConfig.Builder<?> builder, ResolutionSelector resolutionSelector, OutputSize outputSize) {
        AspectRatioStrategy viewportAspectRatioStrategy;
        if (resolutionSelector != null) {
            builder.setResolutionSelector(resolutionSelector);
            return;
        }
        if (outputSize != null) {
            setTargetOutputSize(builder, outputSize);
            return;
        }
        ViewPort viewPort = this.mViewPort;
        if (viewPort == null || (viewportAspectRatioStrategy = getViewportAspectRatioStrategy(viewPort)) == null) {
            return;
        }
        ResolutionSelector.Builder builder2 = new ResolutionSelector.Builder();
        builder2.setAspectRatioStrategy(viewportAspectRatioStrategy);
        builder.setResolutionSelector(builder2.build());
    }

    private FocusMeteringAction createFocusMeteringAction(MeteringPointFactory meteringPointFactory, PointF pointF) {
        MeteringPoint meteringPointCreatePoint = meteringPointFactory.createPoint(pointF.x, pointF.y, AF_SIZE);
        MeteringPoint meteringPointCreatePoint2 = meteringPointFactory.createPoint(pointF.x, pointF.y, AE_SIZE);
        FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(meteringPointCreatePoint, 1);
        builder.addPoint(meteringPointCreatePoint2, 2);
        long j2 = this.mTapToFocusAutoCancelDurationNanos;
        if (j2 > 0) {
            builder.setAutoCancelDuration(j2, TimeUnit.NANOSECONDS);
        } else {
            builder.disableAutoCancel();
        }
        return builder.build();
    }

    private ImageAnalysis createImageAnalysis(Integer num, Integer num2, Integer num3) {
        ImageAnalysis.Builder builder = new ImageAnalysis.Builder();
        if (num != null) {
            builder.setBackpressureStrategy(num.intValue());
        }
        if (num2 != null) {
            builder.setImageQueueDepth(num2.intValue());
        }
        if (num3 != null) {
            builder.setOutputImageFormat(num3.intValue());
        }
        configureResolution(builder, this.mImageAnalysisResolutionSelector, this.mImageAnalysisTargetSize);
        Executor executor = this.mAnalysisBackgroundExecutor;
        if (executor != null) {
            builder.setBackgroundExecutor(executor);
        }
        return builder.build();
    }

    private ImageCapture createImageCapture(Integer num) {
        ImageCapture.Builder builder = new ImageCapture.Builder();
        if (num != null) {
            builder.setCaptureMode(num.intValue());
        }
        configureResolution(builder, this.mImageCaptureResolutionSelector, this.mImageCaptureTargetSize);
        Executor executor = this.mImageCaptureIoExecutor;
        if (executor != null) {
            builder.setIoExecutor(executor);
        }
        return builder.build();
    }

    private Preview createPreview() {
        Preview.Builder builder = new Preview.Builder();
        configureResolution(builder, this.mPreviewResolutionSelector, this.mPreviewTargetSize);
        builder.setDynamicRange(this.mPreviewDynamicRange);
        return builder.build();
    }

    private VideoCapture<Recorder> createVideoCapture() {
        int viewportAspectRatioInt;
        Recorder.Builder builder = new Recorder.Builder();
        builder.setQualitySelector(this.mVideoCaptureQualitySelector);
        if (this.mViewPort != null && this.mVideoCaptureQualitySelector == Recorder.DEFAULT_QUALITY_SELECTOR && (viewportAspectRatioInt = getViewportAspectRatioInt(this.mViewPort)) != -1) {
            builder.setAspectRatio(viewportAspectRatioInt);
        }
        MuxerFactory muxerFactory = this.mVideoCaptureMuxerFactory;
        if (muxerFactory != null) {
            builder.setMuxerFactory(muxerFactory);
        }
        VideoCapture.Builder builder2 = new VideoCapture.Builder(builder.build());
        builder2.setTargetFrameRate(this.mVideoCaptureTargetFrameRate);
        builder2.setMirrorMode(this.mVideoCaptureMirrorMode);
        builder2.setDynamicRange(this.mVideoCaptureDynamicRange);
        return builder2.build();
    }

    private void deactivateRecording(Recording recording) {
        if (this.mActiveRecording == recording) {
            this.mActiveRecording = null;
        }
    }

    private String getReadableSelectorString(CameraSelector cameraSelector) {
        if (cameraSelector == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("CameraSelector{");
        Integer lensFacing = cameraSelector.getLensFacing();
        if (lensFacing != null) {
            int iIntValue = lensFacing.intValue();
            if (iIntValue == 0) {
                sb.append("lensFacing=FRONT");
            } else if (iIntValue == 1) {
                sb.append("lensFacing=BACK");
            } else if (iIntValue != 2) {
                sb.append("lensFacing=UNKNOWN(");
                sb.append(lensFacing);
                sb.append(")");
            } else {
                sb.append("lensFacing=EXTERNAL");
            }
        } else {
            sb.append("lensFacing=NOT_SPECIFIED");
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getViewportAspectRatioInt(androidx.camera.core.ViewPort r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L5
            r1 = r0
            goto Ld
        L5:
            int r1 = r7.getRotation()
            int r1 = androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(r1)
        Ld:
            r2 = 1
            androidx.camera.view.ProcessCameraProviderWrapper r3 = r6.mCameraProvider     // Catch: java.lang.IllegalArgumentException -> L2a
            if (r3 == 0) goto L27
            androidx.camera.core.CameraSelector r4 = r6.mCameraSelector     // Catch: java.lang.IllegalArgumentException -> L2a
            androidx.camera.core.CameraInfo r3 = r3.getCameraInfo(r4)     // Catch: java.lang.IllegalArgumentException -> L2a
            int r4 = r3.getSensorRotationDegrees()     // Catch: java.lang.IllegalArgumentException -> L2a
            int r6 = r3.getLensFacing()     // Catch: java.lang.IllegalArgumentException -> L25
            if (r6 != r2) goto L23
            goto L28
        L23:
            r6 = r0
            goto L3e
        L25:
            r3 = move-exception
            goto L2c
        L27:
            r4 = r0
        L28:
            r6 = r2
            goto L3e
        L2a:
            r3 = move-exception
            r4 = r0
        L2c:
            androidx.camera.core.CameraSelector r5 = r6.mCameraSelector
            java.lang.String r6 = r6.getReadableSelectorString(r5)
            java.lang.String r5 = "Failed to retrieve CameraInfo for selector: "
            java.lang.String r6 = r5.concat(r6)
            java.lang.String r5 = "CameraController"
            androidx.camera.core.Logger.w(r5, r6, r3)
            goto L28
        L3e:
            int r6 = androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(r1, r4, r6)
            android.util.Rational r7 = r7.getAspectRatio()
            r1 = 90
            if (r6 == r1) goto L4e
            r1 = 270(0x10e, float:3.78E-43)
            if (r6 != r1) goto L5c
        L4e:
            android.util.Rational r6 = new android.util.Rational
            int r1 = r7.getDenominator()
            int r7 = r7.getNumerator()
            r6.<init>(r1, r7)
            r7 = r6
        L5c:
            android.util.Rational r6 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L65
            return r0
        L65:
            android.util.Rational r6 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L6e
            return r2
        L6e:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.CameraController.getViewportAspectRatioInt(androidx.camera.core.ViewPort):int");
    }

    private AspectRatioStrategy getViewportAspectRatioStrategy(ViewPort viewPort) {
        int viewportAspectRatioInt = getViewportAspectRatioInt(viewPort);
        if (viewportAspectRatioInt != -1) {
            return new AspectRatioStrategy(viewportAspectRatioInt, 1);
        }
        return null;
    }

    private int initializeStateFromSessionConfig(SessionConfig sessionConfig) {
        List<UseCase> useCases = sessionConfig.getUseCases();
        Preview previewFindPreview = UseCaseUtil.findPreview(useCases);
        int i2 = 0;
        Preconditions.checkArgument(previewFindPreview != null, "A Preview is required for using CameraController!");
        UseCase useCaseFindVideoCapture = UseCaseUtil.findVideoCapture(useCases);
        if (useCaseFindVideoCapture instanceof VideoCapture) {
            VideoCapture<Recorder> videoCapture = (VideoCapture) useCaseFindVideoCapture;
            Preconditions.checkArgument(videoCapture.getOutput() instanceof Recorder, "To set a SessionConfig to the CameraController, the VideoCapture inside must use a Recorder as its Output!");
            this.mVideoCapture = videoCapture;
            i2 = 4;
        } else {
            this.mVideoCapture = createVideoCapture();
        }
        this.mPreview = previewFindPreview;
        previewFindPreview.setSurfaceProvider(this.mSurfaceProvider);
        ImageCapture imageCaptureFindImageCapture = UseCaseUtil.findImageCapture(useCases);
        if (imageCaptureFindImageCapture != null) {
            i2 |= 1;
            this.mImageCapture = imageCaptureFindImageCapture;
        } else {
            this.mImageCapture = createImageCapture(null);
        }
        ImageAnalysis imageAnalysisFindImageAnalysis = UseCaseUtil.findImageAnalysis(useCases);
        if (imageAnalysisFindImageAnalysis == null) {
            this.mImageAnalysis = createImageAnalysis(null, null, null);
            return i2;
        }
        int i3 = i2 | 2;
        this.mImageAnalysis = imageAnalysisFindImageAnalysis;
        return i3;
    }

    private boolean isCameraAttached() {
        return this.mCamera != null;
    }

    private boolean isCameraInitialized() {
        return this.mCameraProvider != null;
    }

    private boolean isConfigurationSupported(CameraSelector cameraSelector, SessionConfig sessionConfig) {
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        return this.mCameraProvider.getCameraInfo(cameraSelector).isSessionConfigSupported(sessionConfig);
    }

    private boolean isOutputSizeEqual(OutputSize outputSize, OutputSize outputSize2) {
        if (outputSize == outputSize2) {
            return true;
        }
        return outputSize != null && outputSize.equals(outputSize2);
    }

    private boolean isPreviewViewAttached() {
        return (this.mSurfaceProvider == null || this.mViewPort == null) ? false : true;
    }

    private boolean isUseCaseEnabled(int i2) {
        return (this.mEnabledUseCases & i2) != 0;
    }

    private PendingRecording prepareRecording(OutputOptions outputOptions) {
        Recorder recorder = (Recorder) this.mVideoCapture.getOutput();
        if (outputOptions instanceof FileOutputOptions) {
            return recorder.prepareRecording(this.mAppContext, (FileOutputOptions) outputOptions);
        }
        if (outputOptions instanceof FileDescriptorOutputOptions) {
            return recorder.prepareRecording(this.mAppContext, (FileDescriptorOutputOptions) outputOptions);
        }
        if (outputOptions instanceof MediaStoreOutputOptions) {
            return recorder.prepareRecording(this.mAppContext, (MediaStoreOutputOptions) outputOptions);
        }
        throw new IllegalArgumentException("Unsupported OutputOptions type.");
    }

    private void recreateImageAnalysis(Integer num, Integer num2, Integer num3, boolean z) {
        ImageAnalysis.Analyzer analyzer;
        Threads.checkMainThread();
        if (z) {
            unbindSessionConfig();
        }
        ImageAnalysis imageAnalysisCreateImageAnalysis = createImageAnalysis(num, num2, num3);
        this.mImageAnalysis = imageAnalysisCreateImageAnalysis;
        Executor executor = this.mAnalysisExecutor;
        if (executor == null || (analyzer = this.mAnalysisAnalyzer) == null) {
            return;
        }
        imageAnalysisCreateImageAnalysis.setAnalyzer(executor, analyzer);
    }

    private void recreateImageCapture(Integer num, boolean z) {
        if (z) {
            unbindSessionConfig();
        }
        int flashMode = this.mImageCapture.getFlashMode();
        this.mImageCapture = createImageCapture(num);
        setImageCaptureFlashMode(flashMode);
    }

    private void recreatePreview(boolean z) {
        if (z) {
            unbindSessionConfig();
        }
        Preview previewCreatePreview = createPreview();
        this.mPreview = previewCreatePreview;
        Preview.SurfaceProvider surfaceProvider = this.mSurfaceProvider;
        if (surfaceProvider != null) {
            previewCreatePreview.setSurfaceProvider(surfaceProvider);
        }
    }

    private void recreateVideoCapture(boolean z) {
        if (z) {
            unbindSessionConfig();
        }
        this.mVideoCapture = createVideoCapture();
    }

    private void restartCameraIfAnalyzerResolutionChanged(ImageAnalysis.Analyzer analyzer, ImageAnalysis.Analyzer analyzer2) {
        if (Objects.equals(analyzer == null ? null : analyzer.getDefaultTargetResolution(), analyzer2 != null ? analyzer2.getDefaultTargetResolution() : null)) {
            return;
        }
        recreateImageAnalysis(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()), true);
        startCameraAndTrackStates();
    }

    private void setActiveRecording(Recording recording, Consumer<VideoRecordEvent> consumer) {
        this.mRecordingMap.put(consumer, recording);
        this.mActiveRecording = recording;
    }

    private void setTargetOutputSize(ImageOutputConfig.Builder<?> builder, OutputSize outputSize) {
        if (outputSize == null) {
            return;
        }
        if (outputSize.getResolution() != null) {
            builder.setTargetResolution(outputSize.getResolution());
        } else if (outputSize.getAspectRatio() != -1) {
            builder.setTargetAspectRatio(outputSize.getAspectRatio());
        } else {
            java.util.Objects.toString(outputSize);
            Logger.e(TAG, "Invalid target surface size. ".concat(outputSize.toString()));
        }
    }

    private float speedUpZoomBy2X(float f2) {
        if (f2 > 1.0f) {
            float f3 = f2 - 1.0f;
            return f3 + f3 + 1.0f;
        }
        float f4 = 1.0f - f2;
        return 1.0f - (f4 + f4);
    }

    private Recording startRecordingInternal(OutputOptions outputOptions, AudioConfig audioConfig, Executor executor, Consumer<VideoRecordEvent> consumer) {
        Threads.checkMainThread();
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        Preconditions.checkState(isVideoCaptureEnabled(), VIDEO_CAPTURE_DISABLED);
        Preconditions.checkState(!isRecording(), VIDEO_RECORDING_UNFINISHED);
        Consumer<VideoRecordEvent> consumerWrapListenerToDeactivateRecordingOnFinalized = wrapListenerToDeactivateRecordingOnFinalized(consumer);
        PendingRecording pendingRecordingPrepareRecording = prepareRecording(outputOptions);
        if (audioConfig.getAudioEnabled()) {
            checkAudioPermissionGranted();
            pendingRecordingPrepareRecording.withAudioEnabled();
        }
        Recording recordingStart = pendingRecordingPrepareRecording.start(executor, consumerWrapListenerToDeactivateRecordingOnFinalized);
        setActiveRecording(recordingStart, consumerWrapListenerToDeactivateRecordingOnFinalized);
        return recordingStart;
    }

    private void stopRecording() {
        Threads.checkMainThread();
        Recording recording = this.mActiveRecording;
        if (recording != null) {
            recording.stop();
            deactivateRecording(this.mActiveRecording);
        }
    }

    private void throwExceptionForInvalidScreenFlashCapture() {
        if (getImageCaptureFlashMode() == 3) {
            if (getScreenFlashUiInfoByPriority() == null || getScreenFlashUiInfoByPriority().getScreenFlash() == null) {
                throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
            }
        }
    }

    private void throwExceptionIfSessionConfigExists(String str) {
        if (this.mSessionConfig != null) {
            throw new IllegalStateException(String.valueOf(str).concat(" function call is not allowed when a SessionConfig has been set because this might cause UseCases to be recreated and conflict with the UseCases set by the SessionConfig. Please clear the session config if you want CameraController to help you create and manage the UseCases."));
        }
    }

    private void unbindAllAndRecreate() {
        unbindSessionConfig();
        recreatePreview(false);
        recreateImageCapture(Integer.valueOf(getImageCaptureMode()), false);
        recreateImageAnalysis(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()), false);
        recreateVideoCapture(false);
    }

    private void unbindSessionConfig() {
        SessionConfig sessionConfig;
        if (!isCameraInitialized() || (sessionConfig = this.mBoundSessionConfig) == null) {
            return;
        }
        this.mCameraProvider.unbind(sessionConfig);
        this.mBoundSessionConfig = null;
    }

    private void validateEffects(Set<CameraEffect> set) {
        UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
        builder.addUseCase(this.mPreview);
        Iterator<CameraEffect> it = set.iterator();
        while (it.hasNext()) {
            builder.addEffect(it.next());
        }
        builder.build();
    }

    private void validateFlashModeScreenConditions(ImageCapture imageCapture, CameraSelector cameraSelector) {
        Integer lensFacing = cameraSelector.getLensFacing();
        if (imageCapture.getFlashMode() == 3 && lensFacing != null && lensFacing.intValue() != 0) {
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
    }

    private Consumer<VideoRecordEvent> wrapListenerToDeactivateRecordingOnFinalized(Consumer<VideoRecordEvent> consumer) {
        return new AnonymousClass2(ContextCompat.getMainExecutor(this.mAppContext), consumer);
    }

    void attachPreviewSurface(Preview.SurfaceProvider surfaceProvider, ViewPort viewPort) {
        Threads.checkMainThread();
        if (this.mSurfaceProvider != surfaceProvider) {
            this.mSurfaceProvider = surfaceProvider;
            this.mPreview.setSurfaceProvider(surfaceProvider);
        }
        boolean z = false;
        if (this.mSessionConfig == null && (this.mViewPort == null || getViewportAspectRatioStrategy(viewPort) != getViewportAspectRatioStrategy(this.mViewPort))) {
            z = true;
        }
        this.mViewPort = viewPort;
        if (z) {
            unbindAllAndRecreate();
        }
        startCameraAndTrackStates();
    }

    public void clearEffects() {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("clearEffects");
        if (this.mCameraProvider != null) {
            unbindSessionConfig();
        }
        this.mEffects.clear();
        startCameraAndTrackStates();
    }

    public void clearImageAnalysisAnalyzer() {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("clearImageAnalysisAnalyzer");
        ImageAnalysis.Analyzer analyzer = this.mAnalysisAnalyzer;
        this.mAnalysisExecutor = null;
        this.mAnalysisAnalyzer = null;
        this.mImageAnalysis.clearAnalyzer();
        restartCameraIfAnalyzerResolutionChanged(analyzer, null);
    }

    void clearPreviewSurface() {
        Threads.checkMainThread();
        unbindSessionConfig();
        this.mPreview.setSurfaceProvider(null);
        this.mCamera = null;
        this.mSurfaceProvider = null;
        this.mViewPort = null;
    }

    void deactivateRecordingByListener(Consumer<VideoRecordEvent> consumer) {
        Recording recordingRemove = this.mRecordingMap.remove(consumer);
        if (recordingRemove != null) {
            deactivateRecording(recordingRemove);
        }
    }

    public bm<Void> enableTorch(boolean z) {
        Threads.checkMainThread();
        return !isCameraAttached() ? this.mPendingEnableTorch.setValue(Boolean.valueOf(z)) : this.mCamera.getCameraControl().enableTorch(z);
    }

    protected SessionConfig getBoundSessionConfig() {
        SessionConfig.Builder builder;
        if (!isCameraInitialized()) {
            Logger.d(TAG, CAMERA_NOT_INITIALIZED);
            return null;
        }
        if (!isPreviewViewAttached()) {
            Logger.d(TAG, PREVIEW_VIEW_NOT_ATTACHED);
            return null;
        }
        SessionConfig sessionConfig = this.mSessionConfig;
        if (sessionConfig != null) {
            builder = new SessionConfig.Builder(sessionConfig);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.mPreview);
            if (isImageCaptureEnabled()) {
                arrayList.add(this.mImageCapture);
            }
            if (isImageAnalysisEnabled()) {
                arrayList.add(this.mImageAnalysis);
            }
            if (isVideoCaptureEnabled()) {
                arrayList.add(this.mVideoCapture);
            }
            builder = new SessionConfig.Builder(arrayList);
            Iterator<CameraEffect> it = this.mEffects.iterator();
            while (it.hasNext()) {
                builder.addEffect(it.next());
            }
        }
        builder.setViewPort(this.mViewPort);
        builder.setAutoRotationEnabled(this.mAutoRotationEnabled);
        SessionConfig sessionConfigBuild = builder.build();
        this.mBoundSessionConfig = sessionConfigBuild;
        return sessionConfigBuild;
    }

    public CameraControl getCameraControl() {
        Threads.checkMainThread();
        Camera camera = this.mCamera;
        if (camera == null) {
            return null;
        }
        return camera.getCameraControl();
    }

    public CameraInfo getCameraInfo() {
        Threads.checkMainThread();
        Camera camera = this.mCamera;
        if (camera == null) {
            return null;
        }
        return camera.getCameraInfo();
    }

    public CameraSelector getCameraSelector() {
        Threads.checkMainThread();
        return this.mCameraSelector;
    }

    public Executor getImageAnalysisBackgroundExecutor() {
        Threads.checkMainThread();
        return this.mSessionConfig != null ? this.mImageAnalysis.getBackgroundExecutor() : this.mAnalysisBackgroundExecutor;
    }

    public int getImageAnalysisBackpressureStrategy() {
        Threads.checkMainThread();
        return this.mImageAnalysis.getBackpressureStrategy();
    }

    public int getImageAnalysisImageQueueDepth() {
        Threads.checkMainThread();
        return this.mImageAnalysis.getImageQueueDepth();
    }

    public int getImageAnalysisOutputImageFormat() {
        Threads.checkMainThread();
        return this.mImageAnalysis.getOutputImageFormat();
    }

    public ResolutionSelector getImageAnalysisResolutionSelector() {
        Threads.checkMainThread();
        return this.mSessionConfig != null ? this.mImageAnalysis.getResolutionSelector() : this.mImageAnalysisResolutionSelector;
    }

    @Deprecated
    public OutputSize getImageAnalysisTargetSize() {
        Threads.checkMainThread();
        if (this.mSessionConfig == null) {
            return this.mImageAnalysisTargetSize;
        }
        return null;
    }

    public int getImageCaptureFlashMode() {
        Threads.checkMainThread();
        return this.mImageCapture.getFlashMode();
    }

    public Executor getImageCaptureIoExecutor() {
        Threads.checkMainThread();
        return this.mSessionConfig != null ? ((ImageCaptureConfig) this.mImageCapture.getCurrentConfig()).getIoExecutor(null) : this.mImageCaptureIoExecutor;
    }

    public int getImageCaptureMode() {
        Threads.checkMainThread();
        return this.mImageCapture.getCaptureMode();
    }

    public ResolutionSelector getImageCaptureResolutionSelector() {
        Threads.checkMainThread();
        return this.mSessionConfig != null ? this.mImageCapture.getResolutionSelector() : this.mImageCaptureResolutionSelector;
    }

    @Deprecated
    public OutputSize getImageCaptureTargetSize() {
        Threads.checkMainThread();
        if (this.mSessionConfig == null) {
            return this.mImageCaptureTargetSize;
        }
        return null;
    }

    public bm<Void> getInitializationFuture() {
        return this.mInitializationFuture;
    }

    public DynamicRange getPreviewDynamicRange() {
        Threads.checkMainThread();
        return this.mSessionConfig == null ? this.mPreviewDynamicRange : this.mPreview.getDynamicRange();
    }

    public ResolutionSelector getPreviewResolutionSelector() {
        Threads.checkMainThread();
        return this.mSessionConfig != null ? this.mPreview.getResolutionSelector() : this.mPreviewResolutionSelector;
    }

    @Deprecated
    public OutputSize getPreviewTargetSize() {
        Threads.checkMainThread();
        if (this.mSessionConfig == null) {
            return this.mPreviewTargetSize;
        }
        return null;
    }

    public ScreenFlashUiInfo getScreenFlashUiInfoByPriority() {
        ScreenFlashUiInfo screenFlashUiInfo = this.mScreenFlashUiInfoMap.get(ScreenFlashUiInfo.ProviderType.SCREEN_FLASH_VIEW);
        Map<ScreenFlashUiInfo.ProviderType, ScreenFlashUiInfo> map = this.mScreenFlashUiInfoMap;
        if (screenFlashUiInfo != null) {
            return map.get(ScreenFlashUiInfo.ProviderType.SCREEN_FLASH_VIEW);
        }
        if (map.get(ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW) != null) {
            return this.mScreenFlashUiInfoMap.get(ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW);
        }
        return null;
    }

    public LiveData<TapToFocusInfo> getTapToFocusInfoState() {
        Threads.checkMainThread();
        return this.mTapToFocusInfoState;
    }

    @Deprecated
    public LiveData<Integer> getTapToFocusState() {
        Threads.checkMainThread();
        return this.mTapToFocusState;
    }

    public LiveData<Integer> getTorchState() {
        Threads.checkMainThread();
        return this.mTorchState;
    }

    public DynamicRange getVideoCaptureDynamicRange() {
        Threads.checkMainThread();
        return this.mSessionConfig != null ? this.mVideoCapture.getDynamicRange() : this.mVideoCaptureDynamicRange;
    }

    public int getVideoCaptureMirrorMode() {
        Threads.checkMainThread();
        return this.mSessionConfig != null ? this.mVideoCapture.getMirrorMode() : this.mVideoCaptureMirrorMode;
    }

    public QualitySelector getVideoCaptureQualitySelector() {
        Threads.checkMainThread();
        return this.mSessionConfig != null ? ((Recorder) this.mVideoCapture.getOutput()).getQualitySelector() : this.mVideoCaptureQualitySelector;
    }

    public Range<Integer> getVideoCaptureTargetFrameRate() {
        Threads.checkMainThread();
        return this.mSessionConfig != null ? this.mVideoCapture.getTargetFrameRate() : this.mVideoCaptureTargetFrameRate;
    }

    public LiveData<ZoomState> getZoomState() {
        Threads.checkMainThread();
        return this.mZoomState;
    }

    public boolean hasCamera(CameraSelector cameraSelector) {
        Threads.checkMainThread();
        Preconditions.checkNotNull(cameraSelector);
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.mCameraProvider;
        if (processCameraProviderWrapper == null) {
            throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
        }
        try {
            return processCameraProviderWrapper.hasCamera(cameraSelector);
        } catch (CameraInfoUnavailableException e2) {
            Logger.w(TAG, "Failed to check camera availability", e2);
            return false;
        }
    }

    public boolean isAutoRotationEnabled() {
        Threads.checkMainThread();
        return this.mAutoRotationEnabled;
    }

    public boolean isImageAnalysisEnabled() {
        Threads.checkMainThread();
        return isUseCaseEnabled(2);
    }

    public boolean isImageCaptureEnabled() {
        Threads.checkMainThread();
        return isUseCaseEnabled(1);
    }

    public boolean isPinchToZoomEnabled() {
        Threads.checkMainThread();
        return this.mPinchToZoomEnabled;
    }

    public boolean isRecording() {
        Threads.checkMainThread();
        Recording recording = this.mActiveRecording;
        return (recording == null || recording.isClosed()) ? false : true;
    }

    public boolean isTapToFocusEnabled() {
        Threads.checkMainThread();
        return this.mTapToFocusEnabled;
    }

    public boolean isVideoCaptureEnabled() {
        Threads.checkMainThread();
        return isUseCaseEnabled(4);
    }

    /* renamed from: lambda$new$0$androidx-camera-view-CameraController, reason: not valid java name */
    /* synthetic */ Void m1523lambda$new$0$androidxcameraviewCameraController(ProcessCameraProviderWrapper processCameraProviderWrapper) {
        this.mCameraProvider = processCameraProviderWrapper;
        if (this.mSessionConfig == null) {
            unbindAllAndRecreate();
        }
        startCameraAndTrackStates();
        return null;
    }

    /* renamed from: lambda$setCameraSelector$3$androidx-camera-view-CameraController, reason: not valid java name */
    /* synthetic */ void m1524lambda$setCameraSelector$3$androidxcameraviewCameraController(CameraSelector cameraSelector) {
        this.mCameraSelector = cameraSelector;
    }

    /* renamed from: lambda$setEnabledUseCases$1$androidx-camera-view-CameraController, reason: not valid java name */
    /* synthetic */ void m1525x5a17d266(int i2, int i3) {
        this.mEnabledUseCases = i2;
        Logger.w(TAG, "setEnabledUseCases: failed to enable use cases properly for enabledUseCases = " + Integer.toBinaryString(i3) + ", restoring back previous values " + Integer.toBinaryString(i2));
    }

    /* renamed from: lambda$setSessionConfig$2$androidx-camera-view-CameraController, reason: not valid java name */
    /* synthetic */ void m1526lambda$setSessionConfig$2$androidxcameraviewCameraController(int i2, SessionConfig sessionConfig, CameraSelector cameraSelector) {
        this.mEnabledUseCases = i2;
        this.mSessionConfig = sessionConfig;
        this.mCameraSelector = cameraSelector;
        if (sessionConfig != null) {
            initializeStateFromSessionConfig(sessionConfig);
        }
        Logger.w(TAG, "Failed to set the session config, restoring back previous values!");
    }

    void onPinchToZoom(float f2) {
        if (!isCameraAttached()) {
            Logger.w(TAG, CAMERA_NOT_ATTACHED);
            return;
        }
        if (!this.mPinchToZoomEnabled) {
            Logger.d(TAG, "Pinch to zoom disabled.");
            return;
        }
        Logger.d(TAG, "Pinch to zoom with scale: " + f2);
        ZoomState value = getZoomState().getValue();
        if (value == null) {
            return;
        }
        setZoomRatio(Math.min(Math.max(value.getZoomRatio() * speedUpZoomBy2X(f2), value.getMinZoomRatio()), value.getMaxZoomRatio()));
    }

    void onTapToFocus(MeteringPointFactory meteringPointFactory, float f2, float f3) {
        if (!isCameraAttached()) {
            Logger.w(TAG, CAMERA_NOT_ATTACHED);
            return;
        }
        if (!this.mTapToFocusEnabled) {
            Logger.d(TAG, "Tap to focus disabled. ");
            return;
        }
        PointF pointF = new PointF(f2, f3);
        FocusMeteringAction focusMeteringActionCreateFocusMeteringAction = createFocusMeteringAction(meteringPointFactory, pointF);
        Logger.d(TAG, "Tap to focus started: " + f2 + ", " + f3);
        FocusMeteringResultCallback focusMeteringResultCallback = this.mFocusMeteringResultCallback;
        if (focusMeteringResultCallback != null) {
            focusMeteringResultCallback.close();
        }
        this.mTapToFocusInfoState.postValue(new TapToFocusInfo(1, pointF));
        final FocusMeteringResultCallback focusMeteringResultCallback2 = new FocusMeteringResultCallback(pointF, this.mTapToFocusInfoState);
        this.mFocusMeteringResultCallback = focusMeteringResultCallback2;
        Futures.addCallback(this.mCamera.getCameraControl().startFocusAndMetering(focusMeteringActionCreateFocusMeteringAction), focusMeteringResultCallback2, CameraXExecutors.directExecutor());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long j2 = this.mTapToFocusAutoCancelDurationNanos / 1000000;
        Logger.d(TAG, "Tap to focus auto cancel duration: " + j2 + " ms");
        if (j2 > 0) {
            Handler handler = new Handler(Looper.getMainLooper());
            Objects.requireNonNull(focusMeteringResultCallback2);
            handler.postDelayed(new Runnable() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    focusMeteringResultCallback2.resetStateAndClose();
                }
            }, j2);
        }
    }

    public void setAutoRotationEnabled(boolean z) {
        Threads.checkMainThread();
        if (this.mAutoRotationEnabled == z) {
            return;
        }
        this.mAutoRotationEnabled = z;
        unbindSessionConfig();
        startCameraAndTrackStates();
    }

    public void setCameraSelector(CameraSelector cameraSelector) {
        Threads.checkMainThread();
        if (this.mCameraSelector == cameraSelector) {
            return;
        }
        validateFlashModeScreenConditions(this.mImageCapture, cameraSelector);
        final CameraSelector cameraSelector2 = this.mCameraSelector;
        this.mCameraSelector = cameraSelector;
        unbindSessionConfig();
        startCameraAndTrackStates(new Runnable() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1524lambda$setCameraSelector$3$androidxcameraviewCameraController(cameraSelector2);
            }
        });
    }

    public void setEffects(Set<CameraEffect> set) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setEffects");
        if (Objects.equals(this.mEffects, set)) {
            return;
        }
        if (this.mCameraProvider != null) {
            unbindSessionConfig();
        }
        validateEffects(set);
        this.mEffects.clear();
        this.mEffects.addAll(set);
        startCameraAndTrackStates();
    }

    public void setEnabledUseCases(final int i2) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setEnabledUseCases");
        final int i3 = this.mEnabledUseCases;
        if (i2 == i3) {
            return;
        }
        this.mEnabledUseCases = i2;
        if (!isVideoCaptureEnabled() && isRecording()) {
            stopRecording();
        }
        startCameraAndTrackStates(new Runnable() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1525x5a17d266(i3, i2);
            }
        });
    }

    public void setImageAnalysisAnalyzer(Executor executor, ImageAnalysis.Analyzer analyzer) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageAnalysisAnalyzer");
        ImageAnalysis.Analyzer analyzer2 = this.mAnalysisAnalyzer;
        if (analyzer2 == analyzer && this.mAnalysisExecutor == executor) {
            return;
        }
        this.mAnalysisExecutor = executor;
        this.mAnalysisAnalyzer = analyzer;
        this.mImageAnalysis.setAnalyzer(executor, analyzer);
        restartCameraIfAnalyzerResolutionChanged(analyzer2, analyzer);
    }

    public void setImageAnalysisBackgroundExecutor(Executor executor) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageAnalysisBackgroundExecutor");
        if (this.mAnalysisBackgroundExecutor == executor) {
            return;
        }
        this.mAnalysisBackgroundExecutor = executor;
        recreateImageAnalysis(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()), true);
        startCameraAndTrackStates();
    }

    public void setImageAnalysisBackpressureStrategy(int i2) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageAnalysisBackpressureStrategy");
        if (this.mImageAnalysis.getBackpressureStrategy() == i2) {
            return;
        }
        recreateImageAnalysis(Integer.valueOf(i2), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()), true);
        startCameraAndTrackStates();
    }

    public void setImageAnalysisImageQueueDepth(int i2) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageAnalysisImageQueueDepth");
        if (this.mImageAnalysis.getImageQueueDepth() == i2) {
            return;
        }
        recreateImageAnalysis(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(i2), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()), true);
        startCameraAndTrackStates();
    }

    public void setImageAnalysisOutputImageFormat(int i2) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageAnalysisOutputImageFormat");
        if (i2 == this.mImageAnalysis.getOutputImageFormat()) {
            return;
        }
        recreateImageAnalysis(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(i2), true);
    }

    public void setImageAnalysisResolutionSelector(ResolutionSelector resolutionSelector) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageAnalysisResolutionSelector");
        if (this.mImageAnalysisResolutionSelector == resolutionSelector) {
            return;
        }
        this.mImageAnalysisResolutionSelector = resolutionSelector;
        recreateImageAnalysis(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()), true);
        startCameraAndTrackStates();
    }

    @Deprecated
    public void setImageAnalysisTargetSize(OutputSize outputSize) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageAnalysisTargetSize");
        if (isOutputSizeEqual(this.mImageAnalysisTargetSize, outputSize)) {
            return;
        }
        this.mImageAnalysisTargetSize = outputSize;
        recreateImageAnalysis(Integer.valueOf(this.mImageAnalysis.getBackpressureStrategy()), Integer.valueOf(this.mImageAnalysis.getImageQueueDepth()), Integer.valueOf(this.mImageAnalysis.getOutputImageFormat()), true);
        startCameraAndTrackStates();
    }

    public void setImageCaptureFlashMode(int i2) {
        Threads.checkMainThread();
        if (this.mSessionConfig != null && !isImageCaptureEnabled()) {
            throw new IllegalStateException("A SessionConfig is set and it doesn't contain an ImageCapture.");
        }
        if (i2 == 3) {
            Integer lensFacing = this.mCameraSelector.getLensFacing();
            if (lensFacing != null && lensFacing.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            updateScreenFlashToImageCapture();
            i2 = 3;
        }
        this.mImageCapture.setFlashMode(i2);
    }

    public void setImageCaptureIoExecutor(Executor executor) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageCaptureIoExecutor");
        if (this.mImageCaptureIoExecutor == executor) {
            return;
        }
        this.mImageCaptureIoExecutor = executor;
        recreateImageCapture(Integer.valueOf(getImageCaptureMode()), true);
        startCameraAndTrackStates();
    }

    public void setImageCaptureMode(int i2) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageCaptureMode");
        if (this.mImageCapture.getCaptureMode() == i2) {
            return;
        }
        recreateImageCapture(Integer.valueOf(i2), true);
        startCameraAndTrackStates();
    }

    public void setImageCaptureResolutionSelector(ResolutionSelector resolutionSelector) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageCaptureResolutionSelector");
        if (this.mImageCaptureResolutionSelector == resolutionSelector) {
            return;
        }
        this.mImageCaptureResolutionSelector = resolutionSelector;
        recreateImageCapture(Integer.valueOf(getImageCaptureMode()), true);
        startCameraAndTrackStates();
    }

    @Deprecated
    public void setImageCaptureTargetSize(OutputSize outputSize) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setImageCaptureTargetSize");
        if (isOutputSizeEqual(this.mImageCaptureTargetSize, outputSize)) {
            return;
        }
        this.mImageCaptureTargetSize = outputSize;
        recreateImageCapture(Integer.valueOf(getImageCaptureMode()), true);
        startCameraAndTrackStates();
    }

    public bm<Void> setLinearZoom(float f2) {
        Threads.checkMainThread();
        return !isCameraAttached() ? this.mPendingLinearZoom.setValue(Float.valueOf(f2)) : this.mCamera.getCameraControl().setLinearZoom(f2);
    }

    public void setPinchToZoomEnabled(boolean z) {
        Threads.checkMainThread();
        this.mPinchToZoomEnabled = z;
    }

    public void setPreviewDynamicRange(DynamicRange dynamicRange) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setPreviewDynamicRange");
        this.mPreviewDynamicRange = dynamicRange;
        recreatePreview(true);
        startCameraAndTrackStates();
    }

    public void setPreviewResolutionSelector(ResolutionSelector resolutionSelector) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setPreviewResolutionSelector");
        if (this.mPreviewResolutionSelector == resolutionSelector) {
            return;
        }
        this.mPreviewResolutionSelector = resolutionSelector;
        recreatePreview(true);
        startCameraAndTrackStates();
    }

    @Deprecated
    public void setPreviewTargetSize(OutputSize outputSize) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setPreviewTargetSize");
        if (isOutputSizeEqual(this.mPreviewTargetSize, outputSize)) {
            return;
        }
        this.mPreviewTargetSize = outputSize;
        recreatePreview(true);
        startCameraAndTrackStates();
    }

    public void setScreenFlashUiInfo(ScreenFlashUiInfo screenFlashUiInfo) {
        ScreenFlashUiInfo screenFlashUiInfoByPriority = getScreenFlashUiInfoByPriority();
        this.mScreenFlashUiInfoMap.put(screenFlashUiInfo.getProviderType(), screenFlashUiInfo);
        ScreenFlashUiInfo screenFlashUiInfoByPriority2 = getScreenFlashUiInfoByPriority();
        if (screenFlashUiInfoByPriority2 == null || screenFlashUiInfoByPriority2.equals(screenFlashUiInfoByPriority)) {
            return;
        }
        updateScreenFlashToImageCapture();
    }

    public void setSessionConfig(SessionConfig sessionConfig, CameraSelector cameraSelector) {
        Threads.checkMainThread();
        if (this.mSessionConfig == sessionConfig && this.mCameraSelector == cameraSelector) {
            return;
        }
        if (sessionConfig instanceof HighSpeedVideoSessionConfig) {
            throw new IllegalArgumentException("CameraController does not support HighSpeedVideoSessionConfig!");
        }
        ImageCapture imageCaptureFindImageCapture = UseCaseUtil.findImageCapture(sessionConfig.getUseCases());
        if (imageCaptureFindImageCapture != null) {
            validateFlashModeScreenConditions(imageCaptureFindImageCapture, cameraSelector);
        }
        if (isRecording()) {
            stopRecording();
        }
        unbindSessionConfig();
        if (isCameraInitialized() && !isConfigurationSupported(cameraSelector, sessionConfig)) {
            throw new IllegalArgumentException("The camera resolved by the camera selector can not support the session config.");
        }
        final int i2 = this.mEnabledUseCases;
        this.mEnabledUseCases = initializeStateFromSessionConfig(sessionConfig);
        final SessionConfig sessionConfig2 = this.mSessionConfig;
        final CameraSelector cameraSelector2 = this.mCameraSelector;
        this.mSessionConfig = sessionConfig;
        this.mCameraSelector = cameraSelector;
        startCameraAndTrackStates(new Runnable() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1526lambda$setSessionConfig$2$androidxcameraviewCameraController(i2, sessionConfig2, cameraSelector2);
            }
        });
    }

    public void setTapToFocusAutoCancelDuration(long j2, TimeUnit timeUnit) {
        Preconditions.checkArgument(j2 >= 0, "Tap-to-focus auto-cancellation duration must be at least 0");
        this.mTapToFocusAutoCancelDurationNanos = timeUnit.toNanos(j2);
        Logger.d(TAG, "setTapToFocusAutoCancelDuration: " + this.mTapToFocusAutoCancelDurationNanos + " ns set!");
    }

    public void setTapToFocusEnabled(boolean z) {
        Threads.checkMainThread();
        this.mTapToFocusEnabled = z;
    }

    public void setVideoCaptureDynamicRange(DynamicRange dynamicRange) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setVideoCaptureDynamicRange");
        this.mVideoCaptureDynamicRange = dynamicRange;
        recreateVideoCapture(true);
        startCameraAndTrackStates();
    }

    public void setVideoCaptureMirrorMode(int i2) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setVideoCaptureMirrorMode");
        this.mVideoCaptureMirrorMode = i2;
        recreateVideoCapture(true);
        startCameraAndTrackStates();
    }

    public void setVideoCaptureMuxerFactory(MuxerFactory muxerFactory) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setVideoCaptureMuxerFactory");
        if (this.mVideoCaptureMuxerFactory != muxerFactory) {
            this.mVideoCaptureMuxerFactory = muxerFactory;
            recreateVideoCapture(true);
            startCameraAndTrackStates();
        }
    }

    public void setVideoCaptureQualitySelector(QualitySelector qualitySelector) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setVideoCaptureQualitySelector");
        this.mVideoCaptureQualitySelector = qualitySelector;
        recreateVideoCapture(true);
        startCameraAndTrackStates();
    }

    public void setVideoCaptureTargetFrameRate(Range<Integer> range) {
        Threads.checkMainThread();
        throwExceptionIfSessionConfigExists("setVideoCaptureTargetFrameRate");
        this.mVideoCaptureTargetFrameRate = range;
        recreateVideoCapture(true);
        startCameraAndTrackStates();
    }

    public bm<Void> setZoomRatio(float f2) {
        Threads.checkMainThread();
        return !isCameraAttached() ? this.mPendingZoomRatio.setValue(Float.valueOf(f2)) : this.mCamera.getCameraControl().setZoomRatio(f2);
    }

    abstract Camera startCamera();

    void startCameraAndTrackStates(Runnable runnable) {
        try {
            this.mCamera = startCamera();
            if (!isCameraAttached()) {
                Logger.d(TAG, CAMERA_NOT_ATTACHED);
                return;
            }
            this.mZoomState.setSource(this.mCamera.getCameraInfo().getZoomState());
            this.mTorchState.setSource(this.mCamera.getCameraInfo().getTorchState());
            this.mPendingEnableTorch.propagateIfHasValue(new Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.enableTorch(((Boolean) obj).booleanValue());
                }
            });
            this.mPendingLinearZoom.propagateIfHasValue(new Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.setLinearZoom(((Float) obj).floatValue());
                }
            });
            this.mPendingZoomRatio.propagateIfHasValue(new Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.setZoomRatio(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e2) {
            if (runnable != null) {
                runnable.run();
            }
            throw e2;
        }
    }

    public Recording startRecording(FileDescriptorOutputOptions fileDescriptorOutputOptions, AudioConfig audioConfig, Executor executor, Consumer<VideoRecordEvent> consumer) {
        return startRecordingInternal(fileDescriptorOutputOptions, audioConfig, executor, consumer);
    }

    public void takePicture(ImageCapture.OutputFileOptions outputFileOptions, Executor executor, ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        Preconditions.checkState(isImageCaptureEnabled(), IMAGE_CAPTURE_DISABLED);
        throwExceptionForInvalidScreenFlashCapture();
        updateMirroringFlagInOutputFileOptions(outputFileOptions);
        this.mImageCapture.m1324lambda$takePicture$2$androidxcameracoreImageCapture(outputFileOptions, executor, onImageSavedCallback);
    }

    void updateMirroringFlagInOutputFileOptions(ImageCapture.OutputFileOptions outputFileOptions) {
        if (this.mCameraSelector.getLensFacing() == null || outputFileOptions.getMetadata().isReversedHorizontalSet()) {
            return;
        }
        outputFileOptions.getMetadata().setReversedHorizontal(this.mCameraSelector.getLensFacing().intValue() == 0);
    }

    void updatePreviewViewTransform(Matrix matrix) {
        Threads.checkMainThread();
        ImageAnalysis.Analyzer analyzer = this.mAnalysisAnalyzer;
        if (analyzer != null && analyzer.getTargetCoordinateSystem() == 1) {
            this.mAnalysisAnalyzer.updateTransform(matrix);
        }
    }

    public void updateScreenFlashToImageCapture() {
        ScreenFlashUiInfo screenFlashUiInfoByPriority = getScreenFlashUiInfoByPriority();
        if (screenFlashUiInfoByPriority == null) {
            Logger.d(TAG, "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.mImageCapture.setScreenFlash(NO_OP_SCREEN_FLASH);
        } else {
            this.mImageCapture.setScreenFlash(screenFlashUiInfoByPriority.getScreenFlash());
            Logger.d(TAG, "Set ScreenFlash instance to ImageCapture, provided by ".concat(String.valueOf(screenFlashUiInfoByPriority.getProviderType().name())));
        }
    }

    public Recording startRecording(FileOutputOptions fileOutputOptions, AudioConfig audioConfig, Executor executor, Consumer<VideoRecordEvent> consumer) {
        return startRecordingInternal(fileOutputOptions, audioConfig, executor, consumer);
    }

    public Recording startRecording(MediaStoreOutputOptions mediaStoreOutputOptions, AudioConfig audioConfig, Executor executor, Consumer<VideoRecordEvent> consumer) {
        return startRecordingInternal(mediaStoreOutputOptions, audioConfig, executor, consumer);
    }

    /* compiled from: WazeSource */
    @Deprecated
    public final class OutputSize {
        public static final int UNASSIGNED_ASPECT_RATIO = -1;
        private final int mAspectRatio;
        private final Size mResolution;

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface OutputAspectRatio {
        }

        public OutputSize(int i2) {
            Preconditions.checkArgument(i2 != -1);
            this.mAspectRatio = i2;
            this.mResolution = null;
        }

        public int getAspectRatio() {
            return this.mAspectRatio;
        }

        public Size getResolution() {
            return this.mResolution;
        }

        public String toString() {
            return "aspect ratio: " + this.mAspectRatio + " resolution: " + this.mResolution;
        }

        public OutputSize(Size size) {
            Preconditions.checkNotNull(size);
            this.mAspectRatio = -1;
            this.mResolution = size;
        }
    }

    public void takePicture(Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        Threads.checkMainThread();
        Preconditions.checkState(isCameraInitialized(), CAMERA_NOT_INITIALIZED);
        Preconditions.checkState(isImageCaptureEnabled(), IMAGE_CAPTURE_DISABLED);
        throwExceptionForInvalidScreenFlashCapture();
        this.mImageCapture.m1323lambda$takePicture$1$androidxcameracoreImageCapture(executor, onImageCapturedCallback);
    }

    void startCameraAndTrackStates() {
        startCameraAndTrackStates(null);
    }

    CameraController(Context context) {
        this(context, Futures.transform(ProcessCameraProvider.getInstance(context), new Function() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return new ProcessCameraProviderWrapperImpl((ProcessCameraProvider) obj);
            }
        }, CameraXExecutors.directExecutor()));
    }
}
