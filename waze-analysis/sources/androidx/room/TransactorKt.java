package androidx.room;

import androidx.room.Transactor;
import androidx.sqlite.SQLiteStatement;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TransactorKt {
    public static final <R> Object deferredTransaction(Transactor transactor, p<? super TransactionScope<R>, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.DEFERRED, pVar, eVar);
    }

    public static final <R> Object exclusiveTransaction(Transactor transactor, p<? super TransactionScope<R>, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.EXCLUSIVE, pVar, eVar);
    }

    public static final Object execSQL(PooledConnection pooledConnection, String str, e<? super ab> eVar) {
        Object objUsePrepared = pooledConnection.usePrepared(str, new l() { // from class: androidx.room.TransactorKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TransactorKt.execSQL$lambda$0((SQLiteStatement) obj));
            }
        }, eVar);
        return objUsePrepared == a.f48038a ? objUsePrepared : ab.f48028a;
    }

    static final boolean execSQL$lambda$0(SQLiteStatement sQLiteStatement) {
        x.f(sQLiteStatement, "it");
        return sQLiteStatement.step();
    }

    public static final <R> Object immediateTransaction(Transactor transactor, p<? super TransactionScope<R>, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.IMMEDIATE, pVar, eVar);
    }
}
