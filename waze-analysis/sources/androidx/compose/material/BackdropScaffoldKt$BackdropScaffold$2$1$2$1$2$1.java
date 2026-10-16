package androidx.compose.material;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1(BackdropScaffoldState backdropScaffoldState, e<? super BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1> eVar) {
        super(2, eVar);
        this.$scaffoldState = backdropScaffoldState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1(this.$scaffoldState, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (this.$scaffoldState.conceal(this) == aVar) {
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
