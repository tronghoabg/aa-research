package androidx.camera.camera2.adapter;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.impl.TagsKt;
import androidx.camera.camera2.pipe.FrameMetadata;
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
public final class PartialCaptureResultAdapter implements CameraCaptureResult, UnsafeWrapper {
    private final long frameNumber;
    private final RequestMetadata requestMetadata;
    private final FrameMetadata result;

    private PartialCaptureResultAdapter(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameMetadata, "result");
        this.requestMetadata = requestMetadata;
        this.frameNumber = j2;
        this.result = frameMetadata;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AeMode getAeMode() {
        return CaptureResultAdapterKt.getAeMode(this.result);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AeState getAeState() {
        return CaptureResultAdapterKt.getAeState(this.result);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AfMode getAfMode() {
        return CaptureResultAdapterKt.getAfMode(this.result);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AfState getAfState() {
        return CaptureResultAdapterKt.getAfState(this.result);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AwbMode getAwbMode() {
        return CaptureResultAdapterKt.getAwbMode(this.result);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.AwbState getAwbState() {
        return CaptureResultAdapterKt.getAwbState(this.result);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CaptureResult getCaptureResult() {
        Object objUnwrapAs = unwrapAs((Class<Object>) CaptureResult.class);
        if (objUnwrapAs != null) {
            return (CaptureResult) objUnwrapAs;
        }
        throw new IllegalStateException("Failed to unwrap " + this + " as CaptureResult");
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData.FlashState getFlashState() {
        return CaptureResultAdapterKt.getFlashState(this.result);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public TagBundle getTagBundle() {
        return (TagBundle) this.requestMetadata.getOrDefault((Metadata.Key<Metadata.Key<TagBundle>>) TagsKt.getCAMERAX_TAG_BUNDLE(), (Metadata.Key<TagBundle>) TagBundle.emptyBundle());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        return CaptureResultAdapterKt.getTimestamp(this.result);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public void populateExifData(ExifData.Builder builder) throws NumberFormatException {
        x.f(builder, "exifBuilder");
        CameraCaptureResult.CC.$default$populateExifData(this, builder);
        CaptureResultAdapterKt.populateExifData(this.result, builder);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return (T) this.result.unwrapAs(cls);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    public /* synthetic */ PartialCaptureResultAdapter(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata, o oVar) {
        this(requestMetadata, j2, frameMetadata);
    }
}
