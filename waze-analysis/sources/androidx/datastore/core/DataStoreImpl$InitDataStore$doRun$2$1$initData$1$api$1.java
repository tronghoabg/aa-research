package androidx.datastore.core;

import h.g.b.am;
import h.g.b.aq;
import kotlinx.coroutines.h.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ aq<T> $currentData;
    final /* synthetic */ am $initializationComplete;
    final /* synthetic */ a $updateLock;
    final /* synthetic */ DataStoreImpl<T> this$0;

    DataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1(a aVar, am amVar, aq<T> aqVar, DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = aVar;
        this.$initializationComplete = amVar;
        this.$currentData = aqVar;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #2 {all -> 0x006a, blocks: (B:21:0x0061, B:34:0x00d0, B:36:0x00d8), top: B:54:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateData(h.g.a.p<? super T, ? super h.c.e<? super T>, ? extends java.lang.Object> r12, h.c.e<? super T> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2$1$initData$1$api$1.updateData(h.g.a.p, h.c.e):java.lang.Object");
    }
}
