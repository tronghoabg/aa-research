package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.DraggableNode;
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
import h.g.a.q;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DraggableNode extends DragGestureNode {
    public static final int $stable = 8;
    private q<? super af, ? super Offset, ? super e<? super ab>, ? extends Object> onDragStarted;
    private q<? super af, ? super Float, ? super e<? super ab>, ? extends Object> onDragStopped;
    private boolean reverseDirection;
    private boolean startDragImmediately;
    private DraggableState state;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DraggableNode$drag$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<DragScope, e<? super ab>, Object> {
        final /* synthetic */ p<l<? super DragEvent.DragDelta, ab>, e<? super ab>, Object> $forEachDelta;
        final /* synthetic */ Orientation $orientation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, DraggableNode draggableNode, Orientation orientation, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$forEachDelta = pVar;
            this.this$0 = draggableNode;
            this.$orientation = orientation;
        }

        static final ab invokeSuspend$lambda$0(DragScope dragScope, DraggableNode draggableNode, Orientation orientation, DragEvent.DragDelta dragDelta) {
            dragScope.dragBy(DraggableKt.m2212toFloat3MmeM6k(draggableNode.m2219reverseIfNeededMKHz9U(dragDelta.m2180getDeltaF1C5BW0()), orientation));
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$forEachDelta, this.this$0, this.$orientation, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(DragScope dragScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(dragScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                p<l<? super DragEvent.DragDelta, ab>, e<? super ab>, Object> pVar = this.$forEachDelta;
                final DraggableNode draggableNode = this.this$0;
                final Orientation orientation = this.$orientation;
                l<? super DragEvent.DragDelta, ab> lVar = new l() { // from class: androidx.compose.foundation.gestures.DraggableNode$drag$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return DraggableNode.AnonymousClass2.invokeSuspend$lambda$0(dragScope, draggableNode, orientation, (DragEvent.DragDelta) obj2);
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

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ DragEvent.DragStopped $event;
        final /* synthetic */ Orientation $orientation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragEvent.DragStopped dragStopped, Orientation orientation, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$event = dragStopped;
            this.$orientation = orientation;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = DraggableNode.this.new AnonymousClass1(this.$event, this.$orientation, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                af afVar = (af) this.L$0;
                DraggableNode draggableNode = DraggableNode.this;
                DragEvent.DragStopped dragStopped = this.$event;
                q qVar = draggableNode.onDragStopped;
                Float f2 = new Float(DraggableKt.m2213toFloatsFctU(draggableNode.m2218reverseIfNeededAH228Gc(dragStopped.m2182getVelocity9UxMQ8M()), this.$orientation));
                this.label = 1;
                if (qVar.invoke(afVar, f2, this) == aVar) {
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

    public DraggableNode(DraggableState draggableState, l<? super PointerType, Boolean> lVar, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, q<? super af, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, q<? super af, ? super Float, ? super e<? super ab>, ? extends Object> qVar2, boolean z3) {
        super(lVar, z, mutableInteractionSource, orientation);
        this.state = draggableState;
        this.startDragImmediately = z2;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m2218reverseIfNeededAH228Gc(long j2) {
        return Velocity.m11412timesadjELrA(j2, true != this.reverseDirection ? 1.0f : -1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m2219reverseIfNeededMKHz9U(long j2) {
        return Offset.m7987timestuRUvjQ(j2, true != this.reverseDirection ? 1.0f : -1.0f);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objDrag;
        Orientation orientation = getOrientation();
        return (orientation != null && (objDrag = this.state.drag(MutatePriority.UserInput, new AnonymousClass2(pVar, this, orientation, null), eVar)) == a.f48038a) ? objDrag : ab.f48028a;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public void mo2145onDragStartedk4lQ0M(long j2) {
        if (!isAttached() || x.n(this.onDragStarted, DraggableKt.NoOpOnDragStarted)) {
            return;
        }
        aj.z(getCoroutineScope(), null, ag.f51345d, new DraggableNode$onDragStarted$1(this, j2, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        Orientation orientation;
        if (!isAttached() || x.n(this.onDragStopped, DraggableKt.NoOpOnDragStopped) || (orientation = getOrientation()) == null) {
            return;
        }
        aj.z(getCoroutineScope(), null, ag.f51345d, new AnonymousClass1(dragStopped, orientation, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        return this.startDragImmediately;
    }

    public final void update(DraggableState draggableState, l<? super PointerType, Boolean> lVar, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, q<? super af, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, q<? super af, ? super Float, ? super e<? super ab>, ? extends Object> qVar2, boolean z3) {
        boolean z4;
        boolean z5 = true;
        if (x.n(this.state, draggableState)) {
            z4 = false;
        } else {
            this.state = draggableState;
            z4 = true;
        }
        if (this.reverseDirection != z3) {
            this.reverseDirection = z3;
        } else {
            z5 = z4;
        }
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.startDragImmediately = z2;
        update(lVar, z, mutableInteractionSource, orientation, z5);
    }
}
