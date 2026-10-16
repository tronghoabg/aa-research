package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fbz implements defpackage.fbs {
    public static final java.lang.String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final java.lang.String[] b = new java.lang.String[0];
    public static final defpackage.afar c = defpackage.afga.cB(2, new defpackage.euv(6));
    public static final defpackage.afar d = defpackage.afga.cB(2, new defpackage.euv(7));
    public final android.database.sqlite.SQLiteDatabase e;

    public fbz(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    @Override // defpackage.fbs
    public final java.lang.String a() {
        return this.e.getPath();
    }

    @Override // defpackage.fbs
    public final void b() {
        this.e.beginTransaction();
    }

    @Override // defpackage.fbs
    public final void c() {
        this.e.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.e.close();
    }

    @Override // defpackage.fbs
    public final void d() {
        this.e.endTransaction();
    }

    @Override // defpackage.fbs
    public final void e(java.lang.String str) throws android.database.SQLException {
        this.e.execSQL(str);
    }

    @Override // defpackage.fbs
    public final void f() {
        this.e.setTransactionSuccessful();
    }

    @Override // defpackage.fbs
    public final boolean g() {
        return this.e.inTransaction();
    }

    @Override // defpackage.fbs
    public final boolean h() {
        return this.e.isOpen();
    }

    @Override // defpackage.fbs
    public final defpackage.fcg i(java.lang.String str) {
        android.database.sqlite.SQLiteStatement sQLiteStatementCompileStatement = this.e.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new defpackage.fcg(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.fbs
    public final void j(java.lang.Object[] objArr) throws android.database.SQLException {
        this.e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
