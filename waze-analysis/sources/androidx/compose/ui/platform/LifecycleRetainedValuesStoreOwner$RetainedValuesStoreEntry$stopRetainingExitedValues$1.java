package androidx.compose.ui.platform;

import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1 extends y implements a<ab> {
    final /* synthetic */ LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1(LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry) {
        super(0);
        this.this$0 = retainedValuesStoreEntry;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0._retainedValuesStore.endLifecycleTransition();
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
