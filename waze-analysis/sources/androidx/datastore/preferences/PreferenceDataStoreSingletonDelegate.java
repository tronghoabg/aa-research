package androidx.datastore.preferences;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.i.c;
import h.l.r;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements c<Context, DataStore<Preferences>> {
    private volatile DataStore<Preferences> INSTANCE;
    private final ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    private final Object lock;
    private final String name;
    private final l<Context, List<DataMigration<Preferences>>> produceMigrations;
    private final af scope;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreSingletonDelegate(String str, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, l<? super Context, ? extends List<? extends DataMigration<Preferences>>> lVar, af afVar) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(lVar, "produceMigrations");
        x.f(afVar, "scope");
        this.name = str;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = lVar;
        this.scope = afVar;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File getValue$lambda$0$0(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        if (context == null) {
            x.g();
        }
        return PreferenceDataStoreFile.preferencesDataStoreFile(context, preferenceDataStoreSingletonDelegate.name);
    }

    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    public DataStore<Preferences> getValue2(Context context, r<?> rVar) {
        DataStore<Preferences> dataStore;
        x.f(context, "thisRef");
        x.f(rVar, "property");
        DataStore<Preferences> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                final Context applicationContext = context.getApplicationContext();
                PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                l<Context, List<DataMigration<Preferences>>> lVar = this.produceMigrations;
                if (applicationContext == null) {
                    x.g();
                }
                this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, lVar.invoke(applicationContext), this.scope, new a() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return PreferenceDataStoreSingletonDelegate.getValue$lambda$0$0(applicationContext, this);
                    }
                });
            }
            dataStore = this.INSTANCE;
            if (dataStore == null) {
                x.g();
            }
        }
        return dataStore;
    }

    @Override // h.i.c
    public /* bridge */ /* synthetic */ DataStore<Preferences> getValue(Context context, r rVar) {
        return getValue2(context, (r<?>) rVar);
    }
}
