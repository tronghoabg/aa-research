package androidx.datastore.preferences;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import h.a.ac;
import h.g.a.l;
import h.g.b.x;
import h.i.c;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt {
    public static final c<Context, DataStore<Preferences>> preferencesDataStore(String str, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, l<? super Context, ? extends List<? extends DataMigration<Preferences>>> lVar, af afVar) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(lVar, "produceMigrations");
        x.f(afVar, "scope");
        return new PreferenceDataStoreSingletonDelegate(str, replaceFileCorruptionHandler, lVar, afVar);
    }

    public static /* synthetic */ c preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, l lVar, af afVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar = new l() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return PreferenceDataStoreDelegateKt.preferencesDataStore$lambda$0((Context) obj2);
                }
            };
        }
        if ((i2 & 8) != 0) {
            afVar = aj.e(av.b().plus(aj.Q()));
        }
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, lVar, afVar);
    }

    static final List preferencesDataStore$lambda$0(Context context) {
        x.f(context, "it");
        return ac.f47967a;
    }
}
