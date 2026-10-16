package A7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class H extends Y {

    /* renamed from: c, reason: collision with root package name */
    public final C0269m f501c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f502d;

    public H(C0273n0 c0273n0) {
        super(c0273n0);
        this.f501c = new C0269m(this, ((C0273n0) this.f421a).f973a);
    }

    public static long k0(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j8 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j8;
        } finally {
        }
    }

    @Override // A7.Y
    public final boolean j0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0(int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.H.l0(int, byte[]):boolean");
    }

    public final void m0() {
        int iDelete;
        c0();
        try {
            SQLiteDatabase sQLiteDatabaseO0 = o0();
            if (sQLiteDatabaseO0 == null || (iDelete = sQLiteDatabaseO0.delete("messages", null, null)) <= 0) {
                return;
            }
            zzj().f612n.d("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e7) {
            zzj().f605f.d("Error resetting local analytics data. error", e7);
        }
    }

    public final boolean n0() {
        c0();
        if (!this.f502d && ((C0273n0) this.f421a).f973a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i5 = 5;
            for (int i10 = 0; i10 < 5; i10++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseO0 = o0();
                            if (sQLiteDatabaseO0 != null) {
                                sQLiteDatabaseO0.beginTransaction();
                                sQLiteDatabaseO0.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseO0.setTransactionSuccessful();
                                sQLiteDatabaseO0.endTransaction();
                                sQLiteDatabaseO0.close();
                                return true;
                            }
                            this.f502d = true;
                            if (sQLiteDatabaseO0 != null) {
                                sQLiteDatabaseO0.close();
                            }
                        } catch (SQLiteException e7) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            zzj().f605f.d("Error deleting app launch break from local database", e7);
                            this.f502d = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i5);
                        i5 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e10) {
                    zzj().f605f.d("Error deleting app launch break from local database", e10);
                    this.f502d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            zzj().f608i.c("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    public final SQLiteDatabase o0() {
        if (this.f502d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f501c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f502d = true;
        return null;
    }
}
