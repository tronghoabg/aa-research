package androidx.work;

import androidx.lifecycle.LiveData;
import androidx.work.Operation;
import com.google.d.m.a.bm;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class OperationImpl implements Operation {
    private final bm<Operation.State.SUCCESS> future;
    private final LiveData<Operation.State> state;

    public OperationImpl(LiveData<Operation.State> liveData, bm<Operation.State.SUCCESS> bmVar) {
        x.f(liveData, "state");
        x.f(bmVar, "future");
        this.state = liveData;
        this.future = bmVar;
    }

    @Override // androidx.work.Operation
    public bm<Operation.State.SUCCESS> getResult() {
        return this.future;
    }

    @Override // androidx.work.Operation
    public LiveData<Operation.State> getState() {
        return this.state;
    }
}
