package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends g implements p<Offset, e<? super ab>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$contextMenuAreaModifier$1(TextFieldSelectionManager textFieldSelectionManager, e<? super TextFieldSelectionManager$contextMenuAreaModifier$1> eVar) {
        super(2, eVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.this$0, eVar);
        textFieldSelectionManager$contextMenuAreaModifier$1.J$0 = ((Offset) obj).m7990unboximpl();
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(Offset offset, e<? super ab> eVar) {
        return m3931invoke3MmeM6k(offset.m7990unboximpl(), eVar);
    }

    /* renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m3931invoke3MmeM6k(long j2, e<? super ab> eVar) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$1) create(Offset.m7969boximpl(j2), eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r6.mo3851onShowContextMenu_2OEclM(r5, r8, r10, r12) == r0) goto L22;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r13)
            goto L62
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L18:
            long r3 = r12.J$0
            e.b.c.b(r13)
            goto L31
        L1e:
            e.b.c.b(r13)
            long r4 = r12.J$0
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.this$0
            r1 = r12
            h.c.e r1 = (h.c.e) r1
            r12.label = r3
            java.lang.Object r13 = r13.updateClipboardEntry$foundation(r1)
            if (r13 == r0) goto L65
            r3 = r4
        L31:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.this$0
            h.k r13 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getContextTextAndSelection(r13)
            if (r13 == 0) goto L62
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r12.this$0
            java.lang.Object r5 = r13.a()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r13 = r13.b()
            androidx.compose.ui.text.TextRange r13 = (androidx.compose.ui.text.TextRange) r13
            long r8 = r13.m10550unboximpl()
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviors r6 = r1.getPlatformSelectionBehaviors$foundation()
            if (r6 == 0) goto L62
            r7 = r5
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m7969boximpl(r3)
            r12.label = r2
            r11 = r12
            java.lang.Object r12 = r6.mo3851onShowContextMenu_2OEclM(r7, r8, r10, r11)
            if (r12 != r0) goto L62
            goto L65
        L62:
            h.ab r12 = h.ab.f48028a
            return r12
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
