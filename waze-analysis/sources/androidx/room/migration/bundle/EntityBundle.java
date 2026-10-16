package androidx.room.migration.bundle;

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
import kotlinx.b.c.e;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
public class EntityBundle extends BaseEntityBundle implements SchemaEquality<EntityBundle> {
    private final String createSql;
    private final List<FieldBundle> fields;
    private final List<ForeignKeyBundle> foreignKeys;
    private final List<IndexBundle> indices;
    private final PrimaryKeyBundle primaryKey;
    private final String tableName;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {null, null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.EntityBundle$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return EntityBundle._childSerializers$_anonymous_();
        }
    }), null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.EntityBundle$$ExternalSyntheticLambda1
        @Override // h.g.a.a
        public final Object invoke() {
            return EntityBundle._childSerializers$_anonymous_$2();
        }
    }), g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.EntityBundle$$ExternalSyntheticLambda2
        @Override // h.g.a.a
        public final Object invoke() {
            return EntityBundle._childSerializers$_anonymous_$3();
        }
    })};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EntityBundle(int i2, String str, String str2, List list, PrimaryKeyBundle primaryKeyBundle, List list2, List list3, ca caVar) {
        super(i2, caVar);
        if ((i2 & 15) != 15) {
            c.m(i2, 15, EntityBundle$$serializer.INSTANCE.getDescriptor());
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(FieldBundle$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$2() {
        return new e(IndexBundle$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$3() {
        return new e(ForeignKeyBundle$$serializer.INSTANCE);
    }

    public static /* synthetic */ void getCreateSql$annotations() {
    }

    public static /* synthetic */ void getFields$annotations() {
    }

    public static /* synthetic */ void getForeignKeys$annotations() {
    }

    public static /* synthetic */ void getIndices$annotations() {
    }

    public static /* synthetic */ void getPrimaryKey$annotations() {
    }

    public static /* synthetic */ void getTableName$annotations() {
    }

    public static final /* synthetic */ void write$Self(EntityBundle entityBundle, d dVar, q qVar) {
        f<b<Object>>[] fVarArr = $childSerializers;
        dVar.encodeStringElement(qVar, 0, entityBundle.getTableName());
        dVar.encodeStringElement(qVar, 1, entityBundle.getCreateSql());
        dVar.encodeSerializableElement(qVar, 2, fVarArr[2].getValue(), entityBundle.getFields());
        dVar.encodeSerializableElement(qVar, 3, PrimaryKeyBundle$$serializer.INSTANCE, entityBundle.getPrimaryKey());
        if (dVar.shouldEncodeElementDefault(qVar, 4) || !x.n(entityBundle.getIndices(), i.h())) {
            dVar.encodeSerializableElement(qVar, 4, fVarArr[4].getValue(), entityBundle.getIndices());
        }
        if (!dVar.shouldEncodeElementDefault(qVar, 5) && x.n(entityBundle.getForeignKeys(), i.h())) {
            return;
        }
        dVar.encodeSerializableElement(qVar, 5, fVarArr[5].getValue(), entityBundle.getForeignKeys());
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public List<String> buildCreateQueries() {
        List listB = i.b();
        listB.add(createTable());
        Iterator<T> it = getIndices().iterator();
        while (it.hasNext()) {
            listB.add(((IndexBundle) it.next()).create(getTableName()));
        }
        return i.a(listB);
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

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public List<IndexBundle> getIndices() {
        return this.indices;
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public PrimaryKeyBundle getPrimaryKey() {
        return this.primaryKey;
    }

    @Override // androidx.room.migration.bundle.BaseEntityBundle
    public String getTableName() {
        return this.tableName;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(EntityBundle entityBundle) {
        x.f(entityBundle, "other");
        return x.n(getTableName(), entityBundle.getTableName()) && SchemaEqualityUtil.INSTANCE.checkSchemaEquality(getFieldsByColumnName(), entityBundle.getFieldsByColumnName()) && SchemaEqualityUtil.INSTANCE.checkSchemaEquality(getPrimaryKey(), entityBundle.getPrimaryKey()) && SchemaEqualityUtil.INSTANCE.checkSchemaEquality(getIndices(), entityBundle.getIndices()) && SchemaEqualityUtil.INSTANCE.checkSchemaEquality(getForeignKeys(), entityBundle.getForeignKeys());
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<EntityBundle> serializer() {
            return EntityBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityBundle(String str, String str2, List<FieldBundle> list, PrimaryKeyBundle primaryKeyBundle, List<IndexBundle> list2, List<ForeignKeyBundle> list3) {
        super(null);
        x.f(str, "tableName");
        x.f(str2, "createSql");
        x.f(list, "fields");
        x.f(primaryKeyBundle, "primaryKey");
        x.f(list2, "indices");
        x.f(list3, "foreignKeys");
        this.tableName = str;
        this.createSql = str2;
        this.fields = list;
        this.primaryKey = primaryKeyBundle;
        this.indices = list2;
        this.foreignKeys = list3;
    }

    public /* synthetic */ EntityBundle(String str, String str2, List list, PrimaryKeyBundle primaryKeyBundle, List list2, List list3, int i2, o oVar) {
        this(str, str2, list, primaryKeyBundle, (i2 & 16) != 0 ? i.h() : list2, (i2 & 32) != 0 ? i.h() : list3);
    }
}
