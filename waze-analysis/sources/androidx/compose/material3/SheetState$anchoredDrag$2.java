package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.q;
import h.g.b.an;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SheetState$anchoredDrag$2 extends g implements q<AnchoredDragScope, DraggableAnchors<SheetValue>, e<? super ab>, Object> {
    final /* synthetic */ an $consumedVelocity;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ float $initialVelocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SheetState$anchoredDrag$2(an anVar, FlingBehavior flingBehavior, SheetState sheetState, float f2, e<? super SheetState$anchoredDrag$2> eVar) {
        super(3, eVar);
        this.$consumedVelocity = anVar;
        this.$flingBehavior = flingBehavior;
        this.this$0 = sheetState;
        this.$initialVelocity = f2;
    }

    @Override // h.g.a.q
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<SheetValue> draggableAnchors, e<? super ab> eVar) {
        SheetState$anchoredDrag$2 sheetState$anchoredDrag$2 = new SheetState$anchoredDrag$2(this.$consumedVelocity, this.$flingBehavior, this.this$0, this.$initialVelocity, eVar);
        sheetState$anchoredDrag$2.L$0 = anchoredDragScope;
        return sheetState$anchoredDrag$2.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        an anVar;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            final SheetState sheetState = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.material3.SheetState$anchoredDrag$2$scrollScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f2) {
                    SheetState sheetState2 = sheetState;
                    float fNewOffsetForDelta$material3 = sheetState2.newOffsetForDelta$material3(f2);
                    float offset$material3 = fNewOffsetForDelta$material3 - sheetState2.getOffset$material3();
                    AnchoredDragScope.CC.dragTo$default(anchoredDragScope, fNewOffsetForDelta$material3, 0.0f, 2, null);
                    return offset$material3;
                }
            };
            an anVar2 = this.$consumedVelocity;
            FlingBehavior flingBehavior = this.$flingBehavior;
            float f2 = this.$initialVelocity;
            this.L$0 = anVar2;
            this.label = 1;
            Object objPerformFling = flingBehavior.performFling(scrollScope, f2, this);
            if (objPerformFling == aVar) {
                return aVar;
            }
            obj = objPerformFling;
            anVar = anVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anVar = (an) this.L$0;
            c.b(obj);
        }
        anVar.f48102a = ((Number) obj).floatValue();
        return ab.f48028a;
    }
}
