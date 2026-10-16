package androidx.compose.foundation.text.selection;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSelectionManager$contextMenuAreaModifier$3 extends g implements l<e<? super ab>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$contextMenuAreaModifier$3(TextFieldSelectionManager textFieldSelectionManager, e<? super TextFieldSelectionManager$contextMenuAreaModifier$3> eVar) {
        super(1, eVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$3(this.this$0, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$3) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.this$0.setTextToolbarShownViaProvider$foundation(false);
        return ab.f48028a;
    }
}
