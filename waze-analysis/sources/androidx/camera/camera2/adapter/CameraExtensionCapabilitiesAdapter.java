package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.core.impl.CameraExtensionCapabilities;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraExtensionCapabilitiesAdapter implements CameraExtensionCapabilities {
    private final CameraExtensionMetadata extensionMetadata;

    public CameraExtensionCapabilitiesAdapter(CameraExtensionMetadata cameraExtensionMetadata) {
        x.f(cameraExtensionMetadata, "extensionMetadata");
        this.extensionMetadata = cameraExtensionMetadata;
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public <T> T get(Object obj) {
        x.f(obj, "key");
        if (obj instanceof CameraCharacteristics.Key) {
            return (T) this.extensionMetadata.get((CameraCharacteristics.Key) obj);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public Set<Object> getAvailableCaptureRequestKeys() {
        Set<CaptureRequest.Key<?>> requestKeys = this.extensionMetadata.getRequestKeys();
        x.d(requestKeys, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.Any>");
        return requestKeys;
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public Set<Object> getAvailableCaptureResultKeys() {
        Set<CaptureResult.Key<?>> resultKeys = this.extensionMetadata.getResultKeys();
        x.d(resultKeys, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.Any>");
        return resultKeys;
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public List<Pair<Object, Object>> getAvailableCharacteristicsKeyValues() {
        ArrayList arrayList = new ArrayList();
        for (CameraCharacteristics.Key<?> key : this.extensionMetadata.getKeys()) {
            Object obj = this.extensionMetadata.get(key);
            if (obj != null) {
                Pair pairCreate = Pair.create(key, obj);
                x.e(pairCreate, "create(...)");
                arrayList.add(pairCreate);
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public Range<Long> getEstimatedCaptureLatencyRangeMillis(Size size, int i2) {
        x.f(size, "captureSize");
        return this.extensionMetadata.getEstimatedCaptureLatencyRangeMillis(size, i2);
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public Set<Size> getOutputSizes(Class<?> cls) {
        x.f(cls, "klass");
        return this.extensionMetadata.getOutputSizes(cls);
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public Set<Size> getPostviewSizes(Size size, int i2) {
        x.f(size, "captureSize");
        return this.extensionMetadata.getPostviewSizes(size, i2);
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public boolean isCaptureProcessProgressSupported() {
        return this.extensionMetadata.isCaptureProgressSupported();
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public /* synthetic */ boolean isCurrentExtensionModeSupported() {
        return CameraExtensionCapabilities.CC.$default$isCurrentExtensionModeSupported(this);
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public /* synthetic */ boolean isExtensionStrengthSupported() {
        return CameraExtensionCapabilities.CC.$default$isExtensionStrengthSupported(this);
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public boolean isPostviewSupported() {
        return this.extensionMetadata.isPostviewSupported();
    }

    @Override // androidx.camera.core.impl.CameraExtensionCapabilities
    public Set<Size> getOutputSizes(int i2) {
        return this.extensionMetadata.getOutputSizes(i2);
    }
}
