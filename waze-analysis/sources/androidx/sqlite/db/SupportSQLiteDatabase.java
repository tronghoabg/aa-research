package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import h.g.b.x;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface SupportSQLiteDatabase extends Closeable {

    /* compiled from: WazeSource */
    /* renamed from: androidx.sqlite.db.SupportSQLiteDatabase$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$beginTransactionWithListenerReadOnly(SupportSQLiteDatabase supportSQLiteDatabase, SQLiteTransactionListener sQLiteTransactionListener) {
            x.f(sQLiteTransactionListener, "transactionListener");
            supportSQLiteDatabase.beginTransactionWithListener(sQLiteTransactionListener);
        }

        public static void $default$execPerConnectionSQL(SupportSQLiteDatabase supportSQLiteDatabase, String str, Object[] objArr) {
            x.f(str, "sql");
            throw new UnsupportedOperationException();
        }

        public static boolean $default$isExecPerConnectionSQLSupported(SupportSQLiteDatabase supportSQLiteDatabase) {
            return false;
        }
    }

    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionReadOnly();

    void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerReadOnly(SQLiteTransactionListener sQLiteTransactionListener);

    SupportSQLiteStatement compileStatement(String str);

    int delete(String str, String str2, Object[] objArr);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    void execPerConnectionSQL(String str, Object[] objArr);

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(String str, int i2, ContentValues contentValues);

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    boolean isExecPerConnectionSQLSupported();

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i2);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    Cursor query(String str);

    Cursor query(String str, Object[] objArr);

    void setForeignKeyConstraintsEnabled(boolean z);

    void setLocale(Locale locale);

    void setMaxSqlCacheSize(int i2);

    long setMaximumSize(long j2);

    void setPageSize(long j2);

    void setTransactionSuccessful();

    void setVersion(int i2);

    int update(String str, int i2, ContentValues contentValues, String str2, Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j2);
}
