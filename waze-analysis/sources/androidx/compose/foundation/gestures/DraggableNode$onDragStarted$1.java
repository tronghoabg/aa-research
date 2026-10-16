package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DraggableNode$onDragStarted$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ long $startedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DraggableNode$onDragStarted$1(DraggableNode draggableNode, long j2, e<? super DraggableNode$onDragStarted$1> eVar) {
        super(2, eVar);
        this.this$0 = draggableNode;
        this.$startedPosition = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        DraggableNode$onDragStarted$1 draggableNode$onDragStarted$1 = new DraggableNode$onDragStarted$1(this.this$0, this.$startedPosition, eVar);
        draggableNode$onDragStarted$1.L$0 = obj;
        return draggableNode$onDragStarted$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DraggableNode$onDragStarted$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            af afVar = (af) this.L$0;
            DraggableNode draggableNode = this.this$0;
            long j2 = this.$startedPosition;
            q qVar = draggableNode.onDragStarted;
            Offset offsetM7969boximpl = Offset.m7969boximpl(j2);
            this.label = 1;
            if (qVar.invoke(afVar, offsetM7969boximpl, this) == aVar) {
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
