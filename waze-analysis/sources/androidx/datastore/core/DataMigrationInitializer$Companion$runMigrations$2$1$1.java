package androidx.datastore.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends g implements l<e<? super ab>, Object> {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, e<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> eVar) {
        super(1, eVar);
        this.$migration = dataMigration;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (this.$migration.cleanUp(this) == aVar) {
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
