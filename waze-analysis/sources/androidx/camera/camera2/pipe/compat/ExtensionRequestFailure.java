package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExtensionRequestFailure implements RequestFailure {
    private final long frameNumber;
    private final int reason;
    private final RequestMetadata requestMetadata;
    private final boolean wasImageCaptured;

    private ExtensionRequestFailure(RequestMetadata requestMetadata, boolean z, long j2, int i2) {
        x.f(requestMetadata, "requestMetadata");
        this.requestMetadata = requestMetadata;
        this.wasImageCaptured = z;
        this.frameNumber = j2;
        this.reason = i2;
    }

    /* renamed from: copy-FsN21Hw$default, reason: not valid java name */
    public static /* synthetic */ ExtensionRequestFailure m1083copyFsN21Hw$default(ExtensionRequestFailure extensionRequestFailure, RequestMetadata requestMetadata, boolean z, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            requestMetadata = extensionRequestFailure.requestMetadata;
        }
        if ((i3 & 2) != 0) {
            z = extensionRequestFailure.wasImageCaptured;
        }
        if ((i3 & 4) != 0) {
            j2 = extensionRequestFailure.frameNumber;
        }
        if ((i3 & 8) != 0) {
            i2 = extensionRequestFailure.reason;
        }
        int i4 = i2;
        return extensionRequestFailure.m1085copyFsN21Hw(requestMetadata, z, j2, i4);
    }

    public final RequestMetadata component1() {
        return this.requestMetadata;
    }

    public final boolean component2() {
        return this.wasImageCaptured;
    }

    /* renamed from: component3-Ugla2oM, reason: not valid java name */
    public final long m1084component3Ugla2oM() {
        return this.frameNumber;
    }

    public final int component4() {
        return this.reason;
    }

    /* renamed from: copy-FsN21Hw, reason: not valid java name */
    public final ExtensionRequestFailure m1085copyFsN21Hw(RequestMetadata requestMetadata, boolean z, long j2, int i2) {
        x.f(requestMetadata, "requestMetadata");
        return new ExtensionRequestFailure(requestMetadata, z, j2, i2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtensionRequestFailure)) {
            return false;
        }
        ExtensionRequestFailure extensionRequestFailure = (ExtensionRequestFailure) obj;
        return x.n(this.requestMetadata, extensionRequestFailure.requestMetadata) && this.wasImageCaptured == extensionRequestFailure.wasImageCaptured && FrameNumber.m693equalsimpl0(this.frameNumber, extensionRequestFailure.frameNumber) && this.reason == extensionRequestFailure.reason;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    /* renamed from: getFrameNumber-Ugla2oM */
    public long mo879getFrameNumberUgla2oM() {
        return this.frameNumber;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public int getReason() {
        return this.reason;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public RequestMetadata getRequestMetadata() {
        return this.requestMetadata;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public boolean getWasImageCaptured() {
        return this.wasImageCaptured;
    }

    public int hashCode() {
        return (((((this.requestMetadata.hashCode() * 31) + ExtensionRequestFailure$$ExternalSyntheticBackport0.m(this.wasImageCaptured)) * 31) + FrameNumber.m694hashCodeimpl(this.frameNumber)) * 31) + this.reason;
    }

    public String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.requestMetadata + ", wasImageCaptured=" + this.wasImageCaptured + ", frameNumber=" + FrameNumber.m695toStringimpl(this.frameNumber) + ", reason=" + this.reason + ")";
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    public /* synthetic */ ExtensionRequestFailure(RequestMetadata requestMetadata, boolean z, long j2, int i2, o oVar) {
        this(requestMetadata, z, j2, i2);
    }
}
