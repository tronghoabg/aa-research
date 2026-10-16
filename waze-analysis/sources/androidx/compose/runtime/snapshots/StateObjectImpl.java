package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 8;
    private final AtomicInt readerKind = new AtomicInt(0);

    /* renamed from: isReadIn-h_f27i8$runtime, reason: not valid java name */
    public final boolean m7635isReadInh_f27i8$runtime(int i2) {
        return (this.readerKind.get() & i2) != 0;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return null;
    }

    /* renamed from: recordReadIn-h_f27i8$runtime, reason: not valid java name */
    public final void m7636recordReadInh_f27i8$runtime(int i2) {
        int i3;
        do {
            i3 = this.readerKind.get();
            if ((i3 & i2) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(i3, i3 | i2));
    }
}
