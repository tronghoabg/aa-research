package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzeko extends zzfzx {
    private final Context zza;
    private final zzhcp zzb;

    public zzeko(Context context, zzhcp zzhcpVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzjL)).intValue(), zzfzz.zza);
        this.zza = context;
        this.zzb = zzhcpVar;
    }

    public static /* synthetic */ Void zzf(H6.p pVar, SQLiteDatabase sQLiteDatabase) throws Throwable {
        zzj(sQLiteDatabase, pVar);
        return null;
    }

    public static /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, H6.p pVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, pVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, H6.p pVar) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String string;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            String string2 = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string2, null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr2 = new String[count];
                int i5 = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j8 = cursorQuery.getLong(columnIndex);
                        String string3 = cursorQuery.getString(columnIndex2);
                        if (string3 == null) {
                            string = "";
                        } else {
                            Uri uri = Uri.parse(string3);
                            C6.n.f1857D.k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - j8;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                            String strValueOf = String.valueOf(builderClearQuery.build());
                            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb3.append(strValueOf);
                            sb3.append("&");
                            sb3.append(encodedQuery);
                            string = sb3.toString();
                        }
                        strArr2[i5] = string;
                    }
                    i5++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i10 = 0; i10 < count; i10++) {
                    pVar.a(null, strArr2[i10]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zza(zzfos zzfosVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.getWritableDatabase();
            }
        };
        zzhcp zzhcpVar = this.zzb;
        zzhcf.zzr(zzhcpVar.zzc(callable), new zzekh(this, zzfosVar), zzhcpVar);
    }

    public final void zzb(final SQLiteDatabase sQLiteDatabase, final H6.p pVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeki
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                zzeko.zzg(sQLiteDatabase, str, pVar);
            }
        });
    }

    public final void zzc(final H6.p pVar, final String str) {
        zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) {
                this.zza.zzb((SQLiteDatabase) obj, pVar, str);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzfos(this) { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) {
                zzeko.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zze(final zzekq zzekqVar) {
        zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.zzh(zzekqVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final Void zzh(zzekq zzekqVar, SQLiteDatabase sQLiteDatabase) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzekqVar.zza));
        contentValues.put("gws_query_id", zzekqVar.zzb);
        contentValues.put("url", zzekqVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzekqVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        U u10 = C6.n.f1857D.f1863c;
        Context context = this.zza;
        G6.A aB = U.b(context);
        if (aB != null) {
            try {
                aB.zzf(new BinderC3877b(context));
            } catch (RemoteException e7) {
                G6.L.l("Failed to schedule offline ping sender.", e7);
            }
        }
        return null;
    }
}
