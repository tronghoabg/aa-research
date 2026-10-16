package androidx.room;

import androidx.room.CoroutinesRoom;
import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class CoroutinesRoom$Companion$execute$3<R> extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutinesRoom.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$3(CoroutinesRoom.Companion companion, e<? super CoroutinesRoom$Companion$execute$3> eVar) {
        super(eVar);
        this.this$0 = companion;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, false, null, null, this);
    }
}
