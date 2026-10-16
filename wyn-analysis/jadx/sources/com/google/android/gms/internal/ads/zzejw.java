package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes3.dex */
public final class zzejw {
    public static void zza(SQLiteDatabase sQLiteDatabase) {
        zzi(sQLiteDatabase, "failed_requests", 0);
        zzi(sQLiteDatabase, "total_requests", 0);
        zzi(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void zzb(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        zzh(sQLiteDatabase, "failed_requests", 0);
        zzh(sQLiteDatabase, "total_requests", 0);
        zzh(sQLiteDatabase, "completed_requests", 0);
    }

    public static int zzc(SQLiteDatabase sQLiteDatabase, int i5) {
        int i10 = 0;
        if (i5 == 2) {
            return 0;
        }
        Cursor cursorZzg = zzg(sQLiteDatabase, i5);
        if (cursorZzg.getCount() > 0) {
            cursorZzg.moveToNext();
            i10 = cursorZzg.getInt(cursorZzg.getColumnIndexOrThrow(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
        }
        cursorZzg.close();
        return i10;
    }

    public static long zzd(SQLiteDatabase sQLiteDatabase, int i5) {
        long j8;
        Cursor cursorZzg = zzg(sQLiteDatabase, 2);
        if (cursorZzg.getCount() > 0) {
            cursorZzg.moveToNext();
            j8 = cursorZzg.getLong(cursorZzg.getColumnIndexOrThrow(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
        } else {
            j8 = 0;
        }
        cursorZzg.close();
        return j8;
    }

    public static void zze(SQLiteDatabase sQLiteDatabase, long j8, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j8));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j8)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void zzf(SQLiteDatabase sQLiteDatabase, boolean z2, boolean z10) throws SQLException {
        if (!z10) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
            return;
        }
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (z2) {
            return;
        }
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
    }

    private static Cursor zzg(SQLiteDatabase sQLiteDatabase, int i5) {
        String[] strArr = {MimeTypesReaderMetKeys.MATCH_VALUE_ATTR};
        String[] strArr2 = new String[1];
        if (i5 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i5 == 1) {
            strArr2[0] = "total_requests";
        } else if (i5 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void zzh(SQLiteDatabase sQLiteDatabase, String str, int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    private static void zzi(SQLiteDatabase sQLiteDatabase, String str, int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }
}
