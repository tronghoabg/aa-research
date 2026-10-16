package K3;

import A7.AbstractC0279p0;
import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k3.C3185q;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final String f6520s = J3.r.f("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public final Context f6521a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6522b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6523c;

    /* renamed from: d, reason: collision with root package name */
    public final b7.k f6524d;

    /* renamed from: e, reason: collision with root package name */
    public final S3.p f6525e;

    /* renamed from: f, reason: collision with root package name */
    public J3.q f6526f;

    /* renamed from: g, reason: collision with root package name */
    public final b7.k f6527g;

    /* renamed from: i, reason: collision with root package name */
    public final J3.b f6529i;

    /* renamed from: j, reason: collision with root package name */
    public final f f6530j;
    public final WorkDatabase k;

    /* renamed from: l, reason: collision with root package name */
    public final S3.q f6531l;

    /* renamed from: m, reason: collision with root package name */
    public final S3.c f6532m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6533n;

    /* renamed from: o, reason: collision with root package name */
    public String f6534o;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f6537r;

    /* renamed from: h, reason: collision with root package name */
    public J3.p f6528h = new J3.m();

    /* renamed from: p, reason: collision with root package name */
    public final U3.j f6535p = new U3.j();

    /* renamed from: q, reason: collision with root package name */
    public final U3.j f6536q = new U3.j();

    public s(r rVar) {
        this.f6521a = (Context) rVar.f6511a;
        this.f6527g = (b7.k) rVar.f6513c;
        this.f6530j = (f) rVar.f6512b;
        S3.p pVar = (S3.p) rVar.f6516f;
        this.f6525e = pVar;
        this.f6522b = pVar.f10977a;
        this.f6523c = (List) rVar.f6517g;
        this.f6524d = (b7.k) rVar.f6519i;
        this.f6526f = null;
        this.f6529i = (J3.b) rVar.f6514d;
        WorkDatabase workDatabase = (WorkDatabase) rVar.f6515e;
        this.k = workDatabase;
        this.f6531l = workDatabase.u();
        this.f6532m = workDatabase.p();
        this.f6533n = (ArrayList) rVar.f6518h;
    }

    public final void a(J3.p pVar) {
        boolean z2 = pVar instanceof J3.o;
        S3.p pVar2 = this.f6525e;
        String str = f6520s;
        if (!z2) {
            if (pVar instanceof J3.n) {
                J3.r.d().e(str, "Worker result RETRY for " + this.f6534o);
                c();
                return;
            }
            J3.r.d().e(str, "Worker result FAILURE for " + this.f6534o);
            if (pVar2.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        J3.r.d().e(str, "Worker result SUCCESS for " + this.f6534o);
        if (pVar2.c()) {
            d();
            return;
        }
        S3.c cVar = this.f6532m;
        String str2 = this.f6522b;
        S3.q qVar = this.f6531l;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            qVar.l(3, str2);
            qVar.k(str2, ((J3.o) this.f6528h).f5581a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = cVar.k(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (qVar.e(str3) == 5) {
                    C3185q c3185qD = C3185q.d(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        c3185qD.N(1);
                    } else {
                        c3185qD.x(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f10936b;
                    workDatabase_Impl.b();
                    Cursor cursorL = workDatabase_Impl.l(c3185qD);
                    try {
                        if (cursorL.moveToFirst() && cursorL.getInt(0) != 0) {
                            J3.r.d().e(str, "Setting status to enqueued for " + str3);
                            qVar.l(1, str3);
                            qVar.j(jCurrentTimeMillis, str3);
                        }
                    } finally {
                        cursorL.close();
                        c3185qD.h();
                    }
                }
            }
            workDatabase.n();
            workDatabase.j();
            e(false);
        } catch (Throwable th) {
            workDatabase.j();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean zH = h();
        WorkDatabase workDatabase = this.k;
        String str = this.f6522b;
        if (!zH) {
            workDatabase.c();
            try {
                int iE = this.f6531l.e(str);
                S3.n nVarT = workDatabase.t();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nVarT.f10970a;
                workDatabase_Impl.b();
                S3.h hVar = (S3.h) nVarT.f10972c;
                o3.g gVarA = hVar.a();
                if (str == null) {
                    gVarA.N(1);
                } else {
                    gVarA.x(1, str);
                }
                workDatabase_Impl.c();
                try {
                    gVarA.g();
                    workDatabase_Impl.n();
                    if (iE == 0) {
                        e(false);
                    } else if (iE == 2) {
                        a(this.f6528h);
                    } else if (!AbstractC0279p0.d(iE)) {
                        c();
                    }
                    workDatabase.n();
                    workDatabase.j();
                } finally {
                    workDatabase_Impl.j();
                    hVar.q(gVarA);
                }
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
        List list = this.f6523c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(str);
            }
            i.a(this.f6529i, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f6522b;
        S3.q qVar = this.f6531l;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            qVar.l(1, str);
            qVar.j(System.currentTimeMillis(), str);
            qVar.i(-1L, str);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.f6522b;
        S3.q qVar = this.f6531l;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            qVar.j(System.currentTimeMillis(), str);
            qVar.l(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f10996a;
            workDatabase_Impl.b();
            S3.h hVar = (S3.h) qVar.f11004i;
            o3.g gVarA = hVar.a();
            if (str == null) {
                gVarA.N(1);
            } else {
                gVarA.x(1, str);
            }
            workDatabase_Impl.c();
            try {
                gVarA.g();
                workDatabase_Impl.n();
                workDatabase_Impl.j();
                hVar.q(gVarA);
                workDatabase_Impl.b();
                hVar = (S3.h) qVar.f11000e;
                gVarA = hVar.a();
                if (str == null) {
                    gVarA.N(1);
                } else {
                    gVarA.x(1, str);
                }
                workDatabase_Impl.c();
                try {
                    gVarA.g();
                    workDatabase_Impl.n();
                    workDatabase_Impl.j();
                    hVar.q(gVarA);
                    qVar.i(-1L, str);
                    workDatabase.n();
                } finally {
                }
            } finally {
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.k
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.k     // Catch: java.lang.Throwable -> L42
            S3.q r0 = r0.u()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            k3.q r1 = k3.C3185q.d(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.f10996a     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = r0.l(r1)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L8d
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.h()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.f6521a     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            T3.k.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L94
        L44:
            if (r6 == 0) goto L56
            S3.q r0 = r5.f6531l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f6522b     // Catch: java.lang.Throwable -> L42
            r0.l(r4, r1)     // Catch: java.lang.Throwable -> L42
            S3.q r0 = r5.f6531l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f6522b     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.i(r2, r1)     // Catch: java.lang.Throwable -> L42
        L56:
            S3.p r0 = r5.f6525e     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L79
            J3.q r0 = r5.f6526f     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L79
            K3.f r0 = r5.f6530j     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f6522b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.f6481l     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r0 = r0.f6476f     // Catch: java.lang.Throwable -> L76
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L79
            K3.f r0 = r5.f6530j     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f6522b     // Catch: java.lang.Throwable -> L42
            r0.k(r1)     // Catch: java.lang.Throwable -> L42
            goto L79
        L76:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r6     // Catch: java.lang.Throwable -> L42
        L79:
            androidx.work.impl.WorkDatabase r0 = r5.k     // Catch: java.lang.Throwable -> L42
            r0.n()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.k
            r0.j()
            U3.j r0 = r5.f6535p
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.i(r6)
            return
        L8d:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.h()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L94:
            androidx.work.impl.WorkDatabase r0 = r5.k
            r0.j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.s.e(boolean):void");
    }

    public final void f() {
        S3.q qVar = this.f6531l;
        String str = this.f6522b;
        int iE = qVar.e(str);
        String str2 = f6520s;
        if (iE == 2) {
            J3.r.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        J3.r rVarD = J3.r.d();
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Status for ", str, " is ");
        sbW.append(AbstractC0279p0.B(iE));
        sbW.append(" ; not doing any work");
        rVarD.a(str2, sbW.toString());
        e(false);
    }

    public final void g() {
        String str = this.f6522b;
        WorkDatabase workDatabase = this.k;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                S3.q qVar = this.f6531l;
                if (zIsEmpty) {
                    qVar.k(str, ((J3.m) this.f6528h).f5580a);
                    workDatabase.n();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (qVar.e(str2) != 6) {
                        qVar.l(4, str2);
                    }
                    linkedList.addAll(this.f6532m.k(str2));
                }
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f6537r) {
            return false;
        }
        J3.r.d().a(f6520s, "Work interrupted for " + this.f6534o);
        if (this.f6531l.e(this.f6522b) == 0) {
            e(false);
            return true;
        }
        e(!AbstractC0279p0.d(r0));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0091 A[Catch: all -> 0x007b, TryCatch #4 {all -> 0x007b, blocks: (B:14:0x0051, B:17:0x0059, B:22:0x007e, B:24:0x0084, B:26:0x0088, B:36:0x00bf, B:31:0x0091, B:33:0x009d), top: B:111:0x0051 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.s.run():void");
    }
}
