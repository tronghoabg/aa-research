package androidx.room;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.Arrays;
import java.util.Set;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ String[] $tables;
    Object L$0;
    int label;
    final /* synthetic */ MultiInstanceInvalidationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(String[] strArr, MultiInstanceInvalidationClient multiInstanceInvalidationClient, e<? super MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1> eVar) {
        super(2, eVar);
        this.$tables = strArr;
        this.this$0 = multiInstanceInvalidationClient;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(this.$tables, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Set<String> set;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            String[] strArr = this.$tables;
            Set<String> setR = e.c.d.a.r(Arrays.copyOf(strArr, strArr.length));
            this.L$0 = setR;
            this.label = 1;
            if (this.this$0.invalidatedTables.emit(setR, this) == aVar) {
                return aVar;
            }
            set = setR;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) this.L$0;
            c.b(obj);
        }
        this.this$0.getInvalidationTracker().notifyObserversByTableNames$room_runtime(set);
        return ab.f48028a;
    }
}
