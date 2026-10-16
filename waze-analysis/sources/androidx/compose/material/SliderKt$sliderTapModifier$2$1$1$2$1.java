package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.State;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SliderKt$sliderTapModifier$2$1$1$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ State<l<Float, ab>> $gestureEndAction;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<DragScope, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(DragScope dragScope, e<? super ab> eVar) {
            return ((AnonymousClass1) create(dragScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            ((DragScope) this.L$0).dragBy(0.0f);
            return ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$sliderTapModifier$2$1$1$2$1(DraggableState draggableState, State<? extends l<? super Float, ab>> state, e<? super SliderKt$sliderTapModifier$2$1$1$2$1> eVar) {
        super(2, eVar);
        this.$draggableState = draggableState;
        this.$gestureEndAction = state;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SliderKt$sliderTapModifier$2$1$1$2$1(this.$draggableState, this.$gestureEndAction, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SliderKt$sliderTapModifier$2$1$1$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (this.$draggableState.drag(MutatePriority.UserInput, new AnonymousClass1(null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        this.$gestureEndAction.getValue().invoke(new Float(0.0f));
        return ab.f48028a;
    }
}
