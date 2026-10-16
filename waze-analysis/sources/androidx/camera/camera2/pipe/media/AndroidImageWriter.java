package androidx.camera.camera2.pipe.media;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.pipe.InputStreamId;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.compat.Api29Compat;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.media.ImageWriterWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.e.b;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import kotlinx.a.d;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidImageWriter implements ImageWriterWrapper, ImageWriter.OnImageReleasedListener {
    public static final Companion Companion = new Companion(null);
    private final int format;
    private final ImageWriter imageWriter;
    private final int inputStreamId;
    private final int maxImages;
    private final d<ImageWriterWrapper.OnImageReleasedListener> onImageReleasedListener;

    private AndroidImageWriter(ImageWriter imageWriter, int i2) {
        this.imageWriter = imageWriter;
        this.inputStreamId = i2;
        this.onImageReleasedListener = b.h(null);
        this.maxImages = imageWriter.getMaxImages();
        this.format = imageWriter.getFormat();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.imageWriter.close();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public ImageWrapper dequeueInputImage() {
        Image imageDequeueInputImage = this.imageWriter.dequeueInputImage();
        x.c(imageDequeueInputImage);
        return new AndroidImage(imageDequeueInputImage);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public int getFormat() {
        return this.format;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public int getMaxImages() {
        return this.maxImages;
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public void onImageReleased(ImageWriter imageWriter) {
        ImageWriterWrapper.OnImageReleasedListener onImageReleasedListener = (ImageWriterWrapper.OnImageReleasedListener) this.onImageReleasedListener.b();
        if (onImageReleasedListener != null) {
            onImageReleasedListener.m1260onImageReleasedI45lehc(this.inputStreamId);
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public boolean queueInputImage(ImageWrapper imageWrapper) throws Exception {
        x.f(imageWrapper, "image");
        try {
            Image image = (Image) imageWrapper.unwrapAs(Image.class);
            if (image != null) {
                this.imageWriter.queueInputImage(image);
                return true;
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to unwrap image wrapper " + imageWrapper);
            }
            return false;
        } catch (Throwable th) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to queue image to " + this + " due to error " + th.getMessage() + ". Ignoring failure and closing " + imageWrapper);
            }
            AndroidImageWriter$$ExternalSyntheticAutoCloseableDispatcher0.m(imageWrapper);
            return false;
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public void setOnImageReleasedListener(ImageWriterWrapper.OnImageReleasedListener onImageReleasedListener) {
        x.f(onImageReleasedListener, "onImageReleasedListener");
        this.onImageReleasedListener.d(onImageReleasedListener);
    }

    public String toString() {
        return "ImageWriter-" + StreamFormat.m924getNameimpl(this.imageWriter.getFormat()) + "-" + InputStreamId.m716toStringimpl(this.inputStreamId);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, ImageWriter.class)) {
            return (T) this.imageWriter;
        }
        return null;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: create-U86x6Zg, reason: not valid java name */
        public final ImageWriterWrapper m1255createU86x6Zg(Surface surface, int i2, int i3, StreamFormat streamFormat, Handler handler) {
            ImageWriter imageWriterNewInstance;
            x.f(surface, "surface");
            x.f(handler, "handler");
            if (i3 <= 0) {
                throw new IllegalArgumentException("Max images (" + i3 + ") must be > 0");
            }
            if (streamFormat != null) {
                imageWriterNewInstance = Api29Compat.imageWriterNewInstance(surface, i3, streamFormat.m929unboximpl());
            } else {
                imageWriterNewInstance = ImageWriter.newInstance(surface, i3);
                x.c(imageWriterNewInstance);
            }
            AndroidImageWriter androidImageWriter = new AndroidImageWriter(imageWriterNewInstance, i2, null);
            imageWriterNewInstance.setOnImageReleasedListener(androidImageWriter, handler);
            return androidImageWriter;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    public /* synthetic */ AndroidImageWriter(ImageWriter imageWriter, int i2, o oVar) {
        this(imageWriter, i2);
    }
}
