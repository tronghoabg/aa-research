package androidx.activity;

import androidx.lifecycle.ViewModelProvider;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActivityViewModelLazyKt$viewModels$factoryPromise$2 implements a<ViewModelProvider.Factory> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    public ActivityViewModelLazyKt$viewModels$factoryPromise$2(ComponentActivity componentActivity) {
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final ViewModelProvider.Factory invoke() {
        return this.$this_viewModels.getDefaultViewModelProviderFactory();
    }
}
