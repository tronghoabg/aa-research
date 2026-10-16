package androidx.camera.camera2.pipe.media;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.ImageSourceConfig;
import androidx.camera.camera2.pipe.MemoryEstimator;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.PlatformApiCompat;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import h.a.i;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageReaderImageSources implements ImageSources {
    private final f maxImageReaderCapacity$delegate;
    private final MemoryEstimator memoryEstimator;
    private final PlatformApiCompat platformApiCompat;
    private final Threads threads;

    public ImageReaderImageSources(Threads threads, CameraPipe.Config config, final CameraMetadata cameraMetadata, MemoryEstimator memoryEstimator) {
        x.f(threads, "threads");
        x.f(config, "cameraPipeConfig");
        x.f(cameraMetadata, "cameraMetadata");
        x.f(memoryEstimator, "memoryEstimator");
        this.threads = threads;
        this.memoryEstimator = memoryEstimator;
        this.platformApiCompat = config.getPlatformApiCompat();
        this.maxImageReaderCapacity$delegate = g.a(new a() { // from class: androidx.camera.camera2.pipe.media.ImageReaderImageSources$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(ImageReaderImageSources.maxImageReaderCapacity_delegate$lambda$0(cameraMetadata));
            }
        });
    }

    private final int clampImageReaderCapacity(int i2, int i3) {
        return Math.max(3, Math.min(i2 + 2, i3));
    }

    private final int getMaxImageReaderCapacity() {
        return ((Number) this.maxImageReaderCapacity$delegate.getValue()).intValue();
    }

    static final int maxImageReaderCapacity_delegate$lambda$0(CameraMetadata cameraMetadata) {
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_PIPELINE_MAX_DEPTH;
        x.e(key, "REQUEST_PIPELINE_MAX_DEPTH");
        Byte b2 = (Byte) cameraMetadata.get(key);
        return 64 - (b2 != null ? b2.byteValue() : (byte) 10);
    }

    public final ImageSource create(CameraStream cameraStream, int i2, Long l2, Integer num, Integer num2, boolean z) {
        Long l3;
        x.f(cameraStream, "cameraStream");
        if (cameraStream.getOutputs().isEmpty()) {
            Objects.toString(cameraStream);
            throw new IllegalArgumentException(String.valueOf(cameraStream).concat(" must have outputs."));
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("Capacity (" + i2 + ") must be > 0");
        }
        if (z && cameraStream.getOutputs().size() <= 1) {
            throw new IllegalStateException("Cannot enable concurrent outputs for a single output camera stream.");
        }
        a aVar = new a() { // from class: androidx.camera.camera2.pipe.media.ImageReaderImageSources$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.threads.getCamera2Handler();
            }
        };
        a aVar2 = new a() { // from class: androidx.camera.camera2.pipe.media.ImageReaderImageSources$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.threads.getLightweightExecutor();
            }
        };
        int iClampImageReaderCapacity = clampImageReaderCapacity(i2, getMaxImageReaderCapacity());
        if (cameraStream.getOutputs().size() == 1) {
            OutputStream outputStream = (OutputStream) i.X(cameraStream.getOutputs());
            return ImageReaderImageSource.Companion.create(AndroidImageReader.Companion.m1254createfE0t4g(outputStream.getSize().getWidth(), outputStream.getSize().getHeight(), outputStream.mo757getFormat8FPWQzE(), iClampImageReaderCapacity, l2, num, num2, cameraStream.m578getIdptHMqGs(), outputStream.mo758getId4LaLFng(), (Handler) aVar.invoke()), this.memoryEstimator);
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalStateException("Failed to create an ImageSource for " + cameraStream + "!");
        }
        if (l2 == null || Build.VERSION.SDK_INT < 36) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Ignoring usageFlags (" + l2 + ") for " + cameraStream + ". MultiResolutionImageReader does not support setting usage flags.");
            }
            l3 = null;
        } else {
            l3 = l2;
        }
        if (num != null && Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, "Ignoring DataSpace (" + num + ") for " + cameraStream + ". MultiResolutionImageReader does not support setting the default DataSpace.");
        }
        if (num2 != null && Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, "Ignoring HardwareBufferFormat (" + num2 + ") for " + cameraStream + ". MultiResolutionImageReader does not support setting the default HardwareBufferFormat.");
        }
        return ImageReaderImageSource.Companion.create(AndroidMultiResolutionImageReader.Companion.create(cameraStream, iClampImageReaderCapacity, (Executor) aVar2.invoke(), l3, z, this.platformApiCompat), this.memoryEstimator);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageSources
    public ImageSource createImageSource(CameraStream cameraStream, ImageSourceConfig imageSourceConfig) {
        x.f(cameraStream, "cameraStream");
        x.f(imageSourceConfig, "imageSourceConfig");
        return create(cameraStream, imageSourceConfig.getCapacity(), imageSourceConfig.getUsageFlags(), imageSourceConfig.getDefaultDataSpace(), imageSourceConfig.getDefaultHardwareBufferFormat(), imageSourceConfig.getEnableConcurrentOutputs());
    }
}
