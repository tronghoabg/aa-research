package androidx.room;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.d.b;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabase_androidKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e, Object> {
        final /* synthetic */ l<e, Object> $block;
        final /* synthetic */ RoomDatabase $this_withTransaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(RoomDatabase roomDatabase, l<? super e, ? extends Object> lVar, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$this_withTransaction = roomDatabase;
            this.$block = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass2(this.$this_withTransaction, this.$block, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    this.$this_withTransaction.beginTransaction();
                    l<e, Object> lVar = this.$block;
                    this.label = 1;
                    obj = lVar.invoke(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                this.$this_withTransaction.setTransactionSuccessful();
                return obj;
            } finally {
                this.$this_withTransaction.endTransaction();
            }
        }
    }

    public static final <R> Object compatTransactionCoroutineExecute(RoomDatabase roomDatabase, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return (roomDatabase.inCompatibilityMode() && roomDatabase.isOpenInternal$room_runtime() && roomDatabase.inTransaction()) ? lVar.invoke(eVar) : eVar.getContext().get(RoomExternalOperationElement.INSTANCE) == null ? lVar.invoke(eVar) : RoomDatabaseKt.withTransactionContext(roomDatabase, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(RoomDatabase roomDatabase, h.c.g gVar) {
        j jVarPlus = gVar.plus(new TransactionElement(gVar));
        return jVarPlus.plus(aj.K(roomDatabase.getSuspendingTransactionContext(), jVarPlus));
    }

    public static final k<Set<String>> invalidationTrackerFlow(RoomDatabase roomDatabase, String[] strArr, boolean z) {
        x.f(roomDatabase, "<this>");
        x.f(strArr, "tables");
        return roomDatabase.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(strArr, strArr.length), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(final RoomDatabase roomDatabase, final p<? super af, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.d(eVar), 1);
        lVar.u();
        final kotlinx.coroutines.l lVar2 = lVar;
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1

                /* compiled from: WazeSource */
                /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                    final /* synthetic */ kotlinx.coroutines.k $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ p<af, e, Object> $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(RoomDatabase roomDatabase, kotlinx.coroutines.k kVar, p<? super af, ? super e, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
                        super(2, eVar);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = kVar;
                        this.$transactionBlock = pVar;
                    }

                    @Override // h.c.b.a.a
                    public final e<ab> create(Object obj, e<?> eVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, eVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // h.g.a.p
                    public final Object invoke(af afVar, e<? super ab> eVar) {
                        return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        e eVar;
                        a aVar = a.f48038a;
                        int i2 = this.label;
                        if (i2 == 0) {
                            c.b(obj);
                            h.c.h hVar = ((af) this.L$0).getCoroutineContext().get(h.c.g.f48059a);
                            x.c(hVar);
                            j jVarCreateTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt = RoomDatabaseKt__RoomDatabase_androidKt.createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(this.$this_startTransactionCoroutine, (h.c.g) hVar);
                            kotlinx.coroutines.k kVar = this.$continuation;
                            this.L$0 = kVar;
                            this.label = 1;
                            obj = aj.v(jVarCreateTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt, this.$transactionBlock, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            eVar = kVar;
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            eVar = (e) this.L$0;
                            c.b(obj);
                        }
                        eVar.resumeWith(obj);
                        return ab.f48028a;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        aj.u(lVar2.getContext().minusKey(h.c.g.f48059a), new AnonymousClass1(roomDatabase, lVar2, pVar, null));
                    } catch (Throwable th) {
                        lVar2.f(th);
                    }
                }
            });
        } catch (RejectedExecutionException e2) {
            lVar2.f(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        Object objJ = lVar.j();
        if (objJ == a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }

    public static final <R> Object withTransaction(RoomDatabase roomDatabase, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return RoomDatabaseKt.withTransactionContext(roomDatabase, new AnonymousClass2(roomDatabase, lVar, null), eVar);
    }

    public static final <R> Object withTransactionContext(RoomDatabase roomDatabase, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(lVar, null);
        TransactionElement transactionElement = (TransactionElement) eVar.getContext().get(TransactionElement.Key);
        h.c.g transactionDispatcher$room_runtime = transactionElement != null ? transactionElement.getTransactionDispatcher$room_runtime() : null;
        return transactionDispatcher$room_runtime != null ? aj.v(transactionDispatcher$room_runtime, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, eVar) : startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(roomDatabase, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, eVar);
    }
}
