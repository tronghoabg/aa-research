package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.IntOffset;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ContentInViewNode$launchAnimation$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ UpdatableAnimationState $animationState;
    final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
    final /* synthetic */ long $viewportAdjustmentForReverseScroll;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewNode this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<NestedScrollScope, e<? super ab>, Object> {
        final /* synthetic */ br $animationJob;
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        final /* synthetic */ long $viewportAdjustmentForReverseScroll;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, long j2, br brVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$animationState = updatableAnimationState;
            this.this$0 = contentInViewNode;
            this.$bringIntoViewSpec = bringIntoViewSpec;
            this.$viewportAdjustmentForReverseScroll = j2;
            this.$animationJob = brVar;
        }

        static final ab invokeSuspend$lambda$0(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, br brVar, NestedScrollScope nestedScrollScope, float f2) {
            float f3 = true != contentInViewNode.reverseDirection ? -1.0f : 1.0f;
            ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
            float fM2318toFloatk4lQ0M = f3 * scrollingLogic.m2318toFloatk4lQ0M(scrollingLogic.m2316reverseIfNeededMKHz9U(nestedScrollScope.mo2255scrollByOzD1aCk(scrollingLogic.m2316reverseIfNeededMKHz9U(scrollingLogic.m2319toOffsettuRUvjQ(f3 * f2)), NestedScrollSource.Companion.m9476getUserInputWNlRxjI())));
            if (Math.abs(fM2318toFloatk4lQ0M) < Math.abs(f2)) {
                aj.X(brVar, "Scroll animation cancelled because scroll was not consumed (" + fM2318toFloatk4lQ0M + " < " + f2 + ')', null);
            }
            return ab.f48028a;
        }

        static final ab invokeSuspend$lambda$1(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec) {
            ContentInViewNode contentInViewNode2;
            Rect rect;
            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode.bringIntoViewRequests;
            while (true) {
                if (bringIntoViewRequestPriorityQueue.requests.getSize() == 0) {
                    contentInViewNode2 = contentInViewNode;
                    break;
                }
                Rect rectInvoke = ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                if (rectInvoke == null) {
                    contentInViewNode2 = contentInViewNode;
                } else {
                    ContentInViewNode contentInViewNode3 = contentInViewNode;
                    contentInViewNode2 = contentInViewNode3;
                    if (!ContentInViewNode.m2158isMaxVisibleEQwtKw$default(contentInViewNode3, rectInvoke, 0L, 0L, 3, null)) {
                        break;
                    }
                }
                ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(ab.f48028a);
                contentInViewNode = contentInViewNode2;
            }
            if (contentInViewNode2.trackingFocusedChild && (rect = (Rect) contentInViewNode2.getFocusedRect.invoke()) != null && ContentInViewNode.m2158isMaxVisibleEQwtKw$default(contentInViewNode2, rect, 0L, 0L, 3, null)) {
                contentInViewNode2.trackingFocusedChild = false;
            }
            updatableAnimationState.setValue(contentInViewNode2.m2154calculateScrollDeltaI_oMVgE(bringIntoViewSpec, IntOffset.Companion.m11307getZeronOccac()));
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, this.$animationJob, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(NestedScrollScope nestedScrollScope, e<? super ab> eVar) {
            return ((AnonymousClass1) create(nestedScrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                this.$animationState.setValue(this.this$0.m2154calculateScrollDeltaI_oMVgE(this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll));
                final UpdatableAnimationState updatableAnimationState = this.$animationState;
                final ContentInViewNode contentInViewNode = this.this$0;
                final br brVar = this.$animationJob;
                l<? super Float, ab> lVar = new l() { // from class: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return ContentInViewNode$launchAnimation$2.AnonymousClass1.invokeSuspend$lambda$0(contentInViewNode, updatableAnimationState, brVar, nestedScrollScope, ((Float) obj2).floatValue());
                    }
                };
                final BringIntoViewSpec bringIntoViewSpec = this.$bringIntoViewSpec;
                this.label = 1;
                if (updatableAnimationState.animateToZero(lVar, new h.g.a.a() { // from class: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ContentInViewNode$launchAnimation$2.AnonymousClass1.invokeSuspend$lambda$1(contentInViewNode, updatableAnimationState, bringIntoViewSpec);
                    }
                }, this) == aVar) {
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
    ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, long j2, e<? super ContentInViewNode$launchAnimation$2> eVar) {
        super(2, eVar);
        this.this$0 = contentInViewNode;
        this.$animationState = updatableAnimationState;
        this.$bringIntoViewSpec = bringIntoViewSpec;
        this.$viewportAdjustmentForReverseScroll = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, eVar);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ContentInViewNode$launchAnimation$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        CancellationException cancellationException = null;
        try {
            try {
                if (i2 == 0) {
                    c.b(obj);
                    br brVarD = o.d(((af) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    this.label = 1;
                    if (this.this$0.scrollingLogic.scroll(MutatePriority.Default, new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, brVarD, null), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
                this.this$0.trackingFocusedChild = false;
                return ab.f48028a;
            } catch (CancellationException e2) {
                cancellationException = e2;
                throw cancellationException;
            }
        } catch (Throwable th) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.cancelAndRemoveAll(cancellationException);
            this.this$0.trackingFocusedChild = false;
            throw th;
        }
    }
}
