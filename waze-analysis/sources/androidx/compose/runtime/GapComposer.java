package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.composer.GroupKind;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.GapAnchorKt;
import androidx.compose.runtime.composer.gapbuffer.KeyInfo;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeList;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeListKt;
import androidx.compose.runtime.composer.gapbuffer.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.FixupList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.runtime.tooling.ObjectLocation;
import h.a.ac;
import h.a.c;
import h.a.i;
import h.ab;
import h.c.j;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.au;
import h.g.b.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GapComposer extends InternalComposer {
    public static final int $stable = 8;
    private CompositionData _compositionData;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final j applyCoroutineContext;
    private final ComposerChangeListWriter changeListWriter;
    private Changes changes;
    private int childrenComposing;
    private long compositeKeyHashCode;
    private final CompositionImpl composition;
    private int compositionToken;
    private ChangeList deferredChanges;
    private final GapComposer$derivedStateObserver$1 derivedStateObserver;
    private final CompositionErrorContextImpl errorContext;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private GapAnchor insertAnchor;
    private FixupList insertFixups;
    private SlotTable insertTable;
    private boolean inserting;
    private final ArrayList<RecomposeScopeImpl> invalidateStack;
    private boolean isComposing;
    private boolean isDisposed;
    private Changes lateChanges;
    private int[] nodeCountOverrides;
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parentContext;
    private boolean pausable;
    private GapPending pending;
    private PersistentCompositionLocalMap providerCache;
    private MutableIntObjectMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private int rGroupIndex;
    private SlotReader reader;
    private boolean reusing;
    private ShouldPauseCallback shouldPauseCallback;
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private final ArrayList<GapPending> pendingStack = Stack.m7327constructorimpl$default(null, 1, null);
    private final IntStack parentStateStack = new IntStack();
    private final List<Invalidation> invalidations = new ArrayList();
    private final IntStack entersStack = new IntStack();
    private PersistentCompositionLocalMap rootProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    /* compiled from: WazeSource */
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final long compositeKeyHashCode;
        private Set<Set<CompositionData>> inspectionTables;
        private final CompositionObserverHolder observerHolder;
        private final MutableScatterSet<GapComposer> composers = ScatterSetKt.mutableScatterSetOf();
        private final MutableState compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());

        public CompositionContextImpl(long j2, boolean z, boolean z2, CompositionObserverHolder compositionObserverHolder) {
            this.compositeKeyHashCode = j2;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            this.observerHolder = compositionObserverHolder;
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope$delegate.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope$delegate.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime(ControlledComposition controlledComposition, p<? super Composer, ? super Integer, ab> pVar) {
            GapComposer.this.parentContext.composeInitial$runtime(controlledComposition, pVar);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, p<? super Composer, ? super Integer, ab> pVar) {
            return GapComposer.this.parentContext.composeInitialPaused$runtime(controlledComposition, shouldPauseCallback, pVar);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
            GapComposer.this.parentContext.deletedMovableContent$runtime(movableContentStateReference);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void dispose() {
            /*
                r17 = this;
                r0 = r17
                androidx.collection.MutableScatterSet<androidx.compose.runtime.GapComposer> r1 = r0.composers
                boolean r1 = r1.isNotEmpty()
                if (r1 == 0) goto L71
                java.util.Set<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> r1 = r0.inspectionTables
                if (r1 == 0) goto L6c
                androidx.collection.MutableScatterSet<androidx.compose.runtime.GapComposer> r2 = r0.composers
                androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2
                java.lang.Object[] r3 = r2.elements
                long[] r2 = r2.metadata
                int r4 = r2.length
                int r4 = r4 + (-2)
                if (r4 < 0) goto L6c
                r5 = 0
                r6 = r5
            L1d:
                r7 = r2[r6]
                long r9 = ~r7
                r11 = 7
                long r9 = r9 << r11
                long r9 = r9 & r7
                r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r9 = r9 & r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 == 0) goto L67
                int r9 = r6 - r4
                r10 = r5
            L30:
                int r11 = ~r9
                int r11 = r11 >>> 31
                r12 = 8
                int r11 = 8 - r11
                if (r10 >= r11) goto L65
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r7
                r15 = 128(0x80, double:6.3E-322)
                int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r11 >= 0) goto L61
                int r11 = r6 << 3
                int r11 = r11 + r10
                r11 = r3[r11]
                androidx.compose.runtime.GapComposer r11 = (androidx.compose.runtime.GapComposer) r11
                java.util.Iterator r13 = r1.iterator()
            L4d:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L61
                java.lang.Object r14 = r13.next()
                java.util.Set r14 = (java.util.Set) r14
                androidx.compose.runtime.tooling.CompositionData r15 = r11.getCompositionData()
                r14.remove(r15)
                goto L4d
            L61:
                long r7 = r7 >> r12
                int r10 = r10 + 1
                goto L30
            L65:
                if (r11 != r12) goto L6c
            L67:
                if (r6 == r4) goto L6c
                int r6 = r6 + 1
                goto L1d
            L6c:
                androidx.collection.MutableScatterSet<androidx.compose.runtime.GapComposer> r0 = r0.composers
                r0.clear()
            L71:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.GapComposer.CompositionContextImpl.dispose():void");
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime() {
            GapComposer.this.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingCallByInformation$runtime() {
            return GapComposer.this.parentContext.getCollectingCallByInformation$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingSourceInformation$runtime() {
            return this.collectingSourceInformation;
        }

        public final MutableScatterSet<GapComposer> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public long getCompositeKeyHashCode$runtime() {
            return this.compositeKeyHashCode;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public Composition getComposition$runtime() {
            return GapComposer.this.getComposition();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public j getEffectCoroutineContext() {
            return GapComposer.this.parentContext.getEffectCoroutineContext();
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CompositionObserverHolder getObserverHolder$runtime() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getStackTraceEnabled$runtime() {
            return GapComposer.this.parentContext.getStackTraceEnabled$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
            GapComposer.this.parentContext.insertMovableContent$runtime(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime(ControlledComposition controlledComposition) {
            GapComposer gapComposer = GapComposer.this;
            gapComposer.parentContext.invalidate$runtime(gapComposer.getComposition());
            GapComposer.this.parentContext.invalidate$runtime(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
            GapComposer.this.parentContext.invalidateScope$runtime(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier<?> applier) {
            GapComposer.this.parentContext.movableContentStateReleased$runtime(movableContentStateReference, movableContentState, applier);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
            return GapComposer.this.parentContext.movableContentStateResolve$runtime(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, ScatterSet<RecomposeScopeImpl> scatterSet) {
            return GapComposer.this.parentContext.recomposePaused$runtime(controlledComposition, shouldPauseCallback, scatterSet);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime(Set<CompositionData> set) {
            HashSet hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime(Composer composer) {
            x.d(composer, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer");
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime(ControlledComposition controlledComposition) {
            GapComposer.this.parentContext.registerComposition$runtime(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
            GapComposer.this.parentContext.reportPausedScope$runtime(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime(ControlledComposition controlledComposition) {
            GapComposer.this.parentContext.reportRemovedComposition$runtime(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CancellationHandle scheduleFrameEndCallback(a<ab> aVar) {
            return GapComposer.this.parentContext.scheduleFrameEndCallback(aVar);
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime() {
            GapComposer.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime(Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    x.d(composer, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer");
                    set2.remove(((GapComposer) composer).getCompositionData());
                }
            }
            if (composer instanceof GapComposer) {
                this.composers.remove(composer);
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime(ControlledComposition controlledComposition) {
            GapComposer.this.parentContext.unregisterComposition$runtime(controlledComposition);
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            setCompositionLocalScope(persistentCompositionLocalMap);
        }
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.runtime.GapComposer$derivedStateObserver$1] */
    public GapComposer(Applier<?> applier, CompositionContext compositionContext, SlotTable slotTable, Set<RememberObserver> set, Changes changes, Changes changes2, CompositionObserverHolder compositionObserverHolder, CompositionImpl compositionImpl) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changes;
        this.lateChanges = changes2;
        this.observerHolder = compositionObserverHolder;
        this.composition = compositionImpl;
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation$runtime() || compositionContext.getCollectingCallByInformation$runtime();
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.GapComposer$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                this.this$0.childrenComposing--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                this.this$0.childrenComposing++;
            }
        };
        this.invalidateStack = Stack.m7327constructorimpl$default(null, 1, null);
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation$runtime()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, ChangeListKt.asGapBufferChangeList(this.changes));
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            GapAnchor gapAnchorAnchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = gapAnchorAnchor;
            this.insertFixups = new FixupList();
            this.errorContext = new CompositionErrorContextImpl(this);
            j effectCoroutineContext = compositionContext.getEffectCoroutineContext();
            j errorContext$runtime = getErrorContext$runtime();
            this.applyCoroutineContext = effectCoroutineContext.plus(errorContext$runtime == null ? k.f48060a : errorContext$runtime);
        } catch (Throwable th) {
            slotReaderOpenReader2.close();
            throw th;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        Stack.m7325clearimpl(this.pendingStack);
        this.parentStateStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        this.insertFixups.clear();
        this.compositeKeyHashCode = 0L;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.writer.getClosed()) {
            return;
        }
        forceFreshInsertTable();
    }

    private final void addRecomposeScope() {
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (getInserting()) {
            CompositionImpl composition = getComposition();
            x.d(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl(composition);
            Stack.m7337pushimpl(this.invalidateStack, recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            enterRecomposeScope(recomposeScopeImpl2);
            return;
        }
        Invalidation invalidationRemoveLocation = GapComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object next = this.reader.next();
        if (x.n(next, Composer.Companion.getEmpty())) {
            CompositionImpl composition2 = getComposition();
            x.d(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl = new RecomposeScopeImpl(composition2);
            updateValue(recomposeScopeImpl);
        } else {
            x.d(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl = (RecomposeScopeImpl) next;
        }
        if (invalidationRemoveLocation != null) {
            z = true;
        } else if (recomposeScopeImpl.getForcedRecompose()) {
            recomposeScopeImpl.setForcedRecompose(false);
            z = true;
        } else {
            z = false;
        }
        recomposeScopeImpl.setRequiresRecompose(z);
        Stack.m7337pushimpl(this.invalidateStack, recomposeScopeImpl);
        enterRecomposeScope(recomposeScopeImpl);
        if (recomposeScopeImpl.getPaused()) {
            recomposeScopeImpl.setPaused(false);
            recomposeScopeImpl.setResuming(true);
            this.changeListWriter.startResumingScope(recomposeScopeImpl);
            if (this.reusing || !recomposeScopeImpl.getReusing()) {
                return;
            }
            this.reusing = true;
            this.reusingGroup = this.reader.getParent();
            recomposeScopeImpl.setResetReusing(true);
        }
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        Stack.m7325clearimpl(this.invalidateStack);
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final long compositeKeyOf(int i2, int i3, long j2) {
        long jRotateLeft;
        long jRotateLeft2 = 0;
        int i4 = 3;
        int i5 = 0;
        while (i2 >= 0) {
            if (i2 == i3) {
                jRotateLeft = Long.rotateLeft(j2, i5);
            } else {
                int iGroupCompositeKeyPart = groupCompositeKeyPart(this.reader, i2);
                if (iGroupCompositeKeyPart == 126665345) {
                    jRotateLeft = Long.rotateLeft(126665345L, i5);
                } else {
                    jRotateLeft2 = (jRotateLeft2 ^ Long.rotateLeft(iGroupCompositeKeyPart, i4)) ^ Long.rotateLeft(this.reader.hasObjectKey(i2) ? 0 : rGroupIndexOf(i2), i5);
                    i2 = this.reader.parent(i2);
                    i5 = (i5 + 6) % 64;
                    i4 = (i4 + 6) % 64;
                }
            }
            return jRotateLeft ^ jRotateLeft2;
        }
        return jRotateLeft2;
    }

    private final void createFreshInsertTable() {
        if (!this.writer.getClosed()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        forceFreshInsertTable();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int i2) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && x.n(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    x.d(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getSize() > 0) {
            while (i2 > 0) {
                if (this.reader.groupKey(i2) == 202 && x.n(this.reader.groupObjectKey(i2), ComposerKt.getCompositionLocalMap())) {
                    MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
                    if (mutableIntObjectMap == null || (persistentCompositionLocalMap = mutableIntObjectMap.get(i2)) == null) {
                        Object objGroupAux2 = this.reader.groupAux(i2);
                        x.d(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i2 = this.reader.parent(i2);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.rootProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeStackTrace currentStackTrace() {
        if (!this.parentContext.getStackTraceEnabled$runtime()) {
            return null;
        }
        List listB = i.b();
        listB.addAll(ComposeStackTraceBuilderKt.buildTrace$default(this.writer, null, 0, null, 7, null));
        listB.addAll(ComposeStackTraceBuilderKt.buildTrace(this.reader));
        listB.addAll(parentStackTrace$runtime());
        return new ComposeStackTrace(i.a(listB), getSourceMarkersEnabled$runtime());
    }

    /* renamed from: doCompose-aFTiNEg, reason: not valid java name */
    private final void m7295doComposeaFTiNEg(MutableScatterMap<Object, Object> mutableScatterMap, p<? super Composer, ? super Integer, ab> pVar) {
        if (isComposing$runtime()) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        CompositionObserver compositionObserverCurrent = this.observerHolder.current();
        Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.compositionToken = GapComposer$$ExternalSyntheticBackport0.m(SnapshotKt.currentSnapshot().getSnapshotId());
            this.providerUpdates = null;
            mo7299updateComposerInvalidationsRY85e9Y$runtime(mutableScatterMap);
            this.nodeIndex = 0;
            this.isComposing = true;
            if (compositionObserverCurrent != null) {
                compositionObserverCurrent.onBeginComposition(getComposition());
            }
            try {
                startRoot();
                Object objNextSlot = nextSlot();
                if (objNextSlot != pVar && pVar != null) {
                    updateValue(pVar);
                }
                GapComposer$derivedStateObserver$1 gapComposer$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    mutableVectorDerivedStateObservers.add(gapComposer$derivedStateObserver$1);
                    if (pVar != null) {
                        startGroup(200, ComposerKt.getInvocation());
                        Expect_jvmKt.invokeComposable(this, pVar);
                        endGroup();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objNextSlot == null || x.n(objNextSlot, Composer.Companion.getEmpty())) {
                        skipCurrentGroup();
                    } else {
                        startGroup(200, ComposerKt.getInvocation());
                        au.h(objNextSlot, 2);
                        Expect_jvmKt.invokeComposable(this, (p) objNextSlot);
                        endGroup();
                    }
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    endRoot();
                    if (compositionObserverCurrent != null) {
                        compositionObserverCurrent.onEndComposition(getComposition());
                    }
                    this.isComposing = false;
                    this.invalidations.clear();
                    createFreshInsertTable();
                } catch (Throwable th) {
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.INSTANCE.endSection(null);
        }
    }

    private final void doRecordDownsFor(int i2, int i3) {
        if (i2 <= 0 || i2 == i3) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i2), i3);
        if (this.reader.isNode(i2)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, i2));
        }
    }

    private final void end(boolean z) {
        int iHashCode;
        long compositeKeyHashCode;
        long jRotateRight;
        int remainingSlots;
        List<KeyInfo> list;
        List<KeyInfo> list2;
        int iHashCode2;
        long compositeKeyHashCode2;
        long jRotateRight2;
        int iPeek2 = this.parentStateStack.peek2() - 1;
        int i2 = 207;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iGroupKey = this.writer.groupKey(parent);
            Object objGroupObjectKey = this.writer.groupObjectKey(parent);
            Object objGroupAux = this.writer.groupAux(parent);
            if (objGroupObjectKey == null) {
                long j2 = iPeek2;
                if (objGroupAux == null || iGroupKey != 207) {
                    i2 = iGroupKey;
                } else if (!x.n(objGroupAux, Composer.Companion.getEmpty())) {
                    iHashCode2 = objGroupAux.hashCode();
                    compositeKeyHashCode2 = getCompositeKeyHashCode() ^ j2;
                }
                jRotateRight2 = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ j2, 3) ^ i2, 3);
                this.compositeKeyHashCode = jRotateRight2;
            } else if (objGroupObjectKey instanceof Enum) {
                iHashCode2 = ((Enum) objGroupObjectKey).ordinal();
                compositeKeyHashCode2 = getCompositeKeyHashCode();
            } else {
                iHashCode2 = objGroupObjectKey.hashCode();
                compositeKeyHashCode2 = getCompositeKeyHashCode();
            }
            jRotateRight2 = Long.rotateRight(Long.rotateRight(compositeKeyHashCode2, 3) ^ iHashCode2, 3);
            this.compositeKeyHashCode = jRotateRight2;
        } else {
            int parent2 = this.reader.getParent();
            int iGroupKey2 = this.reader.groupKey(parent2);
            Object objGroupObjectKey2 = this.reader.groupObjectKey(parent2);
            Object objGroupAux2 = this.reader.groupAux(parent2);
            if (objGroupObjectKey2 == null) {
                long j3 = iPeek2;
                if (objGroupAux2 == null || iGroupKey2 != 207) {
                    i2 = iGroupKey2;
                } else if (!x.n(objGroupAux2, Composer.Companion.getEmpty())) {
                    iHashCode = objGroupAux2.hashCode();
                    compositeKeyHashCode = getCompositeKeyHashCode() ^ j3;
                }
                jRotateRight = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ j3, 3) ^ i2, 3);
                this.compositeKeyHashCode = jRotateRight;
            } else if (objGroupObjectKey2 instanceof Enum) {
                iHashCode = ((Enum) objGroupObjectKey2).ordinal();
                compositeKeyHashCode = getCompositeKeyHashCode();
            } else {
                iHashCode = objGroupObjectKey2.hashCode();
                compositeKeyHashCode = getCompositeKeyHashCode();
            }
            jRotateRight = Long.rotateRight(Long.rotateRight(compositeKeyHashCode, 3) ^ iHashCode, 3);
            this.compositeKeyHashCode = jRotateRight;
        }
        int i3 = this.groupNodeCount;
        GapPending gapPending = this.pending;
        if (gapPending != null && gapPending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = gapPending.getKeyInfos();
            List<KeyInfo> used = gapPending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            MutableScatterSet mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            int size = used.size();
            int size2 = keyInfos.size();
            int i4 = 0;
            int i5 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i4 < size2) {
                KeyInfo keyInfo = keyInfos.get(i4);
                if (setFastToSet.contains(keyInfo)) {
                    list = keyInfos;
                    if (mutableScatterSetMutableScatterSetOf.contains(keyInfo)) {
                        i4++;
                    } else if (i5 < size) {
                        KeyInfo keyInfo2 = used.get(i5);
                        if (keyInfo2 != keyInfo) {
                            int iNodePositionOf = gapPending.nodePositionOf(keyInfo2);
                            mutableScatterSetMutableScatterSetOf.add(keyInfo2);
                            if (iNodePositionOf != iUpdatedNodeCountOf) {
                                int iUpdatedNodeCountOf2 = gapPending.updatedNodeCountOf(keyInfo2);
                                list2 = used;
                                this.changeListWriter.moveNode(gapPending.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + gapPending.getStartIndex(), iUpdatedNodeCountOf2);
                                gapPending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                            } else {
                                list2 = used;
                            }
                        } else {
                            list2 = used;
                            i4++;
                        }
                        i5++;
                        iUpdatedNodeCountOf += gapPending.updatedNodeCountOf(keyInfo2);
                        keyInfos = list;
                        used = list2;
                    }
                } else {
                    i4++;
                    this.changeListWriter.removeNode(gapPending.nodePositionOf(keyInfo) + gapPending.getStartIndex(), keyInfo.getNodes());
                    gapPending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    list = keyInfos;
                    GapComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                }
                keyInfos = list;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (remainingSlots = this.reader.getRemainingSlots()) > 0) {
            this.changeListWriter.trimValues(remainingSlots);
        }
        int i6 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i6, this.reader.skipGroup());
            GapComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        if (inserting) {
            if (z) {
                this.insertFixups.endNodeInsert();
                i3 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close(true);
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i3);
                }
            }
        } else {
            boolean z2 = false;
            if (z) {
                this.changeListWriter.moveUp();
                z2 = true;
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i3 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i3);
            }
            if (true == z2) {
                i3 = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i3, inserting);
    }

    private final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        this.providersInvalid = GapComposerKt.asBool(this.providersInvalidStack.pop());
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean z, GapPending gapPending) {
        Stack.m7337pushimpl(this.pendingStack, this.pending);
        this.pending = gapPending;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void enterRecomposeScope(RecomposeScopeImpl recomposeScopeImpl) {
        recomposeScopeImpl.start(this.compositionToken);
        CompositionObserver compositionObserverCurrent = this.observerHolder.current();
        if (compositionObserverCurrent != null) {
            compositionObserverCurrent.onScopeEnter(recomposeScopeImpl);
        }
    }

    private final void exitGroup(int i2, boolean z) {
        GapPending gapPending = (GapPending) Stack.m7336popimpl(this.pendingStack);
        if (gapPending != null && !z) {
            gapPending.setGroupIndex(gapPending.getGroupIndex() + 1);
        }
        this.pending = gapPending;
        this.nodeIndex = this.parentStateStack.pop() + i2;
        this.rGroupIndex = this.parentStateStack.pop();
        this.groupNodeCount = this.parentStateStack.pop() + i2;
    }

    private final l<Composition, ab> exitRecomposeScope(RecomposeScopeImpl recomposeScopeImpl) {
        CompositionObserver compositionObserverCurrent = this.observerHolder.current();
        if (compositionObserverCurrent != null) {
            compositionObserverCurrent.onScopeExit(recomposeScopeImpl);
        }
        return recomposeScopeImpl.end(this.compositionToken);
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (!Stack.m7332isEmptyimpl(this.pendingStack)) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
    }

    private final void forceFreshInsertTable() {
        SlotTable slotTable = new SlotTable();
        if (getSourceMarkersEnabled$runtime()) {
            slotTable.collectSourceInformation();
        }
        if (this.parentContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final int groupCompositeKeyPart(SlotReader slotReader, int i2) {
        if (slotReader.hasObjectKey(i2)) {
            Object objGroupObjectKey = slotReader.groupObjectKey(i2);
            if (objGroupObjectKey != null) {
                return objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : objGroupObjectKey.hashCode();
            }
            return 0;
        }
        int iGroupKey = slotReader.groupKey(i2);
        if (iGroupKey != 207) {
            return iGroupKey;
        }
        Object objGroupAux = slotReader.groupAux(i2);
        if (objGroupAux == null || x.n(objGroupAux, Composer.Companion.getEmpty())) {
            return 207;
        }
        return objGroupAux.hashCode();
    }

    private final void insertMovableContentGuarded(List<h.k<MovableContentStateReference, MovableContentStateReference>> list) throws Throwable {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter2;
        ChangeList changeList2;
        SlotReader slotReader;
        int[] iArr;
        MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap;
        ChangeList changeList3;
        int i2;
        int i3;
        GapAnchor gapAnchorAnchor;
        SlotStorage slotStorage$runtime;
        List<h.k<MovableContentStateReference, MovableContentStateReference>> list2 = list;
        ChangeList changeListAsGapBufferChangeList = ChangeListKt.asGapBufferChangeList(this.lateChanges);
        ComposerChangeListWriter composerChangeListWriter3 = this.changeListWriter;
        ChangeList changeList4 = composerChangeListWriter3.getChangeList();
        try {
            composerChangeListWriter3.setChangeList(changeListAsGapBufferChangeList);
            this.changeListWriter.resetSlots();
            int size = list2.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                try {
                    h.k<MovableContentStateReference, MovableContentStateReference> kVar = list2.get(i5);
                    final MovableContentStateReference movableContentStateReference = (MovableContentStateReference) kVar.a();
                    MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) kVar.b();
                    GapAnchor gapAnchorAsGapAnchor = GapAnchorKt.asGapAnchor(movableContentStateReference.getAnchor$runtime());
                    SlotTable slotTableAsGapBufferSlotTable = SlotTableKt.asGapBufferSlotTable(movableContentStateReference.getSlotStorage$runtime());
                    int iAnchorIndex = slotTableAsGapBufferSlotTable.anchorIndex(gapAnchorAsGapAnchor);
                    IntRef intRef = new IntRef(i4, 1, null);
                    this.changeListWriter.determineMovableContentNodeIndex(intRef, gapAnchorAsGapAnchor);
                    if (movableContentStateReference2 == null) {
                        if (x.n(slotTableAsGapBufferSlotTable, this.insertTable)) {
                            createFreshInsertTable();
                        }
                        final SlotReader slotReaderOpenReader = slotTableAsGapBufferSlotTable.openReader();
                        try {
                            slotReaderOpenReader.reposition(iAnchorIndex);
                            this.changeListWriter.moveReaderToAbsolute(iAnchorIndex);
                            final ChangeList changeList5 = new ChangeList();
                            recomposeMovableContent$default(this, null, null, null, null, new a() { // from class: androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda2
                                @Override // h.g.a.a
                                public final Object invoke() {
                                    return GapComposer.insertMovableContentGuarded$lambda$0$0$0$0(this.f$0, changeList5, slotReaderOpenReader, movableContentStateReference);
                                }
                            }, 15, null);
                            this.changeListWriter.includeOperationsIn(changeList5, intRef);
                            slotReaderOpenReader.close();
                            composerChangeListWriter2 = composerChangeListWriter3;
                            changeList2 = changeList4;
                            i2 = size;
                            i3 = i5;
                        } finally {
                        }
                    } else {
                        MovableContentState movableContentStateMovableContentStateResolve$runtime = this.parentContext.movableContentStateResolve$runtime(movableContentStateReference2);
                        SlotTable slotTableAsGapBufferSlotTable2 = (movableContentStateMovableContentStateResolve$runtime == null || (slotStorage$runtime = movableContentStateMovableContentStateResolve$runtime.getSlotStorage$runtime()) == null) ? null : SlotTableKt.asGapBufferSlotTable(slotStorage$runtime);
                        SlotTable slotTableAsGapBufferSlotTable3 = slotTableAsGapBufferSlotTable2 == null ? SlotTableKt.asGapBufferSlotTable(movableContentStateReference2.getSlotStorage$runtime()) : slotTableAsGapBufferSlotTable2;
                        GapAnchor gapAnchorAsGapAnchor2 = GapAnchorKt.asGapAnchor((slotTableAsGapBufferSlotTable2 == null || (gapAnchorAnchor = slotTableAsGapBufferSlotTable2.anchor(0)) == null) ? movableContentStateReference2.getAnchor$runtime() : gapAnchorAnchor);
                        List<? extends Object> listCollectNodesFrom = GapComposerKt.collectNodesFrom(slotTableAsGapBufferSlotTable3, gapAnchorAsGapAnchor2);
                        if (!listCollectNodesFrom.isEmpty()) {
                            this.changeListWriter.copyNodesToNewAnchorLocation(listCollectNodesFrom, intRef);
                            if (x.n(slotTableAsGapBufferSlotTable, this.slotTable)) {
                                int iAnchorIndex2 = this.slotTable.anchorIndex(gapAnchorAsGapAnchor);
                                updateNodeCount(iAnchorIndex2, updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                            }
                        }
                        this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateMovableContentStateResolve$runtime, this.parentContext, movableContentStateReference2, movableContentStateReference);
                        SlotReader slotReaderOpenReader2 = slotTableAsGapBufferSlotTable3.openReader();
                        try {
                            SlotReader slotReader2 = this.reader;
                            int[] iArr2 = this.nodeCountOverrides;
                            MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                this.reader = slotReaderOpenReader2;
                                int iAnchorIndex3 = slotTableAsGapBufferSlotTable3.anchorIndex(GapAnchorKt.asGapAnchor(gapAnchorAsGapAnchor2));
                                slotReaderOpenReader2.reposition(iAnchorIndex3);
                                this.changeListWriter.moveReaderToAbsolute(iAnchorIndex3);
                                ChangeList changeList6 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
                                ChangeList changeList7 = composerChangeListWriter4.getChangeList();
                                try {
                                    composerChangeListWriter4.setChangeList(changeList6);
                                    slotReader = slotReaderOpenReader2;
                                    try {
                                        ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                        i2 = size;
                                        boolean implicitRootStart = composerChangeListWriter5.getImplicitRootStart();
                                        try {
                                            composerChangeListWriter5.setImplicitRootStart(false);
                                            try {
                                                i3 = i5;
                                                iArr = iArr2;
                                                composerChangeListWriter2 = composerChangeListWriter3;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                changeList2 = changeList4;
                                                changeList3 = changeList7;
                                                try {
                                                    recomposeMovableContent(movableContentStateReference2.getComposition$runtime(), movableContentStateReference.getComposition$runtime(), Integer.valueOf(slotReader.getCurrentGroup()), movableContentStateReference2.getInvalidations$runtime(), new a() { // from class: androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3
                                                        @Override // h.g.a.a
                                                        public final Object invoke() {
                                                            return GapComposer.insertMovableContentGuarded$lambda$0$0$1$0$0$0$0(this.f$0, movableContentStateReference);
                                                        }
                                                    });
                                                    try {
                                                        composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                        try {
                                                            composerChangeListWriter4.setChangeList(changeList3);
                                                            this.changeListWriter.includeOperationsIn(changeList6, intRef);
                                                            try {
                                                                this.reader = slotReader2;
                                                                this.nodeCountOverrides = iArr;
                                                                this.providerUpdates = mutableIntObjectMap;
                                                                try {
                                                                    slotReader.close();
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    composerChangeListWriter = composerChangeListWriter2;
                                                                    changeList = changeList2;
                                                                    composerChangeListWriter.setChangeList(changeList);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                slotReader.close();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            this.reader = slotReader2;
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = mutableIntObjectMap;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        composerChangeListWriter4.setChangeList(changeList3);
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                iArr = iArr2;
                                                changeList3 = changeList7;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            iArr = iArr2;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                            changeList3 = changeList7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        iArr = iArr2;
                                        mutableIntObjectMap = mutableIntObjectMap2;
                                        changeList3 = changeList7;
                                        composerChangeListWriter4.setChangeList(changeList3);
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    iArr = iArr2;
                                    slotReader = slotReaderOpenReader2;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                iArr = iArr2;
                                slotReader = slotReaderOpenReader2;
                                mutableIntObjectMap = mutableIntObjectMap2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            slotReader = slotReaderOpenReader2;
                        }
                    }
                    this.changeListWriter.skipToEndOfCurrentGroup();
                    i5 = i3 + 1;
                    list2 = list;
                    size = i2;
                    composerChangeListWriter3 = composerChangeListWriter2;
                    changeList4 = changeList2;
                    i4 = 0;
                } catch (Throwable th12) {
                    th = th12;
                    composerChangeListWriter2 = composerChangeListWriter3;
                    changeList2 = changeList4;
                }
            }
            ComposerChangeListWriter composerChangeListWriter6 = composerChangeListWriter3;
            ChangeList changeList8 = changeList4;
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter6.setChangeList(changeList8);
        } catch (Throwable th13) {
            th = th13;
            composerChangeListWriter = composerChangeListWriter3;
            changeList = changeList4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab insertMovableContentGuarded$lambda$0$0$0$0(GapComposer gapComposer, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        ComposerChangeListWriter composerChangeListWriter = gapComposer.changeListWriter;
        ChangeList changeList2 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList);
            SlotReader slotReader2 = gapComposer.reader;
            int[] iArr = gapComposer.nodeCountOverrides;
            MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = gapComposer.providerUpdates;
            gapComposer.nodeCountOverrides = null;
            gapComposer.providerUpdates = null;
            try {
                gapComposer.reader = slotReader;
                ComposerChangeListWriter composerChangeListWriter2 = gapComposer.changeListWriter;
                boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                try {
                    composerChangeListWriter2.setImplicitRootStart(false);
                    gapComposer.invokeMovableContentLambda(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals$runtime(), movableContentStateReference.getParameter$runtime(), true);
                    composerChangeListWriter.setChangeList(changeList2);
                    return ab.f48028a;
                } finally {
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                }
            } finally {
                gapComposer.reader = slotReader2;
                gapComposer.nodeCountOverrides = iArr;
                gapComposer.providerUpdates = mutableIntObjectMap;
            }
        } catch (Throwable th) {
            composerChangeListWriter.setChangeList(changeList2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab insertMovableContentGuarded$lambda$0$0$1$0$0$0$0(GapComposer gapComposer, MovableContentStateReference movableContentStateReference) {
        gapComposer.invokeMovableContentLambda(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals$runtime(), movableContentStateReference.getParameter$runtime(), true);
        return ab.f48028a;
    }

    private final int insertedGroupVirtualIndex(int i2) {
        return (-2) - i2;
    }

    private final void invokeMovableContentLambda(final MovableContent<Object> movableContent, PersistentCompositionLocalMap persistentCompositionLocalMap, final Object obj, boolean z) {
        startMovableGroup(MovableContentKt.movableContentKey, movableContent);
        updateSlot(obj);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345L;
            boolean z2 = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !x.n(this.reader.getGroupAux(), persistentCompositionLocalMap)) {
                z2 = true;
            }
            if (z2) {
                recordProviderUpdate(persistentCompositionLocalMap);
            }
            m7296startAzEfcrM(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m7412getGroup9udXigM(), persistentCompositionLocalMap);
            this.providerCache = null;
            if (!getInserting() || z) {
                boolean z3 = this.providersInvalid;
                this.providersInvalid = z2;
                Expect_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(-59194059, true, new p() { // from class: androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda4
                    @Override // h.g.a.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return GapComposer.invokeMovableContentLambda$lambda$0(movableContent, obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }));
                this.providersInvalid = z3;
            } else {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime(new MovableContentStateReference(movableContent, obj, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), ac.f47967a, currentCompositionLocalScope(), null));
            }
        } catch (Throwable th) {
            try {
                ComposeStackTraceKt.attachComposeStackTrace(th, new a() { // from class: androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda5
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return this.f$0.currentStackTrace();
                    }
                });
                throw th;
            } finally {
                endGroup();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                endMovableGroup();
            }
        }
    }

    static final ab invokeMovableContentLambda$lambda$0(MovableContent movableContent, Object obj, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-59194059, i2, -1, "androidx.compose.runtime.GapComposer.invokeMovableContentLambda.<anonymous> (GapComposer.kt:2265)");
            }
            movableContent.getContent().invoke(obj, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    private final Object nodeAt(SlotReader slotReader, int i2) {
        return slotReader.node(i2);
    }

    private final int nodeIndexOf(int i2, int i3, int i4, int i5) {
        int iParent = this.reader.parent(i3);
        while (iParent != i4 && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (true == this.reader.isNode(iParent)) {
            i5 = 0;
        }
        if (iParent == i3) {
            return i5;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.reader.nodeCount(i3)) + i5;
        loop1: while (i5 < iUpdatedNodeCount && iParent != i2) {
            iParent++;
            while (iParent < i2) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (i2 >= iGroupSize) {
                    i5 += this.reader.isNode(iParent) ? 1 : updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return i5;
    }

    private final int rGroupIndexOf(int i2) {
        int iParent = this.reader.parent(i2) + 1;
        int i3 = 0;
        while (iParent < i2) {
            if (!this.reader.hasObjectKey(iParent)) {
                i3++;
            }
            iParent += this.reader.groupSize(iParent);
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:3:0x0007, B:5:0x0015, B:7:0x0027, B:9:0x002f, B:8:0x002b, B:12:0x0036, B:14:0x003c, B:16:0x0042), top: B:22:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <R> R recomposeMovableContent(androidx.compose.runtime.ControlledComposition r7, androidx.compose.runtime.ControlledComposition r8, java.lang.Integer r9, java.util.List<? extends h.k<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object>> r10, h.g.a.a<? extends R> r11) {
        /*
            r6 = this;
            boolean r0 = r6.isComposing$runtime()
            int r1 = r6.nodeIndex
            r2 = 1
            r6.isComposing = r2     // Catch: java.lang.Throwable -> L4b
            r2 = 0
            r6.nodeIndex = r2     // Catch: java.lang.Throwable -> L4b
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L4b
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L4b
        L13:
            if (r2 >= r3) goto L32
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L4b
            h.k r4 = (h.k) r4     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r4.a()     // Catch: java.lang.Throwable -> L4b
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2b
            r6.tryImminentInvalidation$runtime(r5, r4)     // Catch: java.lang.Throwable -> L4b
            goto L2f
        L2b:
            r4 = 0
            r6.tryImminentInvalidation$runtime(r5, r4)     // Catch: java.lang.Throwable -> L4b
        L2f:
            int r2 = r2 + 1
            goto L13
        L32:
            if (r7 == 0) goto L42
            if (r9 == 0) goto L3b
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L4b
            goto L3c
        L3b:
            r9 = -1
        L3c:
            java.lang.Object r7 = r7.delegateInvalidations(r8, r9, r11)     // Catch: java.lang.Throwable -> L4b
            if (r7 != 0) goto L46
        L42:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L4b
        L46:
            r6.isComposing = r0
            r6.nodeIndex = r1
            return r7
        L4b:
            r7 = move-exception
            r6.isComposing = r0
            r6.nodeIndex = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.GapComposer.recomposeMovableContent(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, h.g.a.a):java.lang.Object");
    }

    static /* synthetic */ Object recomposeMovableContent$default(GapComposer gapComposer, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, a aVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list = ac.f47967a;
        }
        List list2 = list;
        int i3 = i2 & 4;
        int i4 = i2 & 2;
        int i5 = i2 & 1;
        Integer num2 = i3 != 0 ? null : num;
        return gapComposer.recomposeMovableContent(1 != i5 ? controlledComposition : null, i4 != 0 ? null : controlledComposition2, num2, list2, aVar);
    }

    private final void recomposeToGroupEnd() {
        boolean zIsComposing$runtime = isComposing$runtime();
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i2 = this.nodeIndex;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i3 = this.groupNodeCount;
        int i4 = this.rGroupIndex;
        Invalidation invalidationFirstInRange = GapComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        boolean z = false;
        int i5 = parent;
        while (invalidationFirstInRange != null) {
            List<Invalidation> list = this.invalidations;
            int location = invalidationFirstInRange.getLocation();
            RecomposeScopeImpl scope = invalidationFirstInRange.getScope();
            GapComposerKt.removeLocation(list, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i5, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i2);
                this.rGroupIndex = rGroupIndexOf(currentGroup);
                this.compositeKeyHashCode = compositeKeyOf(this.reader.parent(currentGroup), parent, compositeKeyHashCode);
                this.providerCache = null;
                scope.compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                z = true;
                i5 = currentGroup;
            } else {
                Stack.m7337pushimpl(this.invalidateStack, scope);
                CompositionObserver compositionObserverCurrent = this.observerHolder.current();
                if (compositionObserverCurrent != null) {
                    try {
                        RecomposeScopeImpl recomposeScopeImpl = scope;
                        compositionObserverCurrent.onScopeEnter(recomposeScopeImpl);
                        scope.rereadTrackedInstances();
                        compositionObserverCurrent.onScopeExit(recomposeScopeImpl);
                    } catch (Throwable th) {
                        compositionObserverCurrent.onScopeExit(scope);
                        throw th;
                    }
                } else {
                    scope.rereadTrackedInstances();
                }
                Stack.m7336popimpl(this.invalidateStack);
            }
            invalidationFirstInRange = GapComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        }
        if (z) {
            recordUpsAndDowns(i5, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i2 + iUpdatedNodeCount;
            this.groupNodeCount = i3 + iUpdatedNodeCount;
            this.rGroupIndex = i4;
        } else {
            skipReaderToGroupEnd();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = zIsComposing$runtime;
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private final void recordInsert(GapAnchor gapAnchor) {
        boolean zIsEmpty = this.insertFixups.isEmpty();
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        if (zIsEmpty) {
            composerChangeListWriter.insertSlots(gapAnchor, this.insertTable);
        } else {
            composerChangeListWriter.insertSlots(gapAnchor, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
            this.providerUpdates = mutableIntObjectMap;
        }
        mutableIntObjectMap.set(this.reader.getCurrentGroup(), persistentCompositionLocalMap);
    }

    private final void recordUpsAndDowns(int i2, int i3, int i4) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = GapComposerKt.nearestCommonRootOf(slotReader, i2, i3, i4);
        while (i2 > 0 && i2 != iNearestCommonRootOf) {
            if (slotReader.isNode(i2)) {
                this.changeListWriter.moveUp();
            }
            i2 = slotReader.parent(i2);
        }
        doRecordDownsFor(i3, iNearestCommonRootOf);
    }

    private final int rememberObserverGroupIndex() {
        return this.rGroupIndex - 1;
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            getComposition().updateMovingInvalidations$runtime();
            ChangeList changeList = new ChangeList();
            setDeferredChanges$runtime(changeList);
            SlotReader slotReaderOpenReader = this.slotTable.openReader();
            try {
                this.reader = slotReaderOpenReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                } finally {
                    composerChangeListWriter.setChangeList(changeList2);
                }
            } finally {
                slotReaderOpenReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int i2) {
        boolean zIsNode = this.reader.isNode(i2);
        if (zIsNode) {
            this.changeListWriter.endNodeMovement();
            this.changeListWriter.moveDown(this.reader.node(i2));
        }
        reportFreeMovableContent$reportGroup(this, i2, i2, zIsNode, 0);
        this.changeListWriter.endNodeMovement();
        if (zIsNode) {
            this.changeListWriter.moveUp();
        }
    }

    private static final MovableContentStateReference reportFreeMovableContent$createMovableContentReferenceForGroup(GapComposer gapComposer, int i2, List<MovableContentStateReference> list) {
        Object objGroupObjectKey = gapComposer.reader.groupObjectKey(i2);
        x.d(objGroupObjectKey, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        MovableContent movableContent = (MovableContent) objGroupObjectKey;
        Object objGroupGet = gapComposer.reader.groupGet(i2, 0);
        GapAnchor gapAnchorAnchor = gapComposer.reader.anchor(i2);
        int iGroupSize = gapComposer.reader.groupSize(i2) + i2;
        ArrayList arrayList = new ArrayList();
        List<Invalidation> list2 = gapComposer.invalidations;
        for (int iFindInsertLocation = GapComposerKt.findInsertLocation(list2, i2); iFindInsertLocation < list2.size(); iFindInsertLocation++) {
            Invalidation invalidation = list2.get(iFindInsertLocation);
            if (invalidation.getLocation() >= iGroupSize) {
                break;
            }
            arrayList.add(new h.k(invalidation.getScope(), invalidation.getInstances()));
        }
        return new MovableContentStateReference(movableContent, objGroupGet, gapComposer.getComposition(), gapComposer.slotTable, gapAnchorAnchor, arrayList, gapComposer.currentCompositionLocalScope(i2), list);
    }

    private static final MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor(GapComposer gapComposer, int i2) {
        int iGroupKey = gapComposer.reader.groupKey(i2);
        Object objGroupObjectKey = gapComposer.reader.groupObjectKey(i2);
        ArrayList arrayList = null;
        if (iGroupKey != 126665345 || !(objGroupObjectKey instanceof MovableContent)) {
            return null;
        }
        if (gapComposer.reader.containsMark(i2)) {
            ArrayList arrayList2 = new ArrayList();
            reportFreeMovableContent$movableContentReferenceFor$traverseGroups(gapComposer, arrayList2, i2);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return reportFreeMovableContent$createMovableContentReferenceForGroup(gapComposer, i2, arrayList);
    }

    private static final void reportFreeMovableContent$movableContentReferenceFor$traverseGroups(GapComposer gapComposer, List<MovableContentStateReference> list, int i2) {
        int iGroupSize = gapComposer.reader.groupSize(i2) + i2;
        int iGroupSize2 = i2 + 1;
        while (iGroupSize2 < iGroupSize) {
            if (gapComposer.reader.hasMark(iGroupSize2)) {
                MovableContentStateReference movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(gapComposer, iGroupSize2);
                if (movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor != null) {
                    list.add(movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor);
                }
            } else if (gapComposer.reader.containsMark(iGroupSize2)) {
                reportFreeMovableContent$movableContentReferenceFor$traverseGroups(gapComposer, list, iGroupSize2);
            }
            iGroupSize2 += gapComposer.reader.groupSize(iGroupSize2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int reportFreeMovableContent$reportGroup(androidx.compose.runtime.GapComposer r18, int r19, int r20, boolean r21, int r22) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.GapComposer.reportFreeMovableContent$reportGroup(androidx.compose.runtime.GapComposer, int, int, boolean, int):int");
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    private final List<ComposeStackTraceFrame> stackTraceForGroup(int i2, Integer num) {
        SlotReader slotReaderOpenReader = this.slotTable.openReader();
        try {
            return ComposeStackTraceBuilderKt.traceForGroup(slotReaderOpenReader, i2, num);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    static final boolean stackTraceForValue$lambda$0(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        RememberObserverHolder rememberObserverHolder = obj2 instanceof RememberObserverHolder ? (RememberObserverHolder) obj2 : null;
        return (rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null) == obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* renamed from: start-AzEfcrM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m7296startAzEfcrM(int r11, java.lang.Object r12, int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.GapComposer.m7296startAzEfcrM(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final void startGroup(int i2) {
        m7296startAzEfcrM(i2, null, GroupKind.Companion.m7412getGroup9udXigM(), null);
    }

    private final void startReaderGroup(boolean z, Object obj) {
        if (z) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            this.changeListWriter.updateAuxData(obj);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime();
        PersistentCompositionLocalMap compositionLocalScope$runtime = this.parentContext.getCompositionLocalScope$runtime();
        this.providersInvalidStack.push(GapComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(compositionLocalScope$runtime);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime();
        }
        if (!getSourceMarkersEnabled$runtime()) {
            setSourceMarkersEnabled$runtime(this.parentContext.getCollectingSourceInformation$runtime());
        }
        if (getSourceMarkersEnabled$runtime()) {
            CompositionLocal<CompositionErrorContext> localCompositionErrorContext = CompositionErrorContextKt.getLocalCompositionErrorContext();
            x.d(localCompositionErrorContext, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            compositionLocalScope$runtime = compositionLocalScope$runtime.putValue(localCompositionErrorContext, new StaticValueHolder(getErrorContext$runtime()));
        }
        this.rootProvider = compositionLocalScope$runtime;
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(compositionLocalScope$runtime, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(getCompositionData());
            this.parentContext.recordInspectionTable$runtime(set);
        }
        startGroup(GapComposer$$ExternalSyntheticBackport0.m(this.parentContext.getCompositeKeyHashCode$runtime()));
    }

    private final void updateCompositeKeyWhenWeEnterGroup(int i2, int i3, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((Enum) obj).ordinal(), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ obj.hashCode(), 3);
                return;
            }
        }
        long j2 = i3;
        if (obj2 != null && i2 == 207) {
            if (!x.n(obj2, Composer.Companion.getEmpty())) {
                this.compositeKeyHashCode = j2 ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ obj2.hashCode(), 3);
                return;
            }
            i2 = 207;
        }
        this.compositeKeyHashCode = j2 ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i2, 3);
    }

    private final void updateCompositeKeyWhenWeEnterGroupKeyHash(int i2, int i3) {
        this.compositeKeyHashCode = i3 ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i2, 3);
    }

    private final void updateCompositeKeyWhenWeExitGroup(int i2, int i3, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ ((Enum) obj).ordinal(), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ obj.hashCode(), 3);
                return;
            }
        }
        long j2 = i3;
        if (obj2 != null && i2 == 207) {
            if (!x.n(obj2, Composer.Companion.getEmpty())) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(j2 ^ getCompositeKeyHashCode(), 3) ^ obj2.hashCode(), 3);
                return;
            }
            i2 = 207;
        }
        this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(j2 ^ getCompositeKeyHashCode(), 3) ^ i2, 3);
    }

    private final void updateCompositeKeyWhenWeExitGroupKeyHash(int i2, int i3) {
        this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ i3, 3) ^ i2, 3);
    }

    private final void updateNodeCount(int i2, int i3) {
        if (updatedNodeCount(i2) != i3) {
            if (i2 < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(i2, i3);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getSize()];
                c.ay(iArr, -1, 0, 6);
                this.nodeCountOverrides = iArr;
            }
            iArr[i2] = i3;
        }
    }

    private final void updateNodeCountOverrides(int i2, int i3) {
        int iUpdatedNodeCount = updatedNodeCount(i2);
        if (iUpdatedNodeCount != i3) {
            int iM7330getSizeimpl = Stack.m7330getSizeimpl(this.pendingStack) - 1;
            while (i2 != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(i2) + (i3 - iUpdatedNodeCount);
                updateNodeCount(i2, iUpdatedNodeCount2);
                int i4 = iM7330getSizeimpl;
                while (true) {
                    if (i4 < 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    GapPending gapPending = (GapPending) Stack.m7335peekimpl(this.pendingStack, i4);
                    if (gapPending != null && gapPending.updateNodeCount(i2, iUpdatedNodeCount2)) {
                        iM7330getSizeimpl = i5;
                        break;
                    }
                    i4 = i5;
                }
                SlotReader slotReader = this.reader;
                if (i2 < 0) {
                    i2 = slotReader.getParent();
                } else if (slotReader.isNode(i2)) {
                    return;
                } else {
                    i2 = this.reader.parent(i2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builderBuilder2 = persistentCompositionLocalMap.builder2();
        builderBuilder2.putAll(persistentCompositionLocalMap2);
        ?? Build2 = builderBuilder2.build2();
        startGroup(204, ComposerKt.getProviderMaps());
        updateSlot(Build2);
        updateSlot(persistentCompositionLocalMap2);
        endGroup();
        return Build2;
    }

    private final void updateSlot(Object obj) {
        nextSlot();
        updateValue(obj);
    }

    private final int updatedNodeCount(int i2) {
        int i3;
        if (i2 >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i3 = iArr[i2]) < 0) ? this.reader.nodeCount(i2) : i3;
        }
        MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
        if (mutableIntIntMap == null || !mutableIntIntMap.containsKey(i2)) {
            return 0;
        }
        return mutableIntIntMap.get(i2);
    }

    private final void validateNodeExpected() {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final <R> R withReader(SlotReader slotReader, a<? extends R> aVar) {
        SlotReader slotReader2 = this.reader;
        int[] iArr = this.nodeCountOverrides;
        MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            this.reader = slotReader;
            return aVar.invoke();
        } finally {
            this.reader = slotReader2;
            this.nodeCountOverrides = iArr;
            this.providerUpdates = mutableIntObjectMap;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v, p<? super T, ? super V, ab> pVar) {
        if (getInserting()) {
            this.insertFixups.updateNode(v, pVar);
        } else {
            this.changeListWriter.updateNode(v, pVar);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        GapComposer gapComposer;
        startGroup(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        ReusableGapRememberObserverHolder reusableGapRememberObserverHolder = objNextSlot instanceof RememberObserverHolder ? (RememberObserverHolder) objNextSlot : null;
        if (reusableGapRememberObserverHolder == null) {
            gapComposer = this;
            reusableGapRememberObserverHolder = new ReusableGapRememberObserverHolder(new CompositionContextHolder(gapComposer.new CompositionContextImpl(getCompositeKeyHashCode(), this.forceRecomposeScopes, getSourceMarkersEnabled$runtime(), getComposition().getObserverHolder$runtime())), -1);
            gapComposer.updateValue(reusableGapRememberObserverHolder);
        } else {
            gapComposer = this;
        }
        RememberObserver wrapped = reusableGapRememberObserverHolder.getWrapped();
        x.d(wrapped, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer.CompositionContextHolder");
        CompositionContextHolder compositionContextHolder = (CompositionContextHolder) wrapped;
        compositionContextHolder.getRef().updateCompositionLocalScope(gapComposer.currentCompositionLocalScope());
        gapComposer.endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z, a<? extends T> aVar) {
        T t = (T) nextSlotForCache();
        if (t != Composer.Companion.getEmpty() && !z) {
            return t;
        }
        T tInvoke = aVar.invoke();
        updateCachedValue(tInvoke);
        return tInvoke;
    }

    @Override // androidx.compose.runtime.InternalComposer, androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double d2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Double) && d2 == ((Number) objNextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d2));
        return true;
    }

    @Override // androidx.compose.runtime.InternalComposer, androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(Object obj) {
        if (nextSlot() == obj) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void changesApplied$runtime() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        setSourceMarkersEnabled$runtime(true);
        this.slotTable.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.writer.updateToTableMaps();
    }

    @Override // androidx.compose.runtime.InternalComposer
    /* renamed from: composeContent--ZbOJvo$runtime, reason: not valid java name */
    public void mo7297composeContentZbOJvo$runtime(MutableScatterMap<Object, Object> mutableScatterMap, p<? super Composer, ? super Integer, ab> pVar, ShouldPauseCallback shouldPauseCallback) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPauseCallback;
        try {
            m7295doComposeaFTiNEg(mutableScatterMap, pVar);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <T> T consume(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), compositionLocal);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(a<? extends T> aVar) {
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int iPeek = this.parentStateStack.peek();
        SlotWriter slotWriter = this.writer;
        GapAnchor gapAnchorAnchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.createAndInsertNode(aVar, iPeek, gapAnchorAnchor);
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void deactivate$runtime() {
        Stack.m7325clearimpl(this.invalidateStack);
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z) {
        if (this.groupNodeCount != 0) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!z) {
            skipReaderToGroupEnd();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.changeListWriter.deactivateCurrentGroup();
        GapComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        setSourceMarkersEnabled$runtime(false);
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void dispose$runtime() {
        Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime(this);
            deactivate$runtime();
            getApplier().clear();
            this.isDisposed = true;
        } finally {
            Trace.INSTANCE.endSection(null);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime == null || !currentRecomposeScope$runtime.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProvider() {
        endGroup();
        endGroup();
        this.providersInvalid = GapComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = GapComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        GapAnchor gapAnchorAnchor;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = Stack.m7333isNotEmptyimpl(this.invalidateStack) ? (RecomposeScopeImpl) Stack.m7336popimpl(this.invalidateStack) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.setRequiresRecompose(false);
            l<Composition, ab> lVarExitRecomposeScope = exitRecomposeScope(recomposeScopeImpl2);
            if (lVarExitRecomposeScope != null) {
                this.changeListWriter.endCompositionScope(lVarExitRecomposeScope, getComposition());
            }
            if (recomposeScopeImpl2.getResuming()) {
                recomposeScopeImpl2.setResuming(false);
                this.changeListWriter.endResumingScope(recomposeScopeImpl2);
                recomposeScopeImpl2.setReusing(false);
                if (recomposeScopeImpl2.getResetReusing()) {
                    recomposeScopeImpl2.setResetReusing(false);
                    if (this.reusingGroup == this.reader.getParent()) {
                        this.reusing = false;
                        this.reusingGroup = -1;
                    }
                }
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.getSkipped$runtime() && (recomposeScopeImpl2.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    gapAnchorAnchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    gapAnchorAnchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl2.setAnchor(gapAnchorAnchor);
            }
            recomposeScopeImpl2.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void endReuseFromRoot$runtime() {
        if (isComposing$runtime() || this.reusingGroup != 0) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i2) {
        if (i2 < 0) {
            int i3 = -i2;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i3) {
                    return;
                } else {
                    end(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= i2) {
                    return;
                } else {
                    end(slotReader.isNode(parent2));
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean forceRecomposeScopes$runtime() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public j getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean getAreChildrenComposing$runtime() {
        return this.childrenComposing > 0;
    }

    @Override // androidx.compose.runtime.Composer
    public long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        CompositionData compositionData = this._compositionData;
        if (compositionData != null) {
            return compositionData;
        }
        GapCompositionDataImpl gapCompositionDataImpl = new GapCompositionDataImpl(getComposition());
        this._compositionData = gapCompositionDataImpl;
        return gapCompositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @Override // androidx.compose.runtime.InternalComposer
    public RecomposeScopeImpl getCurrentRecomposeScope$runtime() {
        if (this.childrenComposing != 0) {
            return null;
        }
        ArrayList<RecomposeScopeImpl> arrayList = this.invalidateStack;
        if (Stack.m7333isNotEmptyimpl(arrayList)) {
            return (RecomposeScopeImpl) Stack.m7334peekimpl(arrayList);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!getSkipping() || this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        return currentRecomposeScope$runtime != null && currentRecomposeScope$runtime.getDefaultsInvalid();
    }

    @Override // androidx.compose.runtime.InternalComposer
    public CompositionErrorContextImpl getErrorContext$runtime() {
        if (this.parentContext.getStackTraceEnabled$runtime()) {
            return this.errorContext;
        }
        return null;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean getHasPendingChanges$runtime() {
        return this.changes.isNotEmpty();
    }

    public final SlotTable getInsertTable$runtime() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    public final SlotReader getReader$runtime() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime();
    }

    @Override // androidx.compose.runtime.Composer
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            return currentRecomposeScope$runtime.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || currentRecomposeScope$runtime.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean getSourceMarkersEnabled$runtime() {
        return this.sourceMarkersEnabled;
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContent(MovableContent<?> movableContent, Object obj) {
        x.d(movableContent, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope(), obj, false);
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContentReferences(List<h.k<MovableContentStateReference, MovableContentStateReference>> list) {
        Trace.INSTANCE.beginSection("Compose:insertMovableContent");
        try {
            try {
                insertMovableContentGuarded(list);
                cleanUpCompose();
            } catch (Throwable th) {
                abortRoot();
                throw th;
            }
        } finally {
            Trace.INSTANCE.endSection(null);
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean isComposing$runtime() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Object joinKey(Object obj, Object obj2) {
        Object key = GapComposerKt.getKey(this.reader.getGroupObjectKey(), obj, obj2);
        return key == null ? new JoinedKey(obj, obj2) : key;
    }

    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserverHolder)) ? next : Composer.Companion.getEmpty();
    }

    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserverHolder)) ? next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next : Composer.Companion.getEmpty();
    }

    @Override // androidx.compose.runtime.InternalComposer
    public int parentKey$runtime() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    @Override // androidx.compose.runtime.InternalComposer
    public List<ComposeStackTraceFrame> parentStackTrace$runtime() {
        Composition composition$runtime = this.parentContext.getComposition$runtime();
        CompositionImpl compositionImpl = composition$runtime instanceof CompositionImpl ? (CompositionImpl) composition$runtime : null;
        if (compositionImpl == null) {
            return ac.f47967a;
        }
        Integer numFindSubcompositionContextGroup = ComposeStackTraceBuilderKt.findSubcompositionContextGroup(SlotTableKt.asGapBufferSlotTable(compositionImpl.getSlotStorage$runtime()), this.parentContext);
        if (numFindSubcompositionContextGroup == null) {
            return ac.f47967a;
        }
        SlotReader slotReaderOpenReader = SlotTableKt.asGapBufferSlotTable(compositionImpl.getSlotStorage$runtime()).openReader();
        try {
            List<ComposeStackTraceFrame> listTraceForGroup = ComposeStackTraceBuilderKt.traceForGroup(slotReaderOpenReader, numFindSubcompositionContextGroup.intValue(), 0);
            slotReaderOpenReader.close();
            return i.af(listTraceForGroup, compositionImpl.getComposer$runtime().parentStackTrace$runtime());
        } catch (Throwable th) {
            slotReaderOpenReader.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void prepareCompose$runtime(a<ab> aVar) {
        if (isComposing$runtime()) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            aVar.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    /* renamed from: recompose-aFTiNEg$runtime, reason: not valid java name */
    public boolean mo7298recomposeaFTiNEg$runtime(MutableScatterMap<Object, Object> mutableScatterMap, ShouldPauseCallback shouldPauseCallback) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (ScopeMap.m7391getSizeimpl(mutableScatterMap) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = shouldPauseCallback;
        try {
            m7295doComposeaFTiNEg(mutableScatterMap, null);
            this.shouldPauseCallback = null;
            return this.changes.isNotEmpty();
        } catch (Throwable th) {
            this.shouldPauseCallback = null;
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(a<ab> aVar) {
        this.changeListWriter.sideEffect(aVar);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setUsed(true);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public CancellationHandle scheduleFrameEndCallback(a<ab> aVar) {
        return this.parentContext.scheduleFrameEndCallback(aVar);
    }

    public void setDeferredChanges$runtime(ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    public final void setInsertTable$runtime(SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    public final void setReader$runtime(SlotReader slotReader) {
        this.reader = slotReader;
    }

    public void setSourceMarkersEnabled$runtime(boolean z) {
        this.sourceMarkersEnabled = z;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean shouldExecute(boolean z, int i2) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        if ((i2 & 1) != 0 || (!getInserting() && !this.reusing)) {
            return z || !getSkipping();
        }
        ShouldPauseCallback shouldPauseCallback = this.shouldPauseCallback;
        if (shouldPauseCallback == null || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || !shouldPauseCallback.shouldPause() || currentRecomposeScope$runtime.getResuming()) {
            return true;
        }
        currentRecomposeScope$runtime.setUsed(true);
        currentRecomposeScope$runtime.setReusing(this.reusing);
        currentRecomposeScope$runtime.setPaused(true);
        this.changeListWriter.rememberPausingScope(currentRecomposeScope$runtime);
        this.parentContext.reportPausedScope$runtime(currentRecomposeScope$runtime);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void skipCurrentGroup() {
        /*
            r13 = this;
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r13.invalidations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            r13.skipGroup()
            return
        Lc:
            androidx.compose.runtime.composer.gapbuffer.SlotReader r0 = r13.reader
            int r1 = r0.getGroupKey()
            java.lang.Object r2 = r0.getGroupObjectKey()
            java.lang.Object r3 = r0.getGroupAux()
            int r4 = r13.rGroupIndex
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 3
            if (r2 != 0) goto L5c
            long r7 = (long) r4
            if (r3 == 0) goto L4a
            if (r1 != r5) goto L4a
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            boolean r1 = h.g.b.x.n(r3, r1)
            if (r1 != 0) goto L49
            int r1 = r3.hashCode()
            long r9 = r13.getCompositeKeyHashCode()
            long r9 = java.lang.Long.rotateLeft(r9, r6)
            long r11 = (long) r1
            long r9 = r9 ^ r11
            long r9 = java.lang.Long.rotateLeft(r9, r6)
            long r7 = r7 ^ r9
            r13.compositeKeyHashCode = r7
            r1 = r5
            goto L7f
        L49:
            r1 = r5
        L4a:
            long r9 = r13.getCompositeKeyHashCode()
            long r9 = java.lang.Long.rotateLeft(r9, r6)
            long r11 = (long) r1
            long r9 = r9 ^ r11
            long r9 = java.lang.Long.rotateLeft(r9, r6)
            long r7 = r7 ^ r9
        L59:
            r13.compositeKeyHashCode = r7
            goto L7f
        L5c:
            boolean r7 = r2 instanceof java.lang.Enum
            if (r7 == 0) goto L6c
            r7 = r2
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            long r8 = r13.getCompositeKeyHashCode()
            goto L74
        L6c:
            int r7 = r2.hashCode()
            long r8 = r13.getCompositeKeyHashCode()
        L74:
            long r8 = java.lang.Long.rotateLeft(r8, r6)
            long r10 = (long) r7
            long r8 = r8 ^ r10
            long r7 = java.lang.Long.rotateLeft(r8, r6)
            goto L59
        L7f:
            boolean r7 = r0.isNode()
            r8 = 0
            r13.startReaderGroup(r7, r8)
            r13.recomposeToGroupEnd()
            r0.endGroup()
            if (r2 != 0) goto Lc8
            long r7 = (long) r4
            if (r3 == 0) goto Lb7
            if (r1 != r5) goto Lb7
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            boolean r0 = h.g.b.x.n(r3, r0)
            if (r0 == 0) goto La1
            goto Lb8
        La1:
            int r0 = r3.hashCode()
            long r1 = r13.getCompositeKeyHashCode()
            long r1 = r1 ^ r7
        Laa:
            long r1 = java.lang.Long.rotateRight(r1, r6)
            long r3 = (long) r0
            long r1 = r1 ^ r3
            long r0 = java.lang.Long.rotateRight(r1, r6)
        Lb4:
            r13.compositeKeyHashCode = r0
            return
        Lb7:
            r5 = r1
        Lb8:
            long r0 = r13.getCompositeKeyHashCode()
            long r0 = r0 ^ r7
            long r0 = java.lang.Long.rotateRight(r0, r6)
            long r2 = (long) r5
            long r0 = r0 ^ r2
            long r0 = java.lang.Long.rotateRight(r0, r6)
            goto Lb4
        Lc8:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Ld7
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
            long r1 = r13.getCompositeKeyHashCode()
            goto Laa
        Ld7:
            int r0 = r2.hashCode()
            long r1 = r13.getCompositeKeyHashCode()
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.GapComposer.skipCurrentGroup():void");
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (this.groupNodeCount != 0) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            currentRecomposeScope$runtime.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String str) {
        if (getInserting() && getSourceMarkersEnabled$runtime()) {
            this.writer.recordGroupSourceInformation(str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() && getSourceMarkersEnabled$runtime()) {
            this.writer.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i2, String str) {
        if (getInserting() && getSourceMarkersEnabled$runtime()) {
            this.writer.recordGrouplessCallSourceInformationStart(i2, str);
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public ComposeStackTrace stackTraceForValue$runtime(final Object obj) {
        ObjectLocation objectLocationFindLocation = ComposeStackTraceBuilderKt.findLocation(this.slotTable, new l() { // from class: androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(GapComposer.stackTraceForValue$lambda$0(obj, obj2));
            }
        });
        return new ComposeStackTrace(objectLocationFindLocation != null ? i.af(stackTraceForGroup(objectLocationFindLocation.component1(), objectLocationFindLocation.component2()), parentStackTrace$runtime()) : ac.f47967a, getSourceMarkersEnabled$runtime());
    }

    @Override // androidx.compose.runtime.InternalComposer
    public int stacksSize$runtime() {
        return this.entersStack.tos + Stack.m7330getSizeimpl(this.invalidateStack) + this.providersInvalidStack.tos + Stack.m7330getSizeimpl(this.pendingStack) + this.parentStateStack.tos;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m7296startAzEfcrM(ComposerKt.defaultsKey, null, GroupKind.Companion.m7412getGroup9udXigM(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i2, Object obj) {
        m7296startAzEfcrM(i2, obj, GroupKind.Companion.m7412getGroup9udXigM(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m7296startAzEfcrM(125, null, GroupKind.Companion.m7413getNode9udXigM(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProvider(ProvidedValue<?> providedValue) {
        ValueHolder<?> valueHolder;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        Object objRememberedValue = rememberedValue();
        if (x.n(objRememberedValue, Composer.Companion.getEmpty())) {
            valueHolder = null;
        } else {
            x.d(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            valueHolder = (ValueHolder) objRememberedValue;
        }
        CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
        x.d(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        x.d(providedValue, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        ValueHolder<?> valueHolderUpdatedStateOf$runtime = compositionLocal.updatedStateOf$runtime(providedValue, valueHolder);
        boolean zN = x.n(valueHolderUpdatedStateOf$runtime, valueHolder);
        if (!zN) {
            updateRememberedValue(valueHolderUpdatedStateOf$runtime);
        }
        boolean z = false;
        if (getInserting()) {
            if (providedValue.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal)) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objGroupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            x.d(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux;
            if (!(getSkipping() && zN) && (providedValue.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal))) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime);
            } else if ((zN && !this.providersInvalid) || !this.providersInvalid) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMap;
            }
            if (this.reusing || persistentCompositionLocalMap != persistentCompositionLocalMapCurrentCompositionLocalScope) {
                z = true;
            }
        }
        if (z && !getInserting()) {
            recordProviderUpdate(persistentCompositionLocalMapCurrentCompositionLocalScope);
        }
        this.providersInvalidStack.push(GapComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z;
        this.providerCache = persistentCompositionLocalMapCurrentCompositionLocalScope;
        m7296startAzEfcrM(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m7412getGroup9udXigM(), persistentCompositionLocalMapCurrentCompositionLocalScope);
    }

    @Override // androidx.compose.runtime.Composer
    public void startProviders(ProvidedValue<?>[] providedValueArr) {
        PersistentCompositionLocalMap persistentCompositionLocalMapUpdateProviderMapGroup;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        boolean z = true;
        if (getInserting()) {
            persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(providedValueArr, persistentCompositionLocalMapCurrentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            x.d(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            x.d(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupGet2;
            PersistentCompositionLocalMap persistentCompositionLocalMapUpdateCompositionMap = CompositionLocalMapKt.updateCompositionMap(providedValueArr, persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMap2);
            if (!getSkipping() || this.reusing || !x.n(persistentCompositionLocalMap2, persistentCompositionLocalMapUpdateCompositionMap)) {
                persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMapUpdateCompositionMap);
                if (!this.reusing && x.n(persistentCompositionLocalMapUpdateProviderMapGroup, persistentCompositionLocalMap)) {
                }
                if (z && !getInserting()) {
                    recordProviderUpdate(persistentCompositionLocalMapUpdateProviderMapGroup);
                }
                this.providersInvalidStack.push(GapComposerKt.asInt(this.providersInvalid));
                this.providersInvalid = z;
                this.providerCache = persistentCompositionLocalMapUpdateProviderMapGroup;
                m7296startAzEfcrM(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m7412getGroup9udXigM(), persistentCompositionLocalMapUpdateProviderMapGroup);
            }
            skipGroup();
            persistentCompositionLocalMapUpdateProviderMapGroup = persistentCompositionLocalMap;
        }
        z = false;
        if (z) {
            recordProviderUpdate(persistentCompositionLocalMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(GapComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z;
        this.providerCache = persistentCompositionLocalMapUpdateProviderMapGroup;
        m7296startAzEfcrM(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m7412getGroup9udXigM(), persistentCompositionLocalMapUpdateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceGroup(int i2) {
        if (this.pending != null) {
            m7296startAzEfcrM(i2, null, GroupKind.Companion.m7412getGroup9udXigM(), null);
            return;
        }
        validateNodeNotExpected();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i2, 3) ^ this.rGroupIndex;
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.writer.startGroup(i2, Composer.Companion.getEmpty());
            enterGroup(false, null);
            return;
        }
        if (slotReader.getGroupKey() == i2 && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i3 = this.nodeIndex;
            int currentGroup = slotReader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i3, slotReader.skipGroup());
            GapComposerKt.removeRange(this.invalidations, currentGroup, slotReader.getCurrentGroup());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        SlotWriter slotWriter = this.writer;
        slotWriter.beginInsert();
        int currentGroup2 = slotWriter.getCurrentGroup();
        slotWriter.startGroup(i2, Composer.Companion.getEmpty());
        this.insertAnchor = slotWriter.anchor(currentGroup2);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i2) {
        m7296startAzEfcrM(i2, null, GroupKind.Companion.m7412getGroup9udXigM(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Composer startRestartGroup(int i2) {
        startReplaceGroup(i2);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i2, Object obj) {
        if (!getInserting() && this.reader.getGroupKey() == i2 && !x.n(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m7296startAzEfcrM(i2, null, GroupKind.Companion.m7412getGroup9udXigM(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m7296startAzEfcrM(125, null, GroupKind.Companion.m7414getReusableNode9udXigM(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void startReuseFromRoot$runtime() {
        this.reusingGroup = 0;
        this.reusing = true;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public boolean tryImminentInvalidation$runtime(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = GapAnchorKt.asGapAnchor(anchor).toIndexFor(this.reader.getTable$runtime());
        if (!isComposing$runtime() || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        GapComposerKt.insertIfMissing(this.invalidations, indexFor, recomposeScopeImpl, obj);
        return true;
    }

    public final void updateCachedValue(Object obj) {
        if (obj instanceof RememberObserver) {
            GapRememberObserverHolder gapRememberObserverHolder = new GapRememberObserverHolder((RememberObserver) obj, rememberObserverGroupIndex());
            if (getInserting()) {
                this.changeListWriter.remember(gapRememberObserverHolder);
            }
            this.abandonSet.add(obj);
            obj = gapRememberObserverHolder;
        }
        updateValue(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    @Override // androidx.compose.runtime.InternalComposer
    /* renamed from: updateComposerInvalidations-RY85e9Y$runtime, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7299updateComposerInvalidationsRY85e9Y$runtime(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r19) {
        /*
            r18 = this;
            r0 = r18
            java.util.List<androidx.compose.runtime.Invalidation> r1 = r0.invalidations
            java.lang.String r2 = "<this>"
            h.g.b.x.f(r1, r2)
            int r1 = r1.size()
        Ld:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L49
            java.util.List<androidx.compose.runtime.Invalidation> r3 = r0.invalidations
            java.lang.Object r3 = r3.get(r1)
            androidx.compose.runtime.Invalidation r3 = (androidx.compose.runtime.Invalidation) r3
            androidx.compose.runtime.RecomposeScopeImpl r4 = r3.getScope()
            androidx.compose.runtime.Anchor r4 = r4.getAnchor()
            if (r4 == 0) goto L28
            androidx.compose.runtime.composer.gapbuffer.GapAnchor r2 = androidx.compose.runtime.composer.gapbuffer.GapAnchorKt.asGapAnchor(r4)
            goto L29
        L28:
            r2 = 0
        L29:
            if (r2 == 0) goto L43
            boolean r4 = r2.getValid()
            if (r4 == 0) goto L43
            int r4 = r3.getLocation()
            int r5 = r2.getLocation$runtime()
            if (r4 == r5) goto Ld
            int r2 = r2.getLocation$runtime()
            r3.setLocation(r2)
            goto Ld
        L43:
            java.util.List<androidx.compose.runtime.Invalidation> r2 = r0.invalidations
            r2.remove(r1)
            goto Ld
        L49:
            r1 = r19
            androidx.collection.ScatterMap r1 = (androidx.collection.ScatterMap) r1
            java.lang.Object[] r3 = r1.keys
            java.lang.Object[] r4 = r1.values
            long[] r1 = r1.metadata
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto Lb4
            r7 = 0
        L59:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto Laf
            int r10 = r7 - r5
            int r10 = ~r10
            r11 = 0
        L6d:
            int r12 = r10 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto Lad
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto La9
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r3[r12]
            r12 = r4[r12]
            java.lang.String r15 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            h.g.b.x.d(r14, r15)
            androidx.compose.runtime.RecomposeScopeImpl r14 = (androidx.compose.runtime.RecomposeScopeImpl) r14
            androidx.compose.runtime.Anchor r15 = r14.getAnchor()
            if (r15 == 0) goto La9
            androidx.compose.runtime.composer.gapbuffer.GapAnchor r15 = androidx.compose.runtime.composer.gapbuffer.GapAnchorKt.asGapAnchor(r15)
            int r15 = r15.getLocation$runtime()
            java.util.List<androidx.compose.runtime.Invalidation> r2 = r0.invalidations
            androidx.compose.runtime.ScopeInvalidated r6 = androidx.compose.runtime.ScopeInvalidated.INSTANCE
            if (r12 != r6) goto La1
            r12 = 0
        La1:
            androidx.compose.runtime.Invalidation r6 = new androidx.compose.runtime.Invalidation
            r6.<init>(r14, r15, r12)
            r2.add(r6)
        La9:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L6d
        Lad:
            if (r12 != r13) goto Lb4
        Laf:
            if (r7 == r5) goto Lb4
            int r7 = r7 + 1
            goto L59
        Lb4:
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r0.invalidations
            java.util.Comparator r1 = androidx.compose.runtime.GapComposerKt.access$getInvalidationLocationAscending$p()
            h.a.i.t(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.GapComposer.mo7299updateComposerInvalidationsRY85e9Y$runtime(androidx.collection.MutableScatterMap):void");
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object obj) {
        updateCachedValue(obj);
    }

    public final void updateValue(Object obj) {
        if (getInserting()) {
            this.writer.update(obj);
            return;
        }
        if (!this.reader.getHadNext()) {
            ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
            SlotReader slotReader = this.reader;
            composerChangeListWriter.appendValue(slotReader.anchor(slotReader.getParent()), obj);
            return;
        }
        int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        boolean pastParent = this.changeListWriter.getPastParent();
        ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
        if (!pastParent) {
            composerChangeListWriter2.updateValue(obj, groupSlotIndex);
        } else {
            SlotReader slotReader2 = this.reader;
            composerChangeListWriter2.updateAnchoredValue(obj, slotReader2.anchor(slotReader2.getParent()), groupSlotIndex);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object node = getNode(this.reader);
        this.changeListWriter.moveDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.useNode(node);
        }
    }

    @Override // androidx.compose.runtime.InternalComposer
    public void verifyConsistent$runtime() {
        this.insertTable.verifyWellFormed();
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionImpl getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.InternalComposer
    public ChangeList getDeferredChanges$runtime() {
        return this.deferredChanges;
    }

    private final void startGroup(int i2, Object obj) {
        m7296startAzEfcrM(i2, obj, GroupKind.Companion.m7412getGroup9udXigM(), null);
    }

    /* compiled from: WazeSource */
    public final class CompositionContextHolder implements RememberObserver {
        public static final int $stable = 8;
        private final CompositionContextImpl ref;

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    public static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    @Override // androidx.compose.runtime.InternalComposer, androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && c2 == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c2));
        return true;
    }

    @Override // androidx.compose.runtime.InternalComposer, androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && b2 == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b2));
        return true;
    }

    @Override // androidx.compose.runtime.InternalComposer, androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Float) && f2 == ((Number) objNextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f2));
        return true;
    }

    @Override // androidx.compose.runtime.InternalComposer, androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int i2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && i2 == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i2));
        return true;
    }

    @Override // androidx.compose.runtime.InternalComposer, androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long j2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && j2 == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object obj) {
        if (x.n(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.InternalComposer, androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short s) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && s == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s));
        return true;
    }

    @Override // androidx.compose.runtime.InternalComposer, androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && z == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }
}
