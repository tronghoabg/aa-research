package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.internal.Trace;
import h.ab;
import h.e;
import h.g.a.p;
import h.g.b.x;
import h.i;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PausedCompositionImpl implements PausedComposition {
    public static final int $stable = 8;
    private final Applier<?> applier;
    private final InternalComposer composer;
    private final CompositionImpl composition;
    private final p<Composer, Integer, ab> content;
    private final CompositionContext context;
    private final Object lock;
    private final RecordingApplier<Object> pausableApplier;
    private final RememberEventDispatcher rememberManager;
    private final boolean reusable;
    private AtomicReference<PausedCompositionState> state = new AtomicReference<>(PausedCompositionState.InitialPending);
    private long owningThread = Thread_jvmKt.currentThreadId();
    private ScatterSet<RecomposeScopeImpl> invalidScopes = ScatterSetKt.emptyScatterSet();

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PausedCompositionState.values().length];
            try {
                iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PausedCompositionState.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PausedCompositionState.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PausedCompositionState.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PausedCompositionState.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PausedCompositionState.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PausedCompositionImpl(CompositionImpl compositionImpl, CompositionContext compositionContext, InternalComposer internalComposer, Set<RememberObserver> set, p<? super Composer, ? super Integer, ab> pVar, boolean z, Applier<?> applier, Object obj) {
        this.composition = compositionImpl;
        this.context = compositionContext;
        this.composer = internalComposer;
        this.content = pVar;
        this.reusable = z;
        this.applier = applier;
        this.lock = obj;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher();
        rememberEventDispatcher.prepare(set, internalComposer.getErrorContext$runtime());
        this.rememberManager = rememberEventDispatcher;
        this.pausableApplier = new RecordingApplier<>(applier.getCurrent());
    }

    private final void applyChanges() {
        Trace.INSTANCE.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.lock) {
                try {
                    RecordingApplier<Object> recordingApplier = this.pausableApplier;
                    Applier<?> applier = this.applier;
                    x.d(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                    recordingApplier.playTo(applier, this.rememberManager);
                    this.rememberManager.dispatchRememberObservers();
                    this.rememberManager.dispatchSideEffects();
                } finally {
                    this.rememberManager.dispatchAbandons();
                    this.composition.pausedCompositionFinished$runtime(null);
                }
            }
        } finally {
            Trace.INSTANCE.endSection(null);
        }
    }

    private final void markComplete() {
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        if (PausedCompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState, pausedCompositionState2)) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
    }

    private final void updateState(PausedCompositionState pausedCompositionState, PausedCompositionState pausedCompositionState2) {
        if (PausedCompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState, pausedCompositionState2)) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void apply() throws Exception {
        try {
            PausedCompositionState pausedCompositionState = this.state.get();
            PausedCompositionState pausedCompositionState2 = PausedCompositionState.Invalid;
            switch (pausedCompositionState.ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    applyChanges();
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.Applied;
                    if (PausedCompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState3, pausedCompositionState4)) {
                        return;
                    }
                    PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + '.');
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new i();
            }
        } catch (Exception e2) {
            this.state.set(PausedCompositionState.Invalid);
            throw e2;
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void cancel() {
        this.state.set(PausedCompositionState.Cancelled);
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        ScatterSet<RememberObserverHolder> scatterSetExtractRememberSet = rememberEventDispatcher.extractRememberSet();
        rememberEventDispatcher.dispatchAbandons();
        this.composition.pausedCompositionFinished$runtime(scatterSetExtractRememberSet);
    }

    public final Applier<?> getApplier() {
        return this.applier;
    }

    public final InternalComposer getComposer() {
        return this.composer;
    }

    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final p<Composer, Integer, ab> getContent() {
        return this.content;
    }

    public final CompositionContext getContext() {
        return this.context;
    }

    public final Object getLock() {
        return this.lock;
    }

    public final RecordingApplier<Object> getPausableApplier$runtime() {
        return this.pausableApplier;
    }

    public final RememberEventDispatcher getRememberManager$runtime() {
        return this.rememberManager;
    }

    public final boolean getReusable() {
        return this.reusable;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean isApplied() {
        return this.state.get() == PausedCompositionState.Applied;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean isCancelled() {
        return this.state.get() == PausedCompositionState.Cancelled;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean isComplete() {
        return this.state.get().compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    public final boolean isRecomposing$runtime() {
        return this.state.get() == PausedCompositionState.Recomposing && this.owningThread == Thread_jvmKt.currentThreadId();
    }

    public final void markIncomplete$runtime() {
        PausedCompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(this.state, PausedCompositionState.ApplyPending, PausedCompositionState.RecomposePending);
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean resume(ShouldPauseCallback shouldPauseCallback) throws Exception {
        try {
            PausedCompositionState pausedCompositionState = this.state.get();
            PausedCompositionState pausedCompositionState2 = PausedCompositionState.Invalid;
            switch (pausedCompositionState.ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    if (this.reusable) {
                        this.composer.startReuseFromRoot$runtime();
                    }
                    try {
                        this.invalidScopes = this.context.composeInitialPaused$runtime(this.composition, shouldPauseCallback, this.content);
                        if (this.reusable) {
                            this.composer.endReuseFromRoot$runtime();
                        }
                        PausedCompositionState pausedCompositionState3 = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState4 = PausedCompositionState.RecomposePending;
                        if (!PausedCompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState3, pausedCompositionState4)) {
                            PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + '.');
                        }
                        if (this.invalidScopes.isEmpty()) {
                            markComplete();
                        }
                        return isComplete();
                    } catch (Throwable th) {
                        if (this.reusable) {
                            this.composer.endReuseFromRoot$runtime();
                        }
                        throw th;
                    }
                case 3:
                    PausedCompositionState pausedCompositionState5 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState6 = PausedCompositionState.Recomposing;
                    if (!PausedCompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState5, pausedCompositionState6)) {
                        PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + '.');
                    }
                    long j2 = this.owningThread;
                    try {
                        this.owningThread = Thread_jvmKt.currentThreadId();
                        this.invalidScopes = this.context.recomposePaused$runtime(this.composition, shouldPauseCallback, this.invalidScopes);
                        if (this.invalidScopes.isEmpty()) {
                            markComplete();
                        }
                        return isComplete();
                    } finally {
                        this.owningThread = j2;
                        PausedCompositionState pausedCompositionState7 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState8 = PausedCompositionState.RecomposePending;
                        if (!PausedCompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState7, pausedCompositionState8)) {
                            PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState7 + " to: " + pausedCompositionState8 + '.');
                        }
                    }
                case 4:
                    ComposerKt.composeRuntimeError("Recursive call to resume()");
                    throw new e();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new i();
            }
        } catch (Exception e2) {
            this.state.set(PausedCompositionState.Invalid);
            throw e2;
        }
    }
}
