package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import androidx.datastore.core.DataMigration;
import h.a.i;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.f;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;
import h.g.b.x;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final q<SharedPreferencesView, T, e<? super T>, Object> migrate;
    private final String name;
    private final f sharedPrefs$delegate;
    private final p<T, e<? super Boolean>, Object> shouldRunMigration;

    /* compiled from: WazeSource */
    final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final boolean deleteSharedPreferences(Context context, String str) {
            x.f(context, "context");
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            return context.deleteSharedPreferences(str);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1, reason: invalid class name and case insensitive filesystem */
    final class C04321 extends c {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04321(SharedPreferencesMigration<T> sharedPreferencesMigration, e<? super C04321> eVar) {
            super(eVar);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(final Context context, final String str, Set<String> set, p<? super T, ? super e<? super Boolean>, ? extends Object> pVar, q<? super SharedPreferencesView, ? super T, ? super e<? super T>, ? extends Object> qVar) {
        this((a<? extends SharedPreferences>) new a() { // from class: androidx.datastore.migrations.SharedPreferencesMigration$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SharedPreferencesMigration._init_$lambda$0(context, str);
            }
        }, set, pVar, qVar, context, str);
        x.f(context, "context");
        x.f(str, "sharedPreferencesName");
        x.f(set, "keysToMigrate");
        x.f(pVar, "shouldRunMigration");
        x.f(qVar, "migrate");
    }

    static final SharedPreferences _init_$lambda$0(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        x.e(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    private final void deleteSharedPreferences(Context context, String str) {
        Api24Impl.deleteSharedPreferences(context, str);
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), String.valueOf(str).concat(".xml"));
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(e<? super ab> eVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return ab.f48028a;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t, e<? super T> eVar) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object shouldMigrate(T r5, h.c.e<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration.C04321
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration.C04321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            h.g.a.p<T, h.c.e<? super java.lang.Boolean>, java.lang.Object> r6 = r4.shouldRunMigration
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 == r1) goto L93
        L3c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r6 = 0
            if (r5 != 0) goto L4a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            return r4
        L4a:
            java.util.Set<java.lang.String> r5 = r4.keySet
            if (r5 != 0) goto L64
            android.content.SharedPreferences r4 = r4.getSharedPrefs()
            java.util.Map r4 = r4.getAll()
            java.lang.String r5 = "getAll(...)"
            h.g.b.x.e(r4, r5)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L62
            goto L8e
        L62:
            r3 = r6
            goto L8e
        L64:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            android.content.SharedPreferences r4 = r4.getSharedPrefs()
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L78
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L78
            goto L62
        L78:
            java.util.Iterator r5 = r5.iterator()
        L7c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L7c
        L8e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate(java.lang.Object, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<T, e<? super Boolean>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, e<? super Boolean> eVar) {
            return ((AnonymousClass1) create(t, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            return true;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, e<? super Boolean> eVar) {
            return invoke2((AnonymousClass1) obj, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    public final class AnonymousClass2 extends g implements p<T, e<? super Boolean>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, e<? super Boolean> eVar) {
            return ((AnonymousClass2) create(t, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            return true;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, e<? super Boolean> eVar) {
            return invoke2((AnonymousClass2) obj, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    public final class AnonymousClass3 extends g implements p<T, e<? super Boolean>, Object> {
        int label;

        AnonymousClass3(e<? super AnonymousClass3> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass3(eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t, e<? super Boolean> eVar) {
            return ((AnonymousClass3) create(t, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            return true;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, e<? super Boolean> eVar) {
            return invoke2((AnonymousClass3) obj, eVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, Set<String> set, q<? super SharedPreferencesView, ? super T, ? super e<? super T>, ? extends Object> qVar) {
        this(context, str, set, null, qVar, 8, null);
        x.f(context, "context");
        x.f(str, "sharedPreferencesName");
        x.f(set, "keysToMigrate");
        x.f(qVar, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(a<? extends SharedPreferences> aVar, q<? super SharedPreferencesView, ? super T, ? super e<? super T>, ? extends Object> qVar) {
        this(aVar, (Set) null, (p) null, qVar, 6, (o) null);
        x.f(aVar, "produceSharedPreferences");
        x.f(qVar, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(a<? extends SharedPreferences> aVar, Set<String> set, q<? super SharedPreferencesView, ? super T, ? super e<? super T>, ? extends Object> qVar) {
        this(aVar, set, (p) null, qVar, 4, (o) null);
        x.f(aVar, "produceSharedPreferences");
        x.f(set, "keysToMigrate");
        x.f(qVar, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, q<? super SharedPreferencesView, ? super T, ? super e<? super T>, ? extends Object> qVar) {
        this(context, str, null, null, qVar, 12, null);
        x.f(context, "context");
        x.f(str, "sharedPreferencesName");
        x.f(qVar, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super e<? super Boolean>, ? extends Object> pVar, q<? super SharedPreferencesView, ? super T, ? super e<? super T>, ? extends Object> qVar) {
        this(aVar, set, pVar, qVar, (Context) null, (String) null);
        x.f(aVar, "produceSharedPreferences");
        x.f(set, "keysToMigrate");
        x.f(pVar, "shouldRunMigration");
        x.f(qVar, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(a aVar, Set set, AnonymousClass2 anonymousClass2, q qVar, int i2, o oVar) {
        this((a<? extends SharedPreferences>) aVar, (Set<String>) ((i2 & 2) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set), (i2 & 4) != 0 ? new AnonymousClass2(null) : anonymousClass2, qVar);
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, AnonymousClass3 anonymousClass3, q qVar, int i2, o oVar) {
        this(context, str, (i2 & 4) != 0 ? SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() : set, (i2 & 8) != 0 ? new AnonymousClass3(null) : anonymousClass3, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SharedPreferencesMigration(a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super e<? super Boolean>, ? extends Object> pVar, q<? super SharedPreferencesView, ? super T, ? super e<? super T>, ? extends Object> qVar, Context context, String str) {
        this.shouldRunMigration = pVar;
        this.migrate = qVar;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = h.g.a(aVar);
        this.keySet = set == SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS() ? null : i.at(set);
    }

    /* synthetic */ SharedPreferencesMigration(a aVar, Set set, AnonymousClass1 anonymousClass1, q qVar, Context context, String str, int i2, o oVar) {
        this((a<? extends SharedPreferences>) aVar, (Set<String>) set, (i2 & 4) != 0 ? new AnonymousClass1(null) : anonymousClass1, qVar, context, str);
    }
}
