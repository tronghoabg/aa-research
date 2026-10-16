package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.preferences.core.PreferenceDataStore$updateData$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<Preferences, e<? super Preferences>, Object> {
        final /* synthetic */ p<Preferences, e<? super Preferences>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super Preferences, ? super e<? super Preferences>, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$transform = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(Preferences preferences, e<? super Preferences> eVar) {
            return ((AnonymousClass2) create(preferences, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Preferences preferences = (Preferences) this.L$0;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                p<Preferences, e<? super Preferences>, Object> pVar = this.$transform;
                this.L$0 = null;
                this.label = 1;
                obj = pVar.invoke(preferences, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            Preferences preferences2 = (Preferences) obj;
            x.d(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((MutablePreferences) preferences2).freeze$datastore_preferences_core();
            return preferences2;
        }
    }

    public PreferenceDataStore(DataStore<Preferences> dataStore) {
        x.f(dataStore, "delegate");
        this.delegate = dataStore;
    }

    @Override // androidx.datastore.core.DataStore
    public k<Preferences> getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(p<? super Preferences, ? super e<? super Preferences>, ? extends Object> pVar, e<? super Preferences> eVar) {
        return this.delegate.updateData(new AnonymousClass2(pVar, null), eVar);
    }
}
