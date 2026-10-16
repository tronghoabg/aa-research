package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, l<? super CreationExtras, ? extends VM> lVar) {
        x.f(initializerViewModelFactoryBuilder, "<this>");
        x.f(lVar, "initializer");
        x.i();
        int i2 = ar.f48106a;
        initializerViewModelFactoryBuilder.addInitializer(new m(ViewModel.class), lVar);
    }

    public static final ViewModelProvider.Factory viewModelFactory(l<? super InitializerViewModelFactoryBuilder, ab> lVar) {
        x.f(lVar, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        lVar.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
