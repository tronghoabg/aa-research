package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SelectionContainerKt$SelectionContainer$3$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Clipboard $clipboard;
    final /* synthetic */ AnnotatedString $textToCopy;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionContainerKt$SelectionContainer$3$1$1(Clipboard clipboard, AnnotatedString annotatedString, e<? super SelectionContainerKt$SelectionContainer$3$1$1> eVar) {
        super(2, eVar);
        this.$clipboard = clipboard;
        this.$textToCopy = annotatedString;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SelectionContainerKt$SelectionContainer$3$1$1(this.$clipboard, this.$textToCopy, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SelectionContainerKt$SelectionContainer$3$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (this.$clipboard.setClipEntry(ClipboardUtils_androidKt.toClipEntry(this.$textToCopy), this) == aVar) {
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
