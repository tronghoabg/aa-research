package androidx.camera.camera2.pipe.media;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NoOpFinalizer implements Finalizer<Object> {
    public static final NoOpFinalizer INSTANCE = new NoOpFinalizer();

    private NoOpFinalizer() {
    }

    @Override // androidx.camera.camera2.pipe.media.Finalizer
    public void finalize(Object obj) {
    }
}
