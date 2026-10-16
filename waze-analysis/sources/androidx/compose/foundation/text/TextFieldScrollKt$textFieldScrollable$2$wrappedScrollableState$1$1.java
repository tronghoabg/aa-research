package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 implements ScrollableState {
    private final /* synthetic */ ScrollableState $$delegate_0;
    private final State canScrollBackward$delegate;
    private final State canScrollForward$delegate;

    TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1(ScrollableState scrollableState, final TextFieldScrollerPosition textFieldScrollerPosition) {
        this.$$delegate_0 = scrollableState;
        this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1.canScrollForward_delegate$lambda$0(textFieldScrollerPosition));
            }
        });
        this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1.canScrollBackward_delegate$lambda$1(textFieldScrollerPosition));
            }
        });
    }

    static final boolean canScrollBackward_delegate$lambda$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        return textFieldScrollerPosition.getOffset() > 0.0f;
    }

    static final boolean canScrollForward_delegate$lambda$0(TextFieldScrollerPosition textFieldScrollerPosition) {
        return textFieldScrollerPosition.getOffset() < textFieldScrollerPosition.getMaximum();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.$$delegate_0.dispatchRawDelta(f2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.$$delegate_0.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.$$delegate_0.getLastScrolledForward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this.$$delegate_0.getScrollIndicatorState();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.$$delegate_0.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        return this.$$delegate_0.scroll(mutatePriority, pVar, eVar);
    }
}
