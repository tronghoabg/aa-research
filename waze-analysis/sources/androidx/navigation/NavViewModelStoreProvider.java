package androidx.navigation;

import androidx.lifecycle.ViewModelStore;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface NavViewModelStoreProvider {
    void clear(String str);

    ViewModelStore get(String str);
}
