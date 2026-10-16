package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CorrectedFrameMetadata implements FrameMetadata {
    private Map<?, ? extends Object> extraMetadata;
    private FrameMetadata frameMetadata;

    public CorrectedFrameMetadata(FrameMetadata frameMetadata, Map<?, ? extends Object> map) {
        x.f(frameMetadata, "frameMetadata");
        x.f(map, "extraMetadata");
        this.frameMetadata = frameMetadata;
        this.extraMetadata = map;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public <T> T get(CaptureResult.Key<T> key) {
        x.f(key, "key");
        T t = (T) getExtraMetadata().get(key);
        return t == null ? (T) this.frameMetadata.get(key) : t;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    /* renamed from: getCamera-Dz_R5H8 */
    public String mo688getCameraDz_R5H8() {
        return this.frameMetadata.mo688getCameraDz_R5H8();
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public Map<?, Object> getExtraMetadata() {
        return this.extraMetadata;
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    /* renamed from: getFrameNumber-Ugla2oM */
    public long mo689getFrameNumberUgla2oM() {
        return this.frameMetadata.mo689getFrameNumberUgla2oM();
    }

    @Override // androidx.camera.camera2.pipe.FrameMetadata
    public <T> T getOrDefault(CaptureResult.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) get(key);
        return t2 == null ? t : t2;
    }

    public void setExtraMetadata(Map<?, ? extends Object> map) {
        x.f(map, "<set-?>");
        this.extraMetadata = map;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return (T) this.frameMetadata.unwrapAs(cls);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T getOrDefault(Metadata.Key<T> key, T t) {
        x.f(key, "key");
        T t2 = (T) get(key);
        return t2 == null ? t : t2;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public <T> T get(Metadata.Key<T> key) {
        x.f(key, "key");
        T t = (T) getExtraMetadata().get(key);
        return t == null ? (T) this.frameMetadata.get(key) : t;
    }
}
