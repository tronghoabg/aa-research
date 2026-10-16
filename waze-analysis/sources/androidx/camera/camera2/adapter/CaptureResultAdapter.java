package androidx.camera.camera2.adapter;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.impl.TagsKt;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureResultAdapter implements CameraCaptureResult, UnsafeWrapper {
    private final long frameNumber;
    private final RequestMetadata requestMetadata;
    private final FrameInfo result;

    private CaptureResultAdapter(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "result");
        this.requestMetadata = requestMetadata;
        this.frameNumber = j2;
        this.result = frameInfo;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AeMode getAeMode() {
        return CaptureResultAdapterKt.getAeMode(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AeState getAeState() {
        return CaptureResultAdapterKt.getAeState(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AfMode getAfMode() {
        return CaptureResultAdapterKt.getAfMode(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AfState getAfState() {
        return CaptureResultAdapterKt.getAfState(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AwbMode getAwbMode() {
        return CaptureResultAdapterKt.getAwbMode(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AwbState getAwbState() {
        return CaptureResultAdapterKt.getAwbState(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CaptureResult getCaptureResult() {
        Object objUnwrapAs = unwrapAs((Class<Object>) TotalCaptureResult.class);
        if (objUnwrapAs != null) {
            return (CaptureResult) objUnwrapAs;
        }
        throw new IllegalStateException("Failed to unwrap " + this + " as TotalCaptureResult");
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.FlashState getFlashState() {
        return CaptureResultAdapterKt.getFlashState(this.result.getMetadata());
    }

    public final FrameInfo getResult$camera_camera2() {
        return this.result;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public TagBundle getTagBundle() {
        return (TagBundle) this.requestMetadata.getOrDefault((Metadata.Key<Metadata.Key<TagBundle>>) TagsKt.getCAMERAX_TAG_BUNDLE(), (Metadata.Key<TagBundle>) TagBundle.emptyBundle());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        return CaptureResultAdapterKt.getTimestamp(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public void populateExifData(ExifData.Builder builder) throws NumberFormatException {
        x.f(builder, "exifBuilder");
        CameraCaptureResult.CC.$default$populateExifData(this, builder);
        CaptureResultAdapterKt.populateExifData(this.result.getMetadata(), builder);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        boolean zN = x.n(cls, FrameInfo.class);
        FrameInfo frameInfo = this.result;
        if (!zN) {
            return (T) frameInfo.unwrapAs(cls);
        }
        x.d(frameInfo, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.CaptureResultAdapter.unwrapAs");
        return (T) frameInfo;
    }

    public /* synthetic */ CaptureResultAdapter(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo, o oVar) {
        this(requestMetadata, j2, frameInfo);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
