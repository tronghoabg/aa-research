package androidx.room.migration.bundle;

import com.waze.strings.DisplayStrings;
import h.a.i;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.h;
import h.o.c;
import java.util.Iterator;
import java.util.List;
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
public final class FtsEntityBundle extends BaseEntityBundle implements SchemaEquality<FtsEntityBundle> {
    private final List<String> contentSyncSqlTriggers;
    private final String createSql;
    private final List<FieldBundle> fields;
    private final List<ForeignKeyBundle> foreignKeys;
    private final FtsOptionsBundle ftsOptions;
    private final String ftsVersion;
    private final List<IndexBundle> indices;
    private final PrimaryKeyBundle primaryKey;
    private final f shadowTableNames$delegate;
    private final String tableName;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {null, null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.FtsEntityBundle$$ExternalSyntheticLambda1
        @Override // h.g.a.a
        public final Object invoke() {
            return FtsEntityBundle._childSerializers$_anonymous_();
        }
    }), null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.FtsEntityBundle$$ExternalSyntheticLambda2
        @Override // h.g.a.a
        public final Object invoke() {
            return FtsEntityBundle._childSerializers$_anonymous_$7();
        }
    }), g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.FtsEntityBundle$$ExternalSyntheticLambda3
        @Override // h.g.a.a
        public final Object invoke() {
            return FtsEntityBundle._childSerializers$_anonymous_$8();
        }
    }), null, null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.FtsEntityBundle$$ExternalSyntheticLambda4
        @Override // h.g.a.a
        public final Object invoke() {
            return FtsEntityBundle._childSerializers$_anonymous_$9();
        }
    })};
    private static final List<String> SHADOW_TABLE_NAME_SUFFIXES = i.i("_content", "_segdir", "_segments", "_stat", "_docsize");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FtsEntityBundle(String str, String str2, List<FieldBundle> list, PrimaryKeyBundle primaryKeyBundle, List<IndexBundle> list2, List<ForeignKeyBundle> list3, String str3, FtsOptionsBundle ftsOptionsBundle, List<String> list4) {
        super(null);
        x.f(str, "tableName");
        x.f(str2, "createSql");
        x.f(list, "fields");
        x.f(primaryKeyBundle, "primaryKey");
        x.f(list2, "indices");
        x.f(list3, "foreignKeys");
        x.f(str3, "ftsVersion");
        x.f(ftsOptionsBundle, "ftsOptions");
        x.f(list4, "contentSyncSqlTriggers");
        this.tableName = str;
        this.createSql = str2;
        this.fields = list;
        this.primaryKey = primaryKeyBundle;
        this.indices = list2;
        this.foreignKeys = list3;
        this.ftsVersion = str3;
        this.ftsOptions = ftsOptionsBundle;
        this.contentSyncSqlTriggers = list4;
        this.shadowTableNames$delegate = g.a(new a() { // from class: androidx.room.migration.bundle.FtsEntityBundle$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return FtsEntityBundle.shadowTableNames_delegate$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(FieldBundle$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$7() {
        return new e(IndexBundle$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$8() {
        return new e(ForeignKeyBundle$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$9() {
        return new e(cf.f51036a);
    }

    static final List _init_$lambda$6(FtsEntityBundle ftsEntityBundle) {
        String tableName = ftsEntityBundle.getTableName();
        List listB = i.b();
        Iterator<T> it = SHADOW_TABLE_NAME_SUFFIXES.iterator();
        while (it.hasNext()) {
            listB.add(String.valueOf(tableName).concat(String.valueOf((String) it.next())));
        }
        return i.a(listB);
    }

    public static /* synthetic */ void getContentSyncSqlTriggers$annotations() {
    }

    public static /* synthetic */ void getCreateSql$annotations() {
    }

    public static /* synthetic */ void getFields$annotations() {
    }

    public static /* synthetic */ void getForeignKeys$annotations() {
    }

    public static /* synthetic */ void getFtsOptions$annotations() {
    }

    public static /* synthetic */ void getFtsVersion$annotations() {
    }

    public static /* synthetic */ void getIndices$annotations() {
    }

    public static /* synthetic */ void getPrimaryKey$annotations() {
    }

    public static /* synthetic */ void getTableName$annotations() {
    }

    static final List shadowTableNames_delegate$lambda$3(FtsEntityBundle ftsEntityBundle) {
        String tableName = ftsEntityBundle.getTableName();
        List listB = i.b();
        Iterator<T> it = SHADOW_TABLE_NAME_SUFFIXES.iterator();
        while (it.hasNext()) {
            listB.add(String.valueOf(tableName).concat(String.valueOf((String) it.next())));
        }
        return i.a(listB);
    }

    public static final /* synthetic */ void write$Self$room_migration(FtsEntityBundle ftsEntityBundle, d dVar, q qVar) {
        f<b<Object>>[] fVarArr = $childSerializers;
        dVar.encodeStringElement(qVar, 0, ftsEntityBundle.getTableName());
        dVar.encodeStringElement(qVar, 1, ftsEntityBundle.getCreateSql());
        dVar.encodeSerializableElement(qVar, 2, fVarArr[2].getValue(), ftsEntityBundle.getFields());
        dVar.encodeSerializableElement(qVar, 3, PrimaryKeyBundle$$serializer.INSTANCE, ftsEntityBundle.getPrimaryKey());
        if (dVar.shouldEncodeElementDefault(qVar, 4) || !x.n(ftsEntityBundle.getIndices(), i.h())) {
            dVar.encodeSerializableElement(qVar, 4, fVarArr[4].getValue(), ftsEntityBundle.getIndices());
        }
        if (dVar.shouldEncodeElementDefault(qVar, 5) || !x.n(ftsEntityBundle.getForeignKeys(), i.h())) {
            dVar.encodeSerializableElement(qVar, 5, fVarArr[5].getValue(), ftsEntityBundle.getForeignKeys());
        }
        dVar.encodeStringElement(qVar, 6, ftsEntityBundle.ftsVersion);
        dVar.encodeSerializableElement(qVar, 7, FtsOptionsBundle$$serializer.INSTANCE, ftsEntityBundle.ftsOptions);
        dVar.encodeSerializableElement(qVar, 8, fVarArr[8].getValue(), ftsEntityBundle.contentSyncSqlTriggers);
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public List<String> buildCreateQueries() {
        List listB = i.b();
        listB.add(createTable());
        listB.addAll(this.contentSyncSqlTriggers);
        return i.a(listB);
    }

    public final List<String> getContentSyncSqlTriggers() {
        return this.contentSyncSqlTriggers;
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public String getCreateSql() {
        return this.createSql;
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public List<FieldBundle> getFields() {
        return this.fields;
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public List<ForeignKeyBundle> getForeignKeys() {
        return this.foreignKeys;
    }

    public final FtsOptionsBundle getFtsOptions() {
        return this.ftsOptions;
    }

    public final String getFtsVersion() {
        return this.ftsVersion;
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public List<IndexBundle> getIndices() {
        return this.indices;
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public PrimaryKeyBundle getPrimaryKey() {
        return this.primaryKey;
    }

    public final List<String> getShadowTableNames() {
        return (List) this.shadowTableNames$delegate.getValue();
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public String getTableName() {
        return this.tableName;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(FtsEntityBundle ftsEntityBundle) {
        x.f(ftsEntityBundle, "other");
        if (x.n(getTableName(), ftsEntityBundle.getTableName()) && SchemaEqualityUtil.INSTANCE.checkSchemaEquality(getFieldsByColumnName(), ftsEntityBundle.getFieldsByColumnName()) && SchemaEqualityUtil.INSTANCE.checkSchemaEquality(getPrimaryKey(), ftsEntityBundle.getPrimaryKey()) && SchemaEqualityUtil.INSTANCE.checkSchemaEquality(getIndices(), ftsEntityBundle.getIndices()) && SchemaEqualityUtil.INSTANCE.checkSchemaEquality(getForeignKeys(), ftsEntityBundle.getForeignKeys()) && x.n(this.ftsVersion, ftsEntityBundle.ftsVersion)) {
            if (SchemaEqualityUtil.INSTANCE.checkSchemaEquality(this.ftsOptions, ftsEntityBundle.ftsOptions)) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<FtsEntityBundle> serializer() {
            return FtsEntityBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FtsEntityBundle(int i2, String str, String str2, List list, PrimaryKeyBundle primaryKeyBundle, List list2, List list3, String str3, FtsOptionsBundle ftsOptionsBundle, List list4, ca caVar) {
        super(i2, caVar);
        if ((i2 & DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_INCORRECT_JUNCTION) != 463) {
            c.m(i2, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_INCORRECT_JUNCTION, FtsEntityBundle$$serializer.INSTANCE.getDescriptor());
        }
        this.tableName = str;
        this.createSql = str2;
        this.fields = list;
        this.primaryKey = primaryKeyBundle;
        if ((i2 & 16) == 0) {
            this.indices = i.h();
        } else {
            this.indices = list2;
        }
        if ((i2 & 32) == 0) {
            this.foreignKeys = i.h();
        } else {
            this.foreignKeys = list3;
        }
        this.ftsVersion = str3;
        this.ftsOptions = ftsOptionsBundle;
        this.contentSyncSqlTriggers = list4;
        this.shadowTableNames$delegate = g.a(new a() { // from class: androidx.room.migration.bundle.FtsEntityBundle$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return FtsEntityBundle._init_$lambda$6(this.f$0);
            }
        });
    }

    public /* synthetic */ FtsEntityBundle(String str, String str2, List list, PrimaryKeyBundle primaryKeyBundle, List list2, List list3, String str3, FtsOptionsBundle ftsOptionsBundle, List list4, int i2, o oVar) {
        this(str, str2, list, primaryKeyBundle, (i2 & 16) != 0 ? i.h() : list2, (i2 & 32) != 0 ? i.h() : list3, str3, ftsOptionsBundle, list4);
    }
}
