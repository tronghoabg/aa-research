package androidx.camera.camera2.compat.workaround;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutoFlashAEModeDisablerImpl implements AutoFlashAEModeDisabler {
    public static final AutoFlashAEModeDisablerImpl INSTANCE = new AutoFlashAEModeDisablerImpl();

    private AutoFlashAEModeDisablerImpl() {
    }

    @Override // androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler
    public int getCorrectedAeMode(int i2) {
        if (i2 == 2) {
            return 1;
        }
        return i2;
    }
}
