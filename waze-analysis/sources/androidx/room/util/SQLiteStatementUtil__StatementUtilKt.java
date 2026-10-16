package androidx.room.util;

import androidx.autofill.HintConstants;
import androidx.sqlite.SQLiteStatement;
import h.a.i;
import h.g.b.x;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtilKt {
    public static final int columnIndexOfCommon(SQLiteStatement sQLiteStatement, String str) {
        x.f(sQLiteStatement, "<this>");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        if (sQLiteStatement instanceof MappedColumnsSQLiteStatementWrapper) {
            return ((MappedColumnsSQLiteStatementWrapper) sQLiteStatement).getColumnIndex(str);
        }
        int columnCount = sQLiteStatement.getColumnCount();
        for (int i2 = 0; i2 < columnCount; i2++) {
            if (x.n(str, sQLiteStatement.getColumnName(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public static final int getColumnIndex(SQLiteStatement sQLiteStatement, String str) {
        x.f(sQLiteStatement, "stmt");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return SQLiteStatementUtil.columnIndexOf(sQLiteStatement, str);
    }

    public static final int getColumnIndexOrThrow(SQLiteStatement sQLiteStatement, String str) throws IOException {
        x.f(sQLiteStatement, "stmt");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, str);
        if (iColumnIndexOf >= 0) {
            return iColumnIndexOf;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(sQLiteStatement.getColumnName(i2));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + i.aM(arrayList, null, null, null, 0, null, 63) + ']');
    }

    public static final SQLiteStatement wrapMappedColumns(SQLiteStatement sQLiteStatement, String[] strArr, int[] iArr) {
        x.f(sQLiteStatement, "statement");
        x.f(strArr, "columnNames");
        x.f(iArr, "mapping");
        return new MappedColumnsSQLiteStatementWrapper(sQLiteStatement, strArr, iArr);
    }
}
