package androidx.camera.video;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.ResolutionInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.featuregroup.RecordingQualityFeature;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.config.MediaConfigUtil;
import androidx.camera.video.internal.config.MediaInfo;
import androidx.camera.video.internal.config.VideoMimeInfo;
import androidx.camera.video.internal.encoder.SwappedVideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.d.m.a.bm;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoCapture<T extends VideoOutput> extends UseCase {
    private static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final String SURFACE_UPDATE_KEY = "androidx.camera.video.VideoCapture.streamUpdate";
    private static final String TAG = "VideoCapture";
    private SurfaceEdge mCameraEdge;
    private SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private Rect mCropRect;
    DeferrableSurface mDeferrableSurface;
    private boolean mHasCompensatingTransformation;
    private SurfaceProcessorNode mNode;
    private Map<Quality, List<Size>> mQualityToCustomSizesMap;
    private MediaInfo mResolvedMediaInfo;
    private int mRotationDegrees;
    SessionConfig.Builder mSessionConfigBuilder;
    VideoOutput.SourceState mSourceState;
    private SourceStreamRequirementObserver mSourceStreamRequirementObserver;
    StreamInfo mStreamInfo;
    private final Observable.Observer<StreamInfo> mStreamInfoObserver;
    private SurfaceRequest mSurfaceRequest;
    bm<Void> mSurfaceUpdateFuture;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.video.VideoCapture$2, reason: invalid class name */
    class AnonymousClass2 extends CameraCaptureCallback {
        private boolean mIsFirstCaptureResult = true;
        final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;
        final /* synthetic */ SessionConfig.Builder val$sessionConfigBuilder;
        final /* synthetic */ AtomicBoolean val$surfaceUpdateComplete;

        AnonymousClass2(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, SessionConfig.Builder builder) {
            this.val$surfaceUpdateComplete = atomicBoolean;
            this.val$completer = completer;
            this.val$sessionConfigBuilder = builder;
        }

        /* renamed from: lambda$onCaptureCompleted$0$androidx-camera-video-VideoCapture$2, reason: not valid java name */
        /* synthetic */ void m1471lambda$onCaptureCompleted$0$androidxcameravideoVideoCapture$2(SessionConfig.Builder builder) {
            builder.removeCameraCaptureCallback(this);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i2, CameraCaptureResult cameraCaptureResult) {
            Object tag;
            if (this.mIsFirstCaptureResult) {
                this.mIsFirstCaptureResult = false;
                Logger.d(VideoCapture.TAG, "cameraCaptureResult timestampNs = " + cameraCaptureResult.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (this.val$surfaceUpdateComplete.get() || (tag = cameraCaptureResult.getTagBundle().getTag(VideoCapture.SURFACE_UPDATE_KEY)) == null || ((Integer) tag).intValue() != this.val$completer.hashCode() || !this.val$completer.set(null) || this.val$surfaceUpdateComplete.getAndSet(true)) {
                return;
            }
            final SessionConfig.Builder builder = this.val$sessionConfigBuilder;
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.video.VideoCapture$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1471lambda$onCaptureCompleted$0$androidxcameravideoVideoCapture$2(builder);
                }
            });
        }
    }

    /* compiled from: WazeSource */
    class SourceStreamRequirementObserver implements Observable.Observer<Boolean> {
        private CameraControlInternal mCameraControl;
        private boolean mIsSourceStreamRequired = false;

        SourceStreamRequirementObserver(CameraControlInternal cameraControlInternal) {
            this.mCameraControl = cameraControlInternal;
        }

        private void updateVideoUsageInCamera(boolean z) {
            if (this.mIsSourceStreamRequired == z) {
                return;
            }
            this.mIsSourceStreamRequired = z;
            CameraControlInternal cameraControlInternal = this.mCameraControl;
            if (cameraControlInternal == null) {
                Logger.d(VideoCapture.TAG, "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z) {
                cameraControlInternal.incrementVideoUsage();
            } else {
                cameraControlInternal.decrementVideoUsage();
            }
        }

        public void close() {
            Preconditions.checkState(Threads.isMainThread(), "SourceStreamRequirementObserver can be closed from main thread only");
            Logger.d(VideoCapture.TAG, "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.mIsSourceStreamRequired);
            if (this.mCameraControl == null) {
                Logger.d(VideoCapture.TAG, "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                updateVideoUsageInCamera(false);
                this.mCameraControl = null;
            }
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th) {
            Logger.w(VideoCapture.TAG, "SourceStreamRequirementObserver#onError", th);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onNewData(Boolean bool) {
            Preconditions.checkState(Threads.isMainThread(), "SourceStreamRequirementObserver can be updated from main thread only");
            updateVideoUsageInCamera(Boolean.TRUE.equals(bool));
        }
    }

    VideoCapture(VideoCaptureConfig<T> videoCaptureConfig) {
        super(videoCaptureConfig);
        this.mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
        this.mSessionConfigBuilder = new SessionConfig.Builder();
        this.mSurfaceUpdateFuture = null;
        this.mSourceState = VideoOutput.SourceState.INACTIVE;
        this.mHasCompensatingTransformation = false;
        this.mQualityToCustomSizesMap = Collections.EMPTY_MAP;
        this.mStreamInfoObserver = new Observable.Observer<StreamInfo>() { // from class: androidx.camera.video.VideoCapture.1
            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(Throwable th) {
                Logger.w(VideoCapture.TAG, "Receive onError from StreamState observer", th);
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onNewData(StreamInfo streamInfo) {
                if (streamInfo == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                if (VideoCapture.this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                Logger.d(VideoCapture.TAG, "Stream info update: old: " + VideoCapture.this.mStreamInfo + " new: " + streamInfo);
                VideoCapture videoCapture = VideoCapture.this;
                StreamInfo streamInfo2 = videoCapture.mStreamInfo;
                videoCapture.mStreamInfo = streamInfo;
                StreamSpec attachedStreamSpec = videoCapture.getAttachedStreamSpec();
                Preconditions.checkNotNull(attachedStreamSpec);
                if (VideoCapture.this.isStreamIdChanged(streamInfo2.getId(), streamInfo.getId()) || VideoCapture.this.shouldResetCompensatingTransformation(streamInfo2, streamInfo)) {
                    VideoCapture.this.resetPipeline();
                    return;
                }
                if ((streamInfo2.getId() != -1 && streamInfo.getId() == -1) || (streamInfo2.getId() == -1 && streamInfo.getId() != -1)) {
                    VideoCapture videoCapture2 = VideoCapture.this;
                    videoCapture2.applyStreamInfoAndStreamSpecToSessionConfigBuilder(videoCapture2.mSessionConfigBuilder, streamInfo, attachedStreamSpec);
                    VideoCapture videoCapture3 = VideoCapture.this;
                    videoCapture3.updateSessionConfig(VideoCapture$1$$ExternalSyntheticBackport0.m(new Object[]{videoCapture3.mSessionConfigBuilder.build()}));
                    VideoCapture.this.notifyReset();
                    return;
                }
                if (streamInfo2.getStreamState() != streamInfo.getStreamState()) {
                    VideoCapture videoCapture4 = VideoCapture.this;
                    videoCapture4.applyStreamInfoAndStreamSpecToSessionConfigBuilder(videoCapture4.mSessionConfigBuilder, streamInfo, attachedStreamSpec);
                    VideoCapture videoCapture5 = VideoCapture.this;
                    videoCapture5.updateSessionConfig(VideoCapture$1$$ExternalSyntheticBackport0.m(new Object[]{videoCapture5.mSessionConfigBuilder.build()}));
                    VideoCapture.this.notifyUpdated();
                }
            }
        };
    }

    private static void addBySupportedSize(Set<Size> set, int i2, int i3, Size size, VideoEncoderInfo videoEncoderInfo) {
        if (i2 > size.getWidth() || i3 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i2, ((Integer) videoEncoderInfo.getSupportedHeightsFor(i2).clamp(Integer.valueOf(i3))).intValue()));
        } catch (IllegalArgumentException e2) {
            Logger.w(TAG, "No supportedHeights for width: " + i2, e2);
        }
        try {
            set.add(new Size(((Integer) videoEncoderInfo.getSupportedWidthsFor(i3).clamp(Integer.valueOf(i2))).intValue(), i3));
        } catch (IllegalArgumentException e3) {
            Logger.w(TAG, "No supportedWidths for height: " + i3, e3);
        }
    }

    private static Rect adjustCropRectByQuirk(Rect rect, int i2, boolean z, VideoEncoderInfo videoEncoderInfo) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) DeviceQuirks.get(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (true != z) {
            i2 = 0;
        }
        return sizeCannotEncodeVideoQuirk.adjustCropRectForProblematicEncodeSize(rect, i2, videoEncoderInfo);
    }

    private static Rect adjustCropRectToValidSize(final Rect rect, Size size, VideoEncoderInfo videoEncoderInfo) {
        Logger.d(TAG, String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", TransformUtils.rectToString(rect), Integer.valueOf(videoEncoderInfo.getWidthAlignment()), Integer.valueOf(videoEncoderInfo.getHeightAlignment()), videoEncoderInfo.getSupportedWidths(), videoEncoderInfo.getSupportedHeights()));
        if ((!videoEncoderInfo.getSupportedWidths().contains((Range<Integer>) Integer.valueOf(rect.width())) || !videoEncoderInfo.getSupportedHeights().contains((Range<Integer>) Integer.valueOf(rect.height()))) && videoEncoderInfo.canSwapWidthHeight() && videoEncoderInfo.getSupportedHeights().contains((Range<Integer>) Integer.valueOf(rect.width())) && videoEncoderInfo.getSupportedWidths().contains((Range<Integer>) Integer.valueOf(rect.height()))) {
            videoEncoderInfo = new SwappedVideoEncoderInfo(videoEncoderInfo);
        }
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        Range<Integer> supportedWidths = videoEncoderInfo.getSupportedWidths();
        Range<Integer> supportedHeights = videoEncoderInfo.getSupportedHeights();
        int iAlignDown = alignDown(rect.width(), widthAlignment, supportedWidths);
        int iAlignUp = alignUp(rect.width(), widthAlignment, supportedWidths);
        int iAlignDown2 = alignDown(rect.height(), heightAlignment, supportedHeights);
        int iAlignUp2 = alignUp(rect.height(), heightAlignment, supportedHeights);
        HashSet hashSet = new HashSet();
        addBySupportedSize(hashSet, iAlignDown, iAlignDown2, size, videoEncoderInfo);
        addBySupportedSize(hashSet, iAlignDown, iAlignUp2, size, videoEncoderInfo);
        addBySupportedSize(hashSet, iAlignUp, iAlignDown2, size, videoEncoderInfo);
        addBySupportedSize(hashSet, iAlignUp, iAlignUp2, size, videoEncoderInfo);
        if (hashSet.isEmpty()) {
            Logger.w(TAG, "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        arrayList.toString();
        Logger.d(TAG, "candidatesList = ".concat(arrayList.toString()));
        Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VideoCapture.lambda$adjustCropRectToValidSize$4(rect, (Size) obj, (Size) obj2);
            }
        });
        arrayList.toString();
        Logger.d(TAG, "sorted candidatesList = ".concat(arrayList.toString()));
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            Logger.d(TAG, "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        Preconditions.checkState(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            rect2.left = Math.max(0, rect.centerX() - (width / 2));
            rect2.right = rect2.left + width;
            if (rect2.right > size.getWidth()) {
                rect2.right = size.getWidth();
                rect2.left = rect2.right - width;
            }
        }
        if (height != rect.height()) {
            rect2.top = Math.max(0, rect.centerY() - (height / 2));
            rect2.bottom = rect2.top + height;
            if (rect2.bottom > size.getHeight()) {
                rect2.bottom = size.getHeight();
                rect2.top = rect2.bottom - height;
            }
        }
        Logger.d(TAG, String.format("Adjust cropRect from %s to %s", TransformUtils.rectToString(rect), TransformUtils.rectToString(rect2)));
        return rect2;
    }

    private Rect adjustCropRectWithInProgressTransformation(Rect rect, int i2) {
        if (!shouldCompensateTransformation()) {
            return rect;
        }
        SurfaceRequest.TransformationInfo inProgressTransformationInfo = this.mStreamInfo.getInProgressTransformationInfo();
        Preconditions.checkNotNull(inProgressTransformationInfo);
        return TransformUtils.sizeToRect(TransformUtils.getRotatedSize(inProgressTransformationInfo.getCropRect(), i2));
    }

    private Size adjustResolutionWithInProgressTransformation(Size size, Rect rect, Rect rect2) {
        if (!shouldCompensateTransformation() || rect2.equals(rect)) {
            return size;
        }
        float fHeight = rect2.height() / rect.height();
        return new Size((int) Math.ceil(size.getWidth() * fHeight), (int) Math.ceil(size.getHeight() * fHeight));
    }

    private static int align(boolean z, int i2, int i3, Range<Integer> range) {
        int i4 = i2 % i3;
        if (i4 != 0) {
            i2 = z ? i2 - i4 : i2 + (i3 - i4);
        }
        return ((Integer) range.clamp(Integer.valueOf(i2))).intValue();
    }

    private static int alignDown(int i2, int i3, Range<Integer> range) {
        return align(true, i2, i3, range);
    }

    private static int alignUp(int i2, int i3, Range<Integer> range) {
        return align(false, i2, i3, range);
    }

    private Rect calculateCropRect(Size size, VideoEncoderInfo videoEncoderInfo) {
        Rect viewPortCropRect = getViewPortCropRect() != null ? getViewPortCropRect() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (videoEncoderInfo == null || videoEncoderInfo.isSizeSupportedAllowSwapping(viewPortCropRect.width(), viewPortCropRect.height())) ? viewPortCropRect : adjustCropRectToValidSize(viewPortCropRect, size, videoEncoderInfo);
    }

    private void clearPipeline() {
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
        SurfaceProcessorNode surfaceProcessorNode = this.mNode;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.mNode = null;
        }
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.mCameraEdge = null;
        }
        this.mCropRect = null;
        this.mSurfaceRequest = null;
        this.mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
        this.mRotationDegrees = 0;
        this.mHasCompensatingTransformation = false;
    }

    private SurfaceProcessorNode createNodeIfNeeded(CameraInternal cameraInternal, VideoCaptureConfig<T> videoCaptureConfig, int i2, Rect rect, Size size, DynamicRange dynamicRange, boolean z) {
        if (!isCreateNodeNeeded(cameraInternal, videoCaptureConfig, i2, rect, size, dynamicRange, z)) {
            return null;
        }
        Logger.d(TAG, "Surface processing is enabled.");
        return new SurfaceProcessorNode((CameraInternal) Objects.requireNonNull(getCamera()), getEffect() != null ? getEffect().createSurfaceProcessorInternal() : DefaultSurfaceProcessor.Factory.newInstance(dynamicRange), TAG);
    }

    private LinkedHashMap<Quality, List<Size>> createOrderedQualityToSizesMap(CameraInfoInternal cameraInfoInternal, MediaSpec mediaSpec, DynamicRange dynamicRange, VideoCapabilities videoCapabilities, EncoderProfilesResolver encoderProfilesResolver, int i2, Range<Integer> range, VideoEncoderInfo.Finder finder, List<Quality> list) {
        int aspectRatio = mediaSpec.getVideoSpec().getAspectRatio();
        Map<Quality, Size> qualityToResolutionMap = QualitySelector.getQualityToResolutionMap(videoCapabilities, dynamicRange);
        java.util.Objects.toString(qualityToResolutionMap);
        Logger.d(TAG, "supportedQualityToSizeMap = ".concat(qualityToResolutionMap.toString()));
        List<Size> supportedResolutions = getSupportedResolutions(cameraInfoInternal, i2, range);
        java.util.Objects.toString(supportedResolutions);
        Logger.d(TAG, "supportedResolutions = ".concat(String.valueOf(supportedResolutions)));
        QualityRatioToResolutionsTable qualityRatioToResolutionsTable = new QualityRatioToResolutionsTable(supportedResolutions, qualityToResolutionMap);
        qualityRatioToResolutionsTable.toString();
        Logger.d(TAG, "qualityRatioTable = ".concat(qualityRatioToResolutionsTable.toString()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Quality quality : list) {
            linkedHashMap.put(quality, qualityRatioToResolutionsTable.getResolutions(quality, aspectRatio));
        }
        linkedHashMap.toString();
        Logger.d(TAG, "orderedQualityToSizesMap = ".concat(linkedHashMap.toString()));
        return filterOutEncoderUnsupportedResolutions(finder, mediaSpec, dynamicRange, encoderProfilesResolver, linkedHashMap, qualityToResolutionMap);
    }

    private SessionConfig.Builder createPipeline(final VideoCaptureConfig<T> videoCaptureConfig, StreamSpec streamSpec) {
        final VideoCapture<T> videoCapture = this;
        Threads.checkMainThread();
        final CameraInternal camera = videoCapture.getCamera();
        Preconditions.checkNotNull(camera);
        Size resolution = streamSpec.getResolution();
        Runnable runnable = new Runnable() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyReset();
            }
        };
        Range<Integer> rangeResolveFrameRate = resolveFrameRate(streamSpec);
        int sessionType = streamSpec.getSessionType();
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        MediaInfo mediaInfo = (MediaInfo) Objects.requireNonNull(videoCapture.mResolvedMediaInfo);
        VideoEncoderInfo videoEncoderInfoResolveVideoEncoderInfo = resolveVideoEncoderInfo(videoCaptureConfig.getVideoEncoderInfoFinder(), mediaInfo.getVideoMimeInfo());
        videoCapture.mRotationDegrees = videoCapture.getCompensatedRotation(camera);
        Rect rectCalculateCropRect = videoCapture.calculateCropRect(resolution, videoEncoderInfoResolveVideoEncoderInfo);
        Rect rectAdjustCropRectWithInProgressTransformation = videoCapture.adjustCropRectWithInProgressTransformation(rectCalculateCropRect, videoCapture.mRotationDegrees);
        videoCapture.mCropRect = rectAdjustCropRectWithInProgressTransformation;
        Size sizeAdjustResolutionWithInProgressTransformation = videoCapture.adjustResolutionWithInProgressTransformation(resolution, rectCalculateCropRect, rectAdjustCropRectWithInProgressTransformation);
        boolean z = (videoCapture.mRotationDegrees == 0 || MediaConfigUtil.canWriteOrientationMetadata(mediaInfo.getContainerInfo().getOutputFormat())) ? false : true;
        if (videoCapture.shouldCompensateTransformation()) {
            videoCapture.mHasCompensatingTransformation = true;
        }
        Rect rect = videoCapture.mCropRect;
        Rect rectAdjustCropRectByQuirk = adjustCropRectByQuirk(rect, videoCapture.mRotationDegrees, videoCapture.isCreateNodeNeeded(camera, videoCaptureConfig, sessionType, rect, resolution, dynamicRange, z), videoEncoderInfoResolveVideoEncoderInfo);
        videoCapture.mCropRect = rectAdjustCropRectByQuirk;
        boolean z2 = z;
        videoCapture.mNode = videoCapture.createNodeIfNeeded(camera, videoCaptureConfig, sessionType, rectAdjustCropRectByQuirk, resolution, dynamicRange, z);
        final boolean z3 = (camera.getHasTransform() && videoCapture.mNode == null) ? false : true;
        final Timebase timebaseResolveTimebase = resolveTimebase(camera, videoCapture.mNode);
        Logger.d(TAG, "expectedFrameRate = " + rangeResolveFrameRate + ", originalCropRect = " + rectCalculateCropRect + ", mCropRect = " + videoCapture.mCropRect + ", nodeResolution = " + sizeAdjustResolutionWithInProgressTransformation + ", mRotationDegrees = " + videoCapture.mRotationDegrees + ", isBufferRotationRequired = " + z2 + ", mHasCompensatingTransformation = " + videoCapture.mHasCompensatingTransformation + ", camera timebase = " + camera.getCameraInfoInternal().getTimebase() + ", processing timebase = " + timebaseResolveTimebase);
        StreamSpec streamSpecBuild = streamSpec.toBuilder().setResolution(sizeAdjustResolutionWithInProgressTransformation).setExpectedFrameRateRange(rangeResolveFrameRate).build();
        Preconditions.checkState(videoCapture.mCameraEdge == null);
        SurfaceEdge surfaceEdge = new SurfaceEdge(2, 34, streamSpecBuild, videoCapture.getSensorToBufferTransformMatrix(), camera.getHasTransform(), videoCapture.mCropRect, videoCapture.mRotationDegrees, videoCapture.getAppTargetRotation(), videoCapture.shouldMirror(camera));
        videoCapture.mCameraEdge = surfaceEdge;
        surfaceEdge.addOnInvalidatedListener(runnable);
        SurfaceProcessorNode surfaceProcessorNode = videoCapture.mNode;
        SurfaceEdge surfaceEdge2 = videoCapture.mCameraEdge;
        if (surfaceProcessorNode != null) {
            OutConfig outConfigOf = OutConfig.of(surfaceEdge2);
            final SurfaceEdge surfaceEdge3 = (SurfaceEdge) Objects.requireNonNull(videoCapture.mNode.transform(SurfaceProcessorNode.In.of(videoCapture.mCameraEdge, Collections.singletonList(outConfigOf))).get(outConfigOf));
            videoCapture = this;
            surfaceEdge3.addOnInvalidatedListener(new Runnable() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1467lambda$createPipeline$1$androidxcameravideoVideoCapture(surfaceEdge3, camera, videoCaptureConfig, timebaseResolveTimebase, z3);
                }
            });
            videoCapture.mSurfaceRequest = surfaceEdge3.createSurfaceRequest(camera);
            final DeferrableSurface deferrableSurface = videoCapture.mCameraEdge.getDeferrableSurface();
            videoCapture.mDeferrableSurface = deferrableSurface;
            deferrableSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1468lambda$createPipeline$2$androidxcameravideoVideoCapture(deferrableSurface);
                }
            }, CameraXExecutors.mainThreadExecutor());
        } else {
            SurfaceRequest surfaceRequestCreateSurfaceRequest = surfaceEdge2.createSurfaceRequest(camera);
            videoCapture.mSurfaceRequest = surfaceRequestCreateSurfaceRequest;
            videoCapture.mDeferrableSurface = surfaceRequestCreateSurfaceRequest.getDeferrableSurface();
        }
        videoCaptureConfig.getVideoOutput().onSurfaceRequested(videoCapture.mSurfaceRequest, timebaseResolveTimebase, z3);
        videoCapture.sendTransformationInfoIfReady();
        videoCapture.mDeferrableSurface.setContainerClass(MediaCodec.class);
        SessionConfig.Builder builderCreateFrom = SessionConfig.Builder.createFrom(videoCaptureConfig, streamSpec.getResolution());
        builderCreateFrom.setSessionType(sessionType);
        videoCapture.applyExpectedFrameRateRange(builderCreateFrom, streamSpec);
        builderCreateFrom.setVideoStabilization(videoCaptureConfig.getVideoStabilizationMode());
        SessionConfig.CloseableErrorListener closeableErrorListener = videoCapture.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda5
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                this.f$0.m1469lambda$createPipeline$3$androidxcameravideoVideoCapture(sessionConfig, sessionError);
            }
        });
        videoCapture.mCloseableErrorListener = closeableErrorListener2;
        builderCreateFrom.setErrorListener(closeableErrorListener2);
        if (streamSpec.getImplementationOptions() != null) {
            builderCreateFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        return builderCreateFrom;
    }

    private static Map<Size, Integer> createSizeToMaxFrameRateMap(Map<Quality, List<Size>> map, EncoderProfilesResolver encoderProfilesResolver, DynamicRange dynamicRange) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Quality, List<Size>> entry : map.entrySet()) {
            int frameRate = ((VideoValidatedEncoderProfilesProxy) Objects.requireNonNull(encoderProfilesResolver.getProfiles(entry.getKey(), dynamicRange))).getDefaultVideoProfile().getFrameRate();
            Iterator<Size> it = entry.getValue().iterator();
            while (it.hasNext()) {
                map2.put(it.next(), Integer.valueOf(frameRate));
            }
        }
        return map2;
    }

    private static <T> T fetchObservableValue(Observable<T> observable, T t) {
        bm<T> bmVarFetchData = observable.fetchData();
        if (!bmVarFetchData.isDone()) {
            return t;
        }
        try {
            return bmVarFetchData.get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static LinkedHashMap<Quality, List<Size>> filterOutEncoderUnsupportedResolutions(VideoEncoderInfo.Finder finder, MediaSpec mediaSpec, DynamicRange dynamicRange, EncoderProfilesResolver encoderProfilesResolver, LinkedHashMap<Quality, List<Size>> linkedHashMap, Map<Quality, Size> map) {
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor;
        VideoEncoderInfo videoEncoderInfoFindLargestSupportedSizeVideoEncoderInfo;
        if (linkedHashMap.isEmpty()) {
            return new LinkedHashMap<>();
        }
        LinkedHashMap<Quality, List<Size>> linkedHashMap2 = new LinkedHashMap<>();
        for (Map.Entry<Quality, List<Size>> entry : linkedHashMap.entrySet()) {
            ArrayList arrayList = new ArrayList(entry.getValue());
            Iterator<Size> it = arrayList.iterator();
            while (it.hasNext()) {
                Size next = it.next();
                if (!map.containsValue(next) && (videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor = encoderProfilesResolver.findNearestHigherSupportedEncoderProfilesFor(next, dynamicRange)) != null && (videoEncoderInfoFindLargestSupportedSizeVideoEncoderInfo = findLargestSupportedSizeVideoEncoderInfo(finder, videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor, dynamicRange, mediaSpec)) != null && !videoEncoderInfoFindLargestSupportedSizeVideoEncoderInfo.isSizeSupportedAllowSwapping(next.getWidth(), next.getHeight())) {
                    it.remove();
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap2.put(entry.getKey(), arrayList);
            }
        }
        return linkedHashMap2;
    }

    private static VideoEncoderInfo findLargestSupportedSizeVideoEncoderInfo(VideoEncoderInfo.Finder finder, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, DynamicRange dynamicRange, MediaSpec mediaSpec) {
        VideoEncoderInfo videoEncoderInfoResolveVideoEncoderInfo;
        int area;
        if (dynamicRange.isFullySpecified()) {
            return resolveVideoEncoderInfo(finder, MediaConfigUtil.resolveMediaInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy).getVideoMimeInfo());
        }
        int i2 = Integer.MIN_VALUE;
        VideoEncoderInfo videoEncoderInfo = null;
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : videoValidatedEncoderProfilesProxy.getVideoProfiles()) {
            if (DynamicRangeUtil.isHdrSettingsMatched(videoProfileProxy, dynamicRange) && (videoEncoderInfoResolveVideoEncoderInfo = resolveVideoEncoderInfo(finder, MediaConfigUtil.resolveMediaInfo(mediaSpec, new DynamicRange(DynamicRangeUtil.videoProfileHdrFormatsToDynamicRangeEncoding(videoProfileProxy.getHdrFormat()), DynamicRangeUtil.videoProfileBitDepthToDynamicRangeBitDepth(videoProfileProxy.getBitDepth())), videoValidatedEncoderProfilesProxy).getVideoMimeInfo())) != null && (area = SizeUtil.getArea(((Integer) videoEncoderInfoResolveVideoEncoderInfo.getSupportedWidths().getUpper()).intValue(), ((Integer) videoEncoderInfoResolveVideoEncoderInfo.getSupportedHeights().getUpper()).intValue())) > i2) {
                videoEncoderInfo = videoEncoderInfoResolveVideoEncoderInfo;
                i2 = area;
            }
        }
        return videoEncoderInfo;
    }

    private static Quality findNearestSizeFor(Map<Quality, List<Size>> map, Size size) {
        int area = SizeUtil.getArea(size);
        int i2 = Integer.MAX_VALUE;
        Quality key = null;
        for (Map.Entry<Quality, List<Size>> entry : map.entrySet()) {
            Iterator<Size> it = entry.getValue().iterator();
            while (it.hasNext()) {
                int iAbs = Math.abs(SizeUtil.getArea(it.next()) - area);
                if (iAbs < i2) {
                    key = entry.getKey();
                    i2 = iAbs;
                }
            }
        }
        return key;
    }

    private int getCompensatedRotation(CameraInternal cameraInternal) {
        boolean zIsMirroringRequired = isMirroringRequired(cameraInternal);
        int relativeRotation = getRelativeRotation(cameraInternal, zIsMirroringRequired);
        if (!shouldCompensateTransformation()) {
            return relativeRotation;
        }
        SurfaceRequest.TransformationInfo transformationInfo = (SurfaceRequest.TransformationInfo) Objects.requireNonNull(this.mStreamInfo.getInProgressTransformationInfo());
        int rotationDegrees = transformationInfo.getRotationDegrees();
        if (zIsMirroringRequired != transformationInfo.isMirroring()) {
            rotationDegrees = -rotationDegrees;
        }
        return TransformUtils.within360(relativeRotation - rotationDegrees);
    }

    private EncoderProfilesResolver getEncoderProfilesResolver(CameraInfo cameraInfo, int i2) {
        return getOutput().getEncoderProfilesResolver(cameraInfo, i2);
    }

    private QualitySelector getFeatureGroupQualitySelector() {
        Set<GroupableFeature> featureGroup = getFeatureGroup();
        if (featureGroup == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (GroupableFeature groupableFeature : featureGroup) {
            if (groupableFeature instanceof RecordingQualityFeature) {
                arrayList.add(((RecordingQualityFeature) groupableFeature).getQuality());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return QualitySelector.fromOrderedList(arrayList);
    }

    private MediaSpec getMediaSpec() {
        return (MediaSpec) fetchObservableValue(getOutput().getMediaSpec(), null);
    }

    private MediaSpec getMediaSpecOrThrow() {
        MediaSpec mediaSpec = getMediaSpec();
        if (mediaSpec != null) {
            return mediaSpec;
        }
        throw new IllegalArgumentException("MediaSpec can't be null");
    }

    private QualitySelector getQualitySelector(MediaSpec mediaSpec) {
        QualitySelector featureGroupQualitySelector = getFeatureGroupQualitySelector();
        return featureGroupQualitySelector == null ? mediaSpec.getVideoSpec().getQualitySelector() : featureGroupQualitySelector;
    }

    private List<Quality> getSelectedQualityOrThrow(List<Quality> list, QualitySelector qualitySelector) {
        List<Quality> prioritizedQualities = qualitySelector.getPrioritizedQualities(list);
        Logger.d(TAG, "Found selectedQualities " + prioritizedQualities + " by " + qualitySelector);
        if (prioritizedQualities.isEmpty()) {
            throw new IllegalArgumentException("Unable to find selected quality");
        }
        return prioritizedQualities;
    }

    private int getSessionType(VideoCaptureConfig<T> videoCaptureConfig) {
        return videoCaptureConfig.getSessionType(0);
    }

    private List<Quality> getSupportedQualitiesOrThrow(DynamicRange dynamicRange, VideoCapabilities videoCapabilities, int i2) {
        List<Quality> supportedQualities = videoCapabilities.getSupportedQualities(dynamicRange);
        java.util.Objects.toString(supportedQualities);
        Logger.d(TAG, "supportedQualities = ".concat(String.valueOf(supportedQualities)));
        if (supportedQualities.isEmpty() && i2 == 1) {
            throw new IllegalArgumentException("No supported quality on the device for high-speed capture.");
        }
        return supportedQualities;
    }

    private List<Size> getSupportedResolutions(CameraInfoInternal cameraInfoInternal, int i2, Range<Integer> range) {
        return i2 == 1 ? StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(range) ? cameraInfoInternal.getSupportedHighSpeedResolutions() : cameraInfoInternal.getSupportedHighSpeedResolutionsFor(range) : cameraInfoInternal.getSupportedResolutions(getImageFormat());
    }

    private Range<Integer> getTargetFrameRate(VideoCaptureConfig<T> videoCaptureConfig) {
        return (Range) Objects.requireNonNull(videoCaptureConfig.getTargetFrameRate(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED));
    }

    private VideoCapabilities getVideoCapabilities(CameraInfo cameraInfo, int i2) {
        return getOutput().getMediaCapabilities(cameraInfo, i2);
    }

    private boolean isCreateNodeNeeded(CameraInternal cameraInternal, VideoCaptureConfig<?> videoCaptureConfig, int i2, Rect rect, Size size, DynamicRange dynamicRange, boolean z) {
        if (i2 == 1) {
            return false;
        }
        return getEffect() != null || z || shouldEnableSurfaceProcessingByConfig(cameraInternal, videoCaptureConfig) || shouldEnableSurfaceProcessingByQuirk(cameraInternal) || shouldEnableSurfaceProcessingBasedOnDynamicRangeByQuirk(cameraInternal, dynamicRange) || shouldCrop(rect, size) || shouldMirror(cameraInternal) || shouldCompensateTransformation();
    }

    static /* synthetic */ int lambda$adjustCropRectToValidSize$4(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    static /* synthetic */ void lambda$setupSurfaceUpdateNotifier$5(AtomicBoolean atomicBoolean, SessionConfig.Builder builder, CameraCaptureCallback cameraCaptureCallback) {
        Preconditions.checkState(Threads.isMainThread(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        builder.removeCameraCaptureCallback(cameraCaptureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAppEdgeInvalidated, reason: merged with bridge method [inline-methods] */
    public void m1467lambda$createPipeline$1$androidxcameravideoVideoCapture(SurfaceEdge surfaceEdge, CameraInternal cameraInternal, VideoCaptureConfig<T> videoCaptureConfig, Timebase timebase, boolean z) {
        if (cameraInternal == getCamera()) {
            this.mSurfaceRequest = surfaceEdge.createSurfaceRequest(cameraInternal);
            videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.mSurfaceRequest, timebase, z);
            sendTransformationInfoIfReady();
        }
    }

    private static Range<Integer> resolveFrameRate(StreamSpec streamSpec) {
        Range<Integer> expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
        return Objects.equals(expectedFrameRateRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) ? streamSpec.getSessionType() == 1 ? Defaults.DEFAULT_HIGH_SPEED_FPS_RANGE : Defaults.DEFAULT_FPS_RANGE : expectedFrameRateRange;
    }

    private MediaInfo resolveMediaInfo(StreamSpec streamSpec) {
        return MediaConfigUtil.resolveMediaInfo((MediaSpec) Objects.requireNonNull(getMediaSpec()), streamSpec.getDynamicRange(), getEncoderProfilesResolver(((CameraInternal) Objects.requireNonNull(getCamera())).getCameraInfo(), streamSpec.getSessionType()).findNearestHigherSupportedEncoderProfilesFor(streamSpec.getResolution(), streamSpec.getDynamicRange()));
    }

    private static Timebase resolveTimebase(CameraInternal cameraInternal, SurfaceProcessorNode surfaceProcessorNode) {
        return (surfaceProcessorNode == null && cameraInternal.getHasTransform()) ? Timebase.UPTIME : cameraInternal.getCameraInfoInternal().getTimebase();
    }

    private static VideoEncoderInfo resolveVideoEncoderInfo(VideoEncoderInfo.Finder finder, VideoMimeInfo videoMimeInfo) {
        VideoEncoderInfo videoEncoderInfoFind = finder.find(videoMimeInfo.getMimeType());
        if (videoEncoderInfoFind == null) {
            Logger.w(TAG, "Can't find videoEncoderInfo");
        }
        return videoEncoderInfoFind;
    }

    private void sendTransformationInfoIfReady() {
        CameraInternal camera = getCamera();
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (camera == null || surfaceEdge == null) {
            return;
        }
        int compensatedRotation = getCompensatedRotation(camera);
        this.mRotationDegrees = compensatedRotation;
        surfaceEdge.updateTransformation(compensatedRotation, getAppTargetRotation());
    }

    private void setCustomOrderedResolutions(UseCaseConfig.Builder<?, ?, ?> builder, LinkedHashMap<Quality, List<Size>> linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        arrayList.toString();
        Logger.d(TAG, "Set custom ordered resolutions = ".concat(arrayList.toString()));
        builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, arrayList);
        this.mQualityToCustomSizesMap = linkedHashMap;
    }

    private void setupSurfaceUpdateNotifier(final SessionConfig.Builder builder, final boolean z) {
        bm<Void> bmVar = this.mSurfaceUpdateFuture;
        if (bmVar != null && bmVar.cancel(false)) {
            Logger.d(TAG, "A newer surface update is requested. Previous surface update cancelled.");
        }
        final bm<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda8
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m1470xc7537f7(builder, completer);
            }
        });
        this.mSurfaceUpdateFuture = future;
        Futures.addCallback(future, new FutureCallback<Void>() { // from class: androidx.camera.video.VideoCapture.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (th instanceof CancellationException) {
                    return;
                }
                Logger.e(VideoCapture.TAG, "Surface update completed with unexpected exception", th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r3) {
                VideoCapture videoCapture = VideoCapture.this;
                if (future != videoCapture.mSurfaceUpdateFuture || videoCapture.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                VideoCapture.this.setSourceState(z ? VideoOutput.SourceState.ACTIVE_STREAMING : VideoOutput.SourceState.ACTIVE_NON_STREAMING);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    private boolean shouldCompensateTransformation() {
        return this.mStreamInfo.getInProgressTransformationInfo() != null;
    }

    private static boolean shouldCrop(Rect rect, Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    private static boolean shouldEnableSurfaceProcessingBasedOnDynamicRangeByQuirk(CameraInternal cameraInternal, DynamicRange dynamicRange) {
        HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) DeviceQuirks.get(HdrRepeatingRequestFailureQuirk.class);
        return cameraInternal.getHasTransform() && hdrRepeatingRequestFailureQuirk != null && hdrRepeatingRequestFailureQuirk.workaroundBySurfaceProcessing(dynamicRange);
    }

    private static <T extends VideoOutput> boolean shouldEnableSurfaceProcessingByConfig(CameraInternal cameraInternal, VideoCaptureConfig<T> videoCaptureConfig) {
        return cameraInternal.getHasTransform() && videoCaptureConfig.isSurfaceProcessingForceEnabled();
    }

    private static boolean shouldEnableSurfaceProcessingByQuirk(CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform()) {
            return SurfaceProcessingQuirk.CC.workaroundBySurfaceProcessing(DeviceQuirks.getAll()) || SurfaceProcessingQuirk.CC.workaroundBySurfaceProcessing(cameraInternal.getCameraInfoInternal().getCameraQuirks());
        }
        return false;
    }

    private boolean shouldMirror(CameraInternal cameraInternal) {
        return cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal);
    }

    private void updateCustomOrderedResolutionsByQuality(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        MediaSpec mediaSpecOrThrow = getMediaSpecOrThrow();
        QualitySelector qualitySelector = getQualitySelector(mediaSpecOrThrow);
        VideoCaptureConfig<T> videoCaptureConfig = (VideoCaptureConfig) builder.getUseCaseConfig();
        if (videoCaptureConfig.containsOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS)) {
            Preconditions.checkArgument(getOutput().isQualitySelectorDefault(), "Custom ordered resolutions and QualitySelector can't both be set");
            Preconditions.checkArgument(getFeatureGroupQualitySelector() == null, "Can't set both custom ordered resolutions and QualitySelector  through a groupable feature (e.g. GroupableFeatures.UHD_RECORDING)");
            return;
        }
        DynamicRange dynamicRange = videoCaptureConfig.getDynamicRange();
        int sessionType = getSessionType(videoCaptureConfig);
        Range<Integer> targetFrameRate = getTargetFrameRate(videoCaptureConfig);
        VideoCapabilities videoCapabilities = getVideoCapabilities(cameraInfoInternal, sessionType);
        EncoderProfilesResolver encoderProfilesResolver = getEncoderProfilesResolver(cameraInfoInternal, sessionType);
        Logger.d(TAG, "Update custom order resolutions: requestedDynamicRange = " + dynamicRange + ", sessionType = " + sessionType + ", targetFrameRate = " + targetFrameRate);
        List<Quality> supportedQualitiesOrThrow = getSupportedQualitiesOrThrow(dynamicRange, videoCapabilities, sessionType);
        if (supportedQualitiesOrThrow.isEmpty()) {
            Logger.w(TAG, "Can't find any supported quality on the device.");
            return;
        }
        LinkedHashMap<Quality, List<Size>> linkedHashMapCreateOrderedQualityToSizesMap = createOrderedQualityToSizesMap(cameraInfoInternal, mediaSpecOrThrow, dynamicRange, videoCapabilities, encoderProfilesResolver, sessionType, targetFrameRate, videoCaptureConfig.getVideoEncoderInfoFinder(), getSelectedQualityOrThrow(supportedQualitiesOrThrow, qualitySelector));
        if (sessionType == 1) {
            builder.getMutableConfig().insertOption(UseCaseConfig.OPTION_RESOLUTION_TO_MAX_FRAME_RATES, createSizeToMaxFrameRateMap(linkedHashMapCreateOrderedQualityToSizesMap, encoderProfilesResolver, dynamicRange));
        }
        setCustomOrderedResolutions(builder, linkedHashMapCreateOrderedQualityToSizesMap);
    }

    public static <T extends VideoOutput> VideoCapture<T> withOutput(T t) {
        Preconditions.checkNotNull(t);
        return new Builder(t).build();
    }

    void applyStreamInfoAndStreamSpecToSessionConfigBuilder(SessionConfig.Builder builder, StreamInfo streamInfo, StreamSpec streamSpec) {
        DeferrableSurface deferrableSurface;
        int id = streamInfo.getId();
        boolean z = streamInfo.getStreamState() == StreamInfo.StreamState.ACTIVE;
        boolean z2 = id == -1;
        if (z2 && z) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        builder.clearSurfaces();
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        if (!z2 && (deferrableSurface = this.mDeferrableSurface) != null) {
            if (z) {
                builder.addSurface(deferrableSurface, dynamicRange, null, -1);
            } else {
                builder.addNonRepeatingSurface(deferrableSurface, dynamicRange);
            }
        }
        setupSurfaceUpdateNotifier(builder, z);
    }

    SurfaceEdge getCameraEdge() {
        return this.mCameraEdge;
    }

    Rect getCropRect() {
        return this.mCropRect;
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

    public DynamicRange getDynamicRange() {
        return getCurrentConfig().hasDynamicRange() ? getCurrentConfig().getDynamicRange() : Defaults.DEFAULT_DYNAMIC_RANGE;
    }

    public int getMirrorMode() {
        int mirrorModeInternal = getMirrorModeInternal();
        if (mirrorModeInternal == -1) {
            return 0;
        }
        return mirrorModeInternal;
    }

    SurfaceProcessorNode getNode() {
        return this.mNode;
    }

    public T getOutput() {
        return (T) ((VideoCaptureConfig) getCurrentConfig()).getVideoOutput();
    }

    public ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    @Override // androidx.camera.core.UseCase
    protected ResolutionInfo getResolutionInfoInternal() {
        CameraInternal camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        Rect rect = this.mCropRect;
        int i2 = this.mRotationDegrees;
        if (camera == null || attachedSurfaceResolution == null || rect == null) {
            return null;
        }
        return new ResolutionInfo(attachedSurfaceResolution, rect, i2);
    }

    int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    public Quality getSelectedQuality() {
        StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        if (attachedStreamSpec == null) {
            return null;
        }
        Size originalConfiguredResolution = attachedStreamSpec.getOriginalConfiguredResolution();
        for (Map.Entry<Quality, List<Size>> entry : this.mQualityToCustomSizesMap.entrySet()) {
            if (entry.getValue().contains(originalConfiguredResolution)) {
                return entry.getKey();
            }
        }
        java.util.Objects.toString(originalConfiguredResolution);
        Logger.w(TAG, "Can't find matched Quality for ".concat(String.valueOf(originalConfiguredResolution)));
        return findNearestSizeFor(this.mQualityToCustomSizesMap, originalConfiguredResolution);
    }

    @Override // androidx.camera.core.UseCase
    public Set<DynamicRange> getSupportedDynamicRanges(CameraInfoInternal cameraInfoInternal) {
        return getVideoCapabilities(cameraInfoInternal, 0).getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.UseCase
    public Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    SurfaceRequest getSurfaceRequest() {
        return (SurfaceRequest) Objects.requireNonNull(this.mSurfaceRequest);
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

    boolean isStreamIdChanged(int i2, int i3) {
        return (StreamInfo.NON_SURFACE_STREAM_ID.contains(Integer.valueOf(i2)) || StreamInfo.NON_SURFACE_STREAM_ID.contains(Integer.valueOf(i3)) || i2 == i3) ? false : true;
    }

    public boolean isVideoStabilizationEnabled() {
        return getCurrentConfig().getVideoStabilizationMode() == 2;
    }

    /* renamed from: lambda$createPipeline$2$androidx-camera-video-VideoCapture, reason: not valid java name */
    /* synthetic */ void m1468lambda$createPipeline$2$androidxcameravideoVideoCapture(DeferrableSurface deferrableSurface) {
        if (deferrableSurface == this.mDeferrableSurface) {
            clearPipeline();
        }
    }

    /* renamed from: lambda$createPipeline$3$androidx-camera-video-VideoCapture, reason: not valid java name */
    /* synthetic */ void m1469lambda$createPipeline$3$androidxcameravideoVideoCapture(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        resetPipeline();
    }

    /* renamed from: lambda$setupSurfaceUpdateNotifier$6$androidx-camera-video-VideoCapture, reason: not valid java name */
    /* synthetic */ Object m1470xc7537f7(final SessionConfig.Builder builder, CallbackToFutureAdapter.Completer completer) {
        builder.addTag(SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AnonymousClass2 anonymousClass2 = new AnonymousClass2(atomicBoolean, completer, builder);
        completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapture.lambda$setupSurfaceUpdateNotifier$5(atomicBoolean, builder, anonymousClass2);
            }
        }, CameraXExecutors.directExecutor());
        builder.addRepeatingCameraCaptureCallback(anonymousClass2);
        return String.format("%s[0x%x]", SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode()));
    }

    @Override // androidx.camera.core.UseCase
    protected UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        getOutput().onValidateConfig();
        updateCustomOrderedResolutionsByQuality(cameraInfoInternal, builder);
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    protected void onProviderRotationChanged(int i2) {
        setTargetRotation(i2);
    }

    @Override // androidx.camera.core.UseCase
    public void onSessionStart() {
        super.onSessionStart();
        Logger.d(TAG, "VideoCapture#onSessionStart: cameraID = ".concat(String.valueOf(getCameraId())));
        if (getAttachedStreamSpec() == null || this.mSurfaceRequest != null) {
            return;
        }
        StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        Preconditions.checkNotNull(attachedStreamSpec);
        this.mStreamInfo = (StreamInfo) fetchObservableValue(getOutput().getStreamInfo(), StreamInfo.STREAM_INFO_ANY_INACTIVE);
        SessionConfig.Builder builderCreatePipeline = createPipeline((VideoCaptureConfig) getCurrentConfig(), attachedStreamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        applyStreamInfoAndStreamSpecToSessionConfigBuilder(builderCreatePipeline, this.mStreamInfo, attachedStreamSpec);
        updateSessionConfig(VideoCapture$$ExternalSyntheticBackport1.m(new Object[]{this.mSessionConfigBuilder.build()}));
        notifyActive();
        getOutput().getStreamInfo().addObserver(CameraXExecutors.mainThreadExecutor(), this.mStreamInfoObserver);
        SourceStreamRequirementObserver sourceStreamRequirementObserver = this.mSourceStreamRequirementObserver;
        if (sourceStreamRequirementObserver != null) {
            sourceStreamRequirementObserver.close();
        }
        this.mSourceStreamRequirementObserver = new SourceStreamRequirementObserver(getCameraControl());
        getOutput().isSourceStreamRequired().addObserver(CameraXExecutors.mainThreadExecutor(), this.mSourceStreamRequirementObserver);
        setSourceState(VideoOutput.SourceState.ACTIVE_NON_STREAMING);
    }

    @Override // androidx.camera.core.UseCase
    public void onSessionStop() {
        Logger.d(TAG, "VideoCapture#onSessionStop");
        Preconditions.checkState(Threads.isMainThread(), "VideoCapture can only be detached on the main thread.");
        if (this.mSourceStreamRequirementObserver != null) {
            getOutput().isSourceStreamRequired().removeObserver(this.mSourceStreamRequirementObserver);
            this.mSourceStreamRequirementObserver.close();
            this.mSourceStreamRequirementObserver = null;
        }
        setSourceState(VideoOutput.SourceState.INACTIVE);
        getOutput().getStreamInfo().removeObserver(this.mStreamInfoObserver);
        bm<Void> bmVar = this.mSurfaceUpdateFuture;
        if (bmVar != null && bmVar.cancel(false)) {
            Logger.d(TAG, "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        clearPipeline();
    }

    @Override // androidx.camera.core.UseCase
    protected StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        updateSessionConfig(VideoCapture$$ExternalSyntheticBackport1.m(new Object[]{this.mSessionConfigBuilder.build()}));
        return ((StreamSpec) Objects.requireNonNull(getAttachedStreamSpec())).toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    protected StreamSpec onSuggestedStreamSpecUpdated(StreamSpec streamSpec, StreamSpec streamSpec2) {
        Logger.d(TAG, "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + streamSpec + ", secondaryStreamSpec " + streamSpec2);
        this.mResolvedMediaInfo = resolveMediaInfo(streamSpec);
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        this.mResolvedMediaInfo = null;
    }

    void resetPipeline() {
        if (getCamera() == null) {
            return;
        }
        clearPipeline();
        VideoCaptureConfig<T> videoCaptureConfig = (VideoCaptureConfig) getCurrentConfig();
        StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        Preconditions.checkNotNull(attachedStreamSpec);
        SessionConfig.Builder builderCreatePipeline = createPipeline(videoCaptureConfig, attachedStreamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        applyStreamInfoAndStreamSpecToSessionConfigBuilder(builderCreatePipeline, this.mStreamInfo, getAttachedStreamSpec());
        updateSessionConfig(VideoCapture$$ExternalSyntheticBackport1.m(new Object[]{this.mSessionConfigBuilder.build()}));
        notifyReset();
    }

    void setSourceState(VideoOutput.SourceState sourceState) {
        if (sourceState != this.mSourceState) {
            this.mSourceState = sourceState;
            getOutput().onSourceStateChanged(sourceState);
        }
    }

    public void setTargetRotation(int i2) {
        if (setTargetRotationInternal(i2)) {
            sendTransformationInfoIfReady();
        }
    }

    @Override // androidx.camera.core.UseCase
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        sendTransformationInfoIfReady();
    }

    boolean shouldResetCompensatingTransformation(StreamInfo streamInfo, StreamInfo streamInfo2) {
        return this.mHasCompensatingTransformation && streamInfo.getInProgressTransformationInfo() != null && streamInfo2.getInProgressTransformationInfo() == null;
    }

    public String toString() {
        return "VideoCapture:".concat(String.valueOf(getName()));
    }

    /* compiled from: WazeSource */
    public final class Defaults implements ConfigProvider<VideoCaptureConfig<?>> {
        private static final VideoCaptureConfig<?> DEFAULT_CONFIG;
        static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        static final Range<Integer> DEFAULT_FPS_RANGE;
        static final Range<Integer> DEFAULT_HIGH_SPEED_FPS_RANGE;
        private static final StreamUseCase DEFAULT_STREAM_USE_CASE;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 5;
        private static final VideoEncoderInfo.Finder DEFAULT_VIDEO_ENCODER_INFO_FINDER;
        private static final VideoOutput DEFAULT_VIDEO_OUTPUT;

        static {
            StreamUseCase streamUseCase = StreamUseCase.VIDEO_RECORD;
            DEFAULT_STREAM_USE_CASE = streamUseCase;
            VideoOutput videoOutput = new VideoOutput() { // from class: androidx.camera.video.VideoCapture$Defaults$$ExternalSyntheticLambda0
                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ EncoderProfilesResolver getEncoderProfilesResolver(CameraInfo cameraInfo, int i2) {
                    return EncoderProfilesResolver.EMPTY;
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo, int i2) {
                    return VideoCapabilities.EMPTY;
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ Observable getMediaSpec() {
                    return ConstantObservable.withValue(null);
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ Observable getStreamInfo() {
                    return StreamInfo.ALWAYS_ACTIVE_OBSERVABLE;
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ boolean isQualitySelectorDefault() {
                    return true;
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ Observable isSourceStreamRequired() {
                    return ConstantObservable.withValue(false);
                }

                @Override // androidx.camera.video.VideoOutput
                public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                    surfaceRequest.willNotProvideSurface();
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
                    onSurfaceRequested(surfaceRequest);
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ void onValidateConfig() {
                }

                @Override // androidx.camera.video.VideoOutput
                public /* synthetic */ void onSourceStateChanged(VideoOutput.SourceState sourceState) {
                }
            };
            DEFAULT_VIDEO_OUTPUT = videoOutput;
            VideoEncoderInfo.Finder finder = VideoEncoderInfoImpl.FINDER;
            DEFAULT_VIDEO_ENCODER_INFO_FINDER = finder;
            DEFAULT_FPS_RANGE = new Range<>(30, 30);
            DEFAULT_HIGH_SPEED_FPS_RANGE = new Range<>(120, 120);
            DynamicRange dynamicRange = DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            Builder builder = new Builder(videoOutput);
            builder.setSurfaceOccupancyPriority(5);
            builder.setStreamUseCase(streamUseCase);
            builder.setVideoEncoderInfoFinder(finder);
            builder.setDynamicRange(dynamicRange);
            DEFAULT_CONFIG = builder.getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public VideoCaptureConfig<?> getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    /* compiled from: WazeSource */
    public final class Builder<T extends VideoOutput> implements UseCaseConfig.Builder<VideoCapture<T>, VideoCaptureConfig<T>, Builder<T>>, ImageOutputConfig.Builder<Builder<T>>, ImageInputConfig.Builder<Builder<T>>, ThreadConfig.Builder<Builder<T>> {
        private final MutableOptionsBundle mMutableConfig;

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            if (!mutableOptionsBundle.containsOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(VideoCapture.class)) {
                setCaptureType(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
                setTargetClass((Class) VideoCapture.class);
            } else {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
        }

        private static <T extends VideoOutput> MutableOptionsBundle createInitialBundle(T t) {
            MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
            mutableOptionsBundleCreate.insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, t);
            mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_IS_VIDEO_QUALITY_SELECTOR_DEFAULT, Boolean.valueOf(t.isQualitySelectorDefault()));
            return mutableOptionsBundleCreate;
        }

        static Builder<? extends VideoOutput> fromConfig(Config config) {
            return new Builder<>(MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public VideoCapture<T> build() {
            return new VideoCapture<>(getUseCaseConfig());
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public VideoCaptureConfig<T> getUseCaseConfig() {
            return new VideoCaptureConfig<>(OptionsBundle.from(this.mMutableConfig));
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public Builder<T> setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setCustomOrderedResolutions(List<Size> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public Builder<T> setDynamicRange(DynamicRange dynamicRange) {
            getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setHighResolutionDisabled(boolean z) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setMirrorMode(int i2) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MIRROR_MODE, Integer.valueOf(i2));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setResolutionSelector(ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setStreamUseCase(StreamUseCase streamUseCase) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setSurfaceOccupancyPriority(int i2) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i2));
            return this;
        }

        public Builder<T> setSurfaceProcessingForceEnabled() {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_FORCE_ENABLE_SURFACE_PROCESSING, true);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setTargetAspectRatio(int i2) {
            throw new UnsupportedOperationException("setTargetAspectRatio is not supported.");
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder<T> setTargetClass(Class<VideoCapture<T>> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public Builder<T> setTargetFrameRate(Range<Integer> range) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder<T> setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setTargetResolution(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder<T> setTargetRotation(int i2) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i2));
            return this;
        }

        Builder<T> setVideoEncoderInfoFinder(VideoEncoderInfo.Finder finder) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER, finder);
            return this;
        }

        public Builder<T> setVideoOutput(VideoOutput videoOutput) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, videoOutput);
            return this;
        }

        public Builder<T> setVideoStabilizationEnabled(boolean z) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, Integer.valueOf(true == z ? 2 : 1));
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder<T> setZslDisabled(boolean z) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z));
            return this;
        }

        public static <T extends VideoOutput> Builder<T> fromConfig(VideoCaptureConfig<T> videoCaptureConfig) {
            return new Builder<>(MutableOptionsBundle.from((Config) videoCaptureConfig));
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        public /* bridge */ /* synthetic */ Object setBackgroundExecutor(Executor executor) {
            setBackgroundExecutor(executor);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Object setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            setCaptureOptionUnpacker(optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Object setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            setCaptureType(captureType);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Object setCustomOrderedResolutions(List list) {
            setCustomOrderedResolutions((List<Size>) list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Object setDefaultCaptureConfig(CaptureConfig captureConfig) {
            setDefaultCaptureConfig(captureConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Object setDefaultResolution(Size size) {
            setDefaultResolution(size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Object setDefaultSessionConfig(SessionConfig sessionConfig) {
            setDefaultSessionConfig(sessionConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public /* bridge */ /* synthetic */ Object setDynamicRange(DynamicRange dynamicRange) {
            setDynamicRange(dynamicRange);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Object setMaxResolution(Size size) {
            setMaxResolution(size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Object setResolutionSelector(ResolutionSelector resolutionSelector) {
            setResolutionSelector(resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Object setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            setSessionOptionUnpacker(optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Object setStreamUseCase(StreamUseCase streamUseCase) {
            setStreamUseCase(streamUseCase);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Object setSupportedResolutions(List list) {
            setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ Object setTargetName(String str) {
            setTargetName(str);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Object setHighResolutionDisabled(boolean z) {
            setHighResolutionDisabled(z);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Object setMirrorMode(int i2) {
            setMirrorMode(i2);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Object setSurfaceOccupancyPriority(int i2) {
            setSurfaceOccupancyPriority(i2);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Object setTargetRotation(int i2) {
            setTargetRotation(i2);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public /* bridge */ /* synthetic */ Object setZslDisabled(boolean z) {
            setZslDisabled(z);
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            setTargetClass(cls);
            return this;
        }

        public Builder(T t) {
            this(createInitialBundle(t));
        }
    }

    public Range<Integer> getTargetFrameRate() {
        return getTargetFrameRateInternal();
    }
}
