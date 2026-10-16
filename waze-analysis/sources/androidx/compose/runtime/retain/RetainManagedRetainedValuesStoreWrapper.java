package androidx.compose.runtime.retain;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class RetainManagedRetainedValuesStoreWrapper implements RetainObserver {
    private final ManagedRetainedValuesStore retainedValuesStore = new ManagedRetainedValuesStore();

    public final ManagedRetainedValuesStore getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetired() {
        this.retainedValuesStore.dispose();
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onUnused() {
        this.retainedValuesStore.dispose();
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
