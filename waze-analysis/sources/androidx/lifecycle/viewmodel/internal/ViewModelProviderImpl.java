package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelProviderImpl {
    private final CreationExtras defaultExtras;
    private final ViewModelProvider.Factory factory;
    private final SynchronizedObject lock;
    private final ViewModelStore store;

    public ViewModelProviderImpl(ViewModelStore viewModelStore, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        x.f(viewModelStore, "store");
        x.f(factory, "factory");
        x.f(creationExtras, "defaultExtras");
        this.store = viewModelStore;
        this.factory = factory;
        this.defaultExtras = creationExtras;
        this.lock = new SynchronizedObject();
    }

    public static /* synthetic */ ViewModel getViewModel$lifecycle_viewmodel$default(ViewModelProviderImpl viewModelProviderImpl, c cVar, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel(cVar);
        }
        return viewModelProviderImpl.getViewModel$lifecycle_viewmodel(cVar, str);
    }

    public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel(c<T> cVar, String str) {
        T t;
        x.f(cVar, "modelClass");
        x.f(str, "key");
        synchronized (this.lock) {
            t = (T) this.store.get(str);
            if (cVar.d(t)) {
                x.d(t, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
            } else {
                MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.defaultExtras);
                mutableCreationExtras.set(ViewModelProvider.VIEW_MODEL_KEY, str);
                t = (T) ViewModelProviderImpl_androidKt.createViewModel(this.factory, cVar, mutableCreationExtras);
                this.store.put(str, t);
            }
        }
        return t;
    }
}
