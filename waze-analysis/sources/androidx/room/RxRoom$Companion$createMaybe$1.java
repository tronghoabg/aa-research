package androidx.room;

import androidx.room.util.DBUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class RxRoom$Companion$createMaybe$1 extends g implements p<af, e, Object> {
    final /* synthetic */ l $block;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxRoom$Companion$createMaybe$1(RoomDatabase roomDatabase, boolean z, boolean z2, l lVar, e<? super RxRoom$Companion$createMaybe$1> eVar) {
        super(2, eVar);
        this.$db = roomDatabase;
        this.$isReadOnly = z;
        this.$inTransaction = z2;
        this.$block = lVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new RxRoom$Companion$createMaybe$1(this.$db, this.$isReadOnly, this.$inTransaction, this.$block, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((RxRoom$Companion$createMaybe$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
        this.label = 1;
        Object objPerformSuspending = DBUtil.performSuspending(this.$db, this.$isReadOnly, this.$inTransaction, this.$block, this);
        return objPerformSuspending == aVar ? aVar : objPerformSuspending;
    }
}
