package com.waze.gw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.AudioStats;
import androidx.collection.SieveCacheKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class TripBlackBox {
    private static final int KEEP_TRIPS = 10;
    private static final long MOVING_SAMPLE_MS = 2000;
    private static final int MOVING_SPEED_KMH = 4;
    private static final String PREFS = "waze_hud_gw";
    static final String PREF_ENABLED = "trip_blackbox_enabled";
    private static final long STILL_SAMPLE_MS = 10000;
    private static final String TAG = "WazeGW-BlackBox";
    private static final long TRIP_GAP_MS = 600000;
    private static volatile Db helper;
    private static final AtomicLong LAST_PUBLISHED_ELAPSED = new AtomicLong(0);
    private static final ExecutorService IO = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.waze.gw.TripBlackBox.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "WazeMod-TripBlackBox");
            thread.setDaemon(true);
            return thread;
        }
    });

    private TripBlackBox() {
    }

    static boolean enabled(Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences(PREFS, 0).getBoolean(PREF_ENABLED, true);
    }

    static void onEnabledChanged(Context context, boolean z) {
        if (context == null || z) {
            return;
        }
        final Context contextApp = app(context);
        IO.execute(new Runnable() { // from class: com.waze.gw.TripBlackBox.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TripBlackBox.closeActiveTrip(TripBlackBox.db(contextApp).getWritableDatabase(), System.currentTimeMillis());
                } catch (Throwable th) {
                    Log.w(TripBlackBox.TAG, "Unable to close trip after recorder was disabled", th);
                }
            }
        });
    }

    static void onPosition(Context context, double d2, double d3, int i2, int i3, int i4, double d4, boolean z, long j2, String str) {
        if (context == null || !enabled(context) || !validCoordinate(d2, d3)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = LAST_PUBLISHED_ELAPSED.get();
        if ((j3 <= 0 || jElapsedRealtime - j3 >= 1000) && LAST_PUBLISHED_ELAPSED.compareAndSet(j3, jElapsedRealtime)) {
            final Context contextApp = app(context);
            final Sample sample = new Sample(System.currentTimeMillis(), d2, d3, Math.max(0, i2), i3, i4, d4, z, j2, str);
            IO.execute(new Runnable() { // from class: com.waze.gw.TripBlackBox.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        TripBlackBox.record(contextApp, sample);
                    } catch (Throwable th) {
                        Log.w(TripBlackBox.TAG, "Trip sample rejected safely", th);
                    }
                }
            });
        }
    }

    static List<TripSummary> listTrips(Context context) {
        double d2;
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            return arrayList;
        }
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase writableDatabase = db(app(context)).getWritableDatabase();
            closeStaleTrip(writableDatabase, System.currentTimeMillis());
            cursorRawQuery = writableDatabase.rawQuery("SELECT id,start_ms,end_ms,distance_m,moving_speed_sum,moving_samples,max_speed,overspeed_count,point_count,state FROM trips ORDER BY start_ms DESC LIMIT 10", null);
            while (cursorRawQuery.moveToNext()) {
                long j2 = cursorRawQuery.getLong(5);
                if (j2 <= 0) {
                    d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
                } else {
                    double d3 = cursorRawQuery.getDouble(4);
                    double d4 = j2;
                    Double.isNaN(d4);
                    d2 = d3 / d4;
                }
                arrayList.add(new TripSummary(cursorRawQuery.getLong(0), cursorRawQuery.getLong(1), cursorRawQuery.getLong(2), cursorRawQuery.getDouble(3), d2, cursorRawQuery.getInt(6), cursorRawQuery.getInt(7), cursorRawQuery.getInt(8), cursorRawQuery.getInt(9) == 1));
            }
        } catch (Throwable th) {
            try {
                Log.w(TAG, "Unable to list recorded trips", th);
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        }
        if (cursorRawQuery != null) {
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0386 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x038d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean exportGpx(android.content.Context r29, long r30, android.net.Uri r32) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.TripBlackBox.exportGpx(android.content.Context, long, android.net.Uri):boolean");
    }

    static void deleteAll(Context context) {
        if (context == null) {
            return;
        }
        final Context contextApp = app(context);
        IO.execute(new Runnable() { // from class: com.waze.gw.TripBlackBox.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SQLiteDatabase writableDatabase = TripBlackBox.db(contextApp).getWritableDatabase();
                    writableDatabase.beginTransaction();
                    try {
                        writableDatabase.delete("points", null, null);
                        writableDatabase.delete("trips", null, null);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Log.w(TripBlackBox.TAG, "Unable to clear trip history", th2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void record(Context context, Sample sample) {
        char c2;
        double d2;
        double dDistanceM;
        double d3;
        double d4;
        long j2;
        int iMin;
        if (enabled(context)) {
            SQLiteDatabase writableDatabase = db(context).getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ActiveTrip activeTrip = activeTrip(writableDatabase);
                boolean z = sample.speedKmh >= 4;
                if (activeTrip != null && (sample.timeMs - activeTrip.lastPointMs >= 600000 || (!z && sample.timeMs - activeTrip.lastMovingMs >= 600000))) {
                    finish(writableDatabase, activeTrip.id, activeTrip.lastPointMs);
                    activeTrip = null;
                }
                if (activeTrip == null) {
                    if (!z) {
                        writableDatabase.setTransactionSuccessful();
                        return;
                    } else {
                        activeTrip = createTrip(writableDatabase, sample);
                        trim(writableDatabase);
                    }
                }
                long j3 = z ? 2000L : 10000L;
                if (activeTrip.pointCount > 0 && sample.timeMs - activeTrip.lastPointMs < j3) {
                    writableDatabase.setTransactionSuccessful();
                    return;
                }
                if (activeTrip.pointCount > 0) {
                    d2 = 100.0d;
                    c2 = 0;
                    dDistanceM = distanceM(activeTrip.lastLatitude(), activeTrip.lastLongitude(), sample.latitude, sample.longitude);
                    double d5 = sample.timeMs - activeTrip.lastPointMs;
                    Double.isNaN(d5);
                    double dMax = Math.max(250.0d, (Math.max(0.001d, d5 / 1000.0d) * 100.0d) + (Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, sample.accuracyM) * 2.0d));
                    if (!TripBlackBox$$ExternalSyntheticBackport0.m(dDistanceM) || dDistanceM > dMax || (!sample.matched && sample.accuracyM > 100.0d)) {
                        dDistanceM = 0.0d;
                    }
                } else {
                    c2 = 0;
                    d2 = 100.0d;
                    dDistanceM = 0.0d;
                }
                boolean z2 = sample.limitKmh >= 10 && sample.speedKmh > sample.limitKmh;
                int i2 = activeTrip.overspeedCount + ((!z2 || activeTrip.wasOverspeed) ? 0 : 1);
                long j4 = activeTrip.movingSamples + (z ? 1L : 0L);
                double d6 = activeTrip.movingSpeedSum;
                if (z) {
                    d3 = 0.0d;
                    d4 = sample.speedKmh;
                } else {
                    d3 = 0.0d;
                    d4 = 0.0d;
                }
                double d7 = d6 + d4;
                ContentValues contentValues = new ContentValues();
                double d8 = dDistanceM;
                contentValues.put("trip_id", Long.valueOf(activeTrip.id));
                contentValues.put("time_ms", Long.valueOf(sample.timeMs));
                contentValues.put("lat_e6", Integer.valueOf((int) Math.round(sample.latitude * 1000000.0d)));
                contentValues.put("lon_e6", Integer.valueOf((int) Math.round(sample.longitude * 1000000.0d)));
                contentValues.put("speed_kmh", Integer.valueOf(sample.speedKmh));
                contentValues.put("limit_kmh", Integer.valueOf(sample.limitKmh));
                if (sample.accuracyM < d3) {
                    iMin = -1;
                    j2 = j4;
                } else {
                    j2 = j4;
                    iMin = (int) Math.min(SieveCacheKt.NodeLinkMask, Math.round(sample.accuracyM * d2));
                }
                contentValues.put("accuracy_cm", Integer.valueOf(iMin));
                contentValues.put("bearing_deg", Integer.valueOf(sample.bearingDeg));
                contentValues.put("matched", Integer.valueOf(sample.matched ? 1 : 0));
                contentValues.put("segment_id", Long.valueOf(sample.segmentId));
                contentValues.put("street", limited(sample.street, 180));
                writableDatabase.insertOrThrow("points", null, contentValues);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("end_ms", Long.valueOf(sample.timeMs));
                contentValues2.put("last_point_ms", Long.valueOf(sample.timeMs));
                contentValues2.put("last_moving_ms", Long.valueOf(z ? sample.timeMs : activeTrip.lastMovingMs));
                contentValues2.put("last_lat_e6", Integer.valueOf((int) Math.round(sample.latitude * 1000000.0d)));
                contentValues2.put("last_lon_e6", Integer.valueOf((int) Math.round(sample.longitude * 1000000.0d)));
                contentValues2.put("distance_m", Double.valueOf(activeTrip.distanceM + d8));
                contentValues2.put("moving_speed_sum", Double.valueOf(d7));
                contentValues2.put("moving_samples", Long.valueOf(j2));
                contentValues2.put("max_speed", Integer.valueOf(Math.max(activeTrip.maxSpeed, sample.speedKmh)));
                contentValues2.put("overspeed_count", Integer.valueOf(i2));
                contentValues2.put("was_overspeed", Integer.valueOf(z2 ? 1 : 0));
                contentValues2.put("point_count", Integer.valueOf(activeTrip.pointCount + 1));
                String[] strArr = new String[1];
                strArr[c2] = String.valueOf(activeTrip.id);
                writableDatabase.update("trips", contentValues2, "id=?", strArr);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    private static ActiveTrip createTrip(SQLiteDatabase sQLiteDatabase, Sample sample) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("start_ms", Long.valueOf(sample.timeMs));
        contentValues.put("end_ms", Long.valueOf(sample.timeMs));
        contentValues.put("last_point_ms", (Long) 0L);
        contentValues.put("last_moving_ms", Long.valueOf(sample.timeMs));
        contentValues.put("last_lat_e6", (Integer) 0);
        contentValues.put("last_lon_e6", (Integer) 0);
        contentValues.put("state", (Integer) 1);
        return new ActiveTrip(sQLiteDatabase.insertOrThrow("trips", null, contentValues), sample.timeMs, 0L, sample.timeMs, 0, 0, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 0L, 0, 0, false, 0);
    }

    private static ActiveTrip activeTrip(SQLiteDatabase sQLiteDatabase) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT id,start_ms,last_point_ms,last_moving_ms,last_lat_e6,last_lon_e6,distance_m,moving_speed_sum,moving_samples,max_speed,overspeed_count,was_overspeed,point_count FROM trips WHERE state=1 ORDER BY id DESC LIMIT 1", null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (cursorRawQuery.moveToFirst()) {
                ActiveTrip activeTrip = new ActiveTrip(cursorRawQuery.getLong(0), cursorRawQuery.getLong(1), cursorRawQuery.getLong(2), cursorRawQuery.getLong(3), cursorRawQuery.getInt(4), cursorRawQuery.getInt(5), cursorRawQuery.getDouble(6), cursorRawQuery.getDouble(7), cursorRawQuery.getLong(8), cursorRawQuery.getInt(9), cursorRawQuery.getInt(10), cursorRawQuery.getInt(11) != 0, cursorRawQuery.getInt(12));
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return activeTrip;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorRawQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static void closeStaleTrip(SQLiteDatabase sQLiteDatabase, long j2) throws Throwable {
        ActiveTrip activeTrip = activeTrip(sQLiteDatabase);
        if (activeTrip != null && activeTrip.lastPointMs > 0 && j2 - activeTrip.lastPointMs >= 600000) {
            finish(sQLiteDatabase, activeTrip.id, activeTrip.lastPointMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeActiveTrip(SQLiteDatabase sQLiteDatabase, long j2) throws Throwable {
        ActiveTrip activeTrip = activeTrip(sQLiteDatabase);
        if (activeTrip != null) {
            long j3 = activeTrip.id;
            if (activeTrip.lastPointMs > 0) {
                j2 = activeTrip.lastPointMs;
            }
            finish(sQLiteDatabase, j3, j2);
        }
    }

    private static void finish(SQLiteDatabase sQLiteDatabase, long j2, long j3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", (Integer) 0);
        contentValues.put("end_ms", Long.valueOf(j3));
        contentValues.put("was_overspeed", (Integer) 0);
        sQLiteDatabase.update("trips", contentValues, "id=?", new String[]{String.valueOf(j2)});
    }

    private static void trim(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT id FROM trips ORDER BY start_ms DESC LIMIT -1 OFFSET 10", null);
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(Long.valueOf(cursorRawQuery.getLong(0)));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String[] strArr = {String.valueOf(((Long) it.next()).longValue())};
                sQLiteDatabase.delete("points", "trip_id=?", strArr);
                sQLiteDatabase.delete("trips", "id=?", strArr);
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Db db(Context context) {
        Db db;
        Db db2 = helper;
        if (db2 != null) {
            return db2;
        }
        synchronized (TripBlackBox.class) {
            if (helper == null) {
                helper = new Db(app(context));
            }
            db = helper;
        }
        return db;
    }

    private static Context app(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static boolean validCoordinate(double d2, double d3) {
        return TripBlackBox$$ExternalSyntheticBackport0.m(d2) && TripBlackBox$$ExternalSyntheticBackport0.m(d3) && d2 >= -90.0d && d2 <= 90.0d && d3 >= -180.0d && d3 <= 180.0d && (Math.abs(d2) >= 1.0E-6d || Math.abs(d3) >= 1.0E-6d);
    }

    private static double distanceM(double d2, double d3, double d4, double d5) {
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(d4);
        double radians3 = Math.toRadians(d4 - d2);
        double d6 = radians3 / 2.0d;
        double radians4 = Math.toRadians(d5 - d3) / 2.0d;
        double dSin = (Math.sin(d6) * Math.sin(d6)) + (Math.cos(radians) * Math.cos(radians2) * Math.sin(radians4) * Math.sin(radians4));
        return Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 1.2742E7d;
    }

    private static String xml(String str) {
        return str == null ? "" : str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&apos;");
    }

    private static String limited(String str, int i2) {
        if (str == null) {
            return "";
        }
        String strTrim = str.replace('\t', ' ').replace('\n', ' ').replace('\r', ' ').trim();
        return strTrim.length() <= i2 ? strTrim : strTrim.substring(0, i2);
    }

    private static String isoUtc(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j2));
    }

    private static String localStamp(long j2) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j2));
    }

    static final class TripSummary {
        final boolean active;
        final double averageSpeedKmh;
        final double distanceM;
        final long endMs;
        final long id;
        final int maxSpeedKmh;
        final int overspeedCount;
        final int pointCount;
        final long startMs;

        TripSummary(long j2, long j3, long j4, double d2, double d3, int i2, int i3, int i4, boolean z) {
            this.id = j2;
            this.startMs = j3;
            this.endMs = j4;
            this.distanceM = d2;
            this.averageSpeedKmh = d3;
            this.maxSpeedKmh = i2;
            this.overspeedCount = i3;
            this.pointCount = i4;
            this.active = z;
        }
    }

    private static final class Sample {
        final double accuracyM;
        final int bearingDeg;
        final double latitude;
        final int limitKmh;
        final double longitude;
        final boolean matched;
        final long segmentId;
        final int speedKmh;
        final String street;
        final long timeMs;

        Sample(long j2, double d2, double d3, int i2, int i3, int i4, double d4, boolean z, long j3, String str) {
            this.timeMs = j2;
            this.latitude = d2;
            this.longitude = d3;
            this.speedKmh = i2;
            this.limitKmh = i3;
            this.bearingDeg = i4;
            this.accuracyM = d4;
            this.matched = z;
            this.segmentId = j3;
            this.street = str == null ? "" : str;
        }
    }

    private static final class ActiveTrip {
        final double distanceM;
        final long id;
        final int lastLatE6;
        final int lastLonE6;
        final long lastMovingMs;
        final long lastPointMs;
        final int maxSpeed;
        final long movingSamples;
        final double movingSpeedSum;
        final int overspeedCount;
        final int pointCount;
        final long startMs;
        final boolean wasOverspeed;

        ActiveTrip(long j2, long j3, long j4, long j5, int i2, int i3, double d2, double d3, long j6, int i4, int i5, boolean z, int i6) {
            this.id = j2;
            this.startMs = j3;
            this.lastPointMs = j4;
            this.lastMovingMs = j5;
            this.lastLatE6 = i2;
            this.lastLonE6 = i3;
            this.distanceM = d2;
            this.movingSpeedSum = d3;
            this.movingSamples = j6;
            this.maxSpeed = i4;
            this.overspeedCount = i5;
            this.wasOverspeed = z;
            this.pointCount = i6;
        }

        double lastLatitude() {
            double d2 = this.lastLatE6;
            Double.isNaN(d2);
            return d2 / 1000000.0d;
        }

        double lastLongitude() {
            double d2 = this.lastLonE6;
            Double.isNaN(d2);
            return d2 / 1000000.0d;
        }
    }

    private static final class Db extends SQLiteOpenHelper {
        Db(Context context) {
            super(context, "wazemod_blackbox.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            super.onConfigure(sQLiteDatabase);
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL("CREATE TABLE trips (id INTEGER PRIMARY KEY AUTOINCREMENT,start_ms INTEGER NOT NULL,end_ms INTEGER NOT NULL,last_point_ms INTEGER NOT NULL,last_moving_ms INTEGER NOT NULL,last_lat_e6 INTEGER NOT NULL DEFAULT 0,last_lon_e6 INTEGER NOT NULL DEFAULT 0,distance_m REAL NOT NULL DEFAULT 0,moving_speed_sum REAL NOT NULL DEFAULT 0,moving_samples INTEGER NOT NULL DEFAULT 0,max_speed INTEGER NOT NULL DEFAULT 0,overspeed_count INTEGER NOT NULL DEFAULT 0,was_overspeed INTEGER NOT NULL DEFAULT 0,point_count INTEGER NOT NULL DEFAULT 0,state INTEGER NOT NULL DEFAULT 1)");
            sQLiteDatabase.execSQL("CREATE TABLE points (id INTEGER PRIMARY KEY AUTOINCREMENT,trip_id INTEGER NOT NULL,time_ms INTEGER NOT NULL,lat_e6 INTEGER NOT NULL,lon_e6 INTEGER NOT NULL,speed_kmh INTEGER NOT NULL,limit_kmh INTEGER NOT NULL,accuracy_cm INTEGER NOT NULL,bearing_deg INTEGER NOT NULL,matched INTEGER NOT NULL,segment_id INTEGER NOT NULL,street TEXT NOT NULL,FOREIGN KEY(trip_id) REFERENCES trips(id) ON DELETE CASCADE)");
            sQLiteDatabase.execSQL("CREATE INDEX points_trip_time ON points(trip_id,time_ms)");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }
    }
}
