package androidx.biometric.internal.ui;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FingerprintDialogActivity$special$$inlined$viewModels$default$6 extends y implements a<CreationExtras> {
    final /* synthetic */ a $extrasProducer;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FingerprintDialogActivity$special$$inlined$viewModels$default$6(a aVar, ComponentActivity componentActivity) {
        super(0);
        this.$extrasProducer = aVar;
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final CreationExtras invoke() {
        CreationExtras creationExtras;
        a aVar = this.$extrasProducer;
        return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
    }
}
