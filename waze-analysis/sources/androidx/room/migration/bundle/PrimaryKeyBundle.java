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
public final class PrimaryKeyBundle implements SchemaEquality<PrimaryKeyBundle> {
    private final List<String> columnNames;
    private final boolean isAutoGenerate;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {null, g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.PrimaryKeyBundle$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return PrimaryKeyBundle._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ PrimaryKeyBundle(int i2, boolean z, List list, ca caVar) {
        if ((i2 & 3) != 3) {
            c.m(i2, 3, PrimaryKeyBundle$$serializer.INSTANCE.getDescriptor());
        }
        this.isAutoGenerate = z;
        this.columnNames = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(cf.f51036a);
    }

    public static /* synthetic */ void getColumnNames$annotations() {
    }

    public static /* synthetic */ void isAutoGenerate$annotations() {
    }

    public static final /* synthetic */ void write$Self$room_migration(PrimaryKeyBundle primaryKeyBundle, d dVar, q qVar) {
        f<b<Object>>[] fVarArr = $childSerializers;
        dVar.encodeBooleanElement(qVar, 0, primaryKeyBundle.isAutoGenerate);
        dVar.encodeSerializableElement(qVar, 1, fVarArr[1].getValue(), primaryKeyBundle.columnNames);
    }

    public final List<String> getColumnNames() {
        return this.columnNames;
    }

    public final boolean isAutoGenerate() {
        return this.isAutoGenerate;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(PrimaryKeyBundle primaryKeyBundle) {
        x.f(primaryKeyBundle, "other");
        return x.n(this.columnNames, primaryKeyBundle.columnNames) && this.isAutoGenerate == primaryKeyBundle.isAutoGenerate;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<PrimaryKeyBundle> serializer() {
            return PrimaryKeyBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public PrimaryKeyBundle(boolean z, List<String> list) {
        x.f(list, "columnNames");
        this.isAutoGenerate = z;
        this.columnNames = list;
    }
}
