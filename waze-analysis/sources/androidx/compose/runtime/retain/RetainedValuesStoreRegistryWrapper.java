package androidx.compose.runtime.retain;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class RetainedValuesStoreRegistryWrapper implements RetainObserver {
    private final RetainedValuesStoreRegistry retainedValuesStoreRegistry = new RetainedValuesStoreRegistry();

    public final RetainedValuesStoreRegistry getRetainedValuesStoreRegistry() {
        return this.retainedValuesStoreRegistry;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetired() {
        this.retainedValuesStoreRegistry.dispose();
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onUnused() {
        this.retainedValuesStoreRegistry.dispose();
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onExitedComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetained() {
    }
}
