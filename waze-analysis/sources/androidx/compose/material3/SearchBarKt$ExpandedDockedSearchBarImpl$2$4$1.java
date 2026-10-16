package androidx.compose.material3;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SearchBarKt$ExpandedDockedSearchBarImpl$2$4$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ SoftwareKeyboardController $softwareKeyboardController;
    final /* synthetic */ SearchBarState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarKt$ExpandedDockedSearchBarImpl$2$4$1(SearchBarState searchBarState, SoftwareKeyboardController softwareKeyboardController, e<? super SearchBarKt$ExpandedDockedSearchBarImpl$2$4$1> eVar) {
        super(2, eVar);
        this.$state = searchBarState;
        this.$softwareKeyboardController = softwareKeyboardController;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SearchBarKt$ExpandedDockedSearchBarImpl$2$4$1(this.$state, this.$softwareKeyboardController, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SearchBarKt$ExpandedDockedSearchBarImpl$2$4$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        SoftwareKeyboardController softwareKeyboardController;
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        if (this.$state.getTargetValue() == SearchBarValue.Collapsed && (softwareKeyboardController = this.$softwareKeyboardController) != null) {
            softwareKeyboardController.hide();
        }
        return ab.f48028a;
    }
}
