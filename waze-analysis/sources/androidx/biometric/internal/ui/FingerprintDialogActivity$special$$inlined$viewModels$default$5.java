package androidx.biometric.internal.ui;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FingerprintDialogActivity$special$$inlined$viewModels$default$5 extends y implements a<ViewModelStore> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FingerprintDialogActivity$special$$inlined$viewModels$default$5(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final ViewModelStore invoke() {
        return this.$this_viewModels.getViewModelStore();
    }
}
