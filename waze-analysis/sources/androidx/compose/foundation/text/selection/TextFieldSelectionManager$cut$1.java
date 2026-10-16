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
final class TextFieldSelectionManager$cut$1 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$cut$1(TextFieldSelectionManager textFieldSelectionManager, e<? super TextFieldSelectionManager$cut$1> eVar) {
        super(2, eVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TextFieldSelectionManager$cut$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TextFieldSelectionManager$cut$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Clipboard clipboard$foundation;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            AnnotatedString annotatedStringCutWithResult$foundation = this.this$0.cutWithResult$foundation();
            if (annotatedStringCutWithResult$foundation != null && (clipboard$foundation = this.this$0.getClipboard$foundation()) != null) {
                this.label = 1;
                if (clipboard$foundation.setClipEntry(ClipboardUtils_androidKt.toClipEntry(annotatedStringCutWithResult$foundation), this) == aVar) {
                    return aVar;
                }
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
