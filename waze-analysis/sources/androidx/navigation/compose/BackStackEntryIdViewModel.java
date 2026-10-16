package androidx.navigation.compose;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.navigation.compose.internal.NavComposeUtils_androidKt;
import androidx.navigation.compose.internal.WeakReference;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BackStackEntryIdViewModel extends ViewModel {
    public static final int $stable = 8;
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";
    private final String id;
    public WeakReference<SaveableStateHolder> saveableStateHolderRef;

    public BackStackEntryIdViewModel(SavedStateHandle savedStateHandle) {
        String strRandomUUID = (String) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (strRandomUUID == null) {
            strRandomUUID = NavComposeUtils_androidKt.randomUUID();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", strRandomUUID);
        }
        this.id = strRandomUUID;
    }

    public final String getId() {
        return this.id;
    }

    public final WeakReference<SaveableStateHolder> getSaveableStateHolderRef() {
        WeakReference<SaveableStateHolder> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        x.j("saveableStateHolderRef");
        return null;
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        SaveableStateHolder saveableStateHolder = getSaveableStateHolderRef().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.id);
        }
        getSaveableStateHolderRef().clear();
    }

    public final void setSaveableStateHolderRef(WeakReference<SaveableStateHolder> weakReference) {
        this.saveableStateHolderRef = weakReference;
    }
}
