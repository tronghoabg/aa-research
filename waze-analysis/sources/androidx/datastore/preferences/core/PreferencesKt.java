package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreferencesKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<Preferences, e<? super Preferences>, Object> {
        final /* synthetic */ p<MutablePreferences, e<? super ab>, Object> $transform;
        int I$0;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super MutablePreferences, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
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
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$1;
                c.b(obj);
                return mutablePreferences;
            }
            c.b(obj);
            MutablePreferences mutablePreferences2 = preferences.toMutablePreferences();
            p<MutablePreferences, e<? super ab>, Object> pVar = this.$transform;
            this.L$0 = null;
            this.L$1 = mutablePreferences2;
            this.L$2 = null;
            this.I$0 = 0;
            this.label = 1;
            return pVar.invoke(mutablePreferences2, this) != aVar ? mutablePreferences2 : aVar;
        }
    }

    public static final Object edit(DataStore<Preferences> dataStore, p<? super MutablePreferences, ? super e<? super ab>, ? extends Object> pVar, e<? super Preferences> eVar) {
        return dataStore.updateData(new AnonymousClass2(pVar, null), eVar);
    }
}
