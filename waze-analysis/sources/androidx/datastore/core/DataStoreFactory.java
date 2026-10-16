package androidx.datastore.core;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReThrowCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.util.DataStoreScopeUtilKt;
import androidx.tracing.Tracer;
import h.a.i;
import h.g.a.a;
import h.g.b.x;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DataStoreFactory {
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public static /* synthetic */ DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, af afVar, a aVar, int i2, Object obj) {
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
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler, list2, afVar2, aVar);
    }

    public static /* synthetic */ DataStore createInDeviceProtectedStorage$default(DataStoreFactory dataStoreFactory, Context context, String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, af afVar, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            list = i.h();
        }
        List list2 = list;
        if ((i2 & 32) != 0) {
            afVar = aj.e(av.b().plus(aj.Q()));
        }
        af afVar2 = afVar;
        if ((i2 & 8) != 0) {
            replaceFileCorruptionHandler = null;
        }
        return dataStoreFactory.createInDeviceProtectedStorage(context, str, serializer, replaceFileCorruptionHandler, list2, afVar2);
    }

    public static /* synthetic */ DataStore createWithTracing$default(DataStoreFactory dataStoreFactory, Storage storage, Tracer tracer, CorruptionHandler corruptionHandler, List list, af afVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            corruptionHandler = new ReThrowCorruptionHandler();
        }
        CorruptionHandler corruptionHandler2 = corruptionHandler;
        if ((i2 & 8) != 0) {
            list = i.h();
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            afVar = aj.e(Actual_jvmKt.ioDispatcher().plus(aj.Q()));
        }
        return dataStoreFactory.createWithTracing(storage, tracer, corruptionHandler2, list2, afVar);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, af afVar) {
        x.f(storage, "storage");
        x.f(list, "migrations");
        x.f(afVar, "scope");
        DataStore.Builder builder = new DataStore.Builder(storage, DataStoreScopeUtilKt.getContextFromScope(afVar));
        if (replaceFileCorruptionHandler != null) {
            builder.setCorruptionHandler(replaceFileCorruptionHandler);
        }
        return builder.addMigrations(list).build();
    }

    public final <T> DataStore<T> createInDeviceProtectedStorage(final Context context, final String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, af afVar) {
        x.f(context, "context");
        x.f(str, "fileName");
        x.f(serializer, "serializer");
        x.f(list, "migrations");
        x.f(afVar, "scope");
        DataStore.Builder builder = new DataStore.Builder(new FileStorage(serializer, null, new a() { // from class: androidx.datastore.core.DataStoreFactory$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return DeviceProtectedDataStoreFile.deviceProtectedDataStoreFile(context, str);
            }
        }, 2, null), DataStoreScopeUtilKt.getContextFromScope(afVar));
        if (replaceFileCorruptionHandler != null) {
            builder.setCorruptionHandler(replaceFileCorruptionHandler);
        }
        return builder.addMigrations(list).build();
    }

    public final <T> DataStore<T> createWithTracing(Storage<T> storage, Tracer tracer, CorruptionHandler<T> corruptionHandler, List<? extends DataMigration<T>> list, af afVar) {
        x.f(storage, "storage");
        x.f(tracer, "tracer");
        x.f(corruptionHandler, "corruptionHandler");
        x.f(list, "migrations");
        x.f(afVar, "scope");
        return new DataStore.Builder(storage, DataStoreScopeUtilKt.getContextFromScope(afVar)).setCorruptionHandler(corruptionHandler).addMigrations(list).setTracer(tracer).build();
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

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, af afVar, a<? extends File> aVar) {
        x.f(serializer, "serializer");
        x.f(list, "migrations");
        x.f(afVar, "scope");
        x.f(aVar, "produceFile");
        return create(new FileStorage(serializer, null, aVar, 2, null), replaceFileCorruptionHandler, list, afVar);
    }

    public static /* synthetic */ DataStore create$default(DataStoreFactory dataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, af afVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = i.h();
        }
        if ((i2 & 8) != 0) {
            afVar = aj.e(Actual_jvmKt.ioDispatcher().plus(aj.Q()));
        }
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        return dataStoreFactory.create(storage, replaceFileCorruptionHandler, list, afVar);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, a<? extends File> aVar) {
        x.f(serializer, "serializer");
        x.f(aVar, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, aVar, 12, null);
    }

    public final <T> DataStore<T> createWithTracing(Storage<T> storage, Tracer tracer, CorruptionHandler<T> corruptionHandler) {
        x.f(storage, "storage");
        x.f(tracer, "tracer");
        x.f(corruptionHandler, "corruptionHandler");
        return createWithTracing$default(this, storage, tracer, corruptionHandler, null, null, 24, null);
    }

    public final <T> DataStore<T> createWithTracing(Storage<T> storage, Tracer tracer, CorruptionHandler<T> corruptionHandler, List<? extends DataMigration<T>> list) {
        x.f(storage, "storage");
        x.f(tracer, "tracer");
        x.f(corruptionHandler, "corruptionHandler");
        x.f(list, "migrations");
        return createWithTracing$default(this, storage, tracer, corruptionHandler, list, null, 16, null);
    }

    public final <T> DataStore<T> createWithTracing(Storage<T> storage, Tracer tracer) {
        x.f(storage, "storage");
        x.f(tracer, "tracer");
        return createWithTracing$default(this, storage, tracer, null, null, null, 28, null);
    }

    public final <T> DataStore<T> createInDeviceProtectedStorage(Context context, String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        x.f(context, "context");
        x.f(str, "fileName");
        x.f(serializer, "serializer");
        return createInDeviceProtectedStorage$default(this, context, str, serializer, replaceFileCorruptionHandler, null, null, 48, null);
    }

    public final <T> DataStore<T> createInDeviceProtectedStorage(Context context, String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list) {
        x.f(context, "context");
        x.f(str, "fileName");
        x.f(serializer, "serializer");
        x.f(list, "migrations");
        return createInDeviceProtectedStorage$default(this, context, str, serializer, replaceFileCorruptionHandler, list, null, 32, null);
    }

    public final <T> DataStore<T> createInDeviceProtectedStorage(Context context, String str, Serializer<T> serializer) {
        x.f(context, "context");
        x.f(str, "fileName");
        x.f(serializer, "serializer");
        return createInDeviceProtectedStorage$default(this, context, str, serializer, null, null, null, 56, null);
    }
}
