package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SearchBarKt$ExpandedFullScreenSearchBarImpl$3$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarKt$ExpandedFullScreenSearchBarImpl$3$1$1(FocusRequester focusRequester, e<? super SearchBarKt$ExpandedFullScreenSearchBarImpl$3$1$1> eVar) {
        super(2, eVar);
        this.$focusRequester = focusRequester;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SearchBarKt$ExpandedFullScreenSearchBarImpl$3$1$1(this.$focusRequester, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SearchBarKt$ExpandedFullScreenSearchBarImpl$3$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        FocusRequester.m7885requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
        return ab.f48028a;
    }
}
