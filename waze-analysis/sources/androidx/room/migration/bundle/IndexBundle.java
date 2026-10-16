package androidx.room.migration.bundle;

import androidx.autofill.HintConstants;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import h.h;
import h.n.o;
import h.o.c;
import java.util.ArrayList;
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
public final class IndexBundle implements SchemaEquality<IndexBundle> {
    public static final String DEFAULT_PREFIX = "index_";
    private final List<String> columnNames;
    private final String createSql;
    private final boolean isUnique;
    private final String name;
    private final List<String> orders;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {null, null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.IndexBundle$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return IndexBundle._childSerializers$_anonymous_();
        }
    }), g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.IndexBundle$$ExternalSyntheticLambda1
        @Override // h.g.a.a
        public final Object invoke() {
            return IndexBundle._childSerializers$_anonymous_$3();
        }
    }), null};

    public /* synthetic */ IndexBundle(int i2, String str, boolean z, List list, List list2, String str2, ca caVar) {
        if ((i2 & 19) != 19) {
            c.m(i2, 19, IndexBundle$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.isUnique = z;
        if ((i2 & 4) == 0) {
            this.columnNames = null;
        } else {
            this.columnNames = list;
        }
        this.orders = (i2 & 8) == 0 ? null : list2;
        this.createSql = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(cf.f51036a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$3() {
        return new e(cf.f51036a);
    }

    public static /* synthetic */ void getColumnNames$annotations() {
    }

    public static /* synthetic */ void getCreateSql$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOrders$annotations() {
    }

    public static /* synthetic */ void isUnique$annotations() {
    }

    public static final /* synthetic */ void write$Self$room_migration(IndexBundle indexBundle, d dVar, q qVar) {
        f<b<Object>>[] fVarArr = $childSerializers;
        dVar.encodeStringElement(qVar, 0, indexBundle.name);
        dVar.encodeBooleanElement(qVar, 1, indexBundle.isUnique);
        if (dVar.shouldEncodeElementDefault(qVar, 2) || indexBundle.columnNames != null) {
            dVar.encodeNullableSerializableElement(qVar, 2, fVarArr[2].getValue(), indexBundle.columnNames);
        }
        if (dVar.shouldEncodeElementDefault(qVar, 3) || indexBundle.orders != null) {
            dVar.encodeNullableSerializableElement(qVar, 3, fVarArr[3].getValue(), indexBundle.orders);
        }
        dVar.encodeStringElement(qVar, 4, indexBundle.createSql);
    }

    public final String create(String str) {
        x.f(str, "tableName");
        return BundleUtil.replaceTableName(this.createSql, str);
    }

    public final List<String> getColumnNames() {
        return this.columnNames;
    }

    public final String getCreateSql(String str) {
        x.f(str, "tableName");
        return BundleUtil.replaceTableName(this.createSql, str);
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOrders() {
        return this.orders;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(IndexBundle indexBundle) {
        ArrayList arrayList;
        ArrayList arrayList2;
        x.f(indexBundle, "other");
        if (this.isUnique != indexBundle.isUnique) {
            return false;
        }
        if (o.ah(this.name, "index_")) {
            if (!o.ah(indexBundle.name, "index_")) {
                return false;
            }
        } else if (o.ah(indexBundle.name, "index_") || !x.n(this.name, indexBundle.name)) {
            return false;
        }
        List<String> list = this.columnNames;
        if (list == null ? indexBundle.columnNames != null : !x.n(list, indexBundle.columnNames)) {
            return false;
        }
        List<String> list2 = this.columnNames;
        int size = list2 != null ? list2.size() : 0;
        List<String> list3 = this.orders;
        if (list3 == null || list3.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList3.add("ASC");
            }
            arrayList = arrayList3;
        } else {
            arrayList = this.orders;
        }
        List<String> list4 = indexBundle.orders;
        if (list4 == null || list4.isEmpty()) {
            ArrayList arrayList4 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList4.add("ASC");
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = indexBundle.orders;
        }
        return x.n(arrayList, arrayList2);
    }

    public final boolean isUnique() {
        return this.isUnique;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<IndexBundle> serializer() {
            return IndexBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public final String getCreateSql() {
        return this.createSql;
    }

    public IndexBundle(String str, boolean z, List<String> list, List<String> list2, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(str2, "createSql");
        this.name = str;
        this.isUnique = z;
        this.columnNames = list;
        this.orders = list2;
        this.createSql = str2;
    }

    public /* synthetic */ IndexBundle(String str, boolean z, List list, List list2, String str2, int i2, h.g.b.o oVar) {
        this(str, z, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, str2);
    }
}
