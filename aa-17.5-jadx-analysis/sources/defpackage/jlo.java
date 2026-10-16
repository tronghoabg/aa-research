package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Instant;
import j$.util.Objects;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jlo extends rhs {
    public static final yph a = yph.c("GH.CarSvcDataStorage");
    private final rpz b;

    public jlo(Context context) {
        super(context, true != x() ? 11 : 13);
        this.b = rpz.a(context);
        ((ype) ((ype) a.f()).ai((char) 2324)).w("Using DB version: %d", 13);
    }

    public static final void n(CarInfoInternal carInfoInternal, ContentValues contentValues) {
        contentValues.put("wifissid", carInfoInternal.g);
        contentValues.put("wifibssid", carInfoInternal.h);
        contentValues.put("wifipassword", carInfoInternal.i);
        contentValues.put("wifisecurity", Integer.valueOf(carInfoInternal.j));
    }

    private static CarInfoInternal p(Cursor cursor, String str) {
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        if (x()) {
            int columnIndex = cursor.getColumnIndex("headUnitMake");
            String string = columnIndex != -1 ? cursor.getString(columnIndex) : null;
            int columnIndex2 = cursor.getColumnIndex("headUnitModel");
            String string2 = columnIndex2 != -1 ? cursor.getString(columnIndex2) : null;
            int columnIndex3 = cursor.getColumnIndex("headUnitSoftwareBuild");
            String string3 = columnIndex3 != -1 ? cursor.getString(columnIndex3) : null;
            int columnIndex4 = cursor.getColumnIndex("headUnitSoftwareVersion");
            String string4 = columnIndex4 != -1 ? cursor.getString(columnIndex4) : null;
            int columnIndex5 = cursor.getColumnIndex("vehicleType");
            if (columnIndex5 != -1) {
                str2 = string;
                str5 = string4;
                i = cursor.getInt(columnIndex5);
            } else {
                str2 = string;
                i = 0;
                str5 = string4;
            }
            str3 = string2;
            str4 = string3;
        } else {
            i = 0;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        return new CarInfoInternal(new CarInfo(cursor.getString(cursor.getColumnIndexOrThrow("manufacturer")), cursor.getString(cursor.getColumnIndexOrThrow("model")), cursor.getString(cursor.getColumnIndexOrThrow("modelyear")), cursor.getString(cursor.getColumnIndexOrThrow("vehicleidclient")), cursor.getInt(cursor.getColumnIndexOrThrow("headUnitProtocolMajorVersionNumber")), cursor.getInt(cursor.getColumnIndexOrThrow("headUnitProtocolMinorVersionNumber")), false, 0, str2, str3, str4, str5, false, false, false, cursor.getString(cursor.getColumnIndexOrThrow("nickname")), null, i), null, cursor.getInt(cursor.getColumnIndexOrThrow("bluetoothConnectionAllowed")) != 0, cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getLong(cursor.getColumnIndexOrThrow("connectiontime")), cursor.getString(cursor.getColumnIndexOrThrow("bluetoothaddress")), cursor.getString(cursor.getColumnIndexOrThrow("wifissid")), cursor.getString(cursor.getColumnIndexOrThrow("wifibssid")), cursor.getString(cursor.getColumnIndexOrThrow("wifipassword")), cursor.getInt(cursor.getColumnIndexOrThrow("wifisecurity")), null, 0, 0, 0, true, "allowedcars".equals(str), -1L, false, "", -1, cursor.getString(cursor.getColumnIndexOrThrow("vehicleid")));
    }

    private final CarInfoInternal q(String str, String str2, String[] strArr) {
        CarInfoInternal carInfoInternalP = null;
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, strArr, null);
            try {
                if (cursorRawQuery.moveToFirst()) {
                    carInfoInternalP = p(cursorRawQuery, str);
                }
                return carInfoInternalP;
            } finally {
                cursorRawQuery.close();
            }
        } catch (SQLiteException e) {
            ((ype) ((ype) a.l().p(e)).ai((char) 2344)).u("Got exception from db: ");
            return null;
        }
    }

    private final void r(yzy yzyVar) {
        abnp abnpVarN = yxb.a.n();
        abnp abnpVarN2 = zab.a.n();
        abnpVarN2.t();
        zab zabVar = (zab) abnpVarN2.b;
        zabVar.b |= 1;
        zabVar.d = 4600;
        int iA = yzyVar.a();
        abnpVarN2.t();
        zab zabVar2 = (zab) abnpVarN2.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        zab zabVar3 = (zab) abnpVarN2.q();
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        zabVar3.getClass();
        yxbVar.o = zabVar3;
        yxbVar.b |= 4096;
        this.b.d(yxc.UI, (yxb) abnpVarN.q());
    }

    private final void s(String str) {
        try {
            getWritableDatabase().delete(str, null, null);
        } catch (SQLiteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2339)).u("Error removing all cars from table");
        }
    }

    private final void t(CarInfoInternal carInfoInternal, String str) {
        if (carInfoInternal.u == null) {
            ((ype) ((ype) a.h()).ai((char) 2341)).u("vehicleId is null!");
            return;
        }
        try {
            getWritableDatabase().delete(str, "vehicleid = ? AND manufacturer = ?", new String[]{carInfoInternal.u, carInfoInternal.a.a});
        } catch (Exception e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2340)).u("Error removing car from table");
        }
    }

    private final void u(String str, String str2, String str3) {
        if (str == null) {
            ((ype) ((ype) a.h()).ai((char) 2343)).u("vehicleId for client is null!");
            return;
        }
        try {
            getWritableDatabase().delete(str3, "vehicleidclient = ? AND manufacturer = ?", new String[]{str, str2});
        } catch (SQLiteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2342)).u("Error removing car from table");
        }
    }

    private final void v(String str, String str2, String str3, String str4) {
        if (str == null) {
            ((ype) ((ype) a.h()).ai((char) 2346)).u("vehicleId for client is null!");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("nickname", str3);
        k(str, str2, str4, contentValues);
    }

    private final boolean w(CarInfoInternal carInfoInternal, String str) {
        CarInfo carInfo = carInfoInternal.a;
        if (TextUtils.isEmpty(carInfo.d)) {
            carInfo.d = Long.toHexString(new SecureRandom().nextLong());
        }
        if (rlc.a(rlc.b)) {
            ((ype) a.l().ai(2329)).M("Saving vehicle ID %s for internal ID %s", carInfo.d, carInfoInternal.u);
        }
        carInfoInternal.e = Instant.now().toEpochMilli();
        ContentValues contentValues = new ContentValues();
        contentValues.put("manufacturer", carInfo.a);
        contentValues.put("model", carInfo.b);
        contentValues.put("modelyear", carInfo.c);
        contentValues.put("vehicleid", carInfoInternal.u);
        contentValues.put("vehicleidclient", carInfo.d);
        contentValues.put("headUnitProtocolMajorVersionNumber", Integer.valueOf(carInfo.e));
        contentValues.put("headUnitProtocolMinorVersionNumber", Integer.valueOf(carInfo.f));
        contentValues.put("bluetoothConnectionAllowed", Integer.valueOf(carInfoInternal.c ? 1 : 0));
        contentValues.put("nickname", carInfo.p);
        contentValues.put("connectiontime", Long.valueOf(carInfoInternal.e));
        contentValues.put("bluetoothaddress", carInfoInternal.f);
        contentValues.put("wifiProjectionProtocolOnTcp", Integer.valueOf(carInfoInternal.r ? 1 : 0));
        contentValues.put("wifiProjectionProtocolIpAddress", carInfoInternal.s);
        contentValues.put("wifiProjectionProtocolTcpPort", Integer.valueOf(carInfoInternal.t));
        n(carInfoInternal, contentValues);
        if (x()) {
            contentValues.put("headUnitMake", carInfo.i);
            contentValues.put("headUnitModel", carInfo.j);
            contentValues.put("headUnitSoftwareBuild", carInfo.k);
            contentValues.put("headUnitSoftwareVersion", carInfo.l);
            contentValues.put("vehicleType", Integer.valueOf(carInfo.r));
        }
        try {
            long jInsert = getWritableDatabase().insert(str, null, contentValues);
            if (jInsert == -1) {
                ((ype) ((ype) a.h()).ai(2328)).y("adding car info to db table %s failed", str);
                return false;
            }
            carInfoInternal.d = jInsert;
            carInfoInternal.p = "allowedcars".equals(str);
            return true;
        } catch (SQLiteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2327)).u("Exception while inserting into database");
            return false;
        }
    }

    private static boolean x() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static final void y(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "(id INTEGER PRIMARY KEY, manufacturer TEXT, model TEXT, modelyear TEXT, vehicleid TEXT, vehicleidclient TEXT, headUnitProtocolMajorVersionNumber INTEGER, headUnitProtocolMinorVersionNumber INTEGER, bluetoothConnectionAllowed INTEGER, connectiontime INTEGER, nickname TEXT,bluetoothaddress TEXT,wifissid TEXT,wifibssid TEXT,wifipassword TEXT,wifisecurity INTEGER, wifiProjectionProtocolOnTcp INTEGER DEFAULT 0, wifiProjectionProtocolIpAddress TEXT DEFAULT '', wifiProjectionProtocolTcpPort INTEGER DEFAULT -1" + (true != x() ? ")" : ", headUnitMake TEXT, headUnitModel TEXT, headUnitSoftwareBuild TEXT, headUnitSoftwareVersion TEXT, vehicleType INTEGER DEFAULT 0)"));
    }

    private static final List z(String str, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(a.bq(str, "SELECT * FROM ", " ORDER BY connectiontime DESC"), null);
        try {
            if (cursorRawQuery.moveToFirst()) {
                do {
                    arrayList.add(p(cursorRawQuery, str));
                } while (cursorRawQuery.moveToNext());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    public final CarInfoInternal a(CarInfoInternal carInfoInternal, String str, boolean z) {
        if (carInfoInternal.u == null) {
            r(yzy.uc);
            ((ype) ((ype) a.h()).ai((char) 2335)).u("No hashed vehicle ID provided. Lookup not possible.");
            return null;
        }
        String strBq = a.bq(str, "SELECT * FROM ", " WHERE manufacturer = ?     AND model = ?     AND modelyear = ?     AND vehicleid = ?");
        CarInfo carInfo = carInfoInternal.a;
        CarInfoInternal carInfoInternalQ = q(str, strBq, new String[]{carInfo.a, carInfo.b, carInfo.c, carInfoInternal.u});
        if (carInfoInternalQ == null) {
            r(yzy.ub);
            ((ype) ((ype) a.h()).ai((char) 2334)).u("Vehicle not found!");
            return carInfoInternalQ;
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2332)).u("Vehicle found.");
        r(yzy.ua);
        if (z) {
            carInfoInternalQ.e = Instant.now().toEpochMilli();
            if (!aczv.a.gu().at() || BluetoothAdapter.checkBluetoothAddress(carInfoInternal.f)) {
                carInfoInternalQ.f = carInfoInternal.f;
            } else {
                ((ype) ((ype) yphVar.h()).ai(2333)).y("Do not update bluetooth address because the input (%s) is invalid.", carInfoInternal.f);
            }
            CarInfo carInfo2 = carInfoInternalQ.a;
            int i = carInfo.e;
            carInfo2.e = i;
            int i2 = carInfo.f;
            carInfo2.f = i2;
            if (x()) {
                carInfo2.k = carInfo.k;
                carInfo2.l = carInfo.l;
            }
            long j = carInfoInternalQ.d;
            long j2 = carInfoInternalQ.e;
            String str2 = carInfoInternalQ.f;
            String str3 = carInfo2.k;
            String str4 = carInfo2.l;
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("connectiontime", Long.valueOf(j2));
                contentValues.put("bluetoothaddress", str2);
                contentValues.put("headUnitProtocolMajorVersionNumber", Integer.valueOf(i));
                contentValues.put("headUnitProtocolMinorVersionNumber", Integer.valueOf(i2));
                if (x()) {
                    contentValues.put("headUnitSoftwareBuild", str3);
                    contentValues.put("headUnitSoftwareVersion", str4);
                }
                writableDatabase.update(str, contentValues, "id = ?", new String[]{String.valueOf(j)});
                return carInfoInternalQ;
            } catch (SQLiteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2349)).u("Error updating last connection timestamp, bluetooth address and head unit protocol version for car!");
            }
        }
        return carInfoInternalQ;
    }

    public final CarInfoInternal b(CarInfo carInfo, String str) {
        return q(str, a.bq(str, "SELECT * FROM ", " WHERE manufacturer = ?     AND model = ?     AND modelyear = ?     AND vehicleidclient = ?"), new String[]{carInfo.a, carInfo.b, carInfo.c, carInfo.d});
    }

    public final xxh c(String str, boolean z) {
        List<CarInfoInternal> listE = e();
        if (z) {
            listE.addAll(f());
        }
        for (CarInfoInternal carInfoInternal : listE) {
            if (Objects.equals(carInfoInternal.f, str)) {
                return xxh.h(carInfoInternal);
            }
        }
        return xvy.a;
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(e());
        arrayList.addAll(f());
        return arrayList;
    }

    public final List e() {
        return z("allowedcars", getReadableDatabase());
    }

    public final List f() {
        return z("rejectedcars", getReadableDatabase());
    }

    @Override // defpackage.rhs
    protected final void g(SQLiteDatabase sQLiteDatabase) throws SQLException {
        y(sQLiteDatabase, "allowedcars");
        y(sQLiteDatabase, "rejectedcars");
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

    public final void h() {
        s("allowedcars");
        s("rejectedcars");
    }

    public final void i(String str, String str2) {
        u(str, str2, "allowedcars");
        u(str, str2, "rejectedcars");
    }

    public final void j(String str, String str2, String str3) {
        v(str, str2, str3, "allowedcars");
        v(str, str2, str3, "rejectedcars");
    }

    public final void k(String str, String str2, String str3, ContentValues contentValues) {
        try {
            getWritableDatabase().update(str3, contentValues, "vehicleidclient = ? AND manufacturer = ?", new String[]{str, str2});
        } catch (Exception e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2345)).u("Error updating car info internal");
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean l(CarInfoInternal carInfoInternal) {
        if (carInfoInternal.u == null) {
            ((ype) ((ype) a.h()).ai((char) 2326)).u("No hashed vehicle ID provided. AddAllowedCar not possible.");
            return false;
        }
        if (a(carInfoInternal, "allowedcars", false) != null) {
            ((ype) a.l().ai((char) 2325)).y("addAllowedCar, already existing: %s", carInfoInternal);
            return true;
        }
        t(carInfoInternal, "rejectedcars");
        return w(carInfoInternal, "allowedcars");
    }

    @ResultIgnorabilityUnspecified
    public final boolean m(CarInfoInternal carInfoInternal) {
        if (carInfoInternal.u == null) {
            ((ype) ((ype) a.h()).ai((char) 2331)).u("No hashed vehicle ID provided. AddRejectedCar not possible.");
            return false;
        }
        if (a(carInfoInternal, "rejectedcars", false) != null) {
            ((ype) a.l().ai((char) 2330)).y("addRejectedCar, already existing: %s", carInfoInternal);
            return true;
        }
        t(carInfoInternal, "allowedcars");
        return w(carInfoInternal, "rejectedcars");
    }

    @ResultIgnorabilityUnspecified
    public final void o(CarInfoInternal carInfoInternal, boolean z) {
        boolean z2 = false;
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                cursorQuery = writableDatabase.query("allowedcars", new String[]{"bluetoothConnectionAllowed"}, "id = ?", new String[]{Long.toString(carInfoInternal.d)}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("bluetoothConnectionAllowed")) != z) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("bluetoothConnectionAllowed", Integer.valueOf(z ? 1 : 0));
                        writableDatabase.update("allowedcars", contentValues, "id = ?", new String[]{Long.toString(carInfoInternal.d)});
                    }
                    z2 = true;
                }
            } catch (SQLiteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai(2348)).u("Exception while updating database");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (z2) {
                carInfoInternal.c = z;
            }
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((ype) ((ype) a.h()).ai(2337)).B("Downgrading database %d -> %d", i, i2);
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
        ((ype) ((ype) a.f()).ai(2338)).B("Upgrading database %d -> %d", i, i2);
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
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifiProjectionProtocolIpAddress TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifiProjectionProtocolTcpPort INTEGER DEFAULT -1");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifiProjectionProtocolOnTcp INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifiProjectionProtocolIpAddress TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifiProjectionProtocolTcpPort INTEGER DEFAULT -1");
            i = 11;
        }
        if (x()) {
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
