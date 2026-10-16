package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    private LayoutNodeSubcompositionsState _state;
    private final p<LayoutNode, CompositionContext, ab> setCompositionContext;
    private final p<LayoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, ab> setMeasurePolicy;
    private final p<LayoutNode, SubcomposeLayoutState, ab> setRoot;
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    /* compiled from: WazeSource */
    public interface PausedPrecomposition {
        PrecomposedSlotHandle apply();

        void cancel();

        boolean isComplete();

        boolean resume(ShouldPauseCallback shouldPauseCallback);
    }

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new SubcomposeLayoutState$setRoot$1(this);
        this.setCompositionContext = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.setMeasurePolicy = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final PausedPrecomposition createPausedPrecomposition(Object obj, p<? super Composer, ? super Integer, ab> pVar) {
        return getState().precomposePaused(obj, pVar);
    }

    public final void forceRecomposeChildren$ui() {
        getState().forceRecomposeChildren();
    }

    public final p<LayoutNode, CompositionContext, ab> getSetCompositionContext$ui() {
        return this.setCompositionContext;
    }

    public final p<LayoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, ab> getSetMeasurePolicy$ui() {
        return this.setMeasurePolicy;
    }

    public final p<LayoutNode, SubcomposeLayoutState, ab> getSetRoot$ui() {
        return this.setRoot;
    }

    public final PrecomposedSlotHandle precompose(Object obj, p<? super Composer, ? super Integer, ab> pVar) {
        return getState().precompose(obj, pVar);
    }

    public SubcomposeLayoutState(int i2) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i2));
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    /* compiled from: WazeSource */
    public interface PrecomposedSlotHandle {
        void dispose();

        int getPlaceablesCount();

        /* renamed from: getSize-YEO4UFw */
        long mo9773getSizeYEO4UFw(int i2);

        /* renamed from: premeasure-0kLqBqw */
        void mo9774premeasure0kLqBqw(int i2, long j2);

        void traverseDescendants(Object obj, l<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar);

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static int $default$getPlaceablesCount(PrecomposedSlotHandle precomposedSlotHandle) {
                return 0;
            }

            /* renamed from: $default$premeasure-0kLqBqw, reason: not valid java name */
            public static void m9881$default$premeasure0kLqBqw(PrecomposedSlotHandle precomposedSlotHandle, int i2, long j2) {
            }

            public static void $default$traverseDescendants(PrecomposedSlotHandle precomposedSlotHandle, Object obj, l lVar) {
            }
        }
    }
}
