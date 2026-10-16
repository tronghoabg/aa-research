package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.geometry.Offset;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 extends g implements p<Offset, e<? super ab>, Object> {
    final /* synthetic */ TextFieldSelectionState $selectionState;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(TextFieldSelectionState textFieldSelectionState, e<? super CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1> eVar) {
        super(2, eVar);
        this.$selectionState = textFieldSelectionState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 = new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(this.$selectionState, eVar);
        commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1.J$0 = ((Offset) obj).m7990unboximpl();
        return commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(Offset offset, e<? super ab> eVar) {
        return m3242invoke3MmeM6k(offset.m7990unboximpl(), eVar);
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m3242invoke3MmeM6k(long j2, e<? super ab> eVar) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1) create(Offset.m7969boximpl(j2), eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r5.mo3851onShowContextMenu_2OEclM(r11.$selectionState.getTextFieldState$foundation().getVisualText().getText(), r11.$selectionState.getTextFieldState$foundation().getVisualText().m3484getSelectiond9O1mEE(), androidx.compose.ui.geometry.Offset.m7969boximpl(r3), r11) == r0) goto L20;
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r12)
            goto L65
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L18:
            long r3 = r11.J$0
            e.b.c.b(r12)
            goto L31
        L1e:
            e.b.c.b(r12)
            long r4 = r11.J$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r11.$selectionState
            r1 = r11
            h.c.e r1 = (h.c.e) r1
            r11.label = r3
            java.lang.Object r12 = r12.updateClipboardEntry(r1)
            if (r12 == r0) goto L68
            r3 = r4
        L31:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r11.$selectionState
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviors r5 = r12.getPlatformSelectionBehaviors$foundation()
            if (r5 == 0) goto L65
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r11.$selectionState
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r12 = r12.getTextFieldState$foundation()
            androidx.compose.foundation.text.input.TextFieldCharSequence r12 = r12.getVisualText()
            java.lang.CharSequence r6 = r12.getText()
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r11.$selectionState
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r12 = r12.getTextFieldState$foundation()
            androidx.compose.foundation.text.input.TextFieldCharSequence r12 = r12.getVisualText()
            long r7 = r12.m3484getSelectiond9O1mEE()
            androidx.compose.ui.geometry.Offset r9 = androidx.compose.ui.geometry.Offset.m7969boximpl(r3)
            r10 = r11
            h.c.e r10 = (h.c.e) r10
            r11.label = r2
            java.lang.Object r11 = r5.mo3851onShowContextMenu_2OEclM(r6, r7, r9, r10)
            if (r11 != r0) goto L65
            goto L68
        L65:
            h.ab r11 = h.ab.f48028a
            return r11
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
