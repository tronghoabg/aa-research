package androidx.compose.foundation.text.input.internal;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2 extends g implements l<e<? super ab>, Object> {
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2(TextFieldCoreModifierNode textFieldCoreModifierNode, e<? super TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2> eVar) {
        super(1, eVar);
        this.this$0 = textFieldCoreModifierNode;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2(this.this$0, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.this$0.textFieldSelectionState.setTextToolbarShown$foundation(false);
        return ab.f48028a;
    }
}
