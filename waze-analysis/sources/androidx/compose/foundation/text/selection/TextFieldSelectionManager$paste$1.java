package androidx.compose.foundation.text.selection;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSelectionManager$paste$1 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, e<? super TextFieldSelectionManager$paste$1> eVar) {
        super(2, eVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TextFieldSelectionManager$paste$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TextFieldSelectionManager$paste$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r5 != r0) goto L18;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r5)
            goto L41
        L10:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L18:
            e.b.c.b(r5)
            goto L32
        L1c:
            e.b.c.b(r5)
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = r4.this$0
            androidx.compose.ui.platform.Clipboard r5 = r5.getClipboard$foundation()
            if (r5 == 0) goto L4f
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.label = r3
            java.lang.Object r5 = r5.getClipEntry(r1)
            if (r5 == r0) goto L4e
        L32:
            androidx.compose.ui.platform.ClipEntry r5 = (androidx.compose.ui.platform.ClipEntry) r5
            if (r5 == 0) goto L4f
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.label = r2
            java.lang.Object r5 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.readAnnotatedString(r5, r1)
            if (r5 == r0) goto L4e
        L41:
            androidx.compose.ui.text.AnnotatedString r5 = (androidx.compose.ui.text.AnnotatedString) r5
            if (r5 != 0) goto L46
            goto L4f
        L46:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r4 = r4.this$0
            r4.paste$foundation(r5)
            h.ab r4 = h.ab.f48028a
            return r4
        L4e:
            return r0
        L4f:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
