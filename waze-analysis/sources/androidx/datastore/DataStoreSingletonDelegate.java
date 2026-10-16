package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.i.c;
import h.l.r;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataStoreSingletonDelegate<T> implements c<Context, DataStore<T>> {
    private volatile DataStore<T> INSTANCE;
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final String fileName;
    private final Object lock;
    private final l<Context, List<DataMigration<T>>> produceMigrations;
    private final af scope;
    private final Serializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, l<? super Context, ? extends List<? extends DataMigration<T>>> lVar, af afVar) {
        x.f(str, "fileName");
        x.f(serializer, "serializer");
        x.f(lVar, "produceMigrations");
        x.f(afVar, "scope");
        this.fileName = str;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = lVar;
        this.scope = afVar;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File getValue$lambda$0$0(Context context, DataStoreSingletonDelegate dataStoreSingletonDelegate) {
        x.c(context);
        return DataStoreFile.dataStoreFile(context, dataStoreSingletonDelegate.fileName);
    }

    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    public DataStore<T> getValue2(Context context, r<?> rVar) {
        DataStore<T> dataStore;
        x.f(context, "thisRef");
        x.f(rVar, "property");
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                final Context applicationContext = context.getApplicationContext();
                DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
                FileStorage fileStorage = new FileStorage(this.serializer, null, new a() { // from class: androidx.datastore.DataStoreSingletonDelegate$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DataStoreSingletonDelegate.getValue$lambda$0$0(applicationContext, this);
                    }
                }, 2, null);
                ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                l<Context, List<DataMigration<T>>> lVar = this.produceMigrations;
                x.c(applicationContext);
                this.INSTANCE = dataStoreFactory.create(fileStorage, replaceFileCorruptionHandler, lVar.invoke(applicationContext), this.scope);
            }
            dataStore = this.INSTANCE;
            x.c(dataStore);
        }
        return dataStore;
    }

    @Override // h.i.c
    public /* bridge */ /* synthetic */ Object getValue(Context context, r rVar) {
        return getValue2(context, (r<?>) rVar);
    }
}
