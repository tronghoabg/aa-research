package androidx.camera.common;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.SyncFence;
import android.media.Image;
import android.os.Build;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import androidx.camera.common.compat.Api28Compat;
import androidx.camera.common.compat.Api33Compat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidImage implements MutableImageWrapper {
    private Rect _cropRect;
    private Integer _dataSpace;
    private volatile List<? extends ImagePlane> _planes;
    private Long _timestamp;
    private final int format;
    private final int height;
    private final Image image;
    private final Object lock;
    private final int width;

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

        @Override // androidx.camera.common.ImagePlane
        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        @Override // androidx.camera.common.ImagePlane
        public int getPixelStride() {
            return this.pixelStride;
        }

        @Override // androidx.camera.common.ImagePlane
        public int getRowStride() {
            return this.rowStride;
        }

        @Override // androidx.camera.common.UnsafeWrapper
        public <T> T unwrapAs(Class<T> cls) {
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (cls.isInstance(this)) {
                return (T) this;
            }
            if (!x.n(cls, Image.Plane.class)) {
                return null;
            }
            Object obj = this.imagePlane;
            x.d(obj, "null cannot be cast to non-null type T of androidx.camera.common.AndroidImage.Plane.unwrapAs");
            return (T) obj;
        }
    }

    public AndroidImage(Image image) {
        x.f(image, "image");
        this.image = image;
        this.lock = new Object();
        this.format = image.getFormat();
        this.width = image.getWidth();
        this.height = image.getHeight();
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

    @Override // androidx.camera.common.MutableImageWrapper, androidx.camera.common.ImageWrapper
    public Rect getCropRect() {
        Rect cropRect;
        synchronized (this.lock) {
            cropRect = this._cropRect;
            if (cropRect == null) {
                cropRect = this.image.getCropRect();
                this._cropRect = cropRect;
            }
        }
        x.e(cropRect, "synchronized(...)");
        return cropRect;
    }

    @Override // androidx.camera.common.MutableImageWrapper, androidx.camera.common.ImageWrapper
    public int getDataSpace() {
        int iIntValue;
        if (Build.VERSION.SDK_INT < 33) {
            return 0;
        }
        synchronized (this.lock) {
            Integer num = this._dataSpace;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                int dataSpace = Api33Compat.getDataSpace(this.image);
                this._dataSpace = Integer.valueOf(dataSpace);
                iIntValue = dataSpace;
            }
        }
        return iIntValue;
    }

    @Override // androidx.camera.common.ImageWrapper
    public int getFormat() {
        return this.format;
    }

    @Override // androidx.camera.common.ImageWrapper
    public HardwareBuffer getHardwareBuffer() {
        HardwareBuffer hardwareBuffer;
        synchronized (this.lock) {
            hardwareBuffer = Api28Compat.getHardwareBuffer(this.image);
        }
        return hardwareBuffer;
    }

    @Override // androidx.camera.common.ImageWrapper
    public int getHeight() {
        return this.height;
    }

    @Override // androidx.camera.common.ImageWrapper
    public List<ImagePlane> getImagePlanes() {
        return readPlanes();
    }

    @Override // androidx.camera.common.MutableImageWrapper, androidx.camera.common.ImageWrapper
    public SyncFence getSyncFence() {
        SyncFence fence;
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        synchronized (this.lock) {
            fence = Api33Compat.getFence(this.image);
        }
        return fence;
    }

    @Override // androidx.camera.common.MutableImageWrapper, androidx.camera.common.ImageWrapper
    public long getTimestamp() {
        long timestamp;
        synchronized (this.lock) {
            Long l2 = this._timestamp;
            if (l2 != null) {
                timestamp = l2.longValue();
            } else {
                timestamp = this.image.getTimestamp();
                this._timestamp = Long.valueOf(timestamp);
            }
        }
        return timestamp;
    }

    @Override // androidx.camera.common.ImageWrapper
    public int getWidth() {
        return this.width;
    }

    @Override // androidx.camera.common.MutableImageWrapper
    public void setCropRect(Rect rect) {
        x.f(rect, "newRectValue");
        synchronized (this.lock) {
            this.image.setCropRect(rect);
            this._cropRect = rect;
        }
    }

    @Override // androidx.camera.common.MutableImageWrapper
    public void setDataSpace(int i2) {
        if (Build.VERSION.SDK_INT >= 33) {
            synchronized (this.lock) {
                Api33Compat.setDataSpace(this.image, i2);
                this._dataSpace = Integer.valueOf(i2);
            }
        }
    }

    @Override // androidx.camera.common.MutableImageWrapper
    public void setSyncFence(SyncFence syncFence) {
        if (Build.VERSION.SDK_INT < 33 || syncFence == null) {
            return;
        }
        synchronized (this.lock) {
            Api33Compat.setFence(this.image, syncFence);
        }
    }

    @Override // androidx.camera.common.MutableImageWrapper
    public void setTimestamp(long j2) {
        synchronized (this.lock) {
            this.image.setTimestamp(j2);
            this._timestamp = Long.valueOf(j2);
        }
    }

    public String toString() {
        return "Image-" + getFormat() + "-w" + getWidth() + CmcdData.STREAMING_FORMAT_HLS + getHeight() + "-t" + getTimestamp();
    }

    @Override // androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (cls.isInstance(this)) {
            return (T) this;
        }
        if (x.n(cls, Image.class)) {
            Object obj = this.image;
            x.d(obj, "null cannot be cast to non-null type T of androidx.camera.common.AndroidImage.unwrapAs");
            return (T) obj;
        }
        if (x.n(cls, j$$ExternalSyntheticApiModelOutline1.m70m())) {
            return (T) Api28Compat.getHardwareBuffer(this.image);
        }
        return null;
    }
}
