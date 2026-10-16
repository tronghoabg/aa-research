package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(new p() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((ScrollState) obj2).getValue());
        }
    }, new l() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ScrollState.Saver$lambda$1(((Integer) obj).intValue());
        }
    });
    private float accumulator;
    private final MutableIntState value$delegate;
    private final MutableIntState viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableIntState contentSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    private MutableIntState _maxValueState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new l() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Float.valueOf(ScrollState.scrollableState$lambda$0(this.f$0, ((Float) obj).floatValue()));
        }
    });
    private final ScrollState$_scrollIndicatorState$1 _scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.ScrollState$_scrollIndicatorState$1
        @Override // androidx.compose.foundation.ScrollIndicatorState
        public int getContentSize() {
            return this.this$0.getContentSize$foundation();
        }

        @Override // androidx.compose.foundation.ScrollIndicatorState
        public int getScrollOffset() {
            return this.this$0.getValue();
        }

        @Override // androidx.compose.foundation.ScrollIndicatorState
        public int getViewportSize() {
            return this.this$0.getViewportSize();
        }
    };
    private final State canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda1
        @Override // h.g.a.a
        public final Object invoke() {
            return Boolean.valueOf(ScrollState.canScrollForward_delegate$lambda$0(this.f$0));
        }
    });
    private final State canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda2
        @Override // h.g.a.a
        public final Object invoke() {
            return Boolean.valueOf(ScrollState.canScrollBackward_delegate$lambda$0(this.f$0));
        }
    });

    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.foundation.ScrollState$_scrollIndicatorState$1] */
    public ScrollState(int i2) {
        this.value$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
    }

    static final ScrollState Saver$lambda$1(int i2) {
        return new ScrollState(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i2, AnimationSpec animationSpec, e eVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i2, animationSpec, eVar);
    }

    static final boolean canScrollBackward_delegate$lambda$0(ScrollState scrollState) {
        return scrollState.getValue() > 0;
    }

    static final boolean canScrollForward_delegate$lambda$0(ScrollState scrollState) {
        return scrollState.getValue() < scrollState.getMaxValue();
    }

    static final float scrollableState$lambda$0(ScrollState scrollState, float f2) {
        float value = scrollState.getValue() + f2 + scrollState.accumulator;
        float fG = n.g(value, 0.0f, scrollState.getMaxValue());
        float value2 = fG - scrollState.getValue();
        int iRound = Math.round(value2);
        scrollState.setValue(scrollState.getValue() + iRound);
        scrollState.accumulator = value2 - iRound;
        return value != fG ? value2 : f2;
    }

    private final void setValue(int i2) {
        this.value$delegate.setIntValue(i2);
    }

    public final Object animateScrollTo(int i2, AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        Object objAnimateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i2 - getValue(), animationSpec, eVar);
        return objAnimateScrollBy == h.c.a.a.f48038a ? objAnimateScrollBy : ab.f48028a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.scrollableState.dispatchRawDelta(f2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getContentSize$foundation() {
        return this.contentSize$delegate.getIntValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this._scrollIndicatorState;
    }

    public final int getValue() {
        return this.value$delegate.getIntValue();
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, pVar, eVar);
        return objScroll == h.c.a.a.f48038a ? objScroll : ab.f48028a;
    }

    public final Object scrollTo(int i2, e<? super Float> eVar) {
        return ScrollExtensionsKt.scrollBy(this, i2 - getValue(), eVar);
    }

    public final void setContentSize$foundation(int i2) {
        this.contentSize$delegate.setIntValue(i2);
    }

    public final void setMaxValue$foundation(int i2) {
        this._maxValueState.setIntValue(i2);
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getValue() > i2) {
                setValue(i2);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final void setViewportSize$foundation(int i2) {
        this.viewportSize$delegate.setIntValue(i2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
