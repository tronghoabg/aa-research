package androidx.room.migration.bundle;

import h.a.r;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.h;
import h.k.n;
import h.l.c;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.d;
import kotlinx.b.c.ca;
import kotlinx.b.i;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
public abstract class BaseEntityBundle {
    public static final String NEW_TABLE_PREFIX = "_new_";
    private final f fieldsByColumnName$delegate;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>> $cachedSerializer$delegate = g.b(h.f48131b, new a() { // from class: androidx.room.migration.bundle.BaseEntityBundle$$ExternalSyntheticLambda2
        @Override // h.g.a.a
        public final Object invoke() {
            return BaseEntityBundle._init_$_anonymous_();
        }
    });

    private BaseEntityBundle() {
        this.fieldsByColumnName$delegate = g.a(new a() { // from class: androidx.room.migration.bundle.BaseEntityBundle$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return BaseEntityBundle.fieldsByColumnName_delegate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _init_$_anonymous_() {
        int i2 = ar.f48106a;
        return new i("androidx.room.migration.bundle.BaseEntityBundle", new m(BaseEntityBundle.class), new c[]{new m(EntityBundle.class), new m(FtsEntityBundle.class)}, new b[]{EntityBundle$$serializer.INSTANCE, FtsEntityBundle$$serializer.INSTANCE}, new Annotation[0]);
    }

    static final Map _init_$lambda$3(BaseEntityBundle baseEntityBundle) {
        List<FieldBundle> fields = baseEntityBundle.getFields();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(h.a.i.q(fields, 10)), 16));
        for (Object obj : fields) {
            linkedHashMap.put(((FieldBundle) obj).getColumnName(), obj);
        }
        return linkedHashMap;
    }

    static final Map fieldsByColumnName_delegate$lambda$1(BaseEntityBundle baseEntityBundle) {
        List<FieldBundle> fields = baseEntityBundle.getFields();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(h.a.i.q(fields, 10)), 16));
        for (Object obj : fields) {
            linkedHashMap.put(((FieldBundle) obj).getColumnName(), obj);
        }
        return linkedHashMap;
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

    public static final /* synthetic */ void write$Self(BaseEntityBundle baseEntityBundle, d dVar, q qVar) {
    }

    public abstract List<String> buildCreateQueries();

    public final String createNewTable() {
        return BundleUtil.replaceTableName(getCreateSql(), getNewTableName());
    }

    public final String createTable() {
        return BundleUtil.replaceTableName(getCreateSql(), getTableName());
    }

    public abstract String getCreateSql();

    public abstract List<FieldBundle> getFields();

    public final Map<String, FieldBundle> getFieldsByColumnName() {
        return (Map) this.fieldsByColumnName$delegate.getValue();
    }

    public abstract List<ForeignKeyBundle> getForeignKeys();

    public abstract List<IndexBundle> getIndices();

    public final String getNewTableName() {
        return NEW_TABLE_PREFIX.concat(String.valueOf(getTableName()));
    }

    public abstract PrimaryKeyBundle getPrimaryKey();

    public abstract String getTableName();

    public final String renameToOriginal() {
        return "ALTER TABLE " + getNewTableName() + " RENAME TO " + getTableName();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) BaseEntityBundle.$cachedSerializer$delegate.getValue();
        }

        public final b<BaseEntityBundle> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ BaseEntityBundle(o oVar) {
        this();
    }

    public /* synthetic */ BaseEntityBundle(int i2, ca caVar) {
        this.fieldsByColumnName$delegate = g.a(new a() { // from class: androidx.room.migration.bundle.BaseEntityBundle$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return BaseEntityBundle._init_$lambda$3(this.f$0);
            }
        });
    }
}
