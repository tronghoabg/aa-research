package androidx.room.migration.bundle;

import androidx.media3.exoplayer.upstream.CmcdData;
import h.a.i;
import h.a.r;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.h;
import h.k.n;
import h.o.c;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.d;
import kotlinx.b.c.ca;
import kotlinx.b.c.cf;
import kotlinx.b.c.e;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
public final class DatabaseBundle implements SchemaEquality<DatabaseBundle> {
    private final List<BaseEntityBundle> entities;
    private final f entitiesByTableName$delegate;
    private final String identityHash;
    private final List<String> setupQueries;
    private final int version;
    private final List<DatabaseViewBundle> views;
    private final f viewsByName$delegate;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {null, null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.DatabaseBundle$$ExternalSyntheticLambda2
        @Override // h.g.a.a
        public final Object invoke() {
            return DatabaseBundle._childSerializers$_anonymous_();
        }
    }), g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.DatabaseBundle$$ExternalSyntheticLambda3
        @Override // h.g.a.a
        public final Object invoke() {
            return DatabaseBundle._childSerializers$_anonymous_$11();
        }
    }), g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.DatabaseBundle$$ExternalSyntheticLambda4
        @Override // h.g.a.a
        public final Object invoke() {
            return DatabaseBundle._childSerializers$_anonymous_$12();
        }
    })};

    /* compiled from: WazeSource */
    final class FtsEntityCreateComparator implements Comparator<BaseEntityBundle> {
        @Override // java.util.Comparator
        public int compare(BaseEntityBundle baseEntityBundle, BaseEntityBundle baseEntityBundle2) {
            x.f(baseEntityBundle, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
            x.f(baseEntityBundle2, "b");
            return baseEntityBundle instanceof FtsEntityBundle ? x.n(((FtsEntityBundle) baseEntityBundle).getFtsOptions().getContentTable(), baseEntityBundle2.getTableName()) ? 1 : 0 : ((baseEntityBundle2 instanceof FtsEntityBundle) && x.n(((FtsEntityBundle) baseEntityBundle2).getFtsOptions().getContentTable(), baseEntityBundle.getTableName())) ? -1 : 0;
        }
    }

    public /* synthetic */ DatabaseBundle(int i2, int i3, String str, List list, List list2, List list3, ca caVar) {
        if ((i2 & 23) != 23) {
            c.m(i2, 23, DatabaseBundle$$serializer.INSTANCE.getDescriptor());
        }
        this.version = i3;
        this.identityHash = str;
        this.entities = list;
        if ((i2 & 8) == 0) {
            this.views = i.h();
        } else {
            this.views = list2;
        }
        this.setupQueries = list3;
        this.entitiesByTableName$delegate = g.a(new a() { // from class: androidx.room.migration.bundle.DatabaseBundle$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return DatabaseBundle._init_$lambda$8(this.f$0);
            }
        });
        this.viewsByName$delegate = g.a(new a() { // from class: androidx.room.migration.bundle.DatabaseBundle$$ExternalSyntheticLambda6
            @Override // h.g.a.a
            public final Object invoke() {
                return DatabaseBundle._init_$lambda$10(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(BaseEntityBundle.Companion.serializer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$11() {
        return new e(DatabaseViewBundle$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$12() {
        return new e(cf.f51036a);
    }

    static final Map _init_$lambda$10(DatabaseBundle databaseBundle) {
        List<DatabaseViewBundle> list = databaseBundle.views;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(i.q(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((DatabaseViewBundle) obj).getViewName(), obj);
        }
        return linkedHashMap;
    }

    static final Map _init_$lambda$8(DatabaseBundle databaseBundle) {
        List<BaseEntityBundle> list = databaseBundle.entities;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(i.q(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((BaseEntityBundle) obj).getTableName(), obj);
        }
        return linkedHashMap;
    }

    static final Map entitiesByTableName_delegate$lambda$1(DatabaseBundle databaseBundle) {
        List<BaseEntityBundle> list = databaseBundle.entities;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(i.q(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((BaseEntityBundle) obj).getTableName(), obj);
        }
        return linkedHashMap;
    }

    public static /* synthetic */ void getEntities$annotations() {
    }

    public static /* synthetic */ void getIdentityHash$annotations() {
    }

    private static /* synthetic */ void getSetupQueries$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void getViews$annotations() {
    }

    static final Map viewsByName_delegate$lambda$3(DatabaseBundle databaseBundle) {
        List<DatabaseViewBundle> list = databaseBundle.views;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(i.q(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((DatabaseViewBundle) obj).getViewName(), obj);
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ void write$Self$room_migration(DatabaseBundle databaseBundle, d dVar, q qVar) {
        f<b<Object>>[] fVarArr = $childSerializers;
        dVar.encodeIntElement(qVar, 0, databaseBundle.version);
        dVar.encodeStringElement(qVar, 1, databaseBundle.identityHash);
        dVar.encodeSerializableElement(qVar, 2, fVarArr[2].getValue(), databaseBundle.entities);
        if (dVar.shouldEncodeElementDefault(qVar, 3) || !x.n(databaseBundle.views, i.h())) {
            dVar.encodeSerializableElement(qVar, 3, fVarArr[3].getValue(), databaseBundle.views);
        }
        dVar.encodeSerializableElement(qVar, 4, fVarArr[4].getValue(), databaseBundle.setupQueries);
    }

    public final List<String> buildCreateQueries() {
        List<BaseEntityBundle> list = this.entities;
        List listB = i.b();
        Iterator it = i.al(list, new FtsEntityCreateComparator()).iterator();
        while (it.hasNext()) {
            listB.addAll(((BaseEntityBundle) it.next()).buildCreateQueries());
        }
        Iterator<T> it2 = this.views.iterator();
        while (it2.hasNext()) {
            listB.add(((DatabaseViewBundle) it2.next()).createView());
        }
        listB.addAll(this.setupQueries);
        return i.a(listB);
    }

    public final List<BaseEntityBundle> getEntities() {
        return this.entities;
    }

    public final Map<String, BaseEntityBundle> getEntitiesByTableName() {
        return (Map) this.entitiesByTableName$delegate.getValue();
    }

    public final String getIdentityHash() {
        return this.identityHash;
    }

    public final int getVersion() {
        return this.version;
    }

    public final List<DatabaseViewBundle> getViews() {
        return this.views;
    }

    public final Map<String, DatabaseViewBundle> getViewsByName() {
        return (Map) this.viewsByName$delegate.getValue();
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(DatabaseBundle databaseBundle) {
        x.f(databaseBundle, "other");
        SchemaEqualityUtil schemaEqualityUtil = SchemaEqualityUtil.INSTANCE;
        Map<String, BaseEntityBundle> entitiesByTableName = getEntitiesByTableName();
        Map mapC = r.c();
        for (Map.Entry<String, BaseEntityBundle> entry : entitiesByTableName.entrySet()) {
            String key = entry.getKey();
            BaseEntityBundle value = entry.getValue();
            if (value instanceof EntityBundle) {
                mapC.put(key, value);
            }
        }
        Map mapB = r.b(mapC);
        Map<String, BaseEntityBundle> entitiesByTableName2 = databaseBundle.getEntitiesByTableName();
        Map mapC2 = r.c();
        for (Map.Entry<String, BaseEntityBundle> entry2 : entitiesByTableName2.entrySet()) {
            String key2 = entry2.getKey();
            BaseEntityBundle value2 = entry2.getValue();
            if (value2 instanceof EntityBundle) {
                mapC2.put(key2, value2);
            }
        }
        if (!schemaEqualityUtil.checkSchemaEquality(mapB, r.b(mapC2))) {
            return false;
        }
        SchemaEqualityUtil schemaEqualityUtil2 = SchemaEqualityUtil.INSTANCE;
        Map<String, BaseEntityBundle> entitiesByTableName3 = getEntitiesByTableName();
        Map mapC3 = r.c();
        for (Map.Entry<String, BaseEntityBundle> entry3 : entitiesByTableName3.entrySet()) {
            String key3 = entry3.getKey();
            BaseEntityBundle value3 = entry3.getValue();
            if (value3 instanceof FtsEntityBundle) {
                mapC3.put(key3, value3);
            }
        }
        Map mapB2 = r.b(mapC3);
        Map<String, BaseEntityBundle> entitiesByTableName4 = databaseBundle.getEntitiesByTableName();
        Map mapC4 = r.c();
        for (Map.Entry<String, BaseEntityBundle> entry4 : entitiesByTableName4.entrySet()) {
            String key4 = entry4.getKey();
            BaseEntityBundle value4 = entry4.getValue();
            if (value4 instanceof FtsEntityBundle) {
                mapC4.put(key4, value4);
            }
        }
        return schemaEqualityUtil2.checkSchemaEquality(mapB2, r.b(mapC4)) && SchemaEqualityUtil.INSTANCE.checkSchemaEquality(getViewsByName(), databaseBundle.getViewsByName());
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<DatabaseBundle> serializer() {
            return DatabaseBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseBundle(int i2, String str, List<? extends BaseEntityBundle> list, List<DatabaseViewBundle> list2, List<String> list3) {
        x.f(str, "identityHash");
        x.f(list, "entities");
        x.f(list2, "views");
        x.f(list3, "setupQueries");
        this.version = i2;
        this.identityHash = str;
        this.entities = list;
        this.views = list2;
        this.setupQueries = list3;
        this.entitiesByTableName$delegate = g.a(new a() { // from class: androidx.room.migration.bundle.DatabaseBundle$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return DatabaseBundle.entitiesByTableName_delegate$lambda$1(this.f$0);
            }
        });
        this.viewsByName$delegate = g.a(new a() { // from class: androidx.room.migration.bundle.DatabaseBundle$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return DatabaseBundle.viewsByName_delegate$lambda$3(this.f$0);
            }
        });
    }

    public /* synthetic */ DatabaseBundle(int i2, String str, List list, List list2, List list3, int i3, o oVar) {
        this(i2, str, list, (i3 & 8) != 0 ? i.h() : list2, list3);
    }
}
