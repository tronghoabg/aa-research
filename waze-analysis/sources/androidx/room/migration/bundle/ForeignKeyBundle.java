package androidx.room.migration.bundle;

import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.h;
import h.o.c;
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
public final class ForeignKeyBundle implements SchemaEquality<ForeignKeyBundle> {
    private final List<String> columns;
    private final String onDelete;
    private final String onUpdate;
    private final List<String> referencedColumns;
    private final String table;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {null, null, null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.ForeignKeyBundle$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return ForeignKeyBundle._childSerializers$_anonymous_();
        }
    }), g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.ForeignKeyBundle$$ExternalSyntheticLambda1
        @Override // h.g.a.a
        public final Object invoke() {
            return ForeignKeyBundle._childSerializers$_anonymous_$0();
        }
    })};

    public ForeignKeyBundle(String str, String str2, String str3, List<String> list, List<String> list2) {
        x.f(str, "table");
        x.f(str2, "onDelete");
        x.f(str3, "onUpdate");
        x.f(list, "columns");
        x.f(list2, "referencedColumns");
        this.table = str;
        this.onDelete = str2;
        this.onUpdate = str3;
        this.columns = list;
        this.referencedColumns = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(cf.f51036a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_$0() {
        return new e(cf.f51036a);
    }

    public static /* synthetic */ void getColumns$annotations() {
    }

    public static /* synthetic */ void getOnDelete$annotations() {
    }

    public static /* synthetic */ void getOnUpdate$annotations() {
    }

    public static /* synthetic */ void getReferencedColumns$annotations() {
    }

    public static /* synthetic */ void getTable$annotations() {
    }

    public static final /* synthetic */ void write$Self$room_migration(ForeignKeyBundle foreignKeyBundle, d dVar, q qVar) {
        f<b<Object>>[] fVarArr = $childSerializers;
        dVar.encodeStringElement(qVar, 0, foreignKeyBundle.table);
        dVar.encodeStringElement(qVar, 1, foreignKeyBundle.onDelete);
        dVar.encodeStringElement(qVar, 2, foreignKeyBundle.onUpdate);
        dVar.encodeSerializableElement(qVar, 3, fVarArr[3].getValue(), foreignKeyBundle.columns);
        dVar.encodeSerializableElement(qVar, 4, fVarArr[4].getValue(), foreignKeyBundle.referencedColumns);
    }

    public final List<String> getColumns() {
        return this.columns;
    }

    public final String getOnDelete() {
        return this.onDelete;
    }

    public final String getOnUpdate() {
        return this.onUpdate;
    }

    public final List<String> getReferencedColumns() {
        return this.referencedColumns;
    }

    public final String getTable() {
        return this.table;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(ForeignKeyBundle foreignKeyBundle) {
        x.f(foreignKeyBundle, "other");
        return x.n(this.table, foreignKeyBundle.table) && x.n(this.onDelete, foreignKeyBundle.onDelete) && x.n(this.onUpdate, foreignKeyBundle.onUpdate) && x.n(this.columns, foreignKeyBundle.columns) && x.n(this.referencedColumns, foreignKeyBundle.referencedColumns);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<ForeignKeyBundle> serializer() {
            return ForeignKeyBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ ForeignKeyBundle(int i2, String str, String str2, String str3, List list, List list2, ca caVar) {
        if ((i2 & 31) != 31) {
            c.m(i2, 31, ForeignKeyBundle$$serializer.INSTANCE.getDescriptor());
        }
        this.table = str;
        this.onDelete = str2;
        this.onUpdate = str3;
        this.columns = list;
        this.referencedColumns = list2;
    }
}
