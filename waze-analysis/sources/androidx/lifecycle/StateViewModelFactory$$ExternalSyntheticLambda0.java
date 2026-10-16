package androidx.lifecycle;

import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final /* synthetic */ class StateViewModelFactory$$ExternalSyntheticLambda0 implements a {
    public /* synthetic */ org.a.d.h.a f$0;
    public /* synthetic */ SavedStateHandle f$1;

    public /* synthetic */ StateViewModelFactory$$ExternalSyntheticLambda0(org.a.d.h.a aVar, SavedStateHandle savedStateHandle) {
        this.f$0 = aVar;
        this.f$1 = savedStateHandle;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        org.a.d.h.a aVar = this.f$0;
        StateViewModelFactory.addHandle$lambda$0(aVar, this.f$1);
        return aVar;
    }
}
