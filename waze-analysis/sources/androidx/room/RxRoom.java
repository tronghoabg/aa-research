package androidx.room;

import androidx.room.InvalidationTracker;
import androidx.room.coroutines.FlowUtil;
import androidx.sqlite.SQLiteConnection;
import e.c.b;
import e.c.b.a;
import e.c.c.b.c;
import e.c.d;
import e.c.e;
import e.c.f;
import e.c.g;
import e.c.h;
import e.c.i;
import e.c.m;
import h.ab;
import h.c.j;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ac;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.bj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class RxRoom {
    public static final Companion Companion = new Companion(null);
    public static final Object NOTHING = new Object();

    public static final b createCompletable(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ab> lVar) {
        return Companion.createCompletable(roomDatabase, z, z2, lVar);
    }

    public static final <T> d<T> createFlowable(RoomDatabase roomDatabase, boolean z, String[] strArr, l<? super SQLiteConnection, ? extends T> lVar) {
        return Companion.createFlowable(roomDatabase, z, strArr, lVar);
    }

    public static final <T> f<T> createMaybe(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ? extends T> lVar) {
        return Companion.createMaybe(roomDatabase, z, z2, lVar);
    }

    public static final <T> h<T> createObservable(RoomDatabase roomDatabase, boolean z, String[] strArr, l<? super SQLiteConnection, ? extends T> lVar) {
        return Companion.createObservable(roomDatabase, z, strArr, lVar);
    }

    public static final <T> e.c.l<T> createSingle(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ? extends T> lVar) {
        return Companion.createSingle(roomDatabase, z, z2, lVar);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.room.RxRoom$Companion$createFlowable$1$observer$1] */
        static final void createFlowable$lambda$1(final RoomDatabase roomDatabase, final String[] strArr, final e eVar) {
            x.f(eVar, "emitter");
            final ?? r0 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom$Companion$createFlowable$1$observer$1
                @Override // androidx.room.InvalidationTracker.Observer
                public void onInvalidated(Set<String> set) {
                    x.f(set, "tables");
                    if (eVar.b()) {
                        return;
                    }
                    eVar.a();
                }
            };
            if (!eVar.b()) {
                roomDatabase.getInvalidationTracker().addObserver((InvalidationTracker.Observer) r0);
                e.c.a.d.a(new a() { // from class: androidx.room.RxRoom$Companion$$ExternalSyntheticLambda5
                    public final void run() {
                        roomDatabase.getInvalidationTracker().removeObserver(r0);
                    }
                });
                eVar.c();
            }
            if (eVar.b()) {
                return;
            }
            eVar.a();
        }

        static final g createFlowable$lambda$2(f fVar, Object obj) {
            x.f(obj, "it");
            return fVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.room.RxRoom$Companion$createObservable$1$observer$1] */
        static final void createObservable$lambda$4(final RoomDatabase roomDatabase, final String[] strArr, final i iVar) {
            x.f(iVar, "emitter");
            final ?? r0 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom$Companion$createObservable$1$observer$1
                @Override // androidx.room.InvalidationTracker.Observer
                public void onInvalidated(Set<String> set) {
                    x.f(set, "tables");
                    iVar.a();
                }
            };
            roomDatabase.getInvalidationTracker().addObserver((InvalidationTracker.Observer) r0);
            e.c.a.d.a(new a() { // from class: androidx.room.RxRoom$Companion$$ExternalSyntheticLambda1
                public final void run() {
                    roomDatabase.getInvalidationTracker().removeObserver(r0);
                }
            });
            iVar.b();
            iVar.a();
        }

        static final g createObservable$lambda$5(f fVar, Object obj) {
            x.f(obj, "it");
            return fVar;
        }

        static final void createSingle$lambda$6(Callable callable, m mVar) {
            x.f(mVar, "emitter");
            try {
                if (callable.call() == null) {
                    throw new EmptyResultSetException("Query returned empty result set.");
                }
                mVar.a();
            } catch (EmptyResultSetException e2) {
                mVar.b();
            }
        }

        private final Executor getExecutor(RoomDatabase roomDatabase, boolean z) {
            return z ? roomDatabase.getTransactionExecutor() : roomDatabase.getQueryExecutor();
        }

        public final b createCompletable(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ab> lVar) {
            x.f(roomDatabase, "db");
            x.f(lVar, "block");
            j queryContext = roomDatabase.getQueryContext();
            ac acVar = br.f51766a;
            j jVarMinusKey = queryContext.minusKey(acVar);
            new RxRoom$Companion$createCompletable$1(roomDatabase, z, z2, lVar, null);
            if (jVarMinusKey.get(acVar) != null) {
                Objects.toString(jVarMinusKey);
                throw new IllegalArgumentException("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had ".concat(String.valueOf(jVarMinusKey)));
            }
            bj bjVar = bj.f51758a;
            b bVar = new b();
            e.c.d.a.e();
            return bVar;
        }

        public final <T> d<T> createFlowable(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<? extends T> callable) {
            x.f(roomDatabase, "database");
            x.f(strArr, "tableNames");
            x.f(callable, "callable");
            getExecutor(roomDatabase, z);
            int i2 = e.c.e.f.f47919a;
            x.e(new c(), "from(...)");
            x.e(f.a(callable), "fromCallable(...)");
            e.c.c.a.a.a aVar = new e.c.c.a.a.a(createFlowable(roomDatabase, (String[]) Arrays.copyOf(strArr, strArr.length)), (byte[][]) null);
            e.c.d.a.g();
            e.c.c.a.a.a aVar2 = new e.c.c.a.a.a(aVar, (char[][]) null);
            e.c.d.a.g();
            d dVarB = aVar2.b();
            e.a.e.f.d(Integer.MAX_VALUE, "maxConcurrency");
            e.c.c.a.a.a aVar3 = new e.c.c.a.a.a(dVarB, (byte[]) null);
            e.c.d.a.g();
            x.e(aVar3, "flatMapMaybe(...)");
            return aVar3;
        }

        public final <T> f<T> createMaybe(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ? extends T> lVar) {
            x.f(roomDatabase, "db");
            x.f(lVar, "block");
            j queryContext = roomDatabase.getQueryContext();
            ac acVar = br.f51766a;
            j jVarMinusKey = queryContext.minusKey(acVar);
            new RxRoom$Companion$createMaybe$1(roomDatabase, z, z2, lVar, null);
            if (jVarMinusKey.get(acVar) != null) {
                Objects.toString(jVarMinusKey);
                throw new IllegalArgumentException("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ".concat(String.valueOf(jVarMinusKey)));
            }
            bj bjVar = bj.f51758a;
            f<T> fVar = new f<>();
            e.c.d.a.h();
            return fVar;
        }

        public final <T> h<T> createObservable(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<? extends T> callable) {
            x.f(roomDatabase, "database");
            x.f(strArr, "tableNames");
            x.f(callable, "callable");
            getExecutor(roomDatabase, z);
            int i2 = e.c.e.f.f47919a;
            x.e(new c(), "from(...)");
            x.e(f.a(callable), "fromCallable(...)");
            createObservable(roomDatabase, (String[]) Arrays.copyOf(strArr, strArr.length));
            e.c.d.a.f();
            e.c.d.a.f();
            h.b();
            e.c.c.a.c.a aVar = new e.c.c.a.c.a();
            e.c.d.a.f();
            x.e(aVar, "flatMapMaybe(...)");
            return aVar;
        }

        public final <T> e.c.l<T> createSingle(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ? extends T> lVar) {
            x.f(roomDatabase, "db");
            x.f(lVar, "block");
            j queryContext = roomDatabase.getQueryContext();
            ac acVar = br.f51766a;
            j jVarMinusKey = queryContext.minusKey(acVar);
            new RxRoom$Companion$createSingle$1(roomDatabase, z, z2, lVar, null);
            if (jVarMinusKey.get(acVar) == null) {
                bj bjVar = bj.f51758a;
                return e.c.l.a();
            }
            Objects.toString(jVarMinusKey);
            throw new IllegalArgumentException("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ".concat(String.valueOf(jVarMinusKey)));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final <T> e.c.l<T> createSingle(Callable<? extends T> callable) {
            x.f(callable, "callable");
            e.c.l<T> lVarA = e.c.l.a();
            x.e(lVarA, "create(...)");
            return lVarA;
        }

        public final <T> h<T> createObservable(RoomDatabase roomDatabase, boolean z, String[] strArr, l<? super SQLiteConnection, ? extends T> lVar) {
            x.f(roomDatabase, "db");
            x.f(strArr, "tableNames");
            x.f(lVar, "block");
            ai.D(FlowUtil.createFlow(roomDatabase, z, strArr, lVar));
            roomDatabase.getQueryContext();
            return h.a();
        }

        public final h<Object> createObservable(RoomDatabase roomDatabase, String... strArr) {
            x.f(roomDatabase, "database");
            x.f(strArr, "tableNames");
            h<Object> hVarA = h.a();
            x.e(hVarA, "create(...)");
            return hVarA;
        }

        public final <T> h<T> createObservable(RoomDatabase roomDatabase, String[] strArr, Callable<? extends T> callable) {
            x.f(roomDatabase, "database");
            x.f(strArr, "tableNames");
            x.f(callable, "callable");
            return createObservable(roomDatabase, false, strArr, (Callable) callable);
        }

        public final <T> d<T> createFlowable(RoomDatabase roomDatabase, boolean z, String[] strArr, l<? super SQLiteConnection, ? extends T> lVar) {
            e.c.c.a.a.a aVar;
            x.f(roomDatabase, "db");
            x.f(strArr, "tableNames");
            x.f(lVar, "block");
            createObservable(roomDatabase, z, strArr, lVar);
            e.c.a aVar2 = e.c.a.f47867e;
            d<T> dVar = new d<>();
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    aVar = new e.c.c.a.a.a((d) dVar, (short[]) null);
                    e.c.d.a.g();
                } else if (iOrdinal == 3) {
                    aVar = new e.c.c.a.a.a((d) dVar, (int[]) null);
                    e.c.d.a.g();
                } else if (iOrdinal != 4) {
                    dVar = dVar.a();
                } else {
                    aVar = new e.c.c.a.a.a(dVar, (boolean[]) null);
                    e.c.d.a.g();
                }
                dVar = aVar;
            }
            x.e(dVar, "toFlowable(...)");
            return dVar;
        }

        public final d<Object> createFlowable(RoomDatabase roomDatabase, String... strArr) {
            x.f(roomDatabase, "database");
            x.f(strArr, "tableNames");
            e.c.a aVar = e.c.a.f47867e;
            int i2 = d.f47903b;
            e.a.e.f.c(aVar, "mode is null");
            d<Object> dVar = new d<>();
            e.c.d.a.g();
            x.e(dVar, "create(...)");
            return dVar;
        }

        public final <T> d<T> createFlowable(RoomDatabase roomDatabase, String[] strArr, Callable<? extends T> callable) {
            x.f(roomDatabase, "database");
            x.f(strArr, "tableNames");
            x.f(callable, "callable");
            return createFlowable(roomDatabase, false, strArr, (Callable) callable);
        }
    }

    public static final <T> d<T> createFlowable(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<? extends T> callable) {
        return Companion.createFlowable(roomDatabase, z, strArr, callable);
    }

    public static final <T> h<T> createObservable(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<? extends T> callable) {
        return Companion.createObservable(roomDatabase, z, strArr, callable);
    }

    public static final <T> e.c.l<T> createSingle(Callable<? extends T> callable) {
        return Companion.createSingle(callable);
    }

    public static final d<Object> createFlowable(RoomDatabase roomDatabase, String... strArr) {
        return Companion.createFlowable(roomDatabase, strArr);
    }

    public static final h<Object> createObservable(RoomDatabase roomDatabase, String... strArr) {
        return Companion.createObservable(roomDatabase, strArr);
    }

    public static final <T> d<T> createFlowable(RoomDatabase roomDatabase, String[] strArr, Callable<? extends T> callable) {
        return Companion.createFlowable(roomDatabase, strArr, callable);
    }

    public static final <T> h<T> createObservable(RoomDatabase roomDatabase, String[] strArr, Callable<? extends T> callable) {
        return Companion.createObservable(roomDatabase, strArr, callable);
    }
}
