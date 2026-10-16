package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import h.f;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 implements a<ViewModelStore> {
    final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;

    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(f<NavBackStackEntry> fVar) {
        this.$backStackEntry$delegate = fVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final ViewModelStore invoke() {
        return NavGraphViewModelLazyKt.m13218navGraphViewModels$lambda0(this.$backStackEntry$delegate).getViewModelStore();
    }
}
