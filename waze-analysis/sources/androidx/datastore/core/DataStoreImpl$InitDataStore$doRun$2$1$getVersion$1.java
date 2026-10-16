package androidx.datastore.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DataStoreImpl$InitDataStore$doRun$2$1$getVersion$1 extends g implements p<Boolean, e<? super Integer>, Object> {
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$2$1$getVersion$1(DataStoreImpl<T> dataStoreImpl, e<? super DataStoreImpl$InitDataStore$doRun$2$1$getVersion$1> eVar) {
        super(2, eVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DataStoreImpl$InitDataStore$doRun$2$1$getVersion$1(this.this$0, eVar);
    }

    public final Object invoke(boolean z, e<? super Integer> eVar) {
        return ((DataStoreImpl$InitDataStore$doRun$2$1$getVersion$1) create(Boolean.valueOf(z), eVar)).invokeSuspend(ab.f48028a);
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
        Object version = this.this$0.getCoordinator().getVersion(this);
        return version == aVar ? aVar : version;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, e<? super Integer> eVar) {
        return invoke(bool.booleanValue(), eVar);
    }
}
