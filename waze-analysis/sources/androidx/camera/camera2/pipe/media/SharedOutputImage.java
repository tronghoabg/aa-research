package androidx.camera.camera2.pipe.media;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.media.Image;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.ab;
import h.e.b;
import h.g.a.a;
import h.g.b.x;
import h.l.c;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface SharedOutputImage extends OutputImage {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.media.SharedOutputImage$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SharedOutputImage acquire$default(SharedOutputImage sharedOutputImage, a aVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acquire");
            }
            if ((i2 & 1) != 0) {
                aVar = new a() { // from class: androidx.camera.camera2.pipe.media.SharedOutputImage$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ab.f48028a;
                    }
                };
            }
            return sharedOutputImage.acquire(aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SharedOutputImage acquireOrNull$default(SharedOutputImage sharedOutputImage, a aVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acquireOrNull");
            }
            if ((i2 & 1) != 0) {
                aVar = new a() { // from class: androidx.camera.camera2.pipe.media.SharedOutputImage$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ab.f48028a;
                    }
                };
            }
            return sharedOutputImage.acquireOrNull(aVar);
        }
    }

    SharedOutputImage acquire(a<ab> aVar);

    SharedOutputImage acquireOrNull(a<ab> aVar);

    void setFinalizer(Finalizer<? super OutputImage> finalizer);

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final SharedOutputImage from(OutputImage outputImage) {
            x.f(outputImage, "image");
            if (outputImage instanceof SharedOutputImage) {
                return CC.acquire$default((SharedOutputImage) outputImage, null, 1, null);
            }
            SharedOutputImage sharedOutputImage = (SharedOutputImage) outputImage.unwrapAs(SharedOutputImage.class);
            return sharedOutputImage != null ? CC.acquire$default(sharedOutputImage, null, 1, null) : new SharedOutputImageImpl(outputImage, new SharedReference(outputImage, ClosingFinalizer.INSTANCE), null);
        }

        /* compiled from: WazeSource */
        final class SharedOutputImageImpl implements OutputImage, SharedOutputImage {
            private final kotlinx.a.a closed;
            private final a<ab> onClose;
            private final OutputImage outputImage;
            private final SharedReference<OutputImage> sharedReference;

            public SharedOutputImageImpl(OutputImage outputImage, SharedReference<OutputImage> sharedReference, a<ab> aVar) {
                x.f(outputImage, "outputImage");
                x.f(sharedReference, "sharedReference");
                this.outputImage = outputImage;
                this.sharedReference = sharedReference;
                this.onClose = aVar;
                this.closed = b.e(false);
            }

            @Override // androidx.camera.camera2.pipe.media.SharedOutputImage
            public SharedOutputImage acquire(a<ab> aVar) {
                x.f(aVar, "onClose");
                SharedOutputImage sharedOutputImageAcquireOrNull = acquireOrNull(aVar);
                if (sharedOutputImageAcquireOrNull != null) {
                    return sharedOutputImageAcquireOrNull;
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // androidx.camera.camera2.pipe.media.SharedOutputImage
            public SharedOutputImage acquireOrNull(a<ab> aVar) {
                x.f(aVar, "onClose");
                if (this.closed.c()) {
                    return null;
                }
                return this.sharedReference.acquireOrNull() != null ? new SharedOutputImageImpl(this.outputImage, this.sharedReference, aVar) : null;
            }

            @Override // java.lang.AutoCloseable
            public void close() {
                if (this.closed.b(false, true)) {
                    this.sharedReference.decrement();
                    a<ab> aVar = this.onClose;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public Rect getCropRect() {
                return this.outputImage.getCropRect();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public Integer getDataSpace() {
                return this.outputImage.getDataSpace();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public int getFormat() {
                return this.outputImage.getFormat();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public HardwareBuffer getHardwareBuffer() {
                return this.outputImage.getHardwareBuffer();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public int getHeight() {
                return this.outputImage.getHeight();
            }

            @Override // androidx.camera.camera2.pipe.media.OutputImage
            /* renamed from: getOutputId-4LaLFng */
            public int mo1261getOutputId4LaLFng() {
                return this.outputImage.mo1261getOutputId4LaLFng();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public List<ImagePlane> getPlanes() {
                return this.outputImage.getPlanes();
            }

            @Override // androidx.camera.camera2.pipe.media.OutputImage
            /* renamed from: getStreamId-ptHMqGs */
            public int mo1262getStreamIdptHMqGs() {
                return this.outputImage.mo1262getStreamIdptHMqGs();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public long getTimestamp() {
                return this.outputImage.getTimestamp();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public int getWidth() {
                return this.outputImage.getWidth();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public void setCropRect(Rect rect) {
                x.f(rect, "<set-?>");
                this.outputImage.setCropRect(rect);
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public void setDataSpace(Integer num) {
                this.outputImage.setDataSpace(num);
            }

            @Override // androidx.camera.camera2.pipe.media.SharedOutputImage
            public void setFinalizer(Finalizer<? super OutputImage> finalizer) {
                x.f(finalizer, "finalizer");
                if (this.closed.c()) {
                    finalizer.finalize(null);
                } else {
                    this.sharedReference.setFinalizer(finalizer);
                }
            }

            public String toString() {
                return this.outputImage.toString();
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
            public <T> T unwrapAs(Class<T> cls) {
                x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                if (this.closed.c()) {
                    return null;
                }
                if (x.n(cls, SharedOutputImage.class)) {
                    return (T) this;
                }
                if (x.n(cls, OutputImage.class)) {
                    return (T) this;
                }
                if (x.n(cls, ImageWrapper.class)) {
                    return (T) this;
                }
                if (!x.n(cls, Image.class)) {
                    return (T) this.outputImage.unwrapAs(cls);
                }
                throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public <T> T unwrapAs(c<T> cVar) {
                x.f(cVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                return (T) this.outputImage.unwrapAs(cVar);
            }
        }
    }
}
