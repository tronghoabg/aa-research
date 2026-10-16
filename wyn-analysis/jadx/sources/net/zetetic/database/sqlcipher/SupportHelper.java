package net.zetetic.database.sqlcipher;

import java.io.IOException;
import o3.C3645b;
import o3.InterfaceC3644a;
import o3.d;

/* loaded from: classes5.dex */
public class SupportHelper implements d {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteOpenHelper f41170a;

    public SupportHelper(C3645b c3645b, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z2) {
        this(c3645b, bArr, sQLiteDatabaseHook, z2, 0);
    }

    @Override // o3.d
    public final InterfaceC3644a I() {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteOpenHelper sQLiteOpenHelper = this.f41170a;
        synchronized (sQLiteOpenHelper) {
            sQLiteDatabaseA = sQLiteOpenHelper.a(true);
        }
        return sQLiteDatabaseA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41170a.close();
    }

    @Override // o3.d
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        this.f41170a.setWriteAheadLoggingEnabled(z2);
    }

    public SupportHelper(final C3645b c3645b, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z2, int i5) {
        this.f41170a = new SQLiteOpenHelper(c3645b.f41341a, c3645b.f41342b, bArr, c3645b.f41343c.f8379b, i5, sQLiteDatabaseHook, z2) { // from class: net.zetetic.database.sqlcipher.SupportHelper.1
            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void b(SQLiteDatabase sQLiteDatabase) {
                c3645b.f41343c.i(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void d(SQLiteDatabase sQLiteDatabase) throws IOException {
                c3645b.f41343c.j(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void h(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                c3645b.f41343c.k(sQLiteDatabase, i10, i11);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void i(SQLiteDatabase sQLiteDatabase) throws IOException {
                c3645b.f41343c.l(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void o(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                c3645b.f41343c.m(sQLiteDatabase, i10, i11);
            }
        };
    }
}
