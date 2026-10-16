package androidx.room.support;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> bindArgsCache;
    private final SupportSQLiteStatement delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final af queryCallbackScope;
    private final String sqlStatement;

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.support.QueryInterceptorStatement$execute$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<? extends Object> list, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$argsCopy = list;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return QueryInterceptorStatement.this.new AnonymousClass1(this.$argsCopy, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            QueryInterceptorStatement queryInterceptorStatement = QueryInterceptorStatement.this;
            queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, this.$argsCopy);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.support.QueryInterceptorStatement$executeInsert$1, reason: invalid class name and case insensitive filesystem */
    final class C04691 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04691(List<? extends Object> list, e<? super C04691> eVar) {
            super(2, eVar);
            this.$argsCopy = list;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return QueryInterceptorStatement.this.new C04691(this.$argsCopy, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04691) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            QueryInterceptorStatement queryInterceptorStatement = QueryInterceptorStatement.this;
            queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, this.$argsCopy);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.support.QueryInterceptorStatement$executeUpdateDelete$1, reason: invalid class name and case insensitive filesystem */
    final class C04701 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04701(List<? extends Object> list, e<? super C04701> eVar) {
            super(2, eVar);
            this.$argsCopy = list;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return QueryInterceptorStatement.this.new C04701(this.$argsCopy, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04701) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            QueryInterceptorStatement queryInterceptorStatement = QueryInterceptorStatement.this;
            queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, this.$argsCopy);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.support.QueryInterceptorStatement$simpleQueryForLong$1, reason: invalid class name and case insensitive filesystem */
    final class C04711 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04711(List<? extends Object> list, e<? super C04711> eVar) {
            super(2, eVar);
            this.$argsCopy = list;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return QueryInterceptorStatement.this.new C04711(this.$argsCopy, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04711) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            QueryInterceptorStatement queryInterceptorStatement = QueryInterceptorStatement.this;
            queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, this.$argsCopy);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.support.QueryInterceptorStatement$simpleQueryForString$1, reason: invalid class name and case insensitive filesystem */
    final class C04721 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04721(List<? extends Object> list, e<? super C04721> eVar) {
            super(2, eVar);
            this.$argsCopy = list;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return QueryInterceptorStatement.this.new C04721(this.$argsCopy, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04721) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            QueryInterceptorStatement queryInterceptorStatement = QueryInterceptorStatement.this;
            queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, this.$argsCopy);
            return ab.f48028a;
        }
    }

    public QueryInterceptorStatement(SupportSQLiteStatement supportSQLiteStatement, String str, af afVar, RoomDatabase.QueryCallback queryCallback) {
        x.f(supportSQLiteStatement, "delegate");
        x.f(str, "sqlStatement");
        x.f(afVar, "queryCallbackScope");
        x.f(queryCallback, "queryCallback");
        this.delegate = supportSQLiteStatement;
        this.sqlStatement = str;
        this.queryCallbackScope = afVar;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    private final void saveArgsToCache(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 >= this.bindArgsCache.size()) {
            int size = i3 - this.bindArgsCache.size();
            for (int i4 = 0; i4 < size + 1; i4++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i3, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i2, byte[] bArr) {
        x.f(bArr, "value");
        saveArgsToCache(i2, bArr);
        this.delegate.bindBlob(i2, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i2, double d2) {
        saveArgsToCache(i2, Double.valueOf(d2));
        this.delegate.bindDouble(i2, d2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i2, long j2) {
        saveArgsToCache(i2, Long.valueOf(j2));
        this.delegate.bindLong(i2, j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i2) {
        saveArgsToCache(i2, null);
        this.delegate.bindNull(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i2, String str) {
        x.f(str, "value");
        saveArgsToCache(i2, str);
        this.delegate.bindString(i2, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        aj.z(this.queryCallbackScope, null, null, new AnonymousClass1(i.ao(this.bindArgsCache), null), 3);
        this.delegate.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        aj.z(this.queryCallbackScope, null, null, new C04691(i.ao(this.bindArgsCache), null), 3);
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        aj.z(this.queryCallbackScope, null, null, new C04701(i.ao(this.bindArgsCache), null), 3);
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        aj.z(this.queryCallbackScope, null, null, new C04711(i.ao(this.bindArgsCache), null), 3);
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public String simpleQueryForString() {
        aj.z(this.queryCallbackScope, null, null, new C04721(i.ao(this.bindArgsCache), null), 3);
        return this.delegate.simpleQueryForString();
    }
}
