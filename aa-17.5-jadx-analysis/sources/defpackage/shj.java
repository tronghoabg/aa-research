package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class shj extends rhs {
    public static final /* synthetic */ int a = 0;
    private static final ypf b = ols.R("CAR.SETTING");

    /* JADX WARN: Illegal instructions before constructor call */
    public shj(Context context) {
        int i = true != a.O() ? 11 : 13;
        super(context, i);
        b.f().ai(8975).w("Using GMSCore DB version: %d", i);
    }

    private static final void a(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "(id INTEGER PRIMARY KEY, manufacturer TEXT, model TEXT, modelyear TEXT, vehicleid TEXT, vehicleidclient TEXT, headUnitProtocolMajorVersionNumber INTEGER, headUnitProtocolMinorVersionNumber INTEGER, bluetoothConnectionAllowed INTEGER, connectiontime INTEGER, nickname TEXT,bluetoothaddress TEXT,wifissid TEXT,wifibssid TEXT,wifipassword TEXT,wifisecurity INTEGER, wifiProjectionProtocolOnTcp INTEGER DEFAULT 0, wifiProjectionProtocolIpAddress TEXT DEFAULT '', wifiProjectionProtocolTcpPort INTEGER DEFAULT -1" + (true != a.O() ? ")" : ", headUnitMake TEXT, headUnitModel TEXT, headUnitSoftwareBuild TEXT, headUnitSoftwareVersion TEXT, vehicleType INTEGER DEFAULT 0)"));
    }

    @Override // defpackage.rhs
    protected final void g(SQLiteDatabase sQLiteDatabase) throws SQLException {
        a(sQLiteDatabase, "allowedcars");
        a(sQLiteDatabase, "rejectedcars");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @ResultIgnorabilityUnspecified
    public final SQLiteDatabase getReadableDatabase() {
        for (int i = 1; i < 3; i++) {
            try {
                return super.getReadableDatabase();
            } catch (SQLiteException unused) {
                super.getWritableDatabase().close();
            }
        }
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b.h().ai(8976).B("Downgrading database %d -> %d", i, i2);
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type IN ('table','view') AND name NOT LIKE 'sqlite_%'  UNION ALL  SELECT name FROM sqlite_temp_master  WHERE type IN ('table','view')  ORDER BY 1 ", null);
        if (cursorRawQuery != null) {
            while (cursorRawQuery.moveToNext()) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + cursorRawQuery.getString(0));
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            g(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        b.f().ai(8977).B("Upgrading database %d -> %d", i, i2);
        if (i < 4) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS allowedcars");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS rejectedcars");
            g(sQLiteDatabase);
            return;
        }
        if (i == 4) {
            i = 6;
        }
        if (i == 5) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS allowedcars");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS rejectedcars");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS vehicleid");
            g(sQLiteDatabase);
            return;
        }
        if (i == 6) {
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN  vehicleidclient TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN  bluetoothConnectionAllowed INTEGER DEFAULT 0");
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM rejectedcars", null);
            try {
                int columnIndex = cursorRawQuery.getColumnIndex("id");
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("vehicleidclient", Long.toHexString(new SecureRandom().nextLong()));
                        sQLiteDatabase.update("rejectedcars", contentValues, "id = ?", new String[]{String.valueOf(cursorRawQuery.getLong(columnIndex))});
                    } while (cursorRawQuery.moveToNext());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                i = 7;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (i == 7) {
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN connectiontime INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN connectiontime INTEGER DEFAULT 0");
            i = 8;
        }
        if (i == 8) {
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN nickname TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN nickname TEXT");
            i = 9;
        }
        if (i == 9) {
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN bluetoothaddress TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifissid TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifibssid TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifipassword TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifisecurity INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN bluetoothaddress TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifissid TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifibssid TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifisecurity INTEGER DEFAULT 0");
            i = 10;
        }
        if (i == 10) {
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifiProjectionProtocolOnTcp INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifiProjectionProtocolIpAddress TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifiProjectionProtocolTcpPort INTEGER DEFAULT -1");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifiProjectionProtocolOnTcp INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifiProjectionProtocolIpAddress TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifiProjectionProtocolTcpPort INTEGER DEFAULT -1");
            i = 11;
        }
        if (a.O()) {
            if (i == 11) {
                sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN headUnitMake TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN headUnitModel TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN headUnitSoftwareBuild TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN headUnitSoftwareVersion TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN headUnitMake TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN headUnitModel TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN headUnitSoftwareBuild TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN headUnitSoftwareVersion TEXT");
            } else if (i != 12) {
                return;
            }
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN vehicleType INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN vehicleType INTEGER DEFAULT 0");
        }
    }
}
