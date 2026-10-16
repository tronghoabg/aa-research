package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import h.g.b.x;
import java.io.Closeable;
import java.util.Arrays;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ViewModel {
    private final ViewModelImpl impl;

    public ViewModel(af afVar, AutoCloseable... autoCloseableArr) {
        x.f(afVar, "viewModelScope");
        x.f(autoCloseableArr, "closeables");
        this.impl = new ViewModelImpl(afVar, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        x.f(str, "key");
        x.f(autoCloseable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(str, autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel() {
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.clear();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        x.f(str, "key");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            return (T) viewModelImpl.getCloseable(str);
        }
        return null;
    }

    protected void onCleared() {
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        x.f(autoCloseable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(autoCloseable);
        }
    }

    public /* synthetic */ void addCloseable(Closeable closeable) {
        x.f(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(af afVar) {
        x.f(afVar, "viewModelScope");
        this.impl = new ViewModelImpl(afVar);
    }

    public ViewModel() {
        this.impl = new ViewModelImpl();
    }

    public /* synthetic */ ViewModel(Closeable... closeableArr) {
        x.f(closeableArr, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }

    public ViewModel(AutoCloseable... autoCloseableArr) {
        x.f(autoCloseableArr, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }
}
