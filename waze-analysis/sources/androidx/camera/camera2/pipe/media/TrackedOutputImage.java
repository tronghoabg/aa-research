package androidx.camera.camera2.pipe.media;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import androidx.camera.camera2.pipe.MemoryEstimator;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.List;
import kotlinx.a.a;
import kotlinx.a.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TrackedOutputImage implements ImageWrapper, OutputImage {
    private final long bytesPerImage;
    private final a closed;
    private final b externalUseCount;
    private final ImageWrapper image;
    private final ImageReaderImageSource imageReaderImageSource;
    private final a isEvictable;
    private final MemoryEstimator memoryEstimator;
    private final int outputId;
    private final int streamId;

    private TrackedOutputImage(ImageReaderImageSource imageReaderImageSource, ImageWrapper imageWrapper, int i2, int i3, MemoryEstimator memoryEstimator) {
        x.f(imageReaderImageSource, "imageReaderImageSource");
        x.f(imageWrapper, "image");
        x.f(memoryEstimator, "memoryEstimator");
        this.imageReaderImageSource = imageReaderImageSource;
        this.image = imageWrapper;
        this.streamId = i2;
        this.outputId = i3;
        this.memoryEstimator = memoryEstimator;
        long jM930bytesPerImage_EMV7EA = StreamFormat.Companion.m930bytesPerImage_EMV7EA(imageWrapper.getFormat(), imageWrapper.getWidth(), imageWrapper.getHeight());
        this.bytesPerImage = jM930bytesPerImage_EMV7EA;
        this.closed = h.e.b.e(false);
        this.externalUseCount = h.e.b.f(0);
        this.isEvictable = h.e.b.e(false);
        if (jM930bytesPerImage_EMV7EA > 0) {
            memoryEstimator.incrementUsage(jM930bytesPerImage_EMV7EA);
        }
        updateEvictableState();
    }

    private final void updateEvictableState() {
        boolean z;
        boolean zC;
        do {
            z = false;
            if (this.externalUseCount.d() == 0 && !this.closed.c()) {
                z = true;
            }
            zC = this.isEvictable.c();
            if (z == zC) {
                return;
            }
        } while (!this.isEvictable.b(zC, z));
        long j2 = this.bytesPerImage;
        if (j2 > 0) {
            MemoryEstimator memoryEstimator = this.memoryEstimator;
            if (z) {
                memoryEstimator.updateEvictable(j2);
            } else {
                memoryEstimator.updateEvictable(-j2);
            }
        }
    }

    public final void addExternalUse(int i2) {
        if (i2 == 0) {
            return;
        }
        this.externalUseCount.i(i2);
        updateEvictableState();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed.b(false, true)) {
            updateEvictableState();
            this.imageReaderImageSource.closeAndDecrementImageCount$camera_camera2_pipe(this.image);
            long j2 = this.bytesPerImage;
            if (j2 > 0) {
                this.memoryEstimator.decrementUsage(j2);
            }
        }
    }

    public final void decrementExternalUse() {
        this.externalUseCount.a();
        updateEvictableState();
    }

    protected final void finalize() {
        close();
    }

    public final long getBytesPerImage() {
        return this.bytesPerImage;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public Rect getCropRect() {
        return this.image.getCropRect();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public Integer getDataSpace() {
        return this.image.getDataSpace();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public int getFormat() {
        return this.image.getFormat();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public HardwareBuffer getHardwareBuffer() {
        return this.image.getHardwareBuffer();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public int getHeight() {
        return this.image.getHeight();
    }

    @Override // androidx.camera.camera2.pipe.media.OutputImage
    /* renamed from: getOutputId-4LaLFng */
    public int mo1261getOutputId4LaLFng() {
        return this.outputId;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public List<ImagePlane> getPlanes() {
        return this.image.getPlanes();
    }

    @Override // androidx.camera.camera2.pipe.media.OutputImage
    /* renamed from: getStreamId-ptHMqGs */
    public int mo1262getStreamIdptHMqGs() {
        return this.streamId;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public long getTimestamp() {
        return this.image.getTimestamp();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public int getWidth() {
        return this.image.getWidth();
    }

    public final void incrementExternalUse() {
        this.externalUseCount.e();
        updateEvictableState();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public void setCropRect(Rect rect) {
        x.f(rect, "<set-?>");
        this.image.setCropRect(rect);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public void setDataSpace(Integer num) {
        this.image.setDataSpace(num);
    }

    public String toString() {
        TrackedOutputImage trackedOutputImage = this;
        return "OutputImage-s" + trackedOutputImage.mo1262getStreamIdptHMqGs() + "_o" + trackedOutputImage.mo1261getOutputId4LaLFng() + "-t" + trackedOutputImage.getTimestamp();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return x.n(cls, TrackedOutputImage.class) ? (T) this : x.n(cls, OutputImage.class) ? (T) this : x.n(cls, ImageWrapper.class) ? (T) this : (T) this.image.unwrapAs(cls);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(c<T> cVar) {
        x.f(cVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return (T) unwrapAs(o.w(cVar));
    }

    public /* synthetic */ TrackedOutputImage(ImageReaderImageSource imageReaderImageSource, ImageWrapper imageWrapper, int i2, int i3, MemoryEstimator memoryEstimator, o oVar) {
        this(imageReaderImageSource, imageWrapper, i2, i3, memoryEstimator);
    }
}
