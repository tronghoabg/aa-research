package androidx.camera.camera2.pipe.media;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface OutputImage extends ImageWrapper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: getOutputId-4LaLFng, reason: not valid java name */
    int mo1261getOutputId4LaLFng();

    /* renamed from: getStreamId-ptHMqGs, reason: not valid java name */
    int mo1262getStreamIdptHMqGs();

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: from-AQuxepk, reason: not valid java name */
        public final OutputImage m1263fromAQuxepk(int i2, int i3, ImageWrapper imageWrapper) {
            x.f(imageWrapper, "image");
            return imageWrapper instanceof OutputImage ? (OutputImage) imageWrapper : new OutputImageImpl(i2, i3, imageWrapper, null);
        }

        public final String toLogString$camera_camera2_pipe(OutputImage outputImage) {
            x.f(outputImage, "<this>");
            return "OutputImage-s" + outputImage.mo1262getStreamIdptHMqGs() + "_o" + outputImage.mo1261getOutputId4LaLFng() + "-t" + outputImage.getTimestamp();
        }

        /* compiled from: WazeSource */
        final class OutputImageImpl implements ImageWrapper, OutputImage {
            private final ImageWrapper image;
            private final int outputId;
            private final int streamId;

            private OutputImageImpl(int i2, int i3, ImageWrapper imageWrapper) {
                x.f(imageWrapper, "image");
                this.streamId = i2;
                this.outputId = i3;
                this.image = imageWrapper;
            }

            @Override // java.lang.AutoCloseable
            public void close() throws Exception {
                OutputImage$Companion$OutputImageImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(this.image);
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
                OutputImageImpl outputImageImpl = this;
                return "OutputImage-s" + outputImageImpl.mo1262getStreamIdptHMqGs() + "_o" + outputImageImpl.mo1261getOutputId4LaLFng() + "-t" + outputImageImpl.getTimestamp();
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
            public <T> T unwrapAs(Class<T> cls) {
                x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                return x.n(cls, OutputImage.class) ? (T) this : x.n(cls, ImageWrapper.class) ? (T) this : (T) this.image.unwrapAs(cls);
            }

            public /* synthetic */ OutputImageImpl(int i2, int i3, ImageWrapper imageWrapper, o oVar) {
                this(i2, i3, imageWrapper);
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public <T> T unwrapAs(c<T> cVar) {
                x.f(cVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                return (T) this.image.unwrapAs(cVar);
            }
        }
    }
}
