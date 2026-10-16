package androidx.compose.foundation.text.selection;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 extends g implements l<e<? super ab>, Object> {
    final /* synthetic */ TextFieldSelectionManager $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(TextFieldSelectionManager textFieldSelectionManager, e<? super TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2> eVar) {
        super(1, eVar);
        this.$this_with = textFieldSelectionManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(this.$this_with, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        TextFieldSelectionManager textFieldSelectionManager = this.$this_with;
        textFieldSelectionManager.copy$foundation(textFieldSelectionManager.getTextToolbarShown$foundation());
        return ab.f48028a;
    }
}
