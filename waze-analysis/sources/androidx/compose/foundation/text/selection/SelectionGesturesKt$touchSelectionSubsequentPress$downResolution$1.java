package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.e;
import h.g.a.p;
import h.g.b.ap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends f implements p<AwaitPointerEventScope, e<? super DownResolution>, Object> {
    final /* synthetic */ ap $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j2, ap apVar, e<? super SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1> eVar) {
        super(2, eVar);
        this.$pointerId = j2;
        this.$overSlop = apVar;
    }

    static final ab invokeSuspend$lambda$0(ap apVar, PointerInputChange pointerInputChange, Offset offset) {
        pointerInputChange.consume();
        apVar.f48104a = offset.m7990unboximpl();
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.$pointerId, this.$overSlop, eVar);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.L$0 = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // h.g.a.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super DownResolution> eVar) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            long j2 = this.$pointerId;
            final ap apVar = this.$overSlop;
            this.L$0 = awaitPointerEventScope2;
            this.label = 1;
            Object objM2193awaitTouchSlopOrCancellationjO51t88 = DragGestureDetectorKt.m2193awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, j2, new p() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.invokeSuspend$lambda$0(apVar, (PointerInputChange) obj2, (Offset) obj3);
                }
            }, this);
            if (objM2193awaitTouchSlopOrCancellationjO51t88 == aVar) {
                return aVar;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = objM2193awaitTouchSlopOrCancellationjO51t88;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            c.b(obj);
        }
        if (((PointerInputChange) obj) != null && (this.$overSlop.f48104a & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DownResolution.Drag;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) i.P(awaitPointerEventScope.getCurrentEvent().getChanges());
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            return DownResolution.Cancel;
        }
        pointerInputChange.consume();
        return DownResolution.Up;
    }
}
