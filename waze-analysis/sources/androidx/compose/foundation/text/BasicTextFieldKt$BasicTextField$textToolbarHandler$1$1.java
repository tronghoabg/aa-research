package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 implements TextToolbarHandler {
    final /* synthetic */ af $coroutineScope;
    final /* synthetic */ TextToolbar $currentTextToolbar;

    BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(TextToolbar textToolbar, af afVar) {
        this.$currentTextToolbar = textToolbar;
        this.$coroutineScope = afVar;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    public void hideTextToolbar() {
        if (this.$currentTextToolbar.getStatus() == TextToolbarStatus.Shown) {
            this.$currentTextToolbar.hide();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object showTextToolbar(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8, androidx.compose.ui.geometry.Rect r9, h.c.e<? super h.ab> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 r0 = (androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 r0 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.L$3
            r8 = r7
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r8
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.af r7 = (kotlinx.coroutines.af) r7
            java.lang.Object r9 = r0.L$1
            androidx.compose.ui.platform.TextToolbar r9 = (androidx.compose.ui.platform.TextToolbar) r9
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.geometry.Rect r0 = (androidx.compose.ui.geometry.Rect) r0
            e.b.c.b(r10)
            r1 = r0
            r0 = r9
            goto L5b
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            e.b.c.b(r10)
            androidx.compose.ui.platform.TextToolbar r10 = r7.$currentTextToolbar
            kotlinx.coroutines.af r7 = r7.$coroutineScope
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r7
            r0.L$3 = r8
            r0.label = r3
            java.lang.Object r0 = r8.updateClipboardEntry(r0)
            if (r0 == r1) goto Lbc
            r1 = r9
            r0 = r10
        L5b:
            boolean r9 = r8.canShowCopyMenuItem()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r10 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            r2 = 0
            if (r9 != 0) goto L66
            r9 = r2
            goto L6d
        L66:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$1 r9 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$1
            r9.<init>()
            h.g.a.a r9 = (h.g.a.a) r9
        L6d:
            boolean r10 = r8.canShowPasteMenuItem()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r3 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r10 != 0) goto L77
            r3 = r2
            goto L7f
        L77:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$2 r10 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$2
            r10.<init>()
            h.g.a.a r10 = (h.g.a.a) r10
            r3 = r10
        L7f:
            boolean r10 = r8.canShowCutMenuItem()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r4 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r10 != 0) goto L89
            r4 = r2
            goto L91
        L89:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$3 r10 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$3
            r10.<init>()
            h.g.a.a r10 = (h.g.a.a) r10
            r4 = r10
        L91:
            boolean r7 = r8.canShowSelectAllMenuItem()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r10 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection
            if (r7 != 0) goto L9b
            r5 = r2
            goto La3
        L9b:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$4 r7 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$4
            r7.<init>()
            h.g.a.a r7 = (h.g.a.a) r7
            r5 = r7
        La3:
            boolean r7 = r8.canShowAutofillMenuItem()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r10 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r7 != 0) goto Lac
            goto Lb4
        Lac:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$5 r7 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$5
            r7.<init>()
            r2 = r7
            h.g.a.a r2 = (h.g.a.a) r2
        Lb4:
            r6 = r2
            r2 = r9
            r0.showMenu(r1, r2, r3, r4, r5, r6)
            h.ab r7 = h.ab.f48028a
            return r7
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1.showTextToolbar(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.geometry.Rect, h.c.e):java.lang.Object");
    }
}
