package androidx.compose.material3;

import androidx.compose.ui.focus.FocusManager;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SearchBarDefaults$InputField$11$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ boolean $shouldClearFocusOnCollapse;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarDefaults$InputField$11$1(boolean z, FocusManager focusManager, e<? super SearchBarDefaults$InputField$11$1> eVar) {
        super(2, eVar);
        this.$shouldClearFocusOnCollapse = z;
        this.$focusManager = focusManager;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SearchBarDefaults$InputField$11$1(this.$shouldClearFocusOnCollapse, this.$focusManager, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SearchBarDefaults$InputField$11$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            if (this.$shouldClearFocusOnCollapse) {
                this.label = 1;
                if (aj.q(100L, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        FocusManager.CC.clearFocus$default(this.$focusManager, false, 1, null);
        return ab.f48028a;
    }
}
