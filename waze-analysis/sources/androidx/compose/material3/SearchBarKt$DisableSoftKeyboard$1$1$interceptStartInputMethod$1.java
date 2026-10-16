package androidx.compose.material3;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SearchBarKt$DisableSoftKeyboard$1$1$interceptStartInputMethod$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchBarKt$DisableSoftKeyboard$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarKt$DisableSoftKeyboard$1$1$interceptStartInputMethod$1(SearchBarKt$DisableSoftKeyboard$1$1 searchBarKt$DisableSoftKeyboard$1$1, e<? super SearchBarKt$DisableSoftKeyboard$1$1$interceptStartInputMethod$1> eVar) {
        super(eVar);
        this.this$0 = searchBarKt$DisableSoftKeyboard$1$1;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.interceptStartInputMethod(null, null, this);
    }
}
