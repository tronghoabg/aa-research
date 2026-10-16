package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.Draggable2DNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.Velocity;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Draggable2DNode extends DragGestureNode {
    public static final int $stable = 8;
    private l<? super Offset, ab> onDragStarted;
    private l<? super Velocity, ab> onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private Draggable2DState state;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.Draggable2DNode$drag$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<Drag2DScope, e<? super ab>, Object> {
        final /* synthetic */ p<l<? super DragEvent.DragDelta, ab>, e<? super ab>, Object> $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ Draggable2DNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, Draggable2DNode draggable2DNode, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$forEachDelta = pVar;
            this.this$0 = draggable2DNode;
        }

        static final ab invokeSuspend$lambda$0(Drag2DScope drag2DScope, Draggable2DNode draggable2DNode, DragEvent.DragDelta dragDelta) {
            long jM2180getDeltaF1C5BW0 = dragDelta.m2180getDeltaF1C5BW0();
            if (draggable2DNode.reverseDirection) {
                jM2180getDeltaF1C5BW0 ^= -9223372034707292160L;
            }
            drag2DScope.mo2166dragByk4lQ0M(jM2180getDeltaF1C5BW0);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$forEachDelta, this.this$0, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(Drag2DScope drag2DScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(drag2DScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final Drag2DScope drag2DScope = (Drag2DScope) this.L$0;
                p<l<? super DragEvent.DragDelta, ab>, e<? super ab>, Object> pVar = this.$forEachDelta;
                final Draggable2DNode draggable2DNode = this.this$0;
                l<? super DragEvent.DragDelta, ab> lVar = new l() { // from class: androidx.compose.foundation.gestures.Draggable2DNode$drag$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return Draggable2DNode.AnonymousClass2.invokeSuspend$lambda$0(drag2DScope, draggable2DNode, (DragEvent.DragDelta) obj2);
                    }
                };
                this.label = 1;
                if (pVar.invoke(lVar, this) == aVar) {
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

    public Draggable2DNode(Draggable2DState draggable2DState, l<? super PointerType, Boolean> lVar, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, l<? super Offset, ab> lVar2, l<? super Velocity, ab> lVar3) {
        super(lVar, z, mutableInteractionSource, null);
        this.state = draggable2DState;
        this.startDragImmediately = z2;
        this.reverseDirection = z3;
        this.onDragStarted = lVar2;
        this.onDragStopped = lVar3;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    private final long m2210reverseIfNeededMKHz9U(long j2) {
        return this.reverseDirection ? j2 ^ (-9223372034707292160L) : j2;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objDrag = this.state.drag(MutatePriority.UserInput, new AnonymousClass2(pVar, this, null), eVar);
        return objDrag == a.f48038a ? objDrag : ab.f48028a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo2145onDragStartedk4lQ0M(long j2) {
        this.onDragStarted.invoke(Offset.m7969boximpl(j2));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        this.onDragStopped.invoke(Velocity.m11397boximpl(dragStopped.m2182getVelocity9UxMQ8M()));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(Draggable2DState draggable2DState, l<? super PointerType, Boolean> lVar, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, l<? super Offset, ab> lVar2, l<? super Velocity, ab> lVar3) {
        boolean z4;
        boolean z5 = true;
        if (x.n(this.state, draggable2DState)) {
            z4 = false;
        } else {
            this.state = draggable2DState;
            z4 = true;
        }
        if (this.reverseDirection != z3) {
            this.reverseDirection = z3;
        } else {
            z5 = z4;
        }
        this.onDragStarted = lVar2;
        this.onDragStopped = lVar3;
        this.startDragImmediately = z2;
        update(lVar, z, mutableInteractionSource, null, z5);
    }
}
