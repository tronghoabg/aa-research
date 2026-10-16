package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import h.g.b.x;
import org.a.b.c.a;
import org.a.d.k.b;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class StateViewModelFactory<T extends ViewModel> extends AbstractSavedStateViewModelFactory {
    private final a<T> parameters;
    private final b scope;

    public StateViewModelFactory(b bVar, a<T> aVar) {
        x.f(bVar, "scope");
        x.f(aVar, "parameters");
        throw null;
    }

    private final h.g.a.a<org.a.d.h.a> addHandle(SavedStateHandle savedStateHandle) {
        throw null;
    }

    static final org.a.d.h.a addHandle$lambda$0(org.a.d.h.a aVar, SavedStateHandle savedStateHandle) {
        aVar.f(savedStateHandle);
        return aVar;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    protected <T extends ViewModel> T create(String str, Class<T> cls, SavedStateHandle savedStateHandle) {
        throw null;
    }

    public final a<T> getParameters() {
        throw null;
    }

    public final b getScope() {
        throw null;
    }
}
