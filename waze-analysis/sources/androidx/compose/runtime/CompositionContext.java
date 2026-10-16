package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.tooling.CompositionData;
import h.ab;
import h.c.j;
import h.g.a.a;
import h.g.a.p;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime(ControlledComposition controlledComposition, p<? super Composer, ? super Integer, ab> pVar);

    public abstract ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, p<? super Composer, ? super Integer, ab> pVar);

    public abstract void deletedMovableContent$runtime(MovableContentStateReference movableContentStateReference);

    public abstract boolean getCollectingCallByInformation$runtime();

    public abstract boolean getCollectingParameterInformation$runtime();

    public abstract boolean getCollectingSourceInformation$runtime();

    public abstract long getCompositeKeyHashCode$runtime();

    public abstract Composition getComposition$runtime();

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
        return CompositionContextKt.EmptyPersistentCompositionLocalMap;
    }

    public abstract j getEffectCoroutineContext();

    public CompositionObserverHolder getObserverHolder$runtime() {
        return null;
    }

    public abstract boolean getStackTraceEnabled$runtime();

    public abstract void insertMovableContent$runtime(MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime(ControlledComposition controlledComposition);

    public abstract void invalidateScope$runtime(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier<?> applier);

    public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public abstract ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, ScatterSet<RecomposeScopeImpl> scatterSet);

    public abstract void registerComposition$runtime(ControlledComposition controlledComposition);

    public abstract void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void reportRemovedComposition$runtime(ControlledComposition controlledComposition);

    public abstract CancellationHandle scheduleFrameEndCallback(a<ab> aVar);

    public abstract void unregisterComposition$runtime(ControlledComposition controlledComposition);

    public void doneComposing$runtime() {
    }

    public void startComposing$runtime() {
    }

    public void recordInspectionTable$runtime(Set<CompositionData> set) {
    }

    public void registerComposer$runtime(Composer composer) {
    }

    public void unregisterComposer$runtime(Composer composer) {
    }
}
