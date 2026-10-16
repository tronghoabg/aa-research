package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.core.os.EnvironmentCompat;
import h.a.c;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import h.n.o;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CursorUtil {
    public static final Cursor copyAndClose(Cursor cursor) throws IOException {
        x.f(cursor, "c");
        Cursor cursor2 = cursor;
        try {
            Cursor cursor3 = cursor2;
            MatrixCursor matrixCursor = new MatrixCursor(cursor3.getColumnNames(), cursor3.getCount());
            while (cursor3.moveToNext()) {
                Object[] objArr = new Object[cursor3.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i2 = 0; i2 < columnCount; i2++) {
                    int type = cursor3.getType(i2);
                    if (type == 0) {
                        objArr[i2] = null;
                    } else if (type == 1) {
                        objArr[i2] = Long.valueOf(cursor3.getLong(i2));
                    } else if (type == 2) {
                        objArr[i2] = Double.valueOf(cursor3.getDouble(i2));
                    } else if (type == 3) {
                        objArr[i2] = cursor3.getString(i2);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i2] = cursor3.getBlob(i2);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            i.aW(cursor2, null);
            return matrixCursor;
        } finally {
        }
    }

    public static final int findColumnIndexBySuffix(String[] strArr, String str) {
        x.f(strArr, "columnNames");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        String str2 = "." + str;
        String str3 = "." + str + '`';
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str4 = strArr[i2];
            int i4 = i3 + 1;
            if (str4.length() >= str.length() + 2 && (o.l(str4, str2, false) || (str4.charAt(0) == '`' && o.l(str4, str3, false)))) {
                return i3;
            }
            i2++;
            i3 = i4;
        }
        return -1;
    }

    public static final int getColumnIndex(Cursor cursor, String str) {
        x.f(cursor, "c");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int getColumnIndexOrThrow(Cursor cursor, String str) {
        String strAE;
        x.f(cursor, "c");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        int columnIndex = getColumnIndex(cursor, str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            x.e(columnNames, "getColumnNames(...)");
            strAE = c.aE(columnNames, null, null, null, null, 63);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            strAE = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strAE);
    }

    public static final <R> R useCursor(Cursor cursor, l<? super Cursor, ? extends R> lVar) throws IOException {
        x.f(cursor, "<this>");
        x.f(lVar, "block");
        Cursor cursor2 = cursor;
        try {
            R rInvoke = lVar.invoke(cursor2);
            i.aW(cursor2, null);
            return rInvoke;
        } finally {
        }
    }

    public static final Cursor wrapMappedColumns(Cursor cursor, final String[] strArr, final int[] iArr) {
        x.f(cursor, "cursor");
        x.f(strArr, "columnNames");
        x.f(iArr, "mapping");
        if (strArr.length == iArr.length) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil.wrapMappedColumns.2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(String str) {
                    x.f(str, "columnName");
                    String[] strArr2 = strArr;
                    int length = strArr2.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int i4 = i3 + 1;
                        if (o.m(strArr2[i2], str, true)) {
                            return iArr[i3];
                        }
                        i2++;
                        i3 = i4;
                    }
                    return super.getColumnIndex(str);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        return -1;
    }
}
