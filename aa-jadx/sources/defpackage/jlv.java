package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jlv extends defpackage.rio {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CarSvcDataStorage");
    private final defpackage.rqt b;

    public jlv(android.content.Context context) {
        super(context, true != z() ? 11 : 13);
        this.b = defpackage.rqt.a(context);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 2325)).w("Using DB version: %d", 13);
    }

    private static final void A(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "(id INTEGER PRIMARY KEY, manufacturer TEXT, model TEXT, modelyear TEXT, vehicleid TEXT, vehicleidclient TEXT, headUnitProtocolMajorVersionNumber INTEGER, headUnitProtocolMinorVersionNumber INTEGER, bluetoothConnectionAllowed INTEGER, connectiontime INTEGER, nickname TEXT,bluetoothaddress TEXT,wifissid TEXT,wifibssid TEXT,wifipassword TEXT,wifisecurity INTEGER, wifiProjectionProtocolOnTcp INTEGER DEFAULT 0, wifiProjectionProtocolIpAddress TEXT DEFAULT '', wifiProjectionProtocolTcpPort INTEGER DEFAULT -1" + (true != z() ? ")" : ", headUnitMake TEXT, headUnitModel TEXT, headUnitSoftwareBuild TEXT, headUnitSoftwareVersion TEXT, vehicleType INTEGER DEFAULT 0)"));
    }

    private static final java.util.List B(java.lang.String str, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery(defpackage.a.bp(str, "SELECT * FROM ", " ORDER BY connectiontime DESC"), null);
        try {
            if (cursorRawQuery.moveToFirst()) {
                do {
                    arrayList.add(r(cursorRawQuery, str));
                } while (cursorRawQuery.moveToNext());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    public static final java.lang.String n() {
        return java.lang.Long.toHexString(new java.security.SecureRandom().nextLong());
    }

    public static final void o(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, android.content.ContentValues contentValues) {
        contentValues.put("bluetoothaddress", carInfoInternal.f);
    }

    public static final void p(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, android.content.ContentValues contentValues) {
        contentValues.put("wifissid", carInfoInternal.g);
        contentValues.put("wifibssid", carInfoInternal.h);
        contentValues.put("wifipassword", carInfoInternal.i);
        contentValues.put("wifisecurity", java.lang.Integer.valueOf(carInfoInternal.j));
    }

    private static com.google.android.gms.carsetup.CarInfoInternal r(android.database.Cursor cursor, java.lang.String str) {
        int i;
        java.lang.String string;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string2;
        if (z()) {
            int columnIndex = cursor.getColumnIndex("headUnitMake");
            string = columnIndex != -1 ? cursor.getString(columnIndex) : null;
            int columnIndex2 = cursor.getColumnIndex("headUnitModel");
            java.lang.String string3 = columnIndex2 != -1 ? cursor.getString(columnIndex2) : null;
            int columnIndex3 = cursor.getColumnIndex("headUnitSoftwareBuild");
            java.lang.String string4 = columnIndex3 != -1 ? cursor.getString(columnIndex3) : null;
            int columnIndex4 = cursor.getColumnIndex("headUnitSoftwareVersion");
            string2 = columnIndex4 != -1 ? cursor.getString(columnIndex4) : null;
            int columnIndex5 = cursor.getColumnIndex("vehicleType");
            i = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 0;
            str2 = string3;
            str3 = string4;
        } else {
            i = 0;
            string = null;
            str2 = null;
            str3 = null;
            string2 = null;
        }
        return new com.google.android.gms.carsetup.CarInfoInternal(new com.google.android.gms.car.CarInfo(cursor.getString(cursor.getColumnIndexOrThrow("manufacturer")), cursor.getString(cursor.getColumnIndexOrThrow("model")), cursor.getString(cursor.getColumnIndexOrThrow("modelyear")), cursor.getString(cursor.getColumnIndexOrThrow("vehicleidclient")), cursor.getInt(cursor.getColumnIndexOrThrow("headUnitProtocolMajorVersionNumber")), cursor.getInt(cursor.getColumnIndexOrThrow("headUnitProtocolMinorVersionNumber")), false, 0, string, str2, str3, string2, false, false, false, cursor.getString(cursor.getColumnIndexOrThrow("nickname")), null, i), null, cursor.getInt(cursor.getColumnIndexOrThrow("bluetoothConnectionAllowed")) != 0, cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getLong(cursor.getColumnIndexOrThrow("connectiontime")), cursor.getString(cursor.getColumnIndexOrThrow("bluetoothaddress")), cursor.getString(cursor.getColumnIndexOrThrow("wifissid")), cursor.getString(cursor.getColumnIndexOrThrow("wifibssid")), cursor.getString(cursor.getColumnIndexOrThrow("wifipassword")), cursor.getInt(cursor.getColumnIndexOrThrow("wifisecurity")), null, 0, 0, 0, true, "allowedcars".equals(str), -1L, false, "", -1, cursor.getString(cursor.getColumnIndexOrThrow("vehicleid")));
    }

    private final com.google.android.gms.carsetup.CarInfoInternal s(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternalR = null;
        try {
            android.database.Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, strArr, null);
            try {
                if (cursorRawQuery.moveToFirst()) {
                    carInfoInternalR = r(cursorRawQuery, str);
                }
                return carInfoInternalR;
            } finally {
                cursorRawQuery.close();
            }
        } catch (android.database.sqlite.SQLiteException e) {
            ((defpackage.yqj) ((defpackage.yqj) a.l().p(e)).ai((char) 2345)).u("Got exception from db: ");
            return null;
        }
    }

    private final void t(defpackage.zbd zbdVar) {
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        defpackage.abor aborVarN2 = defpackage.zbg.a.n();
        aborVarN2.t();
        defpackage.zbg zbgVar = (defpackage.zbg) aborVarN2.b;
        zbgVar.b |= 1;
        zbgVar.d = 4600;
        int iA = zbdVar.a();
        aborVarN2.t();
        defpackage.zbg zbgVar2 = (defpackage.zbg) aborVarN2.b;
        zbgVar2.b |= 2;
        zbgVar2.e = iA;
        defpackage.zbg zbgVar3 = (defpackage.zbg) aborVarN2.q();
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        zbgVar3.getClass();
        yygVar.o = zbgVar3;
        yygVar.b |= 4096;
        this.b.d(defpackage.yyh.UI, (defpackage.yyg) aborVarN.q());
    }

    private final void u(java.lang.String str) {
        try {
            getWritableDatabase().delete(str, null, null);
        } catch (android.database.sqlite.SQLiteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2340)).u("Error removing all cars from table");
        }
    }

    private final void v(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, java.lang.String str) {
        if (carInfoInternal.u == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2342)).u("vehicleId is null!");
            return;
        }
        try {
            getWritableDatabase().delete(str, "vehicleid = ? AND manufacturer = ?", new java.lang.String[]{carInfoInternal.u, carInfoInternal.a.a});
        } catch (java.lang.Exception e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2341)).u("Error removing car from table");
        }
    }

    private final void w(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2344)).u("vehicleId for client is null!");
            return;
        }
        try {
            getWritableDatabase().delete(str3, "vehicleidclient = ? AND manufacturer = ?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2343)).u("Error removing car from table");
        }
    }

    private final void x(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (str == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2347)).u("vehicleId for client is null!");
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("nickname", str3);
        k(str, str2, str4, contentValues);
    }

    private final boolean y(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, java.lang.String str) {
        com.google.android.gms.car.CarInfo carInfo = carInfoInternal.a;
        if (android.text.TextUtils.isEmpty(carInfo.d)) {
            carInfo.d = n();
        }
        if (defpackage.rly.a(defpackage.rly.b)) {
            ((defpackage.yqj) a.l().ai(2330)).M("Saving vehicle ID %s for internal ID %s", carInfo.d, carInfoInternal.u);
        }
        carInfoInternal.e = j$.time.Instant.now().toEpochMilli();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("manufacturer", carInfo.a);
        contentValues.put("model", carInfo.b);
        contentValues.put("modelyear", carInfo.c);
        contentValues.put("vehicleid", carInfoInternal.u);
        contentValues.put("vehicleidclient", carInfo.d);
        contentValues.put("headUnitProtocolMajorVersionNumber", java.lang.Integer.valueOf(carInfo.e));
        contentValues.put("headUnitProtocolMinorVersionNumber", java.lang.Integer.valueOf(carInfo.f));
        contentValues.put("bluetoothConnectionAllowed", java.lang.Integer.valueOf(carInfoInternal.c ? 1 : 0));
        contentValues.put("nickname", carInfo.p);
        contentValues.put("connectiontime", java.lang.Long.valueOf(carInfoInternal.e));
        o(carInfoInternal, contentValues);
        contentValues.put("wifiProjectionProtocolOnTcp", java.lang.Integer.valueOf(carInfoInternal.r ? 1 : 0));
        contentValues.put("wifiProjectionProtocolIpAddress", carInfoInternal.s);
        contentValues.put("wifiProjectionProtocolTcpPort", java.lang.Integer.valueOf(carInfoInternal.t));
        p(carInfoInternal, contentValues);
        if (z()) {
            contentValues.put("headUnitMake", carInfo.i);
            contentValues.put("headUnitModel", carInfo.j);
            contentValues.put("headUnitSoftwareBuild", carInfo.k);
            contentValues.put("headUnitSoftwareVersion", carInfo.l);
            contentValues.put("vehicleType", java.lang.Integer.valueOf(carInfo.r));
        }
        try {
            long jInsert = getWritableDatabase().insert(str, null, contentValues);
            if (jInsert == -1) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(2329)).y("adding car info to db table %s failed", str);
                return false;
            }
            carInfoInternal.d = jInsert;
            carInfoInternal.p = "allowedcars".equals(str);
            return true;
        } catch (android.database.sqlite.SQLiteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2328)).u("Exception while inserting into database");
            return false;
        }
    }

    private static boolean z() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    public final com.google.android.gms.carsetup.CarInfoInternal a(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, java.lang.String str, boolean z) {
        if (carInfoInternal.u == null) {
            t(defpackage.zbd.ug);
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2336)).u("No hashed vehicle ID provided. Lookup not possible.");
            return null;
        }
        java.lang.String strBp = defpackage.a.bp(str, "SELECT * FROM ", " WHERE manufacturer = ?     AND model = ?     AND modelyear = ?     AND vehicleid = ?");
        com.google.android.gms.car.CarInfo carInfo = carInfoInternal.a;
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternalS = s(str, strBp, new java.lang.String[]{carInfo.a, carInfo.b, carInfo.c, carInfoInternal.u});
        if (carInfoInternalS == null) {
            t(defpackage.zbd.uf);
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2335)).u("Vehicle not found!");
            return carInfoInternalS;
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2333)).u("Vehicle found.");
        t(defpackage.zbd.ue);
        if (z) {
            carInfoInternalS.e = j$.time.Instant.now().toEpochMilli();
            if (!defpackage.adax.a.fF().at() || android.bluetooth.BluetoothAdapter.checkBluetoothAddress(carInfoInternal.f)) {
                carInfoInternalS.f = carInfoInternal.f;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(2334)).y("Do not update bluetooth address because the input (%s) is invalid.", carInfoInternal.f);
            }
            com.google.android.gms.car.CarInfo carInfo2 = carInfoInternalS.a;
            int i = carInfo.e;
            carInfo2.e = i;
            int i2 = carInfo.f;
            carInfo2.f = i2;
            if (z()) {
                carInfo2.k = carInfo.k;
                carInfo2.l = carInfo.l;
            }
            long j = carInfoInternalS.d;
            long j2 = carInfoInternalS.e;
            java.lang.String str2 = carInfoInternalS.f;
            java.lang.String str3 = carInfo2.k;
            java.lang.String str4 = carInfo2.l;
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("connectiontime", java.lang.Long.valueOf(j2));
                contentValues.put("bluetoothaddress", str2);
                contentValues.put("headUnitProtocolMajorVersionNumber", java.lang.Integer.valueOf(i));
                contentValues.put("headUnitProtocolMinorVersionNumber", java.lang.Integer.valueOf(i2));
                if (z()) {
                    contentValues.put("headUnitSoftwareBuild", str3);
                    contentValues.put("headUnitSoftwareVersion", str4);
                }
                writableDatabase.update(str, contentValues, "id = ?", new java.lang.String[]{java.lang.String.valueOf(j)});
                return carInfoInternalS;
            } catch (android.database.sqlite.SQLiteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2350)).u("Error updating last connection timestamp, bluetooth address and head unit protocol version for car!");
            }
        }
        return carInfoInternalS;
    }

    public final com.google.android.gms.carsetup.CarInfoInternal b(com.google.android.gms.car.CarInfo carInfo, java.lang.String str) {
        return s(str, defpackage.a.bp(str, "SELECT * FROM ", " WHERE manufacturer = ?     AND model = ?     AND modelyear = ?     AND vehicleidclient = ?"), new java.lang.String[]{carInfo.a, carInfo.b, carInfo.c, carInfo.d});
    }

    public final defpackage.xyn c(java.lang.String str, boolean z) {
        java.util.List<com.google.android.gms.carsetup.CarInfoInternal> listE = e();
        if (z) {
            listE.addAll(f());
        }
        for (com.google.android.gms.carsetup.CarInfoInternal carInfoInternal : listE) {
            if (j$.util.Objects.equals(carInfoInternal.f, str)) {
                return defpackage.xyn.h(carInfoInternal);
            }
        }
        return defpackage.xxe.a;
    }

    public final java.util.List d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(e());
        arrayList.addAll(f());
        return arrayList;
    }

    public final java.util.List e() {
        return B("allowedcars", getReadableDatabase());
    }

    public final java.util.List f() {
        return B("rejectedcars", getReadableDatabase());
    }

    @Override // defpackage.rio
    protected final void g(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        A(sQLiteDatabase, "allowedcars");
        A(sQLiteDatabase, "rejectedcars");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        for (int i = 1; i < 3; i++) {
            try {
                return super.getReadableDatabase();
            } catch (android.database.sqlite.SQLiteException unused) {
                super.getWritableDatabase().close();
            }
        }
        return super.getReadableDatabase();
    }

    public final void h() {
        u("allowedcars");
        u("rejectedcars");
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        w(str, str2, "allowedcars");
        w(str, str2, "rejectedcars");
    }

    public final void j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        x(str, str2, str3, "allowedcars");
        x(str, str2, str3, "rejectedcars");
    }

    public final void k(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.ContentValues contentValues) {
        try {
            getWritableDatabase().update(str3, contentValues, "vehicleidclient = ? AND manufacturer = ?", new java.lang.String[]{str, str2});
        } catch (java.lang.Exception e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2346)).u("Error updating car info internal");
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean l(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal) {
        if (carInfoInternal.u == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2327)).u("No hashed vehicle ID provided. AddAllowedCar not possible.");
            return false;
        }
        if (a(carInfoInternal, "allowedcars", false) != null) {
            ((defpackage.yqj) a.l().ai((char) 2326)).y("addAllowedCar, already existing: %s", carInfoInternal);
            return true;
        }
        v(carInfoInternal, "rejectedcars");
        return y(carInfoInternal, "allowedcars");
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean m(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal) {
        if (carInfoInternal.u == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2332)).u("No hashed vehicle ID provided. AddRejectedCar not possible.");
            return false;
        }
        if (a(carInfoInternal, "rejectedcars", false) != null) {
            ((defpackage.yqj) a.l().ai((char) 2331)).y("addRejectedCar, already existing: %s", carInfoInternal);
            return true;
        }
        v(carInfoInternal, "allowedcars");
        return y(carInfoInternal, "rejectedcars");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(2338)).B("Downgrading database %d -> %d", i, i2);
        android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type IN ('table','view') AND name NOT LIKE 'sqlite_%'  UNION ALL  SELECT name FROM sqlite_temp_master  WHERE type IN ('table','view')  ORDER BY 1 ", null);
        if (cursorRawQuery != null) {
            while (cursorRawQuery.moveToNext()) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + cursorRawQuery.getString(0));
                } catch (java.lang.Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            g(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2339)).B("Upgrading database %d -> %d", i, i2);
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
            android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM rejectedcars", null);
            try {
                int columnIndex = cursorRawQuery.getColumnIndex("id");
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        contentValues.put("vehicleidclient", n());
                        sQLiteDatabase.update("rejectedcars", contentValues, "id = ?", new java.lang.String[]{java.lang.String.valueOf(cursorRawQuery.getLong(columnIndex))});
                    } while (cursorRawQuery.moveToNext());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                i = 7;
            } catch (java.lang.Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (java.lang.Throwable th2) {
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
        if (z()) {
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

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void q(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, boolean z) {
        boolean z2 = false;
        android.database.Cursor cursorQuery = null;
        try {
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
                cursorQuery = writableDatabase.query("allowedcars", new java.lang.String[]{"bluetoothConnectionAllowed"}, "id = ?", new java.lang.String[]{java.lang.Long.toString(carInfoInternal.d)}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("bluetoothConnectionAllowed")) != z) {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        contentValues.put("bluetoothConnectionAllowed", java.lang.Integer.valueOf(z ? 1 : 0));
                        writableDatabase.update("allowedcars", contentValues, "id = ?", new java.lang.String[]{java.lang.Long.toString(carInfoInternal.d)});
                    }
                    z2 = true;
                }
            } catch (android.database.sqlite.SQLiteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(2349)).u("Exception while updating database");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (z2) {
                carInfoInternal.c = z;
            }
        } catch (java.lang.Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }
}
