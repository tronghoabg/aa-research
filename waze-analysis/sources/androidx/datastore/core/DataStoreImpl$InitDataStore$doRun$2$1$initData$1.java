package androidx.datastore.core;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DataStoreImpl$InitDataStore$doRun$2$1$initData$1<T> extends g implements l<e<? super Data<T>>, Object> {
    final /* synthetic */ p<Boolean, e<? super Integer>, Object> $getVersion;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataStoreImpl$InitDataStore$doRun$2$1$initData$1(DataStoreImpl<T> dataStoreImpl, p<? super Boolean, ? super e<? super Integer>, ? extends Object> pVar, DataStoreImpl<T>.InitDataStore initDataStore, e<? super DataStoreImpl$InitDataStore$doRun$2$1$initData$1> eVar) {
        super(1, eVar);
        this.this$0 = dataStoreImpl;
        this.$getVersion = pVar;
        this.this$1 = initDataStore;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new DataStoreImpl$InitDataStore$doRun$2$1$initData$1(this.this$0, this.$getVersion, this.this$1, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super Data<T>> eVar) {
        return ((DataStoreImpl$InitDataStore$doRun$2$1$initData$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014a  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$2$1$initData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
