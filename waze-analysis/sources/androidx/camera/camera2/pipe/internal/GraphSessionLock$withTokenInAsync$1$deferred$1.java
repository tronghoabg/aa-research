package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.core.Token;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class GraphSessionLock$withTokenInAsync$1$deferred$1 extends g implements p<Token, e<? super am>, Object> {
    final /* synthetic */ p<Token, e<? super am>, Object> $action;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GraphSessionLock$withTokenInAsync$1$deferred$1(p<? super Token, ? super e<? super am>, ? extends Object> pVar, e<? super GraphSessionLock$withTokenInAsync$1$deferred$1> eVar) {
        super(2, eVar);
        this.$action = pVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        GraphSessionLock$withTokenInAsync$1$deferred$1 graphSessionLock$withTokenInAsync$1$deferred$1 = new GraphSessionLock$withTokenInAsync$1$deferred$1(this.$action, eVar);
        graphSessionLock$withTokenInAsync$1$deferred$1.L$0 = obj;
        return graphSessionLock$withTokenInAsync$1$deferred$1;
    }

    @Override // h.g.a.p
    public final Object invoke(Token token, e<? super am> eVar) {
        return ((GraphSessionLock$withTokenInAsync$1$deferred$1) create(token, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        Token token = (Token) this.L$0;
        p<Token, e<? super am>, Object> pVar = this.$action;
        this.label = 1;
        Object objInvoke = pVar.invoke(token, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
