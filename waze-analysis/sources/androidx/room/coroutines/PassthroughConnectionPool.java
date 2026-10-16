package androidx.room.coroutines;

import androidx.room.Transactor;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.h;
import h.c.i;
import h.c.j;
import h.f;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PassthroughConnectionPool implements ConnectionPool {
    private final f<SQLiteConnection> connection;
    private final SQLiteDriver driver;
    private final String fileName;
    private final p<l<? super e<Object>, ? extends Object>, e<Object>, Object> transactionWrapper;

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.coroutines.PassthroughConnectionPool$useConnection$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ p<Transactor, e, Object> $block;
        final /* synthetic */ PassthroughConnection $connectionWrapper;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super Transactor, ? super e, ? extends Object> pVar, PassthroughConnection passthroughConnection, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$block = pVar;
            this.$connectionWrapper = passthroughConnection;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$block, this.$connectionWrapper, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
            p<Transactor, e, Object> pVar = this.$block;
            PassthroughConnection passthroughConnection = this.$connectionWrapper;
            this.label = 1;
            Object objInvoke = pVar.invoke(passthroughConnection, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassthroughConnectionPool(SQLiteDriver sQLiteDriver, String str, p<? super l<? super e<Object>, ? extends Object>, ? super e<Object>, ? extends Object> pVar) {
        x.f(sQLiteDriver, "driver");
        x.f(str, "fileName");
        this.driver = sQLiteDriver;
        this.fileName = str;
        this.transactionWrapper = pVar;
        this.connection = h.g.a(new h.g.a.a() { // from class: androidx.room.coroutines.PassthroughConnectionPool$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                PassthroughConnectionPool passthroughConnectionPool = this.f$0;
                return passthroughConnectionPool.driver.open(passthroughConnectionPool.fileName);
            }
        });
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this.connection.isInitialized()) {
            this.connection.getValue().close();
        }
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public <R> Object useConnection(boolean z, p<? super Transactor, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        ConnectionElement connectionElement = (ConnectionElement) eVar.getContext().get(ConnectionElement.Key);
        PassthroughConnection connectionWrapper = connectionElement != null ? connectionElement.getConnectionWrapper() : null;
        if (connectionWrapper != null) {
            return pVar.invoke(connectionWrapper, eVar);
        }
        PassthroughConnection passthroughConnection = new PassthroughConnection(this.transactionWrapper, this.connection.getValue());
        return aj.v(new ConnectionElement(passthroughConnection), new AnonymousClass2(pVar, passthroughConnection, null), eVar);
    }

    /* compiled from: WazeSource */
    final class ConnectionElement implements h {
        public static final Key Key = new Key(null);
        private final PassthroughConnection connectionWrapper;

        public ConnectionElement(PassthroughConnection passthroughConnection) {
            x.f(passthroughConnection, "connectionWrapper");
            this.connectionWrapper = passthroughConnection;
        }

        @Override // h.c.j
        public <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
            return (R) h.c.a.h.e(this, r, pVar);
        }

        @Override // h.c.h, h.c.j
        public <E extends h> E get(i<E> iVar) {
            return (E) h.c.a.h.f(this, iVar);
        }

        public final PassthroughConnection getConnectionWrapper() {
            return this.connectionWrapper;
        }

        @Override // h.c.h
        public i<ConnectionElement> getKey() {
            return Key;
        }

        @Override // h.c.j
        public j minusKey(i<?> iVar) {
            return h.c.a.h.g(this, iVar);
        }

        @Override // h.c.j
        public j plus(j jVar) {
            return h.c.a.h.h(this, jVar);
        }

        /* compiled from: WazeSource */
        public final class Key implements i<ConnectionElement> {
            private Key() {
            }

            public /* synthetic */ Key(o oVar) {
                this();
            }
        }
    }

    public /* synthetic */ PassthroughConnectionPool(SQLiteDriver sQLiteDriver, String str, p pVar, int i2, o oVar) {
        this(sQLiteDriver, str, (i2 & 4) != 0 ? null : pVar);
    }
}
