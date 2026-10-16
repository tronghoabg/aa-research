package r9;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.InvalidProtocolBufferException;
import w9.InterfaceC4388g;

/* loaded from: classes4.dex */
public final /* synthetic */ class M implements InterfaceC4388g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f44587b;

    public /* synthetic */ M(N n10, int i5) {
        this.f44586a = i5;
        this.f44587b = n10;
    }

    @Override // w9.InterfaceC4388g
    public final void accept(Object obj) throws SQLException {
        N n10 = this.f44587b;
        int i5 = this.f44586a;
        Cursor cursor = (Cursor) obj;
        n10.getClass();
        switch (i5) {
            case 0:
                int i10 = cursor.getInt(0);
                try {
                    u9.h hVar = (u9.h) u9.j.s(cursor.getBlob(1)).toBuilder();
                    hVar.a();
                    n10.f44588a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((u9.j) hVar.build()).toByteArray(), Integer.valueOf(i10)});
                    return;
                } catch (InvalidProtocolBufferException unused) {
                    A6.c.s("Failed to decode Query data for target %s", Integer.valueOf(i10));
                    throw null;
                }
            case 1:
                int i11 = cursor.getInt(0);
                try {
                    n10.f44588a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{n10.f44589b.u(u9.j.s(cursor.getBlob(1))).f44596a.b(), Integer.valueOf(i11)});
                    return;
                } catch (InvalidProtocolBufferException unused2) {
                    A6.c.s("Failed to decode Query data for target %s", Integer.valueOf(i11));
                    throw null;
                }
            default:
                String string = cursor.getString(0);
                jb.c cVar = new jb.c(new Object[]{string, Long.valueOf(cursor.getLong(1))}, 2);
                SQLiteDatabase sQLiteDatabase = n10.f44588a;
                Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cVar, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?", null, null);
                while (cursorRawQueryWithFactory.moveToNext()) {
                    try {
                        int i12 = cursorRawQueryWithFactory.getInt(0);
                        SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
                        sQLiteStatementCompileStatement.bindString(1, string);
                        sQLiteStatementCompileStatement.bindLong(2, i12);
                        A6.c.z(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", string, Integer.valueOf(i12));
                        sQLiteDatabase.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{string, Integer.valueOf(i12)});
                    } catch (Throwable th) {
                        if (cursorRawQueryWithFactory != null) {
                            try {
                                cursorRawQueryWithFactory.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                cursorRawQueryWithFactory.close();
                return;
        }
    }
}
