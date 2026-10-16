package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Snapshot {
    public static final int PreexistingSnapshotId = 1;
    private boolean disposed;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    private long snapshotId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private Snapshot(long j2, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.snapshotId = j2;
        this.pinningTrackingHandle = j2 != SnapshotKt.INVALID_SNAPSHOT ? SnapshotKt.trackPinning(j2, getInvalid$runtime()) : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        return snapshot.takeNestedSnapshot(lVar);
    }

    public final void closeAndReleasePinning$runtime() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime();
            releasePinnedSnapshotsForCloseLocked$runtime();
        }
    }

    public void closeLocked$runtime() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime();
        }
    }

    public final <T> T enter(a<? extends T> aVar) {
        Snapshot snapshotMakeCurrent = makeCurrent();
        try {
            return aVar.invoke();
        } finally {
            restoreCurrent(snapshotMakeCurrent);
        }
    }

    public final boolean getDisposed$runtime() {
        return this.disposed;
    }

    public int getId() {
        return (int) getSnapshotId();
    }

    public SnapshotIdSet getInvalid$runtime() {
        return this.invalid;
    }

    public abstract MutableScatterSet<StateObject> getModified$runtime();

    public abstract l<Object, ab> getReadObserver();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int getWriteCount$runtime() {
        return 0;
    }

    public abstract l<Object, ab> getWriteObserver$runtime();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime() {
        return this.pinningTrackingHandle >= 0;
    }

    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
        SnapshotKt.threadSnapshot.set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime */
    public abstract void mo7620nestedActivated$runtime(Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime */
    public abstract void mo7621nestedDeactivated$runtime(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime();

    /* renamed from: recordModified$runtime */
    public abstract void mo7622recordModified$runtime(StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime() {
        int i2 = this.pinningTrackingHandle;
        if (i2 >= 0) {
            SnapshotKt.releasePinningLocked(i2);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePinnedSnapshotLocked$runtime();
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.threadSnapshot.set(snapshot);
    }

    public final void setDisposed$runtime(boolean z) {
        this.disposed = z;
    }

    public void setInvalid$runtime(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setSnapshotId$runtime(long j2) {
        this.snapshotId = j2;
    }

    public void setWriteCount$runtime(int i2) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract Snapshot takeNestedSnapshot(l<Object, ab> lVar);

    public final int takeoverPinnedSnapshot$runtime() {
        int i2 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i2;
    }

    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(Snapshot snapshot) {
        if (SnapshotKt.threadSnapshot.get() != this) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(snapshot);
    }

    public final void validateNotDisposed$runtime() {
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot transparentObserverMutableSnapshot) {
            return transparentObserverMutableSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(Companion companion, l lVar, l lVar2, a aVar, int i2, Object obj) {
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            if ((i2 & 2) != 0) {
                lVar2 = null;
            }
            return companion.observe(lVar, lVar2, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observeInternal$runtime$default(Companion companion, l lVar, l lVar2, a aVar, int i2, Object obj) {
            TransparentObserverMutableSnapshot transparentObserverMutableSnapshot;
            l lVar3 = (i2 & 2) != 0 ? null : lVar2;
            l lVar4 = 1 == (i2 & 1) ? null : lVar;
            if (lVar4 == null && lVar3 == null) {
                return aVar.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    l<Object, ab> readObserver$runtime = transparentObserverMutableSnapshot2.getReadObserver$runtime();
                    l<Object, ab> writeObserver$runtime = transparentObserverMutableSnapshot2.getWriteObserver$runtime();
                    try {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(SnapshotKt.mergedReadObserver(lVar4, readObserver$runtime, false | (!((4 & 4) == 0))));
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(lVar3, writeObserver$runtime));
                        return aVar.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver$runtime);
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (snapshot == 0 || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, lVar4, lVar3, true, false);
            } else {
                if (lVar4 == null) {
                    return aVar.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(lVar4);
            }
            try {
                Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    Object objInvoke = aVar.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    return objInvoke;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } finally {
                transparentObserverMutableSnapshot.dispose();
            }
        }

        static final void registerApplyObserver$lambda$1(p pVar) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = i.ae(SnapshotKt.applyObservers, pVar);
            }
        }

        static final void registerGlobalWriteObserver$lambda$1(l lVar) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = i.ae(SnapshotKt.globalWriteObservers, lVar);
            }
            SnapshotKt.advanceGlobalSnapshot();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, l lVar, l lVar2, int i2, Object obj) {
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            if ((i2 & 2) != 0) {
                lVar2 = null;
            }
            return companion.takeMutableSnapshot(lVar, lVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, l lVar, int i2, Object obj) {
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return companion.takeSnapshot(lVar);
        }

        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.threadSnapshot.get(), null, false, 6, null);
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final Snapshot getCurrentThreadSnapshot() {
            return (Snapshot) SnapshotKt.threadSnapshot.get();
        }

        public final <T> T global(a<? extends T> aVar) {
            Snapshot snapshotRemoveCurrent = removeCurrent();
            try {
                return aVar.invoke();
            } finally {
                restoreCurrent(snapshotRemoveCurrent);
            }
        }

        public final boolean isApplyObserverNotificationPending() {
            return SnapshotKt.pendingApplyObserverCount.get() > 0;
        }

        public final boolean isInSnapshot() {
            return SnapshotKt.threadSnapshot.get() != null;
        }

        public final Snapshot makeCurrentNonObservable(Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverMutableSnapshot.setReadObserver$runtime(null);
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverSnapshot.setReadObserver$runtime(null);
                    return snapshot;
                }
            }
            Snapshot snapshotCreateTransparentSnapshotWithNoParentReadObserver$default = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default(snapshot, null, false, 6, null);
            snapshotCreateTransparentSnapshotWithNoParentReadObserver$default.makeCurrent();
            return snapshotCreateTransparentSnapshotWithNoParentReadObserver$default;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime();
        }

        public final <T> T observe(l<Object, ab> lVar, l<Object, ab> lVar2, a<? extends T> aVar) {
            TransparentObserverMutableSnapshot transparentObserverMutableSnapshot;
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    l<Object, ab> readObserver$runtime = transparentObserverMutableSnapshot2.getReadObserver$runtime();
                    l<Object, ab> writeObserver$runtime = transparentObserverMutableSnapshot2.getWriteObserver$runtime();
                    try {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(SnapshotKt.mergedReadObserver(lVar, readObserver$runtime, false | (!((4 & 4) == 0))));
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(lVar2, writeObserver$runtime));
                        return aVar.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver$runtime);
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, lVar, lVar2, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(lVar);
            }
            try {
                Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T tInvoke = aVar.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    return tInvoke;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } finally {
                transparentObserverMutableSnapshot.dispose();
            }
        }

        public final <T> T observeInternal$runtime(l<Object, ab> lVar, l<Object, ab> lVar2, a<? extends T> aVar) {
            TransparentObserverMutableSnapshot transparentObserverMutableSnapshot;
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    l<Object, ab> readObserver$runtime = transparentObserverMutableSnapshot2.getReadObserver$runtime();
                    l<Object, ab> writeObserver$runtime = transparentObserverMutableSnapshot2.getWriteObserver$runtime();
                    try {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(SnapshotKt.mergedReadObserver(lVar, readObserver$runtime, false | (!((4 & 4) == 0))));
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(lVar2, writeObserver$runtime));
                        return aVar.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver$runtime);
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, lVar, lVar2, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(lVar);
            }
            try {
                Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T tInvoke = aVar.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    return tInvoke;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } finally {
                transparentObserverMutableSnapshot.dispose();
            }
        }

        public final int openSnapshotCount() {
            return i.ao(SnapshotKt.openSnapshots).size();
        }

        public final ObserverHandle registerApplyObserver(final p<? super Set<? extends Object>, ? super Snapshot, ab> pVar) {
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = i.ag(SnapshotKt.applyObservers, pVar);
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerApplyObserver$lambda$1(pVar);
                }
            };
        }

        public final ObserverHandle registerGlobalWriteObserver(final l<Object, ab> lVar) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = i.ag(SnapshotKt.globalWriteObservers, lVar);
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda1
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerGlobalWriteObserver$lambda$1(lVar);
                }
            };
        }

        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(Snapshot snapshot) {
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(snapshot);
            }
        }

        public final void restoreNonObservable(Snapshot snapshot, Snapshot snapshot2, l<Object, ab> lVar) {
            if (snapshot != snapshot2) {
                snapshot2.restoreCurrent(snapshot);
                snapshot2.dispose();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(lVar);
            } else if (snapshot instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) snapshot).setReadObserver$runtime(lVar);
            } else {
                Objects.toString(snapshot);
                throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(snapshot)));
            }
        }

        public final void sendApplyNotifications() {
            boolean zHasPendingChanges;
            synchronized (SnapshotKt.getLock()) {
                zHasPendingChanges = SnapshotKt.globalSnapshot.hasPendingChanges();
            }
            if (zHasPendingChanges) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        public final MutableSnapshot takeMutableSnapshot(l<Object, ab> lVar, l<Object, ab> lVar2) {
            MutableSnapshot mutableSnapshotTakeNestedMutableSnapshot;
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = snapshotCurrentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshotCurrentSnapshot : null;
            if (mutableSnapshot == null || (mutableSnapshotTakeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return mutableSnapshotTakeNestedMutableSnapshot;
        }

        public final Snapshot takeSnapshot(l<Object, ab> lVar) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(lVar);
        }

        public final <R> R withMutableSnapshot(a<? extends R> aVar) {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot$default;
                Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
                try {
                    R rInvoke = aVar.invoke();
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    return rInvoke;
                } finally {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
            }
        }

        public final <T> T withoutReadObservation(a<? extends T> aVar) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return aVar.invoke();
            } finally {
                restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot transparentObserverSnapshot) {
            return transparentObserverSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId();
        }
    }

    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public static /* synthetic */ void getReadObserver$annotations() {
    }

    public /* synthetic */ Snapshot(long j2, SnapshotIdSet snapshotIdSet, o oVar) {
        this(j2, snapshotIdSet);
    }

    private /* synthetic */ Snapshot(int i2, SnapshotIdSet snapshotIdSet) {
        this(SnapshotId_jvmKt.toSnapshotId(i2), snapshotIdSet, (o) null);
    }

    public /* synthetic */ Snapshot(int i2, SnapshotIdSet snapshotIdSet, o oVar) {
        this(i2, snapshotIdSet);
    }
}
