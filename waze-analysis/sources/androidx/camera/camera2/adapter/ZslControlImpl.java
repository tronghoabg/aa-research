package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.SizesKt;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.camera.core.internal.utils.ZslRingBuffer;
import h.a.c;
import h.f;
import h.g;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class ZslControlImpl implements ZslControl {
    public static final Companion Companion = new Companion(null);
    private static final int FORMAT = 34;
    public static final int MAX_IMAGES = 9;
    public static final int RING_BUFFER_CAPACITY = 3;
    private final CameraMetadata cameraMetadata;
    private final CameraProperties cameraProperties;
    private boolean isZslDisabledByFlashMode;
    private boolean isZslDisabledByQuirks;
    private boolean isZslDisabledByUseCaseConfig;
    private CameraCaptureCallback metadataMatchingCaptureCallback;
    private DeferrableSurface reprocessingImageDeferrableSurface;
    private SafeCloseImageReaderProxy reprocessingImageReader;
    private final f streamConfigurationMap$delegate;
    private final ZslRingBuffer zslRingBuffer;

    public ZslControlImpl(CameraProperties cameraProperties) {
        x.f(cameraProperties, "cameraProperties");
        this.cameraProperties = cameraProperties;
        this.cameraMetadata = cameraProperties.getMetadata();
        this.streamConfigurationMap$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ZslControlImpl.streamConfigurationMap_delegate$lambda$0(this.f$0);
            }
        });
        this.zslRingBuffer = new ZslRingBuffer(3, new RingBuffer.OnRemoveCallback() { // from class: androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
            public final void onRemove(Object obj) {
                ZslControlImpl.zslRingBuffer$lambda$0((ImageProxy) obj);
            }
        });
        this.isZslDisabledByQuirks = DeviceQuirks.INSTANCE.get(ZslDisablerQuirk.class) != null;
    }

    static final void addZslConfig$lambda$5(ZslControlImpl zslControlImpl, ImageReaderProxy imageReaderProxy) {
        x.f(imageReaderProxy, "reader");
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                zslControlImpl.zslRingBuffer.enqueue(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException unused) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isErrorEnabled(Log.TAG)) {
                android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Failed to acquire latest image");
            }
        }
    }

    private final void clearRingBuffer() {
        while (true) {
            ZslRingBuffer zslRingBuffer = this.zslRingBuffer;
            if (zslRingBuffer.isEmpty()) {
                return;
            } else {
                zslRingBuffer.dequeue().close();
            }
        }
    }

    private final StreamConfigurationMap getStreamConfigurationMap() {
        return (StreamConfigurationMap) this.streamConfigurationMap$delegate.getValue();
    }

    private final void reset() {
        DeferrableSurface deferrableSurface = this.reprocessingImageDeferrableSurface;
        if (deferrableSurface != null) {
            final SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.reprocessingImageReader;
            if (safeCloseImageReaderProxy != null) {
                deferrableSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        safeCloseImageReaderProxy.safeClose();
                    }
                }, CameraXExecutors.mainThreadExecutor());
                safeCloseImageReaderProxy.clearOnImageAvailableListener();
                this.reprocessingImageReader = null;
            }
            deferrableSurface.close();
            this.reprocessingImageDeferrableSurface = null;
        }
        clearRingBuffer();
    }

    static final StreamConfigurationMap streamConfigurationMap_delegate$lambda$0(ZslControlImpl zslControlImpl) {
        CameraMetadata cameraMetadata = zslControlImpl.cameraMetadata;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        x.e(key, "SCALER_STREAM_CONFIGURATION_MAP");
        Object obj = cameraMetadata.get((CameraCharacteristics.Key<Object>) key);
        if (obj != null) {
            return (StreamConfigurationMap) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    static final void zslRingBuffer$lambda$0(ImageProxy imageProxy) {
        x.f(imageProxy, "imageProxy");
        imageProxy.close();
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public void addZslConfig(SessionConfig.Builder builder) {
        x.f(builder, "sessionConfigBuilder");
        reset();
        if (this.isZslDisabledByUseCaseConfig) {
            builder.setTemplateType(1);
            return;
        }
        if (this.isZslDisabledByQuirks) {
            builder.setTemplateType(1);
            return;
        }
        if (!CameraMetadata.Companion.getSupportsPrivateReprocessing(this.cameraMetadata)) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isInfoEnabled(Log.TAG)) {
                android.util.Log.i(Camera2Logger.TRUNCATED_TAG, "ZslControlImpl: Private reprocessing isn't supported");
            }
            builder.setTemplateType(1);
            return;
        }
        Size[] inputSizes = getStreamConfigurationMap().getInputSizes(34);
        x.e(inputSizes, "getInputSizes(...)");
        Iterator it = c.X(inputSizes).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            x.c(size);
            int iArea = SizesKt.area(size);
            while (true) {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                x.c(size2);
                int iArea2 = SizesKt.area(size2);
                int i2 = iArea < iArea2 ? iArea2 : iArea;
                if (iArea < iArea2) {
                    next = next2;
                }
                if (!it.hasNext()) {
                    break;
                } else {
                    iArea = i2;
                }
            }
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled(Log.TAG)) {
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "ZslControlImpl: Unable to find a supported size for ZSL");
                return;
            }
            return;
        }
        Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            Objects.toString(size3);
            android.util.Log.d(str, "ZslControlImpl: Selected ZSL size: ".concat(size3.toString()));
        }
        int[] validOutputFormatsForInput = getStreamConfigurationMap().getValidOutputFormatsForInput(34);
        x.e(validOutputFormatsForInput, "getValidOutputFormatsForInput(...)");
        if (!c.ah(validOutputFormatsForInput, 256)) {
            if (Logger.isWarnEnabled(Log.TAG)) {
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "ZslControlImpl: JPEG isn't valid output for ZSL format");
                return;
            }
            return;
        }
        MetadataImageReader metadataImageReader = new MetadataImageReader(size3.getWidth(), size3.getHeight(), 34, 9);
        CameraCaptureCallback cameraCaptureCallback = metadataImageReader.getCameraCaptureCallback();
        x.e(cameraCaptureCallback, "getCameraCaptureCallback(...)");
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(metadataImageReader);
        metadataImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda2
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                ZslControlImpl.addZslConfig$lambda$5(this.f$0, imageReaderProxy);
            }
        }, CameraXExecutors.ioExecutor());
        Surface surface = safeCloseImageReaderProxy.getSurface();
        if (surface == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(surface, new Size(safeCloseImageReaderProxy.getWidth(), safeCloseImageReaderProxy.getHeight()), 34);
        immediateSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                safeCloseImageReaderProxy.safeClose();
            }
        }, CameraXExecutors.mainThreadExecutor());
        ImmediateSurface immediateSurface2 = immediateSurface;
        builder.addSurface(immediateSurface2);
        builder.addCameraCaptureCallback(cameraCaptureCallback);
        builder.setInputConfiguration(new InputConfiguration(safeCloseImageReaderProxy.getWidth(), safeCloseImageReaderProxy.getHeight(), safeCloseImageReaderProxy.getImageFormat()));
        this.metadataMatchingCaptureCallback = cameraCaptureCallback;
        this.reprocessingImageReader = safeCloseImageReaderProxy;
        this.reprocessingImageDeferrableSurface = immediateSurface2;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public void clearZslConfig() {
        reset();
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public ImageProxy dequeueImageFromBuffer() {
        try {
            return this.zslRingBuffer.dequeue();
        } catch (NoSuchElementException unused) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (!Logger.isWarnEnabled(Log.TAG)) {
                return null;
            }
            android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "ZslControlImpl#dequeueImageFromBuffer: No such element");
            return null;
        }
    }

    public final SafeCloseImageReaderProxy getReprocessingImageReader$camera_camera2() {
        return this.reprocessingImageReader;
    }

    public final ZslRingBuffer getZslRingBuffer$camera_camera2() {
        return this.zslRingBuffer;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public boolean isZslDisabledByFlashMode() {
        return this.isZslDisabledByFlashMode;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public boolean isZslDisabledByUserCaseConfig() {
        return this.isZslDisabledByUseCaseConfig;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public boolean isZslSurface(DeferrableSurface deferrableSurface, SessionConfig sessionConfig) {
        x.f(deferrableSurface, "surface");
        x.f(sessionConfig, "sessionConfig");
        InputConfiguration inputConfiguration = sessionConfig.getInputConfiguration();
        return inputConfiguration != null && deferrableSurface.getPrescribedStreamFormat() == inputConfiguration.getFormat() && deferrableSurface.getPrescribedSize().getWidth() == inputConfiguration.getWidth() && deferrableSurface.getPrescribedSize().getHeight() == inputConfiguration.getHeight();
    }

    public final void setReprocessingImageReader$camera_camera2(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        this.reprocessingImageReader = safeCloseImageReaderProxy;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public void setZslDisabledByFlashMode(boolean z) {
        this.isZslDisabledByFlashMode = z;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public void setZslDisabledByUserCaseConfig(boolean z) {
        if (this.isZslDisabledByUseCaseConfig != z && z) {
            clearRingBuffer();
        }
        this.isZslDisabledByUseCaseConfig = z;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getMAX_IMAGES$camera_camera2$annotations() {
        }

        public static /* synthetic */ void getRING_BUFFER_CAPACITY$camera_camera2$annotations() {
        }
    }

    public static /* synthetic */ void getReprocessingImageReader$camera_camera2$annotations() {
    }

    public static /* synthetic */ void getZslRingBuffer$camera_camera2$annotations() {
    }
}
