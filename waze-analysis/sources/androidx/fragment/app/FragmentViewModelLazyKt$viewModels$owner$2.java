package androidx.fragment.app;

import androidx.lifecycle.ViewModelStoreOwner;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$owner$2 implements a<ViewModelStoreOwner> {
    final /* synthetic */ a<ViewModelStoreOwner> $ownerProducer;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$owner$2(a<? extends ViewModelStoreOwner> aVar) {
        this.$ownerProducer = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final ViewModelStoreOwner invoke() {
        return this.$ownerProducer.invoke();
    }
}
