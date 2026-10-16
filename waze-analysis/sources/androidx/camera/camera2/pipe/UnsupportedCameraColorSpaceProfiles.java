package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;
import h.l.c;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UnsupportedCameraColorSpaceProfiles implements CameraColorSpaceProfiles {
    public static final UnsupportedCameraColorSpaceProfiles INSTANCE = new UnsupportedCameraColorSpaceProfiles();

    private UnsupportedCameraColorSpaceProfiles() {
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedColorSpaces-hNQ4ISI */
    public Set<CameraColorSpace> mo419getSupportedColorSpaceshNQ4ISI(int i2) {
        return e.c.d.a.p();
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedColorSpacesForDynamicRange-sNWL0t8 */
    public Set<CameraColorSpace> mo420getSupportedColorSpacesForDynamicRangesNWL0t8(int i2, long j2) {
        return e.c.d.a.p();
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedDynamicRangeProfiles-6Yu6yh8 */
    public Set<OutputStream.DynamicRangeProfile> mo421getSupportedDynamicRangeProfiles6Yu6yh8(String str, int i2) {
        x.f(str, "cameraColorSpace");
        return e.c.d.a.p();
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedImageFormatsForColorSpace-jRxjvBE */
    public Set<StreamFormat> mo422getSupportedImageFormatsForColorSpacejRxjvBE(String str) {
        x.f(str, "cameraColorSpace");
        return e.c.d.a.p();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
