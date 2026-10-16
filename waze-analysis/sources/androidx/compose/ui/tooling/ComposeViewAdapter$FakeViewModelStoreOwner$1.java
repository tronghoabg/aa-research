package androidx.compose.ui.tooling;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ComposeViewAdapter$FakeViewModelStoreOwner$1 implements ViewModelStoreOwner {
    private final ViewModelStore viewModelStore;
    private final ViewModelStore vmStore;

    ComposeViewAdapter$FakeViewModelStoreOwner$1() {
        ViewModelStore viewModelStore = new ViewModelStore();
        this.vmStore = viewModelStore;
        this.viewModelStore = viewModelStore;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.viewModelStore;
    }
}
