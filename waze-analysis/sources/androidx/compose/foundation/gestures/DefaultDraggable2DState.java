package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.ui.geometry.Offset;
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
final class DefaultDraggable2DState implements Draggable2DState {
    private final l<Offset, ab> onDelta;
    private final Drag2DScope drag2DScope = new Drag2DScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggable2DState$drag2DScope$1
        @Override // androidx.compose.foundation.gestures.Drag2DScope
        /* renamed from: dragBy-k-4lQ0M, reason: not valid java name */
        public void mo2166dragByk4lQ0M(long j2) {
            this.this$0.getOnDelta().invoke(Offset.m7969boximpl(j2));
        }
    };
    private final MutatorMutex drag2DMutex = new MutatorMutex();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<Drag2DScope, e<? super ab>, Object> $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, p<? super Drag2DScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$dragPriority = mutatePriority;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return DefaultDraggable2DState.this.new AnonymousClass2(this.$dragPriority, this.$block, eVar);
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
                DefaultDraggable2DState defaultDraggable2DState = DefaultDraggable2DState.this;
                MutatePriority mutatePriority = this.$dragPriority;
                p<Drag2DScope, e<? super ab>, Object> pVar = this.$block;
                this.label = 1;
                if (defaultDraggable2DState.drag2DMutex.mutateWith(defaultDraggable2DState.drag2DScope, mutatePriority, pVar, this) == aVar) {
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
    public DefaultDraggable2DState(l<? super Offset, ab> lVar) {
        this.onDelta = lVar;
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    /* renamed from: dispatchRawDelta-k-4lQ0M, reason: not valid java name */
    public void mo2165dispatchRawDeltak4lQ0M(long j2) {
        this.onDelta.invoke(Offset.m7969boximpl(j2));
    }

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    public Object drag(MutatePriority mutatePriority, p<? super Drag2DScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(mutatePriority, pVar, null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    public final l<Offset, ab> getOnDelta() {
        return this.onDelta;
    }
}
