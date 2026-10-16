package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ TextFieldSelectionManager $manager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1(TextFieldSelectionManager textFieldSelectionManager, BringIntoViewRequester bringIntoViewRequester, e<? super CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1> eVar) {
        super(2, eVar);
        this.$manager = textFieldSelectionManager;
        this.$bringIntoViewRequester = bringIntoViewRequester;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1(this.$manager, this.$bringIntoViewRequester, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            this.label = 1;
            if (this.$bringIntoViewRequester.bringIntoView(textFieldSelectionManager.getCursorRect$foundation(), this) == aVar) {
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
