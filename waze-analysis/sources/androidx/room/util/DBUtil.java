package androidx.room.util;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.PooledConnection;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import h.c.e;
import h.c.j;
import h.g.a.l;
import h.g.a.p;
import java.io.File;

/* loaded from: classes4.dex */
public final class DBUtil {
    public static final CancellationSignal createCancellationSignal() {
        return DBUtil__DBUtil_androidKt.createCancellationSignal();
    }

    public static final void dropFtsSyncTriggers(SQLiteConnection sQLiteConnection) {
        DBUtil__DBUtilKt.dropFtsSyncTriggers(sQLiteConnection);
    }

    public static final void foreignKeyCheck(SQLiteConnection sQLiteConnection, String str) {
        DBUtil__DBUtilKt.foreignKeyCheck(sQLiteConnection, str);
    }

    public static final Object getCoroutineContext(RoomDatabase roomDatabase, boolean z, e<? super j> eVar) {
        return DBUtil__DBUtil_androidKt.getCoroutineContext(roomDatabase, z, eVar);
    }

    public static final <R> Object internalPerform(RoomDatabase roomDatabase, boolean z, boolean z2, p<? super PooledConnection, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return DBUtil__DBUtilKt.internalPerform(roomDatabase, z, z2, pVar, eVar);
    }

    public static final <R> R performBlocking(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ? extends R> lVar) {
        return (R) DBUtil__DBUtil_androidKt.performBlocking(roomDatabase, z, z2, lVar);
    }

    public static final <R> Object performInTransactionSuspending(RoomDatabase roomDatabase, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return DBUtil__DBUtil_androidKt.performInTransactionSuspending(roomDatabase, lVar, eVar);
    }

    public static final <R> Object performSuspending(RoomDatabase roomDatabase, boolean z, boolean z2, l<? super SQLiteConnection, ? extends R> lVar, e<? super R> eVar) {
        return DBUtil__DBUtil_androidKt.performSuspending(roomDatabase, z, z2, lVar, eVar);
    }

    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z) {
        return DBUtil__DBUtil_androidKt.query(roomDatabase, supportSQLiteQuery, z);
    }

    public static final int readVersion(File file) {
        return DBUtil__DBUtil_androidKt.readVersion(file);
    }

    public static final SQLiteConnection toSQLiteConnection(SupportSQLiteDatabase supportSQLiteDatabase) {
        return DBUtil__DBUtil_androidKt.toSQLiteConnection(supportSQLiteDatabase);
    }

    public static final void dropFtsSyncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) {
        DBUtil__DBUtil_androidKt.dropFtsSyncTriggers(supportSQLiteDatabase);
    }

    public static final void foreignKeyCheck(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        DBUtil__DBUtil_androidKt.foreignKeyCheck(supportSQLiteDatabase, str);
    }

    public static final Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z, CancellationSignal cancellationSignal) {
        return DBUtil__DBUtil_androidKt.query(roomDatabase, supportSQLiteQuery, z, cancellationSignal);
    }
}
