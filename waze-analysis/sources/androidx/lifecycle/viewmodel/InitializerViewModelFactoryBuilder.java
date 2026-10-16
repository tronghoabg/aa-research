package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.CanonicalName_jvmKt;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import h.g.a.l;
import h.g.b.x;
import h.l.c;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
@ViewModelFactoryDsl
/* loaded from: classes3.dex */
public final class InitializerViewModelFactoryBuilder {
    private final Map<c<?>, ViewModelInitializer<?>> initializers = new LinkedHashMap();

    public final <T extends ViewModel> void addInitializer(c<T> cVar, l<? super CreationExtras, ? extends T> lVar) {
        x.f(cVar, "clazz");
        x.f(lVar, "initializer");
        if (!this.initializers.containsKey(cVar)) {
            this.initializers.put(cVar, new ViewModelInitializer<>(cVar, lVar));
            return;
        }
        throw new IllegalArgumentException("A `initializer` with the same `clazz` has already been added: " + CanonicalName_jvmKt.getCanonicalName(cVar) + ".");
    }

    public final ViewModelProvider.Factory build() {
        return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel(this.initializers.values());
    }
}
