package androidx.room.coroutines;

import androidx.room.Transactor;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ConnectionPool extends AutoCloseable {

    /* compiled from: WazeSource */
    public final class RollbackException extends Throwable {
        private final Object result;

        public RollbackException(Object obj) {
            this.result = obj;
        }

        public final Object getResult() {
            return this.result;
        }
    }

    @Override // java.lang.AutoCloseable
    void close();

    <R> Object useConnection(boolean z, p<? super Transactor, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar);
}
