package androidx.datastore.core;

import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReThrowCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.util.DataStoreScopeUtilKt;
import h.a.i;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MultiProcessDataStoreFactory {
    public static final MultiProcessDataStoreFactory INSTANCE = new MultiProcessDataStoreFactory();

    private MultiProcessDataStoreFactory() {
    }

    public static /* synthetic */ DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, af afVar, a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = i.h();
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            afVar = aj.e(av.b().plus(aj.Q()));
        }
        af afVar2 = afVar;
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        return multiProcessDataStoreFactory.create(serializer, replaceFileCorruptionHandler, list2, afVar2, aVar);
    }

    static final InterProcessCoordinator create$lambda$0(af afVar, File file) {
        x.f(file, "it");
        return new MultiProcessCoordinator(DataStoreScopeUtilKt.getContextFromScope(afVar), file);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, final af afVar, a<? extends File> aVar) {
        x.f(serializer, "serializer");
        x.f(list, "migrations");
        x.f(afVar, "scope");
        x.f(aVar, "produceFile");
        return new DataStore.Builder(new FileStorage(serializer, new l() { // from class: androidx.datastore.core.MultiProcessDataStoreFactory$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MultiProcessDataStoreFactory.create$lambda$0(afVar, (File) obj);
            }
        }, aVar), DataStoreScopeUtilKt.getContextFromScope(afVar)).setCorruptionHandler(replaceFileCorruptionHandler != null ? replaceFileCorruptionHandler : new ReThrowCorruptionHandler()).addMigrations(list).build();
    }

    public static /* synthetic */ DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, af afVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = i.h();
        }
        if ((i2 & 8) != 0) {
            afVar = aj.e(av.b().plus(aj.Q()));
        }
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        return multiProcessDataStoreFactory.create(storage, replaceFileCorruptionHandler, list, afVar);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, a<? extends File> aVar) {
        x.f(serializer, "serializer");
        x.f(list, "migrations");
        x.f(aVar, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, list, null, aVar, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, a<? extends File> aVar) {
        x.f(serializer, "serializer");
        x.f(aVar, "produceFile");
        return create$default(this, serializer, null, null, null, aVar, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        x.f(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        x.f(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list) {
        x.f(storage, "storage");
        x.f(list, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, list, null, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, a<? extends File> aVar) {
        x.f(serializer, "serializer");
        x.f(aVar, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, aVar, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, af afVar) {
        ReThrowCorruptionHandler reThrowCorruptionHandler;
        x.f(storage, "storage");
        x.f(list, "migrations");
        x.f(afVar, "scope");
        DataStore.Builder builder = new DataStore.Builder(storage, DataStoreScopeUtilKt.getContextFromScope(afVar));
        if (replaceFileCorruptionHandler != null) {
            reThrowCorruptionHandler = replaceFileCorruptionHandler;
        } else {
            reThrowCorruptionHandler = new ReThrowCorruptionHandler();
        }
        return builder.setCorruptionHandler(reThrowCorruptionHandler).addMigrations(list).build();
    }
}
