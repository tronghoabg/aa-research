package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import h.i.c;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DataStoreDelegateKt {
    public static final <T> c<Context, DataStore<T>> dataStore(String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, l<? super Context, ? extends List<? extends DataMigration<T>>> lVar, af afVar) {
        x.f(str, "fileName");
        x.f(serializer, "serializer");
        x.f(lVar, "produceMigrations");
        x.f(afVar, "scope");
        return new DataStoreSingletonDelegate(str, serializer, replaceFileCorruptionHandler, lVar, afVar);
    }

    public static /* synthetic */ c dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, l lVar, af afVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            lVar = new l() { // from class: androidx.datastore.DataStoreDelegateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return DataStoreDelegateKt.dataStore$lambda$0((Context) obj2);
                }
            };
        }
        if ((i2 & 16) != 0) {
            afVar = aj.e(av.b().plus(aj.Q()));
        }
        if ((i2 & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, lVar, afVar);
    }

    static final List dataStore$lambda$0(Context context) {
        x.f(context, "it");
        return i.h();
    }
}
