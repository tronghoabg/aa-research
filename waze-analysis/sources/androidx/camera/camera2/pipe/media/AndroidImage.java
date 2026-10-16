package androidx.camera.camera2.pipe.media;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.os.Build;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.compat.Api28Compat;
import androidx.camera.camera2.pipe.compat.Api33Compat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.x;
import h.l.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidImage implements ImageWrapper {
    private volatile List<? extends ImagePlane> _planes;
    private final int format;
    private final int height;
    private final Image image;
    private final Object lock;
    private final long timestamp;
    private final int width;

    public AndroidImage(Image image) {
        x.f(image, "image");
        this.image = image;
        this.lock = new Object();
        this.format = image.getFormat();
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.timestamp = image.getTimestamp();
    }

    private final List<ImagePlane> readPlanes() {
        List list;
        List<? extends ImagePlane> listH;
        List list2 = this._planes;
        if (list2 != null) {
            return list2;
        }
        synchronized (this.lock) {
            List<? extends ImagePlane> list3 = this._planes;
            list = list3;
            if (list3 == null) {
                Image.Plane[] planes = this.image.getPlanes();
                if (planes != null) {
                    ArrayList arrayList = new ArrayList(planes.length);
                    for (Image.Plane plane : planes) {
                        x.c(plane);
                        arrayList.add(new Plane(plane));
                    }
                    listH = arrayList;
                } else {
                    listH = i.h();
                }
                this._planes = listH;
                list = listH;
            }
        }
        return list;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.image.close();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public Rect getCropRect() {
        Rect cropRect = this.image.getCropRect();
        x.e(cropRect, "getCropRect(...)");
        return cropRect;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public Integer getDataSpace() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Integer.valueOf(Api33Compat.getDataSpace(this.image));
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public int getFormat() {
        return this.format;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public HardwareBuffer getHardwareBuffer() {
        return Api28Compat.getHardwareBuffer(this.image);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public int getHeight() {
        return this.height;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public List<ImagePlane> getPlanes() {
        return readPlanes();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public int getWidth() {
        return this.width;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public void setCropRect(Rect rect) {
        x.f(rect, "newRectValue");
        this.image.setCropRect(rect);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public void setDataSpace(Integer num) {
        if (Build.VERSION.SDK_INT >= 33) {
            Image image = this.image;
            if (num == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Api33Compat.setDataSpace(image, num.intValue());
        }
    }

    public String toString() {
        return "Image-" + StreamFormat.m924getNameimpl(getFormat()) + "-w" + getWidth() + CmcdData.STREAMING_FORMAT_HLS + getHeight() + "-t" + getTimestamp();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        boolean zN = x.n(cls, Image.class);
        Image image = this.image;
        if (!zN) {
            return (T) Api28Compat.unwrapAsHardwareBuffer(image, cls);
        }
        x.d(image, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.media.AndroidImage.unwrapAs");
        return (T) image;
    }

    /* compiled from: WazeSource */
    public final class Plane implements ImagePlane {
        private final ByteBuffer buffer;
        private final Image.Plane imagePlane;
        private final int pixelStride;
        private final int rowStride;

        public Plane(Image.Plane plane) {
            x.f(plane, "imagePlane");
            this.imagePlane = plane;
            this.pixelStride = plane.getPixelStride();
            this.rowStride = plane.getRowStride();
            ByteBuffer buffer = plane.getBuffer();
            x.e(buffer, "getBuffer(...)");
            this.buffer = buffer;
        }

        @Override // androidx.camera.camera2.pipe.media.ImagePlane
        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        @Override // androidx.camera.camera2.pipe.media.ImagePlane
        public int getPixelStride() {
            return this.pixelStride;
        }

        @Override // androidx.camera.camera2.pipe.media.ImagePlane
        public int getRowStride() {
            return this.rowStride;
        }

        @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
        public <T> T unwrapAs(Class<T> cls) {
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (!x.n(cls, Image.Plane.class)) {
                return null;
            }
            Object obj = this.imagePlane;
            x.d(obj, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.media.AndroidImage.Plane.unwrapAs");
            return (T) obj;
        }

        @Override // androidx.camera.camera2.pipe.UnsafeWrapper
        public /* synthetic */ Object unwrapAs(c cVar) {
            return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
