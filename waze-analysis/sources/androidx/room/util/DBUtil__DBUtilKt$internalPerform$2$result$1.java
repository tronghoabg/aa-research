package androidx.room.util;

import androidx.room.PooledConnection;
import androidx.room.TransactionScope;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DBUtil__DBUtilKt$internalPerform$2$result$1 extends g implements p<TransactionScope, e, Object> {
    final /* synthetic */ p<PooledConnection, e, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtilKt$internalPerform$2$result$1(p<? super PooledConnection, ? super e, ? extends Object> pVar, e<? super DBUtil__DBUtilKt$internalPerform$2$result$1> eVar) {
        super(2, eVar);
        this.$block = pVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, eVar);
        dBUtil__DBUtilKt$internalPerform$2$result$1.L$0 = obj;
        return dBUtil__DBUtilKt$internalPerform$2$result$1;
    }

    @Override // h.g.a.p
    public final Object invoke(TransactionScope transactionScope, e eVar) {
        return ((DBUtil__DBUtilKt$internalPerform$2$result$1) create(transactionScope, eVar)).invokeSuspend(ab.f48028a);
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
        TransactionScope transactionScope = (TransactionScope) this.L$0;
        p<PooledConnection, e, Object> pVar = this.$block;
        this.label = 1;
        Object objInvoke = pVar.invoke(transactionScope, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$block.invoke((TransactionScope) this.L$0, this);
    }
}
