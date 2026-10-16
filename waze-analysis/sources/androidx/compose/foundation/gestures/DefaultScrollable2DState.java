package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.MuxerUtil;
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
final class DefaultScrollable2DState implements Scrollable2DState {
    private final l<Offset, Offset> onDelta;
    private final Scroll2DScope scrollScope = new Scroll2DScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollable2DState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.Scroll2DScope
        /* renamed from: scrollBy-MK-Hz9U, reason: not valid java name */
        public long mo2169scrollByMKHz9U(long j2) {
            return (Float.isNaN(Float.intBitsToFloat((int) (j2 >> 32))) || Float.isNaN(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)))) ? Offset.Companion.m7996getZeroF1C5BW0() : this.this$0.getOnDelta().invoke(Offset.m7969boximpl(j2)).m7990unboximpl();
        }
    };
    private final MutatorMutex scrollMutex = new MutatorMutex();
    private final MutableState<Boolean> isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<Scroll2DScope, e<? super ab>, Object> $block;
        final /* synthetic */ MutatePriority $scrollPriority;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<Scroll2DScope, e<? super ab>, Object> {
            final /* synthetic */ p<Scroll2DScope, e<? super ab>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultScrollable2DState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(DefaultScrollable2DState defaultScrollable2DState, p<? super Scroll2DScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.this$0 = defaultScrollable2DState;
                this.$block = pVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, eVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // h.g.a.p
            public final Object invoke(Scroll2DScope scroll2DScope, e<? super ab> eVar) {
                return ((AnonymousClass1) create(scroll2DScope, eVar)).invokeSuspend(ab.f48028a);
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
                        Scroll2DScope scroll2DScope = (Scroll2DScope) this.L$0;
                        this.this$0.isScrollingState.setValue(true);
                        p<Scroll2DScope, e<? super ab>, Object> pVar = this.$block;
                        this.label = 1;
                        if (pVar.invoke(scroll2DScope, this) == aVar) {
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
        AnonymousClass2(MutatePriority mutatePriority, p<? super Scroll2DScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$scrollPriority = mutatePriority;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return DefaultScrollable2DState.this.new AnonymousClass2(this.$scrollPriority, this.$block, eVar);
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
                DefaultScrollable2DState defaultScrollable2DState = DefaultScrollable2DState.this;
                MutatePriority mutatePriority = this.$scrollPriority;
                p<Scroll2DScope, e<? super ab>, Object> pVar = this.$block;
                this.label = 1;
                if (defaultScrollable2DState.scrollMutex.mutateWith(defaultScrollable2DState.scrollScope, mutatePriority, new AnonymousClass1(defaultScrollable2DState, pVar, null), this) == aVar) {
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
    public DefaultScrollable2DState(l<? super Offset, Offset> lVar) {
        this.onDelta = lVar;
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    /* renamed from: canScroll-k-4lQ0M, reason: not valid java name */
    public boolean mo2167canScrollk4lQ0M(long j2) {
        return true;
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    public long mo2168dispatchRawDeltaMKHz9U(long j2) {
        return this.onDelta.invoke(Offset.m7969boximpl(j2)).m7990unboximpl();
    }

    public final l<Offset, Offset> getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    public Object scroll(MutatePriority mutatePriority, p<? super Scroll2DScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(mutatePriority, pVar, null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }
}
