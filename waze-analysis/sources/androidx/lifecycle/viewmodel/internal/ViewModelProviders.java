package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import h.g.a.l;
import h.g.b.x;
import h.l.c;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelProviders {
    public static final ViewModelProviders INSTANCE = new ViewModelProviders();
    private static final String VIEW_MODEL_PROVIDER_DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    private ViewModelProviders() {
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel(Collection<? extends ViewModelInitializer<?>> collection) {
        x.f(collection, "initializers");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) collection.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }

    public final <VM extends ViewModel> VM createViewModelFromInitializers$lifecycle_viewmodel(c<VM> cVar, CreationExtras creationExtras, ViewModelInitializer... viewModelInitializerArr) {
        VM vm;
        ViewModelInitializer viewModelInitializer;
        l initializer$lifecycle_viewmodel;
        x.f(cVar, "modelClass");
        x.f(creationExtras, "extras");
        x.f(viewModelInitializerArr, "initializers");
        int length = viewModelInitializerArr.length;
        int i2 = 0;
        while (true) {
            vm = null;
            if (i2 >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = viewModelInitializerArr[i2];
            if (x.n(viewModelInitializer.getClazz$lifecycle_viewmodel(), cVar)) {
                break;
            }
            i2++;
        }
        if (viewModelInitializer != null && (initializer$lifecycle_viewmodel = viewModelInitializer.getInitializer$lifecycle_viewmodel()) != null) {
            vm = (VM) initializer$lifecycle_viewmodel.invoke(creationExtras);
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(String.valueOf(CanonicalName_jvmKt.getCanonicalName(cVar))));
    }

    public final <T extends ViewModel> String getDefaultKey$lifecycle_viewmodel(c<T> cVar) {
        x.f(cVar, "modelClass");
        String canonicalName = CanonicalName_jvmKt.getCanonicalName(cVar);
        if (canonicalName != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final <VM extends ViewModel> VM unsupportedCreateViewModel$lifecycle_viewmodel() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel(ViewModelInitializer<?>... viewModelInitializerArr) {
        x.f(viewModelInitializerArr, "initializers");
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
