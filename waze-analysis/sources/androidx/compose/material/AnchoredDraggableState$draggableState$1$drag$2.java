package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnchoredDraggableState$draggableState$1$drag$2<T> extends g implements q<AnchoredDragScope, DraggableAnchors<T>, e<? super ab>, Object> {
    final /* synthetic */ p<DragScope, e<? super ab>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, p<? super DragScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnchoredDraggableState$draggableState$1$drag$2> eVar) {
        super(3, eVar);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = pVar;
    }

    @Override // h.g.a.q
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, e<? super ab> eVar) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, eVar).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1 = this.this$0;
            p<DragScope, e<? super ab>, Object> pVar = this.$block;
            AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1 = anchoredDraggableState$draggableState$1.dragScope;
            this.label = 1;
            if (pVar.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == aVar) {
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
