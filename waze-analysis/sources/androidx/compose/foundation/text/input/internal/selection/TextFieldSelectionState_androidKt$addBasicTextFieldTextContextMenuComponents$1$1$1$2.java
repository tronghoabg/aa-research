package androidx.compose.foundation.text.input.internal.selection;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2 extends g implements l<e<? super ab>, Object> {
    final /* synthetic */ TextFieldSelectionState $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2(TextFieldSelectionState textFieldSelectionState, e<? super TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2> eVar) {
        super(1, eVar);
        this.$this_with = textFieldSelectionState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2(this.$this_with, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            TextFieldSelectionState textFieldSelectionState = this.$this_with;
            this.label = 1;
            if (textFieldSelectionState.copy(textFieldSelectionState.getTextToolbarShown(), this) == aVar) {
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
