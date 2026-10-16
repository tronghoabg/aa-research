package jb;

import a.AbstractC1304a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kb.C3286b;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f38704n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38705a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38706b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38707c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38708d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f38709e;

    /* renamed from: h, reason: collision with root package name */
    public h f38712h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f38713i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f38715l;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f38710f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f38711g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f38714j = 0;
    public int k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f38716m = 0;

    public e(Context context, String str, int i5, boolean z2, int i10) {
        this.f38709e = context;
        this.f38706b = str;
        this.f38705a = z2;
        this.f38707c = i5;
        this.f38708d = i10;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        HashMap map = null;
        ArrayList arrayList = null;
        int columnCount = 0;
        while (cursor.moveToNext()) {
            if (map == null) {
                arrayList = new ArrayList();
                map = new HashMap();
                columnCount = cursor.getColumnCount();
                map.put("columns", Arrays.asList(cursor.getColumnNames()));
                map.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(columnCount);
            for (int i5 = 0; i5 < columnCount; i5++) {
                int type = cursor.getType(i5);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i5) : cursor.getString(i5) : Double.valueOf(cursor.getDouble(i5)) : Long.valueOf(cursor.getLong(i5)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final void a() {
        HashMap map = this.f38711g;
        if (!map.isEmpty() && this.f38708d >= 1) {
            Log.d("Sqflite", h() + map.size() + " cursor(s) are left opened");
        }
        this.f38713i.close();
    }

    public final void b(i iVar) {
        try {
            int i5 = iVar.f38725a;
            if (a.a(this.f38708d)) {
                Log.d("Sqflite", h() + "closing cursor " + i5);
            }
            this.f38711g.remove(Integer.valueOf(i5));
            iVar.f38727c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(a.AbstractC1304a r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r10.g(r11)
            r1 = 0
            if (r0 != 0) goto L9
            goto Lc3
        L9:
            boolean r0 = r11.t()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L15
            r11.b(r2)
            return r3
        L15:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r10.f38713i     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb7
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb7
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L94
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            if (r5 <= 0) goto L94
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            if (r5 == 0) goto L94
            int r5 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            int r6 = r10.f38708d
            if (r5 != 0) goto L68
            if (r6 < r3) goto L61
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = r10.h()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            long r6 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            android.util.Log.d(r4, r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            goto L61
        L5c:
            r11 = move-exception
            r2 = r0
            goto Lc4
        L5f:
            r2 = move-exception
            goto Lbb
        L61:
            r11.b(r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r0.close()
            return r3
        L68:
            long r7 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            if (r6 < r3) goto L89
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r2.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r5 = r10.h()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r2.append(r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r5 = "inserted "
            r2.append(r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r2.append(r7)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
        L89:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r11.b(r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r0.close()
            return r3
        L94:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = r10.h()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            r11.b(r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            if (r0 == 0) goto Lb4
            r0.close()
        Lb4:
            return r3
        Lb5:
            r11 = move-exception
            goto Lc4
        Lb7:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
        Lbb:
            r10.i(r2, r11)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto Lc3
            r0.close()
        Lc3:
            return r1
        Lc4:
            if (r2 == 0) goto Lc9
            r2.close()
        Lc9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.e.d(a.a):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jb.m] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.a] */
    public final boolean e(AbstractC1304a abstractC1304a) throws Throwable {
        Integer num = (Integer) abstractC1304a.q("cursorPageSize");
        String str = (String) abstractC1304a.q("sql");
        ?? mVar = new m(str, (List) abstractC1304a.q("arguments"));
        if (this.f38708d >= 1) {
            Log.d("Sqflite", h() + mVar);
        }
        i iVar = null;
        try {
            try {
                mVar = this.f38713i.rawQueryWithFactory(new c(mVar, 0), str, a.f38698a, null);
                try {
                    HashMap mapC = c(mVar, num);
                    if (num != null && !mVar.isLast() && !mVar.isAfterLast()) {
                        int i5 = this.f38716m + 1;
                        this.f38716m = i5;
                        mapC.put("cursorId", Integer.valueOf(i5));
                        i iVar2 = new i(i5, num.intValue(), mVar);
                        try {
                            this.f38711g.put(Integer.valueOf(i5), iVar2);
                            iVar = iVar2;
                        } catch (Exception e7) {
                            e = e7;
                            iVar = iVar2;
                            i(e, abstractC1304a);
                            if (iVar != null) {
                                b(iVar);
                            }
                            if (iVar != null || mVar == 0) {
                                return false;
                            }
                            mVar.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            iVar = iVar2;
                            if (iVar == null && mVar != 0) {
                                mVar.close();
                            }
                            throw th;
                        }
                    }
                    abstractC1304a.b(mapC);
                    if (iVar == null) {
                        mVar.close();
                    }
                    return true;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
            mVar = 0;
        } catch (Throwable th3) {
            th = th3;
            mVar = 0;
        }
    }

    public final boolean f(AbstractC1304a abstractC1304a) throws Throwable {
        if (g(abstractC1304a)) {
            Cursor cursor = null;
            try {
                if (abstractC1304a.t()) {
                    abstractC1304a.b(null);
                    return true;
                }
                try {
                    Cursor cursorRawQuery = this.f38713i.rawQuery("SELECT changes()", null);
                    if (cursorRawQuery != null) {
                        try {
                            if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                                int i5 = cursorRawQuery.getInt(0);
                                if (this.f38708d >= 1) {
                                    Log.d("Sqflite", h() + "changed " + i5);
                                }
                                abstractC1304a.b(Integer.valueOf(i5));
                                cursorRawQuery.close();
                                return true;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            cursor = cursorRawQuery;
                            i(e, abstractC1304a);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    Log.e("Sqflite", h() + "fail to read changes for Update/Delete");
                    abstractC1304a.b(null);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return true;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public final boolean g(AbstractC1304a abstractC1304a) throws SQLException {
        String str = (String) abstractC1304a.q("sql");
        m mVar = new m(str, (List) abstractC1304a.q("arguments"));
        if (this.f38708d >= 1) {
            Log.d("Sqflite", h() + mVar);
        }
        Object objQ = abstractC1304a.q("inTransaction");
        Boolean bool = objQ instanceof Boolean ? (Boolean) objQ : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f38713i;
            ArrayList arrayList = new ArrayList();
            List list = mVar.f38752b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.f38714j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.f38714j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e7) {
            i(e7, abstractC1304a);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb2 = new StringBuilder("[");
        Thread threadCurrentThread = Thread.currentThread();
        sb2.append(this.f38707c + "," + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")");
        sb2.append("] ");
        return sb2.toString();
    }

    public final void i(Exception exc, AbstractC1304a abstractC1304a) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            abstractC1304a.a(null, "open_failed " + this.f38706b);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) abstractC1304a.q("sql");
            Collection arrayList = (List) abstractC1304a.q("arguments");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            HashMap map = new HashMap();
            map.put("sql", str);
            map.put("arguments", arrayList);
            abstractC1304a.a(map, message);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) abstractC1304a.q("sql");
        Collection arrayList2 = (List) abstractC1304a.q("arguments");
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        HashMap map2 = new HashMap();
        map2.put("sql", str2);
        map2.put("arguments", arrayList2);
        abstractC1304a.a(map2, message2);
    }

    public final synchronized boolean j() {
        return this.f38714j > 0;
    }

    public final void k() {
        if (f38704n == null) {
            Context context = this.f38709e;
            boolean z2 = false;
            try {
                String packageName = context.getPackageName();
                if ((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(packageName, 128)).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z2 = true;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            f38704n = Boolean.valueOf(z2);
            if (z2 && a.a(this.f38708d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.f38713i = SQLiteDatabase.openDatabase(this.f38706b, null, f38704n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(C3286b c3286b, Runnable runnable) {
        Integer num = (Integer) c3286b.q("transactionId");
        Integer num2 = this.f38715l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f38710f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new kb.d(runnable));
            return;
        }
        runnable.run();
        if (this.f38715l != null || arrayList.isEmpty()) {
            return;
        }
        this.f38712h.a(this, new com.applovin.adview.a(this, 29));
    }
}
