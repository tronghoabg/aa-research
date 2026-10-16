package androidx.datastore.preferences.core;

import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import h.a.i;
import h.g.a.a;
import h.g.b.x;
import h.n.o;
import java.io.File;
import java.util.List;
import k.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, af afVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = i.h();
        }
        if ((i2 & 8) != 0) {
            afVar = aj.e(Actual_jvmAndroidKt.ioDispatcher().plus(aj.Q()));
        }
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, afVar);
    }

    static final File create$lambda$0(a aVar) {
        File file = (File) aVar.invoke();
        x.f(file, "<this>");
        String name = file.getName();
        x.e(name, "getName(...)");
        if (x.n(o.C(name, '.', ""), "preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            x.e(absoluteFile, "getAbsoluteFile(...)");
            return absoluteFile;
        }
        throw new IllegalStateException("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, af afVar, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list = i.h();
        }
        if ((i2 & 4) != 0) {
            afVar = aj.e(Actual_jvmAndroidKt.ioDispatcher().plus(aj.Q()));
        }
        if (1 == (i2 & 1)) {
            replaceFileCorruptionHandler = null;
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, afVar, aVar);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, af afVar) {
        x.f(storage, "storage");
        x.f(list, "migrations");
        x.f(afVar, "scope");
        DataStore.Builder builder = new DataStore.Builder(storage, afVar.getCoroutineContext().get(br.f51766a) == null ? afVar.getCoroutineContext().plus(h.g.b.o.i()) : afVar.getCoroutineContext());
        if (replaceFileCorruptionHandler != null) {
            builder.setCorruptionHandler(replaceFileCorruptionHandler);
        }
        return new PreferenceDataStore(builder.addMigrations(list).build());
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, af afVar, final a<ab> aVar) {
        x.f(list, "migrations");
        x.f(afVar, "scope");
        x.f(aVar, "produceFile");
        return create(replaceFileCorruptionHandler, list, afVar, new a() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return ((ab) aVar.invoke()).b();
            }
        });
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, a<ab> aVar) {
        x.f(list, "migrations");
        x.f(aVar, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, list, null, aVar, 4, null);
    }

    public final DataStore<Preferences> createWithPath(a<ab> aVar) {
        x.f(aVar, "produceFile");
        return createWithPath$default(this, null, null, null, aVar, 7, null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, a<ab> aVar) {
        x.f(aVar, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, aVar, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, af afVar, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list = i.h();
        }
        if ((i2 & 4) != 0) {
            afVar = aj.e(av.b().plus(aj.Q()));
        }
        if (1 == (i2 & 1)) {
            replaceFileCorruptionHandler = null;
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, afVar, (a<? extends File>) aVar);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        x.f(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (af) null, 12, (Object) null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list) {
        x.f(storage, "storage");
        x.f(list, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, list, (af) null, 8, (Object) null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, a<? extends File> aVar) {
        x.f(aVar, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (af) null, aVar, 6, (Object) null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, a<? extends File> aVar) {
        x.f(list, "migrations");
        x.f(aVar, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, list, (af) null, aVar, 4, (Object) null);
    }

    public final DataStore<Preferences> create(a<? extends File> aVar) {
        x.f(aVar, "produceFile");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (af) null, aVar, 7, (Object) null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage) {
        x.f(storage, "storage");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (af) null, 14, (Object) null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, af afVar, final a<? extends File> aVar) {
        x.f(list, "migrations");
        x.f(afVar, "scope");
        x.f(aVar, "produceFile");
        return new PreferenceDataStore(create(new FileStorage(PreferencesFileSerializer.INSTANCE, null, new a() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return PreferenceDataStoreFactory.create$lambda$0(aVar);
            }
        }, 2, null), replaceFileCorruptionHandler, list, afVar));
    }
}
