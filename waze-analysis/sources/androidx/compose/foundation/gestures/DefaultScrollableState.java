package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultScrollableState implements ScrollableState {
    private final l<Float, Float> onDelta;
    private final ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f2) {
            if (Float.isNaN(f2)) {
                return 0.0f;
            }
            float fFloatValue = this.this$0.getOnDelta().invoke(Float.valueOf(f2)).floatValue();
            this.this$0.isLastScrollForwardState.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            this.this$0.isLastScrollBackwardState.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    };
    private final MutatorMutex scrollMutex = new MutatorMutex();
    private final MutableState<Boolean> isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState<Boolean> isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState<Boolean> isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<ScrollScope, e<? super ab>, Object> $block;
        final /* synthetic */ MutatePriority $scrollPriority;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<ScrollScope, e<? super ab>, Object> {
            final /* synthetic */ p<ScrollScope, e<? super ab>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultScrollableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(DefaultScrollableState defaultScrollableState, p<? super ScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = defaultScrollableState;
                this.$block = pVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, eVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // h.g.a.p
            public final Object invoke(ScrollScope scrollScope, e<? super ab> eVar) {
                return ((AnonymousClass1) create(scrollScope, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v6, types: [h.ab, java.lang.Object] */
            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        c.b(obj);
                        ScrollScope scrollScope = (ScrollScope) this.L$0;
                        this.this$0.isScrollingState.setValue(true);
                        p<ScrollScope, e<? super ab>, Object> pVar = this.$block;
                        this.label = 1;
                        if (pVar.invoke(scrollScope, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.b(obj);
                    }
                    this.this$0.isScrollingState.setValue(false);
                    this = ab.f48028a;
                    return this;
                } catch (Throwable th) {
                    this.this$0.isScrollingState.setValue(false);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, p<? super ScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$scrollPriority = mutatePriority;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return DefaultScrollableState.this.new AnonymousClass2(this.$scrollPriority, this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                DefaultScrollableState defaultScrollableState = DefaultScrollableState.this;
                MutatePriority mutatePriority = this.$scrollPriority;
                p<ScrollScope, e<? super ab>, Object> pVar = this.$block;
                this.label = 1;
                if (defaultScrollableState.scrollMutex.mutateWith(defaultScrollableState.scrollScope, mutatePriority, new AnonymousClass1(defaultScrollableState, pVar, null), this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState(l<? super Float, Float> lVar) {
        this.onDelta = lVar;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.onDelta.invoke(Float.valueOf(f2)).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollBackward() {
        return true;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ boolean getCanScrollForward() {
        return true;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    public final l<Float, Float> getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public /* synthetic */ ScrollIndicatorState getScrollIndicatorState() {
        return null;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(mutatePriority, pVar, null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }
}
