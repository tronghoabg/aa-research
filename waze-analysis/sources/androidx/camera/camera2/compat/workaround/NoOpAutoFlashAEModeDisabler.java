package androidx.camera.camera2.compat.workaround;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NoOpAutoFlashAEModeDisabler implements AutoFlashAEModeDisabler {
    public static final NoOpAutoFlashAEModeDisabler INSTANCE = new NoOpAutoFlashAEModeDisabler();

    private NoOpAutoFlashAEModeDisabler() {
    }

    @Override // androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler
    public int getCorrectedAeMode(int i2) {
        return i2;
    }
}
