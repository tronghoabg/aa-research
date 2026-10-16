package jb;

import A7.RunnableC0299w0;
import E4.n;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import qc.C3884a;
import qc.InterfaceC3885b;
import uc.C4278o;
import uc.C4281r;
import uc.C4287x;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* loaded from: classes4.dex */
public class l implements InterfaceC3885b, InterfaceC4279p {

    /* renamed from: h, reason: collision with root package name */
    public static String f38745h;

    /* renamed from: l, reason: collision with root package name */
    public static h f38748l;

    /* renamed from: a, reason: collision with root package name */
    public Context f38749a;

    /* renamed from: b, reason: collision with root package name */
    public C4281r f38750b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f38740c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f38741d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f38742e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f38743f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static int f38744g = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f38746i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f38747j = 1;
    public static int k = 0;

    public static void a(l lVar, e eVar) {
        lVar.getClass();
        try {
            if (eVar.f38708d >= 1) {
                Log.d("Sqflite", eVar.h() + "closing database ");
            }
            eVar.a();
        } catch (Exception e7) {
            Log.e("Sqflite", "error " + e7 + " while closing database " + k);
        }
        synchronized (f38742e) {
            try {
                if (f38741d.isEmpty() && f38748l != null) {
                    if (eVar.f38708d >= 1) {
                        Log.d("Sqflite", eVar.h() + "stopping thread");
                    }
                    f38748l.b();
                    f38748l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e b(C4278o c4278o, tc.g gVar) {
        Integer num = (Integer) c4278o.a("id");
        int iIntValue = num.intValue();
        e eVar = (e) f38741d.get(num);
        if (eVar != null) {
            return eVar;
        }
        gVar.b("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    public static HashMap c(int i5, boolean z2, boolean z10) {
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

    public final void d(C4278o c4278o, tc.g gVar) {
        Integer num = (Integer) c4278o.a("id");
        int iIntValue = num.intValue();
        e eVarB = b(c4278o, gVar);
        if (eVarB == null) {
            return;
        }
        if (eVarB.f38708d >= 1) {
            Log.d("Sqflite", eVarB.h() + "closing " + iIntValue + StringUtils.SPACE + eVarB.f38706b);
        }
        String str = eVarB.f38706b;
        synchronized (f38742e) {
            try {
                f38741d.remove(num);
                if (eVarB.f38705a) {
                    f38740c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f38748l.a(eVarB, new RunnableC0299w0(this, eVarB, gVar, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(uc.C4278o r9, tc.g r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "Look for "
            java.lang.String r1 = "path"
            java.lang.Object r9 = r9.a(r1)
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r9 = jb.l.f38742e
            monitor-enter(r9)
            int r1 = jb.l.f38744g     // Catch: java.lang.Throwable -> L36
            boolean r1 = jb.a.a(r1)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L3a
            java.lang.String r1 = "Sqflite"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L36
            r2.append(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = " in "
            r2.append(r0)     // Catch: java.lang.Throwable -> L36
            java.util.HashMap r0 = jb.l.f38740c     // Catch: java.lang.Throwable -> L36
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L36
            r2.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L36
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r0 = move-exception
            r10 = r0
            goto Lb1
        L3a:
            java.util.HashMap r0 = jb.l.f38740c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L99
            java.util.HashMap r2 = jb.l.f38741d     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r2.get(r1)     // Catch: java.lang.Throwable -> L36
            jb.e r4 = (jb.e) r4     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L99
            android.database.sqlite.SQLiteDatabase r5 = r4.f38713i     // Catch: java.lang.Throwable -> L36
            boolean r5 = r5.isOpen()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            int r5 = jb.l.f38744g     // Catch: java.lang.Throwable -> L36
            boolean r5 = jb.a.a(r5)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L91
            java.lang.String r5 = "Sqflite"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = r4.h()     // Catch: java.lang.Throwable -> L36
            r6.append(r7)     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = "found single instance "
            r6.append(r7)     // Catch: java.lang.Throwable -> L36
            boolean r7 = r4.j()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L7a
            java.lang.String r7 = "(in transaction) "
            goto L7c
        L7a:
            java.lang.String r7 = ""
        L7c:
            r6.append(r7)     // Catch: java.lang.Throwable -> L36
            r6.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = " "
            r6.append(r7)     // Catch: java.lang.Throwable -> L36
            r6.append(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L36
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L36
        L91:
            r2.remove(r1)     // Catch: java.lang.Throwable -> L36
            r0.remove(r3)     // Catch: java.lang.Throwable -> L36
        L97:
            r5 = r4
            goto L9b
        L99:
            r4 = 0
            goto L97
        L9b:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L36
            A7.W0 r1 = new A7.W0
            r2 = 17
            r4 = r8
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            jb.h r9 = jb.l.f38748l
            if (r9 == 0) goto Lad
            r9.a(r5, r1)
            return
        Lad:
            r1.run()
            return
        Lb1:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L36
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.l.e(uc.o, tc.g):void");
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        this.f38749a = c3884a.f44186a;
        C4287x c4287x = C4287x.f46768b;
        InterfaceC4269f interfaceC4269f = c3884a.f44188c;
        C4281r c4281r = new C4281r(interfaceC4269f, "com.tekartik.sqflite", c4287x, interfaceC4269f.b());
        this.f38750b = c4281r;
        c4281r.b(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f38749a = null;
        this.f38750b.b(null);
        this.f38750b = null;
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(final C4278o c4278o, InterfaceC4280q interfaceC4280q) throws Throwable {
        boolean zExists;
        final int i5;
        e eVar;
        String str = c4278o.f46759a;
        str.getClass();
        zExists = false;
        switch (str) {
            case "execute":
                tc.g gVar = (tc.g) interfaceC4280q;
                e eVarB = b(c4278o, gVar);
                if (eVarB == null) {
                    return;
                }
                f38748l.a(eVarB, new j(c4278o, gVar, eVarB, 4));
                return;
            case "closeDatabase":
                d(c4278o, (tc.g) interfaceC4280q);
                return;
            case "options":
                Object objA = c4278o.a("androidThreadPriority");
                if (objA != null) {
                    f38746i = ((Integer) objA).intValue();
                }
                Object objA2 = c4278o.a("androidThreadCount");
                if (objA2 != null && !objA2.equals(Integer.valueOf(f38747j))) {
                    f38747j = ((Integer) objA2).intValue();
                    h hVar = f38748l;
                    if (hVar != null) {
                        hVar.b();
                        f38748l = null;
                    }
                }
                Integer num = (Integer) c4278o.a("logLevel");
                if (num != null) {
                    f38744g = num.intValue();
                }
                ((tc.g) interfaceC4280q).a(null);
                return;
            case "insert":
                tc.g gVar2 = (tc.g) interfaceC4280q;
                e eVarB2 = b(c4278o, gVar2);
                if (eVarB2 == null) {
                    return;
                }
                f38748l.a(eVarB2, new j(c4278o, gVar2, eVarB2, 1));
                return;
            case "update":
                tc.g gVar3 = (tc.g) interfaceC4280q;
                e eVarB3 = b(c4278o, gVar3);
                if (eVarB3 == null) {
                    return;
                }
                f38748l.a(eVarB3, new j(c4278o, gVar3, eVarB3, 5));
                return;
            case "androidSetLocale":
                tc.g gVar4 = (tc.g) interfaceC4280q;
                e eVarB4 = b(c4278o, gVar4);
                if (eVarB4 == null) {
                    return;
                }
                f38748l.a(eVarB4, new j(c4278o, eVarB4, gVar4));
                return;
            case "deleteDatabase":
                e(c4278o, (tc.g) interfaceC4280q);
                return;
            case "debugMode":
                boolean zEquals = Boolean.TRUE.equals(c4278o.f46760b);
                if (!zEquals) {
                    f38744g = 0;
                } else if (zEquals) {
                    f38744g = 1;
                }
                ((tc.g) interfaceC4280q).a(null);
                return;
            case "openDatabase":
                final String str2 = (String) c4278o.a("path");
                final Boolean bool = (Boolean) c4278o.a("readOnly");
                final boolean z2 = str2 == null || str2.equals(":memory:");
                boolean z10 = (Boolean.FALSE.equals(c4278o.a("singleInstance")) || z2) ? false : true;
                if (z10) {
                    synchronized (f38742e) {
                        try {
                            if (a.a(f38744g)) {
                                Log.d("Sqflite", "Look for " + str2 + " in " + f38740c.keySet());
                            }
                            Integer num2 = (Integer) f38740c.get(str2);
                            if (num2 != null && (eVar = (e) f38741d.get(num2)) != null) {
                                if (eVar.f38713i.isOpen()) {
                                    if (a.a(f38744g)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(eVar.h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(eVar.j() ? "(in transaction) " : "");
                                        sb2.append(num2);
                                        sb2.append(StringUtils.SPACE);
                                        sb2.append(str2);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    ((tc.g) interfaceC4280q).a(c(num2.intValue(), true, eVar.j()));
                                    return;
                                }
                                if (a.a(f38744g)) {
                                    Log.d("Sqflite", eVar.h() + "single instance database of " + str2 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f38742e;
                synchronized (obj) {
                    i5 = k + 1;
                    k = i5;
                }
                final e eVar2 = new e(this.f38749a, str2, i5, z10, f38744g);
                synchronized (obj) {
                    try {
                        if (f38748l == null) {
                            int i10 = f38747j;
                            int i11 = f38746i;
                            h nVar = i10 == 1 ? new n(i11, 16) : new L8.a(i10, i11);
                            f38748l = nVar;
                            nVar.start();
                            if (eVar2.f38708d >= 1) {
                                Log.d("Sqflite", eVar2.h() + "starting worker pool with priority " + f38746i);
                            }
                        }
                        eVar2.f38712h = f38748l;
                        if (eVar2.f38708d >= 1) {
                            Log.d("Sqflite", eVar2.h() + "opened " + i5 + StringUtils.SPACE + str2);
                        }
                        final tc.g gVar5 = (tc.g) interfaceC4280q;
                        final boolean z11 = z10;
                        f38748l.a(eVar2, new Runnable() { // from class: jb.k
                            /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x004b, Exception -> 0x00b8, TryCatch #1 {Exception -> 0x00b8, blocks: (B:17:0x004e, B:19:0x0057, B:20:0x0065), top: B:45:0x004e, outer: #2 }] */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: all -> 0x004b, Exception -> 0x00b8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:17:0x004e, B:19:0x0057, B:20:0x0065), top: B:45:0x004e, outer: #2 }] */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    r12 = this;
                                    boolean r0 = r1
                                    java.lang.String r1 = r2
                                    tc.g r2 = r3
                                    java.lang.Boolean r3 = r4
                                    jb.e r4 = r5
                                    uc.o r5 = r6
                                    boolean r6 = r7
                                    int r7 = r8
                                    java.lang.String r8 = "open_failed "
                                    java.lang.Object r9 = jb.l.f38743f
                                    monitor-enter(r9)
                                    r10 = 0
                                    if (r0 != 0) goto L4e
                                    java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4b
                                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
                                    java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r0 = r0.getParent()     // Catch: java.lang.Throwable -> L4b
                                    r11.<init>(r0)     // Catch: java.lang.Throwable -> L4b
                                    boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L4b
                                    if (r0 != 0) goto L4e
                                    boolean r0 = r11.mkdirs()     // Catch: java.lang.Throwable -> L4b
                                    if (r0 != 0) goto L4e
                                    boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L4b
                                    if (r0 != 0) goto L4e
                                    java.lang.String r0 = "sqlite_error"
                                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
                                    r3.<init>(r8)     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r1)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L4b
                                    r2.b(r0, r1, r10)     // Catch: java.lang.Throwable -> L4b
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    return
                                L4b:
                                    r0 = move-exception
                                    goto Lc3
                                L4e:
                                    java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    r3 = 1
                                    if (r0 == 0) goto L65
                                    jb.d r0 = new jb.d     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    r0.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    java.lang.String r8 = r4.f38706b     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r8, r10, r3, r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    r4.f38713i = r0     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    goto L68
                                L65:
                                    r4.k()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                L68:
                                    java.lang.Object r0 = jb.l.f38742e     // Catch: java.lang.Throwable -> L4b
                                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L4b
                                    if (r6 == 0) goto L79
                                    java.util.HashMap r5 = jb.l.f38740c     // Catch: java.lang.Throwable -> L77
                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L77
                                    r5.put(r1, r6)     // Catch: java.lang.Throwable -> L77
                                    goto L79
                                L77:
                                    r1 = move-exception
                                    goto Lb6
                                L79:
                                    java.util.HashMap r5 = jb.l.f38741d     // Catch: java.lang.Throwable -> L77
                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L77
                                    r5.put(r6, r4)     // Catch: java.lang.Throwable -> L77
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                                    int r0 = r4.f38708d     // Catch: java.lang.Throwable -> L4b
                                    if (r0 < r3) goto Lac
                                    java.lang.String r0 = "Sqflite"
                                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
                                    r3.<init>()     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r4 = r4.h()     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r4)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r4 = "opened "
                                    r3.append(r4)     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r7)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r4 = " "
                                    r3.append(r4)     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r1)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L4b
                                    android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L4b
                                Lac:
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    r0 = 0
                                    java.util.HashMap r0 = jb.l.c(r7, r0, r0)
                                    r2.a(r0)
                                    return
                                Lb6:
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                                    throw r1     // Catch: java.lang.Throwable -> L4b
                                Lb8:
                                    r0 = move-exception
                                    kb.b r1 = new kb.b     // Catch: java.lang.Throwable -> L4b
                                    r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L4b
                                    r4.i(r0, r1)     // Catch: java.lang.Throwable -> L4b
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    return
                                Lc3:
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: jb.k.run():void");
                            }
                        });
                    } finally {
                    }
                }
                return;
            case "batch":
                tc.g gVar6 = (tc.g) interfaceC4280q;
                e eVarB5 = b(c4278o, gVar6);
                if (eVarB5 == null) {
                    return;
                }
                f38748l.a(eVarB5, new j(eVarB5, c4278o, gVar6));
                return;
            case "debug":
                String str3 = (String) c4278o.a("cmd");
                HashMap map = new HashMap();
                if ("get".equals(str3)) {
                    int i12 = f38744g;
                    if (i12 > 0) {
                        map.put("logLevel", Integer.valueOf(i12));
                    }
                    HashMap map2 = f38741d;
                    if (!map2.isEmpty()) {
                        HashMap map3 = new HashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            e eVar3 = (e) entry.getValue();
                            HashMap map4 = new HashMap();
                            map4.put("path", eVar3.f38706b);
                            map4.put("singleInstance", Boolean.valueOf(eVar3.f38705a));
                            int i13 = eVar3.f38708d;
                            if (i13 > 0) {
                                map4.put("logLevel", Integer.valueOf(i13));
                            }
                            map3.put(((Integer) entry.getKey()).toString(), map4);
                        }
                        map.put("databases", map3);
                    }
                }
                ((tc.g) interfaceC4280q).a(map);
                return;
            case "query":
                tc.g gVar7 = (tc.g) interfaceC4280q;
                e eVarB6 = b(c4278o, gVar7);
                if (eVarB6 == null) {
                    return;
                }
                f38748l.a(eVarB6, new j(c4278o, gVar7, eVarB6, 2));
                return;
            case "databaseExists":
                try {
                    zExists = new File((String) c4278o.a("path")).exists();
                } catch (Exception unused) {
                }
                ((tc.g) interfaceC4280q).a(Boolean.valueOf(zExists));
                return;
            case "queryCursorNext":
                tc.g gVar8 = (tc.g) interfaceC4280q;
                e eVarB7 = b(c4278o, gVar8);
                if (eVarB7 == null) {
                    return;
                }
                f38748l.a(eVarB7, new j(c4278o, gVar8, eVarB7, 0));
                return;
            case "getPlatformVersion":
                ((tc.g) interfaceC4280q).a("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f38745h == null) {
                    f38745h = this.f38749a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                ((tc.g) interfaceC4280q).a(f38745h);
                return;
            default:
                ((tc.g) interfaceC4280q).c();
                return;
        }
    }
}
