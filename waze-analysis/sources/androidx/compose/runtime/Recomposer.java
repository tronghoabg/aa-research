package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot;
import androidx.compose.runtime.snapshots.TransparentObserverSnapshot;
import androidx.compose.runtime.tooling.ComposeStackTraceMode;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionObserverKt;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import androidx.compose.runtime.tooling.ObservableComposition;
import e.a.h.ad;
import e.b.c;
import h.a.ac;
import h.a.i;
import h.ab;
import h.c.a.h;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.d.a;
import h.d.b;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;
import kotlinx.coroutines.bt;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final bn<State> _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector<ControlledComposition> compositionInvalidations;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private MutableScatterSet<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final j effectCoroutineContext;
    private final s effectJob;
    private bn<RecomposerErrorState> errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List<MovableContentStateReference> movableContentAwaitingInsert;
    private final MutableScatterMap<Object, Object> movableContentNestedExtractionsPending;
    private final NestedContentMap movableContentNestedStatesAvailable;
    private final MutableScatterMap<Object, Object> movableContentRemoved;
    private final MutableScatterMap<MovableContentStateReference, MovableContentState> movableContentStatesAvailable;
    private final NextFrameEndCallbackQueue nextFrameEndCallbackQueue;
    private final SnapshotThreadLocal<MutableScatterSet<RecomposeScopeImpl>> pausedScopes;
    private final RecomposerInfoImpl recomposerInfo;
    private MutableObjectList<CompositionRegistrationObserver> registrationObservers;
    private br runnerJob;
    private MutableScatterSet<Object> snapshotInvalidations;
    private final Object stateLock;
    private k<? super ab> workContinuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final bn<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = ck.b(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(false);

    /* compiled from: WazeSource */
    final class HotReloadable {
        private p<? super Composer, ? super Integer, ab> composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m7287getLambda$1091980426$runtime());
            }
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    /* compiled from: WazeSource */
    final class RecomposerErrorState implements RecomposerErrorInfo, RecomposerErrorInformation {
        private final Throwable cause;
        private final boolean isRecoverable;

        public RecomposerErrorState(Throwable th, boolean z) {
            this.cause = th;
            this.isRecoverable = z;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo, androidx.compose.runtime.RecomposerErrorInformation
        public Throwable getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return isRecoverable();
        }

        @Override // androidx.compose.runtime.RecomposerErrorInformation
        public boolean isRecoverable() {
            return this.isRecoverable;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ShutDown = new State("ShutDown", 0);
        public static final State ShuttingDown = new State("ShuttingDown", 1);
        public static final State Inactive = new State("Inactive", 2);
        public static final State InactivePendingWork = new State("InactivePendingWork", 3);
        public static final State Idle = new State("Idle", 4);
        public static final State PendingWork = new State("PendingWork", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = b.a(stateArr$values);
        }

        private State(String str, int i2) {
        }

        public static a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<State, e<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(State state, e<? super Boolean> eVar) {
            return ((AnonymousClass2) create(state, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return Boolean.valueOf(((State) this.L$0).compareTo(State.Idle) > 0);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.Recomposer$join$2, reason: invalid class name and case insensitive filesystem */
    final class C03612 extends g implements p<State, e<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C03612(e<? super C03612> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03612 c03612 = new C03612(eVar);
            c03612.L$0 = obj;
            return c03612;
        }

        @Override // h.g.a.p
        public final Object invoke(State state, e<? super Boolean> eVar) {
            return ((C03612) create(state, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return Boolean.valueOf(((State) this.L$0) == State.ShutDown);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2, reason: invalid class name and case insensitive filesystem */
    final class C03622 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ q<af, MonotonicFrameClock, e<? super ab>, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name and collision with other inner class name */
        final class C00882 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ q<af, MonotonicFrameClock, e<? super ab>, Object> $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00882(q<? super af, ? super MonotonicFrameClock, ? super e<? super ab>, ? extends Object> qVar, MonotonicFrameClock monotonicFrameClock, e<? super C00882> eVar) {
                super(2, eVar);
                this.$block = qVar;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00882 c00882 = new C00882(this.$block, this.$parentFrameClock, eVar);
                c00882.L$0 = obj;
                return c00882;
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((C00882) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    af afVar = (af) this.L$0;
                    q<af, MonotonicFrameClock, e<? super ab>, Object> qVar = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (qVar.invoke(afVar, monotonicFrameClock, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                return ab.f48028a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03622(q<? super af, ? super MonotonicFrameClock, ? super e<? super ab>, ? extends Object> qVar, MonotonicFrameClock monotonicFrameClock, e<? super C03622> eVar) {
            super(2, eVar);
            this.$block = qVar;
            this.$parentFrameClock = monotonicFrameClock;
        }

        static final ab invokeSuspend$lambda$0(Recomposer recomposer, Set set, Snapshot snapshot) {
            k kVarDeriveStateLocked;
            int i2;
            synchronized (recomposer.stateLock) {
                if (((State) recomposer._state.d()).compareTo(State.Idle) >= 0) {
                    MutableScatterSet mutableScatterSet = recomposer.snapshotInvalidations;
                    if (set instanceof ScatterSetWrapper) {
                        ScatterSet set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
                        Object[] objArr = set$runtime.elements;
                        long[] jArr = set$runtime.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
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
                                            Object obj = objArr[(i3 << 3) + i5];
                                            if (!(obj instanceof StateObjectImpl) || ((StateObjectImpl) obj).m7635isReadInh_f27i8$runtime(1)) {
                                                mutableScatterSet.add(obj);
                                            }
                                        }
                                        j2 >>= 8;
                                        i5++;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i3 == length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        for (Object obj2 : set) {
                            if (!(obj2 instanceof StateObjectImpl) || ((StateObjectImpl) obj2).m7635isReadInh_f27i8$runtime(1)) {
                                mutableScatterSet.add(obj2);
                            }
                        }
                    }
                    kVarDeriveStateLocked = recomposer.deriveStateLocked();
                } else {
                    kVarDeriveStateLocked = null;
                }
            }
            if (kVarDeriveStateLocked != null) {
                kVarDeriveStateLocked.resumeWith(ab.f48028a);
            }
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C03622 c03622 = Recomposer.this.new C03622(this.$block, this.$parentFrameClock, eVar);
            c03622.L$0 = obj;
            return c03622;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03622) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C03622.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    final class C03632 extends g implements q<af, MonotonicFrameClock, e<? super ab>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        C03632(e<? super C03632> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer r21, java.util.List<androidx.compose.runtime.ControlledComposition> r22, java.util.List<androidx.compose.runtime.MovableContentStateReference> r23, java.util.List<androidx.compose.runtime.ControlledComposition> r24, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r25, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r26, androidx.collection.MutableScatterSet<java.lang.Object> r27, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r28) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C03632.invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer, java.util.List, java.util.List, java.util.List, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet):void");
        }

        private static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                List list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.add((MovableContentStateReference) list2.get(i2));
                }
                recomposer.movableContentAwaitingInsert.clear();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:194:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:201:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:215:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01e0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static final h.ab invokeSuspend$lambda$2(androidx.compose.runtime.Recomposer r20, androidx.collection.MutableScatterSet r21, androidx.collection.MutableScatterSet r22, java.util.List r23, java.util.List r24, androidx.collection.MutableScatterSet r25, java.util.List r26, androidx.collection.MutableScatterSet r27, java.util.Set r28, long r29) {
            /*
                Method dump skipped, instructions count: 891
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C03632.invokeSuspend$lambda$2(androidx.compose.runtime.Recomposer, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, java.util.List, java.util.List, androidx.collection.MutableScatterSet, java.util.List, androidx.collection.MutableScatterSet, java.util.Set, long):h.ab");
        }

        @Override // h.g.a.q
        public final Object invoke(af afVar, MonotonicFrameClock monotonicFrameClock, e<? super ab> eVar) {
            C03632 c03632 = Recomposer.this.new C03632(eVar);
            c03632.L$0 = monotonicFrameClock;
            return c03632.invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x012d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x010c -> B:22:0x0114). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0123 -> B:12:0x00b3). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C03632.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Recomposer(j jVar) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new h.g.a.a() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Recomposer.broadcastFrameClock$lambda$0(this.f$0);
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.nextFrameEndCallbackQueue = new NextFrameEndCallbackQueue(new h.g.a.a() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return Recomposer.nextFrameEndCallbackQueue$lambda$0(this.f$0);
            }
        });
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m7360constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m7360constructorimpl$default(null, 1, null);
        this.errorState = ck.b(null);
        this._state = ck.b(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal<>();
        bt btVar = new bt((br) jVar.get(br.f51766a));
        btVar.bY(new l() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Recomposer.effectJob$lambda$0$0(this.f$0, (Throwable) obj);
            }
        });
        this.effectJob = btVar;
        this.effectCoroutineContext = jVar.plus(broadcastFrameClock).plus(btVar);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.add(controlledComposition);
        this._knownCompositionsCache = null;
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(e<? super ab> eVar) {
        if (!getHasSchedulingWork()) {
            kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.d(eVar), 1);
            lVar.u();
            kotlinx.coroutines.l lVar2 = lVar;
            synchronized (this.stateLock) {
                if (!getHasSchedulingWork()) {
                    this.workContinuation = lVar2;
                    lVar2 = null;
                }
            }
            if (lVar2 != null) {
                lVar2.resumeWith(ab.f48028a);
            }
            Object objJ = lVar.j();
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (objJ == aVar) {
                b.c(eVar);
            }
            if (objJ == aVar) {
                return objJ;
            }
        }
        return ab.f48028a;
    }

    static final ab broadcastFrameClock$lambda$0(Recomposer recomposer) {
        recomposer.onNewFrameAwaiter();
        return ab.f48028a;
    }

    private final void clearKnownCompositionsLocked() {
        List<ControlledComposition> listKnownCompositionsLocked = knownCompositionsLocked();
        int size = listKnownCompositionsLocked.size();
        for (int i2 = 0; i2 < size; i2++) {
            unregisterCompositionLocked(listKnownCompositionsLocked.get(i2));
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = ac.f47967a;
    }

    private final <T> T composing(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet, h.g.a.a<? extends T> aVar) {
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, mutableScatterSet));
        try {
            MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
            Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
            try {
                return aVar.invoke();
            } finally {
                mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    private static final void deletedMovableContent$lambda$0$recordNestedStatesOf(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List<MovableContentStateReference> nestedReferences$runtime = movableContentStateReference2.getNestedReferences$runtime();
        if (nestedReferences$runtime != null) {
            int size = nestedReferences$runtime.size();
            for (int i2 = 0; i2 < size; i2++) {
                MovableContentStateReference movableContentStateReference3 = nestedReferences$runtime.get(i2);
                recomposer.movableContentNestedStatesAvailable.add(movableContentStateReference3.getContent$runtime(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                deletedMovableContent$lambda$0$recordNestedStatesOf(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k<ab> deriveStateLocked() {
        State state;
        int i2 = 1;
        int i3 = 0;
        o oVar = null;
        if (((State) this._state.d()).compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new MutableScatterSet<>(i3, i2, oVar);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            k<? super ab> kVar = this.workContinuation;
            if (kVar != null) {
                kVar.f(null);
            }
            this.workContinuation = null;
            this.errorState.e(null);
            return null;
        }
        if (this.errorState.d() != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet<>(i3, i2, oVar);
            this.compositionInvalidations.clear();
            state = (getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked()) ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.isNotEmpty() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked() && !getHasNextFrameEndAwaitersLocked() && !MultiValueMap.m7369isNotEmptyimpl(this.movableContentRemoved)) ? State.Idle : State.PendingWork;
        }
        this._state.e(state);
        if (state != State.PendingWork) {
            return null;
        }
        k kVar2 = this.workContinuation;
        this.workContinuation = null;
        return kVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i2;
        MutableObjectList mutableObjectListEmptyObjectList;
        synchronized (this.stateLock) {
            if (MultiValueMap.m7369isNotEmptyimpl(this.movableContentRemoved)) {
                ObjectList objectListM7374valuesimpl = MultiValueMap.m7374valuesimpl(this.movableContentRemoved);
                MultiValueMap.m7358clearimpl(this.movableContentRemoved);
                this.movableContentNestedStatesAvailable.clear();
                MultiValueMap.m7358clearimpl(this.movableContentNestedExtractionsPending);
                MutableObjectList mutableObjectList = new MutableObjectList(objectListM7374valuesimpl.getSize());
                Object[] objArr = objectListM7374valuesimpl.content;
                int i3 = objectListM7374valuesimpl._size;
                for (int i4 = 0; i4 < i3; i4++) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i4];
                    mutableObjectList.add(new h.k(movableContentStateReference, this.movableContentStatesAvailable.get(movableContentStateReference)));
                }
                mutableObjectListEmptyObjectList = mutableObjectList;
                this.movableContentStatesAvailable.clear();
            } else {
                mutableObjectListEmptyObjectList = ObjectListKt.emptyObjectList();
            }
        }
        Object[] objArr2 = mutableObjectListEmptyObjectList.content;
        int i5 = mutableObjectListEmptyObjectList._size;
        for (i2 = 0; i2 < i5; i2++) {
            h.k kVar = (h.k) objArr2[i2];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) kVar.a();
            MovableContentState movableContentState = (MovableContentState) kVar.b();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab effectJob$lambda$0$0(final Recomposer recomposer, final Throwable th) {
        k<? super ab> kVar;
        k<? super ab> kVar2;
        CancellationException cancellationExceptionG = bo.g("Recomposer effect job completed", th);
        synchronized (recomposer.stateLock) {
            br brVar = recomposer.runnerJob;
            kVar = null;
            if (brVar != null) {
                recomposer._state.e(State.ShuttingDown);
                if (recomposer.isClosed) {
                    kVar2 = recomposer.workContinuation;
                    if (kVar2 == null) {
                    }
                    recomposer.workContinuation = null;
                    brVar.bY(new l() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return Recomposer.effectJob$lambda$0$0$0$0(this.f$0, th, (Throwable) obj);
                        }
                    });
                    kVar = kVar2;
                } else {
                    brVar.s(cancellationExceptionG);
                }
                kVar2 = null;
                recomposer.workContinuation = null;
                brVar.bY(new l() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return Recomposer.effectJob$lambda$0$0$0$0(this.f$0, th, (Throwable) obj);
                    }
                });
                kVar = kVar2;
            } else {
                recomposer.closeCause = cancellationExceptionG;
                recomposer._state.e(State.ShutDown);
            }
        }
        if (kVar != null) {
            kVar.resumeWith(ab.f48028a);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab effectJob$lambda$0$0$0$0(Recomposer recomposer, Throwable th, Throwable th2) {
        synchronized (recomposer.stateLock) {
            if (th != null) {
                if (th2 != null) {
                    if (true == (th2 instanceof CancellationException)) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        ad.c(th, th2);
                    }
                }
            }
            th = null;
            recomposer.closeCause = th;
            recomposer._state.e(State.ShutDown);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked() || MultiValueMap.m7369isNotEmptyimpl(this.movableContentRemoved);
    }

    private final boolean getHasNextFrameEndAwaitersLocked() {
        return !this.frameClockPaused && this.nextFrameEndCallbackQueue.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!this.snapshotInvalidations.isNotEmpty() && this.compositionInvalidations.getSize() == 0 && !getHasBroadcastFrameClockAwaitersLocked()) {
                if (!getHasNextFrameEndAwaitersLocked()) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        Iterator it = this.effectJob.o().iterator();
        while (it.hasNext()) {
            if (((br) it.next()).bZ()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositions() {
        List<ControlledComposition> listKnownCompositionsLocked;
        synchronized (this.stateLock) {
            listKnownCompositionsLocked = knownCompositionsLocked();
        }
        return listKnownCompositionsLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositionsLocked() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List<ControlledComposition> list2 = this._knownCompositions;
        ArrayList arrayList = list2.isEmpty() ? ac.f47967a : new ArrayList(list2);
        this._knownCompositionsCache = arrayList;
        return arrayList;
    }

    static final ab nextFrameEndCallbackQueue$lambda$0(Recomposer recomposer) {
        recomposer.onNewFrameAwaiter();
        return ab.f48028a;
    }

    private final void onNewFrameAwaiter() {
        k<ab> kVarDeriveStateLocked;
        synchronized (this.stateLock) {
            kVarDeriveStateLocked = deriveStateLocked();
            if (((State) this._state.d()).compareTo(State.ShuttingDown) <= 0) {
                throw bo.g("Recomposer shutdown; frame clock awaiter will never resume", this.closeCause);
            }
        }
        if (kVarDeriveStateLocked != null) {
            kVarDeriveStateLocked.resumeWith(ab.f48028a);
        }
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (x.n(list.get(i2).getComposition$runtime(), controlledComposition)) {
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.movableContentAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (x.n(next.getComposition$runtime(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0168, code lost:
    
        r0 = r11.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0170, code lost:
    
        if (r2 >= r0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017c, code lost:
    
        if (r11.get(r2).d() == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0181, code lost:
    
        r0 = new java.util.ArrayList(r11.size());
        r2 = r11.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0192, code lost:
    
        if (r3 >= r2) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0194, code lost:
    
        r4 = r11.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x019e, code lost:
    
        if (r4.d() != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a0, code lost:
    
        r4 = (androidx.compose.runtime.MovableContentStateReference) r4.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a7, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a8, code lost:
    
        if (r4 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01aa, code lost:
    
        r0.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b0, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b3, code lost:
    
        r0 = r0;
        r2 = r17.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b7, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b8, code lost:
    
        h.a.i.aD(r17.movableContentAwaitingInsert, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c1, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c2, code lost:
    
        r0 = new java.util.ArrayList(r11.size());
        r2 = r11.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d3, code lost:
    
        if (r3 >= r2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d5, code lost:
    
        r4 = r11.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e0, code lost:
    
        if (r4.d() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e2, code lost:
    
        r0.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e8, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01eb, code lost:
    
        r11 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.ControlledComposition> performInsertValues(java.util.List<androidx.compose.runtime.MovableContentStateReference> r18, androidx.collection.MutableScatterSet<java.lang.Object> r19) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performInsertValues(java.util.List, androidx.collection.MutableScatterSet):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition controlledComposition, final MutableScatterSet<Object> mutableScatterSet) {
        MutableScatterSet<ControlledComposition> mutableScatterSet2;
        if (controlledComposition.isComposing() || controlledComposition.isDisposed() || ((mutableScatterSet2 = this.compositionsRemoved) != null && mutableScatterSet2.contains(controlledComposition))) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, mutableScatterSet));
        try {
            MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
            Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
            if (mutableScatterSet != null) {
                try {
                    if (mutableScatterSet.isNotEmpty()) {
                        controlledComposition.prepareCompose(new h.g.a.a() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda6
                            @Override // h.g.a.a
                            public final Object invoke() {
                                return Recomposer.performRecompose$lambda$0$0(mutableScatterSet, controlledComposition);
                            }
                        });
                    }
                } finally {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            }
            if (controlledComposition.recompose()) {
                return controlledComposition;
            }
            return null;
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h.ab performRecompose$lambda$0$0(androidx.collection.MutableScatterSet r14, androidx.compose.runtime.ControlledComposition r15) {
        /*
            androidx.collection.ScatterSet r14 = (androidx.collection.ScatterSet) r14
            java.lang.Object[] r0 = r14.elements
            long[] r14 = r14.metadata
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L45
            r2 = 0
            r3 = r2
        Ld:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L40
            int r6 = r3 - r1
            r7 = r2
        L20:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L3e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L3a
            int r8 = r3 << 3
            int r8 = r8 + r7
            r8 = r0[r8]
            r15.recordWriteOf(r8)
        L3a:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L20
        L3e:
            if (r8 != r9) goto L45
        L40:
            if (r3 == r1) goto L45
            int r3 = r3 + 1
            goto Ld
        L45:
            h.ab r14 = h.ab.f48028a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performRecompose$lambda$0$0(androidx.collection.MutableScatterSet, androidx.compose.runtime.ControlledComposition):h.ab");
    }

    private final void processCompositionError(Throwable th, ControlledComposition controlledComposition, boolean z) throws Throwable {
        int i2 = 0;
        if (!_hotReloadEnabled.get().booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                Utils_androidKt.logError("Error was captured in composition.", th);
                RecomposerErrorState recomposerErrorState = (RecomposerErrorState) this.errorState.d();
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState.e(new RecomposerErrorState(th, false));
            }
            throw th;
        }
        synchronized (this.stateLock) {
            Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", th);
            this.compositionsAwaitingApply.clear();
            this.compositionInvalidations.clear();
            this.snapshotInvalidations = new MutableScatterSet<>(i2, 1, null);
            this.movableContentAwaitingInsert.clear();
            MultiValueMap.m7358clearimpl(this.movableContentRemoved);
            this.movableContentStatesAvailable.clear();
            this.errorState.e(new RecomposerErrorState(th, z));
            if (controlledComposition != null) {
                recordFailedCompositionLocked(controlledComposition);
            }
            if (deriveStateLocked() != null) {
                ComposerKt.composeImmediateRuntimeError("expected to go to inactive state due to composition error");
            }
        }
    }

    static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z, int i2, Object obj) throws Throwable {
        if ((i2 & 2) != 0) {
            controlledComposition = null;
        }
        recomposer.processCompositionError(th, controlledComposition, z & ((i2 & 4) == 0));
    }

    private final l<Object, ab> readObserverOf(final ControlledComposition controlledComposition) {
        return new l() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Recomposer.readObserverOf$lambda$0(controlledComposition, obj);
            }
        };
    }

    static final ab readObserverOf$lambda$0(ControlledComposition controlledComposition, Object obj) {
        controlledComposition.recordReadOf(obj);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(q<? super af, ? super MonotonicFrameClock, ? super e<? super ab>, ? extends Object> qVar, e<? super ab> eVar) {
        Object objV = aj.v(this.broadcastFrameClock, new C03622(qVar, MonotonicFrameClockKt.getMonotonicFrameClock(eVar.getContext()), null), eVar);
        return objV == h.c.a.a.f48038a ? objV : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        boolean hasFrameWorkLocked;
        ac acVar = ac.f47967a;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            List<ControlledComposition> listKnownCompositionsLocked = knownCompositionsLocked();
            Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            int i2 = 0;
            this.snapshotInvalidations = new MutableScatterSet<>(i2, 1, null);
            try {
                Recomposer recomposer = this;
                int size = listKnownCompositionsLocked.size();
                while (i2 < size) {
                    listKnownCompositionsLocked.get(i2).recordModificationsOf(setWrapIntoSet);
                    if (((State) this._state.d()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                    i2++;
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(setWrapIntoSet);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition controlledComposition) {
        ArrayList arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(controlledComposition)) {
            arrayList.add(controlledComposition);
        }
        removeKnownCompositionLocked(controlledComposition);
    }

    private final void registerCompositionLocked(ControlledComposition controlledComposition) {
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            MutableObjectList<CompositionRegistrationObserver> mutableObjectList2 = mutableObjectList;
            Object[] objArr = mutableObjectList2.content;
            int i2 = mutableObjectList2._size;
            for (int i3 = 0; i3 < i2; i3++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i3];
                if (controlledComposition instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionRegistered((ObservableComposition) controlledComposition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(br brVar) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (((State) this._state.d()).compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = brVar;
            if (deriveStateLocked() != null) {
                ComposerKt.composeImmediateRuntimeError("called outside of runRecomposeAndApplyChanges");
            }
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition controlledComposition) {
        if (this._knownCompositions.remove(controlledComposition)) {
            this._knownCompositionsCache = null;
            unregisterCompositionLocked(controlledComposition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        Object objD;
        k<ab> kVarDeriveStateLocked;
        synchronized (this.stateLock) {
            objD = this.errorState.d();
            kVarDeriveStateLocked = null;
            if (objD != null) {
                this.errorState.e(null);
                kVarDeriveStateLocked = deriveStateLocked();
            }
        }
        if (kVarDeriveStateLocked != null) {
            kVarDeriveStateLocked.resumeWith(ab.f48028a);
        }
        return (RecomposerErrorState) objD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        int i2;
        List<ControlledComposition> list2;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list != null) {
            while (true) {
                i2 = 0;
                try {
                    list2 = list;
                    if (list2.isEmpty()) {
                        break;
                    }
                    ControlledComposition controlledComposition = (ControlledComposition) i.w(list);
                    if (controlledComposition instanceof CompositionImpl) {
                        CompositionImpl compositionImpl = (CompositionImpl) controlledComposition;
                        compositionImpl.invalidateAll();
                        compositionImpl.setContent(compositionImpl.getComposable());
                        if (this.errorState.d() != null) {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    List<ControlledComposition> list3 = list;
                    if (!list3.isEmpty()) {
                        synchronized (this.stateLock) {
                            int size = list3.size();
                            while (i2 < size) {
                                recordFailedCompositionLocked(list.get(i2));
                                i2++;
                            }
                        }
                    }
                    throw th;
                }
            }
            if (list2.isEmpty()) {
                return;
            }
            synchronized (this.stateLock) {
                int size2 = list2.size();
                while (i2 < size2) {
                    recordFailedCompositionLocked(list.get(i2));
                    i2++;
                }
            }
        }
    }

    private final void unregisterCompositionLocked(ControlledComposition controlledComposition) {
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            MutableObjectList<CompositionRegistrationObserver> mutableObjectList2 = mutableObjectList;
            Object[] objArr = mutableObjectList2.content;
            int i2 = mutableObjectList2._size;
            for (int i3 = 0; i3 < i2; i3++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i3];
                if (controlledComposition instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionUnregistered((ObservableComposition) controlledComposition);
                }
            }
        }
    }

    private final void withTransparentSnapshot(h.g.a.a<ab> aVar) {
        Snapshot current = Snapshot.Companion.getCurrent();
        TransparentObserverSnapshot transparentObserverMutableSnapshot = current instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot((MutableSnapshot) current, null, null, true, false) : new TransparentObserverSnapshot(current, null, true, false);
        try {
            Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
            try {
                aVar.invoke();
                transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            } catch (Throwable th) {
                transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th;
            }
        } finally {
            transparentObserverMutableSnapshot.dispose();
        }
    }

    private final l<Object, ab> writeObserverOf(final ControlledComposition controlledComposition, final MutableScatterSet<Object> mutableScatterSet) {
        return new l() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Recomposer.writeObserverOf$lambda$0(controlledComposition, mutableScatterSet, obj);
            }
        };
    }

    static final ab writeObserverOf$lambda$0(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet, Object obj) {
        controlledComposition.recordWriteOf(obj);
        if (mutableScatterSet != null) {
            mutableScatterSet.add(obj);
        }
        return ab.f48028a;
    }

    public final CompositionObserverHandle addCompositionRegistrationObserver$runtime(final CompositionRegistrationObserver compositionRegistrationObserver) {
        synchronized (this.stateLock) {
            MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
            int i2 = 0;
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(i2, 1, null);
                this.registrationObservers = mutableObjectList;
            }
            mutableObjectList.add(compositionRegistrationObserver);
            List<ControlledComposition> list = this._knownCompositions;
            int size = list.size();
            while (i2 < size) {
                ControlledComposition controlledComposition = list.get(i2);
                if (controlledComposition instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionRegistered((ObservableComposition) controlledComposition);
                }
                i2++;
            }
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.Recomposer$addCompositionRegistrationObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                CompositionRegistrationObserver compositionRegistrationObserver2 = compositionRegistrationObserver;
                Recomposer recomposer = this.this$0;
                synchronized (recomposer.stateLock) {
                    MutableObjectList mutableObjectList2 = recomposer.registrationObservers;
                    if (mutableObjectList2 != null) {
                        mutableObjectList2.remove(compositionRegistrationObserver2);
                    }
                }
            }
        };
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final Object awaitIdle(e<? super ab> eVar) {
        Object objD = ai.d(ai.Q(getCurrentState(), new AnonymousClass2(null)), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (((State) this._state.d()).compareTo(State.Idle) >= 0) {
                this._state.e(State.ShuttingDown);
            }
        }
        this.effectJob.s(null);
    }

    public final void close() {
        if (this.effectJob.a()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime(ControlledComposition controlledComposition, p<? super Composer, ? super Integer, ab> pVar) throws Throwable {
        boolean z;
        Object obj = this.stateLock;
        boolean zIsComposing = controlledComposition.isComposing();
        synchronized (obj) {
            if (((State) this._state.d()).compareTo(State.ShuttingDown) > 0) {
                boolean zContains = knownCompositionsLocked().contains(controlledComposition);
                z = !zContains;
                if (!zContains) {
                    registerCompositionLocked(controlledComposition);
                }
            } else {
                z = true;
            }
        }
        try {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, null));
            try {
                MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
                Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
                try {
                    controlledComposition.composeContent(pVar);
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                    synchronized (this.stateLock) {
                        if (((State) this._state.d()).compareTo(State.ShuttingDown) <= 0) {
                            unregisterCompositionLocked(controlledComposition);
                        } else if (!knownCompositionsLocked().contains(controlledComposition)) {
                            addKnownCompositionLocked(controlledComposition);
                        }
                    }
                    if (!zIsComposing) {
                        Snapshot.Companion.notifyObjectsInitialized();
                    }
                    try {
                        performInitialMovableContentInserts(controlledComposition);
                        try {
                            controlledComposition.applyChanges();
                            controlledComposition.applyLateChanges();
                            if (zIsComposing) {
                                return;
                            }
                            Snapshot.Companion.notifyObjectsInitialized();
                        } catch (Throwable th) {
                            processCompositionError$default(this, th, null, false, 6, null);
                        }
                    } catch (Throwable th2) {
                        processCompositionError(th2, controlledComposition, true);
                    }
                } catch (Throwable th3) {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th3;
                }
            } catch (Throwable th4) {
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                throw th4;
            }
        } catch (Throwable th5) {
            if (z) {
                synchronized (this.stateLock) {
                    unregisterCompositionLocked(controlledComposition);
                }
            }
            processCompositionError(th5, controlledComposition, true);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, p<? super Composer, ? super Integer, ab> pVar) {
        try {
            ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
            try {
                composeInitial$runtime(controlledComposition, pVar);
                MutableScatterSet<RecomposeScopeImpl> mutableScatterSet = this.pausedScopes.get();
                return mutableScatterSet != null ? mutableScatterSet : ScatterSetKt.emptyScatterSet();
            } finally {
                controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
        k<ab> kVarDeriveStateLocked;
        synchronized (this.stateLock) {
            MultiValueMap.m7356addimpl(this.movableContentRemoved, movableContentStateReference.getContent$runtime(), movableContentStateReference);
            if (movableContentStateReference.getNestedReferences$runtime() != null) {
                deletedMovableContent$lambda$0$recordNestedStatesOf(this, movableContentStateReference, movableContentStateReference);
            }
            kVarDeriveStateLocked = deriveStateLocked();
        }
        if (kVarDeriveStateLocked != null) {
            kVarDeriveStateLocked.resumeWith(ab.f48028a);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime() {
        return ComposeStackTraceMode.m7640equalsimpl0(ComposerKt.getComposeStackTraceMode(), ComposeStackTraceMode.Companion.m7647getSourceInformationMD5MrJc());
    }

    @Override // androidx.compose.runtime.CompositionContext
    public long getCompositeKeyHashCode$runtime() {
        return 1000L;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public Composition getComposition$runtime() {
        return null;
    }

    public final ch<State> getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public j getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!this.snapshotInvalidations.isNotEmpty() && this.compositionInvalidations.getSize() == 0 && this.concurrentCompositionsOutstanding <= 0 && this.compositionsAwaitingApply.isEmpty() && !getHasBroadcastFrameClockAwaitersLocked() && !getHasNextFrameEndAwaitersLocked()) {
                if (!MultiValueMap.m7369isNotEmptyimpl(this.movableContentRemoved)) {
                    z = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getStackTraceEnabled$runtime() {
        return !ComposeStackTraceMode.m7640equalsimpl0(ComposerKt.getComposeStackTraceMode(), ComposeStackTraceMode.Companion.m7646getNoneMD5MrJc());
    }

    public final kotlinx.coroutines.b.k<State> getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime(MovableContentStateReference movableContentStateReference) {
        k<ab> kVarDeriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(movableContentStateReference);
            kVarDeriveStateLocked = deriveStateLocked();
        }
        if (kVarDeriveStateLocked != null) {
            kVarDeriveStateLocked.resumeWith(ab.f48028a);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime(ControlledComposition controlledComposition) {
        k<ab> kVarDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(controlledComposition)) {
                kVarDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(controlledComposition);
                kVarDeriveStateLocked = deriveStateLocked();
            }
        }
        if (kVarDeriveStateLocked != null) {
            kVarDeriveStateLocked.resumeWith(ab.f48028a);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
        k<ab> kVarDeriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(recomposeScopeImpl);
            kVarDeriveStateLocked = deriveStateLocked();
        }
        if (kVarDeriveStateLocked != null) {
            kVarDeriveStateLocked.resumeWith(ab.f48028a);
        }
    }

    public final Object join(e<? super ab> eVar) {
        Object objI = ai.i(getCurrentState(), new C03612(null), eVar);
        return objI == h.c.a.a.f48038a ? objI : ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    @Override // androidx.compose.runtime.CompositionContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void movableContentStateReleased$runtime(androidx.compose.runtime.MovableContentStateReference r19, androidx.compose.runtime.MovableContentState r20, androidx.compose.runtime.Applier<?> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.Object r2 = r0.stateLock
            monitor-enter(r2)
            androidx.collection.MutableScatterMap<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState> r3 = r0.movableContentStatesAvailable     // Catch: java.lang.Throwable -> L73
            r4 = r20
            r3.set(r1, r4)     // Catch: java.lang.Throwable -> L73
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r3 = r0.movableContentNestedExtractionsPending     // Catch: java.lang.Throwable -> L73
            androidx.collection.ObjectList r1 = androidx.compose.runtime.collection.MultiValueMap.m7366getimpl(r3, r1)     // Catch: java.lang.Throwable -> L73
            boolean r3 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L71
            androidx.compose.runtime.SlotStorage r3 = r4.getSlotStorage$runtime()     // Catch: java.lang.Throwable -> L73
            r4 = r21
            androidx.collection.ScatterMap r1 = r3.extractNestedStates(r4, r1)     // Catch: java.lang.Throwable -> L73
            java.lang.Object[] r3 = r1.keys     // Catch: java.lang.Throwable -> L73
            java.lang.Object[] r4 = r1.values     // Catch: java.lang.Throwable -> L73
            long[] r1 = r1.metadata     // Catch: java.lang.Throwable -> L73
            int r5 = r1.length     // Catch: java.lang.Throwable -> L73
            int r5 = r5 + (-2)
            if (r5 < 0) goto L71
            r6 = 0
            r7 = r6
        L31:
            r8 = r1[r7]     // Catch: java.lang.Throwable -> L73
            long r10 = ~r8     // Catch: java.lang.Throwable -> L73
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6c
            int r10 = r7 - r5
            r11 = r6
        L44:
            int r12 = ~r10     // Catch: java.lang.Throwable -> L73
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L6a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L66
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r3[r12]     // Catch: java.lang.Throwable -> L73
            r12 = r4[r12]     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.MovableContentState r12 = (androidx.compose.runtime.MovableContentState) r12     // Catch: java.lang.Throwable -> L73
            androidx.compose.runtime.MovableContentStateReference r14 = (androidx.compose.runtime.MovableContentStateReference) r14     // Catch: java.lang.Throwable -> L73
            androidx.collection.MutableScatterMap<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState> r15 = r0.movableContentStatesAvailable     // Catch: java.lang.Throwable -> L73
            r15.set(r14, r12)     // Catch: java.lang.Throwable -> L73
        L66:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L44
        L6a:
            if (r12 != r13) goto L71
        L6c:
            if (r7 == r5) goto L71
            int r7 = r7 + 1
            goto L31
        L71:
            monitor-exit(r2)
            return
        L73:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.movableContentStateReleased$runtime(androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState, androidx.compose.runtime.Applier):void");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
        MovableContentState movableContentStateRemove;
        synchronized (this.stateLock) {
            movableContentStateRemove = this.movableContentStatesAvailable.remove(movableContentStateReference);
        }
        return movableContentStateRemove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, ScatterSet<RecomposeScopeImpl> scatterSet) {
        try {
            recordComposerModifications();
            controlledComposition.recordModificationsOf(ScatterSetWrapperKt.wrapIntoSet(scatterSet));
            ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
            try {
                ControlledComposition controlledCompositionPerformRecompose = performRecompose(controlledComposition, null);
                if (controlledCompositionPerformRecompose != null) {
                    performInitialMovableContentInserts(controlledComposition);
                    controlledCompositionPerformRecompose.applyChanges();
                    controlledCompositionPerformRecompose.applyLateChanges();
                }
                MutableScatterSet<RecomposeScopeImpl> mutableScatterSet = this.pausedScopes.get();
                return mutableScatterSet != null ? mutableScatterSet : ScatterSetKt.emptyScatterSet();
            } finally {
                controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSetMutableScatterSetOf = this.pausedScopes.get();
        if (mutableScatterSetMutableScatterSetOf == null) {
            SnapshotThreadLocal<MutableScatterSet<RecomposeScopeImpl>> snapshotThreadLocal = this.pausedScopes;
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            snapshotThreadLocal.set(mutableScatterSetMutableScatterSetOf);
        }
        mutableScatterSetMutableScatterSetOf.add(recomposeScopeImpl);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            MutableScatterSet<ControlledComposition> mutableScatterSetMutableScatterSetOf = this.compositionsRemoved;
            if (mutableScatterSetMutableScatterSetOf == null) {
                mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                this.compositionsRemoved = mutableScatterSetMutableScatterSetOf;
            }
            mutableScatterSetMutableScatterSetOf.add(controlledComposition);
        }
    }

    public final void resumeCompositionFrameClock() {
        k<ab> kVarDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                kVarDeriveStateLocked = deriveStateLocked();
            } else {
                kVarDeriveStateLocked = null;
            }
        }
        if (kVarDeriveStateLocked != null) {
            kVarDeriveStateLocked.resumeWith(ab.f48028a);
        }
    }

    public final Object runRecomposeAndApplyChanges(e<? super ab> eVar) {
        Object objRecompositionRunner = recompositionRunner(new C03632(null), eVar);
        return objRecompositionRunner == h.c.a.a.f48038a ? objRecompositionRunner : ab.f48028a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CancellationHandle scheduleFrameEndCallback(h.g.a.a<ab> aVar) {
        return this.nextFrameEndCallbackQueue.scheduleFrameEndCallback(aVar);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(controlledComposition);
            this.compositionInvalidations.remove(controlledComposition);
            this.compositionsAwaitingApply.remove(controlledComposition);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.d();
                persistentSetAdd = persistentSet.add((PersistentSet) recomposerInfoImpl);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.f(persistentSet, persistentSetAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.d();
                persistentSetRemove = persistentSet.remove((PersistentSet) recomposerInfoImpl);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.f(persistentSet, persistentSetRemove));
        }

        public final void clearErrors$runtime() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.d();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState recomposerErrorStateResetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (recomposerErrorStateResetErrorState != null) {
                    arrayList.add(recomposerErrorStateResetErrorState);
                }
            }
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.d();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInformation currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                RecomposerErrorInfo recomposerErrorInfo = currentError instanceof RecomposerErrorInfo ? (RecomposerErrorInfo) currentError : null;
                if (recomposerErrorInfo != null) {
                    arrayList.add(recomposerErrorInfo);
                }
            }
            return arrayList;
        }

        public final List<RecomposerErrorInformation> getRecomposerErrors$runtime() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.d();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInformation currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final ch<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime(int i2) {
            Recomposer._hotReloadEnabled.set(true);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.d()) {
                RecomposerErrorInformation currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.isRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(i2);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime(Object obj) {
            Recomposer._hotReloadEnabled.set(true);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.d()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) obj;
            List list2 = list;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((HotReloadable) list.get(i2)).resetContent();
            }
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((HotReloadable) list.get(i3)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.d()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final Object saveStateAndDisposeForHotReload$runtime() {
            Recomposer._hotReloadEnabled.set(true);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.d();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                i.aD(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime(boolean z) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(z));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInformation getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Recomposer recomposer = Recomposer.this;
            synchronized (recomposer.stateLock) {
                recomposerErrorState = (RecomposerErrorState) recomposer.errorState.d();
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public ch<RecomposerErrorInformation> getErrorState() {
            return Recomposer.this.errorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public kotlinx.coroutines.b.k<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i2) {
            List listKnownCompositions = Recomposer.this.knownCompositions();
            ArrayList arrayList = new ArrayList(listKnownCompositions.size());
            int size = listKnownCompositions.size();
            for (int i3 = 0; i3 < size; i3++) {
                ControlledComposition controlledComposition = (ControlledComposition) listKnownCompositions.get(i3);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((CompositionImpl) arrayList2.get(i4)).invalidateGroupsWithKey(i2);
            }
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public CompositionObserverHandle observe(CompositionRegistrationObserver compositionRegistrationObserver) {
            return CompositionObserverKt.observe(Recomposer.this, compositionRegistrationObserver);
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List listKnownCompositions = Recomposer.this.knownCompositions();
            ArrayList arrayList = new ArrayList(listKnownCompositions.size());
            int size = listKnownCompositions.size();
            for (int i2 = 0; i2 < size; i2++) {
                ControlledComposition controlledComposition = (ControlledComposition) listKnownCompositions.get(i2);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList2.get(i3));
                hotReloadable.clearContent();
                arrayList3.add(hotReloadable);
            }
            return arrayList3;
        }

        public static /* synthetic */ void getCurrentError$annotations() {
        }

        public static /* synthetic */ void getErrorState$annotations() {
        }
    }

    private static /* synthetic */ void getRegistrationObservers$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime(Set<CompositionData> set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime(ControlledComposition controlledComposition) {
    }
}
