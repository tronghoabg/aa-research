package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.core.MutexToken;
import androidx.camera.camera2.pipe.core.MutexesKt;
import androidx.camera.camera2.pipe.core.Token;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class GraphSessionLock$withTokenIn$1 extends g implements p<af, e, Object> {
    final /* synthetic */ p<Token, e, Object> $action;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GraphSessionLock this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<Token, e, Object> {
        final /* synthetic */ p<Token, e, Object> $action;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super Token, ? super e, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$action = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$action, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(Token token, e eVar) {
            return ((AnonymousClass1) create(token, eVar)).invokeSuspend(ab.f48028a);
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
            p<Token, e, Object> pVar = this.$action;
            this.label = 1;
            Object objInvoke = pVar.invoke(token, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GraphSessionLock$withTokenIn$1(GraphSessionLock graphSessionLock, p<? super Token, ? super e, ? extends Object> pVar, e<? super GraphSessionLock$withTokenIn$1> eVar) {
        super(2, eVar);
        this.this$0 = graphSessionLock;
        this.$action = pVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new GraphSessionLock$withTokenIn$1(this.this$0, this.$action, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((GraphSessionLock$withTokenIn$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        GraphSessionLock graphSessionLock;
        kotlinx.coroutines.h.a aVar;
        a aVar2 = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            graphSessionLock = this.this$0;
            kotlinx.coroutines.h.a aVar3 = graphSessionLock.mutex;
            this.L$0 = aVar3;
            this.L$1 = graphSessionLock;
            this.label = 1;
            if (MutexesKt.lockAndSuspend(aVar3, this) != aVar2) {
                aVar = aVar3;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        graphSessionLock = (GraphSessionLock) this.L$1;
        aVar = (kotlinx.coroutines.h.a) this.L$0;
        c.b(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objUse = graphSessionLock.use(new MutexToken(aVar), new AnonymousClass1(this.$action, null), this);
        return objUse == aVar2 ? aVar2 : objUse;
    }
}
