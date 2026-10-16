package g5;

import A7.RunnableC0299w0;
import U8.v0;
import Wa.h;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import h5.AbstractC2777a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import org.apache.tika.utils.StringUtils;
import qc.C3884a;
import qc.InterfaceC3885b;
import tc.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* renamed from: g5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2708e implements InterfaceC3885b, InterfaceC4279p {

    /* renamed from: i, reason: collision with root package name */
    public static String f35750i;
    public static HandlerThread k;

    /* renamed from: l, reason: collision with root package name */
    public static Handler f35752l;

    /* renamed from: a, reason: collision with root package name */
    public Context f35754a;

    /* renamed from: b, reason: collision with root package name */
    public C4281r f35755b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f35744c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f35745d = false;

    /* renamed from: e, reason: collision with root package name */
    public static int f35746e = 10;

    /* renamed from: f, reason: collision with root package name */
    public static int f35747f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f35748g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f35749h = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static int f35751j = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f35753m = new HashMap();

    public static void a(C2708e c2708e, C2704a c2704a) {
        c2708e.getClass();
        try {
            if (c2704a.f35725e >= 1) {
                Log.d("Sqflite", c2704a.b() + "closing database " + k);
            }
            c2704a.f35726f.d();
        } catch (Exception e7) {
            Log.e("Sqflite", "error " + e7 + " while closing database " + f35751j);
        }
        synchronized (f35748g) {
            try {
                if (f35753m.isEmpty() && f35752l != null) {
                    if (c2704a.f35725e >= 1) {
                        Log.d("Sqflite", c2704a.b() + "stopping thread" + k);
                    }
                    k.quit();
                    k = null;
                    f35752l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(g5.C2708e r9, g5.C2704a r10, h5.AbstractC2777a r11) {
        /*
            r9.getClass()
            boolean r9 = g(r10, r11)
            r0 = 0
            if (r9 != 0) goto Lc
            goto Lc6
        Lc:
            boolean r9 = r11.M()
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L18
            r11.b(r1)
            return r2
        L18:
            java.lang.String r9 = "SELECT changes(), last_insert_rowid()"
            net.zetetic.database.sqlcipher.SQLiteDatabase r3 = r10.f35726f     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lba
            android.database.Cursor r9 = r3.Z(r9, r1)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lba
            java.lang.String r3 = "Sqflite"
            if (r9 == 0) goto L97
            int r4 = r9.getCount()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r4 <= 0) goto L97
            boolean r4 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r4 == 0) goto L97
            int r4 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            int r5 = r10.f35725e
            if (r4 != 0) goto L6b
            if (r5 < r2) goto L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r4.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r10.b()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r4.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = "no changes (id was "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            long r5 = r9.getLong(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r4.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.d(r3, r4)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            goto L64
        L5f:
            r10 = move-exception
            r1 = r9
            goto Lc7
        L62:
            r1 = move-exception
            goto Lbe
        L64:
            r11.b(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r9.close()
            return r2
        L6b:
            long r6 = r9.getLong(r2)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r5 < r2) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r1.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r4 = r10.b()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r1.append(r4)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r4 = "inserted "
            r1.append(r4)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r1.append(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.d(r3, r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
        L8c:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r11.b(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r9.close()
            return r2
        L97:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r4.<init>()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = r10.b()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r4.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r5 = "fail to read changes for Insert"
            r4.append(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            android.util.Log.e(r3, r4)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            r11.b(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L62
            if (r9 == 0) goto Lb7
            r9.close()
        Lb7:
            return r2
        Lb8:
            r10 = move-exception
            goto Lc7
        Lba:
            r9 = move-exception
            r8 = r1
            r1 = r9
            r9 = r8
        Lbe:
            j(r1, r11, r10)     // Catch: java.lang.Throwable -> L5f
            if (r9 == 0) goto Lc6
            r9.close()
        Lc6:
            return r0
        Lc7:
            if (r1 == 0) goto Lcc
            r1.close()
        Lcc:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2708e.b(g5.e, g5.a, h5.a):boolean");
    }

    public static boolean c(C2708e c2708e, C2704a c2704a, AbstractC2777a abstractC2777a) {
        c2708e.getClass();
        C2709f c2709fN = abstractC2777a.N();
        ArrayList arrayList = new ArrayList();
        int i5 = c2704a.f35725e;
        if (i5 >= 1) {
            Log.d("Sqflite", c2704a.b() + c2709fN);
        }
        boolean z2 = f35745d;
        Cursor cursor = null;
        Serializable map = null;
        cursor = null;
        cursor = null;
        cursor = null;
        try {
            try {
                C2709f c2709fC = c2709fN.c();
                SQLiteDatabase sQLiteDatabase = c2704a.f35726f;
                String str = c2709fC.f35756a;
                try {
                    List list = c2709fC.f35757b;
                    ArrayList arrayList2 = new ArrayList();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(C2709f.d(it.next()));
                        }
                    }
                    Cursor cursorZ = sQLiteDatabase.Z(str, (String[]) arrayList2.toArray(new String[0]));
                    ArrayList arrayList3 = null;
                    int columnCount = 0;
                    while (cursorZ.moveToNext()) {
                        try {
                            if (z2) {
                                HashMap mapF = f(cursorZ);
                                if (i5 >= 1) {
                                    Log.d("Sqflite", c2704a.b() + n(mapF));
                                }
                                arrayList.add(mapF);
                            } else {
                                if (map == null) {
                                    ArrayList arrayList4 = new ArrayList();
                                    HashMap map2 = new HashMap();
                                    columnCount = cursorZ.getColumnCount();
                                    map2.put("columns", Arrays.asList(cursorZ.getColumnNames()));
                                    map2.put("rows", arrayList4);
                                    arrayList3 = arrayList4;
                                    map = map2;
                                }
                                arrayList3.add(e(cursorZ, columnCount));
                            }
                        } catch (Exception e7) {
                            e = e7;
                            cursor = cursorZ;
                            j(e, abstractC2777a, c2704a);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorZ;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    if (z2) {
                        abstractC2777a.b(arrayList);
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        abstractC2777a.b(map);
                    }
                    cursorZ.close();
                    return true;
                } catch (Exception e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean d(C2708e c2708e, C2704a c2704a, AbstractC2777a abstractC2777a) {
        c2708e.getClass();
        if (g(c2704a, abstractC2777a)) {
            Cursor cursor = null;
            try {
                if (abstractC2777a.M()) {
                    abstractC2777a.b(null);
                    return true;
                }
                try {
                    Cursor cursorZ = c2704a.f35726f.Z("SELECT changes()", null);
                    if (cursorZ != null) {
                        try {
                            if (cursorZ.getCount() > 0 && cursorZ.moveToFirst()) {
                                int i5 = cursorZ.getInt(0);
                                if (c2704a.f35725e >= 1) {
                                    Log.d("Sqflite", c2704a.b() + "changed " + i5);
                                }
                                abstractC2777a.b(Integer.valueOf(i5));
                                cursorZ.close();
                                return true;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            cursor = cursorZ;
                            j(e, abstractC2777a, c2704a);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorZ;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    Log.e("Sqflite", c2704a.b() + "fail to read changes for Update/Delete");
                    abstractC2777a.b(null);
                    if (cursorZ != null) {
                        cursorZ.close();
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

    public static ArrayList e(Cursor cursor, int i5) {
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            int type = cursor.getType(i10);
            arrayList.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i10) : cursor.getString(i10) : Double.valueOf(cursor.getDouble(i10)) : Long.valueOf(cursor.getLong(i10)));
        }
        return arrayList;
    }

    public static HashMap f(Cursor cursor) {
        HashMap map = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i5 = 0; i5 < length; i5++) {
            int type = cursor.getType(i5);
            if (type == 0) {
                map.put(columnNames[i5], null);
            } else if (type == 1) {
                map.put(columnNames[i5], Long.valueOf(cursor.getLong(i5)));
            } else if (type == 2) {
                map.put(columnNames[i5], Double.valueOf(cursor.getDouble(i5)));
            } else if (type == 3) {
                map.put(columnNames[i5], cursor.getString(i5));
            } else if (type == 4) {
                map.put(columnNames[i5], cursor.getBlob(i5));
            }
        }
        return map;
    }

    public static boolean g(C2704a c2704a, v0 v0Var) {
        C2709f c2709fN = v0Var.N();
        if (c2704a.f35725e >= 1) {
            Log.d("Sqflite", c2704a.b() + c2709fN);
        }
        Boolean boolL = v0Var.L();
        try {
            try {
                c2704a.f35726f.l(c2709fN.f35756a, c2709fN.b());
                if (Boolean.TRUE.equals(boolL)) {
                    c2704a.f35727g = true;
                }
                if (Boolean.FALSE.equals(boolL)) {
                    c2704a.f35727g = false;
                }
                return true;
            } catch (Exception e7) {
                j(e7, v0Var, c2704a);
                if (Boolean.FALSE.equals(boolL)) {
                    c2704a.f35727g = false;
                }
                return false;
            }
        } catch (Throwable th) {
            if (Boolean.FALSE.equals(boolL)) {
                c2704a.f35727g = false;
            }
            throw th;
        }
    }

    public static HashMap h(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            map2.put(n(entry.getKey()), value instanceof Map ? h((Map) value) : n(value));
        }
        return map2;
    }

    public static C2704a i(C4278o c4278o, g gVar) {
        Integer num = (Integer) c4278o.a("id");
        int iIntValue = num.intValue();
        C2704a c2704a = (C2704a) f35753m.get(num);
        if (c2704a != null) {
            return c2704a;
        }
        gVar.b("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    public static void j(Exception exc, v0 v0Var, C2704a c2704a) {
        String message;
        boolean z2 = exc instanceof SQLiteCantOpenDatabaseException;
        String str = c2704a.f35722b;
        HashMap map = null;
        if (z2) {
            v0Var.a(null, "open_failed " + str);
            return;
        }
        if ((exc instanceof SQLiteException) && (message = exc.getMessage()) != null) {
            String lowerCase = message.toLowerCase();
            if (lowerCase.contains("could not open database") || lowerCase.contains("file is not a database")) {
                v0Var.a(null, "open_failed " + str);
                return;
            }
        }
        String message2 = exc.getMessage();
        C2709f c2709fN = v0Var.N();
        if (c2709fN != null) {
            map = new HashMap();
            map.put("sql", c2709fN.f35756a);
            map.put("arguments", c2709fN.f35757b);
        }
        v0Var.a(map, message2);
    }

    public static HashMap k(int i5, boolean z2, boolean z10) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i5));
        if (z2) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z10) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    public static String n(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? h((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b5 : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b5));
        }
        return arrayList.toString();
    }

    public final void l(C4278o c4278o, g gVar) {
        Integer num = (Integer) c4278o.a("id");
        int iIntValue = num.intValue();
        C2704a c2704aI = i(c4278o, gVar);
        if (c2704aI == null) {
            return;
        }
        if (c2704aI.f35725e >= 1) {
            Log.d("Sqflite", c2704aI.b() + "closing " + iIntValue + StringUtils.SPACE + c2704aI.f35722b);
        }
        String str = c2704aI.f35722b;
        synchronized (f35748g) {
            try {
                f35753m.remove(num);
                if (c2704aI.f35721a) {
                    f35744c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f35752l.post(new RunnableC0299w0(this, c2704aI, new h(gVar, 2), 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(uc.C4278o r9, tc.g r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "Look for "
            java.lang.String r1 = "path"
            java.lang.Object r9 = r9.a(r1)
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r9 = g5.C2708e.f35748g
            monitor-enter(r9)
            int r1 = g5.C2708e.f35747f     // Catch: java.lang.Throwable -> L36
            boolean r1 = Ba.c.B(r1)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L3a
            java.lang.String r1 = "Sqflite"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L36
            r2.append(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = " in "
            r2.append(r0)     // Catch: java.lang.Throwable -> L36
            java.util.HashMap r0 = g5.C2708e.f35744c     // Catch: java.lang.Throwable -> L36
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L36
            r2.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L36
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r0 = move-exception
            r10 = r0
            goto Lb4
        L3a:
            java.util.HashMap r0 = g5.C2708e.f35744c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L97
            java.util.HashMap r2 = g5.C2708e.f35753m     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r2.get(r1)     // Catch: java.lang.Throwable -> L36
            g5.a r4 = (g5.C2704a) r4     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L97
            net.zetetic.database.sqlcipher.SQLiteDatabase r5 = r4.f35726f     // Catch: java.lang.Throwable -> L36
            boolean r5 = r5.isOpen()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L97
            int r5 = g5.C2708e.f35747f     // Catch: java.lang.Throwable -> L36
            boolean r5 = Ba.c.B(r5)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L8f
            java.lang.String r5 = "Sqflite"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = r4.b()     // Catch: java.lang.Throwable -> L36
            r6.append(r7)     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = "found single instance "
            r6.append(r7)     // Catch: java.lang.Throwable -> L36
            boolean r7 = r4.f35727g     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L78
            java.lang.String r7 = "(in transaction) "
            goto L7a
        L78:
            java.lang.String r7 = ""
        L7a:
            r6.append(r7)     // Catch: java.lang.Throwable -> L36
            r6.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = " "
            r6.append(r7)     // Catch: java.lang.Throwable -> L36
            r6.append(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L36
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L36
        L8f:
            r2.remove(r1)     // Catch: java.lang.Throwable -> L36
            r0.remove(r3)     // Catch: java.lang.Throwable -> L36
        L95:
            r5 = r4
            goto L99
        L97:
            r4 = 0
            goto L95
        L99:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L36
            Wa.h r6 = new Wa.h
            r9 = 2
            r6.<init>(r10, r9)
            A7.W0 r1 = new A7.W0
            r2 = 15
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            android.os.Handler r9 = g5.C2708e.f35752l
            if (r9 == 0) goto Lb0
            r9.post(r1)
            return
        Lb0:
            r1.run()
            return
        Lb4:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L36
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2708e.m(uc.o, tc.g):void");
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        this.f35754a = c3884a.f44186a;
        System.loadLibrary("sqlcipher");
        C4281r c4281r = new C4281r(c3884a.f44188c, "com.davidmartos96.sqflite_sqlcipher");
        this.f35755b = c4281r;
        c4281r.b(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f35754a = null;
        this.f35755b.b(null);
        this.f35755b = null;
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) throws Throwable {
        int i5;
        C2704a c2704a;
        String str = c4278o.f46759a;
        str.getClass();
        switch (str) {
            case "execute":
                g gVar = (g) interfaceC4280q;
                C2704a c2704aI = i(c4278o, gVar);
                if (c2704aI == null) {
                    return;
                }
                f35752l.post(new RunnableC2705b(this, c2704aI, c4278o, new h(gVar, 2)));
                return;
            case "closeDatabase":
                l(c4278o, (g) interfaceC4280q);
                return;
            case "options":
                Object objA = c4278o.a("queryAsMapList");
                if (objA != null) {
                    f35745d = Boolean.TRUE.equals(objA);
                }
                Object objA2 = c4278o.a("androidThreadPriority");
                if (objA2 != null) {
                    f35746e = ((Integer) objA2).intValue();
                }
                Integer num = (Integer) c4278o.a("logLevel");
                if (num != null) {
                    f35747f = num.intValue();
                }
                ((g) interfaceC4280q).a(null);
                return;
            case "insert":
                g gVar2 = (g) interfaceC4280q;
                C2704a c2704aI2 = i(c4278o, gVar2);
                if (c2704aI2 == null) {
                    return;
                }
                f35752l.post(new RunnableC2705b(this, c4278o, new h(gVar2, 2), c2704aI2, 2));
                return;
            case "update":
                g gVar3 = (g) interfaceC4280q;
                C2704a c2704aI3 = i(c4278o, gVar3);
                if (c2704aI3 == null) {
                    return;
                }
                f35752l.post(new RunnableC2705b(this, c4278o, new h(gVar3, 2), c2704aI3, 4));
                return;
            case "deleteDatabase":
                m(c4278o, (g) interfaceC4280q);
                return;
            case "debugMode":
                boolean zEquals = Boolean.TRUE.equals(c4278o.f46760b);
                if (!zEquals) {
                    f35747f = 0;
                } else if (zEquals) {
                    f35747f = 1;
                }
                ((g) interfaceC4280q).a(null);
                return;
            case "openDatabase":
                String str2 = (String) c4278o.a("path");
                Boolean bool = (Boolean) c4278o.a("readOnly");
                String str3 = (String) c4278o.a("password");
                boolean z2 = str2 == null || str2.equals(":memory:");
                boolean z10 = (Boolean.FALSE.equals(c4278o.a("singleInstance")) || z2) ? false : true;
                if (z10) {
                    synchronized (f35748g) {
                        try {
                            if (Ba.c.B(f35747f)) {
                                Log.d("Sqflite", "Look for " + str2 + " in " + f35744c.keySet());
                            }
                            Integer num2 = (Integer) f35744c.get(str2);
                            if (num2 != null && (c2704a = (C2704a) f35753m.get(num2)) != null) {
                                if (c2704a.f35726f.isOpen()) {
                                    if (Ba.c.B(f35747f)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(c2704a.b());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(c2704a.f35727g ? "(in transaction) " : "");
                                        sb2.append(num2);
                                        sb2.append(StringUtils.SPACE);
                                        sb2.append(str2);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    ((g) interfaceC4280q).a(k(num2.intValue(), true, c2704a.f35727g));
                                    return;
                                }
                                if (Ba.c.B(f35747f)) {
                                    Log.d("Sqflite", c2704a.b() + "single instance database of " + str2 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f35748g;
                synchronized (obj) {
                    i5 = f35751j + 1;
                    f35751j = i5;
                }
                int i10 = f35747f;
                C2704a c2704a2 = new C2704a(str2, str3, i5, i10, z10);
                boolean z11 = z10;
                h hVar = new h((g) interfaceC4280q, 2);
                synchronized (obj) {
                    try {
                        if (f35752l == null) {
                            HandlerThread handlerThread = new HandlerThread("Sqflite", f35746e);
                            k = handlerThread;
                            handlerThread.start();
                            f35752l = new Handler(k.getLooper());
                            if (i10 >= 1) {
                                Log.d("Sqflite", c2704a2.b() + "starting thread" + k + " priority " + f35746e);
                            }
                        }
                        if (i10 >= 1) {
                            Log.d("Sqflite", c2704a2.b() + "opened " + i5 + StringUtils.SPACE + str2);
                        }
                        f35752l.post(new RunnableC2706c(this, z2, str2, hVar, bool, c2704a2, c4278o, z11, i5));
                    } finally {
                    }
                }
                return;
            case "batch":
                g gVar4 = (g) interfaceC4280q;
                C2704a c2704aI4 = i(c4278o, gVar4);
                if (c2704aI4 == null) {
                    return;
                }
                f35752l.post(new RunnableC2705b(this, c4278o, new h(gVar4, 2), c2704aI4, 1));
                return;
            case "debug":
                String str4 = (String) c4278o.a("cmd");
                HashMap map = new HashMap();
                if ("get".equals(str4)) {
                    int i11 = f35747f;
                    if (i11 > 0) {
                        map.put("logLevel", Integer.valueOf(i11));
                    }
                    HashMap map2 = f35753m;
                    if (!map2.isEmpty()) {
                        HashMap map3 = new HashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            C2704a c2704a3 = (C2704a) entry.getValue();
                            HashMap map4 = new HashMap();
                            map4.put("path", c2704a3.f35722b);
                            map4.put("singleInstance", Boolean.valueOf(c2704a3.f35721a));
                            int i12 = c2704a3.f35725e;
                            if (i12 > 0) {
                                map4.put("logLevel", Integer.valueOf(i12));
                            }
                            map3.put(((Integer) entry.getKey()).toString(), map4);
                        }
                        map.put("databases", map3);
                    }
                }
                ((g) interfaceC4280q).a(map);
                return;
            case "query":
                g gVar5 = (g) interfaceC4280q;
                C2704a c2704aI5 = i(c4278o, gVar5);
                if (c2704aI5 == null) {
                    return;
                }
                f35752l.post(new RunnableC2705b(this, c4278o, new h(gVar5, 2), c2704aI5, 0));
                return;
            case "getPlatformVersion":
                ((g) interfaceC4280q).a("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f35750i == null) {
                    f35750i = this.f35754a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                ((g) interfaceC4280q).a(f35750i);
                return;
            default:
                ((g) interfaceC4280q).c();
                return;
        }
    }
}
