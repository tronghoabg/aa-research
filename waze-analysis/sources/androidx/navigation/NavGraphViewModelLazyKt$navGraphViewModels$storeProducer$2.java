package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import h.f;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 implements a<ViewModelStore> {
    final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;

    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(f<NavBackStackEntry> fVar) {
        this.$backStackEntry$delegate = fVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final ViewModelStore invoke() {
        return NavGraphViewModelLazyKt.m13219navGraphViewModels$lambda1(this.$backStackEntry$delegate).getViewModelStore();
    }
}
