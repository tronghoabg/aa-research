package androidx.room.coroutines;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.aq;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class Pool$acquireWithTimeout$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ aq<ConnectionWithLock> $connection;
    Object L$0;
    int label;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pool$acquireWithTimeout$2(aq<ConnectionWithLock> aqVar, Pool pool, e<? super Pool$acquireWithTimeout$2> eVar) {
        super(2, eVar);
        this.$connection = aqVar;
        this.this$0 = pool;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new Pool$acquireWithTimeout$2(this.$connection, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((Pool$acquireWithTimeout$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        aq<ConnectionWithLock> aqVar;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            aq<ConnectionWithLock> aqVar2 = this.$connection;
            this.L$0 = aqVar2;
            this.label = 1;
            Object objAcquire = this.this$0.acquire(this);
            if (objAcquire == aVar) {
                return aVar;
            }
            obj = objAcquire;
            aqVar = aqVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aqVar = (aq) this.L$0;
            c.b(obj);
        }
        aqVar.f48105a = obj;
        return ab.f48028a;
    }
}
