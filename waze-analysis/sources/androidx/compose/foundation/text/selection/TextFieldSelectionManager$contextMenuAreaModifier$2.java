package androidx.compose.foundation.text.selection;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends g implements l<e<? super ab>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$contextMenuAreaModifier$2(TextFieldSelectionManager textFieldSelectionManager, e<? super TextFieldSelectionManager$contextMenuAreaModifier$2> eVar) {
        super(1, eVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$2(this.this$0, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$2) create(eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r8.mo3852onShowSelectionToolbarSbBc2M(r4, r5, r7) != r0) goto L21;
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
            goto L59
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L18:
            e.b.c.b(r8)
            goto L2d
        L1c:
            e.b.c.b(r8)
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r8 = r7.this$0
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.label = r3
            java.lang.Object r8 = r8.updateClipboardEntry$foundation(r1)
            if (r8 != r0) goto L2d
            goto L58
        L2d:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r8 = r7.this$0
            h.k r8 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getContextTextAndSelection(r8)
            if (r8 == 0) goto L59
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r7.this$0
            java.lang.Object r4 = r8.a()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r8.b()
            androidx.compose.ui.text.TextRange r8 = (androidx.compose.ui.text.TextRange) r8
            long r5 = r8.m10550unboximpl()
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviors r8 = r1.getPlatformSelectionBehaviors$foundation()
            if (r8 == 0) goto L59
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r7.label = r2
            java.lang.Object r8 = r8.mo3852onShowSelectionToolbarSbBc2M(r4, r5, r7)
            if (r8 == r0) goto L58
            goto L59
        L58:
            return r0
        L59:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r7 = r7.this$0
            r7.setTextToolbarShownViaProvider$foundation(r3)
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
