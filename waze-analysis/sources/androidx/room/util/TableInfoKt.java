package androidx.room.util;

import androidx.room.util.TableInfo;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.b.a;
import h.g.b.x;
import h.n.o;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TableInfoKt {
    private static final boolean containsSurroundingParenthesis(String str) {
        String str2 = str;
        if (str2.length() != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < str2.length()) {
                char cCharAt = str2.charAt(i2);
                int i5 = i4 + 1;
                if (i4 == 0) {
                    if (cCharAt != '(') {
                        return false;
                    }
                    i4 = 0;
                }
                if (cCharAt == '(') {
                    i3++;
                } else if (cCharAt == ')' && i3 - 1 == 0 && i4 != str.length() - 1) {
                    return false;
                }
                i2++;
                i4 = i5;
            }
            if (i3 == 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean defaultValueEqualsCommon(String str, String str2) {
        x.f(str, "current");
        if (x.n(str, str2)) {
            return true;
        }
        if (!containsSurroundingParenthesis(str)) {
            return false;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        x.e(strSubstring, "substring(...)");
        return x.n(o.v(strSubstring).toString(), str2);
    }

    public static final boolean equalsCommon(TableInfo.Column column, Object obj) {
        x.f(column, "<this>");
        if (column == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Column)) {
            return false;
        }
        TableInfo.Column column2 = (TableInfo.Column) obj;
        if (column.isPrimaryKey() != column2.isPrimaryKey() || !x.n(column.name, column2.name) || column.notNull != column2.notNull) {
            return false;
        }
        String str = column.defaultValue;
        String str2 = column2.defaultValue;
        if (column.createdFrom == 1 && column2.createdFrom == 2 && str != null && !defaultValueEqualsCommon(str, str2)) {
            return false;
        }
        if (column.createdFrom == 2 && column2.createdFrom == 1 && str2 != null && !defaultValueEqualsCommon(str2, str)) {
            return false;
        }
        int i2 = column.createdFrom;
        return (i2 == 0 || i2 != column2.createdFrom || (str == null ? str2 == null : defaultValueEqualsCommon(str, str2))) && column.affinity == column2.affinity;
    }

    public static final String formatString(Collection<?> collection) {
        x.f(collection, "collection");
        return !collection.isEmpty() ? o.ab(i.aM(collection, ",\n", "\n", "\n", 0, null, 56)).concat("},") : " }";
    }

    public static final int hashCodeCommon(TableInfo.Index index) {
        x.f(index, "<this>");
        return ((((((o.ah(index.name, "index_") ? -1184239155 : index.name.hashCode()) * 31) + (index.unique ? 1 : 0)) * 31) + index.columns.hashCode()) * 31) + index.orders.hashCode();
    }

    private static final String joinToStringEndWithIndent(Collection<?> collection) {
        return o.ab(i.aM(collection, ",", null, null, 0, null, 62)).concat(o.ab(" }"));
    }

    private static final String joinToStringMiddleWithIndent(Collection<?> collection) {
        return o.ab(i.aM(collection, ",", null, null, 0, null, 62)).concat(o.ab("},"));
    }

    public static final String toStringCommon(TableInfo tableInfo) {
        List listH;
        x.f(tableInfo, "<this>");
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(tableInfo.name);
        sb.append("',\n            |    columns = {");
        sb.append(formatString(i.al(tableInfo.columns.values(), new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return a.a(((TableInfo.Column) t).name, ((TableInfo.Column) t2).name);
            }
        })));
        sb.append("\n            |    foreignKeys = {");
        sb.append(formatString(tableInfo.foreignKeys));
        sb.append("\n            |    indices = {");
        Set<TableInfo.Index> set = tableInfo.indices;
        if (set == null || (listH = i.al(set, new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return a.a(((TableInfo.Index) t).name, ((TableInfo.Index) t2).name);
            }
        })) == null) {
            listH = i.h();
        }
        sb.append(formatString(listH));
        sb.append("\n            |}\n        ");
        return o.al(sb.toString());
    }

    public static final int hashCodeCommon(TableInfo.ForeignKey foreignKey) {
        x.f(foreignKey, "<this>");
        return (((((((foreignKey.referenceTable.hashCode() * 31) + foreignKey.onDelete.hashCode()) * 31) + foreignKey.onUpdate.hashCode()) * 31) + foreignKey.columnNames.hashCode()) * 31) + foreignKey.referenceColumnNames.hashCode();
    }

    public static final int hashCodeCommon(TableInfo.Column column) {
        x.f(column, "<this>");
        return (((((column.name.hashCode() * 31) + column.affinity) * 31) + (true != column.notNull ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS)) * 31) + column.primaryKeyPosition;
    }

    public static final int hashCodeCommon(TableInfo tableInfo) {
        x.f(tableInfo, "<this>");
        return (((tableInfo.name.hashCode() * 31) + tableInfo.columns.hashCode()) * 31) + tableInfo.foreignKeys.hashCode();
    }

    public static final boolean equalsCommon(TableInfo.ForeignKey foreignKey, Object obj) {
        x.f(foreignKey, "<this>");
        if (foreignKey == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.ForeignKey)) {
            return false;
        }
        TableInfo.ForeignKey foreignKey2 = (TableInfo.ForeignKey) obj;
        if (x.n(foreignKey.referenceTable, foreignKey2.referenceTable) && x.n(foreignKey.onDelete, foreignKey2.onDelete) && x.n(foreignKey.onUpdate, foreignKey2.onUpdate) && x.n(foreignKey.columnNames, foreignKey2.columnNames)) {
            return x.n(foreignKey.referenceColumnNames, foreignKey2.referenceColumnNames);
        }
        return false;
    }

    public static final String toStringCommon(TableInfo.ForeignKey foreignKey) {
        x.f(foreignKey, "<this>");
        return o.ab(o.al("\n            |ForeignKey {\n            |   referenceTable = '" + foreignKey.referenceTable + "',\n            |   onDelete = '" + foreignKey.onDelete + "',\n            |   onUpdate = '" + foreignKey.onUpdate + "',\n            |   columnNames = {" + joinToStringMiddleWithIndent(i.ak(foreignKey.columnNames)) + "\n            |   referenceColumnNames = {" + joinToStringEndWithIndent(i.ak(foreignKey.referenceColumnNames)) + "\n            |}\n        "));
    }

    public static final boolean equalsCommon(TableInfo.Index index, Object obj) {
        x.f(index, "<this>");
        if (index == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Index)) {
            return false;
        }
        TableInfo.Index index2 = (TableInfo.Index) obj;
        if (index.unique != index2.unique || !x.n(index.columns, index2.columns) || !x.n(index.orders, index2.orders)) {
            return false;
        }
        if (o.ah(index.name, "index_")) {
            return o.ah(index2.name, "index_");
        }
        return x.n(index.name, index2.name);
    }

    public static final boolean equalsCommon(TableInfo tableInfo, Object obj) {
        Set<TableInfo.Index> set;
        x.f(tableInfo, "<this>");
        if (tableInfo == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo2 = (TableInfo) obj;
        if (!x.n(tableInfo.name, tableInfo2.name) || !x.n(tableInfo.columns, tableInfo2.columns) || !x.n(tableInfo.foreignKeys, tableInfo2.foreignKeys)) {
            return false;
        }
        Set<TableInfo.Index> set2 = tableInfo.indices;
        if (set2 == null || (set = tableInfo2.indices) == null) {
            return true;
        }
        return x.n(set2, set);
    }

    public static final String toStringCommon(TableInfo.Index index) {
        x.f(index, "<this>");
        return o.ab(o.al("\n            |Index {\n            |   name = '" + index.name + "',\n            |   unique = '" + index.unique + "',\n            |   columns = {" + joinToStringMiddleWithIndent(index.columns) + "\n            |   orders = {" + joinToStringEndWithIndent(index.orders) + "\n            |}\n        "));
    }

    public static final String toStringCommon(TableInfo.Column column) {
        x.f(column, "<this>");
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(column.name);
        sb.append("',\n            |   type = '");
        sb.append(column.type);
        sb.append("',\n            |   affinity = '");
        sb.append(column.affinity);
        sb.append("',\n            |   notNull = '");
        sb.append(column.notNull);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(column.primaryKeyPosition);
        sb.append("',\n            |   defaultValue = '");
        String str = column.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return o.ab(o.al(sb.toString()));
    }
}
