package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ a<ab> $requestFocus;
    final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ TextFieldSelectionState $this_with;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, a<ab> aVar, e<? super TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2> eVar) {
        super(2, eVar);
        this.this$0 = textFieldDecoratorModifierNode;
        this.$this_with = textFieldSelectionState;
        this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
        this.$requestFocus = aVar;
    }

    static final ab invokeSuspend$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        if (textFieldDecoratorModifierNode.inputSessionJob != null) {
            textFieldDecoratorModifierNode.requireKeyboardController().show();
        } else {
            textFieldDecoratorModifierNode.startInputSession(true);
        }
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(this.this$0, this.$this_with, this.$this_SuspendingPointerInputModifierNode, this.$requestFocus, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
            TextFieldSelectionState textFieldSelectionState = this.$this_with;
            PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
            a<ab> aVar2 = this.$requestFocus;
            this.label = 1;
            if (textFieldSelectionState.detectTextFieldTapGestures(pointerInputScope, textFieldDecoratorModifierNode.getInteractionSource(), aVar2, new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2.invokeSuspend$lambda$0(textFieldDecoratorModifierNode);
                }
            }, this) == aVar) {
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
