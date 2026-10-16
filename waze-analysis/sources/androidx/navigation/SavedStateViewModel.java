package androidx.navigation;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SavedStateViewModel extends ViewModel {
    private final SavedStateHandle handle;

    public SavedStateViewModel(SavedStateHandle savedStateHandle) {
        x.f(savedStateHandle, "handle");
        this.handle = savedStateHandle;
    }

    public final SavedStateHandle getHandle() {
        return this.handle;
    }
}
