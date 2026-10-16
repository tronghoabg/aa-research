package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class fbs implements fbl {
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] b = new String[0];
    public static final aezr c = woy.dH(2, new eup(6));
    public static final aezr d = woy.dH(2, new eup(7));
    public final SQLiteDatabase e;

    public fbs(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    @Override // defpackage.fbl
    public final String a() {
        return this.e.getPath();
    }

    @Override // defpackage.fbl
    public final void b() {
        this.e.beginTransaction();
    }

    @Override // defpackage.fbl
    public final void c() {
        this.e.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // defpackage.fbl
    public final void d() {
        this.e.endTransaction();
    }

    @Override // defpackage.fbl
    public final void e(String str) throws SQLException {
        this.e.execSQL(str);
    }

    @Override // defpackage.fbl
    public final void f() {
        this.e.setTransactionSuccessful();
    }

    @Override // defpackage.fbl
    public final boolean g() {
        return this.e.inTransaction();
    }

    @Override // defpackage.fbl
    public final boolean h() {
        return this.e.isOpen();
    }

    @Override // defpackage.fbl
    public final fbz i(String str) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = this.e.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new fbz(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.fbl
    public final void j(Object[] objArr) throws SQLException {
        this.e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
