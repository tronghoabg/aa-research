package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotContextElement;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;
import kotlinx.coroutines.dc;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotContextElementImpl implements SnapshotContextElement, dc {
    public static final int $stable = 8;
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, iVar);
    }

    @Override // h.c.h
    public i<?> getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, iVar);
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return SnapshotContextElement.DefaultImpls.plus(this, jVar);
    }

    @Override // kotlinx.coroutines.dc
    public void restoreThreadContext(j jVar, Snapshot snapshot) {
        this.snapshot.unsafeLeave(snapshot);
    }

    @Override // kotlinx.coroutines.dc
    public Snapshot updateThreadContext(j jVar) {
        return this.snapshot.unsafeEnter();
    }
}
