package androidx.datastore.core;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1$updateData$1 extends c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1$updateData$1(DataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1, e<? super DataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1$updateData$1> eVar) {
        super(eVar);
        this.this$0 = dataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateData(null, this);
    }
}
