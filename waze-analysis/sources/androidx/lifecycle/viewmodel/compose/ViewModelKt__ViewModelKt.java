package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStoreOwnerDefaults;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class ViewModelKt__ViewModelKt {
    public static final <VM extends ViewModel> VM viewModel(c<VM> cVar, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            factory = null;
        }
        if ((i3 & 16) != 0) {
            creationExtras = ViewModelStoreOwnerDefaults.getViewModelCreationExtras(viewModelStoreOwner);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1673618944, i2, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:97)");
        }
        if (factory == null) {
            factory = ViewModelStoreOwnerDefaults.getViewModelProviderFactory(viewModelStoreOwner);
        }
        ViewModelProvider viewModelProviderCreate = ViewModelProvider.Companion.create(viewModelStoreOwner, factory, creationExtras);
        VM vm = str != null ? (VM) viewModelProviderCreate.get(str, cVar) : (VM) viewModelProviderCreate.get(cVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vm;
    }

    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, l<? super CreationExtras, ? extends VM> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i3 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        x.i();
        int i4 = ar.f48106a;
        m mVar = new m(ViewModel.class);
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        x.i();
        initializerViewModelFactoryBuilder.addInitializer(new m(ViewModel.class), lVar);
        return (VM) ViewModelKt.viewModel(mVar, viewModelStoreOwner2, str2, initializerViewModelFactoryBuilder.build(), ViewModelStoreOwnerDefaults.getViewModelCreationExtras(viewModelStoreOwner2), composer, (i2 << 3) & 1008, 0);
    }

    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        String str2 = (i3 & 2) != 0 ? null : str;
        ViewModelProvider.Factory factory2 = (i3 & 4) != 0 ? null : factory;
        if ((i3 & 8) != 0) {
            creationExtras = ViewModelStoreOwnerDefaults.getViewModelCreationExtras(viewModelStoreOwner2);
        }
        x.i();
        int i4 = ar.f48106a;
        return (VM) ViewModelKt.viewModel(new m(ViewModel.class), viewModelStoreOwner2, str2, factory2, creationExtras, composer, (i2 << 3) & 65520, 0);
    }
}
