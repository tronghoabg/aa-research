package androidx.room.util;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;
    public static final Companion Companion = new Companion(null);
    public final Map<String, Column> columns;
    public final Set<ForeignKey> foreignKeys;
    public final Set<Index> indices;
    public final String name;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CreatedFrom {
    }

    /* compiled from: WazeSource */
    public final class ForeignKey {
        public final List<String> columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List<String> referenceColumnNames;
        public final String referenceTable;

        public ForeignKey(String str, String str2, String str3, List<String> list, List<String> list2) {
            x.f(str, "referenceTable");
            x.f(str2, "onDelete");
            x.f(str3, "onUpdate");
            x.f(list, "columnNames");
            x.f(list2, "referenceColumnNames");
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = list;
            this.referenceColumnNames = list2;
        }

        public boolean equals(Object obj) {
            return TableInfoKt.equalsCommon(this, obj);
        }

        public int hashCode() {
            return TableInfoKt.hashCodeCommon(this);
        }

        public String toString() {
            return TableInfoKt.toStringCommon(this);
        }
    }

    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set, Set<Index> set2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(map, "columns");
        x.f(set, "foreignKeys");
        this.name = str;
        this.columns = map;
        this.foreignKeys = set;
        this.indices = set2;
    }

    public static final TableInfo read(SQLiteConnection sQLiteConnection, String str) {
        return Companion.read(sQLiteConnection, str);
    }

    public boolean equals(Object obj) {
        return TableInfoKt.equalsCommon(this, obj);
    }

    public int hashCode() {
        return TableInfoKt.hashCodeCommon(this);
    }

    public String toString() {
        return TableInfoKt.toStringCommon(this);
    }

    /* compiled from: WazeSource */
    public final class Column {
        public static final Companion Companion = new Companion(null);
        public final int affinity;
        public final int createdFrom;
        public final String defaultValue;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final String type;

        public Column(String str, String str2, boolean z, int i2, String str3, int i3) {
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            x.f(str2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            this.name = str;
            this.type = str2;
            this.notNull = z;
            this.primaryKeyPosition = i2;
            this.defaultValue = str3;
            this.createdFrom = i3;
            this.affinity = SchemaInfoUtilKt.findAffinity(str2);
        }

        public static final boolean defaultValueEquals(String str, String str2) {
            return Companion.defaultValueEquals(str, str2);
        }

        public static /* synthetic */ void getAffinity$annotations() {
        }

        public boolean equals(Object obj) {
            return TableInfoKt.equalsCommon(this, obj);
        }

        public int hashCode() {
            return TableInfoKt.hashCodeCommon(this);
        }

        public final boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        public String toString() {
            return TableInfoKt.toStringCommon(this);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final boolean defaultValueEquals(String str, String str2) {
                x.f(str, "current");
                return TableInfoKt.defaultValueEqualsCommon(str, str2);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Column(String str, String str2, boolean z, int i2) {
            this(str, str2, z, i2, null, 0);
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            x.f(str2, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        }
    }

    /* compiled from: WazeSource */
    public final class Index {
        public static final Companion Companion = new Companion(null);
        public static final String DEFAULT_PREFIX = "index_";
        public final List<String> columns;
        public final String name;
        public List<String> orders;
        public final boolean unique;

        public Index(String str, boolean z, List<String> list, List<String> list2) {
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            x.f(list, "columns");
            x.f(list2, "orders");
            this.name = str;
            this.unique = z;
            this.columns = list;
            this.orders = list2;
            ArrayList arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add("ASC");
                }
                arrayList = arrayList2;
            }
            this.orders = arrayList;
        }

        public boolean equals(Object obj) {
            return TableInfoKt.equalsCommon(this, obj);
        }

        public int hashCode() {
            return TableInfoKt.hashCodeCommon(this);
        }

        public String toString() {
            return TableInfoKt.toStringCommon(this);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public Index(String str, boolean z, List<String> list) {
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            x.f(list, "columns");
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add("ASC");
            }
            this(str, z, list, arrayList);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            x.f(supportSQLiteDatabase, "database");
            x.f(str, "tableName");
            return read(new SupportSQLiteConnection(supportSQLiteDatabase), str);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final TableInfo read(SQLiteConnection sQLiteConnection, String str) {
            x.f(sQLiteConnection, "connection");
            x.f(str, "tableName");
            return SchemaInfoUtilKt.readTableInfo(sQLiteConnection, str);
        }
    }

    public static final TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set) {
        this(str, map, set, a.p());
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(map, "columns");
        x.f(set, "foreignKeys");
    }

    public /* synthetic */ TableInfo(String str, Map map, Set set, Set set2, int i2, o oVar) {
        this(str, map, set, (i2 & 8) != 0 ? null : set2);
    }
}
