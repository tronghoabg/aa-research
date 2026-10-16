package androidx.camera.camera2.pipe.media;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.compat.Api28Compat;
import androidx.camera.camera2.pipe.compat.Api29Compat;
import androidx.camera.camera2.pipe.compat.Api33Compat;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.media.ImageReaderWrapper;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import e.c.d.a;
import h.e.b;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import h.m.k;
import java.util.Set;
import kotlinx.a.d;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidImageReader implements ImageReaderWrapper, ImageReader.OnImageAvailableListener {
    public static final Companion Companion = new Companion(null);
    private final int capacity;
    private final ImageReader imageReader;
    private final d onExpectedOutputsListener$delegate;
    private final d onImageListener$delegate;
    private final int outputId;
    private final Set<OutputId> outputIdSet;
    private final int streamId;
    private final Surface surface;
    private final Long usageFlags;

    private AndroidImageReader(ImageReader imageReader, int i2, Long l2, int i3, int i4) {
        x.f(imageReader, "imageReader");
        this.imageReader = imageReader;
        this.capacity = i2;
        this.usageFlags = l2;
        this.streamId = i3;
        this.outputId = i4;
        this.outputIdSet = a.o(OutputId.m734boximpl(i4));
        Surface surface = imageReader.getSurface();
        x.e(surface, "getSurface(...)");
        this.surface = surface;
        this.onImageListener$delegate = b.h(null);
        this.onExpectedOutputsListener$delegate = b.h(null);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.imageReader.close();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public void discardFreeBuffers() {
        try {
            Api28Compat.discardFreeBuffers(this.imageReader);
        } catch (IllegalStateException unused) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Failed to discardFreeBuffers on " + this + ". Expected if invoked after close().");
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public void flush() {
        Image imageAcquireLatestImage = this.imageReader.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            imageAcquireLatestImage.close();
        }
        discardFreeBuffers();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public ImageReaderWrapper.OnExpectedOutputsListener getOnExpectedOutputsListener() {
        return (ImageReaderWrapper.OnExpectedOutputsListener) this.onExpectedOutputsListener$delegate.b();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public ImageReaderWrapper.OnImageListener getOnImageListener() {
        return (ImageReaderWrapper.OnImageListener) this.onImageListener$delegate.b();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public Surface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public Long getUsageFlags() {
        return this.usageFlags;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireNextImage = imageReader != null ? imageReader.acquireNextImage() : null;
        if (imageAcquireNextImage != null) {
            ImageReaderWrapper.OnImageListener onImageListener = getOnImageListener();
            if (onImageListener == null) {
                imageAcquireNextImage.close();
                return;
            }
            ImageReaderWrapper.OnExpectedOutputsListener onExpectedOutputsListener = getOnExpectedOutputsListener();
            if (onExpectedOutputsListener != null) {
                onExpectedOutputsListener.onExpectedOutputs(imageAcquireNextImage.getTimestamp(), this.outputIdSet);
            }
            onImageListener.mo1259onImageAQuxepk(this.streamId, this.outputId, new AndroidImage(imageAcquireNextImage));
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public void setOnExpectedOutputsListener(ImageReaderWrapper.OnExpectedOutputsListener onExpectedOutputsListener) {
        this.onExpectedOutputsListener$delegate.d(onExpectedOutputsListener);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public void setOnImageListener(ImageReaderWrapper.OnImageListener onImageListener) {
        this.onImageListener$delegate.d(onImageListener);
    }

    public String toString() {
        int iHashCode = super.hashCode();
        k.y(16);
        String string = Integer.toString(iHashCode, 16);
        x.e(string, "toString(...)");
        String strM924getNameimpl = StreamFormat.m924getNameimpl(this.imageReader.getImageFormat());
        ImageReader imageReader = this.imageReader;
        return "ImageReader@" + string + "-" + strM924getNameimpl + "-w" + imageReader.getWidth() + CmcdData.STREAMING_FORMAT_HLS + imageReader.getHeight();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, ImageReader.class)) {
            return (T) this.imageReader;
        }
        return null;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: create-fE-0t4g, reason: not valid java name */
        public final ImageReaderWrapper m1254createfE0t4g(int i2, int i3, int i4, int i5, Long l2, Integer num, Integer num2, int i6, int i7, Handler handler) {
            ImageReader imageReaderNewInstance;
            x.f(handler, "handler");
            if (i2 <= 0) {
                throw new IllegalArgumentException("Width (" + i2 + ") must be > 0");
            }
            if (i3 <= 0) {
                throw new IllegalArgumentException("Height (" + i3 + ") must be > 0");
            }
            if (i5 <= 0) {
                throw new IllegalArgumentException("Capacity (" + i5 + ") must be > 0");
            }
            if (num != null && Build.VERSION.SDK_INT < 33 && Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Ignoring defaultDataSpace (" + num + ") for " + OutputId.m739toStringimpl(i7) + ". Android " + Build.VERSION.SDK_INT + " does not support creating ImageReaders with defaultDataSpace. This may lead to unexpected behaviors.");
            }
            if (num2 != null && Build.VERSION.SDK_INT < 33 && Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Ignoring defaultHardwareBufferFormat (" + num2 + ") for " + OutputId.m739toStringimpl(i7) + ". Android " + Build.VERSION.SDK_INT + " does not support creating ImageReaders with defaultHardwareBufferFormat. This may lead to unexpected behaviors.");
            }
            if (Build.VERSION.SDK_INT >= 33) {
                imageReaderNewInstance = Api33Compat.newImageReaderFromImageReaderBuilder(i2, i3, Integer.valueOf(i4), Integer.valueOf(i5), l2, num, num2);
            } else if (l2 != null) {
                imageReaderNewInstance = Api29Compat.imageReaderNewInstance(i2, i3, i4, i5, l2.longValue());
            } else {
                imageReaderNewInstance = ImageReader.newInstance(i2, i3, i4, i5);
                x.c(imageReaderNewInstance);
            }
            ImageReader imageReader = imageReaderNewInstance;
            AndroidImageReader androidImageReader = new AndroidImageReader(imageReader, i5, l2, i6, i7, null);
            imageReader.setOnImageAvailableListener(androidImageReader, handler);
            return androidImageReader;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    public /* synthetic */ AndroidImageReader(ImageReader imageReader, int i2, Long l2, int i3, int i4, o oVar) {
        this(imageReader, i2, l2, i3, i4);
    }
}
