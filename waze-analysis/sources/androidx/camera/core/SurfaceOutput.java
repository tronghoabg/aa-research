package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Consumer;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface SurfaceOutput extends Closeable {

    /* compiled from: WazeSource */
    public abstract class CameraInputInfo {
        public static CameraInputInfo of(Size size, Rect rect, CameraInternal cameraInternal, int i2, boolean z) {
            return new AutoValue_SurfaceOutput_CameraInputInfo(size, rect, cameraInternal, i2, z);
        }

        public abstract CameraInternal getCameraInternal();

        public abstract Rect getInputCropRect();

        public abstract Size getInputSize();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();
    }

    /* compiled from: WazeSource */
    public abstract class Event {
        public static final int EVENT_REQUEST_CLOSE = 0;

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface EventCode {
        }

        Event() {
        }

        public static Event of(int i2, SurfaceOutput surfaceOutput) {
            return new AutoValue_SurfaceOutput_Event(i2, surfaceOutput);
        }

        public abstract int getEventCode();

        public abstract SurfaceOutput getSurfaceOutput();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getFormat();

    Matrix getSensorToBufferTransform();

    Size getSize();

    Surface getSurface(Executor executor, Consumer<Event> consumer);

    int getTargets();

    void updateTransformMatrix(float[] fArr, float[] fArr2);

    void updateTransformMatrix(float[] fArr, float[] fArr2, boolean z);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.SurfaceOutput$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$getFormat(SurfaceOutput surfaceOutput) {
            return 34;
        }

        public static Matrix $default$getSensorToBufferTransform(SurfaceOutput surfaceOutput) {
            return new Matrix();
        }

        public static void $default$updateTransformMatrix(SurfaceOutput surfaceOutput, float[] fArr, float[] fArr2, boolean z) {
        }
    }
}
