package androidx.compose.runtime.retain;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ForgetfulRetainedValuesStore implements RetainedValuesStore {
    public static final int $stable = 0;
    public static final ForgetfulRetainedValuesStore INSTANCE = new ForgetfulRetainedValuesStore();

    private ForgetfulRetainedValuesStore() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void saveExitingValue(Object obj, Object obj2) {
        if (obj2 instanceof RetainObserver) {
            ((RetainObserver) obj2).onRetired();
        }
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentExitComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public Object consumeExitedValueOrDefault(Object obj, Object obj2) {
        return obj2;
    }
}
