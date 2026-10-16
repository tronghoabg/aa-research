package androidx.room.util;

import androidx.autofill.HintConstants;
import androidx.sqlite.SQLiteStatement;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtil_androidKt {
    public static final int columnIndexOf(SQLiteStatement sQLiteStatement, String str) {
        x.f(sQLiteStatement, "<this>");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        int iColumnIndexOfCommon = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, str);
        if (iColumnIndexOfCommon >= 0) {
            return iColumnIndexOfCommon;
        }
        int iColumnIndexOfCommon2 = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, "`" + str + '`');
        if (iColumnIndexOfCommon2 >= 0) {
            return iColumnIndexOfCommon2;
        }
        return -1;
    }

    private static final int findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(SQLiteStatement sQLiteStatement, String str) {
        return -1;
    }
}
