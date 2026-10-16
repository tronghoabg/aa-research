package androidx.camera.camera2.pipe.media;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ClosingFinalizer implements Finalizer<AutoCloseable> {
    public static final ClosingFinalizer INSTANCE = new ClosingFinalizer();

    private ClosingFinalizer() {
    }

    @Override // androidx.camera.camera2.pipe.media.Finalizer
    public void finalize(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            ClosingFinalizer$$ExternalSyntheticAutoCloseableDispatcher0.m(autoCloseable);
        }
    }
}
