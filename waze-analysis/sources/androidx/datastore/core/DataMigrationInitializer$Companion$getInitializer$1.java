package androidx.datastore.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$getInitializer$1<T> extends g implements p<InitializerApi<T>, e<? super ab>, Object> {
    final /* synthetic */ List<DataMigration<T>> $migrations;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataMigrationInitializer$Companion$getInitializer$1(List<? extends DataMigration<T>> list, e<? super DataMigrationInitializer$Companion$getInitializer$1> eVar) {
        super(2, eVar);
        this.$migrations = list;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.$migrations, eVar);
        dataMigrationInitializer$Companion$getInitializer$1.L$0 = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    @Override // h.g.a.p
    public final Object invoke(InitializerApi<T> initializerApi, e<? super ab> eVar) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create(initializerApi, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        InitializerApi initializerApi = (InitializerApi) this.L$0;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            List<DataMigration<T>> list = this.$migrations;
            this.L$0 = null;
            this.label = 1;
            if (DataMigrationInitializer.Companion.runMigrations(list, initializerApi, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
