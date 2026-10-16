package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldCoreModifierNode$updateScrollState$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ long $currSelection;
    final /* synthetic */ float $offsetDifference;
    final /* synthetic */ Rect $rawCursorRect;
    final /* synthetic */ boolean $shouldBringIntoView;
    float F$0;
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldCoreModifierNode$updateScrollState$1(float f2, TextFieldCoreModifierNode textFieldCoreModifierNode, boolean z, long j2, Rect rect, e<? super TextFieldCoreModifierNode$updateScrollState$1> eVar) {
        super(2, eVar);
        this.$offsetDifference = f2;
        this.this$0 = textFieldCoreModifierNode;
        this.$shouldBringIntoView = z;
        this.$currSelection = j2;
        this.$rawCursorRect = rect;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.$offsetDifference, this.this$0, this.$shouldBringIntoView, this.$currSelection, this.$rawCursorRect, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r11.this$0.textLayoutState.getBringIntoViewRequester().bringIntoView(r12, r11) != r0) goto L27;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            e.b.c.b(r12)
            goto L99
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L19:
            float r1 = r11.F$0
            e.b.c.b(r12)
            goto L40
        L1f:
            e.b.c.b(r12)
            float r12 = r11.$offsetDifference
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r1 = r11.this$0
            float r12 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierKt.access$roundToNext(r12)
            androidx.compose.foundation.ScrollState r1 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getScrollState$p(r1)
            androidx.compose.foundation.gestures.ScrollableState r1 = (androidx.compose.foundation.gestures.ScrollableState) r1
            r4 = r11
            h.c.e r4 = (h.c.e) r4
            r11.F$0 = r12
            r11.label = r3
            java.lang.Object r1 = androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r1, r12, r4)
            if (r1 == r0) goto L9c
            r10 = r1
            r1 = r12
            r12 = r10
        L40:
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            boolean r3 = r11.$shouldBringIntoView
            if (r3 == 0) goto L99
            long r3 = r11.$currSelection
            boolean r3 = androidx.compose.ui.text.TextRange.m10540getCollapsedimpl(r3)
            if (r3 == 0) goto L81
            androidx.compose.ui.geometry.Rect r3 = r11.$rawCursorRect
            float r4 = r3.getRight()
            float r3 = r3.getLeft()
            float r4 = r4 - r3
            r3 = 0
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 > 0) goto L81
            float r1 = r1 - r12
            float r12 = java.lang.Math.abs(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 >= 0) goto L6e
            goto L81
        L6e:
            androidx.compose.ui.geometry.Rect r3 = r11.$rawCursorRect
            float r12 = r3.getRight()
            float r6 = r12 + r1
            r8 = 11
            r9 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            androidx.compose.ui.geometry.Rect r12 = androidx.compose.ui.geometry.Rect.copy$default(r3, r4, r5, r6, r7, r8, r9)
            goto L83
        L81:
            androidx.compose.ui.geometry.Rect r12 = r11.$rawCursorRect
        L83:
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r1 = r11.this$0
            androidx.compose.foundation.text.input.internal.TextLayoutState r1 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getTextLayoutState$p(r1)
            androidx.compose.foundation.relocation.BringIntoViewRequester r1 = r1.getBringIntoViewRequester()
            r3 = r11
            h.c.e r3 = (h.c.e) r3
            r11.label = r2
            java.lang.Object r11 = r1.bringIntoView(r12, r3)
            if (r11 != r0) goto L99
            goto L9c
        L99:
            h.ab r11 = h.ab.f48028a
            return r11
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
