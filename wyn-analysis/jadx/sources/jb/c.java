package jb;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.List;
import p3.C3760a;
import r9.K;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38703b;

    public /* synthetic */ c(Object obj, int i5) {
        this.f38702a = i5;
        this.f38703b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f38702a) {
            case 0:
                List list = ((m) this.f38703b).f38752b;
                if (list != null) {
                    int size = list.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object objA = m.a(list.get(i5));
                        int i10 = i5 + 1;
                        if (objA == null) {
                            sQLiteQuery.bindNull(i10);
                        } else if (objA instanceof byte[]) {
                            sQLiteQuery.bindBlob(i10, (byte[]) objA);
                        } else if (objA instanceof Double) {
                            sQLiteQuery.bindDouble(i10, ((Double) objA).doubleValue());
                        } else if (objA instanceof Integer) {
                            sQLiteQuery.bindLong(i10, ((Integer) objA).intValue());
                        } else if (objA instanceof Long) {
                            sQLiteQuery.bindLong(i10, ((Long) objA).longValue());
                        } else if (objA instanceof String) {
                            sQLiteQuery.bindString(i10, (String) objA);
                        } else {
                            if (!(objA instanceof Boolean)) {
                                throw new IllegalArgumentException("Could not bind " + objA + " from index " + i5 + ": Supported types are null, byte[], double, long, boolean and String");
                            }
                            sQLiteQuery.bindLong(i10, ((Boolean) objA).booleanValue() ? 1L : 0L);
                        }
                        i5 = i10;
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 1:
                return (Cursor) ((C3760a) this.f38703b).invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            default:
                K.c0(sQLiteQuery, (Object[]) this.f38703b);
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
