package androidx.room.util;

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
public final class DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 extends g implements p<af, e, Object> {
    final /* synthetic */ l<e, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(l<? super e, ? extends Object> lVar, e<? super DBUtil__DBUtil_androidKt$compatCoroutineExecute$2> eVar) {
        super(2, eVar);
        this.$block = lVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(this.$block, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e eVar) {
        return ((DBUtil__DBUtil_androidKt$compatCoroutineExecute$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
        l<e, Object> lVar = this.$block;
        this.label = 1;
        Object objInvoke = lVar.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$block.invoke(this);
    }
}
