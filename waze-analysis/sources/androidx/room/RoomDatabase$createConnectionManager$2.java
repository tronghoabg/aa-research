package androidx.room;

import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class RoomDatabase$createConnectionManager$2 extends u implements p<l<? super e<? super Object>, ? extends Object>, e<? super Object>, Object> {
    RoomDatabase$createConnectionManager$2(Object obj) {
        super(2, obj, RoomDatabaseKt__RoomDatabase_androidKt.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(l<? super e<? super Object>, ? extends Object> lVar, e<? super Object> eVar) {
        return invoke2((l<? super e<Object>, ? extends Object>) lVar, (e<Object>) eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(l<? super e<Object>, ? extends Object> lVar, e<Object> eVar) {
        return RoomDatabaseKt.compatTransactionCoroutineExecute((RoomDatabase) this.receiver, lVar, eVar);
    }
}
