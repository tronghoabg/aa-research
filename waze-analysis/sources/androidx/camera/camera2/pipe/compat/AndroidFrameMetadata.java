package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidFrameMetadata implements FrameMetadata {
    private final String camera;
    private final CaptureResult captureResult;
    private final Map<?, Object> extraMetadata;

    private AndroidFrameMetadata(CaptureResult captureResult, String str) {
        x.f(captureResult, "captureResult");
        x.f(str, "camera");
        this.captureResult = captureResult;
        this.camera = str;
        this.extraMetadata = r.j();
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public <T> T get(CaptureResult.Key<T> key) {
        x.f(key, "key");
        T t = (T) getExtraMetadata().get(key);
        return t == null ? (T) this.captureResult.get(key) : t;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    /* renamed from: getCamera-Dz_R5H8 */
    public String mo688getCameraDz_R5H8() {
        return this.camera;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public Map<?, Object> getExtraMetadata() {
        return this.extraMetadata;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    /* renamed from: getFrameNumber-Ugla2oM */
    public long mo689getFrameNumberUgla2oM() {
        return this.captureResult.getFrameNumber();
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public <T> T getOrDefault(CaptureResult.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) get(key);
        return t2 == null ? t : t2;
    }

    public String toString() {
        return "FrameMetadata(camera: " + CameraId.m552toStringimpl(mo688getCameraDz_R5H8()) + ", frameNumber: " + this.captureResult.getFrameNumber() + ")";
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        T t;
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, CaptureResult.class)) {
            Object obj = this.captureResult;
            x.d(obj, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.AndroidFrameMetadata.unwrapAs");
            return (T) obj;
        }
        if (!x.n(cls, TotalCaptureResult.class) || (t = (T) this.captureResult) == null) {
            return null;
        }
        return t;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T getOrDefault(Metadata.Key<T> key, T t) {
        x.f(key, "key");
        return t;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T get(Metadata.Key<T> key) {
        x.f(key, "key");
        return null;
    }

    public /* synthetic */ AndroidFrameMetadata(CaptureResult captureResult, String str, o oVar) {
        this(captureResult, str);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
