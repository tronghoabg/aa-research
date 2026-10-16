package com.google.firebase.crashlytics.a.c;

import android.app.ApplicationExitInfo;
import com.google.firebase.crashlytics.a.e.bd;
import com.google.firebase.crashlytics.a.e.be;
import com.google.firebase.crashlytics.a.e.bh;
import com.google.firebase.crashlytics.a.e.bp;
import com.google.firebase.crashlytics.a.e.cf;
import com.google.firebase.crashlytics.a.e.ck;
import com.google.firebase.crashlytics.a.e.co;
import com.google.firebase.crashlytics.a.e.cr;
import e.a.b.a.ap$$ExternalSyntheticApiModelOutline1;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    private final ag f9151a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.f.a f9152b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.g.b f9153c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.d.f f9154d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.d.t f9155e;

    /* renamed from: f, reason: collision with root package name */
    private final aq f9156f;

    av(ag agVar, com.google.firebase.crashlytics.a.f.a aVar, com.google.firebase.crashlytics.a.g.b bVar, com.google.firebase.crashlytics.a.d.f fVar, com.google.firebase.crashlytics.a.d.t tVar, aq aqVar) {
        this.f9151a = agVar;
        this.f9152b = aVar;
        this.f9153c = bVar;
        this.f9154d = fVar;
        this.f9155e = tVar;
        this.f9156f = aqVar;
    }

    private static List k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            ck ckVar = new ck();
            ckVar.k((String) entry.getKey());
            ckVar.l((String) entry.getValue());
            arrayList.add(ckVar.j());
        }
        Collections.sort(arrayList, new h(2));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private final void l(Throwable th, Thread thread, String str, String str2, long j2, boolean z) {
        co coVarC = this.f9151a.c(th, thread, str2, j2, z);
        com.google.firebase.crashlytics.a.d.f fVar = this.f9154d;
        com.google.firebase.crashlytics.a.d.t tVar = this.f9155e;
        this.f9152b.h(n(m(coVarC, fVar, tVar), tVar), str, str2.equals("crash"));
    }

    private static final co m(co coVar, com.google.firebase.crashlytics.a.d.f fVar, com.google.firebase.crashlytics.a.d.t tVar) {
        cf cfVarC = coVar.c();
        String strA = fVar.a();
        if (strA != null) {
            cr crVar = new cr();
            crVar.f(strA);
            cfVarC.d(crVar.e());
        } else {
            com.google.firebase.crashlytics.a.i.a().g("No log data to include with this event.");
        }
        List listK = k(tVar.g());
        List listK2 = k(tVar.h());
        if (!listK.isEmpty() || !listK2.isEmpty()) {
            bp bpVarB = coVar.b().b();
            bpVarB.e(listK);
            bpVarB.g(listK2);
            cfVarC.b(bpVarB.a());
        }
        return cfVarC.a();
    }

    private static final co n(co coVar, com.google.firebase.crashlytics.a.d.t tVar) {
        List listF = tVar.f();
        if (listF.isEmpty()) {
            return coVar;
        }
        cf cfVarC = coVar.c();
        cr crVar = new cr();
        crVar.d(listF);
        cfVarC.e(crVar.c());
        return cfVarC.a();
    }

    public final SortedSet a() {
        return this.f9152b.d();
    }

    public final void b(String str, List list, be beVar) {
        com.google.firebase.crashlytics.a.i.a().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bh bhVarA = ((au) it.next()).a();
            if (bhVarA != null) {
                arrayList.add(bhVarA);
            }
        }
        com.google.firebase.crashlytics.a.f.a aVar = this.f9152b;
        ck ckVar = new ck();
        ckVar.h(DesugarCollections.unmodifiableList(arrayList));
        aVar.g(str, ckVar.g(), beVar);
    }

    public final void c(long j2, String str) {
        this.f9152b.f(str, j2);
    }

    public final void d(String str, long j2) throws IOException {
        this.f9152b.i(this.f9151a.b(str, j2));
    }

    public final void e(Throwable th, Thread thread, String str, long j2) {
        com.google.firebase.crashlytics.a.i.a().g("Persisting fatal event for session ".concat(str));
        l(th, thread, str, "crash", j2, true);
    }

    public final void f(Throwable th, Thread thread, String str, long j2) {
        com.google.firebase.crashlytics.a.i.a().g("Persisting non-fatal event for session ".concat(str));
        l(th, thread, str, "error", j2, false);
    }

    public final void g(String str, List list, com.google.firebase.crashlytics.a.d.f fVar, com.google.firebase.crashlytics.a.d.t tVar) throws IOException {
        String string;
        ApplicationExitInfo applicationExitInfoM;
        long jB = this.f9152b.b(str);
        Iterator it = list.iterator();
        do {
            string = null;
            if (it.hasNext()) {
                applicationExitInfoM = ap$$ExternalSyntheticApiModelOutline1.m(it.next());
                if (applicationExitInfoM.getTimestamp() < jB) {
                }
            }
            applicationExitInfoM = null;
            break;
        } while (applicationExitInfoM.getReason() != 6);
        if (applicationExitInfoM == null) {
            com.google.firebase.crashlytics.a.i.a().g("No relevant ApplicationExitInfo occurred during session: ".concat(String.valueOf(str)));
            return;
        }
        ag agVar = this.f9151a;
        try {
            InputStream traceInputStream = applicationExitInfoM.getTraceInputStream();
            if (traceInputStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i2 = traceInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                }
                string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        } catch (IOException e2) {
            com.google.firebase.crashlytics.a.i.a().h("Could not get input trace in application exit info: " + applicationExitInfoM.toString() + " Error: " + e2.toString());
        }
        bd bdVar = new bd();
        bdVar.c(applicationExitInfoM.getImportance());
        bdVar.e(applicationExitInfoM.getProcessName());
        bdVar.g(applicationExitInfoM.getReason());
        bdVar.i(applicationExitInfoM.getTimestamp());
        bdVar.d(applicationExitInfoM.getPid());
        bdVar.f(applicationExitInfoM.getPss());
        bdVar.h(applicationExitInfoM.getRss());
        bdVar.j(string);
        co coVarA = agVar.a(bdVar.a());
        com.google.firebase.crashlytics.a.i.a().b("Persisting anr for session ".concat(String.valueOf(str)));
        this.f9152b.h(n(m(coVarA, fVar, tVar), tVar), str, true);
    }

    public final void h() {
        this.f9152b.e();
    }

    public final boolean i() {
        return this.f9152b.j();
    }

    public final com.google.android.gms.o.t j(Executor executor) {
        List<ah> listC = this.f9152b.c();
        ArrayList arrayList = new ArrayList();
        for (ah ahVar : listC) {
            com.google.firebase.crashlytics.a.g.b bVar = this.f9153c;
            if (ahVar.b().j() == null || ahVar.b().i() == null) {
                ap apVarA = this.f9156f.a(true);
                ahVar = new ah(ahVar.b().r(apVarA.b()).q(apVarA.a()), ahVar.d(), ahVar.c());
            }
            arrayList.add(bVar.b(ahVar).b(executor, new com.google.android.gms.f.x(3)));
        }
        return com.google.android.gms.o.ag.d(arrayList);
    }
}
