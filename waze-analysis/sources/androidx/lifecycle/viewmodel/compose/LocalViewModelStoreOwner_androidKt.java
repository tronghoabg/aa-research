package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.HostDefaultKey;
import androidx.compose.runtime.ViewTreeHostDefaultKey;
import androidx.lifecycle.ViewModelStoreOwner;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LocalViewModelStoreOwner_androidKt {
    private static final HostDefaultKey<ViewModelStoreOwner> ViewModelStoreOwnerHostDefaultKey = new ViewTreeHostDefaultKey<ViewModelStoreOwner>() { // from class: androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner_androidKt$ViewModelStoreOwnerHostDefaultKey$1
        @Override // androidx.compose.runtime.ViewTreeHostDefaultKey
        public int getTagKey() {
            return com.waze.R.id.view_tree_view_model_store_owner;
        }
    };

    public static final HostDefaultKey<ViewModelStoreOwner> getViewModelStoreOwnerHostDefaultKey() {
        return ViewModelStoreOwnerHostDefaultKey;
    }
}
