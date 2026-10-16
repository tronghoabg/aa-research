package androidx.camera.lifecycle;

import androidx.camera.core.CameraIdentifier;
import androidx.camera.lifecycle.LifecycleCameraRepository;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AutoValue_LifecycleCameraRepository_Key extends LifecycleCameraRepository.Key {
    private final CameraIdentifier cameraIdentifier;
    private final int lifecycleOwnerHash;

    AutoValue_LifecycleCameraRepository_Key(int i2, CameraIdentifier cameraIdentifier) {
        this.lifecycleOwnerHash = i2;
        if (cameraIdentifier == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.cameraIdentifier = cameraIdentifier;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleCameraRepository.Key) {
            LifecycleCameraRepository.Key key = (LifecycleCameraRepository.Key) obj;
            if (this.lifecycleOwnerHash == key.getLifecycleOwnerHash() && this.cameraIdentifier.equals(key.getCameraIdentifier())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public CameraIdentifier getCameraIdentifier() {
        return this.cameraIdentifier;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public int getLifecycleOwnerHash() {
        return this.lifecycleOwnerHash;
    }

    public int hashCode() {
        int i2 = this.lifecycleOwnerHash;
        return this.cameraIdentifier.hashCode() ^ ((i2 ^ 1000003) * 1000003);
    }

    public String toString() {
        return "Key{lifecycleOwnerHash=" + this.lifecycleOwnerHash + ", cameraIdentifier=" + this.cameraIdentifier + "}";
    }
}
