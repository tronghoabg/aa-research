package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeList;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.ObservableComposition;
import e.c.d.a;
import h.a.ac;
import h.a.c;
import h.a.i;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition, ObservableComposition {
    public static final int $stable = 8;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final Changes changes;
    private p<? super Composer, ? super Integer, ab> composable;
    private final InternalComposer composer;
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final MutableScatterMap<Object, Object> derivedStates;
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private MutableScatterMap<Object, Object> invalidations;
    private final boolean isRoot;
    private final Changes lateChanges;
    private final MutableScatterMap<Object, Object> observations;
    private final MutableScatterMap<Object, Object> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private PausedCompositionImpl pendingPausedComposition;
    private final RememberEventDispatcher rememberManager;
    private ShouldPauseCallback shouldPause;
    private final SlotStorage slotStorage;
    private int state;
    private final AtomicReference<Object> pendingModifications = new AtomicReference<>(null);
    private final Object lock = new Object();

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier) {
        this.parent = compositionContext;
        this.applier = applier;
        o oVar = null;
        int i2 = 0;
        int i3 = 1;
        this.abandonSet = new MutableScatterSet(i2, i3, oVar).asMutableSet();
        SlotStorage slotStorageCreateSlotStorage = createSlotStorage();
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotStorageCreateSlotStorage.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation$runtime()) {
            slotStorageCreateSlotStorage.collectSourceInformation();
        }
        this.slotStorage = slotStorageCreateSlotStorage;
        this.observations = ScopeMap.m7383constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet<>(i2, i3, oVar);
        this.conditionallyInvalidatedScopes = new MutableScatterSet<>(i2, i3, oVar);
        this.derivedStates = ScopeMap.m7383constructorimpl$default(null, 1, null);
        this.changes = createChangeList();
        this.lateChanges = createChangeList();
        this.observationsProcessed = ScopeMap.m7383constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m7383constructorimpl$default(null, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, compositionContext, 3, null);
        this.rememberManager = new RememberEventDispatcher();
        InternalComposer internalComposerCreateComposer = createComposer();
        compositionContext.registerComposer$runtime(internalComposerCreateComposer);
        this.composer = internalComposerCreateComposer;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$954879418$runtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026d A[PHI: r25 r27 r29 r35
  0x026d: PHI (r25v14 long[]) = (r25v13 long[]), (r25v13 long[]), (r25v15 long[]) binds: [B:114:0x0265, B:116:0x026b, B:111:0x0251] A[DONT_GENERATE, DONT_INLINE]
  0x026d: PHI (r27v7 int) = (r27v6 int), (r27v6 int), (r27v9 int) binds: [B:114:0x0265, B:116:0x026b, B:111:0x0251] A[DONT_GENERATE, DONT_INLINE]
  0x026d: PHI (r29v20 int) = (r29v19 int), (r29v19 int), (r29v22 int) binds: [B:114:0x0265, B:116:0x026b, B:111:0x0251] A[DONT_GENERATE, DONT_INLINE]
  0x026d: PHI (r35v11 long) = (r35v10 long), (r35v10 long), (r35v13 long) binds: [B:114:0x0265, B:116:0x026b, B:111:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e A[EDGE_INSN: B:71:0x017e->B:224:0x0119 BREAK  A[LOOP:13: B:61:0x014c->B:72:0x0180]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyChangesInLocked(androidx.compose.runtime.Changes r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.applyChangesInLocked(androidx.compose.runtime.Changes):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2 A[PHI: r21 r24 r28 r29
  0x00f2: PHI (r21v8 long) = (r21v7 long), (r21v10 long) binds: [B:38:0x00f0, B:35:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r24v4 int) = (r24v3 int), (r24v7 int) binds: [B:38:0x00f0, B:35:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r28v6 long[]) = (r28v5 long[]), (r28v9 long[]) binds: [B:38:0x00f0, B:35:0x00d6] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r29v3 int) = (r29v2 int), (r29v6 int) binds: [B:38:0x00f0, B:35:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void cleanUpDerivedStateObservations() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.cleanUpDerivedStateObservations():void");
    }

    private final boolean clearDeactivated() {
        boolean z;
        synchronized (this.lock) {
            z = true;
            if (this.state != 1) {
                z = false;
            }
            if (z) {
                this.state = 0;
            }
        }
        return z;
    }

    private final void composeInitial(p<? super Composer, ? super Integer, ab> pVar) {
        this.composable = pVar;
        this.parent.composeInitial$runtime(this, pVar);
    }

    private final PausedComposition composeInitialPaused(boolean z, p<? super Composer, ? super Integer, ab> pVar) {
        if (this.pendingPausedComposition != null) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, pVar, z, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    private final void composeInitialWithReuse(p<? super Composer, ? super Integer, ab> pVar) {
        this.composer.startReuseFromRoot$runtime();
        composeInitial(pVar);
        this.composer.endReuseFromRoot$runtime();
    }

    private final Changes createChangeList() {
        return new ChangeList();
    }

    private final InternalComposer createComposer() {
        return new GapComposer(this.applier, this.parent, SlotTableKt.asGapBufferSlotTable(this.slotStorage), this.abandonSet, this.changes, this.lateChanges, this.observerHolder, this);
    }

    private final SlotStorage createSlotStorage() {
        return new SlotTable();
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (x.n(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new e();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AtomicReference<Object> atomicReference = this.pendingModifications;
                Objects.toString(atomicReference);
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: ".concat(String.valueOf(atomicReference)));
                throw new e();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (x.n(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet != null) {
            AtomicReference<Object> atomicReference = this.pendingModifications;
            Objects.toString(atomicReference);
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: ".concat(String.valueOf(atomicReference)));
            throw new e();
        }
        if (this.pendingPausedComposition == null) {
            ComposerKt.composeImmediateRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object andSet = this.pendingModifications.getAndSet(a.p());
        if (x.n(andSet, CompositionKt.PendingApplyNoModifications) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AtomicReference<Object> atomicReference = this.pendingModifications;
            Objects.toString(atomicReference);
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: ".concat(String.valueOf(atomicReference)));
            throw new e();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            addPendingInvalidationsLocked(set, false);
        }
    }

    private final void ensureRunning() {
        int i2 = this.state;
        if (i2 != 0) {
            PreconditionsKt.throwIllegalStateException(i2 != 1 ? i2 != 2 ? i2 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.pendingPausedComposition == null) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime();
    }

    private final <T> T guardChanges(h.g.a.a<? extends T> aVar) {
        try {
            return aVar.invoke();
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                this.abandonChanges();
                throw th3;
            }
        }
    }

    private final <T> T guardInvalidationsLocked(l<? super ScopeMap<RecomposeScopeImpl, Object>, ? extends T> lVar) {
        MutableScatterMap<Object, Object> mutableScatterMapM7290takeInvalidationsafanTW4 = m7290takeInvalidationsafanTW4();
        try {
            return lVar.invoke(ScopeMap.m7380boximpl(mutableScatterMapM7290takeInvalidationsafanTW4));
        } catch (Throwable th) {
            this.invalidations = mutableScatterMapM7290takeInvalidationsafanTW4;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009b A[Catch: all -> 0x00bc, EDGE_INSN: B:61:0x009b->B:45:0x009b BREAK  A[LOOP:0: B:28:0x0057->B:42:0x0094], EDGE_INSN: B:62:0x009b->B:45:0x009b BREAK  A[LOOP:0: B:28:0x0057->B:42:0x0094], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:10:0x001e, B:12:0x0024, B:16:0x002a, B:17:0x0033, B:20:0x0039, B:21:0x003f, B:23:0x0045, B:25:0x0049, B:28:0x0057, B:30:0x0067, B:31:0x006a, B:33:0x0073, B:35:0x007d, B:39:0x008b, B:42:0x0094, B:43:0x0097, B:45:0x009b), top: B:59:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.InvalidationResult invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl r22, androidx.compose.runtime.Anchor r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    private final void invalidateScopeOfLocked(Object obj) {
        int i2;
        Object obj2 = this.observations.get(obj);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
            if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                ScopeMap.m7376addimpl(this.observationsProcessed, obj, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i3 << 3) + i5];
                        if (recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                            ScopeMap.m7376addimpl(this.observationsProcessed, obj, recomposeScopeImpl2);
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    private final CompositionObserver observer() {
        return this.observerHolder.current();
    }

    /* renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final MutableScatterMap<Object, Object> m7290takeInvalidationsafanTW4() {
        MutableScatterMap<Object, Object> mutableScatterMap = this.invalidations;
        this.invalidations = ScopeMap.m7383constructorimpl$default(null, 1, null);
        return mutableScatterMap;
    }

    private final <T> T trackAbandonedValues(h.g.a.a<? extends T> aVar) {
        try {
            return aVar.invoke();
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                try {
                    rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                    rememberEventDispatcher.dispatchAbandons();
                } finally {
                    rememberEventDispatcher.clear();
                }
            }
            throw th;
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime(recomposeScopeImpl, obj);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            rememberEventDispatcher.dispatchAbandons();
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        RememberEventDispatcher rememberEventDispatcher;
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime();
                if (!this.abandonSet.isEmpty()) {
                    rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    abandonChanges();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(p<? super Composer, ? super Integer, ab> pVar) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                try {
                    this.composer.mo7297composeContentZbOJvo$runtime(m7290takeInvalidationsafanTW4(), pVar, this.shouldPause);
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }

    public final int composerStacksSizes$runtime() {
        return this.composer.stacksSize$runtime();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            if (this.pendingPausedComposition != null) {
                PreconditionsKt.throwIllegalStateException("Deactivate is not supported while pausable composition is in progress");
            }
            boolean zIsEmpty = this.slotStorage.isEmpty();
            if (!zIsEmpty || !this.abandonSet.isEmpty()) {
                Trace.INSTANCE.beginSection("Compose:deactivate");
                try {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        if (!zIsEmpty) {
                            this.applier.onBeginChanges();
                            this.slotStorage.deactivateAll(this.rememberManager);
                            this.applier.onEndChanges();
                            rememberEventDispatcher.dispatchRememberObservers();
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    } finally {
                        rememberEventDispatcher.clear();
                    }
                } finally {
                    Trace.INSTANCE.endSection(null);
                }
            }
            ScopeMap.m7381clearimpl(this.observations);
            ScopeMap.m7381clearimpl(this.derivedStates);
            ScopeMap.m7381clearimpl(this.invalidations);
            this.changes.clear();
            this.lateChanges.clear();
            this.composer.deactivate$runtime();
            this.state = 1;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition controlledComposition, int i2, h.g.a.a<? extends R> aVar) {
        if (controlledComposition == null || x.n(controlledComposition, this) || i2 < 0) {
            return aVar.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) controlledComposition;
        this.invalidationDelegateGroup = i2;
        try {
            return aVar.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (this.composer.isComposing$runtime()) {
                PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (this.state != 3) {
                this.state = 3;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$1918065384$runtime();
                Changes deferredChanges$runtime = this.composer.getDeferredChanges$runtime();
                if (deferredChanges$runtime != null) {
                    applyChangesInLocked(deferredChanges$runtime);
                }
                boolean zIsEmpty = this.slotStorage.isEmpty();
                if (!zIsEmpty || !this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        if (!zIsEmpty) {
                            this.applier.onBeginChanges();
                            this.slotStorage.clear(this.rememberManager);
                            this.applier.clear();
                            this.applier.onEndChanges();
                            rememberEventDispatcher.dispatchRememberObservers();
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    } finally {
                        rememberEventDispatcher.clear();
                    }
                }
                this.composer.dispose$runtime();
            }
        }
        this.parent.unregisterComposition$runtime(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState movableContentState) {
        CompositionErrorContextImpl errorContext$runtime = this.composer.getErrorContext$runtime();
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, errorContext$runtime);
            movableContentState.getSlotStorage$runtime().disposeUnusedMovableContent(this.rememberManager, movableContentState);
            rememberEventDispatcher.dispatchRememberObservers();
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    public final List<k<RecomposeScopeImpl, Object>> extractInvalidationsOf$runtime(Anchor anchor) {
        long[] jArr;
        int i2;
        long[] jArr2;
        long j2;
        int i3;
        int i4;
        char c2;
        long j3;
        char c3;
        boolean zIsEmpty;
        Object obj;
        long j4;
        int i5;
        Object obj2;
        if (ScopeMap.m7391getSizeimpl(this.invalidations) <= 0) {
            return ac.f47967a;
        }
        ArrayList arrayList = new ArrayList();
        SlotStorage slotStorage = this.slotStorage;
        MutableScatterMap<Object, Object> mutableScatterMap = this.invalidations;
        long[] jArr3 = mutableScatterMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j5 = jArr3[i6];
                char c4 = 7;
                long j6 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = i6 - length;
                    int i8 = 0;
                    while (true) {
                        i2 = 8 - ((~i7) >>> 31);
                        if (i8 >= i2) {
                            break;
                        }
                        if ((j5 & 255) < 128) {
                            c2 = c4;
                            int i9 = (i6 << 3) + i8;
                            j3 = j6;
                            Object obj3 = mutableScatterMap.keys[i9];
                            Object obj4 = mutableScatterMap.values[i9];
                            x.d(obj3, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj4 instanceof MutableScatterSet) {
                                x.d(obj4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj4;
                                Object[] objArr = mutableScatterSet.elements;
                                int i10 = 8;
                                long[] jArr4 = mutableScatterSet.metadata;
                                jArr2 = jArr3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j2 = j5;
                                    int i11 = 0;
                                    while (true) {
                                        long j7 = jArr4[i11];
                                        i3 = i7;
                                        i4 = i8;
                                        if ((((~j7) << c2) & j7 & j3) != j3) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j7 & 255) < 128) {
                                                    j4 = j7;
                                                    int i14 = (i11 << 3) + i13;
                                                    Object obj5 = objArr[i14];
                                                    i5 = i13;
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj3;
                                                    obj2 = obj3;
                                                    Anchor anchor2 = recomposeScopeImpl.getAnchor();
                                                    if (anchor2 != null && slotStorage.inGroup(anchor, anchor2)) {
                                                        arrayList.add(new k(recomposeScopeImpl, obj5));
                                                        mutableScatterSet.removeElementAt(i14);
                                                    }
                                                } else {
                                                    j4 = j7;
                                                    i5 = i13;
                                                    obj2 = obj3;
                                                }
                                                j7 = j4 >> i10;
                                                i13 = i5 + 1;
                                                obj3 = obj2;
                                            }
                                            obj = obj3;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        i7 = i3;
                                        i8 = i4;
                                        obj3 = obj;
                                        i10 = 8;
                                    }
                                } else {
                                    j2 = j5;
                                    i3 = i7;
                                    i4 = i8;
                                }
                                zIsEmpty = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                j2 = j5;
                                i3 = i7;
                                i4 = i8;
                                x.d(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj3;
                                Anchor anchor3 = recomposeScopeImpl2.getAnchor();
                                if (anchor3 == null || !slotStorage.inGroup(anchor, anchor3)) {
                                    zIsEmpty = false;
                                } else {
                                    arrayList.add(new k(recomposeScopeImpl2, obj4));
                                    zIsEmpty = true;
                                }
                            }
                            if (zIsEmpty) {
                                mutableScatterMap.removeValueAt(i9);
                            }
                            c3 = '\b';
                        } else {
                            jArr2 = jArr3;
                            j2 = j5;
                            i3 = i7;
                            i4 = i8;
                            c2 = c4;
                            j3 = j6;
                            c3 = '\b';
                        }
                        j5 = j2 >> c3;
                        i8 = i4 + 1;
                        jArr3 = jArr2;
                        c4 = c2;
                        j6 = j3;
                        i7 = i3;
                    }
                    jArr = jArr3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    public final List<k<RecomposeScopeImpl, Object>> extractInvalidationsOfGroup$runtime(l<? super Anchor, Boolean> lVar) {
        long[] jArr;
        int i2;
        long[] jArr2;
        long j2;
        int i3;
        int i4;
        char c2;
        long j3;
        char c3;
        boolean zIsEmpty;
        Object obj;
        Object obj2;
        long j4;
        int i5;
        if (ScopeMap.m7391getSizeimpl(this.invalidations) <= 0) {
            return ac.f47967a;
        }
        ArrayList arrayList = new ArrayList();
        MutableScatterMap mutableScatterMap = this.invalidations;
        long[] jArr3 = mutableScatterMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j5 = jArr3[i6];
                char c4 = 7;
                long j6 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = i6 - length;
                    int i8 = 0;
                    while (true) {
                        i2 = 8 - ((~i7) >>> 31);
                        if (i8 >= i2) {
                            break;
                        }
                        if ((j5 & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj3 = mutableScatterMap.keys[i9];
                            c2 = c4;
                            Object obj4 = mutableScatterMap.values[i9];
                            j3 = j6;
                            x.d(obj3, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj4 instanceof MutableScatterSet) {
                                x.d(obj4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj4;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int i10 = 8;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                j2 = j5;
                                if (length2 >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j7 = jArr4[i11];
                                        i3 = i7;
                                        i4 = i8;
                                        if ((((~j7) << c2) & j7 & j3) != j3) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j7 & 255) < 128) {
                                                    obj2 = obj3;
                                                    int i14 = (i11 << 3) + i13;
                                                    j4 = j7;
                                                    Object obj5 = objArr[i14];
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
                                                    i5 = i13;
                                                    Anchor anchor = recomposeScopeImpl.getAnchor();
                                                    if (anchor != null && lVar.invoke(anchor).booleanValue()) {
                                                        arrayList.add(new k(recomposeScopeImpl, obj5));
                                                        mutableScatterSet.removeElementAt(i14);
                                                    }
                                                } else {
                                                    obj2 = obj3;
                                                    j4 = j7;
                                                    i5 = i13;
                                                }
                                                j7 = j4 >> i10;
                                                i13 = i5 + 1;
                                                obj3 = obj2;
                                            }
                                            obj = obj3;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        i7 = i3;
                                        i8 = i4;
                                        obj3 = obj;
                                        i10 = 8;
                                    }
                                } else {
                                    i3 = i7;
                                    i4 = i8;
                                }
                                zIsEmpty = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                j2 = j5;
                                i3 = i7;
                                i4 = i8;
                                x.d(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj3;
                                Anchor anchor2 = recomposeScopeImpl2.getAnchor();
                                if (anchor2 == null || !lVar.invoke(anchor2).booleanValue()) {
                                    zIsEmpty = false;
                                } else {
                                    arrayList.add(new k(recomposeScopeImpl2, obj4));
                                    zIsEmpty = true;
                                }
                            }
                            if (zIsEmpty) {
                                mutableScatterMap.removeValueAt(i9);
                            }
                            c3 = '\b';
                        } else {
                            jArr2 = jArr3;
                            j2 = j5;
                            i3 = i7;
                            i4 = i8;
                            c2 = c4;
                            j3 = j6;
                            c3 = '\b';
                        }
                        j5 = j2 >> c3;
                        i8 = i4 + 1;
                        c4 = c2;
                        j6 = j3;
                        jArr3 = jArr2;
                        i7 = i3;
                    }
                    jArr = jArr3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPauseCallback) {
        ShouldPauseCallback shouldPauseCallback2 = this.shouldPause;
        this.shouldPause = shouldPauseCallback;
        return shouldPauseCallback2;
    }

    public final p<Composer, Integer, ab> getComposable() {
        return this.composable;
    }

    public final InternalComposer getComposer$runtime() {
        return this.composer;
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        if (x.n(compositionServiceKey, CompositionKt.getObservableCompositionServiceKey())) {
            return (T) this;
        }
        return null;
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime() {
        return i.ao(this.conditionallyInvalidatedScopes.asSet());
    }

    public final Set<Object> getDerivedStateDependencies$runtime() {
        return this.derivedStates.asMap().keySet();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = ScopeMap.m7391getSizeimpl(this.invalidations) > 0;
        }
        return z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime;
        synchronized (this.lock) {
            hasPendingChanges$runtime = this.composer.getHasPendingChanges$runtime();
        }
        return hasPendingChanges$runtime;
    }

    public final Set<Object> getObservedObjects$runtime() {
        return this.observations.asMap().keySet();
    }

    public final CompositionObserverHolder getObserverHolder$runtime() {
        return this.observerHolder;
    }

    public final CompositionContext getParent() {
        return this.parent;
    }

    public final boolean getPendingInvalidScopes$runtime() {
        return this.pendingInvalidScopes;
    }

    public final SlotStorage getSlotStorage$runtime() {
        return this.slotStorage;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<k<MovableContentStateReference, MovableContentStateReference>> list) {
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (!x.n(((MovableContentStateReference) list.get(i2).c()).getComposition$runtime(), this)) {
                    ComposerKt.composeImmediateRuntimeError("Check failed");
                    break;
                }
                i2++;
            }
        }
        try {
            this.composer.insertMovableContentReferences(list);
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        CompositionObserver compositionObserverObserver;
        CompositionImpl compositionImpl;
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotStorage.ownsRecomposeScope(recomposeScopeImpl)) {
            synchronized (this.lock) {
                compositionImpl = this.invalidationDelegate;
            }
            return (compositionImpl == null || !compositionImpl.tryImminentInvalidation(recomposeScopeImpl, obj)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
        }
        if (!recomposeScopeImpl.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        InvalidationResult invalidationResultInvalidateChecked = invalidateChecked(recomposeScopeImpl, anchor, obj);
        if (invalidationResultInvalidateChecked != InvalidationResult.IGNORED && (compositionObserverObserver = observer()) != null) {
            compositionObserverObserver.onScopeInvalidated(recomposeScopeImpl, obj);
        }
        return invalidationResultInvalidateChecked;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        this.slotStorage.invalidateAll();
    }

    public final void invalidateGroupsWithKey(int i2) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey = this.slotStorage.invalidateGroupsWithKey(i2);
        }
        if (listInvalidateGroupsWithKey != null) {
            int size = listInvalidateGroupsWithKey.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (listInvalidateGroupsWithKey.get(i3).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime()) {
            this.parent.invalidate$runtime(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.state == 3;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return true;
     */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean observesAnyOf(java.util.Set<? extends java.lang.Object> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L61
            androidx.compose.runtime.collection.ScatterSetWrapper r1 = (androidx.compose.runtime.collection.ScatterSetWrapper) r1
            androidx.collection.ScatterSet r1 = r1.getSet$runtime()
            java.lang.Object[] r2 = r1.elements
            long[] r1 = r1.metadata
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L82
            r6 = r3
        L1a:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5c
            int r9 = r6 - r5
            r10 = r3
        L2d:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r13 = r0.observations
            boolean r13 = androidx.compose.runtime.collection.ScopeMap.m7384containsimpl(r13, r11)
            if (r13 != 0) goto L55
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r13 = r0.derivedStates
            boolean r11 = androidx.compose.runtime.collection.ScopeMap.m7384containsimpl(r13, r11)
            if (r11 != 0) goto L55
            goto L56
        L55:
            return r4
        L56:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L2d
        L5a:
            if (r11 != r12) goto L82
        L5c:
            if (r6 == r5) goto L82
            int r6 = r6 + 1
            goto L1a
        L61:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r5 = r0.observations
            boolean r5 = androidx.compose.runtime.collection.ScopeMap.m7384containsimpl(r5, r2)
            if (r5 != 0) goto L81
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r5 = r0.derivedStates
            boolean r2 = androidx.compose.runtime.collection.ScopeMap.m7384containsimpl(r5, r2)
            if (r2 == 0) goto L67
        L81:
            return r4
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    public final void pausedCompositionFinished$runtime(ScatterSet<RememberObserverHolder> scatterSet) {
        this.pendingPausedComposition = null;
        if (scatterSet != null) {
            this.rememberManager.ignoreForgotten(scatterSet);
            this.state = 2;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(h.g.a.a<ab> aVar) {
        this.composer.prepareCompose$runtime(aVar);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean z;
        synchronized (this.lock) {
            PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
            if (pausedCompositionImpl == null || pausedCompositionImpl.isRecomposing$runtime()) {
                drainPendingModificationsForCompositionLocked();
                try {
                    try {
                        boolean zMo7298recomposeaFTiNEg$runtime = this.composer.mo7298recomposeaFTiNEg$runtime(m7290takeInvalidationsafanTW4(), this.shouldPause);
                        if (!zMo7298recomposeaFTiNEg$runtime) {
                            drainPendingModificationsLocked();
                        }
                        z = zMo7298recomposeaFTiNEg$runtime;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                            try {
                                rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                                rememberEventDispatcher.dispatchAbandons();
                                rememberEventDispatcher.clear();
                            } catch (Throwable th2) {
                                rememberEventDispatcher.clear();
                                throw th2;
                            }
                        }
                        throw th;
                    } catch (Throwable th3) {
                        abandonChanges();
                        throw th3;
                    }
                }
            } else {
                pausedCompositionImpl.markIncomplete$runtime();
                pausedCompositionImpl.getPausableApplier$runtime().markRecomposePending();
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
        this.pendingInvalidScopes = true;
        CompositionObserver compositionObserverObserver = observer();
        if (compositionObserverObserver != null) {
            compositionObserverObserver.onScopeDisposed(recomposeScopeImpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> set) {
        Object obj;
        Set<? extends Object> setV;
        do {
            obj = this.pendingModifications.get();
            if (obj == null || x.n(obj, CompositionKt.PendingApplyNoModifications)) {
                setV = set;
            } else if (obj instanceof Set) {
                setV = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    AtomicReference<Object> atomicReference = this.pendingModifications;
                    Objects.toString(atomicReference);
                    throw new IllegalStateException("corrupt pendingModifications: ".concat(String.valueOf(atomicReference)));
                }
                setV = c.v((Set[]) obj, set);
            }
        } while (!CompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(this.pendingModifications, obj, setV));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void recordReadOf(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r0.getAreChildrenComposing()
            if (r2 != 0) goto La9
            androidx.compose.runtime.InternalComposer r2 = r0.composer
            androidx.compose.runtime.RecomposeScopeImpl r2 = r2.getCurrentRecomposeScope$runtime()
            if (r2 == 0) goto La9
            r3 = 1
            r2.setUsed(r3)
            boolean r4 = r2.recordRead(r1)
            androidx.compose.runtime.tooling.CompositionObserver r5 = r0.observer()
            if (r5 == 0) goto L26
            r6 = r2
            androidx.compose.runtime.RecomposeScope r6 = (androidx.compose.runtime.RecomposeScope) r6
            r5.onReadInScope(r6, r1)
        L26:
            if (r4 != 0) goto La9
            boolean r4 = r1 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
            if (r4 == 0) goto L32
            r4 = r1
            androidx.compose.runtime.snapshots.StateObjectImpl r4 = (androidx.compose.runtime.snapshots.StateObjectImpl) r4
            r4.m7636recordReadInh_f27i8$runtime(r3)
        L32:
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r4 = r0.observations
            androidx.compose.runtime.collection.ScopeMap.m7376addimpl(r4, r1, r2)
            boolean r4 = r1 instanceof androidx.compose.runtime.DerivedState
            if (r4 == 0) goto La9
            r4 = r1
            androidx.compose.runtime.DerivedState r4 = (androidx.compose.runtime.DerivedState) r4
            androidx.compose.runtime.DerivedState$Record r5 = r4.getCurrentRecord()
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r6 = r0.derivedStates
            androidx.compose.runtime.collection.ScopeMap.m7398removeScopeimpl(r6, r1)
            androidx.collection.ObjectIntMap r6 = r5.getDependencies()
            java.lang.Object[] r7 = r6.keys
            long[] r6 = r6.metadata
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La2
            r10 = 0
        L55:
            r11 = r6[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9d
            int r13 = r10 - r8
            r14 = 0
        L68:
            int r15 = ~r13
            int r15 = r15 >>> 31
            r9 = 8
            int r15 = 8 - r15
            if (r14 >= r15) goto L9b
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r11 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r15 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r15 >= 0) goto L94
            int r15 = r10 << 3
            int r15 = r15 + r14
            r15 = r7[r15]
            androidx.compose.runtime.snapshots.StateObject r15 = (androidx.compose.runtime.snapshots.StateObject) r15
            r17 = r9
            boolean r9 = r15 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
            if (r9 == 0) goto L8e
            r9 = r15
            androidx.compose.runtime.snapshots.StateObjectImpl r9 = (androidx.compose.runtime.snapshots.StateObjectImpl) r9
            r9.m7636recordReadInh_f27i8$runtime(r3)
        L8e:
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r9 = r0.derivedStates
            androidx.compose.runtime.collection.ScopeMap.m7376addimpl(r9, r15, r1)
            goto L96
        L94:
            r17 = r9
        L96:
            long r11 = r11 >> r17
            int r14 = r14 + 1
            goto L68
        L9b:
            if (r15 != r9) goto La2
        L9d:
            if (r10 == r8) goto La2
            int r10 = r10 + 1
            goto L55
        La2:
            java.lang.Object r0 = r5.getCurrentValue()
            r2.recordDerivedStateValue(r4, r0)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.recordReadOf(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void recordWriteOf(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.lock
            monitor-enter(r1)
            r17.invalidateScopeOfLocked(r18)     // Catch: java.lang.Throwable -> L66
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r2 = r0.derivedStates     // Catch: java.lang.Throwable -> L66
            r3 = r18
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L64
            boolean r3 = r2 instanceof androidx.collection.MutableScatterSet     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L5f
            androidx.collection.MutableScatterSet r2 = (androidx.collection.MutableScatterSet) r2     // Catch: java.lang.Throwable -> L66
            androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2     // Catch: java.lang.Throwable -> L66
            java.lang.Object[] r3 = r2.elements     // Catch: java.lang.Throwable -> L66
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L66
            int r4 = r2.length     // Catch: java.lang.Throwable -> L66
            int r4 = r4 + (-2)
            if (r4 < 0) goto L64
            r5 = 0
            r6 = r5
        L25:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L66
            long r9 = ~r7     // Catch: java.lang.Throwable -> L66
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5a
            int r9 = r6 - r4
            r10 = r5
        L38:
            int r11 = ~r9     // Catch: java.lang.Throwable -> L66
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L66
            androidx.compose.runtime.DerivedState r11 = (androidx.compose.runtime.DerivedState) r11     // Catch: java.lang.Throwable -> L66
            r0.invalidateScopeOfLocked(r11)     // Catch: java.lang.Throwable -> L66
        L54:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L38
        L58:
            if (r11 != r12) goto L64
        L5a:
            if (r6 == r4) goto L64
            int r6 = r6 + 1
            goto L25
        L5f:
            androidx.compose.runtime.DerivedState r2 = (androidx.compose.runtime.DerivedState) r2     // Catch: java.lang.Throwable -> L66
            r0.invalidateScopeOfLocked(r2)     // Catch: java.lang.Throwable -> L66
        L64:
            monitor-exit(r1)
            return
        L66:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.recordWriteOf(java.lang.Object):void");
    }

    public final void removeDerivedStateObservation$runtime(DerivedState<?> derivedState) {
        if (ScopeMap.m7384containsimpl(this.observations, derivedState)) {
            return;
        }
        ScopeMap.m7398removeScopeimpl(this.derivedStates, derivedState);
    }

    public final void removeObservation$runtime(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        ScopeMap.m7396removeimpl(this.observations, obj, recomposeScopeImpl);
    }

    public final void setComposable(p<? super Composer, ? super Integer, ab> pVar) {
        this.composable = pVar;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(p<? super Composer, ? super Integer, ab> pVar) {
        boolean zClearDeactivated = clearDeactivated();
        ensureRunning();
        if (zClearDeactivated) {
            composeInitialWithReuse(pVar);
        } else {
            composeInitial(pVar);
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(p<? super Composer, ? super Integer, ab> pVar) {
        clearDeactivated();
        ensureRunning();
        composeInitialWithReuse(pVar);
    }

    @Override // androidx.compose.runtime.tooling.ObservableComposition
    public CompositionObserverHandle setObserver(final CompositionObserver compositionObserver) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(compositionObserver);
            this.observerHolder.setRoot(true);
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl.setObserver.2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                CompositionObserver compositionObserver2 = compositionObserver;
                CompositionImpl compositionImpl = CompositionImpl.this;
                synchronized (compositionImpl.lock) {
                    if (x.n(compositionImpl.getObserverHolder$runtime().getObserver(), compositionObserver2)) {
                        compositionImpl.getObserverHolder$runtime().setObserver(null);
                        compositionImpl.getObserverHolder$runtime().setRoot(false);
                    }
                }
            }
        };
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContent(p<? super Composer, ? super Integer, ab> pVar) {
        return composeInitialPaused(clearDeactivated(), pVar);
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContentWithReuse(p<? super Composer, ? super Integer, ab> pVar) {
        clearDeactivated();
        ensureRunning();
        return composeInitialPaused(true, pVar);
    }

    public final void setPendingInvalidScopes$runtime(boolean z) {
        this.pendingInvalidScopes = z;
    }

    public final void updateMovingInvalidations$runtime() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            try {
                this.composer.mo7299updateComposerInvalidationsRY85e9Y$runtime(m7290takeInvalidationsafanTW4());
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime();
                this.slotStorage.verifyWellFormed();
            }
        }
    }

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime$annotations() {
    }

    public static /* synthetic */ void getSlotStorage$runtime$annotations() {
    }

    private final void addPendingInvalidationsLocked(Object obj, boolean z) {
        int i2;
        Object obj2 = this.observations.get(obj);
        if (obj2 == null) {
            return;
        }
        if (obj2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i2 = 8 - ((~i4) >>> 31);
                        if (i5 >= i2) {
                            break;
                        }
                        if ((255 & j2) < 128) {
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i3 << 3) + i5];
                            if (!ScopeMap.m7396removeimpl(this.observationsProcessed, obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                                if (recomposeScopeImpl.isConditional() && !z) {
                                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                } else {
                                    this.invalidatedScopes.add(recomposeScopeImpl);
                                }
                            }
                        }
                        j2 >>= 8;
                        i5++;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i3 == length) {
                    return;
                } else {
                    i3++;
                }
            }
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
            if (ScopeMap.m7396removeimpl(this.observationsProcessed, obj, recomposeScopeImpl2) || recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (recomposeScopeImpl2.isConditional() && !z) {
                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
            } else {
                this.invalidatedScopes.add(recomposeScopeImpl2);
            }
        }
    }
}
