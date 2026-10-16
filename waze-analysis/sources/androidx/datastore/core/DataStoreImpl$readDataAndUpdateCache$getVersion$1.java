package androidx.datastore.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DataStoreImpl$readDataAndUpdateCache$getVersion$1 extends g implements p<Boolean, e<? super Integer>, Object> {
    final /* synthetic */ int $cachedVersion;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$getVersion$1(DataStoreImpl<T> dataStoreImpl, int i2, e<? super DataStoreImpl$readDataAndUpdateCache$getVersion$1> eVar) {
        super(2, eVar);
        this.this$0 = dataStoreImpl;
        this.$cachedVersion = i2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        DataStoreImpl$readDataAndUpdateCache$getVersion$1 dataStoreImpl$readDataAndUpdateCache$getVersion$1 = new DataStoreImpl$readDataAndUpdateCache$getVersion$1(this.this$0, this.$cachedVersion, eVar);
        dataStoreImpl$readDataAndUpdateCache$getVersion$1.Z$0 = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$getVersion$1;
    }

    public final Object invoke(boolean z, e<? super Integer> eVar) {
        return ((DataStoreImpl$readDataAndUpdateCache$getVersion$1) create(Boolean.valueOf(z), eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        boolean z = this.Z$0;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            if (!z) {
                iIntValue = this.$cachedVersion;
                return new Integer(iIntValue);
            }
            this.Z$0 = true;
            this.label = 1;
            obj = this.this$0.getCoordinator().getVersion(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        iIntValue = ((Number) obj).intValue();
        return new Integer(iIntValue);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, e<? super Integer> eVar) {
        return invoke(bool.booleanValue(), eVar);
    }
}
