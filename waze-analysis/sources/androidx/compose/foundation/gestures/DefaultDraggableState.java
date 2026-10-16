package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
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
final class DefaultDraggableState implements DraggableState {
    private final l<Float, ab> onDelta;
    private final DragScope dragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float f2) {
            this.this$0.getOnDelta().invoke(Float.valueOf(f2));
        }
    };
    private final MutatorMutex scrollMutex = new MutatorMutex();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DefaultDraggableState$drag$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ p<DragScope, e<? super ab>, Object> $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, p<? super DragScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$dragPriority = mutatePriority;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return DefaultDraggableState.this.new AnonymousClass2(this.$dragPriority, this.$block, eVar);
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
                DefaultDraggableState defaultDraggableState = DefaultDraggableState.this;
                MutatePriority mutatePriority = this.$dragPriority;
                p<DragScope, e<? super ab>, Object> pVar = this.$block;
                this.label = 1;
                if (defaultDraggableState.scrollMutex.mutateWith(defaultDraggableState.dragScope, mutatePriority, pVar, this) == aVar) {
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
    public DefaultDraggableState(l<? super Float, ab> lVar) {
        this.onDelta = lVar;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f2) {
        this.onDelta.invoke(Float.valueOf(f2));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, p<? super DragScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objD = aj.d(new AnonymousClass2(mutatePriority, pVar, null), eVar);
        return objD == a.f48038a ? objD : ab.f48028a;
    }

    public final l<Float, ab> getOnDelta() {
        return this.onDelta;
    }
}
