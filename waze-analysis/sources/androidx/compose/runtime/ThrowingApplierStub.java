package androidx.compose.runtime;

import androidx.compose.runtime.Applier;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ThrowingApplierStub implements Applier<Object> {
    public static final int $stable = 0;
    public static final ThrowingApplierStub INSTANCE = new ThrowingApplierStub();

    private ThrowingApplierStub() {
    }

    private final void throwIllegalOperationException() {
        ComposerKt.composeImmediateRuntimeError("ChangeList cannot call the Applier when executing pending changes outside of the applier phase.");
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void apply(p<? super Object, Object, ab> pVar, Object obj) {
        Applier.CC.$default$apply(this, pVar, obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(Object obj) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public Object getCurrent() {
        throwIllegalOperationException();
        return ab.f48028a;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i2, Object obj) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i2, Object obj) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i2, int i3, int i4) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i2, int i3) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void reuse() {
        Applier.CC.$default$reuse(this);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onBeginChanges() {
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onEndChanges() {
    }
}
