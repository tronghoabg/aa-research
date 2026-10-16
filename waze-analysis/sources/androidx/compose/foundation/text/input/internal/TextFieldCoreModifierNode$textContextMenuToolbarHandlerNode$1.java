package androidx.compose.foundation.text.input.internal;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1 extends g implements l<e<? super ab>, Object> {
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1(TextFieldCoreModifierNode textFieldCoreModifierNode, e<? super TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1> eVar) {
        super(1, eVar);
        this.this$0 = textFieldCoreModifierNode;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1(this.this$0, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r8.mo3852onShowSelectionToolbarSbBc2M(r7.this$0.textFieldSelectionState.getTextFieldState$foundation().getVisualText().getText(), r7.this$0.textFieldSelectionState.getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE(), r7) != r0) goto L19;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r8)
            goto L6a
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L18:
            e.b.c.b(r8)
            goto L31
        L1c:
            e.b.c.b(r8)
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r8 = r7.this$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getTextFieldSelectionState$p(r8)
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.label = r3
            java.lang.Object r8 = r8.updateClipboardEntry(r1)
            if (r8 != r0) goto L31
            goto L69
        L31:
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r8 = r7.this$0
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviors r8 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getPlatformSelectionBehaviors$p(r8)
            if (r8 == 0) goto L6a
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r1 = r7.this$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getTextFieldSelectionState$p(r1)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r1 = r1.getTextFieldState$foundation()
            androidx.compose.foundation.text.input.TextFieldCharSequence r1 = r1.getVisualText()
            java.lang.CharSequence r1 = r1.getText()
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r4 = r7.this$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getTextFieldSelectionState$p(r4)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r4 = r4.getTextFieldState$foundation()
            androidx.compose.foundation.text.input.TextFieldCharSequence r4 = r4.getVisualText()
            long r4 = r4.m3484getSelectiond9O1mEE()
            r6 = r7
            h.c.e r6 = (h.c.e) r6
            r7.label = r2
            java.lang.Object r8 = r8.mo3852onShowSelectionToolbarSbBc2M(r1, r4, r6)
            if (r8 == r0) goto L69
            goto L6a
        L69:
            return r0
        L6a:
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r7 = r7.this$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r7 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getTextFieldSelectionState$p(r7)
            r7.setTextToolbarShown$foundation(r3)
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
