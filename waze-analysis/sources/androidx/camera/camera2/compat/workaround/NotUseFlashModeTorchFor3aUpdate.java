package androidx.camera.camera2.compat.workaround;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NotUseFlashModeTorchFor3aUpdate implements UseFlashModeTorchFor3aUpdate {
    public static final NotUseFlashModeTorchFor3aUpdate INSTANCE = new NotUseFlashModeTorchFor3aUpdate();

    private NotUseFlashModeTorchFor3aUpdate() {
    }

    @Override // androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate
    public boolean shouldUseFlashModeTorch() {
        return false;
    }
}
